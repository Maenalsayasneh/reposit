package i0.e.b.b3.a.b.c;

import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: FollowNotificationTypeSerializer.kt */
public final class d implements KSerializer<FollowNotificationType> {
    public static final d a = new d();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        int j = decoder.j();
        FollowNotificationType[] values = FollowNotificationType.values();
        for (int i = 0; i < 3; i++) {
            FollowNotificationType followNotificationType = values[i];
            if (followNotificationType.getCode() == j) {
                return followNotificationType;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public SerialDescriptor getDescriptor() {
        return a.w("FollowNotificationType", d.f.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        FollowNotificationType followNotificationType = (FollowNotificationType) obj;
        i.e(encoder, "encoder");
        i.e(followNotificationType, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.x(followNotificationType.getCode());
    }
}
