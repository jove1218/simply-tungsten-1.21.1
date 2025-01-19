package net.jove1218.simplytungsten.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.jove1218.simplytungsten.item.ModItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.TUNGSTEN_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(ModItems.TUNGSTEN_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(ModItems.TUNGSTEN_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES).add(ModItems.TUNGSTEN_AXE);
        getOrCreateTagBuilder(ItemTags.HOES).add(ModItems.TUNGSTEN_HOE);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR).add(ModItems.TUNGSTEN_BOOTS);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR).add(ModItems.TUNGSTEN_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR).add(ModItems.TUNGSTEN_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR).add(ModItems.TUNGSTEN_HELMET);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TUNGSTEN_HELMET)
                .add(ModItems.TUNGSTEN_CHESTPLATE)
                .add(ModItems.TUNGSTEN_LEGGINGS)
                .add(ModItems.TUNGSTEN_BOOTS);
    }
}
