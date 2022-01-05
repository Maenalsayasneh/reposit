package com.instabug.library.model.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.instabug.library.Feature;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributesDbHelper;
import com.instabug.library.logging.InstabugUserEventLogger;
import com.instabug.library.model.UserAttributes;
import com.instabug.library.model.common.Session;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.user.UserEvent;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.filters.Filters;
import i0.d.a.a.a;
import i0.j.e.d1.d.b;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONException;

@Keep
public class SessionLocalEntity {
    private static final String TAG = "SessionLocalEntity";
    private final String appToken;
    private final String appVersion;
    private final boolean crashReportingEnabled;
    private final String customAttributes;
    private final String customAttributesKeys;
    private final String device;
    private final long duration;
    private final String id;
    private final String os;
    private final String sdkVersion;
    private final long startedAt;
    private final int syncStatus;
    private final String userEmail;
    private final String userEvents;
    private final String userEventsKeys;
    private final String userName;
    private final boolean usersPageEnabled;
    private final String uuid;

    public static class Factory {
        private String getAppToken() {
            return SettingsManager.getInstance().getAppToken();
        }

        private String getAppVersion(Context context) {
            if (context == null) {
                return null;
            }
            return InstabugDeviceProperties.getAppVersion(context);
        }

        private long getCurrentSessionTimeUntilNow() {
            long sessionStartedAt = SettingsManager.getInstance().getSessionStartedAt();
            if (sessionStartedAt == 0) {
                return 0;
            }
            return (System.currentTimeMillis() / 1000) - sessionStartedAt;
        }

        private String getDevice(boolean z) {
            if (z) {
                return InstabugDeviceProperties.getDeviceType();
            }
            return null;
        }

        private String getOs(boolean z) {
            if (!z) {
                return null;
            }
            StringBuilder P0 = a.P0("SDK Level ");
            P0.append(InstabugDeviceProperties.getCurrentOSLevel());
            return P0.toString();
        }

        private String getSdkVersion() {
            return "10.4.3";
        }

        private long getSessionStartedAt() {
            return SettingsManager.getInstance().getSessionStartedAt();
        }

        private int getSyncStatus() {
            return isFirstSession() ? 1 : 0;
        }

        private String getUserAttributesAsStringJsonObject() {
            HashMap hashMap = (HashMap) Filters.applyOn(UserAttributesDbHelper.getAll()).apply(new b()).thenGet();
            if (hashMap == null || hashMap.size() == 0) {
                return "{}";
            }
            UserAttributes userAttributes = new UserAttributes();
            userAttributes.putMap(hashMap);
            return userAttributes.toString();
        }

        private String getUserAttributesKeysAsStringJsonArray() {
            HashMap hashMap = (HashMap) Filters.applyOn(UserAttributesDbHelper.getAll()).apply(new b()).thenGet();
            if (hashMap == null || hashMap.size() == 0) {
                return "[]";
            }
            UserAttributes userAttributes = new UserAttributes();
            userAttributes.putMap(hashMap);
            return userAttributes.keysAsStringJsonArray();
        }

        private String getUserEmail(boolean z) {
            if (z) {
                return i0.j.e.c1.b.v();
            }
            return null;
        }

        private String getUserEventsAsStringJsonArray() {
            try {
                return UserEvent.toJson(new ArrayList(InstabugUserEventLogger.getInstance().getUserEvents())).toString();
            } catch (JSONException e) {
                StringBuilder P0 = a.P0("parsing user events got error: ");
                P0.append(e.getMessage());
                InstabugSDKLogger.e(SessionLocalEntity.TAG, P0.toString(), e);
                return "[]";
            }
        }

        private String getUserEventsKeysAsStringJsonArray() {
            return UserEvent.keysAsJsonArray(new ArrayList(InstabugUserEventLogger.getInstance().getUserEvents())).toString();
        }

        private String getUserName(boolean z) {
            if (z) {
                return i0.j.e.c1.b.y();
            }
            return null;
        }

        private String getUuid() {
            return i0.j.e.c1.b.C();
        }

        private boolean isCrashReportingEnabled() {
            return InstabugCore.isFeatureEnabled(Feature.CRASH_REPORTING);
        }

        private boolean isFirstSession() {
            return SettingsManager.getInstance().isFirstSession();
        }

        @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
        public SessionLocalEntity create(Context context, Session session, boolean z) {
            boolean z2 = z;
            return new SessionLocalEntity(session.getId(), getOs(z2), getDevice(z2), getCurrentSessionTimeUntilNow(), getSessionStartedAt(), getUserName(z2), getUserEmail(z2), getSdkVersion(), getAppVersion(context), getUserEventsAsStringJsonArray(), getUserAttributesAsStringJsonObject(), getUserEventsKeysAsStringJsonArray(), getUserAttributesKeysAsStringJsonArray(), isCrashReportingEnabled(), getSyncStatus(), getUuid(), getAppToken(), z);
        }
    }

    public SessionLocalEntity(String str, String str2, String str3, long j, long j2, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, int i, String str12, String str13, boolean z2) {
        this.id = str;
        this.os = str2;
        this.device = str3;
        this.duration = j;
        this.startedAt = j2;
        this.userName = str4;
        this.userEmail = str5;
        this.sdkVersion = str6;
        this.appVersion = str7;
        this.userEvents = str8;
        this.customAttributes = str9;
        this.userEventsKeys = str10;
        this.customAttributesKeys = str11;
        this.crashReportingEnabled = z;
        this.syncStatus = i;
        this.uuid = str12;
        this.appToken = str13;
        this.usersPageEnabled = z2;
    }

    public String getAppToken() {
        return this.appToken;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getCustomAttributes() {
        return this.customAttributes;
    }

    public String getCustomAttributesKeys() {
        return this.customAttributesKeys;
    }

    public String getDevice() {
        return this.device;
    }

    public long getDuration() {
        return this.duration;
    }

    public String getId() {
        return this.id;
    }

    public String getOs() {
        return this.os;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public long getStartTimestampMicros() {
        return this.startedAt;
    }

    public int getSyncStatus() {
        return this.syncStatus;
    }

    public String getUserEmail() {
        return this.userEmail;
    }

    public String getUserEvents() {
        return this.userEvents;
    }

    public String getUserEventsKeys() {
        return this.userEventsKeys;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getUuid() {
        return this.uuid;
    }

    public boolean isCrashReportingEnabled() {
        return this.crashReportingEnabled;
    }

    public boolean isUsersPageEnabled() {
        return this.usersPageEnabled;
    }
}
