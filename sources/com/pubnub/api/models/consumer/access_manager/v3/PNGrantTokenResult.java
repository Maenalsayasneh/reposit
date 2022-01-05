package com.pubnub.api.models.consumer.access_manager.v3;

import i0.d.a.a.a;
import java.util.Objects;
import lombok.NonNull;

public class PNGrantTokenResult {
    @NonNull
    private final String token;

    public PNGrantTokenResult(@NonNull String str) {
        Objects.requireNonNull(str, "token is marked @NonNull but is null");
        this.token = str;
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNGrantTokenResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNGrantTokenResult)) {
            return false;
        }
        PNGrantTokenResult pNGrantTokenResult = (PNGrantTokenResult) obj;
        if (!pNGrantTokenResult.canEqual(this)) {
            return false;
        }
        String token2 = getToken();
        String token3 = pNGrantTokenResult.getToken();
        return token2 != null ? token2.equals(token3) : token3 == null;
    }

    @NonNull
    public String getToken() {
        return this.token;
    }

    public int hashCode() {
        String token2 = getToken();
        return 59 + (token2 == null ? 43 : token2.hashCode());
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNGrantTokenResult(token=");
        P0.append(getToken());
        P0.append(")");
        return P0.toString();
    }
}
