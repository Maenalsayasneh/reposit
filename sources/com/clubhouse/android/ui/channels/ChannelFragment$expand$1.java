package com.clubhouse.android.ui.channels;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.clubhouse.android.core.ui.SafeMotionLayout;
import com.clubhouse.android.ui.ChannelDisplayState;
import h0.a.b;
import h0.b0.v;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.a;
import m0.n.a.p;
import m0.r.k;
import n0.a.f0;

@c(c = "com.clubhouse.android.ui.channels.ChannelFragment$expand$1", f = "ChannelFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$expand$1 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public final /* synthetic */ ChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$expand$1(ChannelFragment channelFragment, m0.l.c<? super ChannelFragment$expand$1> cVar) {
        super(2, cVar);
        this.c = channelFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ChannelFragment$expand$1(this.c, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        ChannelFragment$expand$1 channelFragment$expand$1 = new ChannelFragment$expand$1(this.c, (m0.l.c) obj2);
        i iVar = i.a;
        channelFragment$expand$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        ChannelFragment channelFragment = this.c;
        k<Object>[] kVarArr = ChannelFragment.Z1;
        channelFragment.R0().q(ChannelDisplayState.EXPANDED);
        v.x0(this.c);
        Toolbar toolbar = this.c.Q0().x;
        m0.n.b.i.d(toolbar, "binding.toolbar");
        i0.e.b.d3.k.K(toolbar);
        ImageView imageView = this.c.Q0().b;
        m0.n.b.i.d(imageView, "binding.backchannel");
        i0.e.b.d3.k.K(imageView);
        SafeMotionLayout safeMotionLayout = this.c.Q0().a;
        m0.n.b.i.d(safeMotionLayout, "binding.root");
        int startState = this.c.Q0().a.getStartState();
        final ChannelFragment channelFragment2 = this.c;
        AnonymousClass1 r1 = new a<i>() {
            public Object invoke() {
                ChannelFragment channelFragment = channelFragment2;
                k<Object>[] kVarArr = ChannelFragment.Z1;
                Button button = channelFragment.Q0().o;
                m0.n.b.i.d(button, "binding.iconLeave");
                i0.e.b.d3.k.r(button);
                View view = channelFragment2.Q0().g;
                m0.n.b.i.d(view, "binding.collapsedVirtualBackground");
                i0.e.b.d3.k.p(view);
                channelFragment2.Q0().c.requestLayout();
                return i.a;
            }
        };
        m0.n.b.i.e(safeMotionLayout, "<this>");
        m0.n.b.i.e(r1, "f");
        safeMotionLayout.setTransitionListener(new i0.e.b.a3.f.p(startState, r1));
        this.c.Q0().a.u(0.0f);
        b bVar = this.c.e2;
        if (bVar != null) {
            bVar.a = true;
            return i.a;
        }
        m0.n.b.i.m("collapseOnBackPress");
        throw null;
    }
}
