package com.clubhouse.android.ui.actionsheet;

import i0.e.b.g3.i.h;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ActionSheetFragment.kt */
public final class ActionSheetFragment$invalidate$1 extends Lambda implements l<h, i> {
    public final /* synthetic */ ActionSheetFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionSheetFragment$invalidate$1(ActionSheetFragment actionSheetFragment) {
        super(1);
        this.c = actionSheetFragment;
    }

    public Object invoke(Object obj) {
        h hVar = (h) obj;
        m0.n.b.i.e(hVar, "state");
        String str = hVar.a;
        if (str != null) {
            ActionSheetFragment actionSheetFragment = this.c;
            ActionSheetFragment.U0(actionSheetFragment).c.setText(str);
            ActionSheetFragment.U0(actionSheetFragment).c.setVisibility(0);
        }
        String str2 = hVar.b;
        if (str2 != null) {
            ActionSheetFragment actionSheetFragment2 = this.c;
            ActionSheetFragment.U0(actionSheetFragment2).b.setText(str2);
            ActionSheetFragment.U0(actionSheetFragment2).b.setVisibility(0);
        }
        ActionSheetFragment.U0(this.c).a.g();
        return i.a;
    }
}
