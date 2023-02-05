package net.kikoz.mcwdoors.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kikoz.mcwdoors.MacawsDoors;
import net.kikoz.mcwdoors.init.BlockInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class DoorItemGroup {

    public static ItemGroup DOORITEMGROUP;

    public static void registerTabs() {
        DOORITEMGROUP = FabricItemGroup.builder(new Identifier(MacawsDoors.MOD_ID, "inv"))
                .displayName(Text.translatable("itemGroup.mcwdoors"))
                .icon(() -> new ItemStack(BlockInit.OAK_MODERN_DOOR)).build();
    }
}