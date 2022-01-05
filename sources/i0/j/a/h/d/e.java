package i0.j.a.h.d;

import com.instabug.library.internal.utils.stability.execution.Executable;
import com.instabug.library.model.common.Session;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.a.d.a.d.b;
import i0.j.a.d.b.d;
import java.util.Collections;
import java.util.Objects;

/* compiled from: SessionHandlerImpl */
public class e implements Runnable {
    public final /* synthetic */ Session c;
    public final /* synthetic */ d d;

    /* compiled from: SessionHandlerImpl */
    public class a implements Executable {

        /* renamed from: i0.j.a.h.d.e$a$a  reason: collision with other inner class name */
        /* compiled from: SessionHandlerImpl */
        public class C0154a implements Runnable {
            public C0154a() {
            }

            public void run() {
                e eVar = e.this;
                d dVar = eVar.d;
                if (dVar.f == null) {
                    i0.j.a.d.a.d.a aVar = dVar.b;
                    i0.j.a.d.a.d.e eVar2 = (i0.j.a.d.a.d.e) aVar;
                    dVar.f = (d) eVar2.b.executeAndGet(new b(eVar2, eVar.c));
                    d dVar2 = e.this.d;
                    d dVar3 = dVar2.f;
                    if (dVar3 != null) {
                        i0.j.a.d.a.d.a aVar2 = dVar2.b;
                        i0.j.a.d.a.d.e eVar3 = (i0.j.a.d.a.d.e) aVar2;
                        d dVar4 = (d) eVar3.b.executeAndGet(new i0.j.a.d.a.d.d(eVar3, dVar3.a));
                        for (T onNewSessionStarted : Collections.unmodifiableCollection(i0.j.a.g.a.c().a)) {
                            onNewSessionStarted.onNewSessionStarted(dVar3, dVar4);
                        }
                        return;
                    }
                    return;
                }
                Objects.requireNonNull(dVar.d);
                InstabugSDKLogger.p("Instabug - APM", "Attempted to start session while another session is already running. Skipping..");
            }
        }

        public a() {
        }

        public void execute() {
            e.this.d.g.execute(new C0154a());
        }
    }

    public e(d dVar, Session session) {
        this.d = dVar;
        this.c = session;
    }

    public void run() {
        this.d.c.execute(new a());
    }
}
