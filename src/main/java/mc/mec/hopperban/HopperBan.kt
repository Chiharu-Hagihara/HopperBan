package mc.mec.hopperban

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.plugin.java.JavaPlugin

class HopperBan : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        EventListener(this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        sender.sendMessage("§7|ω・｀)ﾉ ﾔｧ")
        sender.sendMessage("§7私はホッパーを置けなくするプラグインです。")
        return true
    }
}