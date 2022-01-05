package com.clubhouse.android.ui.hallway;

import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import com.clubhouse.app.R;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HallwayFragment.kt */
public final class HallwayFragment$invalidate$1$1$2$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ HallwayFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallwayFragment$invalidate$1$1$2$1(HallwayFragment hallwayFragment) {
        super(1);
        this.c = hallwayFragment;
    }

    public Object invoke(Object obj) {
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
        actionSheetBuilder.a = this.c.getString(R.string.debug_override_for_hallway_title);
        actionSheetBuilder.a(new f(0, this.c));
        actionSheetBuilder.a(new f(1, this.c));
        actionSheetBuilder.a(new f(2, this.c));
        actionSheetBuilder.a(new f(3, this.c));
        actionSheetBuilder.a(new f(4, this.c));
        return i.a;
    }
}
