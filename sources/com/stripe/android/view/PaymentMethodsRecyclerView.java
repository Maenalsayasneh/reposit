package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.PaymentMethod;
import h0.v.a.k;
import kotlin.Metadata;
import m0.i;
import m0.n.a.l;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0001\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Lh0/v/a/k$g;", "callback", "Lm0/i;", "attachItemTouchHelper$payments_core_release", "(Lh0/v/a/k$g;)V", "attachItemTouchHelper", "Lkotlin/Function1;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethodSelectedCallback", "Lm0/n/a/l;", "getPaymentMethodSelectedCallback$payments_core_release", "()Lm0/n/a/l;", "setPaymentMethodSelectedCallback$payments_core_release", "(Lm0/n/a/l;)V", "tappedPaymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "getTappedPaymentMethod$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod;", "setTappedPaymentMethod$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodsRecyclerView.kt */
public final class PaymentMethodsRecyclerView extends RecyclerView {
    private l<? super PaymentMethod, i> paymentMethodSelectedCallback;
    private PaymentMethod tappedPaymentMethod;

    public PaymentMethodsRecyclerView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void attachItemTouchHelper$payments_core_release(k.g gVar) {
        m0.n.b.i.e(gVar, "callback");
        k kVar = new k(gVar);
        RecyclerView recyclerView = kVar.k2;
        if (recyclerView != this) {
            if (recyclerView != null) {
                recyclerView.removeItemDecoration(kVar);
                kVar.k2.removeOnItemTouchListener(kVar.t2);
                kVar.k2.removeOnChildAttachStateChangeListener(kVar);
                for (int size = kVar.i2.size() - 1; size >= 0; size--) {
                    k.f fVar = kVar.i2.get(0);
                    fVar.g.cancel();
                    kVar.f2.clearView(kVar.k2, fVar.e);
                }
                kVar.i2.clear();
                kVar.p2 = null;
                kVar.q2 = -1;
                VelocityTracker velocityTracker = kVar.m2;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    kVar.m2 = null;
                }
                k.e eVar = kVar.s2;
                if (eVar != null) {
                    eVar.a = false;
                    kVar.s2 = null;
                }
                if (kVar.r2 != null) {
                    kVar.r2 = null;
                }
            }
            kVar.k2 = this;
            Resources resources = getResources();
            kVar.Y1 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            kVar.Z1 = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            kVar.j2 = ViewConfiguration.get(kVar.k2.getContext()).getScaledTouchSlop();
            kVar.k2.addItemDecoration(kVar);
            kVar.k2.addOnItemTouchListener(kVar.t2);
            kVar.k2.addOnChildAttachStateChangeListener(kVar);
            kVar.s2 = new k.e();
            kVar.r2 = new h0.i.i.f(kVar.k2.getContext(), kVar.s2);
        }
    }

    public final l<PaymentMethod, i> getPaymentMethodSelectedCallback$payments_core_release() {
        return this.paymentMethodSelectedCallback;
    }

    public final PaymentMethod getTappedPaymentMethod$payments_core_release() {
        return this.tappedPaymentMethod;
    }

    public final void setPaymentMethodSelectedCallback$payments_core_release(l<? super PaymentMethod, i> lVar) {
        m0.n.b.i.e(lVar, "<set-?>");
        this.paymentMethodSelectedCallback = lVar;
    }

    public final void setTappedPaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        this.tappedPaymentMethod = paymentMethod;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m0.n.b.i.e(context, "context");
        this.paymentMethodSelectedCallback = PaymentMethodsRecyclerView$paymentMethodSelectedCallback$1.INSTANCE;
        setHasFixedSize(false);
        setLayoutManager(new LinearLayoutManager(context));
        setItemAnimator(new h0.v.a.f(this) {
            public final /* synthetic */ PaymentMethodsRecyclerView this$0;

            {
                this.this$0 = r1;
            }

            public void onAnimationFinished(RecyclerView.b0 b0Var) {
                m0.n.b.i.e(b0Var, "viewHolder");
                super.onAnimationFinished(b0Var);
                PaymentMethod tappedPaymentMethod$payments_core_release = this.this$0.getTappedPaymentMethod$payments_core_release();
                if (tappedPaymentMethod$payments_core_release != null) {
                    this.this$0.getPaymentMethodSelectedCallback$payments_core_release().invoke(tappedPaymentMethod$payments_core_release);
                }
                this.this$0.setTappedPaymentMethod$payments_core_release((PaymentMethod) null);
            }
        });
    }
}
