package i0.h.a.d.a.j;

import android.support.annotation.Nullable;
import java.util.concurrent.Executor;

public final class f<ResultT> implements k<ResultT> {
    public final Executor a;
    public final Object b = new Object();
    @Nullable
    public final a<ResultT> c;

    public f(Executor executor, a<ResultT> aVar) {
        this.a = executor;
        this.c = aVar;
    }

    public final void a(p<ResultT> pVar) {
        synchronized (this.b) {
            if (this.c != null) {
                this.a.execute(new e(this, pVar));
            }
        }
    }
}
