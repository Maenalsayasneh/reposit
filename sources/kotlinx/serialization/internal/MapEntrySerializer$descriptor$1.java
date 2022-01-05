package kotlinx.serialization.internal;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import m0.i;
import m0.n.a.l;
import n0.c.i.a;

/* compiled from: Tuples.kt */
public final class MapEntrySerializer$descriptor$1 extends Lambda implements l<a, i> {
    public final /* synthetic */ KSerializer c;
    public final /* synthetic */ KSerializer d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapEntrySerializer$descriptor$1(KSerializer kSerializer, KSerializer kSerializer2) {
        super(1);
        this.c = kSerializer;
        this.d = kSerializer2;
    }

    public Object invoke(Object obj) {
        a aVar = (a) obj;
        m0.n.b.i.e(aVar, "$receiver");
        a.a(aVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY, this.c.getDescriptor(), (List) null, false, 12);
        a.a(aVar, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, this.d.getDescriptor(), (List) null, false, 12);
        return i.a;
    }
}
