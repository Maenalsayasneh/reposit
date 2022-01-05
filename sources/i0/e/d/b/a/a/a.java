package i0.e.d.b.a.a;

import com.clubhouse.pubsub.user.backchannel.models.AddedChatMember;
import com.clubhouse.pubsub.user.backchannel.models.BackchannelPubSubMessage;
import com.clubhouse.pubsub.user.backchannel.models.ChatPromoted;
import com.clubhouse.pubsub.user.backchannel.models.NewChat;
import com.clubhouse.pubsub.user.backchannel.models.NewMessage;
import com.clubhouse.pubsub.user.backchannel.models.RemovedChatMember;
import com.clubhouse.pubsub.user.backchannel.models.UnarchiveChat;
import kotlinx.serialization.json.JsonElement;
import m0.n.b.i;
import m0.n.b.m;
import n0.c.b;
import n0.c.l.d;

/* compiled from: BackchannelPubSubMessage.kt */
public final class a extends d<BackchannelPubSubMessage> {
    public static final a c = new a();

    public a() {
        super(m.a(BackchannelPubSubMessage.class));
    }

    public b a(JsonElement jsonElement) {
        i.e(jsonElement, "element");
        JsonElement jsonElement2 = (JsonElement) m0.r.t.a.r.m.a1.a.O1(jsonElement).get("action");
        String b = jsonElement2 == null ? null : m0.r.t.a.r.m.a1.a.P1(jsonElement2).b();
        if (b != null) {
            switch (b.hashCode()) {
                case 210284648:
                    if (b.equals("new_message")) {
                        return NewMessage.Companion.serializer();
                    }
                    break;
                case 1121126827:
                    if (b.equals("chat_promoted")) {
                        return ChatPromoted.Companion.serializer();
                    }
                    break;
                case 1261365250:
                    if (b.equals("removed_chat_member")) {
                        return RemovedChatMember.Companion.serializer();
                    }
                    break;
                case 1376822935:
                    if (b.equals("new_chat")) {
                        return NewChat.Companion.serializer();
                    }
                    break;
                case 1380091342:
                    if (b.equals("unarchive_chat")) {
                        return UnarchiveChat.Companion.serializer();
                    }
                    break;
                case 1561903266:
                    if (b.equals("added_chat_member")) {
                        return AddedChatMember.Companion.serializer();
                    }
                    break;
            }
        }
        throw new Throwable(i.k("Unsupported BackchannelPubSubMessage ", jsonElement));
    }
}
