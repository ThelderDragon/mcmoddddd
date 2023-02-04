
package net.mcreator.deneme.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.deneme.init.DenemeModFluids;

public class SteamBlock extends LiquidBlock {
	public SteamBlock() {
		super(() -> DenemeModFluids.STEAM.get(), BlockBehaviour.Properties.of(Material.LAVA).strength(102f).noCollission().noLootTable());
	}
}
