package n0.c.k;

import kotlinx.serialization.KSerializer;
import m0.n.b.b;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.j.c;
import n0.c.j.d;

/* compiled from: PrimitiveArraysSerializers.kt */
public final class j extends y0<Byte, byte[], i> implements KSerializer<byte[]> {
    public static final j c = new j();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j() {
        super(k.b);
        a.o3(b.a);
    }

    public int e(Object obj) {
        byte[] bArr = (byte[]) obj;
        i.e(bArr, "$this$collectionSize");
        return bArr.length;
    }

    public void h(c cVar, int i, Object obj, boolean z) {
        i iVar = (i) obj;
        i.e(cVar, "decoder");
        i.e(iVar, "builder");
        byte q = cVar.q(this.b, i);
        w0.c(iVar, 0, 1, (Object) null);
        byte[] bArr = iVar.a;
        int i2 = iVar.b;
        iVar.b = i2 + 1;
        bArr[i2] = q;
    }

    public Object i(Object obj) {
        byte[] bArr = (byte[]) obj;
        i.e(bArr, "$this$toBuilder");
        return new i(bArr);
    }

    public Object l() {
        return new byte[0];
    }

    public void m(d dVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        i.e(dVar, "encoder");
        i.e(bArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.g(this.b, i2, bArr[i2]);
        }
    }
}
