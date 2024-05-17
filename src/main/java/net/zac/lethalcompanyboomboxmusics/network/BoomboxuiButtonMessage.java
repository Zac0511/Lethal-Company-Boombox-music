
package net.zac.lethalcompanyboomboxmusics.network;

import net.zac.lethalcompanyboomboxmusics.world.inventory.BoomboxuiMenu;
import net.zac.lethalcompanyboomboxmusics.procedures.PlayMusic5Procedure;
import net.zac.lethalcompanyboomboxmusics.procedures.PlayMusic4Procedure;
import net.zac.lethalcompanyboomboxmusics.procedures.PlayMusic3Procedure;
import net.zac.lethalcompanyboomboxmusics.procedures.PlayMusic2Procedure;
import net.zac.lethalcompanyboomboxmusics.procedures.PlayMusic1Procedure;
import net.zac.lethalcompanyboomboxmusics.LethalCompanyBoomboxMusicsMod;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BoomboxuiButtonMessage {
	private final int buttonID, x, y, z;

	public BoomboxuiButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public BoomboxuiButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(BoomboxuiButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(BoomboxuiButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
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
		LethalCompanyBoomboxMusicsMod.addNetworkMessage(BoomboxuiButtonMessage.class, BoomboxuiButtonMessage::buffer, BoomboxuiButtonMessage::new, BoomboxuiButtonMessage::handler);
	}
}
