package defpackage;

import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.clubs.ClubFragment;
import com.clubhouse.android.ui.clubs.ClubFragment$buildHeaderModelForMember$2$2$1$1$1;
import com.clubhouse.android.ui.clubs.ClubFragment$buildHeaderModelForMember$2$2$1$2$1;
import com.clubhouse.app.R;
import i0.e.b.g3.i.c;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: v  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class v extends Lambda implements l<c, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(int i, Object obj, Object obj2) {
        super(1);
        this.c = i;
        this.d = obj;
        this.q = obj2;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            c cVar = (c) obj;
            m0.n.b.i.e(cVar, "$this$action");
            String string = ((ClubFragment) this.d).getString(R.string.view_rules);
            m0.n.b.i.d(string, "getString(R.string.view_rules)");
            cVar.b(string);
            cVar.a(new ClubFragment$buildHeaderModelForMember$2$2$1$1$1((ClubFragment) this.d, (ClubWithAdmin) this.q));
            return i.a;
        } else if (i == 1) {
            c cVar2 = (c) obj;
            m0.n.b.i.e(cVar2, "$this$action");
            String string2 = ((ClubFragment) this.d).getString(R.string.leave_club);
            m0.n.b.i.d(string2, "getString(R.string.leave_club)");
            cVar2.b(string2);
            cVar2.a(new ClubFragment$buildHeaderModelForMember$2$2$1$2$1((ClubFragment) this.d, (ClubWithAdmin) this.q));
            return i.a;
        } else {
            throw null;
        }
    }
}
