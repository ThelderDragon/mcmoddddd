
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deneme.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.deneme.fluid.types.SteamFluidType;
import net.mcreator.deneme.DenemeMod;

public class DenemeModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, DenemeMod.MODID);
	public static final RegistryObject<FluidType> STEAM_TYPE = REGISTRY.register("steam", () -> new SteamFluidType());
}
