package me.ryandvl.majikai.dto;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class ItemDTO extends Item {

    private String id;
    private RegistryKey<ItemGroup> itemGroup = null;
    private Boolean showInDefaultItemGroup = false;

    public ItemDTO(Settings settings) {
        super(settings);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RegistryKey<ItemGroup> getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(RegistryKey<ItemGroup> itemGroup) {
        this.itemGroup = itemGroup;
    }

    public Boolean getShowInDefaultItemGroup() {
        return showInDefaultItemGroup;
    }

    public void setShowInDefaultItemGroup(Boolean showInDefaultItemGroup) {
        this.showInDefaultItemGroup = showInDefaultItemGroup;
    }

}
