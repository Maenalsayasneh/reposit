package i0.h.a.a.i;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EventInternal;
import i0.h.a.a.a;
import i0.h.a.a.b;
import i0.h.a.a.c;
import i0.h.a.a.d;
import i0.h.a.a.e;
import i0.h.a.a.i.a;
import i0.h.a.a.i.b;
import i0.h.a.a.i.h;
import java.util.Objects;

/* compiled from: TransportImpl */
public final class k<T> implements e<T> {
    public final h a;
    public final String b;
    public final b c;
    public final d<T, byte[]> d;
    public final l e;

    public k(h hVar, String str, b bVar, d<T, byte[]> dVar, l lVar) {
        this.a = hVar;
        this.b = str;
        this.c = bVar;
        this.d = dVar;
        this.e = lVar;
    }

    public void a(c<T> cVar) {
        j jVar = j.a;
        l lVar = this.e;
        h hVar = this.a;
        Objects.requireNonNull(hVar, "Null transportContext");
        String str = this.b;
        Objects.requireNonNull(str, "Null transportName");
        d<T, byte[]> dVar = this.d;
        Objects.requireNonNull(dVar, "Null transformer");
        b bVar = this.c;
        Objects.requireNonNull(bVar, "Null encoding");
        m mVar = (m) lVar;
        i0.h.a.a.i.s.e eVar = mVar.d;
        a aVar = (a) cVar;
        Priority priority = aVar.b;
        h.a a2 = h.a();
        a2.b(hVar.b());
        a2.c(priority);
        b.C0125b bVar2 = (b.C0125b) a2;
        bVar2.b = hVar.c();
        h a3 = bVar2.a();
        EventInternal.a builder = EventInternal.builder();
        builder.e(mVar.b.a());
        builder.g(mVar.c.a());
        builder.f(str);
        builder.d(new e(bVar, dVar.apply(aVar.a)));
        a.b bVar3 = (a.b) builder;
        bVar3.b = null;
        eVar.a(a3, bVar3.b(), jVar);
    }
}
