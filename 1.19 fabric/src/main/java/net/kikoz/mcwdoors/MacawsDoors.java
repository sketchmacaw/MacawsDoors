package net.kikoz.mcwdoors;

import net.fabricmc.api.ModInitializer;
import net.kikoz.mcwdoors.init.BlockInit;
import net.kikoz.mcwdoors.init.ItemInit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MacawsDoors implements ModInitializer {

	public static final String MOD_ID = "mcwdoors";
	public static final Logger LOGGER = (Logger) LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		BlockInit.registerModBlocks();
		ItemInit.registerModItems();
	}
}