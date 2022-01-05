package s0.a.e.b;

import s0.a.e.b.h;

public final class x implements n {
    public final /* synthetic */ h.b a;
    public final /* synthetic */ byte b;

    public x(h.b bVar, byte b2) {
        this.a = bVar;
        this.b = b2;
    }

    public o a(o oVar) {
        if (oVar instanceof z) {
            return oVar;
        }
        z zVar = new z();
        h.b bVar = this.a;
        byte[][] bArr = this.b == 0 ? r.e : r.g;
        h.b[] bVarArr = new h.b[((bArr.length + 1) >>> 1)];
        bVarArr[0] = bVar;
        int length = bArr.length;
        for (int i = 3; i < length; i += 2) {
            int i2 = i >>> 1;
            byte[] bArr2 = bArr[i];
            h.b bVar2 = (h.b) bVar.b.m();
            h.b bVar3 = (h.b) bVar.p();
            int i3 = 0;
            for (int length2 = bArr2.length - 1; length2 >= 0; length2--) {
                i3++;
                byte b2 = bArr2[length2];
                if (b2 != 0) {
                    bVar2 = (h.b) bVar2.B(i3).a(b2 > 0 ? bVar : bVar3);
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                bVar2 = bVar2.B(i3);
            }
            bVarArr[i2] = bVar2;
        }
        bVar.b.p(bVarArr);
        zVar.a = bVarArr;
        return zVar;
    }
}
