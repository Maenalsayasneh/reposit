package com.clubhouse.backchannel.inbox;

import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import h0.b0.v;
import i0.e.c.h.k;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelInboxFragment.kt */
public final class BackchannelInboxFragment$showSettings$1 extends Lambda implements l<k, i> {
    public final /* synthetic */ BackchannelInboxFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelInboxFragment$showSettings$1(BackchannelInboxFragment backchannelInboxFragment) {
        super(1);
        this.c = backchannelInboxFragment;
    }

    public Object invoke(Object obj) {
        final k kVar = (k) obj;
        m0.n.b.i.e(kVar, "state");
        final BackchannelInboxFragment backchannelInboxFragment = this.c;
        v.e(backchannelInboxFragment, new l<ActionSheetBuilder, i>() {
            public Object invoke(Object obj) {
                ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
                m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
                actionSheetBuilder.a(new t(0, backchannelInboxFragment));
                if (k.this.f) {
                    actionSheetBuilder.a(new t(1, backchannelInboxFragment));
                } else {
                    actionSheetBuilder.a(new t(2, backchannelInboxFragment));
                }
                return i.a;
            }
        });
        return i.a;
    }
}
