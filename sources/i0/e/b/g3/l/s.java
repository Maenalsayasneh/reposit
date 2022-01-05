package i0.e.b.g3.l;

import android.view.View;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.ui.clubs.ClubFragment;
import h0.b.a.d;
import h0.b0.v;
import i0.e.b.g3.l.y2.a;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class s implements View.OnClickListener {
    public final /* synthetic */ a c;
    public final /* synthetic */ ClubWithAdmin d;
    public final /* synthetic */ ClubFragment q;
    public final /* synthetic */ d x;

    public /* synthetic */ s(a aVar, ClubWithAdmin clubWithAdmin, ClubFragment clubFragment, d dVar) {
        this.c = aVar;
        this.d = clubWithAdmin;
        this.q = clubFragment;
        this.x = dVar;
    }

    public final void onClick(View view) {
        a aVar = this.c;
        ClubWithAdmin clubWithAdmin = this.d;
        ClubFragment clubFragment = this.q;
        d dVar = this.x;
        k<Object>[] kVarArr = ClubFragment.e2;
        i.e(aVar, "$upsellType");
        i.e(clubWithAdmin, "$club");
        i.e(clubFragment, "this$0");
        i.e(dVar, "$alertDialog");
        a e1 = v.e1(aVar, clubWithAdmin);
        if (!(aVar instanceof a.c) || ((a.c) aVar).c) {
            if (aVar instanceof a.d) {
                v.c2(clubFragment, b.d);
            }
            clubFragment.T0().p(new s2(e1));
            dVar.dismiss();
            return;
        }
        v.c2(clubFragment, b.c);
        dVar.dismiss();
    }
}
