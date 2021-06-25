package net.xexe.test.others.fusion;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.xexe.test.registers.RegisterItems;

public class FusionArmorMaterial implements ArmorMaterial
{
    private static final int[] BASE_DURABILITY = new int[] {13, 18, 15, 13};
    private static final int[] PROTECTION_VALUES = new int[] {8, 10, 14, 8};

    @Override
    public int getDurability(EquipmentSlot slot) { return BASE_DURABILITY[slot.getEntitySlotId()] * 69 /* :) */; }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) { return PROTECTION_VALUES[slot.getEntitySlotId()]; }

    @Override
    public int getEnchantability() { return 15; }

    @Override
    public SoundEvent getEquipSound() { return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE; }

    @Override
    public Ingredient getRepairIngredient() { return Ingredient.ofItems(RegisterItems.FUSION_MATERIAL); }

    @Override
    public String getName() { return "fusion"; }

    @Override
    public float getToughness() { return 8 ; }

    @Override
    public float getKnockbackResistance() { return 10; }
}
