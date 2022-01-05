package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R;
import com.stripe.android.databinding.AddPaymentMethodRowBinding;
import com.stripe.android.databinding.GooglePayRowBinding;
import com.stripe.android.databinding.MaskedCardRowBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.AddPaymentMethodActivityStarter;
import com.stripe.android.view.PaymentMethodsActivityStarter;
import h0.i.i.q;
import h0.q.y;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004nopqBI\u0012\u0006\u0010j\u001a\u00020i\u0012\u000e\b\u0002\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u001d\u0012\n\b\u0002\u0010k\u001a\u0004\u0018\u00010T\u0012\b\b\u0002\u0010h\u001a\u00020\u0005\u0012\b\b\u0002\u0010]\u001a\u00020\u0005\u0012\b\b\u0002\u0010J\u001a\u00020\u0005¢\u0006\u0004\bl\u0010mJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001d\u0010\"\u001a\u00020\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b%\u0010\u001bJ\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b,\u0010\u000bJ\u001f\u0010/\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u0003H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00104\u001a\u00020\t2\u0006\u00101\u001a\u00020\u001eH\u0000¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\t2\u0006\u00101\u001a\u00020\u001eH\u0000¢\u0006\u0004\b5\u00103J\u0017\u00109\u001a\u00020\u001e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b7\u00108J\u0019\u0010<\u001a\u0004\u0018\u00010\u00032\u0006\u00101\u001a\u00020\u001eH\u0000¢\u0006\u0004\b:\u0010;R$\u0010>\u001a\u0004\u0018\u00010=8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0D8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001f\u0010E\u001a\u0004\bF\u0010GR\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u001d8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010ER\u0016\u0010J\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020M0L8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001c\u0010P\u001a\u00020M8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR$\u0010U\u001a\u0004\u0018\u00010T8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001c\u0010[\u001a\u00020M8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b[\u0010Q\u001a\u0004\b\\\u0010SR\u0016\u0010]\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010KR\u0016\u0010^\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010b\u001a\u0004\u0018\u00010\u001e8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u001f\u0010d\u001a\b\u0012\u0004\u0012\u00020M0c8\u0006@\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bh\u0010K¨\u0006r"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$b0;", "", "position", "", "isGooglePayPosition", "(I)Z", "isPaymentMethodsPosition", "Lm0/i;", "updateSelectedPaymentMethod", "(I)V", "Landroid/view/ViewGroup;", "parent", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;", "createAddCardPaymentMethodViewHolder", "(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;", "createAddFpxPaymentMethodViewHolder", "(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "createPaymentMethodViewHolder", "(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;", "createGooglePayViewHolder", "(Landroid/view/ViewGroup;)Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;", "getPaymentMethodIndex", "(I)I", "getAddableTypesPosition", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethods", "setPaymentMethods$payments_core_release", "(Ljava/util/List;)V", "setPaymentMethods", "getItemCount", "()I", "getItemViewType", "", "getItemId", "(I)J", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$b0;I)V", "onPositionClicked$payments_core_release", "onPositionClicked", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$b0;", "paymentMethod", "deletePaymentMethod$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod;)V", "deletePaymentMethod", "resetPaymentMethod$payments_core_release", "resetPaymentMethod", "getPaymentMethodAtPosition$payments_core_release", "(I)Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethodAtPosition", "getPosition$payments_core_release", "(Lcom/stripe/android/model/PaymentMethod;)Ljava/lang/Integer;", "getPosition", "Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "listener", "Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "getListener$payments_core_release", "()Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "setListener$payments_core_release", "(Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;)V", "", "Ljava/util/List;", "getPaymentMethods$payments_core_release", "()Ljava/util/List;", "Lcom/stripe/android/model/PaymentMethod$Type;", "addableTypes", "canDeletePaymentMethods", "Z", "Lh0/q/y;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "_addPaymentMethodArgs", "Lh0/q/y;", "addCardArgs", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "getAddCardArgs$payments_core_release", "()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "", "selectedPaymentMethodId", "Ljava/lang/String;", "getSelectedPaymentMethodId$payments_core_release", "()Ljava/lang/String;", "setSelectedPaymentMethodId$payments_core_release", "(Ljava/lang/String;)V", "addFpxArgs", "getAddFpxArgs$payments_core_release", "useGooglePay", "googlePayCount", "I", "getSelectedPaymentMethod$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod;", "selectedPaymentMethod", "Landroidx/lifecycle/LiveData;", "addPaymentMethodArgs", "Landroidx/lifecycle/LiveData;", "getAddPaymentMethodArgs", "()Landroidx/lifecycle/LiveData;", "shouldShowGooglePay", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "intentArgs", "initiallySelectedPaymentMethodId", "<init>", "(Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;Ljava/util/List;Ljava/lang/String;ZZZ)V", "Companion", "Listener", "ViewHolder", "ViewType", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodsAdapter.kt */
public final class PaymentMethodsAdapter extends RecyclerView.Adapter<RecyclerView.b0> {
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    public static final long GOOGLE_PAY_ITEM_ID = ((long) -2057760476);
    /* access modifiers changed from: private */
    public final y<AddPaymentMethodActivityStarter.Args> _addPaymentMethodArgs;
    private final AddPaymentMethodActivityStarter.Args addCardArgs;
    private final AddPaymentMethodActivityStarter.Args addFpxArgs;
    private final LiveData<AddPaymentMethodActivityStarter.Args> addPaymentMethodArgs;
    private final List<PaymentMethod.Type> addableTypes;
    private final boolean canDeletePaymentMethods;
    private final int googlePayCount;
    private Listener listener;
    private final List<PaymentMethod> paymentMethods;
    private String selectedPaymentMethodId;
    private final boolean shouldShowGooglePay;
    private final boolean useGooglePay;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$Companion;", "", "", "GOOGLE_PAY_ITEM_ID", "J", "getGOOGLE_PAY_ITEM_ID$payments_core_release", "()J", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodsAdapter.kt */
    public static final class Companion {
        private Companion() {
        }

        public final long getGOOGLE_PAY_ITEM_ID$payments_core_release() {
            return PaymentMethodsAdapter.GOOGLE_PAY_ITEM_ID;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$Listener;", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lm0/i;", "onPaymentMethodClick", "(Lcom/stripe/android/model/PaymentMethod;)V", "onGooglePayClick", "()V", "onDeletePaymentMethodAction", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodsAdapter.kt */
    public interface Listener {
        void onDeletePaymentMethodAction(PaymentMethod paymentMethod);

        void onGooglePayClick();

        void onPaymentMethodClick(PaymentMethod paymentMethod);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0001\u0001\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$b0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "AddCardPaymentMethodViewHolder", "AddFpxPaymentMethodViewHolder", "GooglePayViewHolder", "PaymentMethodViewHolder", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodsAdapter.kt */
    public static abstract class ViewHolder extends RecyclerView.b0 {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$PaymentMethodViewHolder;", "Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder;", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lm0/i;", "setPaymentMethod", "(Lcom/stripe/android/model/PaymentMethod;)V", "", "selected", "setSelected", "(Z)V", "Lcom/stripe/android/databinding/MaskedCardRowBinding;", "viewBinding", "Lcom/stripe/android/databinding/MaskedCardRowBinding;", "<init>", "(Lcom/stripe/android/databinding/MaskedCardRowBinding;)V", "Landroid/view/ViewGroup;", "parent", "(Landroid/view/ViewGroup;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodsAdapter.kt */
        public static final class PaymentMethodViewHolder extends ViewHolder {
            private final MaskedCardRowBinding viewBinding;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public PaymentMethodViewHolder(com.stripe.android.databinding.MaskedCardRowBinding r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    m0.n.b.i.e(r3, r0)
                    android.widget.FrameLayout r0 = r3.getRoot()
                    java.lang.String r1 = "viewBinding.root"
                    m0.n.b.i.d(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.viewBinding = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder.<init>(com.stripe.android.databinding.MaskedCardRowBinding):void");
            }

            public final void setPaymentMethod(PaymentMethod paymentMethod) {
                i.e(paymentMethod, "paymentMethod");
                this.viewBinding.maskedCardItem.setPaymentMethod(paymentMethod);
            }

            public final void setSelected(boolean z) {
                MaskedCardView maskedCardView = this.viewBinding.maskedCardItem;
                i.d(maskedCardView, "viewBinding.maskedCardItem");
                maskedCardView.setSelected(z);
                View view = this.itemView;
                i.d(view, "itemView");
                view.setSelected(z);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public PaymentMethodViewHolder(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "parent"
                    m0.n.b.i.e(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    com.stripe.android.databinding.MaskedCardRowBinding r3 = com.stripe.android.databinding.MaskedCardRowBinding.inflate(r0, r3, r1)
                    java.lang.String r0 = "MaskedCardRowBinding.inf…  false\n                )"
                    m0.n.b.i.d(r3, r0)
                    r2.<init>((com.stripe.android.databinding.MaskedCardRowBinding) r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder.<init>(android.view.ViewGroup):void");
            }
        }

        private ViewHolder(View view) {
            super(view);
        }

        public /* synthetic */ ViewHolder(View view, f fVar) {
            this(view);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddCardPaymentMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$b0;", "Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;", "viewBinding", "<init>", "(Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;)V", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "parent", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodsAdapter.kt */
        public static final class AddCardPaymentMethodViewHolder extends RecyclerView.b0 {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AddCardPaymentMethodViewHolder(AddPaymentMethodRowBinding addPaymentMethodRowBinding) {
                super(addPaymentMethodRowBinding.getRoot());
                i.e(addPaymentMethodRowBinding, "viewBinding");
                View view = this.itemView;
                i.d(view, "itemView");
                view.setId(R.id.stripe_payment_methods_add_card);
                View view2 = this.itemView;
                i.d(view2, "itemView");
                View view3 = this.itemView;
                i.d(view3, "itemView");
                Resources resources = view3.getResources();
                int i = R.string.payment_method_add_new_card;
                view2.setContentDescription(resources.getString(i));
                AppCompatTextView appCompatTextView = addPaymentMethodRowBinding.label;
                i.d(appCompatTextView, "viewBinding.label");
                View view4 = this.itemView;
                i.d(view4, "itemView");
                appCompatTextView.setText(view4.getResources().getString(i));
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public AddCardPaymentMethodViewHolder(android.content.Context r2, android.view.ViewGroup r3) {
                /*
                    r1 = this;
                    java.lang.String r0 = "context"
                    m0.n.b.i.e(r2, r0)
                    java.lang.String r0 = "parent"
                    m0.n.b.i.e(r3, r0)
                    android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                    r0 = 0
                    com.stripe.android.databinding.AddPaymentMethodRowBinding r2 = com.stripe.android.databinding.AddPaymentMethodRowBinding.inflate(r2, r3, r0)
                    java.lang.String r3 = "AddPaymentMethodRowBindi…  false\n                )"
                    m0.n.b.i.d(r2, r3)
                    r1.<init>(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.AddCardPaymentMethodViewHolder.<init>(android.content.Context, android.view.ViewGroup):void");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$AddFpxPaymentMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$b0;", "Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;", "viewBinding", "<init>", "(Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;)V", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "parent", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodsAdapter.kt */
        public static final class AddFpxPaymentMethodViewHolder extends RecyclerView.b0 {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public AddFpxPaymentMethodViewHolder(AddPaymentMethodRowBinding addPaymentMethodRowBinding) {
                super(addPaymentMethodRowBinding.getRoot());
                i.e(addPaymentMethodRowBinding, "viewBinding");
                View view = this.itemView;
                i.d(view, "itemView");
                view.setId(R.id.stripe_payment_methods_add_fpx);
                View view2 = this.itemView;
                i.d(view2, "itemView");
                View view3 = this.itemView;
                i.d(view3, "itemView");
                Resources resources = view3.getResources();
                int i = R.string.payment_method_add_new_fpx;
                view2.setContentDescription(resources.getString(i));
                AppCompatTextView appCompatTextView = addPaymentMethodRowBinding.label;
                i.d(appCompatTextView, "viewBinding.label");
                View view4 = this.itemView;
                i.d(view4, "itemView");
                appCompatTextView.setText(view4.getResources().getString(i));
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public AddFpxPaymentMethodViewHolder(android.content.Context r2, android.view.ViewGroup r3) {
                /*
                    r1 = this;
                    java.lang.String r0 = "context"
                    m0.n.b.i.e(r2, r0)
                    java.lang.String r0 = "parent"
                    m0.n.b.i.e(r3, r0)
                    android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                    r0 = 0
                    com.stripe.android.databinding.AddPaymentMethodRowBinding r2 = com.stripe.android.databinding.AddPaymentMethodRowBinding.inflate(r2, r3, r0)
                    java.lang.String r3 = "AddPaymentMethodRowBindi…  false\n                )"
                    m0.n.b.i.d(r2, r3)
                    r1.<init>(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.AddFpxPaymentMethodViewHolder.<init>(android.content.Context, android.view.ViewGroup):void");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eB\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewHolder$GooglePayViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$b0;", "", "isSelected", "Lm0/i;", "bind", "(Z)V", "Lcom/stripe/android/view/ThemeConfig;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "Lcom/stripe/android/databinding/GooglePayRowBinding;", "viewBinding", "Lcom/stripe/android/databinding/GooglePayRowBinding;", "<init>", "(Lcom/stripe/android/databinding/GooglePayRowBinding;)V", "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "parent", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodsAdapter.kt */
        public static final class GooglePayViewHolder extends RecyclerView.b0 {
            private final ThemeConfig themeConfig;
            private final GooglePayRowBinding viewBinding;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public GooglePayViewHolder(GooglePayRowBinding googlePayRowBinding) {
                super(googlePayRowBinding.getRoot());
                i.e(googlePayRowBinding, "viewBinding");
                this.viewBinding = googlePayRowBinding;
                View view = this.itemView;
                i.d(view, "itemView");
                Context context = view.getContext();
                i.d(context, "itemView.context");
                ThemeConfig themeConfig2 = new ThemeConfig(context);
                this.themeConfig = themeConfig2;
                googlePayRowBinding.checkIcon.setImageTintList(ColorStateList.valueOf(themeConfig2.getTintColor$payments_core_release(true)));
            }

            public final void bind(boolean z) {
                this.viewBinding.label.setTextColor(ColorStateList.valueOf(this.themeConfig.getTextColor$payments_core_release(z)));
                AppCompatImageView appCompatImageView = this.viewBinding.checkIcon;
                i.d(appCompatImageView, "viewBinding.checkIcon");
                appCompatImageView.setVisibility(z ? 0 : 4);
                View view = this.itemView;
                i.d(view, "itemView");
                view.setSelected(z);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public GooglePayViewHolder(android.content.Context r2, android.view.ViewGroup r3) {
                /*
                    r1 = this;
                    java.lang.String r0 = "context"
                    m0.n.b.i.e(r2, r0)
                    java.lang.String r0 = "parent"
                    m0.n.b.i.e(r3, r0)
                    android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
                    r0 = 0
                    com.stripe.android.databinding.GooglePayRowBinding r2 = com.stripe.android.databinding.GooglePayRowBinding.inflate(r2, r3, r0)
                    java.lang.String r3 = "GooglePayRowBinding.infl…  false\n                )"
                    m0.n.b.i.d(r2, r3)
                    r1.<init>(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentMethodsAdapter.ViewHolder.GooglePayViewHolder.<init>(android.content.Context, android.view.ViewGroup):void");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "Card", "AddCard", "AddFpx", "GooglePay", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodsAdapter.kt */
    public enum ViewType {
        Card,
        AddCard,
        AddFpx,
        GooglePay
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            PaymentMethod.Type.values();
            int[] iArr = new int[21];
            $EnumSwitchMapping$0 = iArr;
            iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            iArr[PaymentMethod.Type.Fpx.ordinal()] = 2;
            ViewType.values();
            int[] iArr2 = new int[4];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[ViewType.Card.ordinal()] = 1;
            iArr2[ViewType.AddCard.ordinal()] = 2;
            iArr2[ViewType.AddFpx.ordinal()] = 3;
            iArr2[ViewType.GooglePay.ordinal()] = 4;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentMethodsAdapter(PaymentMethodsActivityStarter.Args args, List list, String str, boolean z, boolean z2, boolean z3, int i, f fVar) {
        this(args, (i & 2) != 0 ? h.L2(PaymentMethod.Type.Card) : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? true : z3);
    }

    private final ViewHolder.AddCardPaymentMethodViewHolder createAddCardPaymentMethodViewHolder(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        i.d(context, "parent.context");
        return new ViewHolder.AddCardPaymentMethodViewHolder(context, viewGroup);
    }

    private final ViewHolder.AddFpxPaymentMethodViewHolder createAddFpxPaymentMethodViewHolder(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        i.d(context, "parent.context");
        return new ViewHolder.AddFpxPaymentMethodViewHolder(context, viewGroup);
    }

    private final ViewHolder.GooglePayViewHolder createGooglePayViewHolder(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        i.d(context, "parent.context");
        return new ViewHolder.GooglePayViewHolder(context, viewGroup);
    }

    private final ViewHolder.PaymentMethodViewHolder createPaymentMethodViewHolder(ViewGroup viewGroup) {
        ViewHolder.PaymentMethodViewHolder paymentMethodViewHolder = new ViewHolder.PaymentMethodViewHolder(viewGroup);
        if (this.canDeletePaymentMethods) {
            q.a(paymentMethodViewHolder.itemView, viewGroup.getContext().getString(R.string.delete_payment_method), new PaymentMethodsAdapter$createPaymentMethodViewHolder$1(this, paymentMethodViewHolder));
        }
        return paymentMethodViewHolder;
    }

    private final int getAddableTypesPosition(int i) {
        return (i - this.paymentMethods.size()) - this.googlePayCount;
    }

    private final int getPaymentMethodIndex(int i) {
        return i - this.googlePayCount;
    }

    private final boolean isGooglePayPosition(int i) {
        return this.shouldShowGooglePay && i == 0;
    }

    private final boolean isPaymentMethodsPosition(int i) {
        e eVar;
        if (this.shouldShowGooglePay) {
            eVar = new e(1, this.paymentMethods.size());
        } else {
            eVar = m0.q.i.f(0, this.paymentMethods.size());
        }
        return eVar.k(i);
    }

    private final void updateSelectedPaymentMethod(int i) {
        Iterator<PaymentMethod> it = this.paymentMethods.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (i.a(it.next().id, this.selectedPaymentMethodId)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != i) {
            notifyItemChanged(i2);
            PaymentMethod paymentMethod = (PaymentMethod) g.z(this.paymentMethods, i);
            this.selectedPaymentMethodId = paymentMethod != null ? paymentMethod.id : null;
        }
        notifyItemChanged(i);
    }

    public final /* synthetic */ void deletePaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        i.e(paymentMethod, "paymentMethod");
        Integer position$payments_core_release = getPosition$payments_core_release(paymentMethod);
        if (position$payments_core_release != null) {
            int intValue = position$payments_core_release.intValue();
            this.paymentMethods.remove(paymentMethod);
            notifyItemRemoved(intValue);
        }
    }

    public final AddPaymentMethodActivityStarter.Args getAddCardArgs$payments_core_release() {
        return this.addCardArgs;
    }

    public final AddPaymentMethodActivityStarter.Args getAddFpxArgs$payments_core_release() {
        return this.addFpxArgs;
    }

    public final LiveData<AddPaymentMethodActivityStarter.Args> getAddPaymentMethodArgs() {
        return this.addPaymentMethodArgs;
    }

    public int getItemCount() {
        return this.addableTypes.size() + this.paymentMethods.size() + this.googlePayCount;
    }

    public long getItemId(int i) {
        int i2;
        if (isGooglePayPosition(i)) {
            return GOOGLE_PAY_ITEM_ID;
        }
        if (isPaymentMethodsPosition(i)) {
            i2 = getPaymentMethodAtPosition$payments_core_release(i).hashCode();
        } else {
            i2 = this.addableTypes.get(getAddableTypesPosition(i)).code.hashCode();
        }
        return (long) i2;
    }

    public int getItemViewType(int i) {
        if (isGooglePayPosition(i)) {
            return ViewType.GooglePay.ordinal();
        }
        if (isPaymentMethodsPosition(i)) {
            if (PaymentMethod.Type.Card == getPaymentMethodAtPosition$payments_core_release(i).type) {
                return ViewType.Card.ordinal();
            }
            return super.getItemViewType(i);
        }
        PaymentMethod.Type type = this.addableTypes.get(getAddableTypesPosition(i));
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            return ViewType.AddCard.ordinal();
        }
        if (ordinal == 2) {
            return ViewType.AddFpx.ordinal();
        }
        StringBuilder P0 = a.P0("Unsupported PaymentMethod type: ");
        P0.append(type.code);
        throw new IllegalArgumentException(P0.toString());
    }

    public final Listener getListener$payments_core_release() {
        return this.listener;
    }

    public final /* synthetic */ PaymentMethod getPaymentMethodAtPosition$payments_core_release(int i) {
        return this.paymentMethods.get(getPaymentMethodIndex(i));
    }

    public final List<PaymentMethod> getPaymentMethods$payments_core_release() {
        return this.paymentMethods;
    }

    public final Integer getPosition$payments_core_release(PaymentMethod paymentMethod) {
        i.e(paymentMethod, "paymentMethod");
        Integer valueOf = Integer.valueOf(this.paymentMethods.indexOf(paymentMethod));
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return Integer.valueOf(valueOf.intValue() + this.googlePayCount);
        }
        return null;
    }

    public final PaymentMethod getSelectedPaymentMethod$payments_core_release() {
        String str = this.selectedPaymentMethodId;
        T t = null;
        if (str == null) {
            return null;
        }
        Iterator<T> it = this.paymentMethods.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (i.a(((PaymentMethod) next).id, str)) {
                t = next;
                break;
            }
        }
        return (PaymentMethod) t;
    }

    public final String getSelectedPaymentMethodId$payments_core_release() {
        return this.selectedPaymentMethodId;
    }

    public void onBindViewHolder(RecyclerView.b0 b0Var, int i) {
        i.e(b0Var, "holder");
        if (b0Var instanceof ViewHolder.PaymentMethodViewHolder) {
            PaymentMethod paymentMethodAtPosition$payments_core_release = getPaymentMethodAtPosition$payments_core_release(i);
            ViewHolder.PaymentMethodViewHolder paymentMethodViewHolder = (ViewHolder.PaymentMethodViewHolder) b0Var;
            paymentMethodViewHolder.setPaymentMethod(paymentMethodAtPosition$payments_core_release);
            paymentMethodViewHolder.setSelected(i.a(paymentMethodAtPosition$payments_core_release.id, this.selectedPaymentMethodId));
            b0Var.itemView.setOnClickListener(new PaymentMethodsAdapter$onBindViewHolder$1(this, b0Var));
        } else if (b0Var instanceof ViewHolder.GooglePayViewHolder) {
            b0Var.itemView.setOnClickListener(new PaymentMethodsAdapter$onBindViewHolder$2(this));
            ((ViewHolder.GooglePayViewHolder) b0Var).bind(this.useGooglePay);
        } else if (b0Var instanceof ViewHolder.AddCardPaymentMethodViewHolder) {
            b0Var.itemView.setOnClickListener(new PaymentMethodsAdapter$onBindViewHolder$3(this));
        } else if (b0Var instanceof ViewHolder.AddFpxPaymentMethodViewHolder) {
            b0Var.itemView.setOnClickListener(new PaymentMethodsAdapter$onBindViewHolder$4(this));
        }
    }

    public RecyclerView.b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        i.e(viewGroup, "parent");
        int ordinal = ViewType.values()[i].ordinal();
        if (ordinal == 0) {
            return createPaymentMethodViewHolder(viewGroup);
        }
        if (ordinal == 1) {
            return createAddCardPaymentMethodViewHolder(viewGroup);
        }
        if (ordinal == 2) {
            return createAddFpxPaymentMethodViewHolder(viewGroup);
        }
        if (ordinal == 3) {
            return createGooglePayViewHolder(viewGroup);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final /* synthetic */ void onPositionClicked$payments_core_release(int i) {
        updateSelectedPaymentMethod(i);
        Listener listener2 = this.listener;
        if (listener2 != null) {
            listener2.onPaymentMethodClick(getPaymentMethodAtPosition$payments_core_release(i));
        }
    }

    public final /* synthetic */ void resetPaymentMethod$payments_core_release(PaymentMethod paymentMethod) {
        i.e(paymentMethod, "paymentMethod");
        Integer position$payments_core_release = getPosition$payments_core_release(paymentMethod);
        if (position$payments_core_release != null) {
            notifyItemChanged(position$payments_core_release.intValue());
        }
    }

    public final void setListener$payments_core_release(Listener listener2) {
        this.listener = listener2;
    }

    public final /* synthetic */ void setPaymentMethods$payments_core_release(List<PaymentMethod> list) {
        i.e(list, "paymentMethods");
        this.paymentMethods.clear();
        this.paymentMethods.addAll(list);
        notifyDataSetChanged();
    }

    public final void setSelectedPaymentMethodId$payments_core_release(String str) {
        this.selectedPaymentMethodId = str;
    }

    public PaymentMethodsAdapter(PaymentMethodsActivityStarter.Args args, List<? extends PaymentMethod.Type> list, String str, boolean z, boolean z2, boolean z3) {
        i.e(args, "intentArgs");
        i.e(list, "addableTypes");
        this.addableTypes = list;
        this.shouldShowGooglePay = z;
        this.useGooglePay = z2;
        this.canDeletePaymentMethods = z3;
        this.paymentMethods = new ArrayList();
        this.selectedPaymentMethodId = str;
        Integer num = 1;
        num.intValue();
        num = !z ? null : num;
        this.googlePayCount = num != null ? num.intValue() : 0;
        y<AddPaymentMethodActivityStarter.Args> yVar = new y<>();
        this._addPaymentMethodArgs = yVar;
        this.addPaymentMethodArgs = yVar;
        this.addCardArgs = new AddPaymentMethodActivityStarter.Args.Builder().setBillingAddressFields(args.getBillingAddressFields$payments_core_release()).setShouldAttachToCustomer(true).setIsPaymentSessionActive$payments_core_release(args.isPaymentSessionActive$payments_core_release()).setPaymentMethodType(PaymentMethod.Type.Card).setAddPaymentMethodFooter(args.getAddPaymentMethodFooterLayoutId()).setPaymentConfiguration$payments_core_release(args.getPaymentConfiguration$payments_core_release()).setWindowFlags(args.getWindowFlags$payments_core_release()).build();
        this.addFpxArgs = new AddPaymentMethodActivityStarter.Args.Builder().setIsPaymentSessionActive$payments_core_release(args.isPaymentSessionActive$payments_core_release()).setPaymentMethodType(PaymentMethod.Type.Fpx).setPaymentConfiguration$payments_core_release(args.getPaymentConfiguration$payments_core_release()).build();
        setHasStableIds(true);
    }
}
