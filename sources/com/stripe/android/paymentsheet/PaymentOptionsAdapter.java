package com.stripe.android.paymentsheet;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.stripe.android.R;
import com.stripe.android.databinding.LayoutPaymentsheetAddCardItemBinding;
import com.stripe.android.databinding.LayoutPaymentsheetGooglePayItemBinding;
import com.stripe.android.databinding.LayoutPaymentsheetPaymentMethodItemBinding;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import m0.i;
import m0.j.g;
import m0.n.a.p;
import m0.n.b.f;
import m0.o.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006EFGHIJB1\u0012\u0006\u00107\u001a\u00020\u0012\u0012\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0&\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\bC\u0010DJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010%R+\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0&8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010,8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0019\u00103\u001a\u0002028\u0006@\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R+\u0010B\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00128@@@X\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006K"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$PaymentOptionViewHolder;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "savedSelection", "", "findInitialSelectedPosition", "(Lcom/stripe/android/paymentsheet/model/SavedSelection;)I", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "findSelectedPosition", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)I", "Lcom/stripe/android/paymentsheet/model/FragmentConfig;", "config", "Lm0/i;", "update", "(Lcom/stripe/android/paymentsheet/model/FragmentConfig;Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "position", "", "isClick", "onItemSelected$payments_core_release", "(IZ)V", "onItemSelected", "", "getItemId", "(I)J", "getItemCount", "()I", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$PaymentOptionViewHolder;", "holder", "onBindViewHolder", "(Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$PaymentOptionViewHolder;I)V", "Lkotlin/Function2;", "paymentOptionSelectedListener", "Lm0/n/a/p;", "getPaymentOptionSelectedListener", "()Lm0/n/a/p;", "", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item;", "items", "Ljava/util/List;", "getSelectedItem$payments_core_release", "()Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item;", "selectedItem", "Landroid/view/View$OnClickListener;", "addCardClickListener", "Landroid/view/View$OnClickListener;", "getAddCardClickListener", "()Landroid/view/View$OnClickListener;", "canClickSelectedItem", "Z", "selectedItemPosition", "I", "<set-?>", "isEnabled$delegate", "Lm0/o/d;", "isEnabled$payments_core_release", "()Z", "setEnabled$payments_core_release", "(Z)V", "isEnabled", "<init>", "(ZLm0/n/a/p;Landroid/view/View$OnClickListener;)V", "AddCardViewHolder", "CardViewHolder", "GooglePayViewHolder", "Item", "PaymentOptionViewHolder", "ViewType", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentOptionsAdapter.kt */
public final class PaymentOptionsAdapter extends RecyclerView.Adapter<PaymentOptionViewHolder> {
    public static final /* synthetic */ k[] $$delegatedProperties = {a.o1(PaymentOptionsAdapter.class, "isEnabled", "isEnabled$payments_core_release()Z", 0)};
    private final View.OnClickListener addCardClickListener;
    private final boolean canClickSelectedItem;
    private final d isEnabled$delegate;
    private List<? extends Item> items = EmptyList.c;
    private final p<PaymentSelection, Boolean, i> paymentOptionSelectedListener;
    private int selectedItemPosition = -1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item;", "", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "viewType", "<init>", "()V", "AddCard", "ExistingPaymentMethod", "GooglePay", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$AddCard;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$GooglePay;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$ExistingPaymentMethod;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionsAdapter.kt */
    public static abstract class Item {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$AddCard;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentOptionsAdapter.kt */
        public static final class AddCard extends Item {
            public static final AddCard INSTANCE = new AddCard();
            private static final ViewType viewType = ViewType.AddCard;

            private AddCard() {
                super((f) null);
            }

            public ViewType getViewType() {
                return viewType;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u001c\u0010\u0016\u001a\u00020\u00158\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$ExistingPaymentMethod;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item;", "Lcom/stripe/android/model/PaymentMethod;", "component1", "()Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "copy", "(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$ExistingPaymentMethod;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "<init>", "(Lcom/stripe/android/model/PaymentMethod;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentOptionsAdapter.kt */
        public static final class ExistingPaymentMethod extends Item {
            private final PaymentMethod paymentMethod;
            private final ViewType viewType = ViewType.Card;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public ExistingPaymentMethod(PaymentMethod paymentMethod2) {
                super((f) null);
                m0.n.b.i.e(paymentMethod2, "paymentMethod");
                this.paymentMethod = paymentMethod2;
            }

            public static /* synthetic */ ExistingPaymentMethod copy$default(ExistingPaymentMethod existingPaymentMethod, PaymentMethod paymentMethod2, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentMethod2 = existingPaymentMethod.paymentMethod;
                }
                return existingPaymentMethod.copy(paymentMethod2);
            }

            public final PaymentMethod component1() {
                return this.paymentMethod;
            }

            public final ExistingPaymentMethod copy(PaymentMethod paymentMethod2) {
                m0.n.b.i.e(paymentMethod2, "paymentMethod");
                return new ExistingPaymentMethod(paymentMethod2);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof ExistingPaymentMethod) && m0.n.b.i.a(this.paymentMethod, ((ExistingPaymentMethod) obj).paymentMethod);
                }
                return true;
            }

            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public ViewType getViewType() {
                return this.viewType;
            }

            public int hashCode() {
                PaymentMethod paymentMethod2 = this.paymentMethod;
                if (paymentMethod2 != null) {
                    return paymentMethod2.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = a.P0("ExistingPaymentMethod(paymentMethod=");
                P0.append(this.paymentMethod);
                P0.append(")");
                return P0.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item$GooglePay;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$Item;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "viewType", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "getViewType", "()Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentOptionsAdapter.kt */
        public static final class GooglePay extends Item {
            public static final GooglePay INSTANCE = new GooglePay();
            private static final ViewType viewType = ViewType.GooglePay;

            private GooglePay() {
                super((f) null);
            }

            public ViewType getViewType() {
                return viewType;
            }
        }

        private Item() {
        }

        public abstract ViewType getViewType();

        public /* synthetic */ Item(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$PaymentOptionViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$b0;", "", "enabled", "Lm0/i;", "setEnabled", "(Z)V", "selected", "", "cardStrokeWidth", "(Z)I", "Landroid/view/ViewGroup;", "parent", "<init>", "(Landroid/view/ViewGroup;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionsAdapter.kt */
    public static abstract class PaymentOptionViewHolder extends RecyclerView.b0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public PaymentOptionViewHolder(ViewGroup viewGroup) {
            super(viewGroup);
            m0.n.b.i.e(viewGroup, "parent");
        }

        public final int cardStrokeWidth(boolean z) {
            if (z) {
                View view = this.itemView;
                m0.n.b.i.d(view, "itemView");
                float dimension = view.getResources().getDimension(R.dimen.stripe_paymentsheet_card_stroke_width_selected);
                if (!Float.isNaN(dimension)) {
                    return Math.round(dimension);
                }
                throw new IllegalArgumentException("Cannot round NaN value.");
            }
            View view2 = this.itemView;
            m0.n.b.i.d(view2, "itemView");
            float dimension2 = view2.getResources().getDimension(R.dimen.stripe_paymentsheet_card_stroke_width);
            if (!Float.isNaN(dimension2)) {
                return Math.round(dimension2);
            }
            throw new IllegalArgumentException("Cannot round NaN value.");
        }

        public abstract void setEnabled(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$ViewType;", "", "<init>", "(Ljava/lang/String;I)V", "Card", "AddCard", "GooglePay", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionsAdapter.kt */
    public enum ViewType {
        Card,
        AddCard,
        GooglePay
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            ViewType.values();
            int[] iArr = new int[3];
            $EnumSwitchMapping$0 = iArr;
            iArr[ViewType.AddCard.ordinal()] = 1;
            iArr[ViewType.GooglePay.ordinal()] = 2;
            iArr[ViewType.Card.ordinal()] = 3;
        }
    }

    public PaymentOptionsAdapter(boolean z, p<? super PaymentSelection, ? super Boolean, i> pVar, View.OnClickListener onClickListener) {
        m0.n.b.i.e(pVar, "paymentOptionSelectedListener");
        m0.n.b.i.e(onClickListener, "addCardClickListener");
        this.canClickSelectedItem = z;
        this.paymentOptionSelectedListener = pVar;
        this.addCardClickListener = onClickListener;
        Boolean bool = Boolean.TRUE;
        this.isEnabled$delegate = new PaymentOptionsAdapter$$special$$inlined$observable$1(bool, bool, this);
        setHasStableIds(true);
    }

    private final int findInitialSelectedPosition(SavedSelection savedSelection) {
        boolean z;
        Integer[] numArr = new Integer[3];
        Iterator<? extends Item> it = this.items.iterator();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Item item = (Item) it.next();
            if (m0.n.b.i.a(savedSelection, SavedSelection.GooglePay.INSTANCE)) {
                z = item instanceof Item.GooglePay;
            } else {
                if (savedSelection instanceof SavedSelection.PaymentMethod) {
                    if (item instanceof Item.ExistingPaymentMethod) {
                        z = m0.n.b.i.a(((SavedSelection.PaymentMethod) savedSelection).getId(), ((Item.ExistingPaymentMethod) item).getPaymentMethod().id);
                    }
                } else if (!m0.n.b.i.a(savedSelection, SavedSelection.None.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        Integer valueOf = Integer.valueOf(i);
        Integer num = null;
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        numArr[0] = valueOf;
        Iterator<? extends Item> it2 = this.items.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            } else if (((Item) it2.next()) instanceof Item.GooglePay) {
                break;
            } else {
                i2++;
            }
        }
        Integer valueOf2 = Integer.valueOf(i2);
        if (!(valueOf2.intValue() != -1)) {
            valueOf2 = null;
        }
        numArr[1] = valueOf2;
        Iterator<? extends Item> it3 = this.items.iterator();
        int i3 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i3 = -1;
                break;
            } else if (((Item) it3.next()) instanceof Item.ExistingPaymentMethod) {
                break;
            } else {
                i3++;
            }
        }
        Integer valueOf3 = Integer.valueOf(i3);
        if (valueOf3.intValue() != -1) {
            z2 = true;
        }
        if (z2) {
            num = valueOf3;
        }
        numArr[2] = num;
        Integer num2 = (Integer) g.w(g.M(numArr));
        if (num2 != null) {
            return num2.intValue();
        }
        return -1;
    }

    private final int findSelectedPosition(PaymentSelection paymentSelection) {
        boolean z;
        int i = 0;
        for (Item item : this.items) {
            if (m0.n.b.i.a(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
                z = item instanceof Item.GooglePay;
            } else {
                z = (!(paymentSelection instanceof PaymentSelection.Saved) || !(item instanceof Item.ExistingPaymentMethod)) ? false : m0.n.b.i.a(((PaymentSelection.Saved) paymentSelection).getPaymentMethod().id, ((Item.ExistingPaymentMethod) item).getPaymentMethod().id);
            }
            if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static /* synthetic */ void update$default(PaymentOptionsAdapter paymentOptionsAdapter, FragmentConfig fragmentConfig, PaymentSelection paymentSelection, int i, Object obj) {
        if ((i & 2) != 0) {
            paymentSelection = null;
        }
        paymentOptionsAdapter.update(fragmentConfig, paymentSelection);
    }

    public final View.OnClickListener getAddCardClickListener() {
        return this.addCardClickListener;
    }

    public int getItemCount() {
        return this.items.size();
    }

    public long getItemId(int i) {
        return (long) ((Item) this.items.get(i)).hashCode();
    }

    public int getItemViewType(int i) {
        return ((Item) this.items.get(i)).getViewType().ordinal();
    }

    public final p<PaymentSelection, Boolean, i> getPaymentOptionSelectedListener() {
        return this.paymentOptionSelectedListener;
    }

    public final Item getSelectedItem$payments_core_release() {
        return (Item) g.z(this.items, this.selectedItemPosition);
    }

    public final boolean isEnabled$payments_core_release() {
        return ((Boolean) this.isEnabled$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void onItemSelected$payments_core_release(int i, boolean z) {
        Object obj;
        if (i == -1) {
            return;
        }
        if (this.canClickSelectedItem || i != this.selectedItemPosition) {
            int i2 = this.selectedItemPosition;
            this.selectedItemPosition = i;
            notifyItemChanged(i2);
            notifyItemChanged(i);
            Item item = (Item) this.items.get(i);
            if (m0.n.b.i.a(item, Item.AddCard.INSTANCE)) {
                obj = null;
            } else if (m0.n.b.i.a(item, Item.GooglePay.INSTANCE)) {
                obj = PaymentSelection.GooglePay.INSTANCE;
            } else if (item instanceof Item.ExistingPaymentMethod) {
                obj = new PaymentSelection.Saved(((Item.ExistingPaymentMethod) item).getPaymentMethod());
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (obj != null) {
                this.paymentOptionSelectedListener.invoke(obj, Boolean.valueOf(z));
            }
        }
    }

    public final void setEnabled$payments_core_release(boolean z) {
        this.isEnabled$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void update(FragmentConfig fragmentConfig, PaymentSelection paymentSelection) {
        int i;
        m0.n.b.i.e(fragmentConfig, "config");
        Item[] itemArr = new Item[2];
        itemArr[0] = Item.AddCard.INSTANCE;
        Item.GooglePay googlePay = Item.GooglePay.INSTANCE;
        Integer num = null;
        if (!fragmentConfig.isGooglePayReady()) {
            googlePay = null;
        }
        boolean z = true;
        itemArr[1] = googlePay;
        List M = g.M(itemArr);
        List<PaymentMethod> sortedPaymentMethods = fragmentConfig.getSortedPaymentMethods();
        ArrayList arrayList = new ArrayList(h.K(sortedPaymentMethods, 10));
        for (PaymentMethod existingPaymentMethod : sortedPaymentMethods) {
            arrayList.add(new Item.ExistingPaymentMethod(existingPaymentMethod));
        }
        this.items = g.Z(M, arrayList);
        Integer valueOf = paymentSelection != null ? Integer.valueOf(findSelectedPosition(paymentSelection)) : null;
        if (valueOf != null && valueOf.intValue() == -1) {
            z = false;
        }
        if (z) {
            num = valueOf;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = findInitialSelectedPosition(fragmentConfig.getSavedSelection());
        }
        onItemSelected$payments_core_release(i, false);
        notifyDataSetChanged();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$AddCardViewHolder;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$PaymentOptionViewHolder;", "", "enabled", "Lm0/i;", "setEnabled", "(Z)V", "Lcom/stripe/android/databinding/LayoutPaymentsheetAddCardItemBinding;", "binding", "Lcom/stripe/android/databinding/LayoutPaymentsheetAddCardItemBinding;", "<init>", "(Lcom/stripe/android/databinding/LayoutPaymentsheetAddCardItemBinding;)V", "Landroid/view/ViewGroup;", "parent", "(Landroid/view/ViewGroup;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionsAdapter.kt */
    public static final class AddCardViewHolder extends PaymentOptionViewHolder {
        private final LayoutPaymentsheetAddCardItemBinding binding;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AddCardViewHolder(com.stripe.android.databinding.LayoutPaymentsheetAddCardItemBinding r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                m0.n.b.i.e(r3, r0)
                androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
                java.lang.String r1 = "binding.root"
                m0.n.b.i.d(r0, r1)
                r2.<init>(r0)
                r2.binding = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsAdapter.AddCardViewHolder.<init>(com.stripe.android.databinding.LayoutPaymentsheetAddCardItemBinding):void");
        }

        public void setEnabled(boolean z) {
            MaterialCardView materialCardView = this.binding.card;
            m0.n.b.i.d(materialCardView, "binding.card");
            materialCardView.setEnabled(z);
            ConstraintLayout root = this.binding.getRoot();
            m0.n.b.i.d(root, "binding.root");
            root.setEnabled(z);
            TextView textView = this.binding.label;
            m0.n.b.i.d(textView, "binding.label");
            textView.setEnabled(z);
            ImageView imageView = this.binding.plusIcon;
            m0.n.b.i.d(imageView, "binding.plusIcon");
            imageView.setAlpha(z ? 1.0f : 0.6f);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AddCardViewHolder(android.view.ViewGroup r3) {
            /*
                r2 = this;
                java.lang.String r0 = "parent"
                m0.n.b.i.e(r3, r0)
                android.content.Context r0 = r3.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 0
                com.stripe.android.databinding.LayoutPaymentsheetAddCardItemBinding r3 = com.stripe.android.databinding.LayoutPaymentsheetAddCardItemBinding.inflate(r0, r3, r1)
                java.lang.String r0 = "LayoutPaymentsheetAddCar…      false\n            )"
                m0.n.b.i.d(r3, r0)
                r2.<init>((com.stripe.android.databinding.LayoutPaymentsheetAddCardItemBinding) r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsAdapter.AddCardViewHolder.<init>(android.view.ViewGroup):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$CardViewHolder;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$PaymentOptionViewHolder;", "Lcom/stripe/android/model/CardBrand;", "brand", "", "last4", "Lm0/i;", "bind", "(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;)V", "Lcom/stripe/android/model/PaymentMethod;", "method", "bindPaymentMethod", "(Lcom/stripe/android/model/PaymentMethod;)V", "", "selected", "setSelected", "(Z)V", "enabled", "setEnabled", "Lcom/stripe/android/databinding/LayoutPaymentsheetPaymentMethodItemBinding;", "binding", "Lcom/stripe/android/databinding/LayoutPaymentsheetPaymentMethodItemBinding;", "<init>", "(Lcom/stripe/android/databinding/LayoutPaymentsheetPaymentMethodItemBinding;)V", "Landroid/view/ViewGroup;", "parent", "(Landroid/view/ViewGroup;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionsAdapter.kt */
    public static final class CardViewHolder extends PaymentOptionViewHolder {
        private final LayoutPaymentsheetPaymentMethodItemBinding binding;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                CardBrand.values();
                int[] iArr = new int[8];
                $EnumSwitchMapping$0 = iArr;
                iArr[CardBrand.Visa.ordinal()] = 1;
                iArr[CardBrand.AmericanExpress.ordinal()] = 2;
                iArr[CardBrand.Discover.ordinal()] = 3;
                iArr[CardBrand.JCB.ordinal()] = 4;
                iArr[CardBrand.DinersClub.ordinal()] = 5;
                iArr[CardBrand.MasterCard.ordinal()] = 6;
                iArr[CardBrand.UnionPay.ordinal()] = 7;
                iArr[CardBrand.Unknown.ordinal()] = 8;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public CardViewHolder(com.stripe.android.databinding.LayoutPaymentsheetPaymentMethodItemBinding r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                m0.n.b.i.e(r3, r0)
                androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
                java.lang.String r1 = "binding.root"
                m0.n.b.i.d(r0, r1)
                r2.<init>(r0)
                r2.binding = r3
                android.widget.ImageView r0 = r3.checkIcon
                java.lang.String r1 = "binding.checkIcon"
                m0.n.b.i.d(r0, r1)
                com.google.android.material.card.MaterialCardView r3 = r3.card
                java.lang.String r1 = "binding.card"
                m0.n.b.i.d(r3, r1)
                float r3 = r3.getElevation()
                r1 = 1
                float r1 = (float) r1
                float r3 = r3 + r1
                r0.setElevation(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsAdapter.CardViewHolder.<init>(com.stripe.android.databinding.LayoutPaymentsheetPaymentMethodItemBinding):void");
        }

        private final void bind(CardBrand cardBrand, String str) {
            int i;
            ImageView imageView = this.binding.brandIcon;
            switch (cardBrand.ordinal()) {
                case 0:
                    i = R.drawable.stripe_ic_paymentsheet_card_amex;
                    break;
                case 1:
                    i = R.drawable.stripe_ic_paymentsheet_card_discover;
                    break;
                case 2:
                    i = R.drawable.stripe_ic_paymentsheet_card_jcb;
                    break;
                case 3:
                    i = R.drawable.stripe_ic_paymentsheet_card_dinersclub;
                    break;
                case 4:
                    i = R.drawable.stripe_ic_paymentsheet_card_visa;
                    break;
                case 5:
                    i = R.drawable.stripe_ic_paymentsheet_card_mastercard;
                    break;
                case 6:
                    i = R.drawable.stripe_ic_paymentsheet_card_unionpay;
                    break;
                case 7:
                    i = R.drawable.stripe_ic_paymentsheet_card_unknown;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            imageView.setImageResource(i);
            TextView textView = this.binding.label;
            m0.n.b.i.d(textView, "binding.label");
            View view = this.itemView;
            m0.n.b.i.d(view, "itemView");
            textView.setText(view.getContext().getString(R.string.paymentsheet_payment_method_item_card_number, new Object[]{str}));
        }

        public final void bindPaymentMethod(PaymentMethod paymentMethod) {
            m0.n.b.i.e(paymentMethod, "method");
            PaymentMethod.Card card = paymentMethod.card;
            if (card != null) {
                bind(card.brand, card.last4);
            }
        }

        public void setEnabled(boolean z) {
            MaterialCardView materialCardView = this.binding.card;
            m0.n.b.i.d(materialCardView, "binding.card");
            materialCardView.setEnabled(z);
            ConstraintLayout root = this.binding.getRoot();
            m0.n.b.i.d(root, "binding.root");
            root.setEnabled(z);
            TextView textView = this.binding.label;
            m0.n.b.i.d(textView, "binding.label");
            textView.setEnabled(z);
            ImageView imageView = this.binding.brandIcon;
            m0.n.b.i.d(imageView, "binding.brandIcon");
            imageView.setAlpha(z ? 1.0f : 0.6f);
        }

        public final void setSelected(boolean z) {
            ConstraintLayout root = this.binding.getRoot();
            m0.n.b.i.d(root, "binding.root");
            root.setSelected(z);
            ImageView imageView = this.binding.checkIcon;
            m0.n.b.i.d(imageView, "binding.checkIcon");
            imageView.setVisibility(z ? 0 : 8);
            MaterialCardView materialCardView = this.binding.card;
            m0.n.b.i.d(materialCardView, "binding.card");
            materialCardView.setStrokeWidth(cardStrokeWidth(z));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public CardViewHolder(android.view.ViewGroup r3) {
            /*
                r2 = this;
                java.lang.String r0 = "parent"
                m0.n.b.i.e(r3, r0)
                android.content.Context r0 = r3.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 0
                com.stripe.android.databinding.LayoutPaymentsheetPaymentMethodItemBinding r3 = com.stripe.android.databinding.LayoutPaymentsheetPaymentMethodItemBinding.inflate(r0, r3, r1)
                java.lang.String r0 = "LayoutPaymentsheetPaymen…      false\n            )"
                m0.n.b.i.d(r3, r0)
                r2.<init>((com.stripe.android.databinding.LayoutPaymentsheetPaymentMethodItemBinding) r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsAdapter.CardViewHolder.<init>(android.view.ViewGroup):void");
        }
    }

    public void onBindViewHolder(PaymentOptionViewHolder paymentOptionViewHolder, int i) {
        m0.n.b.i.e(paymentOptionViewHolder, "holder");
        Item item = (Item) this.items.get(i);
        boolean z = true;
        if (paymentOptionViewHolder instanceof CardViewHolder) {
            CardViewHolder cardViewHolder = (CardViewHolder) paymentOptionViewHolder;
            if (i != this.selectedItemPosition) {
                z = false;
            }
            cardViewHolder.setSelected(z);
            if (item instanceof Item.ExistingPaymentMethod) {
                cardViewHolder.bindPaymentMethod(((Item.ExistingPaymentMethod) item).getPaymentMethod());
            }
        } else if (paymentOptionViewHolder instanceof GooglePayViewHolder) {
            GooglePayViewHolder googlePayViewHolder = (GooglePayViewHolder) paymentOptionViewHolder;
            if (i != this.selectedItemPosition) {
                z = false;
            }
            googlePayViewHolder.setSelected(z);
        }
        paymentOptionViewHolder.setEnabled(isEnabled$payments_core_release());
    }

    public PaymentOptionViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        m0.n.b.i.e(viewGroup, "parent");
        int ordinal = ViewType.values()[i].ordinal();
        if (ordinal == 0) {
            CardViewHolder cardViewHolder = new CardViewHolder(viewGroup);
            cardViewHolder.itemView.setOnClickListener(new PaymentOptionsAdapter$onCreateViewHolder$$inlined$apply$lambda$2(cardViewHolder, this));
            return cardViewHolder;
        } else if (ordinal == 1) {
            AddCardViewHolder addCardViewHolder = new AddCardViewHolder(viewGroup);
            addCardViewHolder.itemView.setOnClickListener(this.addCardClickListener);
            return addCardViewHolder;
        } else if (ordinal == 2) {
            GooglePayViewHolder googlePayViewHolder = new GooglePayViewHolder(viewGroup);
            googlePayViewHolder.itemView.setOnClickListener(new PaymentOptionsAdapter$onCreateViewHolder$$inlined$apply$lambda$1(googlePayViewHolder, this));
            return googlePayViewHolder;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$GooglePayViewHolder;", "Lcom/stripe/android/paymentsheet/PaymentOptionsAdapter$PaymentOptionViewHolder;", "", "selected", "Lm0/i;", "setSelected", "(Z)V", "enabled", "setEnabled", "Lcom/stripe/android/databinding/LayoutPaymentsheetGooglePayItemBinding;", "binding", "Lcom/stripe/android/databinding/LayoutPaymentsheetGooglePayItemBinding;", "<init>", "(Lcom/stripe/android/databinding/LayoutPaymentsheetGooglePayItemBinding;)V", "Landroid/view/ViewGroup;", "parent", "(Landroid/view/ViewGroup;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentOptionsAdapter.kt */
    public static final class GooglePayViewHolder extends PaymentOptionViewHolder {
        private final LayoutPaymentsheetGooglePayItemBinding binding;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public GooglePayViewHolder(com.stripe.android.databinding.LayoutPaymentsheetGooglePayItemBinding r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                m0.n.b.i.e(r3, r0)
                androidx.constraintlayout.widget.ConstraintLayout r0 = r3.getRoot()
                java.lang.String r1 = "binding.root"
                m0.n.b.i.d(r0, r1)
                r2.<init>(r0)
                r2.binding = r3
                android.widget.ImageView r0 = r3.checkIcon
                java.lang.String r1 = "binding.checkIcon"
                m0.n.b.i.d(r0, r1)
                com.google.android.material.card.MaterialCardView r3 = r3.card
                java.lang.String r1 = "binding.card"
                m0.n.b.i.d(r3, r1)
                float r3 = r3.getElevation()
                r1 = 1
                float r1 = (float) r1
                float r3 = r3 + r1
                r0.setElevation(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsAdapter.GooglePayViewHolder.<init>(com.stripe.android.databinding.LayoutPaymentsheetGooglePayItemBinding):void");
        }

        public void setEnabled(boolean z) {
            MaterialCardView materialCardView = this.binding.card;
            m0.n.b.i.d(materialCardView, "binding.card");
            materialCardView.setEnabled(z);
            ConstraintLayout root = this.binding.getRoot();
            m0.n.b.i.d(root, "binding.root");
            root.setEnabled(z);
            TextView textView = this.binding.label;
            m0.n.b.i.d(textView, "binding.label");
            textView.setEnabled(z);
            ImageView imageView = this.binding.googlePayMark;
            m0.n.b.i.d(imageView, "binding.googlePayMark");
            imageView.setAlpha(z ? 1.0f : 0.6f);
        }

        public final void setSelected(boolean z) {
            ConstraintLayout root = this.binding.getRoot();
            m0.n.b.i.d(root, "binding.root");
            root.setSelected(z);
            ImageView imageView = this.binding.checkIcon;
            m0.n.b.i.d(imageView, "binding.checkIcon");
            imageView.setVisibility(z ? 0 : 8);
            MaterialCardView materialCardView = this.binding.card;
            m0.n.b.i.d(materialCardView, "binding.card");
            materialCardView.setStrokeWidth(cardStrokeWidth(z));
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public GooglePayViewHolder(android.view.ViewGroup r3) {
            /*
                r2 = this;
                java.lang.String r0 = "parent"
                m0.n.b.i.e(r3, r0)
                android.content.Context r0 = r3.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 0
                com.stripe.android.databinding.LayoutPaymentsheetGooglePayItemBinding r3 = com.stripe.android.databinding.LayoutPaymentsheetGooglePayItemBinding.inflate(r0, r3, r1)
                java.lang.String r0 = "LayoutPaymentsheetGoogle…rent, false\n            )"
                m0.n.b.i.d(r3, r0)
                r2.<init>((com.stripe.android.databinding.LayoutPaymentsheetGooglePayItemBinding) r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.PaymentOptionsAdapter.GooglePayViewHolder.<init>(android.view.ViewGroup):void");
        }
    }
}
