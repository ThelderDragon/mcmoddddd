
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deneme.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.deneme.block.SteamBlock;
import net.mcreator.deneme.block.OresOreBlock;
import net.mcreator.deneme.DenemeMod;

public class DenemeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DenemeMod.MODID);
	public static final RegistryObject<Block> STEAM = REGISTRY.register("steam", () -> new SteamBlock());
	public static final RegistryObject<Block> TIN_ORE = REGISTRY.register("tin_ore", () -> new OresOreBlock());
}
