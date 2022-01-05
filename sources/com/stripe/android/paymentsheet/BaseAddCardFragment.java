package com.stripe.android.paymentsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.databinding.FragmentPaymentsheetAddCardBinding;
import com.stripe.android.databinding.StripeHorizontalDividerBinding;
import com.stripe.android.databinding.StripeVerticalDividerBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.FragmentConfig;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.ui.BillingAddressView;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.view.CardMultilineWidget;
import com.stripe.android.view.StripeEditText;
import g0.a.b.b.a;
import h0.q.k0;
import h0.q.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.c;
import m0.j.g;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001:\u0001BB\u000f\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b@\u0010AJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\u001d\u0010\u0004R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010,\u001a\u00020'8B@\u0002X\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020$8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b0\u0010&R\u001a\u00104\u001a\u0006\u0012\u0002\b\u0003018&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00105\u001a\u00020$8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b5\u0010&R\u0018\u00109\u001a\u0004\u0018\u0001068B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lcom/stripe/android/paymentsheet/BaseAddCardFragment;", "Landroidx/fragment/app/Fragment;", "Lm0/i;", "setupCardWidget", "()V", "populateFieldsFromNewCard", "Lcom/stripe/android/paymentsheet/BaseAddCardFragment$AddCardViewModel$Field;", "field", "", "errorMessage", "onCardError", "(Lcom/stripe/android/paymentsheet/BaseAddCardFragment$AddCardViewModel$Field;Ljava/lang/String;)V", "setupSaveCardCheckbox", "onSaveCardCheckboxChanged", "", "shouldSaveCard", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "updateSelection", "Landroid/widget/Space;", "bottomSpace", "Landroid/widget/Space;", "Lcom/stripe/android/view/CardMultilineWidget;", "cardMultilineWidget", "Lcom/stripe/android/view/CardMultilineWidget;", "Landroid/widget/TextView;", "cardErrors", "Landroid/widget/TextView;", "Lcom/stripe/android/paymentsheet/BaseAddCardFragment$AddCardViewModel;", "addCardViewModel$delegate", "Lm0/c;", "getAddCardViewModel", "()Lcom/stripe/android/paymentsheet/BaseAddCardFragment$AddCardViewModel;", "addCardViewModel", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "billingErrors", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "getSheetViewModel", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "sheetViewModel", "addCardHeader", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodParams", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView;", "billingAddressView", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView;", "Landroid/widget/CheckBox;", "saveCardCheckbox", "Landroid/widget/CheckBox;", "<init>", "(Lcom/stripe/android/paymentsheet/analytics/EventReporter;)V", "AddCardViewModel", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BaseAddCardFragment.kt */
public abstract class BaseAddCardFragment extends Fragment {
    private TextView addCardHeader;
    private final c addCardViewModel$delegate = a.x(this, m.a(AddCardViewModel.class), new BaseAddCardFragment$$special$$inlined$viewModels$2(new BaseAddCardFragment$$special$$inlined$viewModels$1(this)), (m0.n.a.a<? extends m0.b>) null);
    /* access modifiers changed from: private */
    public BillingAddressView billingAddressView;
    /* access modifiers changed from: private */
    public TextView billingErrors;
    private Space bottomSpace;
    private TextView cardErrors;
    /* access modifiers changed from: private */
    public CardMultilineWidget cardMultilineWidget;
    private final EventReporter eventReporter;
    /* access modifiers changed from: private */
    public CheckBox saveCardCheckbox;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R'\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/paymentsheet/BaseAddCardFragment$AddCardViewModel;", "Lh0/q/k0;", "", "isCardValid", "Z", "()Z", "setCardValid", "(Z)V", "", "Lcom/stripe/android/paymentsheet/BaseAddCardFragment$AddCardViewModel$Field;", "", "cardErrors", "Ljava/util/Map;", "getCardErrors", "()Ljava/util/Map;", "<init>", "()V", "Field", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BaseAddCardFragment.kt */
    public static final class AddCardViewModel extends k0 {
        private final Map<Field, String> cardErrors = new LinkedHashMap();
        private boolean isCardValid;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/BaseAddCardFragment$AddCardViewModel$Field;", "", "<init>", "(Ljava/lang/String;I)V", "Number", "Date", "Cvc", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: BaseAddCardFragment.kt */
        public enum Field {
            Number,
            Date,
            Cvc
        }

        public final Map<Field, String> getCardErrors() {
            return this.cardErrors;
        }

        public final boolean isCardValid() {
            return this.isCardValid;
        }

        public final void setCardValid(boolean z) {
            this.isCardValid = z;
        }
    }

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

    public BaseAddCardFragment(EventReporter eventReporter2) {
        i.e(eventReporter2, "eventReporter");
        this.eventReporter = eventReporter2;
    }

    public static final /* synthetic */ BillingAddressView access$getBillingAddressView$p(BaseAddCardFragment baseAddCardFragment) {
        BillingAddressView billingAddressView2 = baseAddCardFragment.billingAddressView;
        if (billingAddressView2 != null) {
            return billingAddressView2;
        }
        i.m("billingAddressView");
        throw null;
    }

    public static final /* synthetic */ TextView access$getBillingErrors$p(BaseAddCardFragment baseAddCardFragment) {
        TextView textView = baseAddCardFragment.billingErrors;
        if (textView != null) {
            return textView;
        }
        i.m("billingErrors");
        throw null;
    }

    public static final /* synthetic */ CardMultilineWidget access$getCardMultilineWidget$p(BaseAddCardFragment baseAddCardFragment) {
        CardMultilineWidget cardMultilineWidget2 = baseAddCardFragment.cardMultilineWidget;
        if (cardMultilineWidget2 != null) {
            return cardMultilineWidget2;
        }
        i.m("cardMultilineWidget");
        throw null;
    }

    public static final /* synthetic */ CheckBox access$getSaveCardCheckbox$p(BaseAddCardFragment baseAddCardFragment) {
        CheckBox checkBox = baseAddCardFragment.saveCardCheckbox;
        if (checkBox != null) {
            return checkBox;
        }
        i.m("saveCardCheckbox");
        throw null;
    }

    /* access modifiers changed from: private */
    public final AddCardViewModel getAddCardViewModel() {
        return (AddCardViewModel) this.addCardViewModel$delegate.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.stripe.android.model.PaymentMethodCreateParams getPaymentMethodParams() {
        /*
            r3 = this;
            com.stripe.android.paymentsheet.ui.BillingAddressView r0 = r3.billingAddressView
            r1 = 0
            if (r0 == 0) goto L_0x002f
            androidx.lifecycle.LiveData r0 = r0.getAddress$payments_core_release()
            java.lang.Object r0 = r0.getValue()
            com.stripe.android.model.Address r0 = (com.stripe.android.model.Address) r0
            if (r0 == 0) goto L_0x0025
            com.stripe.android.view.CardMultilineWidget r2 = r3.cardMultilineWidget
            if (r2 == 0) goto L_0x001f
            com.stripe.android.model.CardParams r2 = r2.getCardParams()
            if (r2 == 0) goto L_0x0025
            r2.setAddress(r0)
            goto L_0x0026
        L_0x001f:
            java.lang.String r0 = "cardMultilineWidget"
            m0.n.b.i.m(r0)
            throw r1
        L_0x0025:
            r2 = r1
        L_0x0026:
            if (r2 == 0) goto L_0x002e
            com.stripe.android.model.PaymentMethodCreateParams$Companion r0 = com.stripe.android.model.PaymentMethodCreateParams.Companion
            com.stripe.android.model.PaymentMethodCreateParams r1 = r0.createCard(r2)
        L_0x002e:
            return r1
        L_0x002f:
            java.lang.String r0 = "billingAddressView"
            m0.n.b.i.m(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.BaseAddCardFragment.getPaymentMethodParams():com.stripe.android.model.PaymentMethodCreateParams");
    }

    /* access modifiers changed from: private */
    public final void onCardError(AddCardViewModel.Field field, String str) {
        boolean z;
        Object obj;
        getAddCardViewModel().getCardErrors().put(field, str);
        AddCardViewModel.Field[] values = AddCardViewModel.Field.values();
        ArrayList arrayList = new ArrayList(3);
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            arrayList.add(getAddCardViewModel().getCardErrors().get(values[i2]));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str2 = (String) obj;
            if (!(str2 == null || StringsKt__IndentKt.o(str2))) {
                break;
            }
        }
        String str3 = (String) obj;
        TextView textView = this.cardErrors;
        if (textView != null) {
            textView.setText(str3);
            TextView textView2 = this.cardErrors;
            if (textView2 != null) {
                if (str3 == null) {
                    z = false;
                }
                if (!z) {
                    i = 8;
                }
                textView2.setVisibility(i);
                return;
            }
            i.m("cardErrors");
            throw null;
        }
        i.m("cardErrors");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void onSaveCardCheckboxChanged() {
        PaymentSelection value = getSheetViewModel().getSelection$payments_core_release().getValue();
        if (value instanceof PaymentSelection.New.Card) {
            PaymentSelection.New.Card copy$default = PaymentSelection.New.Card.copy$default((PaymentSelection.New.Card) value, (PaymentMethodCreateParams) null, (CardBrand) null, shouldSaveCard(), 3, (Object) null);
            getSheetViewModel().updateSelection(copy$default);
            getSheetViewModel().setNewCard(copy$default);
        }
    }

    private final void populateFieldsFromNewCard() {
        PaymentMethod.BillingDetails billingDetails$payments_core_release;
        PaymentSelection.New.Card newCard = getSheetViewModel().getNewCard();
        Address address = null;
        PaymentMethodCreateParams paymentMethodCreateParams = newCard != null ? newCard.getPaymentMethodCreateParams() : null;
        CheckBox checkBox = this.saveCardCheckbox;
        if (checkBox != null) {
            PaymentSelection.New.Card newCard2 = getSheetViewModel().getNewCard();
            checkBox.setChecked(newCard2 != null ? newCard2.getShouldSavePaymentMethod() : true);
            CardMultilineWidget cardMultilineWidget2 = this.cardMultilineWidget;
            if (cardMultilineWidget2 != null) {
                cardMultilineWidget2.populate$payments_core_release(paymentMethodCreateParams != null ? paymentMethodCreateParams.getCard$payments_core_release() : null);
                BillingAddressView billingAddressView2 = this.billingAddressView;
                if (billingAddressView2 != null) {
                    if (!(paymentMethodCreateParams == null || (billingDetails$payments_core_release = paymentMethodCreateParams.getBillingDetails$payments_core_release()) == null)) {
                        address = billingDetails$payments_core_release.address;
                    }
                    billingAddressView2.populate$payments_core_release(address);
                    return;
                }
                i.m("billingAddressView");
                throw null;
            }
            i.m("cardMultilineWidget");
            throw null;
        }
        i.m("saveCardCheckbox");
        throw null;
    }

    private final void setupCardWidget() {
        StripeEditText[] stripeEditTextArr = new StripeEditText[3];
        CardMultilineWidget cardMultilineWidget2 = this.cardMultilineWidget;
        if (cardMultilineWidget2 != null) {
            stripeEditTextArr[0] = cardMultilineWidget2.getCardNumberEditText$payments_core_release();
            CardMultilineWidget cardMultilineWidget3 = this.cardMultilineWidget;
            if (cardMultilineWidget3 != null) {
                stripeEditTextArr[1] = cardMultilineWidget3.getExpiryDateEditText$payments_core_release();
                CardMultilineWidget cardMultilineWidget4 = this.cardMultilineWidget;
                if (cardMultilineWidget4 != null) {
                    stripeEditTextArr[2] = cardMultilineWidget4.getCvcEditText$payments_core_release();
                    for (StripeEditText stripeEditText : g.h0(stripeEditTextArr)) {
                        stripeEditText.setTextSize(0, getResources().getDimension(R.dimen.stripe_paymentsheet_form_textsize));
                        stripeEditText.setTextColor(h0.i.b.a.getColor(requireActivity(), R.color.stripe_paymentsheet_textinput_color));
                        stripeEditText.setBackgroundResource(17170445);
                        stripeEditText.setErrorColor(h0.i.b.a.getColor(requireActivity(), R.color.stripe_paymentsheet_form_error));
                    }
                    CardMultilineWidget cardMultilineWidget5 = this.cardMultilineWidget;
                    if (cardMultilineWidget5 != null) {
                        cardMultilineWidget5.getExpiryDateEditText$payments_core_release().setIncludeSeparatorGaps$payments_core_release(true);
                        CardMultilineWidget cardMultilineWidget6 = this.cardMultilineWidget;
                        if (cardMultilineWidget6 != null) {
                            cardMultilineWidget6.setExpirationDatePlaceholderRes$payments_core_release((Integer) null);
                            CardMultilineWidget cardMultilineWidget7 = this.cardMultilineWidget;
                            if (cardMultilineWidget7 != null) {
                                cardMultilineWidget7.getExpiryTextInputLayout$payments_core_release().setHint((CharSequence) getString(R.string.stripe_paymentsheet_expiration_date_hint));
                                CardMultilineWidget cardMultilineWidget8 = this.cardMultilineWidget;
                                if (cardMultilineWidget8 != null) {
                                    cardMultilineWidget8.getCardNumberTextInputLayout$payments_core_release().setPlaceholderText((CharSequence) null);
                                    CardMultilineWidget cardMultilineWidget9 = this.cardMultilineWidget;
                                    if (cardMultilineWidget9 != null) {
                                        cardMultilineWidget9.setCvcPlaceholderText$payments_core_release("");
                                        CardMultilineWidget cardMultilineWidget10 = this.cardMultilineWidget;
                                        if (cardMultilineWidget10 != null) {
                                            cardMultilineWidget10.getCvcEditText$payments_core_release().setImeOptions(5);
                                            CardMultilineWidget cardMultilineWidget11 = this.cardMultilineWidget;
                                            if (cardMultilineWidget11 != null) {
                                                LinearLayout secondRowLayout$payments_core_release = cardMultilineWidget11.getSecondRowLayout$payments_core_release();
                                                LayoutInflater layoutInflater = getLayoutInflater();
                                                CardMultilineWidget cardMultilineWidget12 = this.cardMultilineWidget;
                                                if (cardMultilineWidget12 != null) {
                                                    StripeVerticalDividerBinding inflate = StripeVerticalDividerBinding.inflate(layoutInflater, cardMultilineWidget12.getSecondRowLayout$payments_core_release(), false);
                                                    i.d(inflate, "StripeVerticalDividerBin…      false\n            )");
                                                    secondRowLayout$payments_core_release.addView(inflate.getRoot(), 1);
                                                    CardMultilineWidget cardMultilineWidget13 = this.cardMultilineWidget;
                                                    if (cardMultilineWidget13 != null) {
                                                        LayoutInflater layoutInflater2 = getLayoutInflater();
                                                        CardMultilineWidget cardMultilineWidget14 = this.cardMultilineWidget;
                                                        if (cardMultilineWidget14 != null) {
                                                            StripeHorizontalDividerBinding inflate2 = StripeHorizontalDividerBinding.inflate(layoutInflater2, cardMultilineWidget14, false);
                                                            i.d(inflate2, "StripeHorizontalDividerB…      false\n            )");
                                                            cardMultilineWidget13.addView(inflate2.getRoot(), 1);
                                                            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.stripe_paymentsheet_cardwidget_margin_horizontal);
                                                            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.stripe_paymentsheet_cardwidget_margin_vertical);
                                                            TextInputLayout[] textInputLayoutArr = new TextInputLayout[3];
                                                            CardMultilineWidget cardMultilineWidget15 = this.cardMultilineWidget;
                                                            if (cardMultilineWidget15 != null) {
                                                                textInputLayoutArr[0] = cardMultilineWidget15.getCardNumberTextInputLayout$payments_core_release();
                                                                CardMultilineWidget cardMultilineWidget16 = this.cardMultilineWidget;
                                                                if (cardMultilineWidget16 != null) {
                                                                    textInputLayoutArr[1] = cardMultilineWidget16.getExpiryTextInputLayout$payments_core_release();
                                                                    CardMultilineWidget cardMultilineWidget17 = this.cardMultilineWidget;
                                                                    if (cardMultilineWidget17 != null) {
                                                                        textInputLayoutArr[2] = cardMultilineWidget17.getCvcInputLayout$payments_core_release();
                                                                        for (TextInputLayout textInputLayout : g.h0(textInputLayoutArr)) {
                                                                            ViewGroup.LayoutParams layoutParams = textInputLayout.getLayoutParams();
                                                                            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                                                            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                                                            layoutParams2.setMarginStart(dimensionPixelSize);
                                                                            layoutParams2.setMarginEnd(dimensionPixelSize);
                                                                            layoutParams2.topMargin = dimensionPixelSize2;
                                                                            layoutParams2.bottomMargin = dimensionPixelSize2;
                                                                            textInputLayout.setLayoutParams(layoutParams2);
                                                                            textInputLayout.setErrorEnabled(false);
                                                                            textInputLayout.setError((CharSequence) null);
                                                                        }
                                                                        CardMultilineWidget cardMultilineWidget18 = this.cardMultilineWidget;
                                                                        if (cardMultilineWidget18 != null) {
                                                                            cardMultilineWidget18.setCvcIcon$payments_core_release(Integer.valueOf(R.drawable.stripe_ic_paymentsheet_cvc));
                                                                            CardMultilineWidget cardMultilineWidget19 = this.cardMultilineWidget;
                                                                            if (cardMultilineWidget19 != null) {
                                                                                cardMultilineWidget19.setCardBrandIconSupplier$payments_core_release(BaseAddCardFragment$setupCardWidget$3.INSTANCE);
                                                                                CardMultilineWidget cardMultilineWidget20 = this.cardMultilineWidget;
                                                                                if (cardMultilineWidget20 != null) {
                                                                                    cardMultilineWidget20.setCardNumberErrorListener$payments_core_release(new BaseAddCardFragment$setupCardWidget$4(this));
                                                                                    CardMultilineWidget cardMultilineWidget21 = this.cardMultilineWidget;
                                                                                    if (cardMultilineWidget21 != null) {
                                                                                        cardMultilineWidget21.setExpirationDateErrorListener$payments_core_release(new BaseAddCardFragment$setupCardWidget$5(this));
                                                                                        CardMultilineWidget cardMultilineWidget22 = this.cardMultilineWidget;
                                                                                        if (cardMultilineWidget22 != null) {
                                                                                            cardMultilineWidget22.setCvcErrorListener$payments_core_release(new BaseAddCardFragment$setupCardWidget$6(this));
                                                                                            CardMultilineWidget cardMultilineWidget23 = this.cardMultilineWidget;
                                                                                            if (cardMultilineWidget23 != null) {
                                                                                                cardMultilineWidget23.setPostalCodeErrorListener$payments_core_release((StripeEditText.ErrorMessageListener) null);
                                                                                                BillingAddressView billingAddressView2 = this.billingAddressView;
                                                                                                if (billingAddressView2 != null) {
                                                                                                    billingAddressView2.setPostalCodeViewListener$payments_core_release(new BaseAddCardFragment$setupCardWidget$7(this));
                                                                                                } else {
                                                                                                    i.m("billingAddressView");
                                                                                                    throw null;
                                                                                                }
                                                                                            } else {
                                                                                                i.m("cardMultilineWidget");
                                                                                                throw null;
                                                                                            }
                                                                                        } else {
                                                                                            i.m("cardMultilineWidget");
                                                                                            throw null;
                                                                                        }
                                                                                    } else {
                                                                                        i.m("cardMultilineWidget");
                                                                                        throw null;
                                                                                    }
                                                                                } else {
                                                                                    i.m("cardMultilineWidget");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                i.m("cardMultilineWidget");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            i.m("cardMultilineWidget");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        i.m("cardMultilineWidget");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    i.m("cardMultilineWidget");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                i.m("cardMultilineWidget");
                                                                throw null;
                                                            }
                                                        } else {
                                                            i.m("cardMultilineWidget");
                                                            throw null;
                                                        }
                                                    } else {
                                                        i.m("cardMultilineWidget");
                                                        throw null;
                                                    }
                                                } else {
                                                    i.m("cardMultilineWidget");
                                                    throw null;
                                                }
                                            } else {
                                                i.m("cardMultilineWidget");
                                                throw null;
                                            }
                                        } else {
                                            i.m("cardMultilineWidget");
                                            throw null;
                                        }
                                    } else {
                                        i.m("cardMultilineWidget");
                                        throw null;
                                    }
                                } else {
                                    i.m("cardMultilineWidget");
                                    throw null;
                                }
                            } else {
                                i.m("cardMultilineWidget");
                                throw null;
                            }
                        } else {
                            i.m("cardMultilineWidget");
                            throw null;
                        }
                    } else {
                        i.m("cardMultilineWidget");
                        throw null;
                    }
                } else {
                    i.m("cardMultilineWidget");
                    throw null;
                }
            } else {
                i.m("cardMultilineWidget");
                throw null;
            }
        } else {
            i.m("cardMultilineWidget");
            throw null;
        }
    }

    private final void setupSaveCardCheckbox() {
        String str;
        PaymentSheet.Configuration config$payments_core_release = getSheetViewModel().getConfig$payments_core_release();
        String merchantDisplayName = config$payments_core_release != null ? config$payments_core_release.getMerchantDisplayName() : null;
        int i = 0;
        if (merchantDisplayName == null || StringsKt__IndentKt.o(merchantDisplayName)) {
            merchantDisplayName = null;
        }
        CheckBox checkBox = this.saveCardCheckbox;
        if (checkBox != null) {
            if (merchantDisplayName == null || (str = getString(R.string.stripe_paymentsheet_save_this_card_with_merchant_name, merchantDisplayName)) == null) {
                str = getString(R.string.stripe_paymentsheet_save_this_card);
            }
            checkBox.setText(str);
            CheckBox checkBox2 = this.saveCardCheckbox;
            if (checkBox2 != null) {
                checkBox2.setVisibility(getSheetViewModel().getUserCanChooseToSaveCard() ? 0 : 8);
                Space space = this.bottomSpace;
                if (space != null) {
                    CheckBox checkBox3 = this.saveCardCheckbox;
                    if (checkBox3 != null) {
                        if (!(true ^ (checkBox3.getVisibility() == 0))) {
                            i = 8;
                        }
                        space.setVisibility(i);
                        CheckBox checkBox4 = this.saveCardCheckbox;
                        if (checkBox4 != null) {
                            checkBox4.setOnCheckedChangeListener(new BaseAddCardFragment$setupSaveCardCheckbox$2(this));
                        } else {
                            i.m("saveCardCheckbox");
                            throw null;
                        }
                    } else {
                        i.m("saveCardCheckbox");
                        throw null;
                    }
                } else {
                    i.m("bottomSpace");
                    throw null;
                }
            } else {
                i.m("saveCardCheckbox");
                throw null;
            }
        } else {
            i.m("saveCardCheckbox");
            throw null;
        }
    }

    private final boolean shouldSaveCard() {
        CheckBox checkBox = this.saveCardCheckbox;
        if (checkBox != null) {
            if (checkBox.isShown()) {
                CheckBox checkBox2 = this.saveCardCheckbox;
                if (checkBox2 == null) {
                    i.m("saveCardCheckbox");
                    throw null;
                } else if (checkBox2.isChecked()) {
                    return true;
                }
            }
            return false;
        }
        i.m("saveCardCheckbox");
        throw null;
    }

    public abstract BaseSheetViewModel<?> getSheetViewModel();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        return layoutInflater.cloneInContext(new h0.b.e.c((Context) requireActivity(), R.style.StripePaymentSheetAddCardTheme)).inflate(R.layout.fragment_paymentsheet_add_card, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        i.e(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        FragmentConfig fragmentConfig = arguments != null ? (FragmentConfig) arguments.getParcelable("com.stripe.android.paymentsheet.extra_fragment_config") : null;
        if (getActivity() == null || fragmentConfig == null) {
            getSheetViewModel().onFatal(new IllegalArgumentException("Failed to start add payment option fragment."));
            return;
        }
        FragmentPaymentsheetAddCardBinding bind = FragmentPaymentsheetAddCardBinding.bind(view);
        i.d(bind, "FragmentPaymentsheetAddCardBinding.bind(view)");
        CardMultilineWidget cardMultilineWidget2 = bind.cardMultilineWidget;
        i.d(cardMultilineWidget2, "viewBinding.cardMultilineWidget");
        this.cardMultilineWidget = cardMultilineWidget2;
        BillingAddressView billingAddressView2 = bind.billingAddress;
        i.d(billingAddressView2, "viewBinding.billingAddress");
        this.billingAddressView = billingAddressView2;
        TextView textView = bind.cardErrors;
        i.d(textView, "viewBinding.cardErrors");
        this.cardErrors = textView;
        TextView textView2 = bind.billingErrors;
        i.d(textView2, "viewBinding.billingErrors");
        this.billingErrors = textView2;
        MaterialCheckBox materialCheckBox = bind.saveCardCheckbox;
        i.d(materialCheckBox, "viewBinding.saveCardCheckbox");
        this.saveCardCheckbox = materialCheckBox;
        Space space = bind.bottomSpace;
        i.d(space, "viewBinding.bottomSpace");
        this.bottomSpace = space;
        TextView textView3 = bind.addCardHeader;
        i.d(textView3, "viewBinding.addCardHeader");
        this.addCardHeader = textView3;
        populateFieldsFromNewCard();
        setupCardWidget();
        BillingAddressView billingAddressView3 = this.billingAddressView;
        if (billingAddressView3 != null) {
            billingAddressView3.getAddress$payments_core_release().observe(getViewLifecycleOwner(), new BaseAddCardFragment$onViewCreated$1(this));
            CardMultilineWidget cardMultilineWidget3 = this.cardMultilineWidget;
            if (cardMultilineWidget3 != null) {
                cardMultilineWidget3.setCardValidCallback(new BaseAddCardFragment$onViewCreated$2(this));
                CardMultilineWidget cardMultilineWidget4 = this.cardMultilineWidget;
                if (cardMultilineWidget4 != null) {
                    cardMultilineWidget4.setCardInputListener(new BaseAddCardFragment$onViewCreated$3(this));
                    getSheetViewModel().getProcessing().observe(getViewLifecycleOwner(), new BaseAddCardFragment$onViewCreated$4(this));
                    setupSaveCardCheckbox();
                    this.eventReporter.onShowNewPaymentOptionForm();
                    return;
                }
                i.m("cardMultilineWidget");
                throw null;
            }
            i.m("cardMultilineWidget");
            throw null;
        }
        i.m("billingAddressView");
        throw null;
    }

    public final void updateSelection() {
        PaymentMethodCreateParams paymentMethodParams;
        PaymentSelection.New.Card card = null;
        if (getAddCardViewModel().isCardValid() && (paymentMethodParams = getPaymentMethodParams()) != null) {
            CardMultilineWidget cardMultilineWidget2 = this.cardMultilineWidget;
            if (cardMultilineWidget2 != null) {
                card = new PaymentSelection.New.Card(paymentMethodParams, cardMultilineWidget2.getBrand$payments_core_release(), shouldSaveCard());
            } else {
                i.m("cardMultilineWidget");
                throw null;
            }
        }
        if (card != null) {
            getSheetViewModel().setNewCard(card);
        }
        getSheetViewModel().updateSelection(card);
    }
}
