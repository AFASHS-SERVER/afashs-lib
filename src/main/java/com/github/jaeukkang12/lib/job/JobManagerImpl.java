package com.github.jaeukkang12.lib.job;

import org.bukkit.entity.Player;

public interface JobManagerImpl {
    Enum getJob(Player target);

    int getClass(Player target);

    void setJob(Player target, Enum setTo);

    void setClass(Player target, int setTo);
}
