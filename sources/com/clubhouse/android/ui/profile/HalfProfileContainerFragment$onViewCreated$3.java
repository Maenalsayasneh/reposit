package com.clubhouse.android.ui.profile;

import android.app.Dialog;
import android.view.Window;
import com.clubhouse.app.R;
import h0.i.b.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.HalfProfileContainerFragment$onViewCreated$3", f = "HalfProfileContainerFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: HalfProfileContainerFragment.kt */
public final class HalfProfileContainerFragment$onViewCreated$3 extends SuspendLambda implements p<Boolean, m0.l.c<? super i>, Object> {
    public /* synthetic */ boolean c;
    public final /* synthetic */ HalfProfileContainerFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileContainerFragment$onViewCreated$3(HalfProfileContainerFragment halfProfileContainerFragment, m0.l.c<? super HalfProfileContainerFragment$onViewCreated$3> cVar) {
        super(2, cVar);
        this.d = halfProfileContainerFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        HalfProfileContainerFragment$onViewCreated$3 halfProfileContainerFragment$onViewCreated$3 = new HalfProfileContainerFragment$onViewCreated$3(this.d, cVar);
        halfProfileContainerFragment$onViewCreated$3.c = ((Boolean) obj).booleanValue();
        return halfProfileContainerFragment$onViewCreated$3;
    }

    public Object invoke(Object obj, Object obj2) {
        Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        HalfProfileContainerFragment$onViewCreated$3 halfProfileContainerFragment$onViewCreated$3 = new HalfProfileContainerFragment$onViewCreated$3(this.d, (m0.l.c) obj2);
        halfProfileContainerFragment$onViewCreated$3.c = valueOf.booleanValue();
        i iVar = i.a;
        halfProfileContainerFragment$onViewCreated$3.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        Window window;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        boolean z = this.c;
        Dialog dialog = this.d.e2;
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            HalfProfileContainerFragment halfProfileContainerFragment = this.d;
            if (z) {
                window.setNavigationBarColor(a.getColor(halfProfileContainerFragment.requireContext(), R.color.nav_bar_color_solid));
                window.clearFlags(2);
            } else {
                window.setNavigationBarColor(a.getColor(halfProfileContainerFragment.requireContext(), R.color.bottom_sheet_nav_bar_color));
                window.addFlags(2);
            }
        }
        return i.a;
    }
}
