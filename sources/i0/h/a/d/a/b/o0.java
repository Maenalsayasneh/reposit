package i0.h.a.d.a.b;

import com.google.android.play.core.assetpacks.bv;
import i0.h.a.d.a.e.a0;
import i0.h.a.d.a.e.f;
import java.util.concurrent.atomic.AtomicBoolean;

public final class o0 {
    public static final f a = new f("ExtractorLooper");
    public final f1 b;
    public final m0 c;
    public final k2 d;
    public final t1 e;
    public final y1 f;
    public final d2 g;
    public final a0<e3> h;
    public final i1 i;
    public final AtomicBoolean j = new AtomicBoolean(false);

    public o0(f1 f1Var, a0<e3> a0Var, m0 m0Var, k2 k2Var, t1 t1Var, y1 y1Var, d2 d2Var, i1 i1Var) {
        this.b = f1Var;
        this.h = a0Var;
        this.c = m0Var;
        this.d = k2Var;
        this.e = t1Var;
        this.f = y1Var;
        this.g = d2Var;
        this.i = i1Var;
    }

    public final void a(int i2, Exception exc) {
        try {
            f1 f1Var = this.b;
            f1Var.a(new y0(f1Var, i2));
            f1 f1Var2 = this.b;
            f1Var2.a(new z0(f1Var2, i2));
        } catch (bv unused) {
            a.b(6, "Error during error handling: %s", new Object[]{exc.getMessage()});
        }
    }
}
