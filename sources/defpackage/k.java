package defpackage;

import com.clubhouse.android.data.models.local.club.Club;
import i0.e.b.g3.p.c0.e0.r;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* renamed from: k  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class k extends Lambda implements l<Club, i> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(int i, Object obj) {
        super(1);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj) {
        int i = this.c;
        if (i == 0) {
            Club club = (Club) obj;
            l<? super Club, i> lVar = ((r) this.d).n;
            if (lVar != null) {
                m0.n.b.i.d(club, "club");
                lVar.invoke(club);
            }
            return i.a;
        } else if (i == 1) {
            Club club2 = (Club) obj;
            l<? super Club, i> lVar2 = ((r) this.d).o;
            if (lVar2 != null) {
                m0.n.b.i.d(club2, "club");
                lVar2.invoke(club2);
            }
            return i.a;
        } else {
            throw null;
        }
    }
}
