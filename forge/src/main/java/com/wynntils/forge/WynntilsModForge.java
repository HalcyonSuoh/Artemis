/*
 * Copyright © Wynntils 2021.
 * This file is released under AGPLv3. See LICENSE for full license details.
 */
package com.wynntils.forge;

import com.wynntils.core.WynntilsMod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;

@Mod(WynntilsMod.MOD_ID)
public class WynntilsModForge {
    public WynntilsModForge() {
        // if (Thread.currentThread().getThreadGroup() == SidedThreadGroups.SERVER) return;
        // Stops it from running on integrated server for single player, probably unnecessary for
        // most cases
        WynntilsMod.init(getModVersion());
    }

    public static String getModVersion() {
        return ModLoadingContext.get().getActiveContainer().getModInfo().getVersion().toString();
    }
}
