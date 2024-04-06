package net.rexbr.preludejurassika.screen.slots;

import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.rexbr.preludejurassika.network.PreludeButtonMessage;
import net.rexbr.preludejurassika.prelude;
import net.rexbr.preludejurassika.procedurals.GetPlayerProcedure;

public class PreludeScreen extends AbstractContainerScreen<PreludeMenu> {
    private final static HashMap<String, Object> guistate = PreludeMenu.guistate;
    private final Level world;
    private final int x, y, z;
    private final Player entity;
    Button button_curseforge;

    public PreludeScreen(PreludeMenu container, Inventory inventory, Component text) {
        super(container, inventory, text);
        this.world = container.world;
        this.x = container.x;
        this.y = container.y;
        this.z = container.z;
        this.entity = container.entity;
        this.imageWidth = 226;
        this.imageHeight = 166;
    }

    private static final ResourceLocation texture = new ResourceLocation("remrem:textures/screens/prelude.png");

    @Override
    public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(ms);
        super.render(ms, mouseX, mouseY, partialTicks);
        this.renderTooltip(ms, mouseX, mouseY);
        if (GetPlayerProcedure.execute(world, x, y, z) instanceof LivingEntity livingEntity) {
            InventoryScreen.renderEntityInInventory(this.leftPos + 51, this.topPos + 118, 30, 0, 0, livingEntity);
        }
    }

    @Override
    protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
        RenderSystem.setShaderColor(1, 1, 1, 1);
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.setShaderTexture(0, texture);
        this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
        this.font.draw(poseStack, new TextComponent("prelude mod version 3"), 13, 16, -12829636);
        this.font.draw(poseStack, new TextComponent("official mod download"), 103, 142, -12829636);
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
        button_curseforge = new Button(this.leftPos + 13, this.topPos + 133, 77, 20, new TextComponent("button curseforge"), e -> {
            if (true) {
                prelude.PACKET_HANDLER.sendToServer(new PreludeButtonMessage(0, x, y, z));
                PreludeButtonMessage.handleButtonAction(entity, 0, x, y, z);
            }
        });
        guistate.put("button:button_curseforge", button_curseforge);
        this.addRenderableWidget(button_curseforge);
    }
}

