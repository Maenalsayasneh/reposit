package com.google.android.play.core.review;

import android.app.PendingIntent;
import java.util.Objects;

public final class a extends ReviewInfo {
    public final PendingIntent c;

    public a(PendingIntent pendingIntent) {
        Objects.requireNonNull(pendingIntent, "Null pendingIntent");
        this.c = pendingIntent;
    }

    public final PendingIntent a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            return this.c.equals(((ReviewInfo) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        return i0.d.a.a.a.z0(new StringBuilder(valueOf.length() + 26), "ReviewInfo{pendingIntent=", valueOf, "}");
    }
}
