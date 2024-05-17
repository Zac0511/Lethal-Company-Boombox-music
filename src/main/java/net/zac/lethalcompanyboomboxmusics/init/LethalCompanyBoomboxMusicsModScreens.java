
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.zac.lethalcompanyboomboxmusics.init;

import net.zac.lethalcompanyboomboxmusics.client.gui.BoomboxuiScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class LethalCompanyBoomboxMusicsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(LethalCompanyBoomboxMusicsModMenus.BOOMBOXUI.get(), BoomboxuiScreen::new);
		});
	}
}
