package com.instabug.library.settings;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.OnSdkDismissCallback;
import com.instabug.library.OnSdkInvokedCallback;
import com.instabug.library.Platform;
import com.instabug.library.broadcast.LastContactedChangedBroadcast;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.utils.PreferencesUtils;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.invocation.OnInvokeCallback;
import com.instabug.library.model.Report;
import com.instabug.library.model.session.config.SessionsConfig;
import com.instabug.library.model.session.config.SessionsConfigMapper;
import com.instabug.library.ui.onboarding.WelcomeMessage;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.z;
import i0.j.e.z0.a;
import i0.j.e.z0.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

public class SettingsManager {
    private static final String ASR_DURATION_ERROR_MSG_BELOW_MIN = "Auto screen recording duration should be in a range from 30 to 180 seconds. Falling back to %d seconds";
    public static final String INSTABUG_SHARED_PREF_NAME = "instabug";
    public static final int MAX_ASR_DURATION_IN_SECONDS = 180;
    public static final int MIN_ASR_DURATION_IN_SECONDS = 30;
    private static final String TAG = "Core-SettingManager";
    public static final boolean VERBOSE = false;
    private static SettingsManager settingsManager;
    private boolean DEBUG = false;

    private int convertSecondToMilliseconds(int i) {
        return (int) TimeUnit.MILLISECONDS.convert((long) i, TimeUnit.SECONDS);
    }

    private String getASRError(int i) {
        if (i < 30) {
            return String.format(Locale.ENGLISH, ASR_DURATION_ERROR_MSG_BELOW_MIN, new Object[]{30});
        }
        return String.format(Locale.ENGLISH, ASR_DURATION_ERROR_MSG_BELOW_MIN, new Object[]{Integer.valueOf(MAX_ASR_DURATION_IN_SECONDS)});
    }

    public static synchronized SettingsManager getInstance() {
        SettingsManager settingsManager2;
        synchronized (SettingsManager.class) {
            if (settingsManager == null) {
                settingsManager = new SettingsManager();
            }
            settingsManager2 = settingsManager;
        }
        return settingsManager2;
    }

    public static String getPushNotificationToken() {
        if (b.a() != null) {
            return b.a().b.getString("ibc_push_notification_token", "");
        }
        return "";
    }

    public static boolean isInitialScreenShotAllowed() {
        return a.a().B;
    }

    public static boolean isPushNotificationTokenSent() {
        if (b.a() != null) {
            return b.a().b.getBoolean("ibc_is_push_notification_token_sent", false);
        }
        return false;
    }

    public static void setInitialScreenShotAllowed(boolean z) {
        a.a().B = z;
    }

    public static void setPushNotificationToken(String str) {
        if (b.a() != null) {
            b.a().b.edit().putString("ibc_push_notification_token", str).apply();
        }
    }

    public static void setPushNotificationTokenSent(boolean z) {
        if (b.a() != null) {
            i0.d.a.a.a.f(b.a().b, "ibc_is_push_notification_token_sent", z);
        }
    }

    public void addExtraAttachmentFile(Uri uri, String str) {
        a.a().b(uri, str);
    }

    public void addPrivateViews(View... viewArr) {
        Collection<View> collection = a.a().A;
        if (viewArr == null) {
            viewArr = new View[0];
        }
        collection.addAll(Arrays.asList(viewArr));
    }

    public void addTags(String... strArr) {
        a a = a.a();
        if (a.g != null && strArr != null) {
            for (String str : strArr) {
                if (str != null && !str.equals("null")) {
                    a.g.add(str);
                }
            }
        }
    }

    public boolean autoScreenRecordingEnabled() {
        return a.a().s;
    }

    public int autoScreenRecordingMaxDuration() {
        return a.a().t;
    }

    public void clearExtraAttachmentFiles() {
        LinkedHashMap<Uri, String> linkedHashMap = a.a().i;
        if (linkedHashMap != null) {
            linkedHashMap.clear();
        }
    }

    public String getAppToken() {
        return a.a().C;
    }

    public Feature.State getAutoScreenRecordingAudioCapturingState() {
        return a.a().z;
    }

    @Platform
    public int getCurrentPlatform() {
        return a.a().D;
    }

    public InstabugCustomTextPlaceHolder getCustomPlaceHolders() {
        return a.a().h;
    }

    public String getEnteredEmail() {
        if (b.a() != null) {
            return b.a().b.getString("entered_email", "");
        }
        return "";
    }

    public String getEnteredUsername() {
        if (b.a() != null) {
            return b.a().b.getString("entered_name", "");
        }
        return "";
    }

    public LinkedHashMap<Uri, String> getExtraAttachmentFiles() {
        return a.a().i;
    }

    public i0.j.e.t0.a getFeaturesCache() throws JSONException {
        if (b.a() == null) {
            return null;
        }
        b a = b.a();
        i0.j.e.t0.a aVar = new i0.j.e.t0.a();
        aVar.fromJson(a.b.getString("ib_features_cache", (String) null));
        return aVar;
    }

    public String getFeaturesHash() {
        if (b.a() != null) {
            return b.a().b.getString("features_hash", "");
        }
        return "";
    }

    public long getFeaturesTTL() {
        if (b.a() != null) {
            return b.a().b.getLong("features_ttl", 0);
        }
        return 0;
    }

    public Date getFirstRunAt() {
        if (b.a() != null) {
            return new Date(b.a().b.getLong("ib_first_run_at", 0));
        }
        return new Date(0);
    }

    public String getIdentifiedUserEmail() {
        if (b.a() != null) {
            return b.a().b.getString("identified_email", "");
        }
        return "";
    }

    public String getIdentifiedUsername() {
        if (b.a() != null) {
            return b.a().b.getString("identified_name", "");
        }
        return "";
    }

    public Locale getInstabugLocale(Context context) {
        a a = a.a();
        Locale locale = a.f;
        if (locale != null) {
            return locale;
        }
        Locale locale2 = context.getResources().getConfiguration().getLocales().get(0);
        a.f = locale2;
        return locale2;
    }

    @Deprecated
    public long getLastContactedAt() {
        if (b.a() != null) {
            return b.a().b.getLong(LastContactedChangedBroadcast.LAST_CONTACTED_AT, 0);
        }
        return 0;
    }

    public int getLastKnownVersionCode() {
        if (b.a() == null) {
            return -1;
        }
        b a = b.a();
        if (a.b.getInt("ib_version_code", -1) == -1) {
            a.c.putInt("ib_version_code", InstabugDeviceProperties.getVersionCode().intValue()).apply();
        }
        return a.b.getInt("ib_version_code", -1);
    }

    public int getLastMigrationVersion() {
        if (b.a() != null) {
            return b.a().b.getInt("last_migration_version", 0);
        }
        return 0;
    }

    public String getLastSDKVersion() {
        if (b.a() != null) {
            return b.a().b.getString("ib_sdk_version", "10.4.3");
        }
        return "10.4.3";
    }

    public long getLastSeenTimestamp() {
        if (b.a() != null) {
            return b.a().b.getLong("last_seen_timestamp", System.currentTimeMillis());
        }
        return System.currentTimeMillis();
    }

    public String getLoggingFeatureSettings() {
        if (b.a() != null) {
            return b.a().b.getString("ib_logging_settings", (String) null);
        }
        return null;
    }

    public String getMD5Uuid() {
        if (b.a() != null) {
            return b.a().b.getString("ib_md5_uuid", (String) null);
        }
        return null;
    }

    public OnInvokeCallback getOnInvokeCallback() {
        return a.a().j;
    }

    public Report.OnReportCreatedListener getOnReportCreatedListener() {
        return a.a().x;
    }

    public OnSdkDismissCallback getOnSdkDismissCallback() {
        return a.a().k;
    }

    public OnSdkInvokedCallback getOnSdkInvokedCallback() {
        return a.a().l;
    }

    public int getPrimaryColor() {
        return a.a().b;
    }

    public Collection<View> getPrivateViews() {
        return a.a().A;
    }

    public int getRequestedOrientation() {
        return a.a().o;
    }

    public long getSessionStartedAt() {
        return a.a().d;
    }

    public int getSessionsCount() {
        if (b.a() != null) {
            return b.a().b.getInt("ib_sessions_count", 0);
        }
        return 0;
    }

    public SessionsConfig getSessionsSyncConfigurations() {
        if (b.a() != null) {
            return SessionsConfigMapper.map(b.a().b.getString("ib_sessions_sync_configurations", "{}"));
        }
        return SessionsConfigMapper.map("{}");
    }

    public int getStatusBarColor() {
        return a.a().c;
    }

    public ArrayList<String> getTags() {
        return a.a().g;
    }

    public String getTagsAsString() {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = a.a().g;
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                sb.append(arrayList.get(i));
                if (i != size - 1) {
                    sb.append(", ");
                }
            }
        }
        return sb.toString();
    }

    public InstabugColorTheme getTheme() {
        return a.a().m;
    }

    public String getUserData() {
        if (z.j().h(Feature.USER_DATA) != Feature.State.ENABLED || b.a() == null) {
            return "";
        }
        return b.a().b.getString("ib_user_data", "");
    }

    public String getUuid() {
        if (b.a() != null) {
            return b.a().b.getString("ib_uuid", (String) null);
        }
        return null;
    }

    public WelcomeMessage.State getWelcomeMessageState() {
        if (b.a() != null) {
            return WelcomeMessage.State.valueOf(b.a().b.getString("ib_welcome_msg_state", WelcomeMessage.State.LIVE.toString()));
        }
        return WelcomeMessage.State.valueOf(WelcomeMessage.State.LIVE.toString());
    }

    public void incrementSessionsCount() {
        if (b.a() != null) {
            b a = b.a();
            a.b.edit().putInt("ib_sessions_count", a.b.getInt("ib_sessions_count", 0) + 1).apply();
        }
    }

    public boolean isAppOnForeground() {
        if (b.a() != null) {
            return b.a().b.getBoolean("ib_pn", true);
        }
        return true;
    }

    public boolean isAutoScreenRecordingDenied() {
        return a.a().q;
    }

    public boolean isAutoScreenRecordingEnabled() {
        return a.a().s;
    }

    public boolean isDebugEnabled() {
        return this.DEBUG;
    }

    public boolean isDeviceRegistered() {
        if (b.a() != null) {
            return b.a().b.getBoolean("ib_device_registered", false);
        }
        return false;
    }

    public boolean isFirstDismiss() {
        if (b.a() != null) {
            return b.a().b.getBoolean("ib_first_dismiss", true);
        }
        return true;
    }

    public boolean isFirstRun() {
        if (b.a() != null) {
            return b.a().b.getBoolean("ib_first_run", true);
        }
        return true;
    }

    public boolean isFirstRunAfterEncryptorUpdate() {
        if (b.a() != null) {
            return b.a().b.getBoolean("ib_first_run_after_updating_encryptor", true);
        }
        return true;
    }

    public boolean isFirstSession() {
        if (b.a() != null) {
            return b.a().b.getBoolean("ib_is_first_session", true);
        }
        return true;
    }

    public boolean isInBackground() {
        return a.a().n;
    }

    public boolean isOnboardingShowing() {
        return a.a().w;
    }

    public boolean isProcessingForeground() {
        return a.a().y;
    }

    public boolean isPromptOptionsScreenShown() {
        return a.a().e;
    }

    public boolean isReproStepsScreenshotEnabled() {
        return a.a().u;
    }

    public boolean isRequestPermissionScreenShown() {
        return a.a().r;
    }

    public boolean isSDKVersionSet() {
        if (b.a() != null) {
            return b.a().b.getBoolean("ib_is_sdk_version_set", false);
        }
        return false;
    }

    public boolean isScreenCurrentlyRecorded() {
        return a.a().p;
    }

    public boolean isScreenshotByMediaProjectionEnabled() {
        return a.a().v;
    }

    public boolean isSessionEnabled() {
        if (b.a() != null) {
            return b.a().b.getBoolean("session_status", true);
        }
        return true;
    }

    public boolean isUserLoggedOut() {
        if (b.a() != null) {
            return b.a().b.getBoolean("ib_is_user_logged_out", true);
        }
        return true;
    }

    public boolean isUsersPageEnabled() {
        if (b.a() != null) {
            return b.a().b.getBoolean("ib_is_users_page_enabled", false);
        }
        return false;
    }

    public void release() {
        synchronized (a.class) {
            a.a = null;
        }
    }

    public void removePrivateViews(View... viewArr) {
        Collection<View> collection = a.a().A;
        if (viewArr == null) {
            viewArr = new View[0];
        }
        collection.removeAll(Arrays.asList(viewArr));
    }

    public void resetRequestedOrientation() {
        a.a().o = -2;
    }

    public void resetSessionCount() {
        if (b.a() != null) {
            b.a().b.edit().putInt("ib_sessions_count", 0).apply();
        }
    }

    public void resetTags() {
        a.a().g = new ArrayList<>();
    }

    public void setAppToken(String str) {
        a.a().C = str;
    }

    public void setAutoScreenRecordingAudioCapturingState(Feature.State state) {
        a.a().z = state;
    }

    public void setAutoScreenRecordingDenied(boolean z) {
        a.a().q = z;
    }

    public void setAutoScreenRecordingDuration(int i) {
        if (i > 180) {
            Log.w("Instabug", getASRError(i));
            a.a().t = convertSecondToMilliseconds(MAX_ASR_DURATION_IN_SECONDS);
        } else if (i < 30) {
            Log.w("Instabug", getASRError(i));
            a.a().t = convertSecondToMilliseconds(30);
        } else {
            a.a().t = i * 1000;
        }
    }

    public void setAutoScreenRecordingEnabled(boolean z) {
        a.a().s = z;
    }

    public void setAutoScreenRecordingMaxDuration(int i) {
        a a = a.a();
        if (i > 30000) {
            i = 30000;
        }
        a.t = i;
    }

    public void setCurrentPlatform(@Platform int i) {
        a.a().D = i;
    }

    public void setCurrentSDKVersion(String str) {
        if (b.a() != null) {
            b a = b.a();
            a.b.edit().putString("ib_sdk_version", str).apply();
            i0.d.a.a.a.f(a.b, "ib_is_sdk_version_set", true);
        }
    }

    public void setCustomPlaceHolders(InstabugCustomTextPlaceHolder instabugCustomTextPlaceHolder) {
        a.a().h = instabugCustomTextPlaceHolder;
    }

    public void setDebugEnabled(boolean z) {
        this.DEBUG = z;
    }

    public void setEnteredEmail(String str) {
        if (b.a() != null) {
            b a = b.a();
            a.c.putString("entered_email", str);
            a.c.apply();
        }
    }

    public void setEnteredUsername(String str) {
        if (b.a() != null) {
            b a = b.a();
            a.c.putString("entered_name", str);
            a.c.apply();
        }
    }

    public void setFeaturesCache(i0.j.e.t0.a aVar) throws JSONException {
        if (b.a() != null) {
            b.a().b.edit().putString("ib_features_cache", aVar.toJson()).apply();
        }
    }

    public void setFeaturesHash(String str) {
        if (b.a() != null) {
            b.a().b.edit().putString("features_hash", str).apply();
        }
    }

    public void setFeaturesTTL(long j) {
        if (b.a() != null) {
            b.a().b.edit().putLong("features_ttl", j).apply();
        }
    }

    public void setFirstRunAfterEncryptorUpdate(boolean z) {
        if (b.a() != null) {
            b a = b.a();
            a.c.putBoolean("ib_first_run_after_updating_encryptor", z);
            a.c.apply();
        }
    }

    public void setFirstRunAt(long j) {
        if (b.a() != null) {
            b.a().b.edit().putLong("ib_first_run_at", j).apply();
        }
    }

    public void setIdentifiedUserEmail(String str) {
        if (b.a() != null) {
            b a = b.a();
            a.c.putString("identified_email", str);
            a.c.apply();
        }
    }

    public void setIdentifiedUsername(String str) {
        if (b.a() != null) {
            b a = b.a();
            a.c.putString("identified_name", str);
            a.c.apply();
        }
    }

    public void setInBackground(boolean z) {
        a.a().n = z;
    }

    public void setInstabugLocale(Locale locale) {
        a.a().f = locale;
    }

    public void setIsAppOnForeground(boolean z) {
        if (b.a() != null) {
            i0.d.a.a.a.f(b.a().b, "ib_pn", z);
        }
    }

    public void setIsDeviceRegistered(boolean z) {
        if (b.a() != null) {
            i0.d.a.a.a.f(b.a().b, "ib_device_registered", z);
        }
    }

    public void setIsFirstDismiss(boolean z) {
        if (b.a() != null) {
            i0.d.a.a.a.f(b.a().b, "ib_first_dismiss", z);
        }
    }

    public void setIsFirstRun(boolean z) {
        if (b.a() != null) {
            b a = b.a();
            i0.d.a.a.a.f(a.b, "ib_first_run", z);
            a.b.edit().putLong("ib_first_run_at", System.currentTimeMillis()).apply();
        }
    }

    public void setIsFirstSession(boolean z) {
        if (b.a() != null) {
            b.a().c.putBoolean("ib_is_first_session", z).apply();
        }
    }

    public void setIsSessionEnabled(boolean z) {
        if (b.a() != null) {
            i0.d.a.a.a.f(b.a().b, "session_status", z);
        }
    }

    @Deprecated
    public void setLastContactedAt(long j) {
        if (b.a() != null) {
            b.a().b.edit().putLong(LastContactedChangedBroadcast.LAST_CONTACTED_AT, j).apply();
        }
    }

    public void setLastMigrationVersion(int i) {
        if (b.a() != null) {
            b.a().b.edit().putInt("last_migration_version", i).apply();
        }
    }

    public void setLastSeenTimestamp(long j) {
        if (b.a() != null) {
            b.a().b.edit().putLong("last_seen_timestamp", j).apply();
        }
    }

    public void setLoggingFeatureSettings(String str) {
        if (b.a() != null) {
            b.a().b.edit().putString("ib_logging_settings", str).apply();
        }
    }

    public void setMD5Uuid(String str) {
        if (b.a() != null) {
            b.a().b.edit().putString("ib_md5_uuid", str).apply();
        }
    }

    public void setOnInvokeCallback(OnInvokeCallback onInvokeCallback) {
        a.a().j = onInvokeCallback;
    }

    public void setOnReportCreatedListener(Report.OnReportCreatedListener onReportCreatedListener) {
        a.a().x = onReportCreatedListener;
    }

    public void setOnSdkDismissCallback(OnSdkDismissCallback onSdkDismissCallback) {
        a.a().k = onSdkDismissCallback;
    }

    public void setOnSdkInvokedCallback(OnSdkInvokedCallback onSdkInvokedCallback) {
        a.a().l = onSdkInvokedCallback;
    }

    public void setOnboardingShowing(boolean z) {
        a.a().w = z;
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public void setPrimaryColor(int i) {
        a.a().b = i;
        InvocationManager.getInstance().notifyPrimaryColorChanged();
    }

    public void setProcessingForeground(boolean z) {
        a.a().y = z;
    }

    public void setPromptOptionsScreenShown(boolean z) {
        a.a().e = z;
    }

    public void setReproStepsScreenshotEnabled(boolean z) {
        a.a().u = z;
    }

    public void setRequestPermissionScreenShown(boolean z) {
        a.a().r = z;
    }

    public void setRequestedOrientation(int i) {
        a.a().o = i;
    }

    public void setScreenCurrentlyRecorded(boolean z) {
        a.a().p = z;
    }

    public void setScreenshotByMediaProjectionEnabled(boolean z) {
        a.a().v = z;
    }

    public void setSessionStartedAt(long j) {
        a.a().d = j;
    }

    public void setSessionsSyncConfigurations(String str) {
        if (b.a() != null) {
            b.a().c.putString("ib_sessions_sync_configurations", str).apply();
        }
    }

    public void setShouldAutoShowOnboarding(boolean z) {
        if (b.a() != null) {
            i0.d.a.a.a.f(b.a().b, "should_show_onboarding", z);
        }
    }

    public void setShouldMakeUUIDMigrationRequest(boolean z) {
        if (b.a() != null) {
            i0.d.a.a.a.f(b.a().b, "ib_should_make_uuid_migration_request", z);
        }
    }

    public void setStatusBarColor(int i) {
        a.a().c = i;
    }

    public void setTheme(InstabugColorTheme instabugColorTheme) {
        a.a().m = instabugColorTheme;
    }

    public void setUserData(String str) {
        if (b.a() != null) {
            b.a().b.edit().putString("ib_user_data", str).apply();
        }
    }

    public void setUserLoggedOut(boolean z) {
        if (b.a() != null) {
            i0.d.a.a.a.f(b.a().b, "ib_is_user_logged_out", z);
        }
    }

    public void setUsersPageEnabled(boolean z) {
        if (b.a() != null) {
            b a = b.a();
            a.c.putBoolean("ib_is_users_page_enabled", z);
            a.c.apply();
        }
    }

    public void setUuid(String str) {
        if (b.a() != null) {
            b.a().b.edit().putString("ib_uuid", str).apply();
        }
    }

    public void setVersionCode(int i) {
        if (b.a() != null) {
            b.a().c.putInt("ib_version_code", i).apply();
        }
    }

    public void setWelcomeMessageState(WelcomeMessage.State state) {
        if (b.a() != null) {
            b.a().b.edit().putString("ib_welcome_msg_state", state.toString()).apply();
        }
    }

    public boolean shouldAutoShowOnboarding() {
        if (b.a() != null) {
            return b.a().b.getBoolean("should_show_onboarding", true);
        }
        return true;
    }

    public boolean shouldMakeUUIDMigrationRequest() {
        if (b.a() != null) {
            return b.a().b.getBoolean("ib_should_make_uuid_migration_request", false);
        }
        return false;
    }

    public void updateUserSessionCount(int i) {
        if (b.a() != null) {
            b.a().b.edit().putInt("ib_sessions_count", i).apply();
        }
    }

    public void addExtraAttachmentFile(byte[] bArr, String str) {
        Uri uriFromBytes;
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext == null) {
            InstabugSDKLogger.w(TAG, "Can't execute addExtraAttachmentFile(). Null context");
        } else if (AttachmentsUtility.isValidSize((double) bArr.length, 5.0d) && (uriFromBytes = AttachmentsUtility.getUriFromBytes(applicationContext, bArr, str)) != null) {
            a.a().b(uriFromBytes, str);
        }
    }

    public static SessionsConfig getSessionsSyncConfigurations(Context context) {
        return SessionsConfigMapper.map(new PreferencesUtils(context, INSTABUG_SHARED_PREF_NAME).getString("ib_sessions_sync_configurations", "{}"));
    }
}
