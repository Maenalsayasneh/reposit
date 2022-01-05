package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;
import m0.n.b.i;
import m0.r.t.a.r.o.g;

/* compiled from: JavaTypeEnhancementState.kt */
public final class JavaTypeEnhancementState$description$2 extends Lambda implements a<String[]> {
    public final /* synthetic */ g c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JavaTypeEnhancementState$description$2(g gVar) {
        super(0);
        this.c = gVar;
    }

    public Object invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.c.c.getDescription());
        ReportLevel reportLevel = this.c.d;
        if (reportLevel != null) {
            arrayList.add(i.k("under-migration:", reportLevel.getDescription()));
        }
        for (Map.Entry next : this.c.e.entrySet()) {
            StringBuilder N0 = i0.d.a.a.a.N0('@');
            N0.append((String) next.getKey());
            N0.append(':');
            N0.append(((ReportLevel) next.getValue()).getDescription());
            arrayList.add(N0.toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }
}
