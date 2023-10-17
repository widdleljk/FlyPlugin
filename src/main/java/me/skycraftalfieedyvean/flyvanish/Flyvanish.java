package me.skycraftalfieedyvean.flyvanish;

import me.skycraftalfieedyvean.flyvanish.commands.FlyCommand;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class Flyvanish extends JavaPlugin {

    public ArrayList<Player> invisible_list = new ArrayList<>();

    @Override
    public void onEnable() {
        getCommand("fly").setExecutor(new FlyCommand());
    }
}
