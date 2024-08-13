package me.ryandvl.majikai.client.hud.list;

import me.ryandvl.majikai.dto.HudOverlayDTO;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.util.Colors;

public class ManaHudOverlay extends HudOverlayDTO {

    public void render(DrawContext context, RenderTickCounter tickCounter) {
        var client = MinecraftClient.getInstance();

        if(client == null || client.player == null) return;

        var window = client.getWindow();

        var leftTop = getWindowLeftTopPosition(window);
        context.fill(
                leftTop.x - 5,
                leftTop.y - 5,
                leftTop.x + 5,
                leftTop.y + 5,
                Colors.RED
        );

        var centerTop = getWindowCenterTopPosition(window);
        context.fill(
                centerTop.x - 5,
                centerTop.y - 5,
                centerTop.x + 5,
                centerTop.y + 5,
                Colors.GREEN
        );

        var rightTop = getWindowRightTopPosition(window);
        context.fill(
                rightTop.x - 5,
                rightTop.y - 5,
                rightTop.x + 5,
                rightTop.y + 5,
                Colors.BLUE
        );
    }

}
