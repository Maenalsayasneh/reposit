package com.clubhouse.android.shared.ui;

import androidx.lifecycle.Lifecycle;
import com.clubhouse.android.core.ui.Banner;
import h0.q.a0;
import h0.q.o;
import h0.q.p;
import h0.q.z;

/* compiled from: LiveData.kt */
public final class AppBannerHandler$special$$inlined$observeDestroy$1<T> implements z<T> {
    public final /* synthetic */ AppBannerHandler a;

    public AppBannerHandler$special$$inlined$observeDestroy$1(AppBannerHandler appBannerHandler) {
        this.a = appBannerHandler;
    }

    public final void onChanged(T t) {
        Lifecycle lifecycle = ((p) t).getLifecycle();
        final AppBannerHandler appBannerHandler = this.a;
        lifecycle.a(new o() {
            @a0(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                Banner banner;
                Banner banner2 = appBannerHandler.c;
                if ((banner2 != null && !banner2.b()) && (banner = appBannerHandler.c) != null) {
                    banner.dismiss();
                }
            }
        });
    }
}
