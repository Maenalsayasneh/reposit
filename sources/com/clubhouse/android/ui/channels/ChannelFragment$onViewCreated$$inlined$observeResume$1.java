package com.clubhouse.android.ui.channels;

import androidx.lifecycle.Lifecycle;
import h0.q.a0;
import h0.q.o;
import i0.e.b.z2.g.h0;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/clubhouse/android/shared/LifecycleUtil$observeResume$1", "Lh0/q/o;", "Lm0/i;", "onResume", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: LifecycleUtil.kt */
public final class ChannelFragment$onViewCreated$$inlined$observeResume$1 implements o {
    public final /* synthetic */ ChannelFragment c;

    public ChannelFragment$onViewCreated$$inlined$observeResume$1(ChannelFragment channelFragment) {
        this.c = channelFragment;
    }

    @a0(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.c.S0().p(h0.a);
    }
}
