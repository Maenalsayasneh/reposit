package com.clubhouse.android.shared.preferences;

import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: DeviceSharedPreferences.kt */
public final class DeviceSharedPreferences$deviceId$2 extends Lambda implements a<String> {
    public final /* synthetic */ DeviceSharedPreferences c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeviceSharedPreferences$deviceId$2(DeviceSharedPreferences deviceSharedPreferences) {
        super(0);
        this.c = deviceSharedPreferences;
    }

    public Object invoke() {
        DeviceSharedPreferences deviceSharedPreferences = this.c;
        Key key = Key.DEVICE_ID;
        String c2 = i0.e.b.f3.k.a.c(deviceSharedPreferences, key, (String) null, 2, (Object) null);
        if (c2 != null) {
            return c2;
        }
        Objects.requireNonNull(this.c);
        String uuid = UUID.randomUUID().toString();
        i.d(uuid, "randomUUID().toString()");
        this.c.i(key, uuid);
        return uuid;
    }
}
