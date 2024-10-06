
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.zac.lethalcompanyboomboxmusics.init;

import net.zac.lethalcompanyboomboxmusics.world.inventory.BoomboxuiMenu;
import net.zac.lethalcompanyboomboxmusics.LethalCompanyBoomboxMusicsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

public class LethalCompanyBoomboxMusicsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, LethalCompanyBoomboxMusicsMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<BoomboxuiMenu>> BOOMBOXUI = REGISTRY.register("boomboxui", () -> IMenuTypeExtension.create(BoomboxuiMenu::new));
}
