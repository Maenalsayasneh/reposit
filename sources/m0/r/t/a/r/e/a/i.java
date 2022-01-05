package m0.r.t.a.r.e.a;

import java.util.Arrays;
import java.util.Set;
import m0.r.t.a.r.e.a.w.g;
import m0.r.t.a.r.e.a.w.t;
import m0.r.t.a.r.g.b;

/* compiled from: JavaClassFinder.kt */
public interface i {

    /* compiled from: JavaClassFinder.kt */
    public static final class a {
        public final m0.r.t.a.r.g.a a;
        public final byte[] b;
        public final g c;

        public a(m0.r.t.a.r.g.a aVar, byte[] bArr, g gVar, int i) {
            int i2 = i & 2;
            gVar = (i & 4) != 0 ? null : gVar;
            m0.n.b.i.e(aVar, "classId");
            this.a = aVar;
            this.b = null;
            this.c = gVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m0.n.b.i.a(this.a, aVar.a) && m0.n.b.i.a(this.b, aVar.b) && m0.n.b.i.a(this.c, aVar.c);
        }

        public int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            byte[] bArr = this.b;
            int i = 0;
            int hashCode2 = (hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            g gVar = this.c;
            if (gVar != null) {
                i = gVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Request(classId=");
            P0.append(this.a);
            P0.append(", previouslyFoundClassFileContent=");
            P0.append(Arrays.toString(this.b));
            P0.append(", outerClass=");
            P0.append(this.c);
            P0.append(')');
            return P0.toString();
        }
    }

    g a(a aVar);

    t b(b bVar);

    Set<String> c(b bVar);
}
