package com.stripe.android.networking;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "name", "invoke", "(Ljava/lang/String;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeRequest.kt */
public final class StripeRequest$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1 extends Lambda implements l<String, String> {
    public static final StripeRequest$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1 INSTANCE = new StripeRequest$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1();

    public StripeRequest$Companion$DEFAULT_SYSTEM_PROPERTY_SUPPLIER$1() {
        super(1);
    }

    public final String invoke(String str) {
        i.e(str, "name");
        String property = System.getProperty(str);
        return property != null ? property : "";
    }
}
