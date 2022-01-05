package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.e;
import m0.r.t.a.r.c.v;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.l.f;

/* compiled from: NotFoundClasses.kt */
public final class NotFoundClasses$classes$1 extends Lambda implements l<NotFoundClasses.a, d> {
    public final /* synthetic */ NotFoundClasses c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotFoundClasses$classes$1(NotFoundClasses notFoundClasses) {
        super(1);
        this.c = notFoundClasses;
    }

    public Object invoke(Object obj) {
        e eVar;
        NotFoundClasses.a aVar = (NotFoundClasses.a) obj;
        i.e(aVar, "$dstr$classId$typeParametersCount");
        a aVar2 = aVar.a;
        List<Integer> list = aVar.b;
        if (!aVar2.c) {
            a g = aVar2.g();
            if (g == null) {
                eVar = null;
            } else {
                eVar = this.c.a(g, g.l(list, 1));
            }
            if (eVar == null) {
                f<b, v> fVar = this.c.c;
                b h = aVar2.h();
                i.d(h, "classId.packageFqName");
                eVar = (e) ((LockBasedStorageManager.m) fVar).invoke(h);
            }
            e eVar2 = eVar;
            boolean k = aVar2.k();
            m0.r.t.a.r.l.l lVar = this.c.a;
            m0.r.t.a.r.g.d j = aVar2.j();
            i.d(j, "classId.shortClassName");
            Integer num = (Integer) g.w(list);
            return new NotFoundClasses.b(lVar, eVar2, j, k, num == null ? 0 : num.intValue());
        }
        throw new UnsupportedOperationException(i.k("Unresolved local class: ", aVar2));
    }
}
