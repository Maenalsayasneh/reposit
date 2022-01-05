package com.clubhouse.android.data.models.local.notification;

import com.clubhouse.android.data.R;
import i0.e.b.b3.a.a.e.i;
import n0.c.e;

@e(with = i.class)
/* compiled from: NotificationPause.kt */
public enum NotificationPause {
    NULL(-1, (int) null, 2, (Integer) null),
    HOUR(1, Integer.valueOf(R.string.notification_pause_hour)),
    TILL_EVENING(2, Integer.valueOf(R.string.notification_pause_evening)),
    TILL_MORNING(3, Integer.valueOf(R.string.notification_pause_morning)),
    TILL_WEEK(4, Integer.valueOf(R.string.notification_pause_week)),
    UNPAUSE(5, (int) null, 2, (Integer) null);
    
    private final int code;
    private final Integer label;

    private NotificationPause(int i, Integer num) {
        this.code = i;
        this.label = num;
    }

    public final int getCode() {
        return this.code;
    }

    public final Integer getLabel() {
        return this.label;
    }
}
