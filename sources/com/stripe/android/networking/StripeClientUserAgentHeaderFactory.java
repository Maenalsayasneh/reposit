package com.stripe.android.networking;

import android.os.Build;
import com.stripe.android.AppInfo;
import com.stripe.android.Stripe;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0012\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/networking/StripeClientUserAgentHeaderFactory;", "", "Lcom/stripe/android/AppInfo;", "appInfo", "", "", "create", "(Lcom/stripe/android/AppInfo;)Ljava/util/Map;", "Lorg/json/JSONObject;", "createHeaderValue", "(Lcom/stripe/android/AppInfo;)Lorg/json/JSONObject;", "Lkotlin/Function1;", "systemPropertySupplier", "Lm0/n/a/l;", "<init>", "(Lm0/n/a/l;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeClientUserAgentHeaderFactory.kt */
public final class StripeClientUserAgentHeaderFactory {
    public static final Companion Companion = new Companion((f) null);
    private static final l<String, String> DEFAULT_SYSTEM_PROPERTY_SUPPLIER = StripeClientUserAgentHeaderFactory$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1.INSTANCE;
    public static final String HEADER_STRIPE_CLIENT_USER_AGENT = "X-Stripe-Client-User-Agent";
    private static final String PROP_USER_AGENT = "http.agent";
    private final l<String, String> systemPropertySupplier;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u00038\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00038\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/networking/StripeClientUserAgentHeaderFactory$Companion;", "", "Lkotlin/Function1;", "", "DEFAULT_SYSTEM_PROPERTY_SUPPLIER", "Lm0/n/a/l;", "HEADER_STRIPE_CLIENT_USER_AGENT", "Ljava/lang/String;", "PROP_USER_AGENT", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeClientUserAgentHeaderFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public StripeClientUserAgentHeaderFactory() {
        this((l) null, 1, (f) null);
    }

    public StripeClientUserAgentHeaderFactory(l<? super String, String> lVar) {
        i.e(lVar, "systemPropertySupplier");
        this.systemPropertySupplier = lVar;
    }

    public static /* synthetic */ Map create$default(StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory, AppInfo appInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            appInfo = null;
        }
        return stripeClientUserAgentHeaderFactory.create(appInfo);
    }

    public static /* synthetic */ JSONObject createHeaderValue$default(StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory, AppInfo appInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            appInfo = null;
        }
        return stripeClientUserAgentHeaderFactory.createHeaderValue(appInfo);
    }

    public final Map<String, String> create(AppInfo appInfo) {
        return h.S2(new Pair(HEADER_STRIPE_CLIENT_USER_AGENT, createHeaderValue(appInfo).toString()));
    }

    public final JSONObject createHeaderValue(AppInfo appInfo) {
        Map N = g.N(new Pair("os.name", "android"), new Pair("os.version", String.valueOf(Build.VERSION.SDK_INT)), new Pair("bindings.version", Stripe.VERSION_NAME), new Pair("lang", "Java"), new Pair("publisher", "Stripe"), new Pair(PROP_USER_AGENT, this.systemPropertySupplier.invoke(PROP_USER_AGENT)));
        Map<String, Map<String, String>> createClientHeaders$payments_core_release = appInfo != null ? appInfo.createClientHeaders$payments_core_release() : null;
        if (createClientHeaders$payments_core_release == null) {
            createClientHeaders$payments_core_release = g.o();
        }
        return new JSONObject((Map<?, ?>) g.b0(N, createClientHeaders$payments_core_release));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StripeClientUserAgentHeaderFactory(l<String, String> lVar, int i, f fVar) {
        this((i & 1) != 0 ? DEFAULT_SYSTEM_PROPERTY_SUPPLIER : lVar);
    }
}
