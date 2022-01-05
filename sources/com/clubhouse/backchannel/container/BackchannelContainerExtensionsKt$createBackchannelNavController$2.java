package com.clubhouse.backchannel.container;

import androidx.navigation.fragment.NavHostFragment;
import com.clubhouse.android.core.ui.BaseBottomSheetFragment;
import h0.a.b;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelContainerExtensions.kt */
public final class BackchannelContainerExtensionsKt$createBackchannelNavController$2 extends Lambda implements l<b, i> {
    public final /* synthetic */ NavHostFragment c;
    public final /* synthetic */ BaseBottomSheetFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelContainerExtensionsKt$createBackchannelNavController$2(NavHostFragment navHostFragment, BaseBottomSheetFragment baseBottomSheetFragment) {
        super(1);
        this.c = navHostFragment;
        this.d = baseBottomSheetFragment;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((b) obj, "$this$addCallback");
        if (!this.c.J0().l()) {
            this.d.dismiss();
        }
        return i.a;
    }
}
