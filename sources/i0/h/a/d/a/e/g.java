package i0.h.a.d.a.e;

import android.support.annotation.Nullable;
import i0.h.a.d.a.j.m;

public abstract class g implements Runnable {
    @Nullable
    public final m<?> c;

    public g() {
        this.c = null;
    }

    public g(@Nullable m<?> mVar) {
        this.c = mVar;
    }

    public abstract void a();

    public final void run() {
        try {
            a();
        } catch (Exception e) {
            m<?> mVar = this.c;
            if (mVar != null) {
                mVar.a(e);
            }
        }
    }
}
