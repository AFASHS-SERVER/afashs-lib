package com.github.jaeukkang12.lib;

import org.bukkit.plugin.java.JavaPlugin;

public final class Lib extends JavaPlugin {

    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        plugin = this;
    }

    public static JavaPlugin getPlugin() {
        return plugin;
    }
}
