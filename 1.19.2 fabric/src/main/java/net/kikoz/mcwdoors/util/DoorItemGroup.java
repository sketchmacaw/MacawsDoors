package net.kikoz.mcwdoors.util;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.kikoz.mcwdoors.MacawsDoors;
import net.kikoz.mcwdoors.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DoorItemGroup {
    public static final ItemGroup DOORITEMGROUP = FabricItemGroupBuilder.build(new Identifier(MacawsDoors.MOD_ID, "inv"),
            () -> new ItemStack(BlockInit.OAK_MODERN_DOOR));
}