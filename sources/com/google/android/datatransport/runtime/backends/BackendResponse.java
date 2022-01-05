package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;
import i0.h.a.a.i.p.b;

@AutoValue
public abstract class BackendResponse {

    public enum Status {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR
    }

    public static BackendResponse a() {
        return new b(Status.FATAL_ERROR, -1);
    }

    public abstract long b();

    public abstract Status c();
}
