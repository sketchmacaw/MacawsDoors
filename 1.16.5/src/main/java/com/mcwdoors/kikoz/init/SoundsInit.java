package com.mcwdoors.kikoz.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import com.mcwdoors.kikoz.MacawsDoors;

import net.minecraftforge.registries.ForgeRegistries;

public class SoundsInit {

	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MacawsDoors.MOD_ID);

    public static final RegistryObject<SoundEvent> GARAGE = register("block.garage");
    public static final RegistryObject<SoundEvent> SHOJI = register("block.shoji");


    private static RegistryObject<SoundEvent> register(String name)
    {
        return SOUNDS.register(name, () -> new SoundEvent(new ResourceLocation(MacawsDoors.MOD_ID, name)));
    }
	
}