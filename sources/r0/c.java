package r0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.IOException;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

/* compiled from: AsyncTimeout.kt */
public final class c implements w {
    public final /* synthetic */ b c;
    public final /* synthetic */ w d;

    public c(b bVar, w wVar) {
        this.c = bVar;
        this.d = wVar;
    }

    public void S(f fVar, long j) {
        i.e(fVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        a.A0(fVar.d, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                u uVar = fVar.c;
                i.c(uVar);
                while (true) {
                    if (j2 >= ((long) 65536)) {
                        break;
                    }
                    j2 += (long) (uVar.c - uVar.b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        uVar = uVar.f;
                        i.c(uVar);
                    }
                }
                b bVar = this.c;
                bVar.h();
                try {
                    this.d.S(fVar, j2);
                    if (!bVar.i()) {
                        j -= j2;
                    } else {
                        throw bVar.j((IOException) null);
                    }
                } catch (IOException e) {
                    e = e;
                    if (bVar.i()) {
                        e = bVar.j(e);
                    }
                    throw e;
                } finally {
                    boolean i = bVar.i();
                }
            } else {
                return;
            }
        }
    }

    public void close() {
        b bVar = this.c;
        bVar.h();
        try {
            this.d.close();
            if (bVar.i()) {
                throw bVar.j((IOException) null);
            }
        } catch (IOException e) {
            e = e;
            if (bVar.i()) {
                e = bVar.j(e);
            }
            throw e;
        } finally {
            boolean i = bVar.i();
        }
    }

    public z d() {
        return this.c;
    }

    public void flush() {
        b bVar = this.c;
        bVar.h();
        try {
            this.d.flush();
            if (bVar.i()) {
                throw bVar.j((IOException) null);
            }
        } catch (IOException e) {
            e = e;
            if (bVar.i()) {
                e = bVar.j(e);
            }
            throw e;
        } finally {
            boolean i = bVar.i();
        }
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("AsyncTimeout.sink(");
        P0.append(this.d);
        P0.append(')');
        return P0.toString();
    }
}
