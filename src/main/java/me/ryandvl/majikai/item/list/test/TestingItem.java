package me.ryandvl.majikai.item.list.test;

import me.ryandvl.majikai.MajiKai;
import me.ryandvl.majikai.dto.ItemDTO;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class TestingItem extends ItemDTO {

    public TestingItem() {
        super(new Item.Settings());

        setId("testing_item");
        setItemGroup(ItemGroups.INGREDIENTS);
        setShowInDefaultItemGroup(true);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if(world.isClient()) {
            return TypedActionResult.success(user.getStackInHand(hand));
        }

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
