package i0.e.d.b.a.a.b;

import com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: ChatDestination.kt */
public final class b implements KSerializer<ChatDestination> {
    public static final b a = new b();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        String n = decoder.n();
        ChatDestination[] values = ChatDestination.values();
        for (int i = 0; i < 2; i++) {
            ChatDestination chatDestination = values[i];
            if (i.a(chatDestination.getValue(), n)) {
                return chatDestination;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public SerialDescriptor getDescriptor() {
        return a.w("ChatDestination", d.i.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        ChatDestination chatDestination = (ChatDestination) obj;
        i.e(encoder, "encoder");
        i.e(chatDestination, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.F(chatDestination.getValue());
    }
}
