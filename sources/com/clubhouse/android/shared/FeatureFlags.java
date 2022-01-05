package com.clubhouse.android.shared;

import com.clubhouse.android.shared.preferences.Key;
import i0.e.b.f3.k.a;
import i0.e.b.f3.k.b;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.EmptyList;
import m0.j.g;
import m0.n.b.i;
import n0.a.g2.a0;
import n0.a.g2.d;
import n0.a.g2.q;
import n0.a.g2.z;

/* compiled from: FeatureFlags.kt */
public final class FeatureFlags {
    public final b a;
    public z<? extends List<String>> b;

    public FeatureFlags(b bVar) {
        i.e(bVar, "userPreferences");
        this.a = bVar;
        q a2 = a0.a(EmptyList.c);
        this.b = a2;
        Objects.requireNonNull(bVar);
        a2.setValue(g.v0(a.d(bVar, Key.FEATURE_FLAGS, (Set) null, 2, (Object) null)));
    }

    public final boolean a(Flag flag) {
        i.e(flag, "flag");
        return ((List) this.b.getValue()).contains(flag.getKey());
    }

    public final d<Boolean> b(Flag flag) {
        i.e(flag, "flag");
        return m0.r.t.a.r.m.a1.a.f1(new FeatureFlags$observeEnabled$$inlined$map$1(this.b, flag));
    }
}
