package com.clubhouse.android.ui.payments;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import com.clubhouse.android.databinding.FragmentSendDirectPaymentBinding;
import com.clubhouse.android.shared.FragmentViewBindingDelegate;
import com.clubhouse.app.R;
import com.stripe.android.CustomerSession;
import com.stripe.android.PaymentSession;
import com.stripe.android.PaymentSessionConfig;
import h0.b0.v;
import h0.q.p;
import h0.q.q;
import i0.b.b.g;
import i0.b.b.h;
import i0.e.b.g3.s.b1;
import i0.e.b.g3.s.c0;
import i0.e.b.g3.s.m0;
import i0.e.b.g3.s.s;
import i0.e.b.g3.s.t;
import i0.e.b.g3.s.u;
import i0.e.b.g3.s.w;
import i0.e.b.g3.s.x;
import i0.e.b.g3.s.y;
import i0.e.b.g3.s.z;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.c;
import m0.n.a.l;
import m0.n.b.i;
import m0.n.b.m;
import m0.r.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010 \u001a\u00020\u001b8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010&\u001a\u00020!8B@\u0002X\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/clubhouse/android/ui/payments/SendDirectPaymentFragment;", "Lcom/clubhouse/android/core/ui/BaseBottomSheetFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Li0/h/a/c/g/d;", "R0", "(Landroid/os/Bundle;)Li0/h/a/c/g/d;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "J", "()V", "Lcom/stripe/android/PaymentSession;", "s2", "Lcom/stripe/android/PaymentSession;", "paymentSession", "Lcom/clubhouse/android/ui/payments/SendDirectPaymentViewModel;", "r2", "Lm0/c;", "V0", "()Lcom/clubhouse/android/ui/payments/SendDirectPaymentViewModel;", "viewModel", "Lcom/clubhouse/android/databinding/FragmentSendDirectPaymentBinding;", "q2", "Lcom/clubhouse/android/shared/FragmentViewBindingDelegate;", "U0", "()Lcom/clubhouse/android/databinding/FragmentSendDirectPaymentBinding;", "binding", "<init>", "app_productionRelease"}, k = 1, mv = {1, 5, 1})
/* compiled from: SendDirectPaymentFragment.kt */
public final class SendDirectPaymentFragment extends Hilt_SendDirectPaymentFragment {
    public static final /* synthetic */ k<Object>[] p2 = {m.c(new PropertyReference1Impl(m.a(SendDirectPaymentFragment.class), "binding", "getBinding()Lcom/clubhouse/android/databinding/FragmentSendDirectPaymentBinding;")), m.c(new PropertyReference1Impl(m.a(SendDirectPaymentFragment.class), "viewModel", "getViewModel()Lcom/clubhouse/android/ui/payments/SendDirectPaymentViewModel;"))};
    public final FragmentViewBindingDelegate q2 = new FragmentViewBindingDelegate(FragmentSendDirectPaymentBinding.class, this);
    public final c r2;
    public PaymentSession s2;

    /* compiled from: ViewModelDelegateProvider.kt */
    public static final class a extends h<SendDirectPaymentFragment, SendDirectPaymentViewModel> {
        public final /* synthetic */ d a;
        public final /* synthetic */ l b;
        public final /* synthetic */ d c;

        public a(d dVar, boolean z, l lVar, d dVar2) {
            this.a = dVar;
            this.b = lVar;
            this.c = dVar2;
        }

        public c a(Object obj, k kVar) {
            Fragment fragment = (Fragment) obj;
            i.e(fragment, "thisRef");
            i.e(kVar, "property");
            return g.a.b(fragment, kVar, this.a, new SendDirectPaymentFragment$special$$inlined$fragmentViewModel$default$2$1(this), m.a(b1.class), false, this.b);
        }
    }

    public SendDirectPaymentFragment() {
        super(R.layout.fragment_send_direct_payment);
        d a2 = m.a(SendDirectPaymentViewModel.class);
        this.r2 = new a(a2, false, new SendDirectPaymentFragment$special$$inlined$fragmentViewModel$default$1(this, a2, a2), a2).a(this, p2[1]);
    }

    public void J() {
        v.v2(V0(), new SendDirectPaymentFragment$invalidate$1(this));
    }

    public Dialog L0(Bundle bundle) {
        i0.h.a.c.g.d R0 = super.L0(bundle);
        R0.setOnKeyListener(new i0.e.b.g3.s.v(this));
        return R0;
    }

    public i0.h.a.c.g.d R0(Bundle bundle) {
        i0.h.a.c.g.d R0 = super.L0(bundle);
        R0.setOnKeyListener(new i0.e.b.g3.s.v(this));
        return R0;
    }

    public final FragmentSendDirectPaymentBinding U0() {
        return (FragmentSendDirectPaymentBinding) this.q2.getValue(this, p2[0]);
    }

    public final SendDirectPaymentViewModel V0() {
        return (SendDirectPaymentViewModel) this.r2.getValue();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        V0().p(new m0(i, intent));
        PaymentSession paymentSession = this.s2;
        if (paymentSession != null) {
            paymentSession.handlePaymentData(i, i2, intent);
        } else {
            i.m("paymentSession");
            throw null;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CustomerSession.Companion companion = CustomerSession.Companion;
        Context requireContext = requireContext();
        i.d(requireContext, "requireContext()");
        CustomerSession.Companion.initCustomerSession$default(companion, requireContext, V0(), false, 4, (Object) null);
        PaymentSession paymentSession = new PaymentSession((Fragment) this, new PaymentSessionConfig.Builder().setShippingInfoRequired(false).setShippingMethodsRequired(false).build());
        this.s2 = paymentSession;
        paymentSession.init(new SendDirectPaymentFragment$setUpStripe$1(this));
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(V0().l, new SendDirectPaymentFragment$onViewCreated$1(this, (m0.l.c<? super SendDirectPaymentFragment$onViewCreated$1>) null));
        p viewLifecycleOwner = getViewLifecycleOwner();
        i.d(viewLifecycleOwner, "viewLifecycleOwner");
        m0.r.t.a.r.m.a1.a.F2(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, q.a(viewLifecycleOwner));
        U0().b.setOnClickListener(new z(this));
        Button button = U0().p;
        i.d(button, "binding.paymentAmount5");
        p viewLifecycleOwner2 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner2, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button, q.a(viewLifecycleOwner2), new c0(this));
        Button button2 = U0().n;
        i.d(button2, "binding.paymentAmount10");
        p viewLifecycleOwner3 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner3, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button2, q.a(viewLifecycleOwner3), new t(this));
        Button button3 = U0().o;
        i.d(button3, "binding.paymentAmount20");
        p viewLifecycleOwner4 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner4, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button3, q.a(viewLifecycleOwner4), new x(this));
        Button button4 = U0().r;
        i.d(button4, "binding.paymentAmountOther");
        p viewLifecycleOwner5 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner5, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button4, q.a(viewLifecycleOwner5), new u(this));
        U0().q.setOnClickListener(new s(this));
        Button button5 = U0().f;
        i.d(button5, "binding.confirmButton");
        p viewLifecycleOwner6 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner6, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button5, q.a(viewLifecycleOwner6), new y(this));
        Button button6 = U0().c;
        i.d(button6, "binding.backButton");
        p viewLifecycleOwner7 = getViewLifecycleOwner();
        i.d(viewLifecycleOwner7, "viewLifecycleOwner");
        i0.e.b.d3.k.H(button6, q.a(viewLifecycleOwner7), new w(this));
    }
}
