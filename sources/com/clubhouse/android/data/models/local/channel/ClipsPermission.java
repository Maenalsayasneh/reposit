package com.clubhouse.android.data.models.local.channel;

import i0.e.b.b3.a.b.c.b;
import n0.c.e;

@e(with = b.class)
/* compiled from: ClipsPermission.kt */
public enum ClipsPermission {
    NOT_ALLOWED(0),
    ALLOWED_FOR_ALL(1);
    
    private final int code;

    private ClipsPermission(int i) {
        this.code = i;
    }

    public final int getCode() {
        return this.code;
    }
}
