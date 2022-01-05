package r0;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.io.OutputStream;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

/* compiled from: JvmOkio.kt */
public final class r implements w {
    public final OutputStream c;
    public final z d;

    public r(OutputStream outputStream, z zVar) {
        i.e(outputStream, "out");
        i.e(zVar, "timeout");
        this.c = outputStream;
        this.d = zVar;
    }

    public void S(f fVar, long j) {
        i.e(fVar, Stripe3ds2AuthParams.FIELD_SOURCE);
        a.A0(fVar.d, 0, j);
        while (j > 0) {
            this.d.f();
            u uVar = fVar.c;
            i.c(uVar);
            int min = (int) Math.min(j, (long) (uVar.c - uVar.b));
            this.c.write(uVar.a, uVar.b, min);
            int i = uVar.b + min;
            uVar.b = i;
            long j2 = (long) min;
            j -= j2;
            fVar.d -= j2;
            if (i == uVar.c) {
                fVar.c = uVar.a();
                v.a(uVar);
            }
        }
    }

    public void close() {
        this.c.close();
    }

    public z d() {
        return this.d;
    }

    public void flush() {
        this.c.flush();
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("sink(");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }
}
