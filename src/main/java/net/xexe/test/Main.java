package net.xexe.test;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.biome.v1.OverworldBiomes;
import net.fabricmc.fabric.api.biome.v1.OverworldClimate;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.*;
import net.xexe.test.generators.biome.overworld.testbiome;
import net.xexe.test.registers.RegisterBlocks;
import net.xexe.test.registers.RegisterEnchantments;
import net.xexe.test.registers.RegisterItems;

public class Main implements ModInitializer
{

    private static ConfiguredFeature<?, ?> ORE_PALADIUM_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, RegisterBlocks.PALADIUM_ORE.getDefaultState(), 4)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(20);
    private static ConfiguredFeature<?, ?> ORE_DIOPTASE_OVERWORLD = Feature.ORE.configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, RegisterBlocks.DIOPTASE_ORE.getDefaultState(), 4)).decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(0, 0, 64))).spreadHorizontally().repeat(20);
    public static final RegistryKey<Biome> TEST_KEY = RegistryKey.of(Registry.BIOME_KEY, new Identifier("test", "test"));

    @Override
    public void onInitialize()
    {
        RegisterItems.register();
        RegisterEnchantments.register();
        RegisterBlocks.register();

        RegistryKey<ConfiguredFeature<?, ?>> orepaladiumOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("test", "ore_paladium_overworld"));
        RegistryKey<ConfiguredFeature<?, ?>> oredioptaseEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("test", "ore_dioptase_overworld"));


        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, orepaladiumOverworld.getValue(), ORE_PALADIUM_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, orepaladiumOverworld);

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, oredioptaseEnd.getValue(), ORE_DIOPTASE_OVERWORLD);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(TEST_KEY), GenerationStep.Feature.UNDERGROUND_ORES, oredioptaseEnd);

        Registry.register(BuiltinRegistries.CONFIGURED_SURFACE_BUILDER, new Identifier("test", "test"), testbiome.TEST_SURFACE_BUILDER);
        Registry.register(BuiltinRegistries.BIOME, TEST_KEY.getValue(), testbiome.test);
        OverworldBiomes.addContinentalBiome(TEST_KEY, OverworldClimate.TEMPERATE, 2D);
        OverworldBiomes.addContinentalBiome(TEST_KEY, OverworldClimate.COOL, 2D);
    }

    public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
            new Identifier("Test", "all"))
            .icon(() -> new ItemStack(RegisterItems.FUSION_SWORD))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(RegisterItems.FUSION_MATERIAL));
                stacks.add(new ItemStack(RegisterItems.FUSION_MATERIAL_HELMET));
                stacks.add(new ItemStack(RegisterItems.FUSION_MATERIAL_CHESTPLATE));
                stacks.add(new ItemStack(RegisterItems.FUSION_MATERIAL_LEGGINGS));
                stacks.add(new ItemStack(RegisterItems.FUSION_MATERIAL_BOOTS));
                stacks.add(new ItemStack(RegisterItems.FUSION_PICKAXE));
                stacks.add(new ItemStack(RegisterItems.FUSION_SWORD));
                stacks.add(new ItemStack(RegisterItems.FUSION_AXE));
                stacks.add(new ItemStack(RegisterBlocks.PALADIUM_ORE));
                stacks.add(new ItemStack(RegisterItems.PALADIUM_RAW));
                stacks.add(new ItemStack(RegisterItems.PALADIUM_INGOT));
                stacks.add(new ItemStack(RegisterBlocks.DIOPTASE_ORE));
                stacks.add(new ItemStack(RegisterItems.DIOPTASE_RAW));
                stacks.add(new ItemStack(RegisterItems.DIOPTASE_INGOT));
            })
            .build();
    
}
//TODO Minerai dans le nether
