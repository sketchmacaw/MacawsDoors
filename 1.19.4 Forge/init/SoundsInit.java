package com.mcwdoors.kikoz.init;

import com.mcwdoors.kikoz.MacawsDoors;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SoundsInit {

	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
			MacawsDoors.MOD_ID);

	public static final RegistryObject<SoundEvent> GARAGE = register("block.garage");
	public static final RegistryObject<SoundEvent> SHOJI = register("block.shoji");

	private static RegistryObject<SoundEvent> register(final String name) {
		return SOUNDS.register(name,
				() -> SoundEvent.createVariableRangeEvent(new ResourceLocation(MacawsDoors.MOD_ID, name)));
	}

}
