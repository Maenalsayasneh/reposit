package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import com.stripe.android.DefaultFraudDetectionDataStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/content/SharedPreferences;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataStore.kt */
public final class DefaultFraudDetectionDataStore$prefs$2 extends Lambda implements a<SharedPreferences> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataStore$prefs$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final SharedPreferences invoke() {
        Context context = this.$context;
        DefaultFraudDetectionDataStore.Companion unused = DefaultFraudDetectionDataStore.Companion;
        return context.getSharedPreferences("FraudDetectionDataStore", 0);
    }
}
