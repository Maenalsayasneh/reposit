package q0;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import m0.n.b.f;
import m0.n.b.i;
import q0.h0.c;
import q0.y;
import r0.h;

/* compiled from: RequestBody.kt */
public abstract class d0 {
    public static final a a = new a((f) null);

    /* compiled from: RequestBody.kt */
    public static final class a {

        /* renamed from: q0.d0$a$a  reason: collision with other inner class name */
        /* compiled from: RequestBody.kt */
        public static final class C0285a extends d0 {
            public final /* synthetic */ byte[] b;
            public final /* synthetic */ y c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;

            public C0285a(byte[] bArr, y yVar, int i, int i2) {
                this.b = bArr;
                this.c = yVar;
                this.d = i;
                this.e = i2;
            }

            public long a() {
                return (long) this.d;
            }

            public y b() {
                return this.c;
            }

            public void d(h hVar) {
                i.e(hVar, "sink");
                hVar.R(this.b, this.e, this.d);
            }
        }

        public a(f fVar) {
        }

        public final d0 a(String str, y yVar) {
            i.e(str, "$this$toRequestBody");
            Charset charset = m0.t.a.a;
            if (yVar != null) {
                Pattern pattern = y.a;
                Charset a = yVar.a((Charset) null);
                if (a == null) {
                    y.a aVar = y.c;
                    yVar = y.a.b(yVar + "; charset=utf-8");
                } else {
                    charset = a;
                }
            }
            byte[] bytes = str.getBytes(charset);
            i.d(bytes, "(this as java.lang.String).getBytes(charset)");
            return b(bytes, yVar, 0, bytes.length);
        }

        public final d0 b(byte[] bArr, y yVar, int i, int i2) {
            i.e(bArr, "$this$toRequestBody");
            c.c((long) bArr.length, (long) i, (long) i2);
            return new C0285a(bArr, yVar, i2, i);
        }
    }

    public static final d0 c(y yVar, byte[] bArr) {
        a aVar = a;
        int length = bArr.length;
        i.e(bArr, "content");
        return aVar.b(bArr, yVar, 0, length);
    }

    public long a() throws IOException {
        return -1;
    }

    public abstract y b();

    public abstract void d(h hVar) throws IOException;
}
