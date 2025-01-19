package net.jove1218.simplytungsten.block;

import net.jove1218.simplytungsten.SimplyTungsten;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;

public class ModBlocks {
    public static final Block TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.METAL)
                    .strength(5f, 6f).requiresTool()));
    public static final Block TUNGSTEN_ORE = registerBlock("tungsten_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.create()
                    .strength(3f, 3f).requiresTool()));
    public static final Block DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            new ExperienceDroppingBlock(ConstantIntProvider.create(0), AbstractBlock.Settings.create().sounds(BlockSoundGroup.DEEPSLATE)
                    .strength(4.5f, 3f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(SimplyTungsten.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(SimplyTungsten.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        SimplyTungsten.LOGGER.info("Registering Mod Blocks for " + SimplyTungsten.MOD_ID);
    }
}
