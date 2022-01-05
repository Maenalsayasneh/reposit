package com.stripe.android.view;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R;
import com.stripe.android.databinding.BankListPaymentMethodBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import h0.o.a.k;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B'\b\u0001\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\b8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodNetbankingView;", "Lcom/stripe/android/view/AddPaymentMethodView;", "", "selectedPosition", "Ljava/lang/Integer;", "Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "netbankingAdapter", "Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "createParams", "Lh0/o/a/k;", "activity", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Lh0/o/a/k;Landroid/util/AttributeSet;I)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodNetbankingView.kt */
public final class AddPaymentMethodNetbankingView extends AddPaymentMethodView {
    public static final Companion Companion = new Companion((f) null);
    private final AddPaymentMethodListAdapter netbankingAdapter;
    /* access modifiers changed from: private */
    public Integer selectedPosition;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodNetbankingView$Companion;", "", "Lh0/o/a/k;", "activity", "Lcom/stripe/android/view/AddPaymentMethodNetbankingView;", "create$payments_core_release", "(Lh0/o/a/k;)Lcom/stripe/android/view/AddPaymentMethodNetbankingView;", "create", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AddPaymentMethodNetbankingView.kt */
    public static final class Companion {
        private Companion() {
        }

        public final /* synthetic */ AddPaymentMethodNetbankingView create$payments_core_release(k kVar) {
            i.e(kVar, "activity");
            return new AddPaymentMethodNetbankingView(kVar, (AttributeSet) null, 0, 6, (f) null);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public AddPaymentMethodNetbankingView(k kVar) {
        this(kVar, (AttributeSet) null, 0, 6, (f) null);
    }

    public AddPaymentMethodNetbankingView(k kVar, AttributeSet attributeSet) {
        this(kVar, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddPaymentMethodNetbankingView(k kVar, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(kVar, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public PaymentMethodCreateParams getCreateParams() {
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.Netbanking(NetbankingBank.values()[this.netbankingAdapter.getSelectedPosition()].getCode()), (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodNetbankingView(k kVar, AttributeSet attributeSet, int i) {
        super(kVar, attributeSet, i);
        i.e(kVar, "activity");
        AddPaymentMethodListAdapter addPaymentMethodListAdapter = new AddPaymentMethodListAdapter(new ThemeConfig(kVar), h.l4(NetbankingBank.values()), new AddPaymentMethodNetbankingView$netbankingAdapter$1(this));
        this.netbankingAdapter = addPaymentMethodListAdapter;
        BankListPaymentMethodBinding inflate = BankListPaymentMethodBinding.inflate(kVar.getLayoutInflater(), this, true);
        i.d(inflate, "BankListPaymentMethodBin…           true\n        )");
        setId(R.id.stripe_payment_methods_add_netbanking);
        RecyclerView recyclerView = inflate.bankList;
        recyclerView.setAdapter(addPaymentMethodListAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(kVar));
        recyclerView.setItemAnimator(new h0.v.a.f());
        Integer num = this.selectedPosition;
        if (num != null) {
            addPaymentMethodListAdapter.updateSelected$payments_core_release(num.intValue());
        }
    }
}
