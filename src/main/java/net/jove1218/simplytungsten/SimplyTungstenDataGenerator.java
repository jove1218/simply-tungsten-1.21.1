package net.jove1218.simplytungsten;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.jove1218.simplytungsten.datagen.*;

public class SimplyTungstenDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider((ModBlockTagProvider::new));
		pack.addProvider((ModItemTagProvider::new));
		pack.addProvider((ModLootTableGenerator::new));
		pack.addProvider((ModModelProvider::new));
		pack.addProvider((ModRecipeGenerator::new));
	}
}
