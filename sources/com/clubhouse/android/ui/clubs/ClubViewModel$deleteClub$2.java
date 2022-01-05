package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.l.d1;
import i0.e.b.g3.l.v1;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$deleteClub$2 extends Lambda implements p<v1, b<? extends EmptySuccessResponse>, v1> {
    public final /* synthetic */ ClubViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$deleteClub$2(ClubViewModel clubViewModel) {
        super(2);
        this.c = clubViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        v1 v1Var = (v1) obj;
        b bVar = (b) obj2;
        i.e(v1Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            this.c.o(d1.a);
        } else if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return v1Var;
    }
}
