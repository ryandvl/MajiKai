package me.ryandvl.majikai.dto;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.util.Window;

public class HudOverlayDTO {

    public final int MARGIN_RADIUS = 25;

    public void render(DrawContext context, RenderTickCounter tickCounter) {}

    public int centerText(String text, int x) {
        return x - (text.length() * 3);
    }

    // region Window Position
    public PositionDTO getWindowLeftTopPosition(Window window) {
        return new PositionDTO(
                MARGIN_RADIUS,
                MARGIN_RADIUS
        );
    }

    public PositionDTO getWindowCenterTopPosition(Window window) {
        return new PositionDTO(
                window.getScaledWidth() / 2,
                MARGIN_RADIUS
        );
    }

    public PositionDTO getWindowRightTopPosition(Window window) {
        return new PositionDTO(
                window.getScaledWidth() - MARGIN_RADIUS,
                MARGIN_RADIUS
        );
    }


    public PositionDTO getWindowLeftCenterPosition(Window window) {
        return new PositionDTO(
                (window.getWidth() / 2) / 2,
                (window.getHeight() / 2) / 2
        );
    }

    public PositionDTO getWindowCenterPosition(Window window) {
        return new PositionDTO(
                window.getScaledWidth() / 2,
                window.getScaledHeight() / 2
        );
    }

    public PositionDTO getWindowRightPosition(Window window) {
        return new PositionDTO(
                (window.getWidth() / 2) / 2,
                (window.getHeight() / 2) / 2
        );
    }

    public PositionDTO getWindowLeftBottomPosition(Window window) {
        return new PositionDTO(
                (window.getWidth() / 2) / 2,
                (window.getHeight() / 2) / 2
        );
    }

    public PositionDTO getWindowCenterBottomPosition(Window window) {
        return new PositionDTO(
                (window.getWidth() / 2) / 2,
                (window.getHeight() / 2) / 2
        );
    }

    public PositionDTO getWindowRightBottomPosition(Window window) {
        return new PositionDTO(
                (window.getWidth() / 2) / 2,
                (window.getHeight() / 2) / 2
        );
    }
    // endregion
}
