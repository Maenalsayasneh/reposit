package i0.e.b.b3.a.a.e;

import com.clubhouse.android.data.models.local.notification.NotificationEnableSetting;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: NotificationEnableSetting.kt */
public final class g implements KSerializer<NotificationEnableSetting> {
    public static final g a = new g();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        int j = decoder.j();
        NotificationEnableSetting[] values = NotificationEnableSetting.values();
        for (int i = 0; i < 3; i++) {
            NotificationEnableSetting notificationEnableSetting = values[i];
            if (notificationEnableSetting.getCode() == j) {
                return notificationEnableSetting;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public SerialDescriptor getDescriptor() {
        return a.w("NotificationEnableSetting", d.f.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        NotificationEnableSetting notificationEnableSetting = (NotificationEnableSetting) obj;
        i.e(encoder, "encoder");
        i.e(notificationEnableSetting, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.x(notificationEnableSetting.getCode());
    }
}
