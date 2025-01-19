package net.jove1218.simplytungsten.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jove1218.simplytungsten.block.ModBlocks;
import net.jove1218.simplytungsten.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> TUNGSTEN_SMELTABLE = List.of(ModItems.RAW_TUNGSTEN, ModBlocks.TUNGSTEN_ORE,
                ModBlocks.DEEPSLATE_TUNGSTEN_ORE);

        offerSmelting(recipeExporter, TUNGSTEN_SMELTABLE, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT,
                0.7f, 200, "tungsten_ingot");
        offerBlasting(recipeExporter, TUNGSTEN_SMELTABLE, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT,
                0.7f, 100, "tungsten_ingot");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TUNGSTEN_INGOT,
                RecipeCategory.DECORATIONS, ModBlocks.TUNGSTEN_BLOCK);
    }
}
