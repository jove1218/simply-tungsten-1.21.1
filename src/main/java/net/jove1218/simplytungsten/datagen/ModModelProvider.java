package net.jove1218.simplytungsten.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.jove1218.simplytungsten.block.ModBlocks;
import net.jove1218.simplytungsten.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUNGSTEN_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TUNGSTEN_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TUNGSTEN, Models.GENERATED);

        itemModelGenerator.register(ModItems.TUNGSTEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TUNGSTEN_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TUNGSTEN_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TUNGSTEN_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TUNGSTEN_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.TUNGSTEN_BOOTS));
    }
}
