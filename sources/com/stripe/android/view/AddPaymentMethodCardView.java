package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.stripe.android.databinding.AddPaymentMethodCardViewBinding;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.ShippingInformation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001$B1\b\u0001\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodCardView;", "Lcom/stripe/android/view/AddPaymentMethodView;", "Lcom/stripe/android/view/AddPaymentMethodActivity;", "activity", "Lm0/i;", "initEnterListeners", "(Lcom/stripe/android/view/AddPaymentMethodActivity;)V", "", "communicating", "setCommunicatingProgress", "(Z)V", "Lcom/stripe/android/view/CardMultilineWidget;", "cardMultilineWidget", "Lcom/stripe/android/view/CardMultilineWidget;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "billingDetails", "Lcom/stripe/android/view/ShippingInfoWidget;", "billingAddressWidget", "Lcom/stripe/android/view/ShippingInfoWidget;", "Lcom/stripe/android/view/BillingAddressFields;", "billingAddressFields", "Lcom/stripe/android/view/BillingAddressFields;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getCreateParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "createParams", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/stripe/android/view/BillingAddressFields;)V", "OnEditorActionListenerImpl", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodCardView.kt */
public final class AddPaymentMethodCardView extends AddPaymentMethodView {
    private final BillingAddressFields billingAddressFields;
    private final ShippingInfoWidget billingAddressWidget;
    private final CardMultilineWidget cardMultilineWidget;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodCardView$OnEditorActionListenerImpl;", "Landroid/widget/TextView$OnEditorActionListener;", "Landroid/widget/TextView;", "v", "", "actionId", "Landroid/view/KeyEvent;", "event", "", "onEditorAction", "(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z", "Lcom/stripe/android/view/KeyboardController;", "keyboardController", "Lcom/stripe/android/view/KeyboardController;", "Lcom/stripe/android/view/AddPaymentMethodActivity;", "activity", "Lcom/stripe/android/view/AddPaymentMethodActivity;", "Lcom/stripe/android/view/AddPaymentMethodCardView;", "addPaymentMethodCardView", "Lcom/stripe/android/view/AddPaymentMethodCardView;", "<init>", "(Lcom/stripe/android/view/AddPaymentMethodActivity;Lcom/stripe/android/view/AddPaymentMethodCardView;Lcom/stripe/android/view/KeyboardController;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AddPaymentMethodCardView.kt */
    public static final class OnEditorActionListenerImpl implements TextView.OnEditorActionListener {
        private final AddPaymentMethodActivity activity;
        private final AddPaymentMethodCardView addPaymentMethodCardView;
        private final KeyboardController keyboardController;

        public OnEditorActionListenerImpl(AddPaymentMethodActivity addPaymentMethodActivity, AddPaymentMethodCardView addPaymentMethodCardView2, KeyboardController keyboardController2) {
            i.e(addPaymentMethodActivity, "activity");
            i.e(addPaymentMethodCardView2, "addPaymentMethodCardView");
            i.e(keyboardController2, "keyboardController");
            this.activity = addPaymentMethodActivity;
            this.addPaymentMethodCardView = addPaymentMethodCardView2;
            this.keyboardController = keyboardController2;
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            if (this.addPaymentMethodCardView.getCreateParams() != null) {
                this.keyboardController.hide$payments_core_release();
            }
            this.activity.onActionSave();
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            BillingAddressFields.values();
            int[] iArr = new int[3];
            $EnumSwitchMapping$0 = iArr;
            iArr[BillingAddressFields.Full.ordinal()] = 1;
            iArr[BillingAddressFields.None.ordinal()] = 2;
            iArr[BillingAddressFields.PostalCode.ordinal()] = 3;
        }
    }

    public AddPaymentMethodCardView(Context context) {
        this(context, (AttributeSet) null, 0, (BillingAddressFields) null, 14, (f) null);
    }

    public AddPaymentMethodCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (BillingAddressFields) null, 12, (f) null);
    }

    public AddPaymentMethodCardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (BillingAddressFields) null, 8, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddPaymentMethodCardView(Context context, AttributeSet attributeSet, int i, BillingAddressFields billingAddressFields2, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? BillingAddressFields.PostalCode : billingAddressFields2);
    }

    private final PaymentMethod.BillingDetails getBillingDetails() {
        ShippingInformation shippingInformation;
        if (this.billingAddressFields != BillingAddressFields.Full || (shippingInformation = this.billingAddressWidget.getShippingInformation()) == null) {
            return null;
        }
        return PaymentMethod.BillingDetails.Companion.create(shippingInformation);
    }

    private final void initEnterListeners(AddPaymentMethodActivity addPaymentMethodActivity) {
        OnEditorActionListenerImpl onEditorActionListenerImpl = new OnEditorActionListenerImpl(addPaymentMethodActivity, this, new KeyboardController(addPaymentMethodActivity));
        this.cardMultilineWidget.getCardNumberEditText$payments_core_release().setOnEditorActionListener(onEditorActionListenerImpl);
        this.cardMultilineWidget.getExpiryDateEditText$payments_core_release().setOnEditorActionListener(onEditorActionListenerImpl);
        this.cardMultilineWidget.getCvcEditText$payments_core_release().setOnEditorActionListener(onEditorActionListenerImpl);
        this.cardMultilineWidget.getPostalCodeEditText$payments_core_release().setOnEditorActionListener(onEditorActionListenerImpl);
    }

    public PaymentMethodCreateParams getCreateParams() {
        int ordinal = this.billingAddressFields.ordinal();
        if (ordinal == 0) {
            return this.cardMultilineWidget.getPaymentMethodCreateParams();
        }
        if (ordinal == 1) {
            return this.cardMultilineWidget.getPaymentMethodCreateParams();
        }
        if (ordinal == 2) {
            PaymentMethodCreateParams.Card paymentMethodCard = this.cardMultilineWidget.getPaymentMethodCard();
            PaymentMethod.BillingDetails billingDetails = getBillingDetails();
            if (paymentMethodCard == null || billingDetails == null) {
                return null;
            }
            return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, paymentMethodCard, billingDetails, (Map) null, 4, (Object) null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public void setCommunicatingProgress(boolean z) {
        this.cardMultilineWidget.setEnabled(!z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodCardView(Context context, AttributeSet attributeSet, int i, BillingAddressFields billingAddressFields2) {
        super(context, attributeSet, i);
        i.e(context, "context");
        i.e(billingAddressFields2, "billingAddressFields");
        this.billingAddressFields = billingAddressFields2;
        boolean z = true;
        AddPaymentMethodCardViewBinding inflate = AddPaymentMethodCardViewBinding.inflate(LayoutInflater.from(context), this, true);
        i.d(inflate, "AddPaymentMethodCardView…           true\n        )");
        CardMultilineWidget cardMultilineWidget2 = inflate.cardMultilineWidget;
        i.d(cardMultilineWidget2, "viewBinding.cardMultilineWidget");
        this.cardMultilineWidget = cardMultilineWidget2;
        cardMultilineWidget2.setShouldShowPostalCode(billingAddressFields2 != BillingAddressFields.PostalCode ? false : z);
        ShippingInfoWidget shippingInfoWidget = inflate.billingAddressWidget;
        i.d(shippingInfoWidget, "viewBinding.billingAddressWidget");
        this.billingAddressWidget = shippingInfoWidget;
        if (billingAddressFields2 == BillingAddressFields.Full) {
            shippingInfoWidget.setVisibility(0);
        }
        AddPaymentMethodActivity addPaymentMethodActivity = (AddPaymentMethodActivity) (!(context instanceof AddPaymentMethodActivity) ? null : context);
        if (addPaymentMethodActivity != null) {
            initEnterListeners(addPaymentMethodActivity);
        }
    }
}
