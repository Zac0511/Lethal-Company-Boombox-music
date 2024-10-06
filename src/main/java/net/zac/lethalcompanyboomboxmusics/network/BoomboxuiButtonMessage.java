
package net.zac.lethalcompanyboomboxmusics.network;

import net.zac.lethalcompanyboomboxmusics.world.inventory.BoomboxuiMenu;
import net.zac.lethalcompanyboomboxmusics.procedures.PlayMusic5Procedure;
import net.zac.lethalcompanyboomboxmusics.procedures.PlayMusic4Procedure;
import net.zac.lethalcompanyboomboxmusics.procedures.PlayMusic3Procedure;
import net.zac.lethalcompanyboomboxmusics.procedures.PlayMusic2Procedure;
import net.zac.lethalcompanyboomboxmusics.procedures.PlayMusic1Procedure;
import net.zac.lethalcompanyboomboxmusics.LethalCompanyBoomboxMusicsMod;

import net.neoforged.neoforge.network.handling.IPayloadContext;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.network.protocol.PacketFlow;
import net.minecraft.network.codec.StreamCodec;
import net.minecraft.network.chat.Component;
import net.minecraft.network.RegistryFriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.HashMap;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public record BoomboxuiButtonMessage(int buttonID, int x, int y, int z) implements CustomPacketPayload {

	public static final Type<BoomboxuiButtonMessage> TYPE = new Type<>(ResourceLocation.fromNamespaceAndPath(LethalCompanyBoomboxMusicsMod.MODID, "boomboxui_buttons"));
	public static final StreamCodec<RegistryFriendlyByteBuf, BoomboxuiButtonMessage> STREAM_CODEC = StreamCodec.of((RegistryFriendlyByteBuf buffer, BoomboxuiButtonMessage message) -> {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}, (RegistryFriendlyByteBuf buffer) -> new BoomboxuiButtonMessage(buffer.readInt(), buffer.readInt(), buffer.readInt(), buffer.readInt()));
	@Override
	public Type<BoomboxuiButtonMessage> type() {
		return TYPE;
	}

	public static void handleData(final BoomboxuiButtonMessage message, final IPayloadContext context) {
		if (context.flow() == PacketFlow.SERVERBOUND) {
			context.enqueueWork(() -> {
				Player entity = context.player();
				int buttonID = message.buttonID;
				int x = message.x;
				int y = message.y;
				int z = message.z;
				handleButtonAction(entity, buttonID, x, y, z);
			}).exceptionally(e -> {
				context.connection().disconnect(Component.literal(e.getMessage()));
				return null;
			});
		}
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level();
		HashMap guistate = BoomboxuiMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			PlayMusic1Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			PlayMusic2Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			PlayMusic3Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			PlayMusic4Procedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			PlayMusic5Procedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		LethalCompanyBoomboxMusicsMod.addNetworkMessage(BoomboxuiButtonMessage.TYPE, BoomboxuiButtonMessage.STREAM_CODEC, BoomboxuiButtonMessage::handleData);
	}
}
