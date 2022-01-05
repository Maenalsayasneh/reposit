package i0.e.b.g3.l.c3;

import android.view.View;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.ui.clubs.viewholder.ClubEvents$bindEvents$1;
import m0.n.a.l;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ l c;
    public final /* synthetic */ EventInClub d;

    public /* synthetic */ b(l lVar, EventInClub eventInClub) {
        this.c = lVar;
        this.d = eventInClub;
    }

    public final void onClick(View view) {
        ClubEvents$bindEvents$1.m27buildModels$lambda4$lambda3$lambda1$lambda0(this.c, this.d, view);
    }
}
