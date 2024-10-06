
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.zac.lethalcompanyboomboxmusics.init;

import net.zac.lethalcompanyboomboxmusics.LethalCompanyBoomboxMusicsMod;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class LethalCompanyBoomboxMusicsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, LethalCompanyBoomboxMusicsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> BOOMBOX_MUSIC_1 = REGISTRY.register("boombox_music_1",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("lethal_company_boombox_musics", "boombox_music_1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOOMBOX_MUSIC_2 = REGISTRY.register("boombox_music_2",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("lethal_company_boombox_musics", "boombox_music_2")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOOMBOX_MUSIC_3 = REGISTRY.register("boombox_music_3",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("lethal_company_boombox_musics", "boombox_music_3")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOOMBOX_MUSIC_4 = REGISTRY.register("boombox_music_4",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("lethal_company_boombox_musics", "boombox_music_4")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOOMBOX_MUSIC_5 = REGISTRY.register("boombox_music_5",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("lethal_company_boombox_musics", "boombox_music_5")));
}
