package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.app.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.e;
import i0.b.b.f0;
import i0.e.b.g3.u.z5.e1;
import i0.e.b.g3.u.z5.q0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: DeactivateViewModel.kt */
public final class DeactivateViewModel$deactivateAccount$2 extends Lambda implements p<q0, b<? extends EmptySuccessResponse>, q0> {
    public final /* synthetic */ DeactivateViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeactivateViewModel$deactivateAccount$2(DeactivateViewModel deactivateViewModel) {
        super(2);
        this.c = deactivateViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj2;
        i.e((q0) obj, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            this.c.n.d(Integer.valueOf(R.string.deactivate_success));
            return new q0(false);
        } else if (!(bVar instanceof c)) {
            return new q0(bVar instanceof e);
        } else {
            this.c.o(new e1(((c) bVar).b.getMessage()));
            return new q0(false);
        }
    }
}
