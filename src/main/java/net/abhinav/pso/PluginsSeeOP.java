package net.abhinav.pso;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class PluginsSeeOP extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("PluginSeeOP enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("PluginSeeOP disabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("plugins") || label.equalsIgnoreCase("pl")) {
            if (sender.isOp()) {
                return false; // Allows the command to proceed
            } else {
                String noPermissionMessage = getConfig().getString("no-permission-message");
                sender.sendMessage(noPermissionMessage);
                return true; // Blocks the command
            }
        }
        return false;
    }
}
