package kotlinx.serialization.internal;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import n0.c.i.a;

/* compiled from: Tuples.kt */
public final class TripleSerializer$descriptor$1 extends Lambda implements l<a, i> {
    public final /* synthetic */ TripleSerializer c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TripleSerializer$descriptor$1(TripleSerializer tripleSerializer) {
        super(1);
        this.c = tripleSerializer;
    }

    public Object invoke(Object obj) {
        a aVar = (a) obj;
        m0.n.b.i.e(aVar, "$receiver");
        a.a(aVar, "first", this.c.b.getDescriptor(), (List) null, false, 12);
        a.a(aVar, "second", this.c.c.getDescriptor(), (List) null, false, 12);
        a.a(aVar, "third", this.c.d.getDescriptor(), (List) null, false, 12);
        return i.a;
    }
}
