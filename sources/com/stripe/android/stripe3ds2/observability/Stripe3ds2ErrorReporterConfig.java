package com.stripe.android.stripe3ds2.observability;

import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R(\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00148\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/stripe3ds2/observability/Stripe3ds2ErrorReporterConfig;", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component1", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "copy", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)Lcom/stripe/android/stripe3ds2/observability/Stripe3ds2ErrorReporterConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "", "customTags", "Ljava/util/Map;", "getCustomTags", "()Ljava/util/Map;", "<init>", "(Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Stripe3ds2ErrorReporterConfig.kt */
public final class Stripe3ds2ErrorReporterConfig implements DefaultErrorReporter.Config {
    private final Map<String, String> customTags;
    private final SdkTransactionId sdkTransactionId;

    public Stripe3ds2ErrorReporterConfig(SdkTransactionId sdkTransactionId2) {
        this.sdkTransactionId = sdkTransactionId2;
        Map<String, String> S2 = sdkTransactionId2 != null ? h.S2(new Pair("sdk_transaction_id", sdkTransactionId2.getValue())) : null;
        this.customTags = S2 == null ? g.o() : S2;
    }

    private final SdkTransactionId component1() {
        return this.sdkTransactionId;
    }

    public static /* synthetic */ Stripe3ds2ErrorReporterConfig copy$default(Stripe3ds2ErrorReporterConfig stripe3ds2ErrorReporterConfig, SdkTransactionId sdkTransactionId2, int i, Object obj) {
        if ((i & 1) != 0) {
            sdkTransactionId2 = stripe3ds2ErrorReporterConfig.sdkTransactionId;
        }
        return stripe3ds2ErrorReporterConfig.copy(sdkTransactionId2);
    }

    public final Stripe3ds2ErrorReporterConfig copy(SdkTransactionId sdkTransactionId2) {
        return new Stripe3ds2ErrorReporterConfig(sdkTransactionId2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Stripe3ds2ErrorReporterConfig) && i.a(this.sdkTransactionId, ((Stripe3ds2ErrorReporterConfig) obj).sdkTransactionId);
        }
        return true;
    }

    public Map<String, String> getCustomTags() {
        return this.customTags;
    }

    public int hashCode() {
        SdkTransactionId sdkTransactionId2 = this.sdkTransactionId;
        if (sdkTransactionId2 != null) {
            return sdkTransactionId2.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder P0 = a.P0("Stripe3ds2ErrorReporterConfig(sdkTransactionId=");
        P0.append(this.sdkTransactionId);
        P0.append(")");
        return P0.toString();
    }
}
