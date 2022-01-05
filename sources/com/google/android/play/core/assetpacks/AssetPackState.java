package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.support.annotation.NonNull;
import i0.h.a.b.c.m.b;
import i0.h.a.d.a.b.d0;
import i0.h.a.d.a.b.r0;
import i0.h.a.d.a.b.v;

public abstract class AssetPackState {
    public static AssetPackState b(@NonNull String str, int i, int i2, long j, long j2, double d, int i3) {
        return new d0(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3);
    }

    public static AssetPackState d(Bundle bundle, String str, r0 r0Var, v vVar) {
        double doubleValue;
        Bundle bundle2 = bundle;
        String str2 = str;
        r0 r0Var2 = r0Var;
        int a = vVar.a(bundle2.getInt(b.F("status", str2)), str2);
        int i = bundle2.getInt(b.F("error_code", str2));
        long j = bundle2.getLong(b.F("bytes_downloaded", str2));
        long j2 = bundle2.getLong(b.F("total_bytes_to_download", str2));
        synchronized (r0Var) {
            Double d = r0Var2.a.get(str2);
            doubleValue = d == null ? 0.0d : d.doubleValue();
        }
        long j3 = bundle2.getLong(b.F("pack_version", str2));
        long j4 = bundle2.getLong(b.F("pack_base_version", str2));
        return b(str, a, i, j, j2, doubleValue, (a != 4 || j4 == 0 || j4 == j3) ? 1 : 2);
    }

    public abstract int a();

    public abstract long c();

    public abstract int e();

    public abstract String f();

    public abstract int g();

    public abstract long h();

    public abstract int i();
}
