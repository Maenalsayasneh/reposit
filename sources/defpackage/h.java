package defpackage;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.ClubFragment$showOverflowMenu$1;
import h0.b0.v;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* renamed from: h  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class h extends Lambda implements l<EventInClub, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            EventInClub eventInClub = (EventInClub) obj;
            ClubFragment clubFragment = (ClubFragment) this.d;
            m0.n.b.i.d(eventInClub, "event");
            k<Object>[] kVarArr = ClubFragment.e2;
            Objects.requireNonNull(clubFragment);
            v.e(clubFragment, new ClubFragment$showOverflowMenu$1(eventInClub, clubFragment));
            return i.a;
        } else if (i == 1) {
            EventInClub eventInClub2 = (EventInClub) obj;
            m0.n.b.i.d(eventInClub2, "event");
            ClubFragment.R0((ClubFragment) this.d, eventInClub2);
            return i.a;
        } else {
            throw null;
        }
    }
}
