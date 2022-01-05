package com.clubhouse.android.ui.hallway.buddyList;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.p.b0.q;
import i0.e.b.z2.f.e;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: BuddyListViewModel.kt */
public final class BuddyListViewModel$createClosedChannel$2 extends Lambda implements p<q, b<? extends ChannelInRoomWithAccess>, q> {
    public final /* synthetic */ BuddyListViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BuddyListViewModel$createClosedChannel$2(BuddyListViewModel buddyListViewModel) {
        super(2);
        this.c = buddyListViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        q qVar = (q) obj;
        b bVar = (b) obj2;
        i.e(qVar, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            this.c.o(new e((Channel) ((f0) bVar).b, SourceLocation.BUDDY_LIST));
        } else if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return qVar;
    }
}
