package com.clubhouse.android.channels.mvi;

import com.clubhouse.android.shared.preferences.Key;
import i0.e.b.f3.k.b;
import i0.e.b.z2.g.v0;
import i0.j.f.p.h;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.i;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

/* compiled from: ChannelViewModel.kt */
public final class ChannelViewModel$maybeShowClipsNux$1 extends Lambda implements l<i0.e.b.z2.g.l, i> {
    public final /* synthetic */ ChannelViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.channels.mvi.ChannelViewModel$maybeShowClipsNux$1$1", f = "ChannelViewModel.kt", l = {553}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.channels.mvi.ChannelViewModel$maybeShowClipsNux$1$1  reason: invalid class name */
    /* compiled from: ChannelViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements p<f0, c<? super i>, Object> {
        public int c;

        public final c<i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            return new AnonymousClass1((c) obj2).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                long millis = TimeUnit.SECONDS.toMillis(1);
                this.c = 1;
                if (a.d1(millis, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = ChannelViewModel.this.n;
            Objects.requireNonNull(bVar);
            Key key = Key.KEY_HAS_SEEN_CLIPS_NUX;
            if (!bVar.a(key, false)) {
                ChannelViewModel.this.o(v0.a);
                b bVar2 = ChannelViewModel.this.n;
                Objects.requireNonNull(bVar2);
                bVar2.g(key, true);
            }
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelViewModel$maybeShowClipsNux$1(ChannelViewModel channelViewModel) {
        super(1);
        this.c = channelViewModel;
    }

    public Object invoke(Object obj) {
        i0.e.b.z2.g.l lVar = (i0.e.b.z2.g.l) obj;
        m0.n.b.i.e(lVar, "state");
        if (lVar.U) {
            b bVar = this.c.n;
            Objects.requireNonNull(bVar);
            if (!bVar.a(Key.KEY_HAS_SEEN_CLIPS_NUX, false)) {
                final ChannelViewModel channelViewModel = this.c;
                a.E2(channelViewModel.c, (e) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
            }
        }
        return i.a;
    }
}
