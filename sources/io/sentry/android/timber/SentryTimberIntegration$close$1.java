package io.sentry.android.timber;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 0})
/* compiled from: SentryTimberIntegration.kt */
public final /* synthetic */ class SentryTimberIntegration$close$1 extends MutablePropertyReference0Impl {
    public SentryTimberIntegration$close$1(SentryTimberIntegration sentryTimberIntegration) {
        super(sentryTimberIntegration, SentryTimberIntegration.class, "tree", "getTree()Lio/sentry/android/timber/SentryTimberTree;", 0);
    }

    public Object get() {
        return SentryTimberIntegration.access$getTree$p((SentryTimberIntegration) this.receiver);
    }

    public void set(Object obj) {
        ((SentryTimberIntegration) this.receiver).tree = (SentryTimberTree) obj;
    }
}
