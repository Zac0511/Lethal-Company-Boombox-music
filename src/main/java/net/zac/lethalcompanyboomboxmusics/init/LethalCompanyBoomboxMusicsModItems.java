
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.zac.lethalcompanyboomboxmusics.init;

import net.zac.lethalcompanyboomboxmusics.item.Boomboxmusic5Item;
import net.zac.lethalcompanyboomboxmusics.item.Boomboxmusic4Item;
import net.zac.lethalcompanyboomboxmusics.item.Boomboxmusic3Item;
import net.zac.lethalcompanyboomboxmusics.item.Boomboxmusic2Item;
import net.zac.lethalcompanyboomboxmusics.item.Boomboxmusic1Item;
import net.zac.lethalcompanyboomboxmusics.item.BoomboxItem;
import net.zac.lethalcompanyboomboxmusics.LethalCompanyBoomboxMusicsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class LethalCompanyBoomboxMusicsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, LethalCompanyBoomboxMusicsMod.MODID);
	public static final RegistryObject<Item> BOOMBOX = REGISTRY.register("boombox", () -> new BoomboxItem());
	public static final RegistryObject<Item> BOOMBOXMUSIC_1 = REGISTRY.register("boomboxmusic_1", () -> new Boomboxmusic1Item());
	public static final RegistryObject<Item> BOOMBOXMUSIC_2 = REGISTRY.register("boomboxmusic_2", () -> new Boomboxmusic2Item());
	public static final RegistryObject<Item> BOOMBOXMUSIC_3 = REGISTRY.register("boomboxmusic_3", () -> new Boomboxmusic3Item());
	public static final RegistryObject<Item> BOOMBOXMUSIC_4 = REGISTRY.register("boomboxmusic_4", () -> new Boomboxmusic4Item());
	public static final RegistryObject<Item> BOOMBOXMUSIC_5 = REGISTRY.register("boomboxmusic_5", () -> new Boomboxmusic5Item());
	// Start of user code block custom items
	// End of user code block custom items
}
