package com.stripe.android.networking;

import i0.j.f.p.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00022\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ5\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00022\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/networking/FraudDetectionDataParamsUtils;", "", "", "", "stripeIntentParams", "key", "Lcom/stripe/android/networking/FraudDetectionData;", "fraudDetectionData", "addFraudDetectionData", "(Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/networking/FraudDetectionData;)Ljava/util/Map;", "params", "addFraudDetectionData$payments_core_release", "(Ljava/util/Map;Lcom/stripe/android/networking/FraudDetectionData;)Ljava/util/Map;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataParamsUtils.kt */
public final class FraudDetectionDataParamsUtils {
    private final Map<String, ?> addFraudDetectionData(Map<String, ?> map, String str, FraudDetectionData fraudDetectionData) {
        Object obj = map.get(str);
        Map<String, String> map2 = null;
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map3 = (Map) obj;
        if (map3 == null) {
            return map;
        }
        if (fraudDetectionData != null) {
            map2 = fraudDetectionData.getParams();
        }
        if (map2 == null) {
            map2 = g.o();
        }
        return g.b0(map, h.S2(new Pair(str, g.b0(map3, map2))));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r5 = addFraudDetectionData(r4, r1, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, ?> addFraudDetectionData$payments_core_release(java.util.Map<java.lang.String, ?> r4, com.stripe.android.networking.FraudDetectionData r5) {
        /*
            r3 = this;
            java.lang.String r0 = "params"
            m0.n.b.i.e(r4, r0)
            java.lang.String r0 = "source_data"
            java.lang.String r1 = "payment_method_data"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = m0.j.g.h0(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0015:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r4.containsKey(r2)
            if (r2 == 0) goto L_0x0015
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0035
            java.util.Map r5 = r3.addFraudDetectionData(r4, r1, r5)
            if (r5 == 0) goto L_0x0035
            r4 = r5
        L_0x0035:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.FraudDetectionDataParamsUtils.addFraudDetectionData$payments_core_release(java.util.Map, com.stripe.android.networking.FraudDetectionData):java.util.Map");
    }
}
