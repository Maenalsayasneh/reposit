package com.clubhouse.android.shared.ui;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.clubhouse.android.core.ui.Banner;
import h0.q.p;
import i0.e.b.a3.f.b;
import i0.e.b.a3.f.j;
import i0.e.e.m.c;
import m0.n.b.i;

/* compiled from: AppBannerHandler.kt */
public final class AppBannerHandler implements b {
    public final Activity a;
    public final Fragment b;
    public Banner c;

    /* compiled from: ViewUtil.kt */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public final /* synthetic */ View c;

        public a(View view) {
            this.c = view;
        }

        public void onGlobalLayout() {
            if (this.c.getMeasuredWidth() > 0 && this.c.getMeasuredHeight() > 0) {
                this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                View view = this.c;
                view.setTranslationY(-((float) view.getHeight()));
                view.animate().translationY(0.0f).start();
            }
        }
    }

    public AppBannerHandler(Activity activity, Fragment fragment) {
        i.e(activity, "activity");
        this.a = activity;
        this.b = fragment;
        if (fragment != null) {
            LiveData<p> viewLifecycleOwnerLiveData = fragment.getViewLifecycleOwnerLiveData();
            i.d(viewLifecycleOwnerLiveData, "viewLifecycleOwnerLiveData");
            viewLifecycleOwnerLiveData.observe(fragment, new AppBannerHandler$special$$inlined$observeDestroy$1(this));
        }
    }

    public void a() {
        Banner banner = this.c;
        if (banner != null) {
            banner.dismiss();
        }
    }

    public void b() {
        Banner banner = this.c;
        c cVar = banner instanceof c ? (c) banner : null;
        if (cVar != null) {
            cVar.a.d(cVar);
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v8, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        r0 = (r0 = (r0 = (r0 = (r0 = (r0 = r0.getView()).getParent()).getParent()).getParent()).getParent()).getParent();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(com.clubhouse.android.core.ui.Banner r8) {
        /*
            r7 = this;
            java.lang.String r0 = "banner"
            m0.n.b.i.e(r8, r0)
            com.clubhouse.android.core.ui.Banner r0 = r7.c
            if (r0 != 0) goto L_0x000a
            goto L_0x000d
        L_0x000a:
            r0.dismiss()
        L_0x000d:
            r7.c = r8
            androidx.fragment.app.Fragment r0 = r7.b
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != 0) goto L_0x0017
            goto L_0x0029
        L_0x0017:
            java.lang.String r4 = "$this$findNavController"
            m0.n.b.i.f(r0, r4)
            androidx.navigation.NavController r0 = androidx.navigation.fragment.NavHostFragment.I0(r0)
            java.lang.String r4 = "NavHostFragment.findNavController(this)"
            m0.n.b.i.b(r0, r4)
            java.util.Deque<h0.t.f> r0 = r0.h
            if (r0 != 0) goto L_0x002b
        L_0x0029:
            r4 = r2
            goto L_0x004e
        L_0x002b:
            java.util.Iterator r0 = r0.iterator()
        L_0x002f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x004b
            java.lang.Object r4 = r0.next()
            r5 = r4
            h0.t.f r5 = (h0.t.f) r5
            h0.t.k r5 = r5.d
            int r5 = r5.q
            r6 = 2131362696(0x7f0a0388, float:1.834518E38)
            if (r5 != r6) goto L_0x0047
            r5 = r1
            goto L_0x0048
        L_0x0047:
            r5 = r3
        L_0x0048:
            if (r5 == 0) goto L_0x002f
            goto L_0x004c
        L_0x004b:
            r4 = r2
        L_0x004c:
            h0.t.f r4 = (h0.t.f) r4
        L_0x004e:
            if (r4 == 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r1 = r3
        L_0x0052:
            if (r1 == 0) goto L_0x0090
            androidx.fragment.app.Fragment r0 = r7.b
            if (r0 != 0) goto L_0x0059
            goto L_0x0082
        L_0x0059:
            android.view.View r0 = r0.getView()
            if (r0 != 0) goto L_0x0060
            goto L_0x0082
        L_0x0060:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0067
            goto L_0x0082
        L_0x0067:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x006e
            goto L_0x0082
        L_0x006e:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0075
            goto L_0x0082
        L_0x0075:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x007c
            goto L_0x0082
        L_0x007c:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0084
        L_0x0082:
            r0 = r2
            goto L_0x0088
        L_0x0084:
            android.view.ViewParent r0 = r0.getParent()
        L_0x0088:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x00d6
            r2 = r0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x00d6
        L_0x0090:
            androidx.fragment.app.Fragment r0 = r7.b
            boolean r1 = r0 instanceof androidx.fragment.app.DialogFragment
            if (r1 == 0) goto L_0x00b0
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            android.app.Dialog r0 = r0.e2
            if (r0 != 0) goto L_0x009d
            goto L_0x00a8
        L_0x009d:
            android.view.Window r0 = r0.getWindow()
            if (r0 != 0) goto L_0x00a4
            goto L_0x00a8
        L_0x00a4:
            android.view.View r2 = r0.getDecorView()
        L_0x00a8:
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            java.util.Objects.requireNonNull(r2, r0)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x00d6
        L_0x00b0:
            if (r0 != 0) goto L_0x00b3
            goto L_0x00c9
        L_0x00b3:
            android.view.View r0 = r0.getView()
            if (r0 != 0) goto L_0x00ba
            goto L_0x00c9
        L_0x00ba:
            android.view.View r0 = r0.getRootView()
            if (r0 != 0) goto L_0x00c1
            goto L_0x00c9
        L_0x00c1:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x00c9
            r2 = r0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L_0x00d6
        L_0x00c9:
            android.app.Activity r0 = r7.a
            android.view.Window r0 = r0.getWindow()
            android.view.View r0 = r0.getDecorView()
            r2 = r0
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L_0x00d6:
            if (r2 != 0) goto L_0x00d9
            goto L_0x0107
        L_0x00d9:
            android.view.View r8 = r8.c()
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r4 = -2
            r0.<init>(r1, r4)
            r2.addView(r8, r0)
            java.util.concurrent.atomic.AtomicInteger r0 = h0.i.i.q.a
            h0.i.i.d0 r0 = h0.i.i.q.d.a(r2)
            if (r0 != 0) goto L_0x00f0
            goto L_0x00fb
        L_0x00f0:
            h0.i.i.d0$j r0 = r0.b
            h0.i.c.b r0 = r0.h()
            int r0 = r0.c
            r8.setPadding(r3, r0, r3, r3)
        L_0x00fb:
            android.view.ViewTreeObserver r0 = r8.getViewTreeObserver()
            com.clubhouse.android.shared.ui.AppBannerHandler$a r1 = new com.clubhouse.android.shared.ui.AppBannerHandler$a
            r1.<init>(r8)
            r0.addOnGlobalLayoutListener(r1)
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.shared.ui.AppBannerHandler.c(com.clubhouse.android.core.ui.Banner):void");
    }

    public j create() {
        return new j(this, this.a);
    }

    public void d(Banner banner) {
        i.e(banner, "banner");
        this.c = null;
        View c2 = banner.c();
        c2.animate().translationY(-((float) c2.getHeight())).withEndAction(new i0.e.b.f3.m.a(c2)).start();
    }
}
