package me.ryandvl.majikai;

import me.ryandvl.majikai.item.ItemsController;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MajiKai implements ModInitializer {

    public static final String MOD_ID = "majikai";
    public static final String MOD_NAME = "MajiKai";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);

    public static final RegistryKey<ItemGroup> ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(
            RegistryKeys.ITEM_GROUP,
            Identifier.of(MOD_ID, "default_itemgroup")
    );
    public static final ItemGroup ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(Items.MAGENTA_DYE))
            .displayName(Text.of(MOD_NAME))
            .noScrollbar()
            .build();

    private final ItemsController itemsController = new ItemsController();

    @Override
    public void onInitialize() {
        LOGGER.info("Loading Mod...");

        registerDefaultItemGroup();
        itemsController.register();

        LOGGER.info("Mod loaded, ready for use!");
    }

    public void registerDefaultItemGroup() {
        Registry.register(
                Registries.ITEM_GROUP,
                Identifier.of(MajiKai.MOD_ID, "default_itemgroup"),
                ITEM_GROUP
        );
    }

    public ItemsController getItemsController() {
        return itemsController;
    }

}
