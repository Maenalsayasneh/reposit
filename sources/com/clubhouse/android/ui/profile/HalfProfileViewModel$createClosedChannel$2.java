package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.q4;
import i0.e.b.z2.f.e;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$createClosedChannel$2 extends Lambda implements p<q4, b<? extends ChannelInRoomWithAccess>, q4> {
    public final /* synthetic */ HalfProfileViewModel c;
    public final /* synthetic */ SourceLocation d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$createClosedChannel$2(HalfProfileViewModel halfProfileViewModel, SourceLocation sourceLocation) {
        super(2);
        this.c = halfProfileViewModel;
        this.d = sourceLocation;
    }

    public Object invoke(Object obj, Object obj2) {
        q4 q4Var = (q4) obj;
        b bVar = (b) obj2;
        i.e(q4Var, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            this.c.o(new e((Channel) ((f0) bVar).b, this.d));
        } else if (bVar instanceof c) {
            this.c.o(new d(((c) bVar).b.getMessage()));
        }
        return q4Var;
    }
}
