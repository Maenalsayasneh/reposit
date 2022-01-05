package i0.h.a.d.a.j;

import android.support.annotation.Nullable;
import java.util.concurrent.Executor;

public final class j<ResultT> implements k<ResultT> {
    public final Executor a;
    public final Object b = new Object();
    @Nullable
    public final c<? super ResultT> c;

    public j(Executor executor, c<? super ResultT> cVar) {
        this.a = executor;
        this.c = cVar;
    }

    public final void a(p<ResultT> pVar) {
        if (pVar.i()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new i(this, pVar));
                }
            }
        }
    }
}
