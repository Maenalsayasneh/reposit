package com.google.firebase.installations.remote;

import com.google.auto.value.AutoValue;
import i0.h.c.r.q.b;

@AutoValue
public abstract class TokenResult {

    public enum ResponseCode {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    @AutoValue.Builder
    public static abstract class a {
        public abstract TokenResult a();

        public abstract a b(long j);
    }

    public static a a() {
        b.C0152b bVar = new b.C0152b();
        bVar.b(0);
        return bVar;
    }

    public abstract ResponseCode b();

    public abstract String c();

    public abstract long d();
}
