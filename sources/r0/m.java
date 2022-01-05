package r0;

import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.d.a.a.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import m0.n.b.i;

/* compiled from: GzipSource.kt */
public final class m implements y {
    public byte c;
    public final t d;
    public final Inflater q;
    public final n x;
    public final CRC32 y = new CRC32();

    public m(y yVar) {
        i.e(yVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        t tVar = new t(yVar);
        this.d = tVar;
        Inflater inflater = new Inflater(true);
        this.q = inflater;
        this.x = new n(tVar, inflater);
    }

    public final void a(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            i.d(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    public final void b(f fVar, long j, long j2) {
        u uVar = fVar.c;
        i.c(uVar);
        while (true) {
            int i = uVar.c;
            int i2 = uVar.b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            uVar = uVar.f;
            i.c(uVar);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) uVar.b) + j);
            int min = (int) Math.min((long) (uVar.c - i3), j2);
            this.y.update(uVar.a, i3, min);
            j2 -= (long) min;
            uVar = uVar.f;
            i.c(uVar);
            j = 0;
        }
    }

    public void close() throws IOException {
        this.x.close();
    }

    public z d() {
        return this.d.d();
    }

    public long q0(f fVar, long j) throws IOException {
        long j2;
        f fVar2 = fVar;
        long j3 = j;
        i.e(fVar2, "sink");
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        boolean z = false;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(a.k0("byteCount < 0: ", j3).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.c == 0) {
                this.d.z0(10);
                byte i2 = this.d.c.i(3);
                boolean z2 = ((i2 >> 1) & 1) == 1;
                if (z2) {
                    b(this.d.c, 0, 10);
                }
                t tVar = this.d;
                tVar.z0(2);
                a("ID1ID2", 8075, tVar.c.readShort());
                this.d.skip(8);
                if (((i2 >> 2) & 1) == 1) {
                    this.d.z0(2);
                    if (z2) {
                        b(this.d.c, 0, 2);
                    }
                    long q2 = (long) this.d.c.q();
                    this.d.z0(q2);
                    if (z2) {
                        j2 = q2;
                        b(this.d.c, 0, q2);
                    } else {
                        j2 = q2;
                    }
                    this.d.skip(j2);
                }
                if (((i2 >> 3) & 1) == 1) {
                    long a = this.d.a((byte) 0, 0, RecyclerView.FOREVER_NS);
                    if (a != -1) {
                        if (z2) {
                            b(this.d.c, 0, a + 1);
                        }
                        this.d.skip(a + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((i2 >> 4) & 1) == 1) {
                    z = true;
                }
                if (z) {
                    long a2 = this.d.a((byte) 0, 0, RecyclerView.FOREVER_NS);
                    if (a2 != -1) {
                        if (z2) {
                            b(this.d.c, 0, a2 + 1);
                        }
                        this.d.skip(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    t tVar2 = this.d;
                    tVar2.z0(2);
                    a("FHCRC", tVar2.c.q(), (short) ((int) this.y.getValue()));
                    this.y.reset();
                }
                this.c = 1;
            }
            if (this.c == 1) {
                long j4 = fVar2.d;
                long q02 = this.x.q0(fVar2, j3);
                if (q02 != -1) {
                    b(fVar, j4, q02);
                    return q02;
                }
                this.c = 2;
            }
            if (this.c == 2) {
                a("CRC", this.d.e(), (int) this.y.getValue());
                a("ISIZE", this.d.e(), (int) this.q.getBytesWritten());
                this.c = 3;
                if (!this.d.t()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }
}
