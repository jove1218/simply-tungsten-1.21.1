package net.jove1218.simplytungsten.item;

import net.jove1218.simplytungsten.SimplyTungsten;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new Item.Settings()));
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SimplyTungsten.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SimplyTungsten.LOGGER.info("Registering Mod Items for " + SimplyTungsten.MOD_ID);
    }
}
