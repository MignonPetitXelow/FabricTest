package net.xexe.test.registers;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xexe.test.Main;

public class RegisterBlocks
{
    public static final Block PALADIUM_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(20.0F).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block DIOPTASE_ORE = new Block(FabricBlockSettings.of(Material.METAL).strength(15.0F).breakByTool(FabricToolTags.PICKAXES, 2));
    public static final Block TEST_GRASS = new Block(FabricBlockSettings.of(Material.AGGREGATE).strength(2.0F));

    public static void register()
    {
        Registry.register(Registry.BLOCK, new Identifier("test", "paladium_ore"), PALADIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier("test", "paladium_ore"), new BlockItem(PALADIUM_ORE, new FabricItemSettings().group(Main.OTHER_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("test", "dioptase_ore"), DIOPTASE_ORE);
        Registry.register(Registry.ITEM, new Identifier("test", "dioptase_ore"), new BlockItem(DIOPTASE_ORE, new FabricItemSettings().group(Main.OTHER_GROUP)));

        Registry.register(Registry.BLOCK, new Identifier("test", "test_grass"), TEST_GRASS);
        Registry.register(Registry.ITEM, new Identifier("test", "test_grass"), new BlockItem(TEST_GRASS, new FabricItemSettings().group(Main.OTHER_GROUP)));
    }
}