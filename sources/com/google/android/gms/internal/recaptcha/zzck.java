package com.google.android.gms.internal.recaptcha;

import j$.time.Instant;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public enum zzck {
    INSTANCE;

    public final String toString() {
        return "TimeSource.system()";
    }

    public final Instant zza() {
        return Instant.now();
    }
}
