package com.pubnub.api.models.consumer.files;

import i0.d.a.a.a;
import java.util.Objects;
import lombok.NonNull;

public class PNFileUrlResult {
    @NonNull
    private final String url;

    public PNFileUrlResult(@NonNull String str) {
        Objects.requireNonNull(str, "url is marked @NonNull but is null");
        this.url = str;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNFileUrlResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNFileUrlResult)) {
            return false;
        }
        PNFileUrlResult pNFileUrlResult = (PNFileUrlResult) obj;
        if (!pNFileUrlResult.canEqual(this)) {
            return false;
        }
        String url2 = getUrl();
        String url3 = pNFileUrlResult.getUrl();
        return url2 != null ? url2.equals(url3) : url3 == null;
    }

    @NonNull
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String url2 = getUrl();
        return 59 + (url2 == null ? 43 : url2.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNFileUrlResult(url=");
        P0.append(getUrl());
        P0.append(")");
        return P0.toString();
    }
}
