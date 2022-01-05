package i0.e.d.b.c.a;

import com.clubhouse.pubsub.user.wave.models.NewReceivedWave;
import com.clubhouse.pubsub.user.wave.models.ReceivedWaveCancelled;
import com.clubhouse.pubsub.user.wave.models.ReceivedWaveSuspended;
import com.clubhouse.pubsub.user.wave.models.SentWaveAccepted;
import com.clubhouse.pubsub.user.wave.models.SentWaveSuspended;
import com.clubhouse.pubsub.user.wave.models.SentWaveUnsuspended;
import com.clubhouse.pubsub.user.wave.models.WavePubSubMessage;
import kotlinx.serialization.json.JsonElement;
import m0.n.b.i;
import m0.n.b.m;
import n0.c.b;
import n0.c.l.d;

/* compiled from: WavePubSubMessage.kt */
public final class a extends d<WavePubSubMessage> {
    public static final a c = new a();

    public a() {
        super(m.a(WavePubSubMessage.class));
    }

    public b<? extends WavePubSubMessage> a(JsonElement jsonElement) {
        i.e(jsonElement, "element");
        JsonElement jsonElement2 = (JsonElement) m0.r.t.a.r.m.a1.a.O1(jsonElement).get("action");
        String b = jsonElement2 == null ? null : m0.r.t.a.r.m.a1.a.P1(jsonElement2).b();
        if (b != null) {
            switch (b.hashCode()) {
                case -2095288036:
                    if (b.equals("suspend_wave")) {
                        return ReceivedWaveSuspended.Companion.serializer();
                    }
                    break;
                case -1571546722:
                    if (b.equals("cancel_wave")) {
                        return ReceivedWaveCancelled.Companion.serializer();
                    }
                    break;
                case -669648131:
                    if (b.equals("suspend_sent_wave")) {
                        return SentWaveSuspended.Companion.serializer();
                    }
                    break;
                case 26800464:
                    if (b.equals("send_wave")) {
                        return NewReceivedWave.Companion.serializer();
                    }
                    break;
                case 628784080:
                    if (b.equals("accept_wave")) {
                        return SentWaveAccepted.Companion.serializer();
                    }
                    break;
                case 1302581636:
                    if (b.equals("unsuspend_sent_wave")) {
                        return SentWaveUnsuspended.Companion.serializer();
                    }
                    break;
            }
        }
        throw new Throwable(i.k("Unsupported WavePubSubMessage ", jsonElement));
    }
}
