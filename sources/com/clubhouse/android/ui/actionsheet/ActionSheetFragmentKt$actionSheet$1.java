package com.clubhouse.android.ui.actionsheet;

import android.os.Bundle;
import h0.o.a.c0;
import i0.e.b.g3.i.c;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: ActionSheetFragment.kt */
public final class ActionSheetFragmentKt$actionSheet$1 extends Lambda implements l<c0, i> {
    public final /* synthetic */ l<ActionSheetBuilder, i> c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActionSheetFragmentKt$actionSheet$1(l<? super ActionSheetBuilder, i> lVar) {
        super(1);
        this.c = lVar;
    }

    public Object invoke(Object obj) {
        c0 c0Var = (c0) obj;
        m0.n.b.i.e(c0Var, "$this$commitSafe");
        ActionSheetBuilder actionSheetBuilder = new ActionSheetBuilder();
        this.c.invoke(actionSheetBuilder);
        ActionSheetFragment actionSheetFragment = new ActionSheetFragment();
        List<c> list = actionSheetBuilder.e;
        m0.n.b.i.e(list, "<set-?>");
        actionSheetFragment.s2 = list;
        a<i> aVar = actionSheetBuilder.d;
        m0.n.b.i.e(aVar, "<set-?>");
        actionSheetFragment.t2 = aVar;
        ActionSheetConfig actionSheetConfig = new ActionSheetConfig(actionSheetBuilder.a, actionSheetBuilder.b, actionSheetBuilder.c);
        m0.n.b.i.e(actionSheetConfig, "arg");
        Bundle bundle = new Bundle();
        bundle.putParcelable("mavericks:arg", actionSheetConfig);
        actionSheetFragment.setArguments(bundle);
        c0Var.m(0, actionSheetFragment, (String) null, 1);
        return i.a;
    }
}
