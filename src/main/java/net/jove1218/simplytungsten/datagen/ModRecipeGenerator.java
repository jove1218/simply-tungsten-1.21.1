package net.jove1218.simplytungsten.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.jove1218.simplytungsten.block.ModBlocks;
import net.jove1218.simplytungsten.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
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


        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_SWORD)
                .pattern(" T ")
                .pattern(" T ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_PICKAXE)
                .pattern("TTT")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_SHOVEL)
                .pattern(" T ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_AXE)
                .pattern("TT ")
                .pattern("TS ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TUNGSTEN_HOE)
                .pattern("TT ")
                .pattern(" S ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_HELMET)
                .pattern("TTT")
                .pattern("T T")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_CHESTPLATE)
                .pattern("T T")
                .pattern("TTT")
                .pattern("TTT")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_LEGGINGS)
                .pattern("TTT")
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.TUNGSTEN_BOOTS)
                .pattern("T T")
                .pattern("T T")
                .input('T', ModItems.TUNGSTEN_INGOT)
                .criterion(hasItem(ModItems.TUNGSTEN_INGOT), conditionsFromItem(ModItems.TUNGSTEN_INGOT))
                .offerTo(recipeExporter);
    }
}
