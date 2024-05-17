
package net.zac.lethalcompanyboomboxmusics.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class Boomboxmusic4Item extends RecordItem {
	public Boomboxmusic4Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("lethal_company_boombox_musics:boombox_music_4")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 440);
	}
}
