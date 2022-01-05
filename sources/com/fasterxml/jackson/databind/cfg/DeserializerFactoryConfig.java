package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers;
import i0.f.a.c.a;
import i0.f.a.c.l.b;
import i0.f.a.c.l.g;
import i0.f.a.c.l.h;
import i0.f.a.c.l.l;
import i0.f.a.c.t.c;
import java.io.Serializable;

public class DeserializerFactoryConfig implements Serializable {
    public static final g[] c = new g[0];
    public static final b[] d = new b[0];
    public static final a[] q = new a[0];
    public static final l[] x = new l[0];
    public static final h[] y = {new StdKeyDeserializers()};
    public final g[] Y1 = c;
    public final h[] Z1 = y;
    public final b[] a2 = d;
    public final a[] b2 = q;
    public final l[] c2 = x;

    public Iterable<b> a() {
        return new c(this.a2);
    }

    public Iterable<g> b() {
        return new c(this.Y1);
    }

    public boolean c() {
        return this.a2.length > 0;
    }
}
