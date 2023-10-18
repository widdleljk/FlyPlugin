package me.widdleljk.flycommand;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class FlyCommand extends JavaPlugin {

    public ArrayList<Player> invisible_list = new ArrayList<>();

    @Override
    public void onEnable() {
        getCommand("fly").setExecutor(new FlyCommand());
    }
}
