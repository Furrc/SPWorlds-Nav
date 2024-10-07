package ru.furrc.spwn.client;

import io.wispforest.owo.ui.hud.*;
import net.fabricmc.api.*;
import net.minecraft.util.*;
import ru.furrc.spwn.client.ui.NavigationHud;
import ru.furrc.spwn.config.SPWorldsNavConfig;

public class SPWorldsNavClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        SPWorldsNavConfig.load();
        Hud.add(Identifier.of("spwn", "navigation_hud"), NavigationHud::new);
    }
}
