package com.instabug.featuresrequest.ui.b.c;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.ui.e.c;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.d.b.b;
import i0.j.d.h.b.c.d;
import i0.j.d.h.b.c.i;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: FeaturesListFragment */
public abstract class e extends InstabugBaseFragment<i0.j.d.h.b.c.e> implements d, i0.j.d.b.a, View.OnClickListener, b, i, SwipeRefreshLayout.h {
    public View Y1;
    public ProgressBar Z1;
    public LinearLayout a2;
    public ImageView b2;
    public ListView c;
    public boolean c2 = false;
    public i0.j.d.h.b.c.a d;
    public SwipeRefreshLayout d2;
    public boolean e2 = false;
    public ViewStub q;
    public ViewStub x;
    public boolean y = false;

    /* compiled from: FeaturesListFragment */
    public class a implements AbsListView.OnScrollListener {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
            r0 = (i0.j.d.h.b.c.e) r8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onScroll(android.widget.AbsListView r8, int r9, int r10, int r11) {
            /*
                r7 = this;
                int r9 = r9 + r10
                if (r11 <= 0) goto L_0x003b
                if (r9 != r11) goto L_0x003b
                com.instabug.featuresrequest.ui.b.c.e r8 = com.instabug.featuresrequest.ui.b.c.e.this
                boolean r9 = r8.e2
                if (r9 != 0) goto L_0x003b
                r9 = 1
                r8.e2 = r9
                P r8 = r8.presenter
                if (r8 == 0) goto L_0x003b
                r0 = r8
                i0.j.d.h.b.c.e r0 = (i0.j.d.h.b.c.e) r0
                i0.j.d.h.b.c.d r8 = r0.c
                if (r8 == 0) goto L_0x003b
                i0.j.d.h.b.b r9 = r0.d
                boolean r9 = r9.b
                if (r9 == 0) goto L_0x0038
                r8.n()
                i0.j.d.h.b.b r1 = r0.d
                i0.j.d.h.b.a r8 = r1.a
                int r2 = r8.a
                boolean r4 = i0.j.d.e.a.e()
                i0.j.d.h.b.c.d r8 = r0.c
                boolean r5 = r8.H0()
                r3 = 0
                r6 = 0
                r0.p(r1, r2, r3, r4, r5, r6)
                goto L_0x003b
            L_0x0038:
                r8.m0()
            L_0x003b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.ui.b.c.e.a.onScroll(android.widget.AbsListView, int, int, int):void");
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    public void A(String str) {
        if (str != null && getViewContext().getContext() != null) {
            Toast.makeText(getViewContext().getContext(), str, 0).show();
        }
    }

    public void A0(Boolean bool) {
        ListView listView = this.c;
        if (listView != null) {
            listView.smoothScrollToPosition(0);
        }
        K0();
        P p = this.presenter;
        if (p != null) {
            ((i0.j.d.h.b.c.e) p).s();
        }
    }

    public void E() {
        m0();
    }

    public void F0() {
        ProgressBar progressBar;
        if (this.c != null) {
            J0();
            f();
        }
        P p = this.presenter;
        if (!(p == null || (progressBar = this.Z1) == null)) {
            if (((i0.j.d.h.b.c.e) p).d.b) {
                progressBar.setVisibility(0);
            } else {
                ListView listView = this.c;
                if (listView != null) {
                    listView.setOnScrollListener((AbsListView.OnScrollListener) null);
                }
                this.Z1.setVisibility(8);
            }
        }
        this.e2 = false;
    }

    public boolean H0() {
        return this.y;
    }

    public void I() {
        ViewStub viewStub = this.q;
        if (viewStub == null) {
            return;
        }
        if (viewStub.getParent() != null) {
            View inflate = this.q.inflate();
            Button button = (Button) inflate.findViewById(R.id.ib_empty_state_action);
            ((ImageView) inflate.findViewById(R.id.ib_empty_state_icon)).setImageResource(R.drawable.ibg_fr_ic_features_empty_state);
            i0.j.c.l.a.z(button, Instabug.getPrimaryColor());
            button.setOnClickListener(this);
            return;
        }
        this.q.setVisibility(0);
    }

    public abstract i0.j.d.h.b.c.e I0();

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public final void J0() {
        ListView listView;
        View view;
        if (getContext() != null && (listView = this.c) != null && this.presenter != null && (view = this.Y1) != null) {
            try {
                if (this.c2) {
                    listView.removeFooterView(view);
                    this.c.addFooterView(this.Y1);
                    return;
                }
                View inflate = View.inflate(getContext(), R.layout.ib_fr_pull_to_refresh_footer_view, (ViewGroup) null);
                this.Y1 = inflate;
                if (inflate != null) {
                    ProgressBar progressBar = (ProgressBar) inflate.findViewById(R.id.ib_loadmore_progressbar);
                    this.Z1 = progressBar;
                    progressBar.setVisibility(4);
                    this.a2 = (LinearLayout) this.Y1.findViewById(R.id.instabug_pbi_container);
                    this.b2 = (ImageView) this.Y1.findViewById(R.id.image_instabug_logo);
                    this.Z1.getIndeterminateDrawable().setColorFilter(Instabug.getPrimaryColor(), PorterDuff.Mode.SRC_IN);
                    this.c.addFooterView(this.Y1);
                    d dVar = ((i0.j.d.h.b.c.e) this.presenter).c;
                    if (dVar != null) {
                        if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == Feature.State.ENABLED) {
                            dVar.r();
                        } else {
                            dVar.p();
                        }
                    }
                    this.c2 = true;
                }
            } catch (Exception e) {
                InstabugSDKLogger.e("FeaturesListFragment", "exception occurring while setting up the loadMore views", e);
            }
        }
    }

    public void K() {
        ViewStub viewStub = this.x;
        if (viewStub == null) {
            return;
        }
        if (viewStub.getParent() != null) {
            this.x.inflate().setOnClickListener(this);
        } else {
            this.x.setVisibility(0);
        }
    }

    public final void K0() {
        ListView listView = this.c;
        if (listView != null) {
            listView.setOnScrollListener(new a());
        }
    }

    public void a() {
        if (getActivity() != null) {
            h0.o.a.a aVar = new h0.o.a.a(getActivity().getSupportFragmentManager());
            aVar.b(R.id.instabug_fragment_container, new c());
            aVar.g("search_features");
            aVar.h();
        }
    }

    public void b() {
        ViewStub viewStub = this.q;
        if (viewStub != null) {
            viewStub.setVisibility(8);
        }
    }

    public void f() {
        i0.j.d.h.b.c.a aVar = this.d;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public int getLayout() {
        return R.layout.ib_fr_features_list_fragment;
    }

    public void h() {
        ListView listView = this.c;
        if (listView != null) {
            listView.smoothScrollToPosition(0);
        }
        K0();
        P p = this.presenter;
        if (p != null) {
            ((i0.j.d.h.b.c.e) p).s();
        }
    }

    public void initViews(View view, Bundle bundle) {
        this.q = (ViewStub) findViewById(R.id.ib_empty_state_stub);
        this.x = (ViewStub) findViewById(R.id.error_state_stub);
        this.c = (ListView) findViewById(R.id.features_request_list);
        K0();
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        this.d2 = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setColorSchemeColors(Instabug.getPrimaryColor());
            this.d2.setOnRefreshListener(this);
            if (getArguments() != null) {
                this.y = getArguments().getBoolean("my_posts", false);
            }
            if (bundle == null || this.presenter == null) {
                this.presenter = I0();
            } else {
                this.c2 = false;
                if (bundle.getBoolean("empty_state") && ((i0.j.d.h.b.c.e) this.presenter).m() == 0) {
                    I();
                }
                if (bundle.getBoolean("error_state") && ((i0.j.d.h.b.c.e) this.presenter).m() == 0) {
                    K();
                }
                if (((i0.j.d.h.b.c.e) this.presenter).m() > 0) {
                    J0();
                }
            }
            i0.j.d.h.b.c.a aVar = new i0.j.d.h.b.c.a((i0.j.d.h.b.c.e) this.presenter, this);
            this.d = aVar;
            ListView listView = this.c;
            if (listView != null) {
                listView.setAdapter(aVar);
            }
        }
    }

    public void k() {
        ViewStub viewStub = this.x;
        if (viewStub != null) {
            viewStub.setVisibility(8);
        }
    }

    public void l(boolean z) {
        SwipeRefreshLayout swipeRefreshLayout = this.d2;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(z);
        }
    }

    public void m0() {
        ProgressBar progressBar = this.Z1;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
    }

    public void n() {
        ProgressBar progressBar = this.Z1;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
    }

    public void o() {
        if (getActivity() != null) {
            A(getString(R.string.feature_requests_error_state_sub_title));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r3 = (i0.j.d.h.b.c.e) r2.presenter;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r3) {
        /*
            r2 = this;
            int r3 = r3.getId()
            P r0 = r2.presenter
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            int r1 = com.instabug.featuresrequest.R.id.ib_empty_state_action
            if (r3 != r1) goto L_0x0017
            i0.j.d.h.b.c.e r0 = (i0.j.d.h.b.c.e) r0
            i0.j.d.h.b.c.d r3 = r0.c
            if (r3 == 0) goto L_0x002f
            r3.a()
            goto L_0x002f
        L_0x0017:
            android.view.ViewStub r0 = r2.x
            if (r0 == 0) goto L_0x002f
            int r0 = r0.getInflatedId()
            if (r3 != r0) goto L_0x002f
            P r3 = r2.presenter
            i0.j.d.h.b.c.e r3 = (i0.j.d.h.b.c.e) r3
            i0.j.d.h.b.c.d r0 = r3.c
            if (r0 == 0) goto L_0x002f
            r0.k()
            r3.s()
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.featuresrequest.ui.b.c.e.onClick(android.view.View):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public void onDestroy() {
        super.onDestroy();
        P p = this.presenter;
        if (p != null) {
            ((i0.j.d.h.b.c.e) p).onDestroy();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ViewStub viewStub = this.q;
        boolean z = true;
        if (viewStub != null) {
            bundle.putBoolean("empty_state", viewStub.getParent() == null);
        }
        ViewStub viewStub2 = this.x;
        if (viewStub2 != null) {
            if (viewStub2.getParent() != null) {
                z = false;
            }
            bundle.putBoolean("error_state", z);
        }
    }

    public void p() {
        LinearLayout linearLayout;
        if (getActivity() != null && (linearLayout = this.a2) != null && this.b2 != null) {
            linearLayout.setVisibility(0);
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeDark) {
                this.b2.setImageResource(R.drawable.ibg_core_ic_instabug_logo);
                this.b2.setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_ATOP);
                return;
            }
            this.b2.setImageResource(R.drawable.ibg_core_ic_instabug_logo);
            this.b2.setColorFilter(h0.i.b.a.getColor(getActivity(), R.color.ib_fr_pbi_color), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public void q0() {
        K0();
        P p = this.presenter;
        if (p != null) {
            ((i0.j.d.h.b.c.e) p).s();
        }
    }

    public void r() {
        LinearLayout linearLayout = this.a2;
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
        }
    }

    public void z0(com.instabug.featuresrequest.d.b bVar) {
        if (getActivity() != null) {
            h0.o.a.a aVar = new h0.o.a.a(getActivity().getSupportFragmentManager());
            int i = R.id.instabug_fragment_container;
            Bundle bundle = new Bundle();
            bundle.putSerializable("key_feature", bVar);
            com.instabug.featuresrequest.ui.c.a aVar2 = new com.instabug.featuresrequest.ui.c.a();
            aVar2.m2 = this;
            aVar2.setArguments(bundle);
            aVar.b(i, aVar2);
            aVar.g("feature_requests_details");
            aVar.h();
        }
    }
}
