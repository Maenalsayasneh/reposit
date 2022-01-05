package com.clubhouse.android.ui.channels.raisedhands;

import android.widget.TextView;
import com.clubhouse.app.R;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: RaisedHandsQueueFragment.kt */
public final class RaisedHandsQueueFragment$invalidate$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ RaisedHandsQueueFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RaisedHandsQueueFragment$invalidate$1(RaisedHandsQueueFragment raisedHandsQueueFragment) {
        super(1);
        this.c = raisedHandsQueueFragment;
    }

    public Object invoke(Object obj) {
        String str;
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "state");
        RaisedHandsQueueFragment raisedHandsQueueFragment = this.c;
        k<Object>[] kVarArr = RaisedHandsQueueFragment.l2;
        raisedHandsQueueFragment.T0().d.g();
        TextView textView = this.c.T0().a;
        if (lVar.D) {
            str = this.c.getString(lVar.a.j.getDescription());
        } else {
            str = this.c.getString(R.string.raised_hands_off);
        }
        textView.setText(str);
        if (!lVar.D) {
            this.c.T0().c.setVisibility(0);
            this.c.T0().c.setText(this.c.getString(R.string.raised_hands_turned_off));
        } else if (lVar.F.isEmpty()) {
            this.c.T0().c.setVisibility(0);
            this.c.T0().c.setText(this.c.getString(R.string.raised_hands_empty));
        } else {
            this.c.T0().c.setVisibility(4);
        }
        return i.a;
    }
}
