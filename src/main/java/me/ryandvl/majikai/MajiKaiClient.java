package me.ryandvl.majikai;

import me.ryandvl.majikai.client.hud.HudController;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;

public class MajiKaiClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        HudRenderCallback.EVENT.register(new HudController());
    }

}
