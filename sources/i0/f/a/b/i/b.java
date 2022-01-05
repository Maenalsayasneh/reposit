package i0.f.a.b.i;

import com.fasterxml.jackson.core.JsonEncoding;
import i0.f.a.b.m.a;

/* compiled from: IOContext */
public class b {
    public final Object a;
    public JsonEncoding b;
    public final boolean c;
    public final a d;
    public byte[] e;
    public byte[] f;
    public char[] g;
    public char[] h;
    public char[] i;

    public b(a aVar, Object obj, boolean z) {
        this.d = aVar;
        this.a = obj;
        this.c = z;
    }

    public final void a(Object obj) {
        if (obj != null) {
            throw new IllegalStateException("Trying to call same allocXxx() method second time");
        }
    }

    public final void b(byte[] bArr, byte[] bArr2) {
        if (bArr != bArr2 && bArr.length < bArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
    }

    public final void c(char[] cArr, char[] cArr2) {
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
    }

    public byte[] d() {
        a(this.f);
        byte[] a2 = this.d.a(3);
        this.f = a2;
        return a2;
    }

    public void e(byte[] bArr) {
        b(bArr, this.f);
        this.f = null;
        this.d.c.set(3, bArr);
    }

    public void f(char[] cArr) {
        c(cArr, this.i);
        this.i = null;
        this.d.d.set(3, cArr);
    }

    public void g(byte[] bArr) {
        b(bArr, this.e);
        this.e = null;
        this.d.c.set(0, bArr);
    }
}
