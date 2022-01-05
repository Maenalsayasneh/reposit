package i0.e.b.b3.a.b.c;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: SourceLocationSerializer.kt */
public final class h implements KSerializer<SourceLocation> {
    public static final h a = new h();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return SourceLocation.Companion.a(decoder.j());
    }

    public SerialDescriptor getDescriptor() {
        return a.w("FollowSourceLocation", d.f.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        SourceLocation sourceLocation = (SourceLocation) obj;
        i.e(encoder, "encoder");
        i.e(sourceLocation, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.x(sourceLocation.getCode());
    }
}
