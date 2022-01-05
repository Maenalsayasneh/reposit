package com.clubhouse.android.ui.hallway;

import com.clubhouse.android.shared.preferences.Key;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;

/* compiled from: HallwayFragment.kt */
public final class HallwayFragment$invalidate$1$1$2$1$1$1 extends Lambda implements a<i> {
    public final /* synthetic */ HallwayFragment c;
    public final /* synthetic */ boolean d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallwayFragment$invalidate$1$1$2$1$1$1(HallwayFragment hallwayFragment, boolean z) {
        super(0);
        this.c = hallwayFragment;
        this.d = z;
    }

    public Object invoke() {
        this.c.O0().g(Key.FORCE_USER_SUGGESTIONS, !this.d);
        return i.a;
    }
}
