package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.Feature;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final Feature c;

    public UnsupportedApiCallException(@RecentlyNonNull Feature feature) {
        this.c = feature;
    }

    @RecentlyNonNull
    public final String getMessage() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
