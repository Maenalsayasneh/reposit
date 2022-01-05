package com.clubhouse.android.ui.search;

import com.clubhouse.android.data.models.remote.response.JoinClubResponse;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.c;
import i0.e.b.a3.b.d;
import i0.e.b.b3.b.e.e;
import i0.e.b.g3.w.y;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ExploreV2ViewModel.kt */
public final class ExploreV2ViewModel$joinClub$2 extends Lambda implements p<y, b<? extends JoinClubResponse>, y> {
    public final /* synthetic */ ExploreV2ViewModel c;
    public final /* synthetic */ e d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExploreV2ViewModel$joinClub$2(ExploreV2ViewModel exploreV2ViewModel, e eVar) {
        super(2);
        this.c = exploreV2ViewModel;
        this.d = eVar;
    }

    public Object invoke(Object obj, Object obj2) {
        y yVar = (y) obj;
        b bVar = (b) obj2;
        i.e(yVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof c) {
            ExploreV2ViewModel exploreV2ViewModel = this.c;
            exploreV2ViewModel.o(new d(exploreV2ViewModel.o.getString(R.string.join_club_error, new Object[]{this.d.b.y})));
        }
        return yVar;
    }
}
