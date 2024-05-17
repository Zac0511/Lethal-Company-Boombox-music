
package net.zac.lethalcompanyboomboxmusics.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class Boomboxmusic5Item extends RecordItem {
	public Boomboxmusic5Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("lethal_company_boombox_musics:boombox_music_5")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 1320);
	}
}
