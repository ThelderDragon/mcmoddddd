
package net.mcreator.deneme.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.deneme.world.inventory.BoilerGuiMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class BoilerGuiScreen extends AbstractContainerScreen<BoilerGuiMenu> {
	private final static HashMap<String, Object> guistate = BoilerGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public BoilerGuiScreen(BoilerGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 186;
		this.imageHeight = 178;
	}

	private static final ResourceLocation texture = new ResourceLocation("deneme:textures/screens/boiler_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("deneme:textures/screens/isinmaseyi.png"));
		this.blit(ms, this.leftPos + 101, this.topPos + 40, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("deneme:textures/screens/1.png"));
		this.blit(ms, this.leftPos + 101, this.topPos + 40, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("deneme:textures/screens/water_tank.png"));
		this.blit(ms, this.leftPos + 11, this.topPos + 22, 0, 0, 16, 40, 16, 40);

		RenderSystem.setShaderTexture(0, new ResourceLocation("deneme:textures/screens/water.png"));
		this.blit(ms, this.leftPos + 15, this.topPos + 51, 0, 0, 8, 9, 8, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("deneme:textures/screens/water.png"));
		this.blit(ms, this.leftPos + 15, this.topPos + 42, 0, 0, 8, 9, 8, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("deneme:textures/screens/water.png"));
		this.blit(ms, this.leftPos + 15, this.topPos + 33, 0, 0, 8, 9, 8, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("deneme:textures/screens/water.png"));
		this.blit(ms, this.leftPos + 15, this.topPos + 24, 0, 0, 8, 9, 8, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("deneme:textures/screens/steam_tank.png"));
		this.blit(ms, this.leftPos + 155, this.topPos + 32, 0, 0, 16, 40, 16, 40);

		RenderSystem.setShaderTexture(0, new ResourceLocation("deneme:textures/screens/steam.png"));
		this.blit(ms, this.leftPos + 159, this.topPos + 61, 0, 0, 8, 9, 8, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("deneme:textures/screens/steam.png"));
		this.blit(ms, this.leftPos + 159, this.topPos + 52, 0, 0, 8, 9, 8, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("deneme:textures/screens/steam.png"));
		this.blit(ms, this.leftPos + 159, this.topPos + 43, 0, 0, 8, 9, 8, 9);

		RenderSystem.setShaderTexture(0, new ResourceLocation("deneme:textures/screens/steam.png"));
		this.blit(ms, this.leftPos + 159, this.topPos + 34, 0, 0, 8, 9, 8, 9);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Boiler", 74, 4, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
