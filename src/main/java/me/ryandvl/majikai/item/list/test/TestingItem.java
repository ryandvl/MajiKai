package me.ryandvl.majikai.item.list.test;

import me.ryandvl.majikai.dto.ItemDTO;
import net.minecraft.item.ItemGroups;

public class TestingItem extends ItemDTO {

    {
        setId("testing_item");
        createDefaultItem();
        setItemGroup(ItemGroups.INGREDIENTS);
    }



}
