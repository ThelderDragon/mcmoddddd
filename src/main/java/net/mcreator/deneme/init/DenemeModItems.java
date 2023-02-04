
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deneme.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.deneme.item.SteamItem;
import net.mcreator.deneme.item.RawTinItem;
import net.mcreator.deneme.item.OresIngotItem;
import net.mcreator.deneme.DenemeMod;

public class DenemeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DenemeMod.MODID);
	public static final RegistryObject<Item> STEAM_BUCKET = REGISTRY.register("steam_bucket", () -> new SteamItem());
	public static final RegistryObject<Item> TIN_INGOT = REGISTRY.register("tin_ingot", () -> new OresIngotItem());
	public static final RegistryObject<Item> TIN_ORE = block(DenemeModBlocks.TIN_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RAW_TIN = REGISTRY.register("raw_tin", () -> new RawTinItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
