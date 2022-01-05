package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.g3.l.s1;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ClubMemberSearchViewModel.kt */
public final class ClubMemberSearchViewModel$removeFromClub$2 extends Lambda implements p<s1, b<? extends EmptySuccessResponse>, s1> {
    public final /* synthetic */ ClubMemberSearchViewModel c;
    public final /* synthetic */ String d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubMemberSearchViewModel$removeFromClub$2(ClubMemberSearchViewModel clubMemberSearchViewModel, String str) {
        super(2);
        this.c = clubMemberSearchViewModel;
        this.d = str;
    }

    public Object invoke(Object obj, Object obj2) {
        s1 s1Var = (s1) obj;
        b bVar = (b) obj2;
        i.e(s1Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            ClubMemberSearchViewModel clubMemberSearchViewModel = this.c;
            String string = clubMemberSearchViewModel.n.getString(R.string.left_club_message, new Object[]{this.d});
            i.d(string, "resources.getString(R.string.left_club_message, userName)");
            clubMemberSearchViewModel.o(new e(string));
        }
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return s1Var;
    }
}
