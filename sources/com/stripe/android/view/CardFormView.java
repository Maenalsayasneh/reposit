package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.databinding.StripeCardFormViewBinding;
import com.stripe.android.databinding.StripeHorizontalDividerBinding;
import com.stripe.android.databinding.StripeVerticalDividerBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.CountryCode;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.view.CardValidCallback;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import h0.i.b.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Õ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001(\u0018\u0000 d2\u00020\u0001:\u0002deB'\b\u0007\u0012\u0006\u0010]\u001a\u00020\\\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010^\u0012\b\b\u0002\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J!\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00100.8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u001c\u00106\u001a\b\u0012\u0004\u0012\u000203028B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010A\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120@8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0015\u0010H\u001a\u0004\u0018\u00010E8F@\u0006¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020I8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010M\u001a\u00020L8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020O8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001e\u0010T\u001a\n S*\u0004\u0018\u00010R0R8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010W\u001a\u00020V8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020Y8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006f"}, d2 = {"Lcom/stripe/android/view/CardFormView;", "Landroid/widget/LinearLayout;", "Lm0/i;", "setupCountryAndPostal", "()V", "Lcom/stripe/android/model/CountryCode;", "countryCode", "updatePostalCodeViewLocale", "(Lcom/stripe/android/model/CountryCode;)V", "", "isPostalValid", "()Z", "showPostalError", "setupCardWidget", "applyStandardStyle", "applyBorderlessStyle", "Lcom/stripe/android/view/CardValidCallback$Fields;", "field", "", "errorMessage", "onFieldError", "(Lcom/stripe/android/view/CardValidCallback$Fields;Ljava/lang/String;)V", "updateErrorsView", "(Ljava/lang/String;)V", "Lcom/stripe/android/view/CardValidCallback;", "callback", "setCardValidCallback", "(Lcom/stripe/android/view/CardValidCallback;)V", "enabled", "setEnabled", "(Z)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lcom/stripe/android/view/CardMultilineWidget;", "cardMultilineWidget", "Lcom/stripe/android/view/CardMultilineWidget;", "com/stripe/android/view/CardFormView$cardValidTextWatcher$1", "cardValidTextWatcher", "Lcom/stripe/android/view/CardFormView$cardValidTextWatcher$1;", "Landroid/widget/TextView;", "errors", "Landroid/widget/TextView;", "", "getInvalidFields", "()Ljava/util/Set;", "invalidFields", "", "Lcom/stripe/android/view/StripeEditText;", "getAllEditTextFields", "()Ljava/util/Collection;", "allEditTextFields", "Lcom/stripe/android/view/PostalCodeValidator;", "postalCodeValidator", "Lcom/stripe/android/view/PostalCodeValidator;", "Lcom/stripe/android/view/CardFormView$Style;", "style", "Lcom/stripe/android/view/CardFormView$Style;", "Lcom/google/android/material/card/MaterialCardView;", "cardContainer", "Lcom/google/android/material/card/MaterialCardView;", "", "errorsMap", "Ljava/util/Map;", "cardValidCallback", "Lcom/stripe/android/view/CardValidCallback;", "Lcom/stripe/android/model/CardParams;", "getCardParams", "()Lcom/stripe/android/model/CardParams;", "cardParams", "Lcom/stripe/android/databinding/StripeCardFormViewBinding;", "viewBinding", "Lcom/stripe/android/databinding/StripeCardFormViewBinding;", "Landroid/view/View;", "countryPostalDivider", "Landroid/view/View;", "Lcom/google/android/material/textfield/TextInputLayout;", "postalCodeContainer", "Lcom/google/android/material/textfield/TextInputLayout;", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "layoutInflater", "Landroid/view/LayoutInflater;", "Lcom/stripe/android/view/CountryTextInputLayout;", "countryLayout", "Lcom/stripe/android/view/CountryTextInputLayout;", "Lcom/stripe/android/view/PostalCodeEditText;", "postalCodeView", "Lcom/stripe/android/view/PostalCodeEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "Style", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardFormView.kt */
public final class CardFormView extends LinearLayout {
    public static final String CARD_FORM_VIEW = "CardFormView";
    public static final Companion Companion = new Companion((f) null);
    private static final String STATE_ENABLED = "state_enabled";
    private static final String STATE_SUPER_STATE = "state_super_state";
    private final MaterialCardView cardContainer;
    /* access modifiers changed from: private */
    public final CardMultilineWidget cardMultilineWidget;
    /* access modifiers changed from: private */
    public CardValidCallback cardValidCallback;
    private final CardFormView$cardValidTextWatcher$1 cardValidTextWatcher;
    private final CountryTextInputLayout countryLayout;
    private final View countryPostalDivider;
    private final TextView errors;
    private final Map<CardValidCallback.Fields, String> errorsMap;
    private final LayoutInflater layoutInflater;
    /* access modifiers changed from: private */
    public final TextInputLayout postalCodeContainer;
    private final PostalCodeValidator postalCodeValidator;
    /* access modifiers changed from: private */
    public final PostalCodeEditText postalCodeView;
    private Style style;
    private final StripeCardFormViewBinding viewBinding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/CardFormView$Companion;", "", "", "CARD_FORM_VIEW", "Ljava/lang/String;", "STATE_ENABLED", "STATE_SUPER_STATE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardFormView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/CardFormView$Style;", "", "", "attrValue", "I", "getAttrValue$payments_core_release", "()I", "<init>", "(Ljava/lang/String;II)V", "Standard", "Borderless", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardFormView.kt */
    public enum Style {
        Standard(0),
        Borderless(1);
        
        private final int attrValue;

        private Style(int i) {
            this.attrValue = i;
        }

        public final int getAttrValue$payments_core_release() {
            return this.attrValue;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            Style.values();
            int[] iArr = new int[2];
            $EnumSwitchMapping$0 = iArr;
            iArr[Style.Standard.ordinal()] = 1;
            iArr[Style.Borderless.ordinal()] = 2;
            CardBrand.values();
            int[] iArr2 = new int[8];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[CardBrand.Visa.ordinal()] = 1;
            iArr2[CardBrand.AmericanExpress.ordinal()] = 2;
            iArr2[CardBrand.Discover.ordinal()] = 3;
            iArr2[CardBrand.JCB.ordinal()] = 4;
            iArr2[CardBrand.DinersClub.ordinal()] = 5;
            iArr2[CardBrand.MasterCard.ordinal()] = 6;
            iArr2[CardBrand.UnionPay.ordinal()] = 7;
            iArr2[CardBrand.Unknown.ordinal()] = 8;
        }
    }

    public CardFormView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public CardFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardFormView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void applyBorderlessStyle() {
        CardNumberTextInputLayout cardNumberTextInputLayout$payments_core_release = this.cardMultilineWidget.getCardNumberTextInputLayout$payments_core_release();
        StripeHorizontalDividerBinding inflate = StripeHorizontalDividerBinding.inflate(this.layoutInflater, this.cardMultilineWidget, false);
        i.d(inflate, "StripeHorizontalDividerB…      false\n            )");
        cardNumberTextInputLayout$payments_core_release.addView(inflate.getRoot(), 1);
        TextInputLayout expiryTextInputLayout$payments_core_release = this.cardMultilineWidget.getExpiryTextInputLayout$payments_core_release();
        StripeHorizontalDividerBinding inflate2 = StripeHorizontalDividerBinding.inflate(this.layoutInflater, this.cardMultilineWidget, false);
        i.d(inflate2, "StripeHorizontalDividerB…      false\n            )");
        expiryTextInputLayout$payments_core_release.addView(inflate2.getRoot(), 1);
        TextInputLayout cvcInputLayout$payments_core_release = this.cardMultilineWidget.getCvcInputLayout$payments_core_release();
        StripeHorizontalDividerBinding inflate3 = StripeHorizontalDividerBinding.inflate(this.layoutInflater, this.cardMultilineWidget, false);
        i.d(inflate3, "StripeHorizontalDividerB…      false\n            )");
        cvcInputLayout$payments_core_release.addView(inflate3.getRoot(), 1);
        CountryTextInputLayout countryTextInputLayout = this.countryLayout;
        StripeHorizontalDividerBinding inflate4 = StripeHorizontalDividerBinding.inflate(this.layoutInflater, countryTextInputLayout, false);
        i.d(inflate4, "StripeHorizontalDividerB…      false\n            )");
        countryTextInputLayout.addView(inflate4.getRoot());
        this.countryPostalDivider.setVisibility(8);
        this.cardContainer.setCardElevation(0.0f);
    }

    private final void applyStandardStyle() {
        CardMultilineWidget cardMultilineWidget2 = this.cardMultilineWidget;
        StripeHorizontalDividerBinding inflate = StripeHorizontalDividerBinding.inflate(this.layoutInflater, cardMultilineWidget2, false);
        i.d(inflate, "StripeHorizontalDividerB…      false\n            )");
        cardMultilineWidget2.addView(inflate.getRoot(), 1);
        LinearLayout secondRowLayout$payments_core_release = this.cardMultilineWidget.getSecondRowLayout$payments_core_release();
        StripeVerticalDividerBinding inflate2 = StripeVerticalDividerBinding.inflate(this.layoutInflater, this.cardMultilineWidget.getSecondRowLayout$payments_core_release(), false);
        i.d(inflate2, "StripeVerticalDividerBin…      false\n            )");
        secondRowLayout$payments_core_release.addView(inflate2.getRoot(), 1);
        CardMultilineWidget cardMultilineWidget3 = this.cardMultilineWidget;
        StripeHorizontalDividerBinding inflate3 = StripeHorizontalDividerBinding.inflate(this.layoutInflater, cardMultilineWidget3, false);
        i.d(inflate3, "StripeHorizontalDividerB…      false\n            )");
        cardMultilineWidget3.addView(inflate3.getRoot(), this.cardMultilineWidget.getChildCount());
        this.cardContainer.setCardElevation(getResources().getDimension(R.dimen.stripe_card_form_view_card_elevation));
    }

    private final Collection<StripeEditText> getAllEditTextFields() {
        return g.K(this.cardMultilineWidget.getCardNumberEditText$payments_core_release(), this.cardMultilineWidget.getExpiryDateEditText$payments_core_release(), this.cardMultilineWidget.getCvcEditText$payments_core_release(), this.postalCodeView);
    }

    /* access modifiers changed from: private */
    public final Set<CardValidCallback.Fields> getInvalidFields() {
        List<T> v02 = g.v0(this.cardMultilineWidget.getInvalidFields$payments_core_release());
        CardValidCallback.Fields fields = CardValidCallback.Fields.Postal;
        if (!(!isPostalValid())) {
            fields = null;
        }
        return g.D0(g.Z(v02, g.L(fields)));
    }

    /* access modifiers changed from: private */
    public final boolean isPostalValid() {
        CountryCode selectedCountryCode = this.countryLayout.getSelectedCountryCode();
        if (selectedCountryCode == null) {
            return false;
        }
        PostalCodeValidator postalCodeValidator2 = this.postalCodeValidator;
        String postalCode$payments_core_release = this.postalCodeView.getPostalCode$payments_core_release();
        if (postalCode$payments_core_release == null) {
            postalCode$payments_core_release = "";
        }
        return postalCodeValidator2.isValid(postalCode$payments_core_release, selectedCountryCode.getValue());
    }

    /* access modifiers changed from: private */
    public final void onFieldError(CardValidCallback.Fields fields, String str) {
        Object obj;
        this.errorsMap.put(fields, str);
        CardValidCallback.Fields[] values = CardValidCallback.Fields.values();
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(this.errorsMap.get(values[i]));
        }
        Iterator it = arrayList.iterator();
        while (true) {
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
        updateErrorsView((String) obj);
    }

    private final void setupCardWidget() {
        for (StripeEditText stripeEditText : g.h0(this.cardMultilineWidget.getCardNumberEditText$payments_core_release(), this.cardMultilineWidget.getExpiryDateEditText$payments_core_release(), this.cardMultilineWidget.getCvcEditText$payments_core_release())) {
            stripeEditText.setTextSize(0, getResources().getDimension(R.dimen.stripe_card_form_view_textsize));
            stripeEditText.setTextColor(a.getColorStateList(getContext(), R.color.stripe_card_form_view_text_color));
            stripeEditText.setBackgroundResource(17170445);
            stripeEditText.setErrorColor(a.getColor(getContext(), R.color.stripe_card_form_view_form_error));
        }
        this.cardMultilineWidget.getExpiryDateEditText$payments_core_release().setIncludeSeparatorGaps$payments_core_release(true);
        this.cardMultilineWidget.setExpirationDatePlaceholderRes$payments_core_release((Integer) null);
        this.cardMultilineWidget.getExpiryTextInputLayout$payments_core_release().setHint((CharSequence) getContext().getString(R.string.stripe_paymentsheet_expiration_date_hint));
        this.cardMultilineWidget.getCardNumberTextInputLayout$payments_core_release().setPlaceholderText((CharSequence) null);
        this.cardMultilineWidget.setCvcPlaceholderText$payments_core_release("");
        this.cardMultilineWidget.getCvcEditText$payments_core_release().setImeOptions(5);
        this.cardMultilineWidget.setBackgroundResource(R.drawable.stripe_card_form_view_text_input_layout_background);
        this.cardMultilineWidget.getCvcEditText$payments_core_release().addTextChangedListener(new CardFormView$setupCardWidget$$inlined$doAfterTextChanged$1(this));
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.stripe_card_form_view_text_margin_horizontal);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.stripe_card_form_view_text_margin_vertical);
        for (TextInputLayout textInputLayout : g.h0(this.cardMultilineWidget.getCardNumberTextInputLayout$payments_core_release(), this.cardMultilineWidget.getExpiryTextInputLayout$payments_core_release(), this.cardMultilineWidget.getCvcInputLayout$payments_core_release())) {
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
        this.cardMultilineWidget.setCvcIcon$payments_core_release(Integer.valueOf(R.drawable.stripe_ic_paymentsheet_cvc));
        this.cardMultilineWidget.setCardBrandIconSupplier$payments_core_release(CardFormView$setupCardWidget$4.INSTANCE);
        this.cardMultilineWidget.setCardNumberErrorListener$payments_core_release(new CardFormView$setupCardWidget$5(this));
        this.cardMultilineWidget.setExpirationDateErrorListener$payments_core_release(new CardFormView$setupCardWidget$6(this));
        this.cardMultilineWidget.setCvcErrorListener$payments_core_release(new CardFormView$setupCardWidget$7(this));
        this.cardMultilineWidget.setPostalCodeErrorListener$payments_core_release((StripeEditText.ErrorMessageListener) null);
    }

    private final void setupCountryAndPostal() {
        updatePostalCodeViewLocale(this.countryLayout.getSelectedCountryCode());
        this.postalCodeView.setErrorColor(a.getColor(getContext(), R.color.stripe_card_form_view_form_error));
        this.postalCodeView.getInternalFocusChangeListeners$payments_core_release().add(new CardFormView$setupCountryAndPostal$1(this));
        this.postalCodeView.addTextChangedListener(new CardFormView$setupCountryAndPostal$$inlined$doAfterTextChanged$1(this));
        this.postalCodeView.setErrorMessageListener(new CardFormView$setupCountryAndPostal$3(this));
        this.countryLayout.setCountryCodeChangeCallback$payments_core_release(new CardFormView$setupCountryAndPostal$4(this));
    }

    /* access modifiers changed from: private */
    public final void showPostalError() {
        onFieldError(CardValidCallback.Fields.Postal, this.postalCodeView.getErrorMessage$payments_core_release());
    }

    private final void updateErrorsView(String str) {
        this.errors.setText(str);
        TextView textView = this.errors;
        int i = 0;
        if (!(str != null)) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    /* access modifiers changed from: private */
    public final void updatePostalCodeViewLocale(CountryCode countryCode) {
        if (CountryCode.Companion.isUS(countryCode)) {
            this.postalCodeView.setConfig$payments_core_release(PostalCodeEditText.Config.US);
            this.postalCodeView.setErrorMessage(getResources().getString(R.string.address_zip_invalid));
            return;
        }
        this.postalCodeView.setConfig$payments_core_release(PostalCodeEditText.Config.Global);
        this.postalCodeView.setErrorMessage(getResources().getString(R.string.address_postal_code_invalid));
    }

    public final CardParams getCardParams() {
        String str = null;
        if (!this.cardMultilineWidget.validateAllFields()) {
            this.cardMultilineWidget.setShouldShowErrorIcon$payments_core_release(true);
            return null;
        }
        this.cardMultilineWidget.setShouldShowErrorIcon$payments_core_release(false);
        if (!isPostalValid()) {
            showPostalError();
            return null;
        }
        updateErrorsView((String) null);
        ExpirationDate.Validated validatedDate = this.cardMultilineWidget.getExpiryDateEditText$payments_core_release().getValidatedDate();
        if (validatedDate != null) {
            CardBrand brand$payments_core_release = this.cardMultilineWidget.getBrand$payments_core_release();
            Set N3 = h.N3(CARD_FORM_VIEW);
            CardNumber.Validated validatedCardNumber$payments_core_release = this.cardMultilineWidget.getValidatedCardNumber$payments_core_release();
            String value$payments_core_release = validatedCardNumber$payments_core_release != null ? validatedCardNumber$payments_core_release.getValue$payments_core_release() : null;
            if (value$payments_core_release == null) {
                value$payments_core_release = "";
            }
            String str2 = value$payments_core_release;
            int month = validatedDate.getMonth();
            int year = validatedDate.getYear();
            Editable text = this.cardMultilineWidget.getCvcEditText$payments_core_release().getText();
            String obj = text != null ? text.toString() : null;
            Address.Builder countryCode$payments_core_release = new Address.Builder().setCountryCode$payments_core_release(this.countryLayout.getSelectedCountryCode());
            Editable text2 = this.postalCodeView.getText();
            if (text2 != null) {
                str = text2.toString();
            }
            return new CardParams(brand$payments_core_release, N3, str2, month, year, obj, (String) null, countryCode$payments_core_release.setPostalCode(str).build(), (String) null, (Map) null, 832, (f) null);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER_STATE));
            setEnabled(bundle.getBoolean(STATE_ENABLED));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        return g0.a.b.b.a.g(new Pair(STATE_SUPER_STATE, super.onSaveInstanceState()), new Pair(STATE_ENABLED, Boolean.valueOf(isEnabled())));
    }

    public final void setCardValidCallback(CardValidCallback cardValidCallback2) {
        this.cardValidCallback = cardValidCallback2;
        for (StripeEditText removeTextChangedListener : getAllEditTextFields()) {
            removeTextChangedListener.removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (cardValidCallback2 != null) {
            for (StripeEditText addTextChangedListener : getAllEditTextFields()) {
                addTextChangedListener.addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        CardValidCallback cardValidCallback3 = this.cardValidCallback;
        if (cardValidCallback3 != null) {
            cardValidCallback3.onInputChanged(getInvalidFields().isEmpty(), getInvalidFields());
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.cardContainer.setEnabled(z);
        this.cardMultilineWidget.setEnabled(z);
        this.countryLayout.setEnabled(z);
        this.postalCodeContainer.setEnabled(z);
        this.errors.setEnabled(z);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardFormView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        this.layoutInflater = from;
        StripeCardFormViewBinding inflate = StripeCardFormViewBinding.inflate(from, this);
        i.d(inflate, "StripeCardFormViewBindin…ate(layoutInflater, this)");
        this.viewBinding = inflate;
        MaterialCardView materialCardView = inflate.cardMultilineWidgetContainer;
        i.d(materialCardView, "viewBinding.cardMultilineWidgetContainer");
        this.cardContainer = materialCardView;
        CardMultilineWidget cardMultilineWidget2 = inflate.cardMultilineWidget;
        i.d(cardMultilineWidget2, "viewBinding.cardMultilineWidget");
        this.cardMultilineWidget = cardMultilineWidget2;
        View view = inflate.countryPostalDivider;
        i.d(view, "viewBinding.countryPostalDivider");
        this.countryPostalDivider = view;
        TextInputLayout textInputLayout = inflate.postalCodeContainer;
        i.d(textInputLayout, "viewBinding.postalCodeContainer");
        this.postalCodeContainer = textInputLayout;
        TextView textView = inflate.errors;
        i.d(textView, "viewBinding.errors");
        this.errors = textView;
        PostalCodeEditText postalCodeEditText = inflate.postalCode;
        i.d(postalCodeEditText, "viewBinding.postalCode");
        this.postalCodeView = postalCodeEditText;
        CountryTextInputLayout countryTextInputLayout = inflate.countryLayout;
        i.d(countryTextInputLayout, "viewBinding.countryLayout");
        this.countryLayout = countryTextInputLayout;
        this.postalCodeValidator = new PostalCodeValidator();
        this.style = Style.Standard;
        this.errorsMap = new LinkedHashMap();
        this.cardValidTextWatcher = new CardFormView$cardValidTextWatcher$1(this);
        setOrientation(1);
        setupCountryAndPostal();
        setupCardWidget();
        int[] iArr = R.styleable.StripeCardFormView;
        i.d(iArr, "R.styleable.StripeCardFormView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.StripeCardFormView_backgroundColorStateList);
        this.style = Style.values()[obtainStyledAttributes.getInt(R.styleable.StripeCardFormView_cardFormStyle, 0)];
        obtainStyledAttributes.recycle();
        if (colorStateList != null) {
            materialCardView.setCardBackgroundColor(colorStateList);
            cardMultilineWidget2.setBackgroundColor(0);
            countryTextInputLayout.setBackgroundColor(0);
            textInputLayout.setBackgroundColor(0);
        }
        int ordinal = this.style.ordinal();
        if (ordinal == 0) {
            applyStandardStyle();
        } else if (ordinal == 1) {
            applyBorderlessStyle();
        }
    }
}
