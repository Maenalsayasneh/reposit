package i0.b.c;

import i0.b.c.b;
import i0.b.c.d;
import i0.b.c.g.c;
import i0.b.c.g.e;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: StyleBuilder.kt */
public abstract class d<B extends d<? extends B, ? extends A>, A extends b<?, ?>> {
    public c.a a;
    public ArrayList<e> b;
    public final A c;
    public String d;

    public d() {
        this((b) null, (String) null, 3);
    }

    public d(b bVar, String str, int i) {
        int i2 = i & 1;
        String str2 = (i & 2) != 0 ? "a programmatic style" : null;
        i.e(str2, "name");
        this.c = null;
        this.d = str2;
        this.a = new c.a((Map) null, (String) null, 3);
        this.b = new ArrayList<>();
    }

    public final B a(int i) {
        i0.b.c.g.d dVar = new i0.b.c.g.d(i, (String) null, 2);
        i.e(dVar, "style");
        c();
        this.b.add(dVar);
        return this;
    }

    public final e b() {
        if (this.b.size() == 0) {
            c.a d2 = d();
            String str = this.d;
            Objects.requireNonNull(d2);
            i.e(str, "name");
            d2.b = str;
        }
        c();
        return i0.b.c.g.b.d(this.d, this.b);
    }

    public void c() {
        if (!d().a.isEmpty()) {
            ArrayList<e> arrayList = this.b;
            c.a d2 = d();
            Objects.requireNonNull(d2);
            arrayList.add(new c(d2));
            e(new c.a((Map) null, (String) null, 3));
        }
    }

    public c.a d() {
        return this.a;
    }

    public void e(c.a aVar) {
        i.e(aVar, "<set-?>");
        this.a = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!i.a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.airbnb.paris.StyleBuilder<*, *>");
        d dVar = (d) obj;
        return !(i.a(this.d, dVar.d) ^ true) && !(i.a(this.c, dVar.c) ^ true) && !(i.a(d(), dVar.d()) ^ true) && !(i.a(this.b, dVar.b) ^ true);
    }

    public int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        A a2 = this.c;
        int hashCode2 = a2 != null ? a2.hashCode() : 0;
        return this.b.hashCode() + ((d().hashCode() + ((hashCode + hashCode2) * 31)) * 31);
    }
}
