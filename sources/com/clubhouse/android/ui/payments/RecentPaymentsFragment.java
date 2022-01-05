package com.clubhouse.android.ui.payments;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.airbnb.epoxy.paging3.PagingDataEpoxyController;
import com.clubhouse.android.data.models.local.payment.RecentPayment;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.databinding.FragmentRecentPaymentsBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.android.ui.profile.ProfileArgs;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import h0.b0.v;
import h0.t.q;
import h0.v.a.g;
import i0.b.a.t;
import i0.b.b.h;
import i0.e.b.g3.s.i1.b;
import i0.e.b.g3.s.n;
import i0.e.b.g3.s.o;
import i0.e.b.g3.s.p;
import i0.e.b.g3.s.u0;
import i0.e.b.g3.s.v0;
import j$.time.OffsetDateTime;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00060\u000bR\u00020\u00008\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/clubhouse/android/ui/payments/RecentPaymentsFragment;", "Lcom/clubhouse/android/core/ui/BaseFragment;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "J", "()V", "Lcom/clubhouse/android/ui/payments/RecentPaymentsFragment$RecentPaymentItemContoller;", "c2", "Lcom/clubhouse/android/ui/payments/RecentPaymentsFragment$RecentPaymentItemContoller;", "pagedController", "Lcom/clubhouse/android/databinding/FragmentRecentPaymentsBinding;", "a2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "N0", "()Lcom/clubhouse/android/databinding/FragmentRecentPaymentsBinding;", "binding", "Lcom/clubhouse/android/ui/payments/RecentPaymentsViewModel;", "b2", "Lm0/c;", "O0", "()Lcom/clubhouse/android/ui/payments/RecentPaymentsViewModel;", "viewModel", "<init>", "RecentPaymentItemContoller", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: RecentPaymentsFragment.kt */
public final class RecentPaymentsFragment extends Hilt_RecentPaymentsFragment {
    public static final /* synthetic */ k<Object>[] Z1 = {m.c(new PropertyReference1Impl(m.a(RecentPaymentsFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentRecentPaymentsBinding;")), m.c(new PropertyReference1Impl(m.a(RecentPaymentsFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/payments/RecentPaymentsViewModel;"))};
    public final FragmentViewBindingDelegate a2 = new FragmentViewBindingDelegate(FragmentRecentPaymentsBinding.class, this);
    public final c b2;
    public final RecentPaymentItemContoller c2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/clubhouse/android/ui/payments/RecentPaymentsFragment$RecentPaymentItemContoller;", "Lcom/airbnb/epoxy/paging3/PagingDataEpoxyController;", "Li0/e/b/b3/b/e/k;", "", "currentPosition", "item", "Li0/b/a/t;", "buildItemModel", "(ILi0/e/b/b3/b/e/k;)Li0/b/a/t;", "<init>", "(Lcom/clubhouse/android/ui/payments/RecentPaymentsFragment;)V", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
    /* compiled from: RecentPaymentsFragment.kt */
    public final class RecentPaymentItemContoller extends PagingDataEpoxyController<i0.e.b.b3.b.e.k> {
        public final /* synthetic */ RecentPaymentsFragment this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RecentPaymentItemContoller(RecentPaymentsFragment recentPaymentsFragment) {
            super((Handler) null, (Handler) null, (g.e) null, 7, (f) null);
            i.e(recentPaymentsFragment, "this$0");
            this.this$0 = recentPaymentsFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-0  reason: not valid java name */
        public static final void m31buildItemModel$lambda0(RecentPaymentsFragment recentPaymentsFragment, RecentPayment recentPayment, View view) {
            i.e(recentPaymentsFragment, "this$0");
            i.e(recentPayment, "$recentPayment");
            ProfileArgs profileArgs = new ProfileArgs(Integer.valueOf(recentPayment.q), (String) null, (BasicUser) null, false, (Uri) null, SourceLocation.UNKNOWN, (Map) null, 94);
            i.e(profileArgs, "mavericksArg");
            v.a1(recentPaymentsFragment, new u0(profileArgs, (String) null), (q) null, 2);
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-1  reason: not valid java name */
        public static final void m32buildItemModel$lambda1(RecentPaymentsFragment recentPaymentsFragment, RecentPayment recentPayment, View view) {
            i.e(recentPaymentsFragment, "this$0");
            i.e(recentPayment, "$recentPayment");
            AcknowledgePaymentArgs acknowledgePaymentArgs = new AcknowledgePaymentArgs(recentPayment);
            i.e(acknowledgePaymentArgs, "mavericksArg");
            v.a1(recentPaymentsFragment, new v0(acknowledgePaymentArgs), (q) null, 2);
        }

        /* access modifiers changed from: private */
        /* renamed from: buildItemModel$lambda-2  reason: not valid java name */
        public static final void m33buildItemModel$lambda2(RecentPaymentsFragment recentPaymentsFragment, RecentPayment recentPayment, View view) {
            i.e(recentPaymentsFragment, "this$0");
            i.e(recentPayment, "$recentPayment");
            RecentPaymentsFragment$RecentPaymentItemContoller$buildItemModel$3$1 recentPaymentsFragment$RecentPaymentItemContoller$buildItemModel$3$1 = new RecentPaymentsFragment$RecentPaymentItemContoller$buildItemModel$3$1(recentPaymentsFragment, recentPayment);
            i.e(recentPaymentsFragment, "<this>");
            i.e(recentPaymentsFragment$RecentPaymentItemContoller$buildItemModel$3$1, "f");
            d.a aVar = new d.a(recentPaymentsFragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            recentPaymentsFragment$RecentPaymentItemContoller$buildItemModel$3$1.invoke(aVar);
            aVar.g();
        }

        public t<?> buildItemModel(int i, i0.e.b.b3.b.e.k kVar) {
            if (kVar != null) {
                RecentPayment recentPayment = kVar.b;
                b bVar = new b();
                bVar.t(Integer.valueOf(recentPayment.c));
                String string = this.this$0.getString(com.clubhouse.app.R.string.amount_dollars, Integer.valueOf(recentPayment.d / 100));
                bVar.w();
                bVar.l = string;
                String str = recentPayment.y;
                bVar.w();
                bVar.j = str;
                String str2 = recentPayment.x;
                bVar.w();
                bVar.k = str2;
                OffsetDateTime offsetDateTime = recentPayment.Z1;
                bVar.w();
                bVar.n = offsetDateTime;
                Boolean valueOf = Boolean.valueOf(recentPayment.Y1);
                bVar.w();
                bVar.m = valueOf;
                p pVar = new p(this.this$0, recentPayment);
                bVar.w();
                bVar.o = pVar;
                o oVar = new o(this.this$0, recentPayment);
                bVar.w();
                bVar.q = oVar;
                i0.e.b.g3.s.q qVar = new i0.e.b.g3.s.q(this.this$0, recentPayment);
                bVar.w();
                bVar.p = qVar;
                i.d(bVar, "RecentPaymentItem_()\n                .id(recentPayment.id)\n                .amount(getString(R.string.amount_dollars, recentPayment.amountCents / 100))\n                .photoUrl(recentPayment.fromPhotoUrl)\n                .name(recentPayment.fromName)\n                .timeCreated(recentPayment.timeCreated)\n                .acknowledged(recentPayment.isAcknowledged)\n                .avatarClickListener { _ ->\n                    navigateSafe(\n                        RecentPaymentsFragmentDirections.actionRecentPaymentsFragmentToProfileFragment(\n                            ProfileArgs(\n                                userId = recentPayment.fromId,\n                                source = SourceLocation.UNKNOWN)\n                        )\n                    )\n                }\n                .unAcknowledgedClickListener { _ ->\n                    navigateSafe(\n                        RecentPaymentsFragmentDirections\n                            .actionRecentPaymentsFragmentToSayThanksDialog(\n                                AcknowledgePaymentArgs(recentPayment)\n                            )\n                    )\n                }\n                .acknowledgedClickListener { _ ->\n                    alertDialog {\n                        setTitle(R.string.all_set)\n                        setMessage(\n                            getString(\n                                R.string.already_thanked,\n                                recentPayment.fromName,\n                                recentPayment.amountCents / 100\n                            )\n                        )\n                        setPositiveButton(R.string.ok) { dialog, _ ->\n                            dialog.dismiss()\n                        }\n                    }\n                }");
                return bVar;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<RecentPaymentsFragment, RecentPaymentsViewModel> {
        public final /* synthetic */ m0.r.d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ m0.r.d c;

        public a(m0.r.d dVar, boolean z, l lVar, m0.r.d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return i0.b.b.g.a.b(fragment, kVar, this.a, new RecentPaymentsFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(GetRecentPaymentsState.class), false, this.b);
        }
    }

    public RecentPaymentsFragment() {
        super(com.clubhouse.app.R.layout.fragment_recent_payments);
        m0.r.d a3 = m.a(RecentPaymentsViewModel.class);
        this.b2 = new a(a3, false, new RecentPaymentsFragment$special$$inlined$fragmentViewModel$default$1(this, a3, a3), a3).a(this, Z1[1]);
        this.c2 = new RecentPaymentItemContoller(this);
    }

    public void J() {
        v.v2(O0(), new RecentPaymentsFragment$invalidate$1(this));
    }

    public final FragmentRecentPaymentsBinding N0() {
        return (FragmentRecentPaymentsBinding) this.a2.getValue(this, Z1[0]);
    }

    public final RecentPaymentsViewModel O0() {
        return (RecentPaymentsViewModel) this.b2.getValue();
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(O0().l, new RecentPaymentsFragment$onViewCreated$1(this, (m0.l.c<? super RecentPaymentsFragment$onViewCreated$1>) null));
        h0.q.p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, h0.q.q.a(viewLifecycleOwner));
        N0().a.setOnClickListener(new n(this));
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$12 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(v.f1(this.c2), new RecentPaymentsFragment$configurePagingController$1(this, (m0.l.c<? super RecentPaymentsFragment$configurePagingController$1>) null));
        h0.q.p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$12, h0.q.q.a(viewLifecycleOwner2));
        N0().c.setController(this.c2);
        v.p0(this, "thank_you_message", new RecentPaymentsFragment$onViewCreated$3(this));
    }
}
