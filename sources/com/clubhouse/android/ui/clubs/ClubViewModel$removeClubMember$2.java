package com.clubhouse.android.ui.clubs;

import android.content.res.Resources;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.g3.l.v1;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$removeClubMember$2 extends Lambda implements p<v1, b<? extends EmptySuccessResponse>, v1> {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ClubViewModel d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$removeClubMember$2(boolean z, ClubViewModel clubViewModel, String str) {
        super(2);
        this.c = z;
        this.d = clubViewModel;
        this.q = str;
    }

    public Object invoke(Object obj, Object obj2) {
        String str;
        v1 v1Var = (v1) obj;
        b bVar = (b) obj2;
        i.e(v1Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            Integer num = v1Var.a;
            if (num != null) {
                ClubViewModel clubViewModel = this.d;
                num.intValue();
                ClubViewModel.s(clubViewModel, v1Var.a.intValue());
                ClubViewModel.q(clubViewModel, v1Var.a.intValue());
            }
            if (this.c) {
                ClubViewModel clubViewModel2 = this.d;
                Resources resources = clubViewModel2.o;
                Object[] objArr = new Object[1];
                ClubWithAdmin clubWithAdmin = v1Var.i;
                if (clubWithAdmin == null) {
                    str = null;
                } else {
                    str = clubWithAdmin.y;
                }
                objArr[0] = str;
                String string = resources.getString(R.string.self_left_club_message, objArr);
                i.d(string, "resources.getString(\n                                R.string.self_left_club_message,\n                                club?.name\n                            )");
                clubViewModel2.o(new e(string));
            } else {
                ClubViewModel clubViewModel3 = this.d;
                String string2 = clubViewModel3.o.getString(R.string.left_club_message, new Object[]{this.q});
                i.d(string2, "resources.getString(\n                                R.string.left_club_message,\n                                userName\n                            )");
                clubViewModel3.o(new e(string2));
            }
        }
        if (bVar instanceof c) {
            this.d.o(new d(((c) bVar).b.getMessage()));
        }
        return v1Var;
    }
}
