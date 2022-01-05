package com.clubhouse.android.ui.channels.viewholder;

import android.widget.ImageView;
import com.clubhouse.android.ui.channels.viewholder.ChannelSpeaker;
import com.clubhouse.app.R;
import i0.e.b.d3.k;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;
import n0.a.g2.d;

@c(c = "com.clubhouse.android.ui.channels.viewholder.ChannelSpeaker$bind$2", f = "ChannelSpeaker.kt", l = {47}, m = "invokeSuspend")
/* compiled from: ChannelSpeaker.kt */
public final class ChannelSpeaker$bind$2 extends SuspendLambda implements p<f0, m0.l.c<? super i>, Object> {
    public int c;
    public final /* synthetic */ ChannelSpeaker d;
    public final /* synthetic */ ChannelSpeaker.a q;

    @c(c = "com.clubhouse.android.ui.channels.viewholder.ChannelSpeaker$bind$2$1", f = "ChannelSpeaker.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.channels.viewholder.ChannelSpeaker$bind$2$1  reason: invalid class name */
    /* compiled from: ChannelSpeaker.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Boolean, m0.l.c<? super i>, Object> {
        public /* synthetic */ boolean c;

        public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(channelSpeaker, aVar, cVar);
            r02.c = ((Boolean) obj).booleanValue();
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
            AnonymousClass1 r02 = new AnonymousClass1(channelSpeaker, aVar, (m0.l.c) obj2);
            r02.c = valueOf.booleanValue();
            i iVar = i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            boolean z = this.c;
            ChannelSpeaker channelSpeaker = channelSpeaker;
            ImageView imageView = aVar.b().d;
            m0.n.b.i.d(imageView, "holder.binding.endBadge");
            Objects.requireNonNull(channelSpeaker);
            k.d(imageView, Integer.valueOf(R.drawable.ic_user_mute_badge), z, 0, 4);
            return i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelSpeaker$bind$2(ChannelSpeaker channelSpeaker, ChannelSpeaker.a aVar, m0.l.c<? super ChannelSpeaker$bind$2> cVar) {
        super(2, cVar);
        this.d = channelSpeaker;
        this.q = aVar;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new ChannelSpeaker$bind$2(this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new ChannelSpeaker$bind$2(this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            final ChannelSpeaker channelSpeaker = this.d;
            d<Boolean> dVar = channelSpeaker.m;
            final ChannelSpeaker.a aVar = this.q;
            AnonymousClass1 r3 = new AnonymousClass1((m0.l.c<? super AnonymousClass1>) null);
            this.c = 1;
            if (a.E0(dVar, r3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return i.a;
    }
}
