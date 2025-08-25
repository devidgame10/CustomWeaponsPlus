package hu.david.customweapons;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * CustomWeaponsPlus - főosztály (minimal)
 * Javadoc: ez a minimális belépési pont, később ide kerül a teljes logika.
 */
public class CustomWeaponsPlus extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("CustomWeaponsPlus enabled (minimal).");
    }

    @Override
    public void onDisable() {
        getLogger().info("CustomWeaponsPlus disabled.");
    }
}
