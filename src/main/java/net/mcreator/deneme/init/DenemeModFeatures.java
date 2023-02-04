
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.deneme.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.deneme.world.features.ores.OresOreFeature;
import net.mcreator.deneme.DenemeMod;

@Mod.EventBusSubscriber
public class DenemeModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DenemeMod.MODID);
	public static final RegistryObject<Feature<?>> TIN_ORE = REGISTRY.register("tin_ore", OresOreFeature::feature);
}
