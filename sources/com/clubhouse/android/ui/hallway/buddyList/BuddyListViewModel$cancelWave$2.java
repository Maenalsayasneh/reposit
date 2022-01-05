package com.clubhouse.android.ui.hallway.buddyList;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.e.b.a3.b.d;
import i0.e.b.g3.p.b0.q;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.p;

/* compiled from: BuddyListViewModel.kt */
public final class BuddyListViewModel$cancelWave$2 extends Lambda implements p<q, b<? extends i>, q> {
    public final /* synthetic */ BuddyListViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListViewModel$cancelWave$2(BuddyListViewModel buddyListViewModel) {
        super(2);
        this.c = buddyListViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        q qVar = (q) obj;
        b bVar = (b) obj2;
        m0.n.b.i.e(qVar, "$this$execute");
        m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return qVar;
    }
}
