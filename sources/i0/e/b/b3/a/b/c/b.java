package i0.e.b.b3.a.b.c;

import com.clubhouse.android.data.models.local.channel.ClipsPermission;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: ClipsPermissionSerializer.kt */
public final class b implements KSerializer<ClipsPermission> {
    public static final b a = new b();

    public Object deserialize(Decoder decoder) {
        ClipsPermission clipsPermission;
        i.e(decoder, "decoder");
        int j = decoder.j();
        ClipsPermission[] values = ClipsPermission.values();
        int i = 0;
        while (true) {
            if (i >= 2) {
                clipsPermission = null;
                break;
            }
            clipsPermission = values[i];
            if (clipsPermission.getCode() == j) {
                break;
            }
            i++;
        }
        return clipsPermission == null ? ClipsPermission.NOT_ALLOWED : clipsPermission;
    }

    public SerialDescriptor getDescriptor() {
        return a.w("ClipsPermission", d.f.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        ClipsPermission clipsPermission = (ClipsPermission) obj;
        i.e(encoder, "encoder");
        i.e(clipsPermission, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.x(clipsPermission.getCode());
    }
}
