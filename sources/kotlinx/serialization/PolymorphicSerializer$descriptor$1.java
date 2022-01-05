package kotlinx.serialization;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.i;
import m0.n.a.l;
import m0.n.b.q;
import n0.c.i.a;
import n0.c.i.g;
import n0.c.k.g1;

/* compiled from: PolymorphicSerializer.kt */
public final class PolymorphicSerializer$descriptor$1 extends Lambda implements l<a, i> {
    public final /* synthetic */ PolymorphicSerializer c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PolymorphicSerializer$descriptor$1(PolymorphicSerializer polymorphicSerializer) {
        super(1);
        this.c = polymorphicSerializer;
    }

    public Object invoke(Object obj) {
        a aVar = (a) obj;
        m0.n.b.i.e(aVar, "$receiver");
        m0.r.t.a.r.m.a1.a.s3(q.a);
        g1 g1Var = g1.b;
        a.a(aVar, "type", g1.a, (List) null, false, 12);
        StringBuilder P0 = i0.d.a.a.a.P0("kotlinx.serialization.Polymorphic<");
        P0.append(this.c.b.e());
        P0.append('>');
        a.a(aVar, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, m0.r.t.a.r.m.a1.a.g0(P0.toString(), g.a.a, new SerialDescriptor[0], (l) null, 8), (List) null, false, 12);
        return i.a;
    }
}
