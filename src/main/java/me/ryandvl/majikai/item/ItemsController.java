package me.ryandvl.majikai.item;

import me.ryandvl.majikai.MajiKai;
import me.ryandvl.majikai.dto.ItemDTO;
import me.ryandvl.majikai.item.list.test.TestingItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemsController {

    public ItemDTO[] ITEM_LIST = new ItemDTO[]{
            new TestingItem()
    };

    public Item registerItem(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(MajiKai.MOD_ID, name),
                item
        );
    }

    public void register() {
        Map<RegistryKey<ItemGroup>, List<Item>> itemGroups = new HashMap<>();

        for (var itemDTO : ITEM_LIST) {
            var itemGroup = itemDTO.getItemGroup();

            if(itemGroup != null) {
                var item = itemDTO.getItem();

                if(!itemGroups.containsKey(itemGroup)) {
                    itemGroups.put(itemGroup, List.of(item));
                } else {
                    itemGroups.get(itemGroup).add(item);
                }
            }

            registerItem(itemDTO.getId(), itemDTO.getItem());
        }

        for (var itemGroupEntry : itemGroups.entrySet()) {
            var itemGroup = itemGroupEntry.getKey();
            var items = itemGroupEntry.getValue();

            ItemGroupEvents.modifyEntriesEvent(itemGroup).register(entries -> {
                for (var item : items) {
                    entries.add(item);
                }
            });

            MajiKai.LOGGER.info(String.format(
                    "Registered %s items in ItemGroup \"%s\"",
                    items.size(),
                    itemGroup.getRegistry().toString()
            ));
        }

        MajiKai.LOGGER.info("Registering Items");
    }

}
