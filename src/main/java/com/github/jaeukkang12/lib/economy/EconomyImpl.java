package com.github.jaeukkang12.lib.economy;

import org.bukkit.entity.Player;

public interface EconomyImpl {
    double getMoney(Player target);

    void addMoney(Player target, double amount);

    void removeMoney(Player target, double amount);

    void setMoney(Player target, double amount);

    void sendMoney(Player sender, Player sentTo, double amount);
}
