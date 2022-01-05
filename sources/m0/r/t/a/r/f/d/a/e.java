package m0.r.t.a.r.f.d.a;

import m0.n.b.f;
import m0.n.b.i;

/* compiled from: JvmMemberSignature.kt */
public abstract class e {

    /* compiled from: JvmMemberSignature.kt */
    public static final class a extends e {
        public final String a;
        public final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super((f) null);
            i.e(str, "name");
            i.e(str2, "desc");
            this.a = str;
            this.b = str2;
        }

        public String a() {
            return this.a + ':' + this.b;
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return i.a(this.a, aVar.a) && i.a(this.b, aVar.b);
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    /* compiled from: JvmMemberSignature.kt */
    public static final class b extends e {
        public final String a;
        public final String b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super((f) null);
            i.e(str, "name");
            i.e(str2, "desc");
            this.a = str;
            this.b = str2;
        }

        public String a() {
            return i.k(this.a, this.b);
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return i.a(this.a, bVar.a) && i.a(this.b, bVar.b);
        }

        public int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    public e(f fVar) {
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }
}
