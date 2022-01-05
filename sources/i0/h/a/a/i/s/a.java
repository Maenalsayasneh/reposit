package i0.h.a.a.i.s;

import com.google.android.datatransport.runtime.EventInternal;
import i0.h.a.a.g;
import i0.h.a.a.i.h;
import i0.h.a.a.i.j;
import i0.h.a.a.i.p.l;
import java.util.Objects;
import java.util.logging.Logger;

/* compiled from: DefaultScheduler */
public final /* synthetic */ class a implements Runnable {
    public final c c;
    public final h d;
    public final g q;
    public final EventInternal x;

    public a(c cVar, h hVar, g gVar, EventInternal eventInternal) {
        this.c = cVar;
        this.d = hVar;
        this.q = gVar;
        this.x = eventInternal;
    }

    public void run() {
        c cVar = this.c;
        h hVar = this.d;
        g gVar = this.q;
        EventInternal eventInternal = this.x;
        Logger logger = c.a;
        try {
            l lVar = cVar.d.get(hVar.b());
            if (lVar == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{hVar.b()});
                c.a.warning(format);
                new IllegalArgumentException(format);
                Objects.requireNonNull((j) gVar);
                return;
            }
            cVar.f.a(new b(cVar, hVar, lVar.b(eventInternal)));
            Objects.requireNonNull((j) gVar);
        } catch (Exception e) {
            Logger logger2 = c.a;
            StringBuilder P0 = i0.d.a.a.a.P0("Error scheduling event ");
            P0.append(e.getMessage());
            logger2.warning(P0.toString());
            Objects.requireNonNull((j) gVar);
        }
    }
}
