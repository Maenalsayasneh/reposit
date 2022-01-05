package com.clubhouse.android.ui.profile;

import androidx.appcompat.app.AlertController;
import com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.e.b.g3.u.j1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$handleCreateClubResponse$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ GetCanCreateClubResponse c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$handleCreateClubResponse$1(GetCanCreateClubResponse getCanCreateClubResponse) {
        super(1);
        this.c = getCanCreateClubResponse;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        m0.n.b.i.e(aVar, "$this$alertDialog");
        GetCanCreateClubResponse getCanCreateClubResponse = this.c;
        String str = getCanCreateClubResponse.c;
        AlertController.b bVar = aVar.a;
        bVar.d = str;
        bVar.f = getCanCreateClubResponse.d;
        aVar.d(R.string.ok, j1.c);
        return i.a;
    }
}
