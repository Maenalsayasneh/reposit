package com.clubhouse.android.ui.clubs.nominations;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.l.a3.q;
import i0.e.b.g3.l.a3.r;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ClubNominationsViewModel.kt */
public final class ClubNominationsViewModel$rejectAllNominations$2 extends Lambda implements p<q, b<? extends EmptySuccessResponse>, q> {
    public final /* synthetic */ ClubNominationsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubNominationsViewModel$rejectAllNominations$2(ClubNominationsViewModel clubNominationsViewModel) {
        super(2);
        this.c = clubNominationsViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        q qVar = (q) obj;
        b bVar = (b) obj2;
        i.e(qVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            this.c.o(r.a);
        }
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return qVar;
    }
}
