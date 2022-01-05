package m0.r.t.a.r.h;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import m0.r.t.a.r.h.l;

/* compiled from: AbstractMessageLite */
public abstract class a implements l {

    /* renamed from: m0.r.t.a.r.h.a$a  reason: collision with other inner class name */
    /* compiled from: AbstractMessageLite */
    public static abstract class C0267a<BuilderType extends C0267a> implements l.a {
        /* renamed from: h */
        public abstract BuilderType k(d dVar, e eVar) throws IOException;

        /* renamed from: m0.r.t.a.r.h.a$a$a  reason: collision with other inner class name */
        /* compiled from: AbstractMessageLite */
        public static final class C0268a extends FilterInputStream {
            public int c;

            public C0268a(InputStream inputStream, int i) {
                super(inputStream);
                this.c = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.c);
            }

            public int read() throws IOException {
                if (this.c <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.c--;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.c));
                if (skip >= 0) {
                    this.c = (int) (((long) this.c) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.c;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.c -= read;
                }
                return read;
            }
        }
    }
}
