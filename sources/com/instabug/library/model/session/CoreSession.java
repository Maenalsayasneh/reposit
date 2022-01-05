package com.instabug.library.model.session;

import androidx.annotation.Keep;
import com.instabug.library.model.common.Session;
import i0.j.e.l0.a.b;
import i0.j.e.l0.a.c;

@Keep
public class CoreSession implements Session {
    @c(name = "application_token")
    @b
    private final String appToken;
    @c(name = "app_version")
    @b
    private final String appVersion;
    @c(name = "crash_reporting_enabled")
    @b
    private final boolean crashReportingEnabled;
    @c(alternate = "custom_attribute_keys", name = "custom_attributes")
    @b
    private final String customAttributes;
    @c(name = "device")
    @b
    private final String device;
    @c(name = "duration")
    @b
    private final long duration;
    private final String id;
    @c(name = "os")
    @b
    private final String os;
    @c(name = "sdk_version")
    @b
    private final String sdkVersion;
    private final long startNanoTime;
    @c(name = "started_at")
    @b
    private final long startTimestampMicros;
    private final int syncStatus;
    @c(name = "email")
    @b
    private final String userEmail;
    @c(alternate = "user_event_keys", name = "user_events")
    @b
    private final String userEvents;
    @c(name = "name")
    @b
    private final String userName;
    private final boolean usersPageEnabled;
    @c(name = "uuid")
    @b
    private final String uuid;

    public CoreSession(String str) {
        this(str, "null", (String) null, 0, 0, 0, (String) null, (String) null, (String) null, "null", (String) null, (String) null, false, 0, "null", (String) null, false);
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

    public long getStartNanoTime() {
        return this.startNanoTime;
    }

    public long getStartTimestampMicros() {
        return this.startTimestampMicros;
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CoreSession(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26, long r28) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r18 = r24
            r13 = r25
            r6 = r26
            r8 = r28
            r3 = 0
            r4 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r0.<init>(r1, r2, r3, r4, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.model.session.CoreSession.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long):void");
    }

    public CoreSession(String str, String str2, String str3, long j, long j2, long j3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, int i, String str10, String str11, boolean z2) {
        this.id = str;
        this.os = str2;
        this.device = str3;
        this.duration = j;
        this.startTimestampMicros = j2;
        this.userName = str4;
        this.userEmail = str5;
        this.sdkVersion = str6;
        this.appVersion = str7;
        this.userEvents = str8;
        this.customAttributes = str9;
        this.crashReportingEnabled = z;
        this.syncStatus = i;
        this.uuid = str10;
        this.appToken = str11;
        this.usersPageEnabled = z2;
        this.startNanoTime = j3;
    }
}
