package com.clubhouse.android.ui.events.creation;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.user.model.UserSelf;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.e;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.o.w0.c0;
import i0.e.b.g3.o.w0.w;
import j$.time.OffsetDateTime;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: AddEditEventViewModel.kt */
public final class AddEditEventViewModel$deleteEvent$2$1$2 extends Lambda implements p<w, b<? extends EmptySuccessResponse>, w> {
    public final /* synthetic */ AddEditEventViewModel c;
    public final /* synthetic */ w d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventViewModel$deleteEvent$2$1$2(AddEditEventViewModel addEditEventViewModel, w wVar) {
        super(2);
        this.c = addEditEventViewModel;
        this.d = wVar;
    }

    public Object invoke(Object obj, Object obj2) {
        w wVar = (w) obj;
        b bVar = (b) obj2;
        i.e(wVar, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            AddEditEventViewModel addEditEventViewModel = this.c;
            c0 c0Var = new c0(this.d.a);
            int i = AddEditEventViewModel.m;
            addEditEventViewModel.o(c0Var);
        } else if (bVar instanceof c) {
            AddEditEventViewModel addEditEventViewModel2 = this.c;
            d dVar = new d(((c) bVar).b.getMessage());
            int i2 = AddEditEventViewModel.m;
            addEditEventViewModel2.o(dVar);
        }
        return w.copy$default(wVar, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, false, false, (List) null, false, (UserSelf) null, (ClubWithAdmin) null, (List) null, bVar instanceof e, 16383, (Object) null);
    }
}
