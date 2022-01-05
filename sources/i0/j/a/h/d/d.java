package i0.j.a.h.d;

import com.instabug.library.internal.utils.stability.execution.Executable;
import com.instabug.library.internal.utils.stability.handler.exception.ExceptionHandler;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.a.d.a.d.c;
import i0.j.a.d.a.d.e;
import i0.j.a.e.b;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: SessionHandlerImpl */
public class d implements c {
    public final b a;
    public final i0.j.a.d.a.d.a b;
    public final ExceptionHandler c;
    public final i0.j.a.n.a.a d;
    public Runnable e;
    public i0.j.a.d.b.d f;
    public final Executor g = i0.j.a.g.a.f("session_thread_executor");

    /* compiled from: SessionHandlerImpl */
    public class a implements Executable {
        public final /* synthetic */ int a;

        /* renamed from: i0.j.a.h.d.d$a$a  reason: collision with other inner class name */
        /* compiled from: SessionHandlerImpl */
        public class C0153a implements Runnable {
            public final /* synthetic */ i0.j.a.d.b.d c;

            public C0153a(i0.j.a.d.b.d dVar) {
                this.c = dVar;
            }

            public void run() {
                i0.j.a.d.a.d.a aVar = d.this.b;
                e eVar = (e) aVar;
                ((Integer) eVar.b.executeAndGet(new c(eVar, this.c), 0)).intValue();
            }
        }

        public a(int i) {
            this.a = i;
        }

        public void execute() {
            d dVar = d.this;
            dVar.e = null;
            i0.j.a.d.b.d dVar2 = dVar.f;
            if (dVar2 != null) {
                long micros = TimeUnit.NANOSECONDS.toMicros(System.nanoTime() - dVar2.h);
                d dVar3 = d.this;
                i0.j.a.d.b.d dVar4 = dVar3.f;
                String str = dVar4.a;
                String str2 = str;
                i0.j.a.d.b.d dVar5 = new i0.j.a.d.b.d(str2, dVar4.b, dVar4.c, dVar4.d, dVar4.e, micros, dVar4.g, dVar4.h, this.a);
                dVar3.f = null;
                dVar3.g.execute(new C0153a(dVar5));
                i0.j.a.n.a.a aVar = d.this.d;
                aVar.e("Ending session #" + str);
                return;
            }
            Objects.requireNonNull(dVar.d);
            InstabugSDKLogger.p("Instabug - APM", "Attempted to end session without calling start");
        }
    }

    public d(b bVar, i0.j.a.d.a.d.a aVar, ExceptionHandler exceptionHandler, i0.j.a.n.a.a aVar2) {
        this.a = bVar;
        this.b = aVar;
        this.c = exceptionHandler;
        this.d = aVar2;
    }

    public void a(int i) {
        this.c.execute(new a(i));
    }
}
