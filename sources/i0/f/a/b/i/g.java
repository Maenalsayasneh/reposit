package i0.f.a.b.i;

import i0.f.a.b.m.a;
import i0.f.a.b.m.i;
import java.io.IOException;
import java.io.Writer;

/* compiled from: SegmentedStringWriter */
public final class g extends Writer {
    public final i c;

    public g(a aVar) {
        this.c = new i(aVar);
    }

    public void close() {
    }

    public void flush() {
    }

    public void write(char[] cArr) {
        this.c.b(cArr, 0, cArr.length);
    }

    public void write(char[] cArr, int i, int i2) {
        this.c.b(cArr, i, i2);
    }

    public Writer append(char c2) {
        write((int) c2);
        return this;
    }

    public void write(int i) {
        i iVar = this.c;
        char c2 = (char) i;
        if (iVar.d >= 0) {
            iVar.u(16);
        }
        iVar.k = null;
        iVar.l = null;
        char[] cArr = iVar.i;
        if (iVar.j >= cArr.length) {
            iVar.j();
            cArr = iVar.i;
        }
        int i2 = iVar.j;
        iVar.j = i2 + 1;
        cArr[i2] = c2;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m18append(char c2) throws IOException {
        write((int) c2);
        return this;
    }

    public Writer append(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        this.c.a(charSequence2, 0, charSequence2.length());
        return this;
    }

    public Writer append(CharSequence charSequence, int i, int i2) {
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        this.c.a(charSequence2, 0, charSequence2.length());
        return this;
    }

    public void write(String str) {
        this.c.a(str, 0, str.length());
    }

    public void write(String str, int i, int i2) {
        this.c.a(str, i, i2);
    }
}
