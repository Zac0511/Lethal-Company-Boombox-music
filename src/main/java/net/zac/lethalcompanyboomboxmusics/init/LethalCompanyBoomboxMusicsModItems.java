
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

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

public class LethalCompanyBoomboxMusicsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LethalCompanyBoomboxMusicsMod.MODID);
	public static final DeferredItem<Item> BOOMBOX = REGISTRY.register("boombox", BoomboxItem::new);
	public static final DeferredItem<Item> BOOMBOXMUSIC_1 = REGISTRY.register("boomboxmusic_1", Boomboxmusic1Item::new);
	public static final DeferredItem<Item> BOOMBOXMUSIC_2 = REGISTRY.register("boomboxmusic_2", Boomboxmusic2Item::new);
	public static final DeferredItem<Item> BOOMBOXMUSIC_3 = REGISTRY.register("boomboxmusic_3", Boomboxmusic3Item::new);
	public static final DeferredItem<Item> BOOMBOXMUSIC_4 = REGISTRY.register("boomboxmusic_4", Boomboxmusic4Item::new);
	public static final DeferredItem<Item> BOOMBOXMUSIC_5 = REGISTRY.register("boomboxmusic_5", Boomboxmusic5Item::new);
	// Start of user code block custom items
	// End of user code block custom items
}
