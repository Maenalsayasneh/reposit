package i0.h.a.d.a.j;

import android.support.annotation.Nullable;
import com.google.android.play.core.tasks.RuntimeExecutionException;
import java.util.concurrent.Executor;

public final class p<ResultT> {
    public final Object a = new Object();
    public final l<ResultT> b = new l<>();
    public boolean c;
    public ResultT d;
    public Exception e;

    public final void a(ResultT resultt) {
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                this.d = resultt;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.b.b(this);
    }

    public final p<ResultT> b(a<ResultT> aVar) {
        this.b.a(new f(d.a, aVar));
        f();
        return this;
    }

    public final p<ResultT> c(Executor executor, b bVar) {
        this.b.a(new h(executor, bVar));
        f();
        return this;
    }

    public final p<ResultT> d(Executor executor, c<? super ResultT> cVar) {
        this.b.a(new j(executor, cVar));
        f();
        return this;
    }

    public final void e(Exception exc) {
        synchronized (this.a) {
            if (!this.c) {
                this.c = true;
                this.e = exc;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        this.b.b(this);
    }

    public final void f() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }

    @Nullable
    public final Exception g() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    public final ResultT h() {
        ResultT resultt;
        synchronized (this.a) {
            if (this.c) {
                Exception exc = this.e;
                if (exc == null) {
                    resultt = this.d;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw new IllegalStateException("Task is not yet complete");
            }
        }
        return resultt;
    }

    public final boolean i() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && this.e == null) {
                z = true;
            }
        }
        return z;
    }
}
