
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.zac.lethalcompanyboomboxmusics.init;

import net.zac.lethalcompanyboomboxmusics.LethalCompanyBoomboxMusicsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class LethalCompanyBoomboxMusicsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LethalCompanyBoomboxMusicsMod.MODID);
	public static final RegistryObject<SoundEvent> BOOMBOX_MUSIC_1 = REGISTRY.register("boombox_music_1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lethal_company_boombox_musics", "boombox_music_1")));
	public static final RegistryObject<SoundEvent> BOOMBOX_MUSIC_2 = REGISTRY.register("boombox_music_2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lethal_company_boombox_musics", "boombox_music_2")));
	public static final RegistryObject<SoundEvent> BOOMBOX_MUSIC_3 = REGISTRY.register("boombox_music_3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lethal_company_boombox_musics", "boombox_music_3")));
	public static final RegistryObject<SoundEvent> BOOMBOX_MUSIC_4 = REGISTRY.register("boombox_music_4", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lethal_company_boombox_musics", "boombox_music_4")));
	public static final RegistryObject<SoundEvent> BOOMBOX_MUSIC_5 = REGISTRY.register("boombox_music_5", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("lethal_company_boombox_musics", "boombox_music_5")));
}
