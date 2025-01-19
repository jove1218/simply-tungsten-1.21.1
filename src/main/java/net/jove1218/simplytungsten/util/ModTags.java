package net.jove1218.simplytungsten.util;

import net.jove1218.simplytungsten.SimplyTungsten;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_TUNGSTEN_TOOL = createTag("needs_tungsten_tool");
        public static final TagKey<Block> INCORRECT_FOR_TUNGSTEN_TOOL = createTag("incorrect_for_tungsten_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(SimplyTungsten.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(SimplyTungsten.MOD_ID, name));
        }
    }
}
