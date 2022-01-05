package i0.h.a.d.a.j;

import android.support.annotation.Nullable;
import java.util.concurrent.Executor;

public final class h<ResultT> implements k<ResultT> {
    public final Executor a;
    public final Object b = new Object();
    @Nullable
    public final b c;

    public h(Executor executor, b bVar) {
        this.a = executor;
        this.c = bVar;
    }

    public final void a(p<ResultT> pVar) {
        if (!pVar.i()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new g(this, pVar));
                }
            }
        }
    }
}
