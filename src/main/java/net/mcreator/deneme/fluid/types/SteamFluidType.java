
package net.mcreator.deneme.fluid.types;

import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;

import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import java.util.function.Consumer;

public class SteamFluidType extends FluidType {
	public SteamFluidType() {
		super(FluidType.Properties.create().canSwim(false).canDrown(false).pathType(BlockPathTypes.LAVA).adjacentPathType(null).motionScale(-0.007D)
				.density(0).viscosity(250).temperature(374).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
				.sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}

	@Override
	public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
		consumer.accept(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = new ResourceLocation("deneme:blocks/steam_flow"),
					FLOWING_TEXTURE = new ResourceLocation("deneme:blocks/steam_flow");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}

			@Override
			public int getTintColor() {
				return -4138753;
			}

			@Override
			public int getTintColor(FluidState state, BlockAndTintGetter world, BlockPos pos) {
				return Minecraft.getInstance().level.getBiome(pos).value().getFogColor() | 0xFF000000;
			}
		});
	}
}
