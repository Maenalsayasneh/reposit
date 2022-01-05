package i0.e.b.b3.a.b.c;

import com.clubhouse.android.data.models.local.channel.HandraisePermission;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: HandraisePermissionSerializer.kt */
public final class e implements KSerializer<HandraisePermission> {
    public static final e a = new e();

    public Object deserialize(Decoder decoder) {
        HandraisePermission handraisePermission;
        i.e(decoder, "decoder");
        int j = decoder.j();
        HandraisePermission[] values = HandraisePermission.values();
        int i = 0;
        while (true) {
            if (i >= 3) {
                handraisePermission = null;
                break;
            }
            handraisePermission = values[i];
            if (handraisePermission.getCode() == j) {
                break;
            }
            i++;
        }
        return handraisePermission == null ? HandraisePermission.ALL : handraisePermission;
    }

    public SerialDescriptor getDescriptor() {
        return a.w("HandraisePermission", d.f.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        HandraisePermission handraisePermission = (HandraisePermission) obj;
        i.e(encoder, "encoder");
        i.e(handraisePermission, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.x(handraisePermission.getCode());
    }
}
