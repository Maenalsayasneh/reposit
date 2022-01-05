package com.instabug.featuresrequest.ui.c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.d.b;
import com.instabug.featuresrequest.d.f;
import com.instabug.featuresrequest.d.g;
import com.instabug.featuresrequest.eventbus.FeatureRequestsEventBus;
import com.instabug.featuresrequest.ui.b.c.e;
import com.instabug.featuresrequest.ui.custom.DynamicToolbarFragment;
import com.instabug.featuresrequest.ui.custom.f;
import com.instabug.library.util.AttrResolver;
import i0.j.d.h.b.c.i;
import i0.j.d.h.c.d;
import java.util.ArrayList;
import org.json.JSONException;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: FeatureRequestsDetailsFragment */
public class a extends DynamicToolbarFragment<i0.j.d.h.c.c> implements i0.j.d.h.c.b {
    public static final /* synthetic */ int c = 0;
    public TextView Y1;
    public TextView Z1;
    public TextView a2;
    public TextView b2;
    public TextView c2;
    public LinearLayout d;
    public ImageView d2;
    public TextView e2;
    public LinearLayout f2;
    public LinearLayout g2;
    public ImageView h2;
    public ListView i2;
    public boolean j2 = false;
    public d k2;
    public ArrayList<f> l2 = new ArrayList<>();
    public i m2;
    public boolean n2 = false;
    public com.instabug.featuresrequest.d.b q;
    public TextView x;
    public TextView y;

    /* renamed from: com.instabug.featuresrequest.ui.c.a$a  reason: collision with other inner class name */
    /* compiled from: FeatureRequestsDetailsFragment */
    public class C0104a implements f.a {
        public C0104a() {
        }

        public void a() {
            i0.j.d.h.c.b bVar;
            a aVar = a.this;
            int i = a.c;
            P p = aVar.presenter;
            if (p != null && (bVar = ((i0.j.d.h.c.c) p).c) != null) {
                bVar.s0();
            }
        }
    }

    /* compiled from: FeatureRequestsDetailsFragment */
    public class b implements f.a {
        public b() {
        }

        public void a() {
            com.instabug.featuresrequest.d.b bVar;
            a aVar = a.this;
            aVar.n2 = true;
            P p = aVar.presenter;
            if (p != null && (bVar = aVar.q) != null) {
                i0.j.d.h.c.c cVar = (i0.j.d.h.c.c) p;
                if (bVar.c2) {
                    bVar.c2 = false;
                    bVar.a2--;
                    bVar.g2 = b.C0102b.USER_UN_VOTED;
                    try {
                        i0.j.d.c.a.a(bVar);
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    cVar.b();
                    FeatureRequestsEventBus.getInstance().post(bVar);
                } else {
                    bVar.c2 = true;
                    bVar.a2++;
                    bVar.g2 = b.C0102b.USER_VOTED_UP;
                    try {
                        i0.j.d.c.a.a(bVar);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                    cVar.b();
                    FeatureRequestsEventBus.getInstance().post(bVar);
                }
                i0.j.d.h.c.b bVar2 = cVar.c;
                if (bVar2 != null) {
                    bVar2.o0(bVar);
                }
            }
        }
    }

    /* compiled from: FeatureRequestsDetailsFragment */
    public class c implements Runnable {
        public c() {
        }

        public void run() {
            a aVar = a.this;
            aVar.j2 = !aVar.j2;
        }
    }

    public void I0(com.instabug.featuresrequest.d.b bVar) {
        String str;
        this.q = bVar;
        this.y.setText(bVar.d);
        String str2 = bVar.q;
        if (str2 == null || str2.equalsIgnoreCase("null") || TextUtils.isEmpty(bVar.q)) {
            this.e2.setVisibility(8);
        } else {
            this.e2.setVisibility(0);
            i0.j.c.l.a.B(this.e2, bVar.q, getString(R.string.feature_request_str_more), getString(R.string.feature_request_str_less), !this.j2, new c());
        }
        if (bVar.x == b.a.Completed) {
            this.g2.setVisibility(8);
            this.d.setEnabled(false);
        } else {
            this.g2.setVisibility(0);
            this.d.setEnabled(true);
        }
        if (getContext() != null) {
            TextView textView = this.Z1;
            String str3 = bVar.Y1;
            if (str3 == null || str3.equalsIgnoreCase("null") || TextUtils.isEmpty(bVar.Y1)) {
                str = getString(R.string.feature_request_owner_anonymous);
            } else {
                str = getString(R.string.feature_request_owner, bVar.Y1);
            }
            textView.setText(str);
            this.c2.setText(getString(R.string.feature_request_comments_count, Integer.valueOf(bVar.b2)));
            i0.j.d.f.a.a(bVar.x, bVar.y, this.Y1, getContext());
            this.a2.setText(i0.j.c.l.a.n(getContext(), bVar.Z1));
            LinearLayout linearLayout = this.d;
            if (linearLayout != null) {
                linearLayout.post(new i0.j.d.h.c.a(this, bVar));
            }
        }
    }

    public void X(g gVar) {
        this.l2 = new ArrayList<>();
        this.k2 = null;
        d dVar = new d(this.l2, this);
        this.k2 = dVar;
        this.i2.setAdapter(dVar);
        this.l2.addAll(gVar.d);
        this.k2.notifyDataSetChanged();
        this.f2.setVisibility(8);
        this.i2.invalidate();
        i0.j.c.l.a.A(this.i2);
    }

    public void addToolbarActionButtons() {
        this.toolbarActionButtons.add(new com.instabug.featuresrequest.ui.custom.f(-1, R.string.ib_feature_rq_str_votes, new b(), f.b.VOTE));
    }

    public void d() {
        this.f2.setVisibility(0);
    }

    public int getContentLayout() {
        return R.layout.ib_fr_features_details_fragment;
    }

    public String getTitle() {
        return getString(R.string.feature_requests_details);
    }

    public com.instabug.featuresrequest.ui.custom.f getToolbarCloseActionButton() {
        return new com.instabug.featuresrequest.ui.custom.f(R.drawable.ibg_core_ic_back, R.string.feature_request_go_back, new C0104a(), f.b.ICON);
    }

    public void initContentViews(View view, Bundle bundle) {
        com.instabug.featuresrequest.d.b bVar;
        RelativeLayout relativeLayout = this.toolbar;
        if (relativeLayout != null) {
            this.d = (LinearLayout) relativeLayout.findViewById(R.id.ib_feature_request_toolbar_vote_action_layout);
            this.x = (TextView) this.toolbar.findViewById(R.id.ib_toolbar_vote_count);
            this.d2 = (ImageView) this.toolbar.findViewById(R.id.ib_toolbar_vote_icon);
        }
        this.e2 = (TextView) view.findViewById(R.id.ib_fr_tv_feature_details_desc);
        this.y = (TextView) view.findViewById(R.id.ib_fr_details_title);
        this.Y1 = (TextView) view.findViewById(R.id.instabug_txt_feature_request_status);
        this.a2 = (TextView) view.findViewById(R.id.ib_txt_feature_request_date);
        this.Z1 = (TextView) view.findViewById(R.id.ib_txt_feature_request_owner);
        this.b2 = (TextView) view.findViewById(R.id.tv_add_comment);
        this.c2 = (TextView) view.findViewById(R.id.ib_features_request_comment_count);
        this.f2 = (LinearLayout) view.findViewById(R.id.ib_fr_details_no_comments_layout);
        this.h2 = (ImageView) view.findViewById(R.id.ib_fr_details_no_comments_icon);
        this.i2 = (ListView) view.findViewById(R.id.instabug_feature_details_comments_list);
        this.g2 = (LinearLayout) view.findViewById(R.id.addCommentLayoutContainer);
        if (getContext() != null) {
            this.h2.setColorFilter(AttrResolver.getColor(getContext(), R.attr.ib_fr_no_comments_icon_color));
        }
        this.b2.setOnClickListener(this);
        d dVar = new d(this.l2, this);
        this.k2 = dVar;
        this.i2.setAdapter(dVar);
        if (this.presenter != null && (bVar = this.q) != null) {
            I0(bVar);
            ((i0.j.d.h.c.c) this.presenter).k(this.q.c);
        }
    }

    public void o0(com.instabug.featuresrequest.d.b bVar) {
        LinearLayout linearLayout = this.d;
        if (linearLayout != null) {
            linearLayout.post(new i0.j.d.h.c.a(this, bVar));
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.tv_add_comment && getActivity() != null && this.q != null) {
            h0.o.a.a aVar = new h0.o.a.a(getActivity().getSupportFragmentManager());
            int i = R.id.instabug_fragment_container;
            long j = this.q.c;
            com.instabug.featuresrequest.ui.a.b bVar = new com.instabug.featuresrequest.ui.a.b();
            Bundle bundle = new Bundle();
            bundle.putLong("featureId", j);
            bVar.setArguments(bundle);
            aVar.b(i, bVar);
            aVar.g("add_comment");
            aVar.h();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.q = (com.instabug.featuresrequest.d.b) getArguments().getSerializable("key_feature");
        }
        this.presenter = new i0.j.d.h.c.c(this);
    }

    public void onDestroy() {
        i0.j.d.h.b.c.a aVar;
        super.onDestroy();
        i iVar = this.m2;
        if (iVar != null && this.n2 && (aVar = ((e) iVar).d) != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void s0() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public void v() {
        i0.j.c.l.a.A(this.i2);
    }

    public void z() {
        ArrayList<com.instabug.featuresrequest.d.f> arrayList = this.l2;
        if (arrayList != null && arrayList.size() > 0) {
            int i = 0;
            while (i < this.l2.size() - 1) {
                com.instabug.featuresrequest.d.f fVar = this.l2.get(i);
                if (!(fVar instanceof com.instabug.featuresrequest.d.e)) {
                    i++;
                } else if (((com.instabug.featuresrequest.d.e) fVar).x == b.a.Completed) {
                    this.g2.setVisibility(8);
                    this.d.setEnabled(false);
                    return;
                } else {
                    this.g2.setVisibility(0);
                    this.d.setEnabled(true);
                    return;
                }
            }
        }
    }
}
