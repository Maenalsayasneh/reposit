package i0.e.b.g3.p.c0.e0;

import android.view.View;
import com.clubhouse.android.data.models.local.club.Club;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ p c;
    public final /* synthetic */ Club d;

    public /* synthetic */ b(p pVar, Club club) {
        this.c = pVar;
        this.d = club;
    }

    public final void onClick(View view) {
        p pVar = this.c;
        Club club = this.d;
        i.e(pVar, "this$0");
        i.e(club, "$it");
        l<? super Club, m0.i> lVar = pVar.k;
        if (lVar != null) {
            lVar.invoke(club);
        }
    }
}
