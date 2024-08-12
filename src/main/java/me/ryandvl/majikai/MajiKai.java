package me.ryandvl.majikai;

import me.ryandvl.majikai.item.ItemsController;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MajiKai implements ModInitializer {

    public static final String MOD_ID = "majikai";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private final ItemsController itemsController = new ItemsController();

    @Override
    public void onInitialize() {
        LOGGER.info("Loading Mod...");

        itemsController.register();

        LOGGER.info("Mod loaded");
    }

    public ItemsController getItemsController() {
        return itemsController;
    }

}
