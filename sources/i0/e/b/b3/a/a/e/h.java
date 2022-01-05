package i0.e.b.b3.a.a.e;

import com.clubhouse.android.data.models.local.notification.NotificationFrequency;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: NotificationFrequency.kt */
public final class h implements KSerializer<NotificationFrequency> {
    public static final h a = new h();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        int j = decoder.j();
        NotificationFrequency[] values = NotificationFrequency.values();
        for (int i = 0; i < 6; i++) {
            NotificationFrequency notificationFrequency = values[i];
            if (notificationFrequency.getCode() == j) {
                return notificationFrequency;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public SerialDescriptor getDescriptor() {
        return a.w("NotificationFrequency", d.f.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        NotificationFrequency notificationFrequency = (NotificationFrequency) obj;
        i.e(encoder, "encoder");
        i.e(notificationFrequency, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.x(notificationFrequency.getCode());
    }
}
