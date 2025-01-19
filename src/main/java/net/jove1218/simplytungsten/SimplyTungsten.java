package net.jove1218.simplytungsten;

import net.fabricmc.api.ModInitializer;

import net.jove1218.simplytungsten.item.ModItemGroups;
import net.jove1218.simplytungsten.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimplyTungsten implements ModInitializer {
	public static final String MOD_ID = "simplytungsten";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}