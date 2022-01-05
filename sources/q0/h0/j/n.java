package q0.h0.j;

import i0.d.a.a.a;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import m0.n.b.i;
import okhttp3.internal.http2.ErrorCode;
import q0.h0.c;
import q0.h0.j.b;
import r0.f;
import r0.h;

/* compiled from: Http2Writer.kt */
public final class n implements Closeable {
    public static final Logger c = Logger.getLogger(c.class.getName());
    public final h Y1;
    public final boolean Z1;
    public final f d;
    public int q = 16384;
    public boolean x;
    public final b.C0289b y;

    public n(h hVar, boolean z) {
        i.e(hVar, "sink");
        this.Y1 = hVar;
        this.Z1 = z;
        f fVar = new f();
        this.d = fVar;
        this.y = new b.C0289b(0, false, fVar, 3);
    }

    public final synchronized void a(r rVar) throws IOException {
        i.e(rVar, "peerSettings");
        if (!this.x) {
            int i = this.q;
            int i2 = rVar.a;
            if ((i2 & 32) != 0) {
                i = rVar.b[5];
            }
            this.q = i;
            int i3 = i2 & 2;
            int i4 = -1;
            if ((i3 != 0 ? rVar.b[1] : -1) != -1) {
                b.C0289b bVar = this.y;
                if (i3 != 0) {
                    i4 = rVar.b[1];
                }
                bVar.h = i4;
                int min = Math.min(i4, 16384);
                int i5 = bVar.c;
                if (i5 != min) {
                    if (min < i5) {
                        bVar.a = Math.min(bVar.a, min);
                    }
                    bVar.b = true;
                    bVar.c = min;
                    int i6 = bVar.g;
                    if (min < i6) {
                        if (min == 0) {
                            bVar.a();
                        } else {
                            bVar.b(i6 - min);
                        }
                    }
                }
            }
            e(0, 0, 4, 1);
            this.Y1.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void b(boolean z, int i, f fVar, int i2) throws IOException {
        if (!this.x) {
            e(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                h hVar = this.Y1;
                i.c(fVar);
                hVar.S(fVar, (long) i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() throws IOException {
        this.x = true;
        this.Y1.close();
    }

    public final void e(int i, int i2, int i3, int i4) throws IOException {
        Logger logger = c;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(c.e.b(false, i, i2, i3, i4));
        }
        boolean z = true;
        if (i2 <= this.q) {
            if ((((int) 2147483648L) & i) != 0) {
                z = false;
            }
            if (z) {
                h hVar = this.Y1;
                byte[] bArr = c.a;
                i.e(hVar, "$this$writeMedium");
                hVar.u((i2 >>> 16) & 255);
                hVar.u((i2 >>> 8) & 255);
                hVar.u(i2 & 255);
                this.Y1.u(i3 & 255);
                this.Y1.u(i4 & 255);
                this.Y1.o(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(a.e0("reserved bit set: ", i).toString());
        }
        StringBuilder P0 = a.P0("FRAME_SIZE_ERROR length > ");
        P0.append(this.q);
        P0.append(": ");
        P0.append(i2);
        throw new IllegalArgumentException(P0.toString().toString());
    }

    public final synchronized void f(int i, ErrorCode errorCode, byte[] bArr) throws IOException {
        i.e(errorCode, "errorCode");
        i.e(bArr, "debugData");
        if (!this.x) {
            boolean z = false;
            if (errorCode.getHttpCode() != -1) {
                e(0, bArr.length + 8, 7, 0);
                this.Y1.o(i);
                this.Y1.o(errorCode.getHttpCode());
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.Y1.k0(bArr);
                }
                this.Y1.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void flush() throws IOException {
        if (!this.x) {
            this.Y1.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void i(boolean z, int i, List<a> list) throws IOException {
        i.e(list, "headerBlock");
        if (!this.x) {
            this.y.e(list);
            long j = this.d.d;
            long min = Math.min((long) this.q, j);
            int i2 = (j > min ? 1 : (j == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            e(i, (int) min, 1, i3);
            this.Y1.S(this.d, min);
            if (i2 > 0) {
                q(i, j - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void k(boolean z, int i, int i2) throws IOException {
        if (!this.x) {
            e(0, 8, 6, z ? 1 : 0);
            this.Y1.o(i);
            this.Y1.o(i2);
            this.Y1.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void l(int i, ErrorCode errorCode) throws IOException {
        i.e(errorCode, "errorCode");
        if (!this.x) {
            if (errorCode.getHttpCode() != -1) {
                e(i, 4, 3, 0);
                this.Y1.o(errorCode.getHttpCode());
                this.Y1.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void n(int i, long j) throws IOException {
        if (!this.x) {
            if (j != 0 && j <= 2147483647L) {
                e(i, 4, 8, 0);
                this.Y1.o((int) j);
                this.Y1.flush();
            } else {
                throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void q(int i, long j) throws IOException {
        while (j > 0) {
            long min = Math.min((long) this.q, j);
            j -= min;
            e(i, (int) min, 9, j == 0 ? 4 : 0);
            this.Y1.S(this.d, min);
        }
    }
}
