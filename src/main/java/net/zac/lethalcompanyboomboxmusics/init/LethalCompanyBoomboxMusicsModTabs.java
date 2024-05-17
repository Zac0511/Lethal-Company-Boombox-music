
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.zac.lethalcompanyboomboxmusics.init;

import net.zac.lethalcompanyboomboxmusics.LethalCompanyBoomboxMusicsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class LethalCompanyBoomboxMusicsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LethalCompanyBoomboxMusicsMod.MODID);
	public static final RegistryObject<CreativeModeTab> BOOMBOXMENU = REGISTRY.register("boomboxmenu",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.lethal_company_boombox_musics.boomboxmenu")).icon(() -> new ItemStack(LethalCompanyBoomboxMusicsModItems.BOOMBOX.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LethalCompanyBoomboxMusicsModItems.BOOMBOX.get());
				tabData.accept(LethalCompanyBoomboxMusicsModItems.BOOMBOXMUSIC_1.get());
				tabData.accept(LethalCompanyBoomboxMusicsModItems.BOOMBOXMUSIC_2.get());
				tabData.accept(LethalCompanyBoomboxMusicsModItems.BOOMBOXMUSIC_3.get());
				tabData.accept(LethalCompanyBoomboxMusicsModItems.BOOMBOXMUSIC_4.get());
				tabData.accept(LethalCompanyBoomboxMusicsModItems.BOOMBOXMUSIC_5.get());
			})

					.build());
}
