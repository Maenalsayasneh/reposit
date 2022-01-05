package com.clubhouse.android.ui.clubs.nominations;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.l.a3.q;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: ClubNominationsViewModel.kt */
public final class ClubNominationsViewModel$rejectNomination$2 extends Lambda implements p<q, b<? extends EmptySuccessResponse>, q> {
    public final /* synthetic */ ClubNominationsViewModel c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubNominationsViewModel$rejectNomination$2(ClubNominationsViewModel clubNominationsViewModel, int i) {
        super(2);
        this.c = clubNominationsViewModel;
        this.d = i;
    }

    public Object invoke(Object obj, Object obj2) {
        q qVar = (q) obj;
        b bVar = (b) obj2;
        i.e(qVar, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            ClubNominationsViewModel clubNominationsViewModel = this.c;
            final int i = this.d;
            clubNominationsViewModel.m(new l<q, q>() {
                public Object invoke(Object obj) {
                    q qVar = (q) obj;
                    i.e(qVar, "$this$setState");
                    return q.copy$default(qVar, 0, (List) null, (Set) null, g.e0(qVar.d, Integer.valueOf(i)), false, 23, (Object) null);
                }
            });
        }
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return qVar;
    }
}
