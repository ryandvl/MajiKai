package me.ryandvl.majikai.dto;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.RegistryKey;

public class ItemDTO {

    private String id;
    private Item item;
    private RegistryKey<ItemGroup> itemGroup = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void createDefaultItem() {
        this.item = new Item(new Item.Settings());
    }

    public RegistryKey<ItemGroup> getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(RegistryKey<ItemGroup> itemGroup) {
        this.itemGroup = itemGroup;
    }

}
