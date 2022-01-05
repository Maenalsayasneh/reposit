package m0.r.t.a.r.f.c;

import kotlin.DeprecationLevel;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement;
import m0.n.b.i;

/* compiled from: VersionRequirement.kt */
public final class f {
    public final a a;
    public final ProtoBuf$VersionRequirement.VersionKind b;
    public final DeprecationLevel c;
    public final Integer d;
    public final String e;

    /* compiled from: VersionRequirement.kt */
    public static final class a {
        public static final C0266a a = new C0266a((m0.n.b.f) null);
        public static final a b = new a(256, 256, 256);
        public final int c;
        public final int d;
        public final int e;

        /* renamed from: m0.r.t.a.r.f.c.f$a$a  reason: collision with other inner class name */
        /* compiled from: VersionRequirement.kt */
        public static final class C0266a {
            public C0266a(m0.n.b.f fVar) {
            }
        }

        public a(int i, int i2, int i3) {
            this.c = i;
            this.d = i2;
            this.e = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public int hashCode() {
            return (((this.c * 31) + this.d) * 31) + this.e;
        }

        public String toString() {
            int i;
            StringBuilder sb;
            if (this.e == 0) {
                sb = new StringBuilder();
                sb.append(this.c);
                sb.append('.');
                i = this.d;
            } else {
                sb = new StringBuilder();
                sb.append(this.c);
                sb.append('.');
                sb.append(this.d);
                sb.append('.');
                i = this.e;
            }
            sb.append(i);
            return sb.toString();
        }

        public a(int i, int i2, int i3, int i4) {
            i3 = (i4 & 4) != 0 ? 0 : i3;
            this.c = i;
            this.d = i2;
            this.e = i3;
        }
    }

    public f(a aVar, ProtoBuf$VersionRequirement.VersionKind versionKind, DeprecationLevel deprecationLevel, Integer num, String str) {
        i.e(aVar, "version");
        i.e(versionKind, "kind");
        i.e(deprecationLevel, "level");
        this.a = aVar;
        this.b = versionKind;
        this.c = deprecationLevel;
        this.d = num;
        this.e = str;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("since ");
        P0.append(this.a);
        P0.append(' ');
        P0.append(this.c);
        Integer num = this.d;
        String str = "";
        P0.append(num != null ? i.k(" error ", num) : str);
        String str2 = this.e;
        if (str2 != null) {
            str = i.k(": ", str2);
        }
        P0.append(str);
        return P0.toString();
    }
}
