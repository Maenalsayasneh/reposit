package i0.e.b.b3.a.a.e;

import com.clubhouse.android.data.models.local.notification.NotificationPause;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: NotificationPause.kt */
public final class i implements KSerializer<NotificationPause> {
    public static final i a = new i();

    public Object deserialize(Decoder decoder) {
        m0.n.b.i.e(decoder, "decoder");
        int j = decoder.j();
        NotificationPause[] values = NotificationPause.values();
        for (int i = 0; i < 6; i++) {
            NotificationPause notificationPause = values[i];
            if (notificationPause.getCode() == j) {
                return notificationPause;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public SerialDescriptor getDescriptor() {
        return a.w("NotificationPause", d.f.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        NotificationPause notificationPause = (NotificationPause) obj;
        m0.n.b.i.e(encoder, "encoder");
        m0.n.b.i.e(notificationPause, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.x(notificationPause.getCode());
    }
}
