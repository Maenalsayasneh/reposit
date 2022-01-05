package com.clubhouse.android.ui.clubs;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.g3.l.y;
import i0.e.b.g3.l.z;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: ClubFragment.kt */
public final class ClubFragment$bindMenuForAdmin$1$1$1$2 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ ClubFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubFragment$bindMenuForAdmin$1$1$1$2(ClubFragment clubFragment) {
        super(1);
        this.c = clubFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        a.j(aVar, "$this$alertDialog", R.string.delete_club, R.string.delete_club_message);
        aVar.d(R.string.delete, new z(this.c));
        aVar.c(R.string.cancel, y.c);
        return i.a;
    }
}
