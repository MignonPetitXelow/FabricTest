package net.xexe.test.registers;

import net.xexe.test.enchantements.Frost;
import net.xexe.test.enchantements.MaledictionShulker;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xexe.test.enchantements.Poison;

public class RegisterEnchantments
{

    public static void register()
    {
        Registry.register(Registry.ENCHANTMENT, new Identifier("test", "frost"), new Frost());
        Registry.register(Registry.ENCHANTMENT, new Identifier("test", "shulker_malediction"), new MaledictionShulker());
        Registry.register(Registry.ENCHANTMENT, new Identifier("test", "poison"), new Poison());
    }
}
