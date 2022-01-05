package com.clubhouse.android.ui.profile;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.c5;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: ProfileViewModel.kt */
public final class ProfileViewModel$cancelWave$2 extends Lambda implements p<c5, b<? extends i>, c5> {
    public final /* synthetic */ ProfileViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileViewModel$cancelWave$2(ProfileViewModel profileViewModel) {
        super(2);
        this.c = profileViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        c5 c5Var = (c5) obj;
        b bVar = (b) obj2;
        m0.n.b.i.e(c5Var, "$this$execute");
        m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return c5Var;
    }
}
