package s0.a.a.c2;

import java.io.IOException;
import s0.a.a.b1;
import s0.a.a.e;
import s0.a.a.f;
import s0.a.a.m;
import s0.a.a.r;
import s0.a.a.s;

public class g extends m {
    public final e c;
    public final i d;

    public g(b bVar, i iVar) {
        this.c = bVar;
        this.d = iVar;
    }

    public g(s sVar) {
        i iVar;
        i iVar2;
        if (sVar.size() == 2) {
            e D = sVar.D(0);
            if (!(D instanceof b) && !(D instanceof h)) {
                s B = s.B(D);
                D = B.size() == 2 ? B instanceof b ? (b) B : new b(s.B(B)) : h.s(B);
            }
            this.c = D;
            e D2 = sVar.D(1);
            if (D2 instanceof i) {
                iVar = (i) D2;
            } else {
                if (D2 instanceof byte[]) {
                    try {
                        iVar2 = new i(r.x((byte[]) D2));
                    } catch (IOException unused) {
                        throw new IllegalArgumentException("Unable to parse integrity check details.");
                    }
                } else if (D2 != null) {
                    iVar2 = new i(D2);
                } else {
                    iVar = null;
                }
                iVar = iVar2;
            }
            this.d = iVar;
            return;
        }
        throw new IllegalArgumentException("malformed sequence");
    }

    public r c() {
        f fVar = new f(2);
        fVar.a(this.c);
        fVar.a(this.d);
        return new b1(fVar);
    }
}
