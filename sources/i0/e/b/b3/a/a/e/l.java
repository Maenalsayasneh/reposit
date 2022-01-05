package i0.e.b.b3.a.a.e;

import com.clubhouse.android.data.models.local.notification.NotificationType;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: NotificationType.kt */
public final class l implements KSerializer<NotificationType> {
    public static final l a = new l();

    public Object deserialize(Decoder decoder) {
        NotificationType notificationType;
        i.e(decoder, "decoder");
        int j = decoder.j();
        NotificationType[] values = NotificationType.values();
        int i = 0;
        while (true) {
            if (i >= 25) {
                notificationType = null;
                break;
            }
            notificationType = values[i];
            if (notificationType.getCode() == j) {
                break;
            }
            i++;
        }
        return notificationType == null ? NotificationType.UNKNOWN : notificationType;
    }

    public SerialDescriptor getDescriptor() {
        return a.w("NotificationType", d.f.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        NotificationType notificationType = (NotificationType) obj;
        i.e(encoder, "encoder");
        i.e(notificationType, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.x(notificationType.getCode());
    }
}
