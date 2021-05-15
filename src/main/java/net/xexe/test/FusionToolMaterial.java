package net.xexe.test;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.xexe.test.registers.RegisterItems;

public class FusionToolMaterial implements ToolMaterial
{

    public static final FusionToolMaterial INSTANCE = new FusionToolMaterial();

    @Override
    public int getDurability() { return 4062; }

    @Override
    public float getMiningSpeedMultiplier() { return 18.0F; }

    @Override
    public float getAttackDamage() { return 0; }

    @Override
    public int getMiningLevel() { return 5; }

    @Override
    public int getEnchantability() { return 25; }

    @Override
    public Ingredient getRepairIngredient() { return Ingredient.ofItems(RegisterItems.FUSION_MATERIAL); }
}
