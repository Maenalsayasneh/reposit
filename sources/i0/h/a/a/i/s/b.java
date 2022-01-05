package i0.h.a.a.i.s;

import com.google.android.datatransport.runtime.EventInternal;
import i0.h.a.a.i.h;
import i0.h.a.a.i.t.a;

/* compiled from: DefaultScheduler */
public final /* synthetic */ class b implements a.C0128a {
    public final c a;
    public final h b;
    public final EventInternal c;

    public b(c cVar, h hVar, EventInternal eventInternal) {
        this.a = cVar;
        this.b = hVar;
        this.c = eventInternal;
    }

    public Object execute() {
        c cVar = this.a;
        h hVar = this.b;
        cVar.e.j0(hVar, this.c);
        cVar.b.a(hVar, 1);
        return null;
    }
}
