package me.ryandvl.majikai.client.hud;

import me.ryandvl.majikai.client.hud.list.ManaHudOverlay;
import me.ryandvl.majikai.dto.HudOverlayDTO;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;

public class HudController implements HudRenderCallback {

    private final HudOverlayDTO[] HUD_OVERLAYS = {
            new ManaHudOverlay()
    };

    @Override
    public void onHudRender(DrawContext drawContext, RenderTickCounter tickCounter) {
        for (var hudOverlay : HUD_OVERLAYS) {
            hudOverlay.render(drawContext, tickCounter);
        }
    }
}
