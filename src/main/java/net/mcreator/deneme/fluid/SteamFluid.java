
package net.mcreator.deneme.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.deneme.init.DenemeModItems;
import net.mcreator.deneme.init.DenemeModFluids;
import net.mcreator.deneme.init.DenemeModFluidTypes;
import net.mcreator.deneme.init.DenemeModBlocks;

public abstract class SteamFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> DenemeModFluidTypes.STEAM_TYPE.get(),
			() -> DenemeModFluids.STEAM.get(), () -> DenemeModFluids.FLOWING_STEAM.get()).explosionResistance(102f).tickRate(1000)
			.slopeFindDistance(1).bucket(() -> DenemeModItems.STEAM_BUCKET.get()).block(() -> (LiquidBlock) DenemeModBlocks.STEAM.get());

	private SteamFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.LARGE_SMOKE;
	}

	public static class Source extends SteamFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends SteamFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
