
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.zac.lethalcompanyboomboxmusics.init;

import net.zac.lethalcompanyboomboxmusics.world.inventory.BoomboxuiMenu;
import net.zac.lethalcompanyboomboxmusics.LethalCompanyBoomboxMusicsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class LethalCompanyBoomboxMusicsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, LethalCompanyBoomboxMusicsMod.MODID);
	public static final RegistryObject<MenuType<BoomboxuiMenu>> BOOMBOXUI = REGISTRY.register("boomboxui", () -> IForgeMenuType.create(BoomboxuiMenu::new));
}
