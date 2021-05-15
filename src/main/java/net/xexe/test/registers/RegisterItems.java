package net.xexe.test.registers;

import net.fabricmc.example.ExampleMod;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xexe.test.FabricItem;
import net.xexe.test.FusionArmorMaterial;
import net.xexe.test.FusionToolMaterial;
import net.xexe.test.useless.FusionAxeItem;
import net.xexe.test.useless.FusionPickaxeItem;

public class RegisterItems
{
    public static final ArmorMaterial FUSION_ARMOR_MATERIAL = new FusionArmorMaterial();
    public static final Item FUSION_MATERIAL = new FabricItem(new Item.Settings().group(ExampleMod.OTHER_GROUP));

    public static final Item FUSION_MATERIAL_HELMET = new ArmorItem(FUSION_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings().group(ExampleMod.OTHER_GROUP));
    public static final Item FUSION_MATERIAL_CHESTPLATE = new ArmorItem(FUSION_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings().group(ExampleMod.OTHER_GROUP));
    public static final Item FUSION_MATERIAL_LEGGINGS = new ArmorItem(FUSION_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings().group(ExampleMod.OTHER_GROUP));
    public static final Item FUSION_MATERIAL_BOOTS = new ArmorItem(FUSION_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings().group(ExampleMod.OTHER_GROUP));

    public static ToolItem FUSION_SWORD = new SwordItem(FusionToolMaterial.INSTANCE, 14, 5.0F, new Item.Settings().group(ExampleMod.OTHER_GROUP));
    public static ToolItem FUSION_PICKAXE = new FusionPickaxeItem(FusionToolMaterial.INSTANCE, 4, 0, new Item.Settings().group(ExampleMod.OTHER_GROUP));
    public static ToolItem FUSION_AXE = new FusionAxeItem(FusionToolMaterial.INSTANCE, 15, 0, new Item.Settings().group(ExampleMod.OTHER_GROUP));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier("tutorial", "hot_fusion_ingot"), FUSION_MATERIAL);
        Registry.register(Registry.ITEM, new Identifier("tutorial", "fusion_material_helmet"), FUSION_MATERIAL_HELMET);
        Registry.register(Registry.ITEM, new Identifier("tutorial", "fusion_material_chestplate"), FUSION_MATERIAL_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("tutorial", "fusion_material_leggings"), FUSION_MATERIAL_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("tutorial", "fusion_material_boots"), FUSION_MATERIAL_BOOTS);
        Registry.register(Registry.ITEM, new Identifier("tutorial", "fusion_sword"), FUSION_SWORD);
        Registry.register(Registry.ITEM, new Identifier("tutorial", "fusion_pickaxe"), FUSION_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("tutorial", "fusion_axe"), FUSION_AXE);
    }
}
