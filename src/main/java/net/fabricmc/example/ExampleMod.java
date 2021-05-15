package net.fabricmc.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xexe.test.FabricItem;
import net.xexe.test.registers.RegisterEnchantments;
import net.xexe.test.registers.RegisterItems;

public class ExampleMod implements ModInitializer {

	/*
	 * Items (temporaire.)
	 */

	public static final FabricItem FABRIC_ITEM = new FabricItem(new FabricItemSettings().maxCount(16)); //TODO: Deplacez les items vers la class RegisterItems.

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("tutorial", "fabric_item"), FABRIC_ITEM);
		RegisterItems.register();
		RegisterEnchantments.register();
	}

	public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
			new Identifier("tutorial", "2"))
			.icon(() -> new ItemStack(FABRIC_ITEM))
			.appendItems(stacks -> {
				stacks.add(new ItemStack(FABRIC_ITEM));
				stacks.add(new ItemStack(RegisterItems.FUSION_MATERIAL));
				stacks.add(new ItemStack(RegisterItems.FUSION_MATERIAL_HELMET));
				stacks.add(new ItemStack(RegisterItems.FUSION_MATERIAL_CHESTPLATE));
				stacks.add(new ItemStack(RegisterItems.FUSION_MATERIAL_LEGGINGS));
				stacks.add(new ItemStack(RegisterItems.FUSION_MATERIAL_BOOTS));
				stacks.add(new ItemStack(RegisterItems.FUSION_PICKAXE));
				stacks.add(new ItemStack(RegisterItems.FUSION_SWORD));
			})
			.build();

}
