package com.clubhouse.backchannel.create;

import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.clubhouse.android.ui.backchannel.CreateChatArgs;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import i0.b.b.f;
import i0.e.c.e.h;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: BackchannelCreateChatFragment.kt */
public final class BackchannelCreateChatFragment$invalidate$1 extends Lambda implements l<h, i> {
    public final /* synthetic */ BackchannelCreateChatFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelCreateChatFragment$invalidate$1(BackchannelCreateChatFragment backchannelCreateChatFragment) {
        super(1);
        this.c = backchannelCreateChatFragment;
    }

    public Object invoke(Object obj) {
        Integer num;
        h hVar = (h) obj;
        m0.n.b.i.e(hVar, "state");
        BackchannelCreateChatFragment backchannelCreateChatFragment = this.c;
        k<Object>[] kVarArr = BackchannelCreateChatFragment.Z1;
        backchannelCreateChatFragment.N0().f.g();
        ProgressBar progressBar = this.c.N0().e;
        m0.n.b.i.d(progressBar, "binding.loading");
        i0.e.b.d3.k.L(progressBar, Boolean.valueOf(hVar.c instanceof f));
        FloatingActionButton floatingActionButton = this.c.N0().c;
        m0.n.b.i.d(floatingActionButton, "binding.create");
        i0.e.b.d3.k.L(floatingActionButton, Boolean.valueOf(hVar.e));
        FrameLayout frameLayout = this.c.N0().d;
        m0.n.b.i.d(frameLayout, "binding.fullScreenLoading");
        CreateChatArgs createChatArgs = hVar.a;
        if (createChatArgs == null) {
            num = null;
        } else {
            num = createChatArgs.d;
        }
        i0.e.b.d3.k.q(frameLayout, Boolean.valueOf(num == null));
        return i.a;
    }
}
