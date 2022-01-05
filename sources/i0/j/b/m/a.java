package i0.j.b.m;

import com.instabug.library.Feature;
import com.instabug.library.analytics.AnalyticsWrapper;
import com.instabug.library.core.InstabugCore;
import i0.j.b.s.b;
import java.util.Objects;

/* compiled from: InstabugDisclaimer */
public class a {
    public static void a(String str) {
        AnalyticsWrapper.getInstance().catchApiUsageAsync("setDisclaimerText", i0.d.a.a.a.O("disclaimer", CharSequence.class));
        if (InstabugCore.getFeatureState(Feature.DISCLAIMER) == Feature.State.ENABLED) {
            Objects.requireNonNull(i0.j.b.s.a.h());
            b.a().d = str;
        }
    }
}
