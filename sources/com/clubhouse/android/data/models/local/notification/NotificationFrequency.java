package com.clubhouse.android.data.models.local.notification;

import com.clubhouse.android.data.R;
import i0.e.b.b3.a.a.e.h;
import n0.c.e;

@e(with = h.class)
/* compiled from: NotificationFrequency.kt */
public enum NotificationFrequency {
    NULL(-1, r1),
    VERY_FREQUENT(1, R.string.notification_very_frequent),
    FREQUENT(2, R.string.notification_frequent),
    NORMAL(3, r1),
    INFREQUENT(4, R.string.notification_infrequent),
    VERY_INFREQUENT(5, R.string.notification_very_infrequent);
    
    private final int code;
    private final int label;

    private NotificationFrequency(int i, int i2) {
        this.code = i;
        this.label = i2;
    }

    public final int getCode() {
        return this.code;
    }

    public final int getLabel() {
        return this.label;
    }
}
