package com.clubhouse.backchannel.chat;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.request.CreateChannelRequest;
import com.clubhouse.android.data.repos.ChannelRepo;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.f;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.z2.f.e;
import i0.e.c.c.y;
import i0.e.c.f.b.a.a;
import i0.j.f.p.h;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: BackchannelChatViewModel.kt */
public final class BackchannelChatViewModel$startRoom$1 extends Lambda implements l<y, i> {
    public final /* synthetic */ BackchannelChatViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.backchannel.chat.BackchannelChatViewModel$startRoom$1$1", f = "BackchannelChatViewModel.kt", l = {226}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.backchannel.chat.BackchannelChatViewModel$startRoom$1$1  reason: invalid class name */
    /* compiled from: BackchannelChatViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super ChannelInRoomWithAccess>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1((c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                BackchannelChatViewModel backchannelChatViewModel = BackchannelChatViewModel.this;
                ChannelRepo channelRepo = backchannelChatViewModel.q;
                CreateChannelRequest createChannelRequest = new CreateChannelRequest(false, true, (List) null, (Integer) null, (Integer) null, (String) null, backchannelChatViewModel.n.a, SourceLocation.BACKCHANNEL, 60);
                this.c = 1;
                obj = channelRepo.g(createChannelRequest, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackchannelChatViewModel$startRoom$1(BackchannelChatViewModel backchannelChatViewModel) {
        super(1);
        this.c = backchannelChatViewModel;
    }

    public Object invoke(Object obj) {
        y yVar = (y) obj;
        m0.n.b.i.e(yVar, "state");
        if (!yVar.i) {
            final BackchannelChatViewModel backchannelChatViewModel = this.c;
            AnonymousClass1 r1 = new AnonymousClass1((c<? super AnonymousClass1>) null);
            final BackchannelChatViewModel backchannelChatViewModel2 = this.c;
            MavericksViewModel.f(backchannelChatViewModel, r1, (d0) null, (m) null, new p<y, b<? extends ChannelInRoomWithAccess>, y>() {
                public Object invoke(Object obj, Object obj2) {
                    y yVar = (y) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(yVar, "$this$execute");
                    m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                    if (bVar instanceof f0) {
                        BackchannelChatViewModel backchannelChatViewModel = BackchannelChatViewModel.this;
                        e eVar = new e((Channel) ((f0) bVar).b, SourceLocation.BACKCHANNEL);
                        int i = BackchannelChatViewModel.m;
                        backchannelChatViewModel.o(eVar);
                    } else if (bVar instanceof i0.b.b.c) {
                        BackchannelChatViewModel backchannelChatViewModel2 = BackchannelChatViewModel.this;
                        d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                        int i2 = BackchannelChatViewModel.m;
                        backchannelChatViewModel2.o(dVar);
                    }
                    return y.copy$default(yVar, (String) null, (a) null, (List) null, false, false, (Map) null, false, false, bVar instanceof f, 255, (Object) null);
                }
            }, 3, (Object) null);
        }
        return i.a;
    }
}
