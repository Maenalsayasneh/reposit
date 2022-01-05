package h0.g0;

import androidx.work.NetworkType;

/* compiled from: Constraints */
public final class b {
    public static final b a = new a().a();
    public NetworkType b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public c i;

    /* compiled from: Constraints */
    public static final class a {
        public NetworkType a = NetworkType.NOT_REQUIRED;
        public long b = -1;
        public long c = -1;
        public c d = new c();

        public b a() {
            return new b(this);
        }
    }

    public b() {
        this.b = NetworkType.NOT_REQUIRED;
        this.g = -1;
        this.h = -1;
        this.i = new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.b == bVar.b) {
            return this.i.equals(bVar.i);
        }
        return false;
    }

    public int hashCode() {
        long j = this.g;
        long j2 = this.h;
        return this.i.hashCode() + (((((((((((((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public b(a aVar) {
        this.b = NetworkType.NOT_REQUIRED;
        this.g = -1;
        this.h = -1;
        this.i = new c();
        this.c = false;
        this.d = false;
        this.b = aVar.a;
        this.e = false;
        this.f = false;
        this.i = aVar.d;
        this.g = aVar.b;
        this.h = aVar.c;
    }

    public b(b bVar) {
        this.b = NetworkType.NOT_REQUIRED;
        this.g = -1;
        this.h = -1;
        this.i = new c();
        this.c = bVar.c;
        this.d = bVar.d;
        this.b = bVar.b;
        this.e = bVar.e;
        this.f = bVar.f;
        this.i = bVar.i;
    }
}
