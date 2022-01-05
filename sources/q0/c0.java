package q0;

import m0.n.b.i;
import okio.ByteString;
import r0.h;

/* compiled from: RequestBody.kt */
public final class c0 extends d0 {
    public final /* synthetic */ ByteString b;
    public final /* synthetic */ y c;

    public c0(ByteString byteString, y yVar) {
        this.b = byteString;
        this.c = yVar;
    }

    public long a() {
        return (long) this.b.e();
    }

    public y b() {
        return this.c;
    }

    public void d(h hVar) {
        i.e(hVar, "sink");
        hVar.l0(this.b);
    }
}
