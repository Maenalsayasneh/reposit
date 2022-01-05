package i0.e.b.b3.a.a.e;

import com.clubhouse.android.data.models.local.notification.ActionableNotificationType;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import n0.c.i.d;

/* compiled from: ActionableNotificationType.kt */
public final class a implements KSerializer<ActionableNotificationType> {
    public static final a a = new a();

    public Object deserialize(Decoder decoder) {
        ActionableNotificationType actionableNotificationType;
        i.e(decoder, "decoder");
        int j = decoder.j();
        ActionableNotificationType[] values = ActionableNotificationType.values();
        int i = 0;
        while (true) {
            if (i >= 9) {
                actionableNotificationType = null;
                break;
            }
            actionableNotificationType = values[i];
            if (actionableNotificationType.getCode() == j) {
                break;
            }
            i++;
        }
        return actionableNotificationType == null ? ActionableNotificationType.UNKNOWN : actionableNotificationType;
    }

    public SerialDescriptor getDescriptor() {
        return m0.r.t.a.r.m.a1.a.w("ActionableNotificationType", d.f.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        ActionableNotificationType actionableNotificationType = (ActionableNotificationType) obj;
        i.e(encoder, "encoder");
        i.e(actionableNotificationType, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.x(actionableNotificationType.getCode());
    }
}
