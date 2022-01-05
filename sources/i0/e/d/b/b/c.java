package i0.e.d.b.b;

import com.clubhouse.pubsub.user.backchannel.models.BackchannelPubSubMessage;
import com.clubhouse.pubsub.user.wave.models.WavePubSubMessage;
import kotlinx.serialization.json.JsonElement;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.t.a.r.m.a1.a;
import n0.c.b;
import n0.c.l.d;

/* compiled from: UserPubSubClient.kt */
public final class c extends d<b> {
    public static final c c = new c();

    public c() {
        super(m.a(b.class));
    }

    public b a(JsonElement jsonElement) {
        i.e(jsonElement, "element");
        JsonElement jsonElement2 = (JsonElement) a.O1(jsonElement).get("feature");
        String b = jsonElement2 == null ? null : a.P1(jsonElement2).b();
        if (i.a(b, "wave")) {
            return WavePubSubMessage.Companion.serializer();
        }
        if (i.a(b, "chat")) {
            return BackchannelPubSubMessage.Companion.serializer();
        }
        throw new Throwable(i.k("Unsupported UserPubSubMessage ", jsonElement));
    }
}
