package com.clubhouse.android.ui.clubs.invites;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.user.model.User;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.u.w;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.l.x2.t;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import m0.j.g;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: GrowClubViewModel.kt */
public final class GrowClubViewModel$addToClub$2 extends Lambda implements p<t, b<? extends EmptySuccessResponse>, t> {
    public final /* synthetic */ User c;
    public final /* synthetic */ GrowClubViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GrowClubViewModel$addToClub$2(User user, GrowClubViewModel growClubViewModel) {
        super(2);
        this.c = user;
        this.d = growClubViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        t tVar = (t) obj;
        b bVar = (b) obj2;
        i.e(tVar, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            return t.copy$default(tVar, 0, false, (w) null, (w) null, g.T(tVar.e, this.c.getId()), g.e0(tVar.f, this.c.getId()), (String) null, (b) null, 207, (Object) null);
        }
        if (!(bVar instanceof c)) {
            return t.copy$default(tVar, 0, false, (w) null, (w) null, g.e0(tVar.e, this.c.getId()), (Set) null, (String) null, (b) null, 239, (Object) null);
        }
        this.d.o(new d(((c) bVar).b.getMessage()));
        return t.copy$default(tVar, 0, false, (w) null, (w) null, g.T(tVar.e, this.c.getId()), (Set) null, (String) null, (b) null, 239, (Object) null);
    }
}
