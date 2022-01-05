package i0.e.d.b.a.a.b;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatType;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: ChatType.kt */
public final class c implements KSerializer<ChatType> {
    public static final c a = new c();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        String n = decoder.n();
        ChatType[] values = ChatType.values();
        for (int i = 0; i < 2; i++) {
            ChatType chatType = values[i];
            if (i.a(chatType.getValue(), n)) {
                return chatType;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public SerialDescriptor getDescriptor() {
        return a.w("ChatType", d.i.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        ChatType chatType = (ChatType) obj;
        i.e(encoder, "encoder");
        i.e(chatType, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.F(chatType.getValue());
    }
}
