package me.v240.SimpleJoinMessages;

import me.v240.SimpleJoinMessages.join.JoinListener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {

    @Override
    public void onLoad(){
        getLogger().info("SimpleJoinMessages has loaded");
    }

    @Override
    public void onEnable(){
        getLogger().info("SimpleJoinMessages has enabled");
        saveDefaultConfig();
        new JoinListener(this);

    }

    @Override
    public void onDisable(){

    }
}