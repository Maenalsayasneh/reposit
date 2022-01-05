package com.instabug.chat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.InstabugBackgroundService;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.network.InstabugPushNotificationTokenService;
import com.instabug.chat.settings.AttachmentTypesState;
import com.instabug.chat.synchronization.SynchronizationManager;
import com.instabug.library.Feature;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.invocation.InvocationManager;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.d.a.a.a;
import i0.j.c.h.l;
import i0.j.c.l.b;
import i0.j.c.l.c;
import java.util.Map;
import java.util.Objects;

public class ChatsDelegate {
    @Deprecated
    public static void enableConversationSound(boolean z) {
        if (isReadyToRun()) {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.enableConversationSound", a.O("shouldPlaySounds", Boolean.class).setValue(Boolean.toString(z)));
            a.f(c.a().b, "ibc_conversation_sounds", z);
        }
    }

    public static void enableInAppNotificationSound(boolean z) {
        if (isReadyToRun()) {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.enableInAppNotificationSound", a.O("enable", Boolean.class).setValue(Boolean.toString(z)));
            a.f(c.a().b, "ibc_in_app_notification_sound", z);
        }
    }

    public static void enableNotification(boolean z) {
        if (isReadyToRun()) {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.enableNotification", a.O("enable", Boolean.class).setValue(Boolean.toString(z)));
            a.f(c.a().b, "ibc__notifications_state", z);
        }
    }

    @Deprecated
    public static void enableSystemNotificationSound(boolean z) {
        if (isReadyToRun()) {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.enableSystemNotificationSound", a.O("shouldPlaySound", Boolean.class).setValue(Boolean.toString(z)));
            Replies.setSystemReplyNotificationSoundEnabled(z);
        }
    }

    public static int getUnreadMessagesCount() throws IllegalStateException {
        if (!isReadyToRun()) {
            return 0;
        }
        AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.getUnreadMessagesCount", new Api.Parameter[0]);
        return ChatsCacheManager.getUnreadCount();
    }

    private static boolean isChatFeatureEnabled() {
        return InstabugCore.getFeatureState(Feature.IN_APP_MESSAGING) == Feature.State.ENABLED;
    }

    @Deprecated
    public static boolean isInstabugNotification(Bundle bundle) {
        if (!isReadyToRun()) {
            return false;
        }
        AnalyticsWrapper.getInstance().catchDeprecatedApiUsage("isInstabugNotification", a.N(MessageExtension.FIELD_DATA).setType(bundle.getClass()));
        return Replies.isInstabugNotification(bundle);
    }

    private static boolean isReadyToRun() {
        ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
        if (chatPlugin == null || !chatPlugin.isAppContextAvailable() || !isChatFeatureEnabled()) {
            return false;
        }
        return true;
    }

    @Deprecated
    public static void openNewChat() {
        if (isReadyToRun()) {
            InvocationManager.getInstance().forceInvoke(3);
        }
    }

    public static void setAttachmentTypesEnabled(boolean z, boolean z2, boolean z3) {
        b.a().b = new AttachmentTypesState(z, z2, z3);
    }

    public static void setNewMessageHandler(Runnable runnable) {
        b.a().c = runnable;
    }

    @Deprecated
    public static void setNotificationIcon(int i) {
        if (isReadyToRun()) {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.setNotificationIcon", a.O("notificationIcon", Integer.class));
            Replies.setNotificationIcon(i);
        }
    }

    public static void setOnSdkDismissCallback(OnSdkDismissCallback onSdkDismissCallback) {
        AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.setOnSdkDismissCallback", a.O("onSdkDismissedCallback", OnSdkDismissCallback.class));
        b.a().f = onSdkDismissCallback;
    }

    public static void setPushNotificationChannelId(String str) throws IllegalStateException {
        AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.setPushNotificationChannelId", a.O("pushNotificationChannelId", String.class));
        Replies.setPushNotificationChannelId(str);
    }

    public static void setPushNotificationRegistrationToken(String str) {
        Context appContext;
        if (isReadyToRun()) {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.setPushNotificationRegistrationToken", a.O("token", String.class));
            if (str != null && !str.isEmpty() && !str.equalsIgnoreCase(InstabugCore.getPushNotificationToken()) && InstabugCore.getFeatureState(Feature.PUSH_NOTIFICATION) == Feature.State.ENABLED) {
                InstabugCore.setPushNotificationToken(str);
                InstabugCore.setPushNotificationTokenSent(false);
                ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
                if (chatPlugin != null && (appContext = chatPlugin.getAppContext()) != null) {
                    Intent intent = new Intent(appContext, InstabugPushNotificationTokenService.class);
                    int i = InstabugPushNotificationTokenService.c;
                    InstabugBackgroundService.enqueueInstabugWork(appContext, InstabugPushNotificationTokenService.class, 2585, intent);
                }
            }
        }
    }

    public static void showChats() {
        ChatPlugin chatPlugin;
        Context appContext;
        if (isReadyToRun() && (chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class)) != null && (appContext = chatPlugin.getAppContext()) != null) {
            appContext.startActivity(i0.j.c.l.a.e(appContext));
        }
    }

    public static void showNotification(Bundle bundle) {
        if (isReadyToRun()) {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.showNotification", a.N(MessageExtension.FIELD_DATA).setType(bundle.getClass()));
            l a = l.a();
            Objects.requireNonNull(a);
            if (InstabugCore.getFeatureState(Feature.PUSH_NOTIFICATION) == Feature.State.ENABLED && a.h(bundle) && SynchronizationManager.getInstance() != null) {
                SynchronizationManager.getInstance().sync();
            }
        }
    }

    public static void skipImageAttachmentAnnotation(boolean z) {
        if (isReadyToRun()) {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.skipImageAttachmentAnnotation", a.O("skipImageAnnotation", Boolean.class).setValue(Boolean.toString(z)));
            b.a().d = z;
        }
    }

    @Deprecated
    public static boolean isInstabugNotification(Map<String, String> map) {
        if (!isReadyToRun()) {
            return false;
        }
        AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.isInstabugNotification", a.N(MessageExtension.FIELD_DATA).setType(map.getClass()));
        return Replies.isInstabugNotification(map);
    }

    public static void showNotification(Map<String, String> map) {
        if (isReadyToRun()) {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Chats.showNotification", a.N(MessageExtension.FIELD_DATA).setType(map.getClass()));
            l a = l.a();
            Objects.requireNonNull(a);
            if (InstabugCore.getFeatureState(Feature.PUSH_NOTIFICATION) == Feature.State.ENABLED && a.i(map) && SynchronizationManager.getInstance() != null) {
                SynchronizationManager.getInstance().sync();
            }
        }
    }
}
