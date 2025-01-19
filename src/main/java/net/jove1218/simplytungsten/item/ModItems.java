package net.jove1218.simplytungsten.item;

import net.jove1218.simplytungsten.SimplyTungsten;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TUNGSTEN_INGOT = registerItem("tungsten_ingot", new Item(new Item.Settings()));
    public static final Item RAW_TUNGSTEN = registerItem("raw_tungsten", new Item(new Item.Settings()));

    public static final Item TUNGSTEN_SWORD = registerItem("tungsten_sword",
            new SwordItem(ModToolMaterials.TUNGSTEN, new Item.Settings().attributeModifiers(SwordItem
                            .createAttributeModifiers(ModToolMaterials.TUNGSTEN, 3, -2.4f))));
    public static final Item TUNGSTEN_PICKAXE = registerItem("tungsten_pickaxe",
            new PickaxeItem(ModToolMaterials.TUNGSTEN, new Item.Settings().attributeModifiers(PickaxeItem
                            .createAttributeModifiers(ModToolMaterials.TUNGSTEN, 1, -2.8f))));
    public static final Item TUNGSTEN_SHOVEL = registerItem("tungsten_shovel",
            new ShovelItem(ModToolMaterials.TUNGSTEN, new Item.Settings().attributeModifiers(ShovelItem
                            .createAttributeModifiers(ModToolMaterials.TUNGSTEN, 1.5f, -3.0f))));
    public static final Item TUNGSTEN_AXE = registerItem("tungsten_axe",
            new AxeItem(ModToolMaterials.TUNGSTEN, new Item.Settings().attributeModifiers(AxeItem
                            .createAttributeModifiers(ModToolMaterials.TUNGSTEN, 6, -3.2f))));
    public static final Item TUNGSTEN_HOE = registerItem("tungsten_hoe",
            new HoeItem(ModToolMaterials.TUNGSTEN, new Item.Settings().attributeModifiers(HoeItem
                            .createAttributeModifiers(ModToolMaterials.TUNGSTEN, 0, -3.0f))));

    public static final Item TUNGSTEN_HELMET = registerItem("tungsten_helmet",
            new ArmorItem(ModArmorMaterials.TUNGSTEN_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
    public static final Item TUNGSTEN_CHESTPLATE = registerItem("tungsten_chestplate",
            new ArmorItem(ModArmorMaterials.TUNGSTEN_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
    public static final Item TUNGSTEN_LEGGINGS = registerItem("tungsten_leggings",
            new ArmorItem(ModArmorMaterials.TUNGSTEN_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item TUNGSTEN_BOOTS = registerItem("tungsten_boots",
            new ArmorItem(ModArmorMaterials.TUNGSTEN_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SimplyTungsten.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SimplyTungsten.LOGGER.info("Registering Mod Items for " + SimplyTungsten.MOD_ID);
    }
}
