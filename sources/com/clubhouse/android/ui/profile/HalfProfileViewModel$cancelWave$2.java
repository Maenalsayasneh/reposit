package com.clubhouse.android.ui.profile;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.q4;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$cancelWave$2 extends Lambda implements p<q4, b<? extends i>, q4> {
    public final /* synthetic */ HalfProfileViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$cancelWave$2(HalfProfileViewModel halfProfileViewModel) {
        super(2);
        this.c = halfProfileViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        q4 q4Var = (q4) obj;
        b bVar = (b) obj2;
        m0.n.b.i.e(q4Var, "$this$execute");
        m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return q4Var;
    }
}
