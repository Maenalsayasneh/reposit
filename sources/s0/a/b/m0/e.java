package s0.a.b.m0;

import s0.a.b.h0.g;
import s0.a.b.m0.f.c;
import s0.a.b.n;
import s0.a.b.s;

public class e {

    public static class a implements b {
        public final s a;
        public final byte[] b;
        public final byte[] c;

        public a(s sVar, byte[] bArr, byte[] bArr2, int i) {
            this.a = sVar;
            this.b = bArr;
            this.c = bArr2;
        }

        public c a(c cVar) {
            return new s0.a.b.m0.f.a(this.a, 256, cVar, this.c, this.b);
        }

        public String getAlgorithm() {
            String str;
            StringBuilder sb;
            if (this.a instanceof g) {
                sb = i0.d.a.a.a.P0("HMAC-DRBG-");
                str = e.a(((g) this.a).b);
            } else {
                sb = i0.d.a.a.a.P0("HMAC-DRBG-");
                str = this.a.getAlgorithmName();
            }
            sb.append(str);
            return sb.toString();
        }
    }

    public static class b implements b {
        public final n a;
        public final byte[] b;
        public final byte[] c;

        public b(n nVar, byte[] bArr, byte[] bArr2, int i) {
            this.a = nVar;
            this.b = bArr;
            this.c = bArr2;
        }

        public c a(c cVar) {
            return new s0.a.b.m0.f.b(this.a, 256, cVar, this.c, this.b);
        }

        public String getAlgorithm() {
            StringBuilder P0 = i0.d.a.a.a.P0("HASH-DRBG-");
            P0.append(e.a(this.a));
            return P0.toString();
        }
    }

    public static String a(n nVar) {
        String algorithmName = nVar.getAlgorithmName();
        int indexOf = algorithmName.indexOf(45);
        if (indexOf <= 0 || algorithmName.startsWith("SHA3")) {
            return algorithmName;
        }
        return algorithmName.substring(0, indexOf) + algorithmName.substring(indexOf + 1);
    }
}
