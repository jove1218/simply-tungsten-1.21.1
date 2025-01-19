package net.jove1218.simplytungsten.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jove1218.simplytungsten.SimplyTungsten;
import net.jove1218.simplytungsten.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TUNGSTEN_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SimplyTungsten.MOD_ID, "simply_tungsten"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.simply_tungsten"))
                    .icon(() -> new ItemStack(ModItems.TUNGSTEN_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_TUNGSTEN);
                        entries.add(ModItems.TUNGSTEN_INGOT);
                        entries.add(ModBlocks.TUNGSTEN_BLOCK);
                        entries.add(ModBlocks.TUNGSTEN_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);

                        entries.add(ModItems.TUNGSTEN_SWORD);
                        entries.add(ModItems.TUNGSTEN_PICKAXE);
                        entries.add(ModItems.TUNGSTEN_SHOVEL);
                        entries.add(ModItems.TUNGSTEN_AXE);
                        entries.add(ModItems.TUNGSTEN_HOE);

                        entries.add(ModItems.TUNGSTEN_HELMET);
                        entries.add(ModItems.TUNGSTEN_CHESTPLATE);
                        entries.add(ModItems.TUNGSTEN_LEGGINGS);
                        entries.add(ModItems.TUNGSTEN_BOOTS);
                    }).build());

    public static void registerItemGroups() {
        SimplyTungsten.LOGGER.info("Registering Item Groups for " + SimplyTungsten.MOD_ID);
    }
}
