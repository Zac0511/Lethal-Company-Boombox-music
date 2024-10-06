
package net.zac.lethalcompanyboomboxmusics.item;

import net.zac.lethalcompanyboomboxmusics.LethalCompanyBoomboxMusicsMod;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class Boomboxmusic4Item extends Item {
	public Boomboxmusic4Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(LethalCompanyBoomboxMusicsMod.MODID, "boomboxmusic_4"))));
	}
}
