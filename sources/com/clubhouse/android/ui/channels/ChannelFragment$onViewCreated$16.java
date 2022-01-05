package com.clubhouse.android.ui.channels;

import android.widget.ImageView;
import com.clubhouse.android.channels.R;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import m0.r.k;

@c(c = "com.clubhouse.android.ui.channels.ChannelFragment$onViewCreated$16", f = "ChannelFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$onViewCreated$16 extends SuspendLambda implements p<Boolean, m0.l.c<? super i>, Object> {
    public /* synthetic */ boolean c;
    public final /* synthetic */ ChannelFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$onViewCreated$16(ChannelFragment channelFragment, m0.l.c<? super ChannelFragment$onViewCreated$16> cVar) {
        super(2, cVar);
        this.d = channelFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ChannelFragment$onViewCreated$16 channelFragment$onViewCreated$16 = new ChannelFragment$onViewCreated$16(this.d, cVar);
        channelFragment$onViewCreated$16.c = ((Boolean) obj).booleanValue();
        return channelFragment$onViewCreated$16;
    }

    public Object invoke(Object obj, Object obj2) {
        Boolean valueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        ChannelFragment$onViewCreated$16 channelFragment$onViewCreated$16 = new ChannelFragment$onViewCreated$16(this.d, (m0.l.c) obj2);
        channelFragment$onViewCreated$16.c = valueOf.booleanValue();
        i iVar = i.a;
        channelFragment$onViewCreated$16.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        boolean z = this.c;
        ChannelFragment channelFragment = this.d;
        k<Object>[] kVarArr = ChannelFragment.Z1;
        ImageView imageView = channelFragment.Q0().p;
        m0.n.b.i.d(imageView, "binding.iconMute");
        m0.n.b.i.e(imageView, "<this>");
        if (z) {
            imageView.setContentDescription(imageView.getResources().getString(R.string.cd_unmute));
            imageView.setImageResource(R.drawable.ic_muted);
        } else {
            imageView.setContentDescription(imageView.getResources().getString(R.string.cd_mute));
            imageView.setImageResource(R.drawable.ic_unmuted);
        }
        return i.a;
    }
}
