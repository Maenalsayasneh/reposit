package com.instabug.library.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.OnSdkInvokedCallback;
import com.instabug.library.Platform;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.internal.orchestrator.Action;
import com.instabug.library.internal.orchestrator.ActionsOrchestrator;
import com.instabug.library.internal.storage.Encryptor;
import com.instabug.library.internal.storage.ProcessedBytes;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import com.instabug.library.model.Report;
import com.instabug.library.model.common.Session;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.FileUtils;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.a1.e;
import i0.j.e.c0;
import i0.j.e.c1.b;
import i0.j.e.d0;
import i0.j.e.i0;
import i0.j.e.z;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;

public class InstabugCore {

    public static class a implements Action {
        public final /* synthetic */ Runnable a;

        public a(Runnable runnable) {
            this.a = runnable;
        }

        public void run() throws Exception {
            this.a.run();
        }
    }

    public static boolean decrypt(String str) {
        try {
            return Encryptor.d(str);
        } catch (Exception | UnsatisfiedLinkError e) {
            InstabugSDKLogger.e(Encryptor.class, "Can't Decrypt attachment", e);
            return false;
        }
    }

    public static ProcessedBytes decryptOnTheFly(String str) {
        try {
            if (FileUtils.isEncryptedFile(str)) {
                return Encryptor.e(str);
            }
            File file = new File(str);
            byte[] bArr = new byte[((int) file.length())];
            Encryptor.b(file, bArr);
            return new ProcessedBytes(bArr, true);
        } catch (Exception | UnsatisfiedLinkError e) {
            InstabugSDKLogger.e(Encryptor.class, "Can't Decrypt attachment", e);
            return new ProcessedBytes(new byte[0], false);
        }
    }

    public static void doOnBackground(Runnable runnable) {
        if (runnable != null) {
            ActionsOrchestrator.obtainOrchestrator().addWorkerThreadAction(new a(runnable)).orchestrate();
        }
    }

    public static boolean encrypt(String str) {
        try {
            return Encryptor.f(str);
        } catch (Exception | UnsatisfiedLinkError e) {
            InstabugSDKLogger.e(Encryptor.class, "Can't Encrypt attachment", e);
            return false;
        }
    }

    public static i0.j.e.l0.g.a getApplicationScopeServiceLocator() {
        return i0.j.e.l0.g.d.a.a;
    }

    public static String getCurrentView() {
        int currentPlatform = SettingsManager.getInstance().getCurrentPlatform();
        if (currentPlatform == 4 || currentPlatform == 8 || currentPlatform == 7) {
            return e.c().d;
        }
        return e.c().c;
    }

    public static String getEnteredEmail() {
        return b.s();
    }

    public static String getEnteredUsername() {
        return b.t();
    }

    public static LinkedHashMap<Uri, String> getExtraAttachmentFiles() {
        return SettingsManager.getInstance().getExtraAttachmentFiles();
    }

    public static Feature.State getFeatureState(Feature feature) {
        return z.j().h(feature);
    }

    public static long getFirstRunAt() {
        return SettingsManager.getInstance().getFirstRunAt().getTime();
    }

    public static String getIdentifiedUserEmail() {
        return b.v();
    }

    public static String getIdentifiedUsername() {
        return b.y();
    }

    public static SQLiteOpenHelper getInstabugDbHelper(Context context) {
        return new i0.j.e.l0.k.a.b.a(context);
    }

    public static long getLastSeenTimestamp() {
        return SettingsManager.getInstance().getLastSeenTimestamp();
    }

    public static Object getLastSeenView() {
        return InstabugInternalTrackingDelegate.getInstance().getLastSeenView();
    }

    public static Report.OnReportCreatedListener getOnReportCreatedListener() {
        return SettingsManager.getInstance().getOnReportCreatedListener();
    }

    public static OnSdkInvokedCallback getOnSdkInvokedCallback() {
        return SettingsManager.getInstance().getOnSdkInvokedCallback();
    }

    @Platform
    public static int getPlatform() {
        return SettingsManager.getInstance().getCurrentPlatform();
    }

    public static int getPrimaryColor() {
        return SettingsManager.getInstance().getPrimaryColor();
    }

    public static String getPushNotificationToken() {
        return SettingsManager.getPushNotificationToken();
    }

    public static Session getRunningSession() {
        Session session;
        i0 d = i0.d();
        synchronized (d) {
            session = d.e;
        }
        return session;
    }

    public static String getSDKVersion() {
        return "10.4.3";
    }

    public static int getSessionCount() {
        return SettingsManager.getInstance().getSessionsCount();
    }

    public static int getStartedActivitiesCount() {
        return i0.d().c;
    }

    public static String getTagsAsString() {
        return SettingsManager.getInstance().getTagsAsString();
    }

    public static Activity getTargetActivity() {
        return InstabugInternalTrackingDelegate.getInstance().getTargetActivity();
    }

    public static String getUserData() {
        return SettingsManager.getInstance().getUserData();
    }

    public static Plugin getXPlugin(Class cls) {
        synchronized (i0.j.e.y.b.a.b) {
            if (!i0.j.e.y.b.a.b("getXPlugin()")) {
                return null;
            }
            for (Plugin next : i0.j.e.y.b.a.a) {
                if (cls.isInstance(next)) {
                    return next;
                }
            }
            return null;
        }
    }

    public static boolean isAppOnForeground() {
        return SettingsManager.getInstance().isAppOnForeground();
    }

    public static boolean isAutoScreenRecordingEnabled() {
        return SettingsManager.getInstance().isAutoScreenRecordingEnabled();
    }

    public static boolean isExperimentalFeatureAvailable(Feature feature) {
        z j = z.j();
        if (j.h.containsKey(feature)) {
            InstabugSDKLogger.d("InstabugFeaturesManager", "Experimental Feature " + feature + " availability is " + j.h.get(feature));
            return j.h.get(feature).booleanValue();
        }
        InstabugSDKLogger.d("InstabugFeaturesManager", "Experimental Feature " + feature + " availability not found, returning " + false);
        return false;
    }

    public static boolean isFeatureAvailable(Feature feature) {
        return z.j().i(feature);
    }

    public static boolean isFeatureEnabled(Feature feature) {
        return z.j().h(feature) == Feature.State.ENABLED;
    }

    public static boolean isFeaturesFetchedBefore() {
        Objects.requireNonNull(z.j());
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext == null || applicationContext.getSharedPreferences(SettingsManager.INSTABUG_SHARED_PREF_NAME, 0).getLong("LAST_FETCHED_AT", 0) <= 0) {
            return false;
        }
        return true;
    }

    public static boolean isFirstRunAfterEncryptorUpdate() {
        return SettingsManager.getInstance().isFirstRunAfterEncryptorUpdate();
    }

    public static boolean isForegroundBusy() {
        boolean z;
        synchronized (i0.j.e.y.b.a.b) {
            if (i0.j.e.y.b.a.b("isForegroundBusy()")) {
                Iterator<Plugin> it = i0.j.e.y.b.a.a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getState() != 0) {
                            z = true;
                            break;
                        }
                    } else {
                        z = i0.j.e.y.b.a.a();
                        break;
                    }
                }
            } else {
                z = i0.j.e.y.b.a.a();
            }
        }
        return z;
    }

    public static void isInitialScreenShotAllowed() {
        SettingsManager.isInitialScreenShotAllowed();
    }

    public static boolean isPushNotificationTokenSent() {
        return SettingsManager.isPushNotificationTokenSent();
    }

    public static boolean isReproStepsScreenshotEnabled() {
        return SettingsManager.getInstance().isReproStepsScreenshotEnabled();
    }

    public static boolean isUserLoggedOut() {
        return SettingsManager.getInstance().isUserLoggedOut();
    }

    public static boolean isUsersPageEnabled() {
        return SettingsManager.getInstance().isUsersPageEnabled();
    }

    public static HashMap<String, String> retrieveAllSDKAttributes() {
        return UserAttributeCacheManager.retrieveAllSDKAttributes();
    }

    public static void setAutoScreenRecordingEnabled(boolean z) {
        SettingsManager.getInstance().setAutoScreenRecordingEnabled(z);
    }

    public static void setBugReportingState(Feature.State state) {
        z.j().d(Feature.BUG_REPORTING, state);
    }

    public static void setChatsState(Feature.State state) {
        z.j().d(Feature.CHATS, state);
    }

    @Deprecated
    public static void setDeprecatedChatState(Feature.State state) {
        z.j().d(Feature.DEPRECATED_CHATS, state);
    }

    public static void setEnteredEmail(String str) {
        b.w(str);
    }

    public static void setEnteredUsername(String str) {
        b.z(str);
    }

    public static void setFeatureState(Feature feature, Feature.State state) {
        z.j().d(feature, state);
    }

    public static void setFirstRunAfterEncryptorUpdate(boolean z) {
        SettingsManager.getInstance().setFirstRunAfterEncryptorUpdate(z);
    }

    public static void setIdentifiedUserEmail(String str) {
        b.B(str);
    }

    public static void setInitialScreenShotAllowed(boolean z) {
        SettingsManager.setInitialScreenShotAllowed(z);
    }

    public static void setLastContactedAt(long j) {
        SettingsManager.getInstance().setLastContactedAt(j);
    }

    public static void setLastSeenTimestamp(long j) {
        SettingsManager.getInstance().setLastSeenTimestamp(j);
    }

    public static void setMessagingState(Feature.State state) {
        z.j().d(Feature.IN_APP_MESSAGING, state);
    }

    public static <T extends Plugin> void setPluginState(Class<T> cls, int i) {
        Plugin xPlugin = getXPlugin(cls);
        if (xPlugin != null) {
            xPlugin.setState(i);
        }
    }

    public static void setPushNotificationState(Feature.State state) {
        z.j().d(Feature.PUSH_NOTIFICATION, state);
    }

    public static void setPushNotificationToken(String str) {
        SettingsManager.setPushNotificationToken(str);
    }

    public static void setPushNotificationTokenSent(boolean z) {
        SettingsManager.setPushNotificationTokenSent(z);
    }

    public static void setRepliesState(Feature.State state) {
        z.j().d(Feature.REPLIES, state);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static void setTemporaryDisabled() {
        z.j().e = true;
        Method method = (Method) c0.a.executeAndGet(new d0(Instabug.class, "disableInternal"));
        if (method != null) {
            try {
                method.invoke((Object) null, new Object[0]);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }
}
