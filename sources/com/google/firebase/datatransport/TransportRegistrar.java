package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import i0.h.a.a.b;
import i0.h.a.a.f;
import i0.h.a.a.h.a;
import i0.h.a.a.i.b;
import i0.h.a.a.i.d;
import i0.h.a.a.i.h;
import i0.h.a.a.i.i;
import i0.h.a.a.i.m;
import i0.h.c.j.d;
import i0.h.c.j.e;
import i0.h.c.j.h;
import i0.h.c.j.r;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Keep
public class TransportRegistrar implements h {
    public static f lambda$getComponents$0(e eVar) {
        Set<T> set;
        m.b((Context) eVar.a(Context.class));
        m a = m.a();
        a aVar = a.e;
        Objects.requireNonNull(a);
        if (aVar instanceof d) {
            set = Collections.unmodifiableSet(aVar.c());
        } else {
            set = Collections.singleton(new b("proto"));
        }
        h.a a2 = i0.h.a.a.i.h.a();
        Objects.requireNonNull(aVar);
        a2.b("cct");
        b.C0125b bVar = (b.C0125b) a2;
        bVar.b = aVar.b();
        return new i(set, bVar.a(), a);
    }

    public List<i0.h.c.j.d<?>> getComponents() {
        d.b<f> a = i0.h.c.j.d.a(f.class);
        a.a(new r(Context.class, 1, 0));
        a.d(i0.h.c.k.a.a);
        return Collections.singletonList(a.c());
    }
}
