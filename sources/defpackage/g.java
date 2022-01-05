package defpackage;

import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.a.a;
import n0.c.l.b;
import n0.c.l.j;
import n0.c.l.l;
import n0.c.l.n;
import n0.c.l.o;

/* renamed from: g  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class g extends Lambda implements a<SerialDescriptor> {
    public static final g c = new g(0);
    public static final g d = new g(1);
    public static final g q = new g(2);
    public static final g x = new g(3);
    public static final g y = new g(4);
    public final /* synthetic */ int Y1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(int i) {
        super(0);
        this.Y1 = i;
    }

    public final Object invoke() {
        int i = this.Y1;
        if (i == 0) {
            o oVar = o.b;
            return o.a;
        } else if (i == 1) {
            l lVar = l.b;
            return l.a;
        } else if (i == 2) {
            j jVar = j.b;
            return j.a;
        } else if (i == 3) {
            n nVar = n.b;
            return n.a;
        } else if (i == 4) {
            b bVar = b.b;
            return b.a;
        } else {
            throw null;
        }
    }
}
