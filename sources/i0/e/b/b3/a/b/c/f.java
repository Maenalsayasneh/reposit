package i0.e.b.b3.a.b.c;

import com.clubhouse.android.data.models.local.channel.MessageType;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;
import n0.c.l.e;

/* compiled from: MessageTypeSerializer.kt */
public final class f implements KSerializer<MessageType> {
    public static final f a = new f();

    public Object deserialize(Decoder decoder) {
        MessageType messageType;
        i.e(decoder, "decoder");
        if (decoder instanceof e) {
            JsonElement i = ((e) decoder).i();
            MessageType[] values = MessageType.values();
            int i2 = 0;
            while (true) {
                if (i2 >= 24) {
                    messageType = null;
                    break;
                }
                messageType = values[i2];
                if (i.a(messageType.getAction(), a.P1(i).b())) {
                    break;
                }
                i2++;
            }
            return messageType == null ? MessageType.Unknown : messageType;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public SerialDescriptor getDescriptor() {
        return a.w("MessageType", d.i.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        MessageType messageType = (MessageType) obj;
        i.e(encoder, "encoder");
        i.e(messageType, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.F(messageType.getAction());
    }
}
