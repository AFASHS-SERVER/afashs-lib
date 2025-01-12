package com.github.jaeukkang12.lib.util;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class InventoryUtil {
    public static boolean hasEnoughSpace(Inventory inventory, ItemStack itemStack) {
        int amount = 0;
        for (ItemStack i : inventory.getContents()) {
            if (i != null && i.isSimilar(itemStack)) {
                amount += i.getAmount();
            }
        }
        return amount > itemStack.getAmount();
    }

    public static Integer getSpace(Inventory inventory) {
        return inventory.getSize() - Arrays.stream(inventory.getContents()).filter(Objects::nonNull).collect(Collectors.toList()).size();
    }
}
