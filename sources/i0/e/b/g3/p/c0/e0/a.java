package i0.e.b.g3.p.c0.e0;

import android.view.View;
import com.clubhouse.android.data.models.local.club.Club;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ Club c;
    public final /* synthetic */ p d;

    public /* synthetic */ a(Club club, p pVar) {
        this.c = club;
        this.d = pVar;
    }

    public final void onClick(View view) {
        Club club = this.c;
        p pVar = this.d;
        i.e(club, "$it");
        i.e(pVar, "this$0");
        if (club.O()) {
            l<? super Club, m0.i> lVar = pVar.l;
            if (lVar != null) {
                lVar.invoke(club);
                return;
            }
            return;
        }
        l<? super Club, m0.i> lVar2 = pVar.m;
        if (lVar2 != null) {
            lVar2.invoke(club);
        }
    }
}
