package i0.e.d.b.a.a.b;

import com.clubhouse.pubsub.user.backchannel.models.remote.BackchannelMessageType;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import n0.c.i.d;

/* compiled from: ChatMessage.kt */
public final class a implements KSerializer<BackchannelMessageType> {
    public static final a a = new a();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        String n = decoder.n();
        BackchannelMessageType[] values = BackchannelMessageType.values();
        for (int i = 0; i < 4; i++) {
            BackchannelMessageType backchannelMessageType = values[i];
            if (i.a(backchannelMessageType.getValue(), n)) {
                return backchannelMessageType;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public SerialDescriptor getDescriptor() {
        return m0.r.t.a.r.m.a1.a.w("BackchannelMessageType", d.i.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        BackchannelMessageType backchannelMessageType = (BackchannelMessageType) obj;
        i.e(encoder, "encoder");
        i.e(backchannelMessageType, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.F(backchannelMessageType.getValue());
    }
}
