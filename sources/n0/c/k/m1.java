package n0.c.k;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.i;

/* compiled from: Primitives.kt */
public final class m1 implements KSerializer<i> {
    public static final m1 a = new m1();
    public final /* synthetic */ t0<i> b = new t0<>("kotlin.Unit", i.a);

    public Object deserialize(Decoder decoder) {
        m0.n.b.i.e(decoder, "decoder");
        this.b.deserialize(decoder);
        return i.a;
    }

    public SerialDescriptor getDescriptor() {
        return this.b.a;
    }

    public void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        m0.n.b.i.e(encoder, "encoder");
        m0.n.b.i.e(iVar, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.b.serialize(encoder, iVar);
    }
}
