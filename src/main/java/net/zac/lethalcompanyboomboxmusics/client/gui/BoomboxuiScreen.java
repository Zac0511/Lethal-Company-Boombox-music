package net.zac.lethalcompanyboomboxmusics.client.gui;

import net.zac.lethalcompanyboomboxmusics.world.inventory.BoomboxuiMenu;
import net.zac.lethalcompanyboomboxmusics.network.BoomboxuiButtonMessage;
import net.zac.lethalcompanyboomboxmusics.LethalCompanyBoomboxMusicsMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class BoomboxuiScreen extends AbstractContainerScreen<BoomboxuiMenu> {
	private final static HashMap<String, Object> guistate = BoomboxuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_music_1;
	Button button_music_2;
	Button button_music_3;
	Button button_music_4;
	Button button_music_5;

	public BoomboxuiScreen(BoomboxuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("lethal_company_boombox_musics:textures/screens/boomboxui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.lethal_company_boombox_musics.boomboxui.label_what_music_do_you_want_to_play"), 5, 12, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_music_1 = Button.builder(Component.translatable("gui.lethal_company_boombox_musics.boomboxui.button_music_1"), e -> {
			if (true) {
				LethalCompanyBoomboxMusicsMod.PACKET_HANDLER.sendToServer(new BoomboxuiButtonMessage(0, x, y, z));
				BoomboxuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 25, 61, 20).build();
		guistate.put("button:button_music_1", button_music_1);
		this.addRenderableWidget(button_music_1);
		button_music_2 = Button.builder(Component.translatable("gui.lethal_company_boombox_musics.boomboxui.button_music_2"), e -> {
			if (true) {
				LethalCompanyBoomboxMusicsMod.PACKET_HANDLER.sendToServer(new BoomboxuiButtonMessage(1, x, y, z));
				BoomboxuiButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 52, 61, 20).build();
		guistate.put("button:button_music_2", button_music_2);
		this.addRenderableWidget(button_music_2);
		button_music_3 = Button.builder(Component.translatable("gui.lethal_company_boombox_musics.boomboxui.button_music_3"), e -> {
			if (true) {
				LethalCompanyBoomboxMusicsMod.PACKET_HANDLER.sendToServer(new BoomboxuiButtonMessage(2, x, y, z));
				BoomboxuiButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 79, 61, 20).build();
		guistate.put("button:button_music_3", button_music_3);
		this.addRenderableWidget(button_music_3);
		button_music_4 = Button.builder(Component.translatable("gui.lethal_company_boombox_musics.boomboxui.button_music_4"), e -> {
			if (true) {
				LethalCompanyBoomboxMusicsMod.PACKET_HANDLER.sendToServer(new BoomboxuiButtonMessage(3, x, y, z));
				BoomboxuiButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 106, 61, 20).build();
		guistate.put("button:button_music_4", button_music_4);
		this.addRenderableWidget(button_music_4);
		button_music_5 = Button.builder(Component.translatable("gui.lethal_company_boombox_musics.boomboxui.button_music_5"), e -> {
			if (true) {
				LethalCompanyBoomboxMusicsMod.PACKET_HANDLER.sendToServer(new BoomboxuiButtonMessage(4, x, y, z));
				BoomboxuiButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 133, 61, 20).build();
		guistate.put("button:button_music_5", button_music_5);
		this.addRenderableWidget(button_music_5);
	}
}
