package mc.mec.hopperban

import org.bukkit.Material
import org.bukkit.event.EventHandler
import java.util.logging.Logger
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockPlaceEvent

class EventListener (private var plg : HopperBan, val log : Logger = plg.logger) : Listener  {
    init {
        plg.server.pluginManager.registerEvents(this,plg);
    }

    @EventHandler
    fun BlockPlaceEvent(e: BlockPlaceEvent) {
        val p = e.player
        if (e.blockPlaced.type == Material.HOPPER) {
            p.sendMessage("§7おっと！ このサーバーではラグ対策のためホッパーは置けないよ！")
            e.isCancelled = true

        }
    }
}