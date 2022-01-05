package com.clubhouse.android.ui.onboarding;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: CollectNameUtil.kt */
public final class CollectNameUtil$setUpViews$2 extends Lambda implements a<i> {
    public final /* synthetic */ CollectNameUtil c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectNameUtil$setUpViews$2(CollectNameUtil collectNameUtil) {
        super(0);
        this.c = collectNameUtil;
    }

    public Object invoke() {
        this.c.c(this.c.b.b.getText().toString(), this.c.b.c.getText().toString());
        return i.a;
    }
}
