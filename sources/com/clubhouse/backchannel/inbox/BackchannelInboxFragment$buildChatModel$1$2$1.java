package com.clubhouse.backchannel.inbox;

import com.clubhouse.android.ui.actionsheet.ActionSheetBuilder;
import i0.e.c.f.b.a.a;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: BackchannelInboxFragment.kt */
public final class BackchannelInboxFragment$buildChatModel$1$2$1 extends Lambda implements l<ActionSheetBuilder, i> {
    public final /* synthetic */ a c;
    public final /* synthetic */ BackchannelInboxFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelInboxFragment$buildChatModel$1$2$1(a aVar, BackchannelInboxFragment backchannelInboxFragment) {
        super(1);
        this.c = aVar;
        this.d = backchannelInboxFragment;
    }

    public Object invoke(Object obj) {
        ActionSheetBuilder actionSheetBuilder = (ActionSheetBuilder) obj;
        m0.n.b.i.e(actionSheetBuilder, "$this$actionSheet");
        int ordinal = this.c.t.ordinal();
        if (ordinal == 0) {
            actionSheetBuilder.a(new c0(0, this.d, this.c));
        } else if (ordinal == 1) {
            actionSheetBuilder.a(new c0(1, this.d, this.c));
        }
        return i.a;
    }
}
