package i0.h.a.d.a.b;

import android.os.Handler;
import android.os.Looper;
import i0.h.a.d.a.c.b;
import i0.h.a.d.a.e.a0;
import i0.h.a.d.a.e.f;
import i0.h.a.d.a.i.a;
import java.util.concurrent.Executor;

public final class q2 {
    public static final f a = new f("AssetPackManager");
    public final y b;
    public final a0<e3> c;
    public final s d;
    public final a0<Executor> e;

    public q2(y yVar, a0<e3> a0Var, s sVar, a aVar, f1 f1Var, r0 r0Var, h0 h0Var, a0<Executor> a0Var2, b bVar) {
        new Handler(Looper.getMainLooper());
        this.b = yVar;
        this.c = a0Var;
        this.d = sVar;
        this.e = a0Var2;
    }

    public final void a(boolean z) {
        boolean z2;
        s sVar = this.d;
        synchronized (sVar) {
            z2 = sVar.e != null;
        }
        s sVar2 = this.d;
        synchronized (sVar2) {
            sVar2.f = z;
            sVar2.b();
        }
        if (z && !z2) {
            this.e.a().execute(new n2(this));
        }
    }
}
