package com.stripe.android.view;

import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R;
import com.stripe.android.databinding.BankListPaymentMethodBinding;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import h0.o.a.k;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import m0.c;
import m0.j.o;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.d;
import m0.q.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B'\b\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b \u0010!J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006#"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodFpxView;", "Lcom/stripe/android/view/AddPaymentMethodView;", "Lcom/stripe/android/model/BankStatuses;", "fpxBankStatuses", "Lm0/i;", "onFpxBankStatusesUpdated", "(Lcom/stripe/android/model/BankStatuses;)V", "updateStatuses", "", "position", "Lcom/stripe/android/view/FpxBank;", "getItem", "(I)Lcom/stripe/android/view/FpxBank;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "createParams", "Lcom/stripe/android/model/BankStatuses;", "Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "fpxAdapter", "Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "Lcom/stripe/android/view/FpxViewModel;", "viewModel$delegate", "Lm0/c;", "getViewModel", "()Lcom/stripe/android/view/FpxViewModel;", "viewModel", "Lh0/o/a/k;", "activity", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Lh0/o/a/k;Landroid/util/AttributeSet;I)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodFpxView.kt */
public final class AddPaymentMethodFpxView extends AddPaymentMethodView {
    public static final Companion Companion = new Companion((f) null);
    private final AddPaymentMethodListAdapter fpxAdapter;
    private BankStatuses fpxBankStatuses;
    private final c viewModel$delegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodFpxView$Companion;", "", "Lh0/o/a/k;", "activity", "Lcom/stripe/android/view/AddPaymentMethodFpxView;", "create$payments_core_release", "(Lh0/o/a/k;)Lcom/stripe/android/view/AddPaymentMethodFpxView;", "create", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AddPaymentMethodFpxView.kt */
    public static final class Companion {
        private Companion() {
        }

        public final /* synthetic */ AddPaymentMethodFpxView create$payments_core_release(k kVar) {
            i.e(kVar, "activity");
            return new AddPaymentMethodFpxView(kVar, (AttributeSet) null, 0, 6, (f) null);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public AddPaymentMethodFpxView(k kVar) {
        this(kVar, (AttributeSet) null, 0, 6, (f) null);
    }

    public AddPaymentMethodFpxView(k kVar, AttributeSet attributeSet) {
        this(kVar, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddPaymentMethodFpxView(k kVar, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(kVar, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final FpxBank getItem(int i) {
        return FpxBank.values()[i];
    }

    /* access modifiers changed from: private */
    public final FpxViewModel getViewModel() {
        return (FpxViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void onFpxBankStatusesUpdated(BankStatuses bankStatuses) {
        if (bankStatuses != null) {
            updateStatuses(bankStatuses);
        }
    }

    private final void updateStatuses(BankStatuses bankStatuses) {
        this.fpxBankStatuses = bankStatuses;
        this.fpxAdapter.setBankStatuses$payments_core_release(bankStatuses);
        FpxBank[] values = FpxBank.values();
        i.e(values, "$this$indices");
        e eVar = new e(0, h.t1(values));
        ArrayList arrayList = new ArrayList();
        Iterator it = eVar.iterator();
        while (((d) it).d) {
            Object next = ((o) it).next();
            if (!bankStatuses.isOnline$payments_core_release(getItem(((Number) next).intValue()))) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.fpxAdapter.notifyAdapterItemChanged(((Number) it2.next()).intValue());
        }
    }

    public PaymentMethodCreateParams getCreateParams() {
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.Fpx(FpxBank.values()[this.fpxAdapter.getSelectedPosition()].getCode()), (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodFpxView(k kVar, AttributeSet attributeSet, int i) {
        super(kVar, attributeSet, i);
        i.e(kVar, "activity");
        this.fpxBankStatuses = new BankStatuses((Map) null, 1, (f) null);
        AddPaymentMethodListAdapter addPaymentMethodListAdapter = new AddPaymentMethodListAdapter(new ThemeConfig(kVar), h.l4(FpxBank.values()), new AddPaymentMethodFpxView$fpxAdapter$1(this));
        this.fpxAdapter = addPaymentMethodListAdapter;
        this.viewModel$delegate = h.H2(new AddPaymentMethodFpxView$viewModel$2(kVar));
        BankListPaymentMethodBinding inflate = BankListPaymentMethodBinding.inflate(kVar.getLayoutInflater(), this, true);
        i.d(inflate, "BankListPaymentMethodBin…           true\n        )");
        setId(R.id.stripe_payment_methods_add_fpx);
        getViewModel().getFpxBankStatues$payments_core_release().observe(kVar, new AddPaymentMethodFpxView$sam$androidx_lifecycle_Observer$0(new l<BankStatuses, m0.i>(this) {
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BankStatuses) obj);
                return m0.i.a;
            }

            public final void invoke(BankStatuses bankStatuses) {
                ((AddPaymentMethodFpxView) this.receiver).onFpxBankStatusesUpdated(bankStatuses);
            }
        }));
        RecyclerView recyclerView = inflate.bankList;
        recyclerView.setAdapter(addPaymentMethodListAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(kVar));
        recyclerView.setItemAnimator(new h0.v.a.f());
        Integer selectedPosition$payments_core_release = getViewModel().getSelectedPosition$payments_core_release();
        if (selectedPosition$payments_core_release != null) {
            addPaymentMethodListAdapter.updateSelected$payments_core_release(selectedPosition$payments_core_release.intValue());
        }
    }
}
