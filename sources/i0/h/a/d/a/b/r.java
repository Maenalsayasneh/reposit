package i0.h.a.d.a.b;

import android.os.Bundle;
import com.google.android.play.core.assetpacks.bv;
import i0.h.a.d.a.e.f;
import java.util.Objects;

public final /* synthetic */ class r implements Runnable {
    public final s c;
    public final Bundle d;

    public r(s sVar, Bundle bundle) {
        this.c = sVar;
        this.d = bundle;
    }

    public final void run() {
        s sVar = this.c;
        Bundle bundle = this.d;
        f1 f1Var = sVar.g;
        if (((Boolean) f1Var.a(new u0(f1Var, bundle))).booleanValue()) {
            o0 o0Var = sVar.h;
            Objects.requireNonNull(o0Var);
            f fVar = o0.a;
            fVar.b(3, "Run extractor loop", new Object[0]);
            if (o0Var.j.compareAndSet(false, true)) {
                while (true) {
                    h1 h1Var = null;
                    try {
                        h1Var = o0Var.i.a();
                    } catch (bv e) {
                        o0.a.b(6, "Error while getting next extraction task: %s", new Object[]{e.getMessage()});
                        if (e.c >= 0) {
                            o0Var.h.a().j(e.c);
                            o0Var.a(e.c, e);
                        }
                    }
                    if (h1Var != null) {
                        try {
                            if (h1Var instanceof l0) {
                                o0Var.c.a((l0) h1Var);
                            } else if (h1Var instanceof j2) {
                                o0Var.d.a((j2) h1Var);
                            } else if (h1Var instanceof s1) {
                                o0Var.e.a((s1) h1Var);
                            } else if (h1Var instanceof v1) {
                                o0Var.f.a((v1) h1Var);
                            } else if (h1Var instanceof c2) {
                                o0Var.g.a((c2) h1Var);
                            } else {
                                o0.a.b(6, "Unknown task type: %s", new Object[]{h1Var.getClass().getName()});
                            }
                        } catch (Exception e2) {
                            o0.a.b(6, "Error during extraction task: %s", new Object[]{e2.getMessage()});
                            o0Var.h.a().j(h1Var.a);
                            o0Var.a(h1Var.a, e2);
                        }
                    } else {
                        o0Var.j.set(false);
                        return;
                    }
                }
            } else {
                fVar.b(5, "runLoop already looping; return", new Object[0]);
            }
        }
    }
}
