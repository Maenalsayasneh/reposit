package com.clubhouse.android.shared;

import androidx.lifecycle.Lifecycle;
import h0.q.a0;
import h0.q.o;
import h0.q.p;
import h0.q.z;

/* compiled from: LiveData.kt */
public final class FragmentViewBindingDelegate$getValue$$inlined$observeDestroy$1<T> implements z<T> {
    public final /* synthetic */ FragmentViewBindingDelegate a;

    public FragmentViewBindingDelegate$getValue$$inlined$observeDestroy$1(FragmentViewBindingDelegate fragmentViewBindingDelegate) {
        this.a = fragmentViewBindingDelegate;
    }

    public final void onChanged(T t) {
        Lifecycle lifecycle = ((p) t).getLifecycle();
        final FragmentViewBindingDelegate fragmentViewBindingDelegate = this.a;
        lifecycle.a(new o() {
            @a0(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                fragmentViewBindingDelegate.c = null;
            }
        });
    }
}
