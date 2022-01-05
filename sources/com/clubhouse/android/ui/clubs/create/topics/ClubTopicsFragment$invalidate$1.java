package com.clubhouse.android.ui.clubs.create.topics;

import com.clubhouse.app.R;
import i0.e.b.g3.l.v2.z.d;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubTopicsFragment.kt */
public final class ClubTopicsFragment$invalidate$1 extends Lambda implements l<d, i> {
    public final /* synthetic */ ClubTopicsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubTopicsFragment$invalidate$1(ClubTopicsFragment clubTopicsFragment) {
        super(1);
        this.c = clubTopicsFragment;
    }

    public Object invoke(Object obj) {
        d dVar = (d) obj;
        m0.n.b.i.e(dVar, "state");
        if (dVar.a != null) {
            ClubTopicsFragment.N0(this.c).e.setText(dVar.a.getName());
        } else {
            ClubTopicsFragment.N0(this.c).e.setText(this.c.getString(R.string.club_choose_topics_title));
        }
        return i.a;
    }
}
