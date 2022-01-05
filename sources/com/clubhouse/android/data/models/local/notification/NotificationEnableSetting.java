package com.clubhouse.android.data.models.local.notification;

import i0.e.b.b3.a.a.e.g;
import n0.c.e;

@e(with = g.class)
/* compiled from: NotificationEnableSetting.kt */
public enum NotificationEnableSetting {
    NULL(-1),
    YES(1),
    NO(2);
    
    private final int code;

    private NotificationEnableSetting(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
