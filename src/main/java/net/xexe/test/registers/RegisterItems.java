package net.xexe.test.registers;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xexe.test.others.fusion.FusionArmorMaterial;
import net.xexe.test.others.fusion.FusionToolMaterial;
import net.xexe.test.Main;
import net.xexe.test.useless.FusionAxeItem;
import net.xexe.test.useless.FusionPickaxeItem;

public class RegisterItems
{
    public static final ArmorMaterial FUSION_ARMOR_MATERIAL = new FusionArmorMaterial();

    public static final Item FUSION_MATERIAL = new Item(new Item.Settings().group(Main.OTHER_GROUP));
    public static final Item PALADIUM_RAW = new Item(new Item.Settings().group(Main.OTHER_GROUP));
    public static final Item PALADIUM_INGOT = new Item(new Item.Settings().group(Main.OTHER_GROUP));
    public static final Item DIOPTASE_RAW = new Item(new Item.Settings().group(Main.OTHER_GROUP));
    public static final Item DIOPTASE_INGOT = new Item(new Item.Settings().group(Main.OTHER_GROUP));

    public static final Item FUSION_MATERIAL_HELMET = new ArmorItem(FUSION_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(Main.OTHER_GROUP));
    public static final Item FUSION_MATERIAL_CHESTPLATE = new ArmorItem(FUSION_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(Main.OTHER_GROUP));
    public static final Item FUSION_MATERIAL_LEGGINGS = new ArmorItem(FUSION_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(Main.OTHER_GROUP));
    public static final Item FUSION_MATERIAL_BOOTS = new ArmorItem(FUSION_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(Main.OTHER_GROUP));

    public static ToolItem FUSION_SWORD = new SwordItem(FusionToolMaterial.INSTANCE, 14, 5.0F, new Item.Settings().group(Main.OTHER_GROUP));
    public static ToolItem FUSION_PICKAXE = new FusionPickaxeItem(FusionToolMaterial.INSTANCE, 4, 0, new Item.Settings().group(Main.OTHER_GROUP));
    public static ToolItem FUSION_AXE = new FusionAxeItem(FusionToolMaterial.INSTANCE, 15, 0, new Item.Settings().group(Main.OTHER_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("test", "hot_fusion_ingot"), FUSION_MATERIAL);
        Registry.register(Registry.ITEM, new Identifier("test", "fusion_material_helmet"), FUSION_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("test", "fusion_material_chestplate"), FUSION_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("test", "fusion_material_leggings"), FUSION_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("test", "fusion_material_boots"), FUSION_MATERIAL_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("test", "fusion_sword"), FUSION_SWORD);
        Registry.register(Registry.ITEM, new Identifier("test", "fusion_pickaxe"), FUSION_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("test", "fusion_axe"), FUSION_AXE);
        Registry.register(Registry.ITEM, new Identifier("test", "paladium_raw"), PALADIUM_RAW);
        Registry.register(Registry.ITEM, new Identifier("test", "paladium_ingot"), PALADIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier("test", "dioptase_raw"), DIOPTASE_RAW);
        Registry.register(Registry.ITEM, new Identifier("test", "dioptase_ingot"), DIOPTASE_INGOT);
    }
}