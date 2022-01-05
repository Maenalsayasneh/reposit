package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;
import i0.h.a.a.h.e.a;

@AutoValue
public abstract class ClientInfo {

    public enum ClientType {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        private ClientType(int i) {
            this.value = i;
        }
    }

    public abstract a a();

    public abstract ClientType b();
}
