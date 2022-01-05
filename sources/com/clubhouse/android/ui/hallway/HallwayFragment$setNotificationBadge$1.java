package com.clubhouse.android.ui.hallway;

import android.widget.ImageView;
import com.clubhouse.android.core.R;
import i0.e.b.a3.f.q;
import i0.e.b.g3.p.r;
import i0.e.b.g3.p.t;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: HallwayFragment.kt */
public final class HallwayFragment$setNotificationBadge$1 extends Lambda implements l<r, i> {
    public final /* synthetic */ HallwayFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallwayFragment$setNotificationBadge$1(HallwayFragment hallwayFragment) {
        super(1);
        this.c = hallwayFragment;
    }

    public Object invoke(Object obj) {
        r rVar = (r) obj;
        m0.n.b.i.e(rVar, "state");
        t a = rVar.e.a();
        if (a == null) {
            return null;
        }
        HallwayFragment hallwayFragment = this.c;
        q qVar = q.a;
        k<Object>[] kVarArr = HallwayFragment.Z1;
        ImageView imageView = hallwayFragment.N0().f;
        m0.n.b.i.d(imageView, "binding\n                    .notificationIcon");
        boolean z = a.a;
        int i = a.b;
        m0.n.b.i.e(imageView, "<this>");
        if (i > 0) {
            qVar.a(imageView, i, R.xml.badge_style);
        } else if (z) {
            imageView.setImageResource(R.drawable.ic_notification_on);
        } else {
            imageView.setImageResource(R.drawable.ic_notification_off);
        }
        return i.a;
    }
}
