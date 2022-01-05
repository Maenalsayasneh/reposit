package i0.e.a.b;

import com.clubhouse.analytics.actiontrails.ActionTrailUploader;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.shared.preferences.DeviceSharedPreferences;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.j.f.p.h;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.i;

/* compiled from: ActionTrailRecorder.kt */
public final class a {
    public final ActionTrailUploader a;
    public final DeviceSharedPreferences b;

    public a(ActionTrailUploader actionTrailUploader, DeviceSharedPreferences deviceSharedPreferences) {
        i.e(actionTrailUploader, "uploader");
        i.e(deviceSharedPreferences, "devicePreferences");
        this.a = actionTrailUploader;
        this.b = deviceSharedPreferences;
    }

    public final void a(SourceLocation sourceLocation, Map<String, ? extends Object> map) {
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        ActionTrailUploader actionTrailUploader = this.a;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair(Stripe3ds2AuthParams.FIELD_SOURCE, String.valueOf(sourceLocation.getCode()));
        pairArr[1] = new Pair("event_type", "accept_suggestion");
        if (map == null) {
            map = g.o();
        }
        pairArr[2] = new Pair("logging_context", map);
        actionTrailUploader.a("recommendation_event", g.N(pairArr));
    }

    public final void b(SourceLocation sourceLocation, Map<String, ? extends Object> map) {
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        ActionTrailUploader actionTrailUploader = this.a;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair(Stripe3ds2AuthParams.FIELD_SOURCE, String.valueOf(sourceLocation.getCode()));
        pairArr[1] = new Pair("event_type", "reject_suggestion");
        if (map == null) {
            map = g.o();
        }
        pairArr[2] = new Pair("logging_context", map);
        actionTrailUploader.a("recommendation_event", g.N(pairArr));
    }

    public final void c(SourceLocation sourceLocation, Map<String, ? extends Object> map) {
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        ActionTrailUploader actionTrailUploader = this.a;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair(Stripe3ds2AuthParams.FIELD_SOURCE, String.valueOf(sourceLocation.getCode()));
        pairArr[1] = new Pair("event_type", "impression");
        if (map == null) {
            map = g.o();
        }
        pairArr[2] = new Pair("logging_context", map);
        actionTrailUploader.a("recommendation_event", g.N(pairArr));
    }

    public final void d(boolean z) {
        DeviceSharedPreferences deviceSharedPreferences = this.b;
        Objects.requireNonNull(deviceSharedPreferences);
        deviceSharedPreferences.h = UUID.randomUUID().toString();
        this.a.a("app_opened", h.S2(new Pair("after_onboarding", String.valueOf(z))));
    }

    public final void e(String str, SourceLocation sourceLocation) {
        i.e(str, "shareType");
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        this.a.a("external_share", g.N(new Pair("share_type", str), new Pair(Stripe3ds2AuthParams.FIELD_SOURCE, Integer.valueOf(sourceLocation.getCode()))));
    }
}
