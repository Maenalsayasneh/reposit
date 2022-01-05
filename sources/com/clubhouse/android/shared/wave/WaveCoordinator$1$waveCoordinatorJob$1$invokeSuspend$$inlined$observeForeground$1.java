package com.clubhouse.android.shared.wave;

import androidx.lifecycle.Lifecycle;
import com.clubhouse.wave.WaveCoordinatorViewModel;
import h0.q.a0;
import h0.q.o;
import i0.e.e.d;
import i0.e.e.h;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/clubhouse/android/shared/LifecycleUtil$observeForeground$1", "Lh0/q/o;", "Lm0/i;", "onMoveToForeground", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: LifecycleUtil.kt */
public final class WaveCoordinator$1$waveCoordinatorJob$1$invokeSuspend$$inlined$observeForeground$1 implements o {
    public final /* synthetic */ WaveCoordinator c;

    public WaveCoordinator$1$waveCoordinatorJob$1$invokeSuspend$$inlined$observeForeground$1(WaveCoordinator waveCoordinator) {
        this.c = waveCoordinator;
    }

    @a0(Lifecycle.Event.ON_START)
    public final void onMoveToForeground() {
        WaveCoordinator waveCoordinator = this.c;
        waveCoordinator.c = true;
        WaveCoordinatorViewModel waveCoordinatorViewModel = waveCoordinator.d;
        if (waveCoordinatorViewModel != null) {
            waveCoordinatorViewModel.p(d.a);
            WaveCoordinatorViewModel waveCoordinatorViewModel2 = this.c.d;
            if (waveCoordinatorViewModel2 != null) {
                waveCoordinatorViewModel2.p(h.a);
            } else {
                i.m("viewModel");
                throw null;
            }
        } else {
            i.m("viewModel");
            throw null;
        }
    }
}
