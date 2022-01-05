package com.instabug.chat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.library.Feature;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.analytics.model.Api;
import com.instabug.library.apichecker.APIChecker;
import com.instabug.library.apichecker.ReturnableRunnable;
import com.instabug.library.apichecker.VoidRunnable;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.util.InstabugSDKLogger;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Map;

public final class Replies {
    private static final String TAG = "Replies";

    public static class a implements VoidRunnable {
        public final /* synthetic */ boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.setInAppNotificationSound", i0.d.a.a.a.N("shouldPlaySound").setType(Boolean.TYPE).setValue(Boolean.valueOf(this.a)));
            boolean z = this.a;
            if (i0.j.c.c.d()) {
                ChatsDelegate.enableInAppNotificationSound(z);
            }
        }
    }

    public static class b implements VoidRunnable {
        public final /* synthetic */ boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.setShouldPlayConversationSounds", i0.d.a.a.a.N("shouldPlaySounds").setType(Boolean.TYPE).setValue(Boolean.valueOf(this.a)));
            boolean z = this.a;
            if (i0.j.c.c.d()) {
                i0.d.a.a.a.f(i0.j.c.l.c.a().b, "ibc_conversation_sounds", z);
            }
        }
    }

    public static class c implements VoidRunnable {
        public final /* synthetic */ Feature.State a;

        public c(Feature.State state) {
            this.a = state;
        }

        public void run() {
            if (this.a == null) {
                InstabugSDKLogger.w(Replies.TAG, "state object passed to Replies.setState() is null");
                return;
            }
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.setState", i0.d.a.a.a.O("state", Feature.State.class));
            Feature.State state = this.a;
            InstabugCore.setRepliesState(state);
            InstabugCore.setPushNotificationState(state);
            InvocationManager.getInstance().notifyInvocationOptionChanged();
        }
    }

    public static class d implements VoidRunnable {
        public final /* synthetic */ int a;

        public d(int i) {
            this.a = i;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.setNotificationIcon", i0.d.a.a.a.N("notificationIcon").setType(Integer.TYPE));
            int i = this.a;
            if (i0.j.c.c.d()) {
                i0.j.c.l.c.a().b.edit().putInt("ibc_push_notification_icon", i).apply();
            }
        }
    }

    public static class e implements ReturnableRunnable<Boolean> {
        public final /* synthetic */ Bundle a;

        public e(Bundle bundle) {
            this.a = bundle;
        }

        public Object run() throws Exception {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.isInstabugNotification", i0.d.a.a.a.O(MessageExtension.FIELD_DATA, Bundle.class));
            return Boolean.valueOf(i0.j.c.h.l.a().h(this.a));
        }
    }

    public static class f implements ReturnableRunnable<Boolean> {
        public final /* synthetic */ Map a;

        public f(Map map) {
            this.a = map;
        }

        public Object run() throws Exception {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.isInstabugNotification", i0.d.a.a.a.N(MessageExtension.FIELD_DATA).setType(this.a.getClass()));
            return Boolean.valueOf(i0.j.c.h.l.a().i(this.a));
        }
    }

    public static class g implements VoidRunnable {
        public final /* synthetic */ boolean a;

        public g(boolean z) {
            this.a = z;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.setSystemReplyNotificationSoundEnabled", i0.d.a.a.a.O("shouldPlaySound", Boolean.class).setValue(Boolean.toString(this.a)));
            boolean z = this.a;
            if (i0.j.c.c.d()) {
                i0.d.a.a.a.f(i0.j.c.l.c.a().b, "ibc_notification_sound", z);
            }
        }
    }

    public static class h implements VoidRunnable {
        public final /* synthetic */ String a;

        public h(String str) {
            this.a = str;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.setPushNotificationChannelId", new Api.Parameter[0]);
            String str = this.a;
            if (i0.j.c.c.d()) {
                i0.j.c.l.b.a().e = str;
            }
        }
    }

    public static class i implements VoidRunnable {
        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.show", new Api.Parameter[0]);
            if (i0.j.c.c.d() && ChatsCacheManager.getValidChats().size() > 0) {
                ChatsDelegate.showChats();
            }
        }
    }

    public static class j implements ReturnableRunnable<Boolean> {
        public Object run() throws Exception {
            boolean z = false;
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.hasChats", new Api.Parameter[0]);
            if (ChatsCacheManager.getValidChats().size() > 0) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static class k implements VoidRunnable {
        public final /* synthetic */ Runnable a;

        public k(Runnable runnable) {
            this.a = runnable;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.setOnNewReplyReceivedCallback", new Api.Parameter[0]);
            Runnable runnable = this.a;
            if (i0.j.c.c.d()) {
                ChatsDelegate.setNewMessageHandler(runnable);
            }
        }
    }

    public static class l implements VoidRunnable {
        public final /* synthetic */ boolean a;

        public l(boolean z) {
            this.a = z;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.setInAppNotificationEnabled", i0.d.a.a.a.N("enabled").setType(Boolean.TYPE).setValue(Boolean.valueOf(this.a)));
            boolean z = this.a;
            if (i0.j.c.c.d()) {
                ChatsDelegate.enableNotification(z);
            }
        }
    }

    public static class m implements ReturnableRunnable<Integer> {
        public Object run() throws Exception {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.getUnreadRepliesCount", new Api.Parameter[0]);
            return Integer.valueOf(ChatsDelegate.getUnreadMessagesCount());
        }
    }

    public static class n implements VoidRunnable {
        public final /* synthetic */ Feature.State a;

        public n(Feature.State state) {
            this.a = state;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.setPushNotificationState", i0.d.a.a.a.O("state", Feature.State.class).setValue(this.a));
            InstabugCore.setPushNotificationState(this.a);
        }
    }

    public static class o implements VoidRunnable {
        public final /* synthetic */ String a;

        public o(String str) {
            this.a = str;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.setPushNotificationRegistrationToken", i0.d.a.a.a.O("token", String.class));
            String str = this.a;
            if (i0.j.c.c.d()) {
                ChatsDelegate.setPushNotificationRegistrationToken(str);
            }
        }
    }

    public static class p implements VoidRunnable {
        public final /* synthetic */ Bundle a;

        public p(Bundle bundle) {
            this.a = bundle;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.showNotification", i0.d.a.a.a.O(MessageExtension.FIELD_DATA, Bundle.class));
            Bundle bundle = this.a;
            if (i0.j.c.c.d()) {
                ChatsDelegate.showNotification(bundle);
            }
        }
    }

    public static class q implements VoidRunnable {
        public final /* synthetic */ Map a;

        public q(Map map) {
            this.a = map;
        }

        public void run() {
            AnalyticsWrapper.getInstance().catchApiUsageAsync("Replies.showNotification", i0.d.a.a.a.O(MessageExtension.FIELD_DATA, Map.class));
            Map map = this.a;
            if (i0.j.c.c.d()) {
                ChatsDelegate.showNotification((Map<String, String>) map);
            }
        }
    }

    public static int getUnreadRepliesCount() {
        Integer num = (Integer) APIChecker.checkAndGet("Replies.getUnreadRepliesCount", new m(), 0);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static boolean hasChats() {
        Boolean bool = (Boolean) APIChecker.checkAndGet("Replies.hasChats", new j(), Boolean.FALSE);
        return bool != null && bool.booleanValue();
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public static boolean isInstabugNotification(Bundle bundle) {
        return ((Boolean) APIChecker.checkAndGet("Replies.isInstabugNotification", new e(bundle), Boolean.FALSE)).booleanValue();
    }

    public static void setInAppNotificationEnabled(boolean z) {
        APIChecker.checkAndRun("Replies.setInAppNotificationEnabled", new l(z));
    }

    public static void setInAppNotificationSound(boolean z) {
        APIChecker.checkAndRun("Replies.setInAppNotificationSound", new a(z));
    }

    public static void setNotificationIcon(int i2) {
        APIChecker.checkAndRun("Replies.setNotificationIcon", new d(i2));
    }

    public static void setOnNewReplyReceivedCallback(Runnable runnable) {
        APIChecker.checkAndRun("Replies.setOnNewReplyReceivedCallback", new k(runnable));
    }

    public static void setPushNotificationChannelId(String str) {
        APIChecker.checkAndRun("Replies.setPushNotificationChannelId", new h(str));
    }

    public static void setPushNotificationRegistrationToken(String str) {
        APIChecker.checkAndRun("Replies.setPushNotificationRegistrationToken", new o(str));
    }

    public static void setPushNotificationState(Feature.State state) {
        APIChecker.checkAndRun("Replies.setPushNotificationState", new n(state));
    }

    public static void setShouldPlayConversationSounds(boolean z) {
        APIChecker.checkAndRun("Replies.setShouldPlayConversationSounds", new b(z));
    }

    public static void setState(Feature.State state) {
        APIChecker.checkAndRun("Replies.setState", new c(state));
    }

    public static void setSystemReplyNotificationSoundEnabled(boolean z) {
        APIChecker.checkAndRun("Replies.setSystemReplyNotificationSoundEnabled", new g(z));
    }

    public static void show() {
        APIChecker.checkAndRun("Replies.show", new i());
    }

    public static void showNotification(Bundle bundle) {
        APIChecker.checkAndRun("Replies.showNotification", new p(bundle));
    }

    public static void showNotification(Map<String, String> map) {
        APIChecker.checkAndRun("Replies.showNotification", new q(map));
    }

    @SuppressLint({"ERADICATE_NULLABLE_DEREFERENCE"})
    public static boolean isInstabugNotification(Map<String, String> map) {
        return ((Boolean) APIChecker.checkAndGet("Replies.isInstabugNotification", new f(map), Boolean.FALSE)).booleanValue();
    }
}
