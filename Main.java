package ru.latche.antibot;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;


import java.util.ArrayList;

public final class Main
        extends JavaPlugin
         implements Listener {

    private ArrayList<String> list;

    @Override
    public void onEnable() {
        getLogger().info("§4AntiBot Enabled!");
        getLogger().info("§9vk.com/latche");
        Bukkit.getPluginManager().registerEvents(this, this);
        this.list = new ArrayList<String>();

    }

        public void Json1(Player player) {
            player.spigot().sendMessage(new ComponentBuilder("")
                    .event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/ocHW1KPNJjJXWrrckdOImqwPTEQHeJap"))
                    .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("")))
                    .create());
        }

        public void Json(Player player) {
            player.spigot().sendMessage(new ComponentBuilder("§e§lHowe§F§LMine§8: §fПроверка на бота §7(Нажми)")
                    .event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/ocHW1KPNJjJXWrrckdOImqwPTEQHeJap"))
                    .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("§7Нажмите на сюда, чтобы пройти проверку")))
                    .create());
        }

        public void Json2(Player player) {
            player.spigot().sendMessage(new ComponentBuilder("")
                    .event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/ocHW1KPNJjJXWrrckdOImqwPTEQHeJap"))
                    .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("")))
                    .create());
        }

        public void Json3(Player player) {
            player.spigot().sendMessage(new ComponentBuilder("")
                    .event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/ocHW1KPNJjJXWrrckdOImqwPTEQHeJap"))
                    .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("")))
                    .create());
        }

        public void Json4(Player player) {
            player.spigot().sendMessage(new ComponentBuilder("")
                    .event(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/ocHW1KPNJjJXWrrckdOImqwPTEQHeJap"))
                    .event(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText("")))
                    .create());
        }

        @EventHandler (priority = EventPriority.MONITOR)
        public void onJoin(PlayerJoinEvent event) {
            this.list.add(event.getPlayer().getName());
            Json1(event.getPlayer());
            Json3(event.getPlayer());
            Json(event.getPlayer());
            Json2(event.getPlayer());
            Json4(event.getPlayer());
        }

        @EventHandler
        public void onMove(PlayerMoveEvent event) {
                if (this.list.contains(event.getPlayer().getName())) {
                    event.setCancelled(true);
                }
            }
        @EventHandler
        public void onCmd(PlayerCommandPreprocessEvent event) {
        if(this.list.contains(event.getPlayer().getName())) {
            if(event.getMessage() != null && event.getMessage().equalsIgnoreCase("/ocHW1KPNJjJXWrrckdOImqwPTEQHeJap")) {
                this.list.remove(event.getPlayer().getName());
                event.setCancelled(true);
                event.getPlayer().sendMessage("§e§lHowe§F§LMine§8: §fПроверка на бота §a(ПРОЙДЕНА)");
                return;
            } else {
                event.setCancelled(true);
            }
        }
        }

    @Override
    public void onDisable() {
        getLogger().info("§4AntiBot Disabled!");
        getLogger().info("§9vk.com/latche");
    }
}
