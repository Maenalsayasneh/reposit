package h0.r.b;

import android.content.Context;
import java.util.Objects;

/* compiled from: Loader */
public class b<D> {
    public int a;
    public a<D> b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = true;
    public boolean f = false;

    /* compiled from: Loader */
    public interface a<D> {
    }

    public b(Context context) {
        context.getApplicationContext();
    }

    public boolean a() {
        a aVar = (a) this;
        boolean z = false;
        if (aVar.h != null) {
            if (!aVar.c) {
                aVar.f = true;
            }
            if (aVar.i != null) {
                Objects.requireNonNull(aVar.h);
                aVar.h = null;
            } else {
                Objects.requireNonNull(aVar.h);
                a<D>.defpackage.a aVar2 = aVar.h;
                aVar2.a2.set(true);
                z = aVar2.Y1.cancel(false);
                if (z) {
                    aVar.i = aVar.h;
                }
                aVar.h = null;
            }
        }
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        g0.a.b.b.a.f(this, sb);
        sb.append(" id=");
        return i0.d.a.a.a.u0(sb, this.a, "}");
    }
}
