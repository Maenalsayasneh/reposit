package com.clubhouse.android.ui.profile;

import androidx.lifecycle.Lifecycle;
import com.clubhouse.android.ui.profile.ProfileFragment;
import h0.b0.v;
import h0.q.a0;
import h0.q.o;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/clubhouse/android/shared/LifecycleUtil$observeResume$1", "Lh0/q/o;", "Lm0/i;", "onResume", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: LifecycleUtil.kt */
public final class ProfileFragment$onViewCreated$$inlined$observeResume$1 implements o {
    public final /* synthetic */ ProfileFragment c;

    public ProfileFragment$onViewCreated$$inlined$observeResume$1(ProfileFragment profileFragment) {
        this.c = profileFragment;
    }

    @a0(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        v.v2(this.c.P0(), new ProfileFragment.a(1, this.c));
    }
}
