package net.kikoz.mcwdoors.util;

		import net.minecraft.client.item.TooltipContext;
		import net.minecraft.item.Item;
		import net.minecraft.item.ItemStack;
		import net.minecraft.text.Text;
		import net.minecraft.world.World;
		import org.jetbrains.annotations.Nullable;

		import java.util.List;

public class ToolTip extends Item {
	public ToolTip(Settings settings) {
		super(settings);
	}

	@Override
	public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
		tooltip.add(Text.translatable("mcwdoors.crafting.desc"));
	}
}