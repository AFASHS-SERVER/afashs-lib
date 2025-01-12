package com.github.jaeukkang12.lib.economy;

import org.bukkit.entity.Player;

public interface EconomyImpl {
    int getMoney(Player target);

    void addMoney(Player target, int amount);

    void removeMoney(Player target, int amount);

    void setMoney(Player target, int amount);

    void sendMoney(Player sender, Player sentTo, int amount);
}
