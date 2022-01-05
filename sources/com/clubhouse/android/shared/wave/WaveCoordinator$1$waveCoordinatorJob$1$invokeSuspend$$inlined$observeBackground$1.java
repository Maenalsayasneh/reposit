package com.clubhouse.android.shared.wave;

import androidx.lifecycle.Lifecycle;
import com.clubhouse.android.channels.ActiveChannelCoordinator;
import com.clubhouse.wave.WaveCoordinatorViewModel;
import h0.q.a0;
import h0.q.o;
import i0.e.e.f;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/clubhouse/android/shared/LifecycleUtil$observeBackground$1", "Lh0/q/o;", "Lm0/i;", "onMoveToBackground", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: LifecycleUtil.kt */
public final class WaveCoordinator$1$waveCoordinatorJob$1$invokeSuspend$$inlined$observeBackground$1 implements o {
    public final /* synthetic */ WaveCoordinator c;
    public final /* synthetic */ ActiveChannelCoordinator d;

    public WaveCoordinator$1$waveCoordinatorJob$1$invokeSuspend$$inlined$observeBackground$1(WaveCoordinator waveCoordinator, ActiveChannelCoordinator activeChannelCoordinator) {
        this.c = waveCoordinator;
        this.d = activeChannelCoordinator;
    }

    @a0(Lifecycle.Event.ON_STOP)
    public final void onMoveToBackground() {
        this.c.c = false;
        if (!this.d.d.getValue().booleanValue()) {
            WaveCoordinatorViewModel waveCoordinatorViewModel = this.c.d;
            if (waveCoordinatorViewModel != null) {
                waveCoordinatorViewModel.p(f.a);
            } else {
                i.m("viewModel");
                throw null;
            }
        }
    }
}
