package ru.furrc.spwn.utils;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.world.World;

public class TextUtils {
    public static String formatPlayerPosition(String input) {
        ClientPlayerEntity player = MinecraftClient.getInstance().player;

        if (player != null && input.contains(":pos:")) {
            long x = Math.round(player.getX()) ;
            long y = Math.round(player.getY());
            long z = Math.round(player.getZ());

            if (player.clientWorld.getRegistryKey() == World.NETHER) {
                x *= 8;
                z *= 8;
            }

            input = input.replaceAll(":pos:", String.format(":pos:%s:%s:%s:", x, y, z));
        }

        return input;
    }
}
