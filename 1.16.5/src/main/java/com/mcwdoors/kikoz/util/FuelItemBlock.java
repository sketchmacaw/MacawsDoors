package com.mcwdoors.kikoz.util;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

	public class FuelItemBlock extends BlockItem {

		public FuelItemBlock(Block block, Properties prop) {
			super(block, prop);
		}

		@Override
		public int getBurnTime (ItemStack itemStack) {
			return 300;
		}
}