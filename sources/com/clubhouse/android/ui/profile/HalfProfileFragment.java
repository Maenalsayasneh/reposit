package com.clubhouse.android.ui.profile;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.channels.mvi.ChannelViewModel;
import com.clubhouse.android.core.ui.DragInterceptingConstraintLayout;
import com.clubhouse.android.core.ui.RSVPButton;
import com.clubhouse.android.core.ui.TriStateButton;
import com.clubhouse.android.databinding.FragmentHalfProfileBinding;
import com.clubhouse.android.databinding.FragmentProfileBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.channels.ChannelFragment;
import com.clubhouse.android.ui.events.HalfEventFragment;
import com.clubhouse.android.ui.profile.reports.ReportIncidentThanksFragment;
import com.clubhouse.android.ui.profile.reports.ReportProfileArgs;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyFragment;
import com.clubhouse.app.R;
import h0.b.f.m0;
import h0.b0.n;
import h0.b0.p;
import h0.b0.v;
import h0.q.o0;
import i0.b.b.g;
import i0.b.b.x;
import i0.e.b.g3.u.a0;
import i0.e.b.g3.u.a1;
import i0.e.b.g3.u.b0;
import i0.e.b.g3.u.b1;
import i0.e.b.g3.u.c0;
import i0.e.b.g3.u.c1;
import i0.e.b.g3.u.c4;
import i0.e.b.g3.u.d0;
import i0.e.b.g3.u.d1;
import i0.e.b.g3.u.e0;
import i0.e.b.g3.u.e1;
import i0.e.b.g3.u.e5;
import i0.e.b.g3.u.f0;
import i0.e.b.g3.u.f1;
import i0.e.b.g3.u.f4;
import i0.e.b.g3.u.g0;
import i0.e.b.g3.u.g1;
import i0.e.b.g3.u.g2;
import i0.e.b.g3.u.h0;
import i0.e.b.g3.u.h1;
import i0.e.b.g3.u.h2;
import i0.e.b.g3.u.h4;
import i0.e.b.g3.u.i0;
import i0.e.b.g3.u.i1;
import i0.e.b.g3.u.i2;
import i0.e.b.g3.u.j0;
import i0.e.b.g3.u.j2;
import i0.e.b.g3.u.j5;
import i0.e.b.g3.u.k0;
import i0.e.b.g3.u.k1;
import i0.e.b.g3.u.l0;
import i0.e.b.g3.u.l1;
import i0.e.b.g3.u.m1;
import i0.e.b.g3.u.n0;
import i0.e.b.g3.u.n1;
import i0.e.b.g3.u.n4;
import i0.e.b.g3.u.o1;
import i0.e.b.g3.u.p0;
import i0.e.b.g3.u.p1;
import i0.e.b.g3.u.q;
import i0.e.b.g3.u.q0;
import i0.e.b.g3.u.q1;
import i0.e.b.g3.u.q4;
import i0.e.b.g3.u.r0;
import i0.e.b.g3.u.s0;
import i0.e.b.g3.u.s4;
import i0.e.b.g3.u.t0;
import i0.e.b.g3.u.u0;
import i0.e.b.g3.u.v0;
import i0.e.b.g3.u.w0;
import i0.e.b.g3.u.w3;
import i0.e.b.g3.u.x0;
import i0.e.b.g3.u.y0;
import i0.e.b.g3.u.z;
import i0.e.b.g3.u.z0;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.i;
import m0.n.a.l;
import m0.n.b.m;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 f2\u00020\u0001:\u0001gB\u0007¢\u0006\u0004\be\u0010\fJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\fJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\fJ\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00158B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001d\u0010(\u001a\u00020$8F@\u0006X\u0002¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001d\u00105\u001a\u0002018F@\u0006X\u0002¢\u0006\f\n\u0004\b2\u0010\u0017\u001a\u0004\b3\u00104R\u001d\u0010:\u001a\u0002068@@\u0000X\u0002¢\u0006\f\n\u0004\b7\u0010\u0017\u001a\u0004\b8\u00109R$\u0010B\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020K8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010MR\u001d\u0010U\u001a\u00020Q8F@\u0006X\u0002¢\u0006\f\n\u0004\bR\u0010\u0017\u001a\u0004\bS\u0010TR(\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bV\u0010\u001e\u001a\u0004\bW\u0010 \"\u0004\bX\u0010\"R\u001d\u0010^\u001a\u00020Z8F@\u0006X\u0002¢\u0006\f\n\u0004\b[\u0010\u0017\u001a\u0004\b\\\u0010]R\u001d\u0010d\u001a\u00020_8@@\u0000X\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c¨\u0006h"}, d2 = {"Lcom/clubhouse/android/ui/profile/HalfProfileFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "dismiss", "()V", "Y0", "W0", "V0", "P0", "J", "anchor", "X0", "(Landroid/view/View;)V", "Landroid/view/ViewGroup;", "e2", "Lm0/c;", "getSheetContainer", "()Landroid/view/ViewGroup;", "sheetContainer", "Lh0/a/f/b;", "Landroid/content/Intent;", "m2", "Lh0/a/f/b;", "getGetTwitterOAuthToken$app_productionRelease", "()Lh0/a/f/b;", "setGetTwitterOAuthToken$app_productionRelease", "(Lh0/a/f/b;)V", "getTwitterOAuthToken", "Lcom/clubhouse/android/ui/profile/EditBioViewModel;", "g2", "getBioViewModel", "()Lcom/clubhouse/android/ui/profile/EditBioViewModel;", "bioViewModel", "Li0/e/b/f3/k/b;", "b2", "Li0/e/b/f3/k/b;", "getUserPrefs", "()Li0/e/b/f3/k/b;", "setUserPrefs", "(Li0/e/b/f3/k/b;)V", "userPrefs", "Lcom/clubhouse/android/ui/profile/EditPhotoViewModel;", "h2", "getPhotoViewModel", "()Lcom/clubhouse/android/ui/profile/EditPhotoViewModel;", "photoViewModel", "Lcom/clubhouse/android/databinding/FragmentProfileBinding;", "d2", "S0", "()Lcom/clubhouse/android/databinding/FragmentProfileBinding;", "fullProfileBinding", "Lcom/clubhouse/android/channels/mvi/ChannelViewModel;", "j2", "Lcom/clubhouse/android/channels/mvi/ChannelViewModel;", "getChannelViewModel", "()Lcom/clubhouse/android/channels/mvi/ChannelViewModel;", "setChannelViewModel", "(Lcom/clubhouse/android/channels/mvi/ChannelViewModel;)V", "channelViewModel", "Li0/e/a/b/a;", "k2", "Li0/e/a/b/a;", "Q0", "()Li0/e/a/b/a;", "setActionTrailRecorder$app_productionRelease", "(Li0/e/a/b/a;)V", "actionTrailRecorder", "Lh0/b/f/m0$a;", "n2", "Lh0/b/f/m0$a;", "menuListener", "o2", "inChannelMenuListener", "Lcom/clubhouse/android/ui/profile/HalfProfileContainerViewModel;", "i2", "R0", "()Lcom/clubhouse/android/ui/profile/HalfProfileContainerViewModel;", "containerViewModel", "l2", "getGetInstagramOAuthToken$app_productionRelease", "setGetInstagramOAuthToken$app_productionRelease", "getInstagramOAuthToken", "Lcom/clubhouse/android/ui/profile/HalfProfileViewModel;", "f2", "U0", "()Lcom/clubhouse/android/ui/profile/HalfProfileViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentHalfProfileBinding;", "c2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "T0", "()Lcom/clubhouse/android/databinding/FragmentHalfProfileBinding;", "halfProfileBinding", "<init>", "Z1", "b", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"InflateParams"})
/* compiled from: HalfProfileFragment.kt */
public final class HalfProfileFragment extends Hilt_HalfProfileFragment {
    public static final b Z1 = new b((m0.n.b.f) null);
    public static final /* synthetic */ k<Object>[] a2;
    public i0.e.b.f3.k.b b2;
    public final FragmentViewBindingDelegate c2 = new FragmentViewBindingDelegate(FragmentHalfProfileBinding.class, this);
    public final m0.c d2 = h.H2(new HalfProfileFragment$fullProfileBinding$2(this));
    public final m0.c e2 = h.H2(new HalfProfileFragment$sheetContainer$2(this));
    public final m0.c f2;
    public final m0.c g2;
    public final m0.c h2;
    public final m0.c i2;
    public ChannelViewModel j2;
    public i0.e.a.b.a k2;
    public h0.a.f.b<Intent> l2;
    public h0.a.f.b<Intent> m2;
    public final m0.a n2;
    public final m0.a o2;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<q4, i> {
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj) {
            super(1);
            this.c = i;
            this.d = obj;
        }

        public final Object invoke(Object obj) {
            int i = this.c;
            if (i == 0) {
                q4 q4Var = (q4) obj;
                m0.n.b.i.e(q4Var, "state");
                if (q4Var.o && !(q4Var.i instanceof i0.b.b.e)) {
                    ((HalfProfileFragment) this.d).U0().p(e5.a);
                }
                return i.a;
            } else if (i == 1) {
                q4 q4Var2 = (q4) obj;
                m0.n.b.i.e(q4Var2, "state");
                if (!q4Var2.q) {
                    if (q4Var2.u) {
                        Objects.requireNonNull(ReportIncidentThanksFragment.Z1);
                        v.p0((HalfProfileFragment) this.d, ReportIncidentThanksFragment.b2, new n(0, (HalfProfileFragment) this.d, q4Var2));
                    } else {
                        Objects.requireNonNull(ReportProfileLegacyFragment.Z1);
                        v.p0((HalfProfileFragment) this.d, ReportProfileLegacyFragment.b2, new n(1, (HalfProfileFragment) this.d, q4Var2));
                    }
                }
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* compiled from: HalfProfileFragment.kt */
    public static final class b {
        public b(m0.n.b.f fVar) {
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class c extends i0.b.b.h<HalfProfileFragment, HalfProfileViewModel> {
        public final /* synthetic */ m0.r.d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ m0.r.d c;

        public c(m0.r.d dVar, boolean z, l lVar, m0.r.d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public m0.c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new HalfProfileFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(q4.class), false, this.b);
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class d extends i0.b.b.h<HalfProfileFragment, EditBioViewModel> {
        public final /* synthetic */ m0.r.d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ m0.r.d c;

        public d(m0.r.d dVar, boolean z, l lVar, m0.r.d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public m0.c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new HalfProfileFragment$special$$inlined$parentFragmentViewModel$default$2$1(this), m.a(c4.class), true, this.b);
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class e extends i0.b.b.h<HalfProfileFragment, EditPhotoViewModel> {
        public final /* synthetic */ m0.r.d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ m0.r.d c;

        public e(m0.r.d dVar, boolean z, l lVar, m0.r.d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public m0.c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new HalfProfileFragment$special$$inlined$parentFragmentViewModel$default$4$1(this), m.a(f4.class), true, this.b);
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class f extends i0.b.b.h<HalfProfileFragment, HalfProfileContainerViewModel> {
        public final /* synthetic */ m0.r.d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ m0.r.d c;

        public f(m0.r.d dVar, boolean z, l lVar, m0.r.d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public m0.c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            m0.n.b.i.e(fragment, "thisRef");
            m0.n.b.i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new HalfProfileFragment$special$$inlined$parentFragmentViewModel$default$6$1(this), m.a(n4.class), true, this.b);
        }
    }

    static {
        k<Object>[] kVarArr = new k[7];
        kVarArr[0] = m.c(new PropertyReference1Impl(m.a(HalfProfileFragment.class), "halfProfileBinding", "getHalfProfileBinding$app_productionRelease()Lcom/clubhouse/android/databinding/FragmentHalfProfileBinding;"));
        kVarArr[3] = m.c(new PropertyReference1Impl(m.a(HalfProfileFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/profile/HalfProfileViewModel;"));
        kVarArr[4] = m.c(new PropertyReference1Impl(m.a(HalfProfileFragment.class), "bioViewModel", "getBioViewModel()Lcom/clubhouse/android/ui/profile/EditBioViewModel;"));
        kVarArr[5] = m.c(new PropertyReference1Impl(m.a(HalfProfileFragment.class), "photoViewModel", "getPhotoViewModel()Lcom/clubhouse/android/ui/profile/EditPhotoViewModel;"));
        kVarArr[6] = m.c(new PropertyReference1Impl(m.a(HalfProfileFragment.class), "containerViewModel", "getContainerViewModel()Lcom/clubhouse/android/ui/profile/HalfProfileContainerViewModel;"));
        a2 = kVarArr;
    }

    public HalfProfileFragment() {
        super(R.layout.fragment_half_profile);
        m0.r.d a3 = m.a(HalfProfileViewModel.class);
        c cVar = new c(a3, false, new HalfProfileFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3);
        k<Object>[] kVarArr = a2;
        this.f2 = cVar.a(this, kVarArr[3]);
        m0.r.d a4 = m.a(EditBioViewModel.class);
        this.g2 = new d(a4, true, new HalfProfileFragment$special$$inlined$parentFragmentViewModel$default$1(this, a4, a4), a4).a(this, kVarArr[4]);
        m0.r.d a5 = m.a(EditPhotoViewModel.class);
        this.h2 = new e(a5, true, new HalfProfileFragment$special$$inlined$parentFragmentViewModel$default$3(this, a5, a5), a5).a(this, kVarArr[5]);
        m0.r.d a6 = m.a(HalfProfileContainerViewModel.class);
        this.i2 = new f(a6, true, new HalfProfileFragment$special$$inlined$parentFragmentViewModel$default$5(this, a6, a6), a6).a(this, kVarArr[6]);
        this.n2 = new q(this);
        this.o2 = new z(this);
    }

    public static final void N0(HalfProfileFragment halfProfileFragment, boolean z) {
        h0.b0.g gVar = new h0.b0.g(halfProfileFragment.T0().a, halfProfileFragment.S0().a);
        ViewGroup viewGroup = (ViewGroup) halfProfileFragment.e2.getValue();
        if (viewGroup != null) {
            if (z) {
                Objects.requireNonNull(Z1);
                m0.n.b.i.e(viewGroup, "target");
                h0.b0.c cVar = new h0.b0.c();
                cVar.Y1 = 250;
                h0.b0.b bVar = new h0.b0.b();
                bVar.b2.add(viewGroup);
                bVar.Y1 = 250;
                p pVar = new p();
                pVar.P(0);
                pVar.M(cVar);
                pVar.M(bVar);
                n.a(viewGroup, pVar);
            }
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            layoutParams.height = -1;
            viewGroup.setLayoutParams(layoutParams);
            gVar.a();
        }
    }

    public static final void O0(HalfProfileFragment halfProfileFragment, ReportProfileArgs reportProfileArgs) {
        halfProfileFragment.U0().p(j5.a);
        halfProfileFragment.P0();
        v.v2(halfProfileFragment.U0(), new HalfProfileFragment$reportUser$1(halfProfileFragment, reportProfileArgs));
    }

    public void J() {
        m0.n.b.i.e(this, "<this>");
        v.v2(U0(), new HalfProfileUtil$invalidateViews$1(this));
        ChannelViewModel channelViewModel = this.j2;
        if (channelViewModel != null) {
            v.v2(U0(), new HalfProfileFragment$invalidate$1$1(this));
            v.u2(U0(), channelViewModel, new HalfProfileFragment$invalidate$1$2(this));
        }
    }

    public final void P0() {
        v.v2(R0(), new HalfProfileFragment$expand$1(this));
    }

    public final i0.e.a.b.a Q0() {
        i0.e.a.b.a aVar = this.k2;
        if (aVar != null) {
            return aVar;
        }
        m0.n.b.i.m("actionTrailRecorder");
        throw null;
    }

    public final HalfProfileContainerViewModel R0() {
        return (HalfProfileContainerViewModel) this.i2.getValue();
    }

    public final FragmentProfileBinding S0() {
        return (FragmentProfileBinding) this.d2.getValue();
    }

    public final FragmentHalfProfileBinding T0() {
        return (FragmentHalfProfileBinding) this.c2.getValue(this, a2[0]);
    }

    public final HalfProfileViewModel U0() {
        return (HalfProfileViewModel) this.f2.getValue();
    }

    public final void V0() {
        U0().p(s4.a);
    }

    public final void W0() {
        U0().p(h4.a);
        ScrollView scrollView = S0().N;
        m0.n.b.i.d(scrollView, "fullProfileBinding.scroll");
        i0.e.b.d3.k.F(scrollView);
    }

    public final void X0(View view) {
        m0.n.b.i.e(view, "anchor");
        ((AmplitudeAnalytics) v.l(this)).a("ProfileOptions-Open");
        ChannelViewModel channelViewModel = this.j2;
        if (channelViewModel != null) {
            v.u2(U0(), channelViewModel, new HalfProfileFragment$showMenu$1(this, view));
        } else {
            v.v2(U0(), new HalfProfileFragment$showMenu$2(this, view));
        }
    }

    public final void Y0() {
        DragInterceptingConstraintLayout dragInterceptingConstraintLayout = T0().G;
        Objects.requireNonNull(Z1);
        p pVar = new p();
        pVar.P(1);
        pVar.M(new h0.b0.c(2));
        pVar.O(250);
        h0.b0.b bVar = new h0.b0.b();
        bVar.c(R.id.full_profile_button);
        bVar.c(R.id.nominator);
        bVar.c(R.id.club_container);
        pVar.M(bVar);
        pVar.M(new h0.b0.c(1));
        n.a(dragInterceptingConstraintLayout, pVar);
        if (T0().k.isActivated()) {
            V0();
        } else {
            W0();
        }
    }

    public final void dismiss() {
        R0().p(w3.a);
    }

    public void onCreate(Bundle bundle) {
        Fragment parentFragment;
        super.onCreate(bundle);
        HalfProfileViewModel U0 = U0();
        m0.n.b.i.e(this, "<this>");
        m0.n.b.i.e(U0, "viewModel");
        h0.a.f.b<Intent> registerForActivityResult = registerForActivityResult(new h0.a.f.d.d(), new i0.e.b.d3.c(U0, this));
        m0.n.b.i.d(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult()\n        ) { result ->\n            viewModel.processIntent(OAuthReturned)\n            if (result.resultCode == Activity.RESULT_OK) {\n                val intent = result.data\n                if (intent == null) {\n                    showInstagramConnectError()\n                } else {\n                    try {\n                        val authResponse = AuthorizationResponse.fromIntent(intent)\n                        val authCode: String? = authResponse?.authorizationCode\n                        if (authCode.isNullOrBlank()) {\n                            showInstagramConnectError()\n                        } else {\n                            viewModel.processIntent(UpdateInstagramProfile(authCode))\n                        }\n                    } catch (exception: Exception) {\n                        showInstagramConnectError(exception)\n                    }\n                }\n            } else if (result.resultCode != Activity.RESULT_CANCELED) {\n                showInstagramConnectError()\n            }\n        }");
        m0.n.b.i.e(registerForActivityResult, "<set-?>");
        this.l2 = registerForActivityResult;
        HalfProfileViewModel U02 = U0();
        m0.n.b.i.e(this, "<this>");
        m0.n.b.i.e(U02, "viewModel");
        h0.a.f.b<Intent> registerForActivityResult2 = registerForActivityResult(new h0.a.f.d.d(), new i0.e.b.d3.b(U02, this));
        m0.n.b.i.d(registerForActivityResult2, "registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->\n            viewModel.processIntent(OAuthReturned)\n            if (result.resultCode == Activity.RESULT_OK) {\n                val intent = result.data\n                if (intent == null) {\n                    showTwitterConnectError()\n                } else {\n                    try {\n                        val verifier: String? =\n                            intent.data?.getQueryParameters(\"oauth_verifier\")?.firstOrNull()\n                        if (verifier.isNullOrBlank()) {\n                            showTwitterConnectError()\n                        } else {\n                            viewModel.processIntent(UpdateTwitterProfile(verifier))\n                        }\n                    } catch (exception: Exception) {\n                        showTwitterConnectError(exception)\n                    }\n                }\n            } else if (result.resultCode != Activity.RESULT_CANCELED) {\n                showTwitterConnectError()\n            }\n        }");
        m0.n.b.i.e(registerForActivityResult2, "<set-?>");
        this.m2 = registerForActivityResult2;
        Fragment parentFragment2 = getParentFragment();
        Fragment fragment = null;
        if (!(parentFragment2 == null || (parentFragment = parentFragment2.getParentFragment()) == null)) {
            fragment = parentFragment.getParentFragment();
        }
        Fragment fragment2 = fragment;
        if (fragment2 instanceof ChannelFragment) {
            x xVar = x.a;
            h0.o.a.k requireActivity = requireActivity();
            m0.n.b.i.d(requireActivity, "this.requireActivity()");
            this.j2 = (ChannelViewModel) x.a(xVar, ChannelViewModel.class, i0.e.b.z2.g.l.class, new i0.b.b.d(requireActivity, v.a(this), fragment2, (o0) null, (h0.x.a) null, 24), (String) null, true, (i0.b.b.k) null, 40);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        m0.n.b.i.e(view, "view");
        super.onViewCreated(view, bundle);
        v.v2(R0(), new HalfProfileFragment$onViewCreated$1(this));
        v.v2(U0(), new a(1, this));
        m0.n.b.i.e(this, "<this>");
        T0().c.setOnClickListener(new a1(this));
        S0().b.setOnClickListener(new j0(this));
        EpoxyRecyclerView epoxyRecyclerView = T0().n;
        m0.n.b.i.d(epoxyRecyclerView, "halfProfileBinding.followSuggestionsList");
        i0.e.b.d3.k.D(epoxyRecyclerView, this, new HalfProfileFragment$buildFollowSuggestionModels$1(this));
        EpoxyRecyclerView epoxyRecyclerView2 = S0().p;
        m0.n.b.i.d(epoxyRecyclerView2, "fullProfileBinding.followSuggestionsList");
        i0.e.b.d3.k.D(epoxyRecyclerView2, this, new HalfProfileFragment$buildFollowSuggestionModels$1(this));
        T0().F.setOnClickListener(new l1(this));
        S0().M.setOnClickListener(new y0(this));
        T0().D.setOnClickListener(new i0(this));
        S0().K.setOnClickListener(new n0(this));
        T0().g.setOnClickListener(new j2(this));
        S0().g.setOnClickListener(new f0(this));
        T0().K.setOnClickListener(new h2(this));
        S0().S.setOnClickListener(new a0(this));
        T0().x.setOnClickListener(new c0(this));
        S0().A.setOnClickListener(new h1(this));
        T0().B.setOnClickListener(new k0(this));
        S0().I.setOnClickListener(new s0(this));
        TriStateButton triStateButton = T0().i;
        m0.n.b.i.d(triStateButton, "halfProfileBinding.followButton");
        h0.q.p viewLifecycleOwner = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
        i0.e.b.d3.k.H(triStateButton, h0.q.q.a(viewLifecycleOwner), new q1(this));
        TriStateButton triStateButton2 = S0().k;
        m0.n.b.i.d(triStateButton2, "fullProfileBinding.followButton");
        h0.q.p viewLifecycleOwner2 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(triStateButton2, h0.q.q.a(viewLifecycleOwner2), new l0(this));
        ImageView imageView = T0().k;
        m0.n.b.i.d(imageView, "halfProfileBinding.followSuggestionsButton");
        h0.q.p viewLifecycleOwner3 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        i0.e.b.d3.k.H(imageView, h0.q.q.a(viewLifecycleOwner3), new i0.e.b.g3.u.m0(this));
        ImageView imageView2 = S0().m;
        m0.n.b.i.d(imageView2, "fullProfileBinding.followSuggestionsButton");
        h0.q.p viewLifecycleOwner4 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner4, "viewLifecycleOwner");
        i0.e.b.d3.k.H(imageView2, h0.q.q.a(viewLifecycleOwner4), new i2(this));
        ConstraintLayout constraintLayout = T0().M.a;
        m0.n.b.i.d(constraintLayout, "halfProfileBinding.upcomingEventContainer.root");
        h0.q.p viewLifecycleOwner5 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner5, "viewLifecycleOwner");
        i0.e.b.d3.k.H(constraintLayout, h0.q.q.a(viewLifecycleOwner5), new e1(this));
        ConstraintLayout constraintLayout2 = S0().W.a;
        m0.n.b.i.d(constraintLayout2, "fullProfileBinding.upcomingEventContainer.root");
        h0.q.p viewLifecycleOwner6 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner6, "viewLifecycleOwner");
        i0.e.b.d3.k.H(constraintLayout2, h0.q.q.a(viewLifecycleOwner6), new d0(this));
        RSVPButton rSVPButton = T0().M.b;
        m0.n.b.i.d(rSVPButton, "halfProfileBinding.upcomingEventContainer.bellIcon");
        h0.q.p viewLifecycleOwner7 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner7, "viewLifecycleOwner");
        i0.e.b.d3.k.H(rSVPButton, h0.q.q.a(viewLifecycleOwner7), new n1(this));
        RSVPButton rSVPButton2 = S0().W.b;
        m0.n.b.i.d(rSVPButton2, "fullProfileBinding.upcomingEventContainer.bellIcon");
        h0.q.p viewLifecycleOwner8 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner8, "viewLifecycleOwner");
        i0.e.b.d3.k.H(rSVPButton2, h0.q.q.a(viewLifecycleOwner8), new b1(this));
        T0().I.setOnClickListener(new k1(this));
        S0().P.setOnClickListener(new e0(this));
        T0().H.setOnClickListener(new x0(this));
        S0().O.setOnClickListener(new f1(this));
        T0().J.setOnClickListener(new h0(this));
        S0().Q.setOnClickListener(new p1(this));
        Button button = T0().s;
        m0.n.b.i.d(button, "halfProfileBinding.inviteToSpeak");
        h0.q.p viewLifecycleOwner9 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner9, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, h0.q.q.a(viewLifecycleOwner9), new g2(this));
        Button button2 = T0().u;
        m0.n.b.i.d(button2, "halfProfileBinding.joinChannel");
        h0.q.p viewLifecycleOwner10 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner10, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button2, h0.q.q.a(viewLifecycleOwner10), new o1(this));
        Button button3 = T0().w;
        m0.n.b.i.d(button3, "halfProfileBinding.makeAModerator");
        h0.q.p viewLifecycleOwner11 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner11, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button3, h0.q.q.a(viewLifecycleOwner11), new m1(this));
        Button button4 = T0().y;
        m0.n.b.i.d(button4, "halfProfileBinding.moveToAudience");
        h0.q.p viewLifecycleOwner12 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner12, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button4, h0.q.q.a(viewLifecycleOwner12), new g0(this));
        Button button5 = T0().b;
        m0.n.b.i.d(button5, "halfProfileBinding.acceptSpeakerInvite");
        h0.q.p viewLifecycleOwner13 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner13, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button5, h0.q.q.a(viewLifecycleOwner13), new u0(this));
        ImageView imageView3 = T0().z;
        m0.n.b.i.d(imageView3, "halfProfileBinding.mute");
        h0.q.p viewLifecycleOwner14 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner14, "viewLifecycleOwner");
        i0.e.b.d3.k.H(imageView3, h0.q.q.a(viewLifecycleOwner14), new z0(this));
        Button button6 = T0().r;
        m0.n.b.i.d(button6, "halfProfileBinding.inviteToPrivateChannel");
        h0.q.p viewLifecycleOwner15 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner15, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button6, h0.q.q.a(viewLifecycleOwner15), new v0(this));
        T0().q.setOnClickListener(new t0(this));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(T0().a.getDragFlow(), new HalfProfileUtil$setUpViews$37(this, (m0.l.c<? super HalfProfileUtil$setUpViews$37>) null));
        h0.q.p viewLifecycleOwner16 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner16, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, h0.q.q.a(viewLifecycleOwner16));
        Button button7 = S0().v;
        m0.n.b.i.d(button7, "fullProfileBinding.giveMoneyButton");
        h0.q.p viewLifecycleOwner17 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner17, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button7, h0.q.q.a(viewLifecycleOwner17), new d1(this));
        EpoxyRecyclerView epoxyRecyclerView3 = S0().i;
        m0.n.b.i.d(epoxyRecyclerView3, "fullProfileBinding.clubList");
        i0.e.b.d3.k.D(epoxyRecyclerView3, this, new HalfProfileFragment$buildClubModels$1(this));
        Button button8 = S0().V;
        m0.n.b.i.d(button8, "fullProfileBinding.twitter");
        h0.q.p viewLifecycleOwner18 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner18, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button8, h0.q.q.a(viewLifecycleOwner18), new r0(this));
        Button button9 = S0().w;
        m0.n.b.i.d(button9, "fullProfileBinding.instagram");
        h0.q.p viewLifecycleOwner19 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner19, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button9, h0.q.q.a(viewLifecycleOwner19), new b0(this));
        S0().R.setOnClickListener(new p0(this));
        S0().Y.setOnClickListener(new w0(this));
        TextView textView = S0().E;
        m0.n.b.i.d(textView, "fullProfileBinding.name");
        h0.q.p viewLifecycleOwner20 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner20, "viewLifecycleOwner");
        i0.e.b.d3.k.H(textView, h0.q.q.a(viewLifecycleOwner20), new i0.e.b.g3.u.o0(this));
        TextView textView2 = S0().X;
        m0.n.b.i.d(textView2, "fullProfileBinding.username");
        h0.q.p viewLifecycleOwner21 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner21, "viewLifecycleOwner");
        i0.e.b.d3.k.H(textView2, h0.q.q.a(viewLifecycleOwner21), new i1(this));
        S0().d.setOnClickListener(new c1(this));
        S0().r.setOnClickListener(new q0(this));
        S0().F.setOnClickListener(new g1(this));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(((EditBioViewModel) this.g2.getValue()).l, new HalfProfileFragment$onViewCreated$3(this, (m0.l.c<? super HalfProfileFragment$onViewCreated$3>) null));
        h0.q.p viewLifecycleOwner22 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner22, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, h0.q.q.a(viewLifecycleOwner22));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$13 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(((EditPhotoViewModel) this.h2.getValue()).l, new HalfProfileFragment$onViewCreated$4(this, (m0.l.c<? super HalfProfileFragment$onViewCreated$4>) null));
        h0.q.p viewLifecycleOwner23 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner23, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$13, h0.q.q.a(viewLifecycleOwner23));
        v.g1(this, U0(), HalfProfileFragment$onViewCreated$5.c, v.q2(this, (String) null, 1, (Object) null), new HalfProfileFragment$onViewCreated$6(this, (m0.l.c<? super HalfProfileFragment$onViewCreated$6>) null), new HalfProfileFragment$onViewCreated$7(this, (m0.l.c<? super HalfProfileFragment$onViewCreated$7>) null));
        v.p0(this, "club_created_id", new HalfProfileFragment$onViewCreated$8(this));
        HalfProfileViewModel U0 = U0();
        m0.n.b.i.e(this, "<this>");
        m0.n.b.i.e(U0, "viewModel");
        Objects.requireNonNull(HalfEventFragment.p2);
        v.p0(this, HalfEventFragment.r2, new HalfProfileUtil$getEventsNavigationResults$1(U0));
        v.p0(this, "event_deletion_result", new HalfProfileUtil$getEventsNavigationResults$2(U0));
        v.p0(this, "event_update_result", new HalfProfileUtil$getEventsNavigationResults$3(U0));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$14 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(U0().l, new HalfProfileFragment$onViewCreated$9(this, (m0.l.c<? super HalfProfileFragment$onViewCreated$9>) null));
        h0.q.p viewLifecycleOwner24 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner24, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$14, h0.q.q.a(viewLifecycleOwner24));
        ChannelViewModel channelViewModel = this.j2;
        if (channelViewModel != null) {
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$15 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(channelViewModel.l, new HalfProfileFragment$onViewCreated$10$1(this, channelViewModel, (m0.l.c<? super HalfProfileFragment$onViewCreated$10$1>) null));
            h0.q.p viewLifecycleOwner25 = getViewLifecycleOwner();
            m0.n.b.i.d(viewLifecycleOwner25, "viewLifecycleOwner");
            m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$15, h0.q.q.a(viewLifecycleOwner25));
            n0.a.f1 f1Var = (n0.a.f1) v.u2(U0(), channelViewModel, new HalfProfileFragment$onViewCreated$10$2(channelViewModel, this));
        }
        h0.q.p viewLifecycleOwner26 = getViewLifecycleOwner();
        m0.n.b.i.d(viewLifecycleOwner26, "viewLifecycleOwner");
        viewLifecycleOwner26.getLifecycle().a(new HalfProfileFragment$onViewCreated$$inlined$observeResume$1(this));
    }
}
