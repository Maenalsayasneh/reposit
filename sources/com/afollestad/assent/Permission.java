package com.afollestad.assent;

import android.annotation.SuppressLint;
import m0.n.b.f;
import m0.n.b.i;

@SuppressLint({"InlinedApi"})
/* compiled from: Permissions.kt */
public enum Permission {
    UNKNOWN(""),
    READ_CALENDAR("android.permission.READ_CALENDAR"),
    WRITE_CALENDAR("android.permission.WRITE_CALENDAR"),
    CAMERA("android.permission.CAMERA"),
    READ_CONTACTS("android.permission.READ_CONTACTS"),
    WRITE_CONTACTS("android.permission.WRITE_CONTACTS"),
    GET_ACCOUNTS("android.permission.GET_ACCOUNTS"),
    ACCESS_FINE_LOCATION("android.permission.ACCESS_FINE_LOCATION"),
    ACCESS_COARSE_LOCATION("android.permission.ACCESS_COARSE_LOCATION"),
    ACCESS_BACKGROUND_LOCATION("android.permission.ACCESS_BACKGROUND_LOCATION"),
    RECORD_AUDIO("android.permission.RECORD_AUDIO"),
    READ_PHONE_STATE("android.permission.READ_PHONE_STATE"),
    CALL_PHONE("android.permission.CALL_PHONE"),
    READ_CALL_LOG("android.permission.READ_CALL_LOG"),
    WRITE_CALL_LOG("android.permission.WRITE_CALL_LOG"),
    ADD_VOICEMAIL("com.android.voicemail.permission.ADD_VOICEMAIL"),
    USE_SIP("android.permission.USE_SIP"),
    BODY_SENSORS("android.permission.BODY_SENSORS"),
    SEND_SMS("android.permission.SEND_SMS"),
    RECEIVE_SMS("android.permission.RECEIVE_SMS"),
    READ_SMS("android.permission.READ_SMS"),
    RECEIVE_WAP_PUSH("android.permission.RECEIVE_WAP_PUSH"),
    RECEIVE_MMS("android.permission.RECEIVE_MMS"),
    READ_EXTERNAL_STORAGE("android.permission.READ_EXTERNAL_STORAGE"),
    WRITE_EXTERNAL_STORAGE("android.permission.WRITE_EXTERNAL_STORAGE"),
    SYSTEM_ALERT_WINDOW("android.permission.SYSTEM_ALERT_WINDOW"),
    PROCESS_OUTGOING_CALLS("android.permission.PROCESS_OUTGOING_CALLS");
    
    public static final a Companion = null;
    private final String value;

    /* compiled from: Permissions.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final Permission a(String str) {
            i.f(str, "raw");
            Permission[] values = Permission.values();
            int i = 0;
            Permission permission = null;
            boolean z = false;
            Permission permission2 = null;
            while (true) {
                if (i < 27) {
                    Permission permission3 = values[i];
                    if (i.a(permission3.getValue(), str)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        permission2 = permission3;
                    }
                    i++;
                } else if (z) {
                    permission = permission2;
                }
            }
            return permission != null ? permission : Permission.UNKNOWN;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a((f) null);
    }

    private Permission(String str) {
        this.value = str;
    }

    public static final Permission parse(String str) {
        return Companion.a(str);
    }

    public final String getValue() {
        return this.value;
    }
}
