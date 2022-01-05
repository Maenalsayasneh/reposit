package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.content.SharedPreferences;
import com.stripe.android.stripe3ds2.init.DefaultAppInfoRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/content/SharedPreferences;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: DefaultAppInfoRepository.kt */
public final class DefaultAppInfoRepository$Store$Default$sharedPrefs$2 extends Lambda implements a<SharedPreferences> {
    public final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultAppInfoRepository$Store$Default$sharedPrefs$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final SharedPreferences invoke() {
        Context context = this.$context;
        DefaultAppInfoRepository.Store.Default.Companion unused = DefaultAppInfoRepository.Store.Default.Companion;
        return context.getSharedPreferences("app_info", 0);
    }
}
