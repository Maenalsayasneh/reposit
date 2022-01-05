package com.clubhouse.backchannel.container;

import android.content.res.Resources;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import h0.b0.v;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: BackchannelModalContainerFragment.kt */
public final class BackchannelModalContainerFragment$onStart$1 extends Lambda implements p<Boolean, Integer, i> {
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ BackchannelModalContainerFragment d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelModalContainerFragment$onStart$1(ViewGroup viewGroup, BackchannelModalContainerFragment backchannelModalContainerFragment, int i) {
        super(2);
        this.c = viewGroup;
        this.d = backchannelModalContainerFragment;
        this.q = i;
    }

    public Object invoke(Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        ViewGroup viewGroup = this.c;
        AutoTransition autoTransition = new AutoTransition();
        Resources resources = this.d.getResources();
        m0.n.b.i.d(resources, "resources");
        TransitionManager.beginDelayedTransition(viewGroup, autoTransition.setDuration(v.Y1(resources)).setOrdering(0));
        if (booleanValue) {
            this.c.getLayoutParams().height = (int) (((float) this.q) * 0.95f);
        } else {
            this.c.getLayoutParams().height = (int) (((float) this.q) * 0.7f);
        }
        this.c.requestLayout();
        return i.a;
    }
}
