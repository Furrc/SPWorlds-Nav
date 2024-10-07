package ru.furrc.spwn.mixin;

import net.minecraft.client.network.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import ru.furrc.spwn.utils.TextUtils;

@Mixin(ClientPlayNetworkHandler.class)
public class ClientPlayNetworkHandlerMixin {
    @ModifyVariable(method = "sendChatMessage", at = @At("HEAD"), argsOnly = true)
    private String replaceContent(String content) {
        return TextUtils.formatPlayerPosition(content);
    }

    @ModifyVariable(method = "sendChatCommand", at = @At("HEAD"), argsOnly = true)
    private String replaceCommand(String command) {
        return TextUtils.formatPlayerPosition(command);
    }
}
