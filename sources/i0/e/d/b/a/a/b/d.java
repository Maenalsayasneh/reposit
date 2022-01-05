package i0.e.d.b.a.a.b;

import com.clubhouse.pubsub.user.backchannel.models.remote.BackchannelMessageType;
import com.clubhouse.pubsub.user.backchannel.models.remote.MessageData;
import kotlinx.serialization.json.JsonElement;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.t.a.r.m.a1.a;
import n0.c.b;

/* compiled from: MessageData.kt */
public final class d extends n0.c.l.d<MessageData> {
    public static final d c = new d();

    public d() {
        super(m.a(MessageData.class));
    }

    public b a(JsonElement jsonElement) {
        i.e(jsonElement, "element");
        JsonElement jsonElement2 = (JsonElement) a.O1(jsonElement).get("message_type");
        String b = jsonElement2 == null ? null : a.P1(jsonElement2).b();
        if (i.a(b, BackchannelMessageType.CHAT.getValue())) {
            return MessageData.Chat.Companion.serializer();
        }
        if (i.a(b, BackchannelMessageType.MEMBER_ADDED.getValue())) {
            return MessageData.MemberAdded.Companion.serializer();
        }
        if (i.a(b, BackchannelMessageType.MEMBER_REMOVED.getValue())) {
            return MessageData.MemberRemoved.Companion.serializer();
        }
        if (i.a(b, BackchannelMessageType.UNAVAILABLE.getValue())) {
            MessageData.Unavailable unavailable = MessageData.Unavailable.a;
            return MessageData.Unavailable.b.getValue();
        }
        throw new Throwable(i.k("Unsupported MessageData ", jsonElement));
    }
}
