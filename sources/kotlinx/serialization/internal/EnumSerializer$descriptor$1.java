package kotlinx.serialization.internal;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.i;
import m0.n.a.l;
import n0.c.i.a;
import n0.c.i.h;

/* compiled from: Enums.kt */
public final class EnumSerializer$descriptor$1 extends Lambda implements l<a, i> {
    public final /* synthetic */ EnumSerializer c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnumSerializer$descriptor$1(EnumSerializer enumSerializer, String str) {
        super(1);
        this.c = enumSerializer;
        this.d = str;
    }

    public Object invoke(Object obj) {
        a aVar = (a) obj;
        m0.n.b.i.e(aVar, "$receiver");
        for (T t : this.c.b) {
            a.a(aVar, t.name(), m0.r.t.a.r.m.a1.a.g0(this.d + '.' + t.name(), h.d.a, new SerialDescriptor[0], (l) null, 8), (List) null, false, 12);
        }
        return i.a;
    }
}
