package me.v240.SimpleJoinMessages.join;

import me.v240.SimpleJoinMessages.main;
import me.v240.SimpleJoinMessages.utils.utils;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    private static main plugin;

    public JoinListener(main plugin){

        this.plugin = plugin;

        Bukkit.getPluginManager().registerEvents(this, plugin);

    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        if (!p.hasPlayedBefore()){
            e.setJoinMessage(utils.chat(plugin.getConfig().getString("firstJoin_message").replace("<player>", p.getName())));
        } else{
            e.setJoinMessage(utils.chat(plugin.getConfig().getString("join_message").replace("<player>", p.getName())));
        }
    }

}
