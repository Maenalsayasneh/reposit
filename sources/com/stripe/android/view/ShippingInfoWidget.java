package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.R;
import com.stripe.android.databinding.AddressWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import i0.j.f.p.h;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import m0.c;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\\B'\b\u0007\u0012\u0006\u0010U\u001a\u00020T\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010V\u0012\b\b\u0002\u0010Y\u001a\u00020X¢\u0006\u0004\bZ\u0010[J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u000fJ\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u000fJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u000fJ\u0017\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001d\u00105\u001a\u0002008B@\u0002X\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00106\u001a\u00020-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010/R\u0016\u00107\u001a\u00020-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010/R\u0016\u00108\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u0010)R\u0016\u00109\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010)R\u0016\u0010<\u001a\u00020\u001c8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F@\u0006¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0016\u0010>\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010)R\u0016\u0010?\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010)R\u0016\u0010@\u001a\u00020-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010/R\u0016\u0010A\u001a\u00020-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010/R\u0016\u0010B\u001a\u00020-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010/R\u0016\u0010D\u001a\u00020C8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER6\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00070F2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070F8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR6\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00070F2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070F8\u0006@FX\u000e¢\u0006\u0012\n\u0004\bN\u0010I\u001a\u0004\bO\u0010K\"\u0004\bP\u0010MR\u0016\u0010Q\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010)R\u0016\u0010R\u001a\u00020-8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010/R\u0016\u0010S\u001a\u00020'8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010)¨\u0006]"}, d2 = {"Lcom/stripe/android/view/ShippingInfoWidget;", "Landroid/widget/LinearLayout;", "Lcom/stripe/android/model/Address;", "address", "Lm0/i;", "populateAddressFields", "(Lcom/stripe/android/model/Address;)V", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "field", "", "isFieldRequired", "(Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;)Z", "isFieldOptional", "isFieldHidden", "initView", "()V", "setupErrorHandling", "renderLabels", "hideHiddenFields", "Lcom/stripe/android/view/Country;", "country", "updateConfigForCountry", "(Lcom/stripe/android/view/Country;)V", "updatePostalCodeInputFilter", "renderUSForm", "renderGreatBritainForm", "renderCanadianForm", "renderInternationalForm", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "populateShippingInfo", "(Lcom/stripe/android/model/ShippingInformation;)V", "", "", "allowedCountryCodes", "setAllowedCountryCodes", "(Ljava/util/Set;)V", "validateAllFields", "()Z", "Lcom/google/android/material/textfield/TextInputLayout;", "postalCodeTextInputLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "Lcom/stripe/android/view/CountryTextInputLayout;", "countryAutoCompleteTextView", "Lcom/stripe/android/view/CountryTextInputLayout;", "Lcom/stripe/android/view/StripeEditText;", "cityEditText", "Lcom/stripe/android/view/StripeEditText;", "Lcom/stripe/android/databinding/AddressWidgetBinding;", "viewBinding$delegate", "Lm0/c;", "getViewBinding", "()Lcom/stripe/android/databinding/AddressWidgetBinding;", "viewBinding", "phoneNumberEditText", "stateEditText", "stateTextInputLayout", "nameTextInputLayout", "getRawShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "rawShippingInformation", "getShippingInformation", "addressLine2TextInputLayout", "cityTextInputLayout", "addressEditText", "postalCodeEditText", "addressEditText2", "Lcom/stripe/android/view/PostalCodeValidator;", "postalCodeValidator", "Lcom/stripe/android/view/PostalCodeValidator;", "", "value", "optionalFields", "Ljava/util/List;", "getOptionalFields", "()Ljava/util/List;", "setOptionalFields", "(Ljava/util/List;)V", "hiddenFields", "getHiddenFields", "setHiddenFields", "phoneNumberTextInputLayout", "nameEditText", "addressLine1TextInputLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "CustomizableShippingField", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ShippingInfoWidget.kt */
public final class ShippingInfoWidget extends LinearLayout {
    private final StripeEditText addressEditText;
    private final StripeEditText addressEditText2;
    private final TextInputLayout addressLine1TextInputLayout;
    private final TextInputLayout addressLine2TextInputLayout;
    private final StripeEditText cityEditText;
    private final TextInputLayout cityTextInputLayout;
    private final CountryTextInputLayout countryAutoCompleteTextView;
    private List<? extends CustomizableShippingField> hiddenFields;
    private final StripeEditText nameEditText;
    private final TextInputLayout nameTextInputLayout;
    private List<? extends CustomizableShippingField> optionalFields;
    private final StripeEditText phoneNumberEditText;
    private final TextInputLayout phoneNumberTextInputLayout;
    private final StripeEditText postalCodeEditText;
    private final TextInputLayout postalCodeTextInputLayout;
    private final PostalCodeValidator postalCodeValidator;
    private final StripeEditText stateEditText;
    private final TextInputLayout stateTextInputLayout;
    private final c viewBinding$delegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "", "<init>", "(Ljava/lang/String;I)V", "Line1", "Line2", "City", "PostalCode", "State", "Phone", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ShippingInfoWidget.kt */
    public enum CustomizableShippingField {
        Line1,
        Line2,
        City,
        PostalCode,
        State,
        Phone
    }

    public ShippingInfoWidget(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public ShippingInfoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingInfoWidget(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final ShippingInformation getRawShippingInformation() {
        Address.Builder city = new Address.Builder().setCity(this.cityEditText.getFieldText$payments_core_release());
        Country selectedCountry = this.countryAutoCompleteTextView.getSelectedCountry();
        return new ShippingInformation(city.setCountryCode$payments_core_release(selectedCountry != null ? selectedCountry.getCode() : null).setLine1(this.addressEditText.getFieldText$payments_core_release()).setLine2(this.addressEditText2.getFieldText$payments_core_release()).setPostalCode(this.postalCodeEditText.getFieldText$payments_core_release()).setState(this.stateEditText.getFieldText$payments_core_release()).build(), this.nameEditText.getFieldText$payments_core_release(), this.phoneNumberEditText.getFieldText$payments_core_release());
    }

    private final AddressWidgetBinding getViewBinding() {
        return (AddressWidgetBinding) this.viewBinding$delegate.getValue();
    }

    private final void hideHiddenFields() {
        if (isFieldHidden(CustomizableShippingField.Line1)) {
            this.addressLine1TextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.Line2)) {
            this.addressLine2TextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.State)) {
            this.stateTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.City)) {
            this.cityTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.PostalCode)) {
            this.postalCodeTextInputLayout.setVisibility(8);
        }
        if (isFieldHidden(CustomizableShippingField.Phone)) {
            this.phoneNumberTextInputLayout.setVisibility(8);
        }
    }

    private final void initView() {
        this.countryAutoCompleteTextView.setCountryChangeCallback$payments_core_release(new ShippingInfoWidget$initView$1(this));
        this.phoneNumberEditText.addTextChangedListener(new PhoneNumberFormattingTextWatcher());
        setupErrorHandling();
        renderLabels();
        Country selectedCountry = this.countryAutoCompleteTextView.getSelectedCountry();
        if (selectedCountry != null) {
            updateConfigForCountry(selectedCountry);
        }
    }

    private final boolean isFieldHidden(CustomizableShippingField customizableShippingField) {
        return this.hiddenFields.contains(customizableShippingField);
    }

    private final boolean isFieldOptional(CustomizableShippingField customizableShippingField) {
        return this.optionalFields.contains(customizableShippingField);
    }

    private final boolean isFieldRequired(CustomizableShippingField customizableShippingField) {
        return !isFieldOptional(customizableShippingField) && !isFieldHidden(customizableShippingField);
    }

    private final void populateAddressFields(Address address) {
        this.cityEditText.setText(address.getCity());
        String country = address.getCountry();
        if (country != null) {
            if (country.length() > 0) {
                this.countryAutoCompleteTextView.setCountrySelected$payments_core_release(country);
            }
        }
        this.addressEditText.setText(address.getLine1());
        this.addressEditText2.setText(address.getLine2());
        this.postalCodeEditText.setText(address.getPostalCode());
        this.stateEditText.setText(address.getState());
    }

    private final void renderCanadianForm() {
        String str;
        String str2;
        String str3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            str = getResources().getString(R.string.address_label_address_optional);
        } else {
            str = getResources().getString(R.string.address_label_address);
        }
        textInputLayout.setHint((CharSequence) str);
        this.addressLine2TextInputLayout.setHint((CharSequence) getResources().getString(R.string.address_label_apt_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            str2 = getResources().getString(R.string.address_label_postal_code_optional);
        } else {
            str2 = getResources().getString(R.string.address_label_postal_code);
        }
        textInputLayout2.setHint((CharSequence) str2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            str3 = getResources().getString(R.string.address_label_province_optional);
        } else {
            str3 = getResources().getString(R.string.address_label_province);
        }
        textInputLayout3.setHint((CharSequence) str3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(R.string.address_postal_code_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R.string.address_province_required));
    }

    private final void renderGreatBritainForm() {
        String str;
        String str2;
        String str3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            str = getResources().getString(R.string.address_label_address_line1_optional);
        } else {
            str = getResources().getString(R.string.address_label_address_line1);
        }
        textInputLayout.setHint((CharSequence) str);
        this.addressLine2TextInputLayout.setHint((CharSequence) getResources().getString(R.string.address_label_address_line2_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            str2 = getResources().getString(R.string.address_label_postcode_optional);
        } else {
            str2 = getResources().getString(R.string.address_label_postcode);
        }
        textInputLayout2.setHint((CharSequence) str2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            str3 = getResources().getString(R.string.address_label_county_optional);
        } else {
            str3 = getResources().getString(R.string.address_label_county);
        }
        textInputLayout3.setHint((CharSequence) str3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(R.string.address_postcode_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R.string.address_county_required));
    }

    private final void renderInternationalForm() {
        String str;
        String str2;
        String str3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            str = getResources().getString(R.string.address_label_address_line1_optional);
        } else {
            str = getResources().getString(R.string.address_label_address_line1);
        }
        textInputLayout.setHint((CharSequence) str);
        this.addressLine2TextInputLayout.setHint((CharSequence) getResources().getString(R.string.address_label_address_line2_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            str2 = getResources().getString(R.string.address_label_zip_postal_code_optional);
        } else {
            str2 = getResources().getString(R.string.address_label_zip_postal_code);
        }
        textInputLayout2.setHint((CharSequence) str2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            str3 = getResources().getString(R.string.address_label_region_generic_optional);
        } else {
            str3 = getResources().getString(R.string.address_label_region_generic);
        }
        textInputLayout3.setHint((CharSequence) str3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(R.string.address_zip_postal_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R.string.address_region_generic_required));
    }

    private final void renderLabels() {
        String str;
        String str2;
        this.nameTextInputLayout.setHint((CharSequence) getResources().getString(R.string.address_label_name));
        TextInputLayout textInputLayout = this.cityTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.City)) {
            str = getResources().getString(R.string.address_label_city_optional);
        } else {
            str = getResources().getString(R.string.address_label_city);
        }
        textInputLayout.setHint((CharSequence) str);
        TextInputLayout textInputLayout2 = this.phoneNumberTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Phone)) {
            str2 = getResources().getString(R.string.address_label_phone_number_optional);
        } else {
            str2 = getResources().getString(R.string.address_label_phone_number);
        }
        textInputLayout2.setHint((CharSequence) str2);
        hideHiddenFields();
    }

    private final void renderUSForm() {
        String str;
        String str2;
        String str3;
        TextInputLayout textInputLayout = this.addressLine1TextInputLayout;
        if (isFieldOptional(CustomizableShippingField.Line1)) {
            str = getResources().getString(R.string.address_label_address_optional);
        } else {
            str = getResources().getString(R.string.address_label_address);
        }
        textInputLayout.setHint((CharSequence) str);
        this.addressLine2TextInputLayout.setHint((CharSequence) getResources().getString(R.string.address_label_apt_optional));
        TextInputLayout textInputLayout2 = this.postalCodeTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.PostalCode)) {
            str2 = getResources().getString(R.string.address_label_zip_code_optional);
        } else {
            str2 = getResources().getString(R.string.address_label_zip_code);
        }
        textInputLayout2.setHint((CharSequence) str2);
        TextInputLayout textInputLayout3 = this.stateTextInputLayout;
        if (isFieldOptional(CustomizableShippingField.State)) {
            str3 = getResources().getString(R.string.address_label_state_optional);
        } else {
            str3 = getResources().getString(R.string.address_label_state);
        }
        textInputLayout3.setHint((CharSequence) str3);
        this.postalCodeEditText.setErrorMessage(getResources().getString(R.string.address_zip_invalid));
        this.stateEditText.setErrorMessage(getResources().getString(R.string.address_state_required));
    }

    private final void setupErrorHandling() {
        this.addressEditText.setErrorMessageListener(new ErrorListener(this.addressLine1TextInputLayout));
        this.cityEditText.setErrorMessageListener(new ErrorListener(this.cityTextInputLayout));
        this.nameEditText.setErrorMessageListener(new ErrorListener(this.nameTextInputLayout));
        this.postalCodeEditText.setErrorMessageListener(new ErrorListener(this.postalCodeTextInputLayout));
        this.stateEditText.setErrorMessageListener(new ErrorListener(this.stateTextInputLayout));
        this.phoneNumberEditText.setErrorMessageListener(new ErrorListener(this.phoneNumberTextInputLayout));
        this.addressEditText.setErrorMessage(getResources().getString(R.string.address_required));
        this.cityEditText.setErrorMessage(getResources().getString(R.string.address_city_required));
        this.nameEditText.setErrorMessage(getResources().getString(R.string.address_name_required));
        this.phoneNumberEditText.setErrorMessage(getResources().getString(R.string.address_phone_number_required));
    }

    /* access modifiers changed from: private */
    public final void updateConfigForCountry(Country country) {
        String value = country.getCode().getValue();
        Locale locale = Locale.US;
        i.d(locale, "Locale.US");
        if (i.a(value, locale.getCountry())) {
            renderUSForm();
        } else {
            Locale locale2 = Locale.UK;
            i.d(locale2, "Locale.UK");
            if (i.a(value, locale2.getCountry())) {
                renderGreatBritainForm();
            } else {
                Locale locale3 = Locale.CANADA;
                i.d(locale3, "Locale.CANADA");
                if (i.a(value, locale3.getCountry())) {
                    renderCanadianForm();
                } else {
                    renderInternationalForm();
                }
            }
        }
        updatePostalCodeInputFilter(country);
        this.postalCodeTextInputLayout.setVisibility((!CountryUtils.INSTANCE.doesCountryUsePostalCode$payments_core_release(country.getCode()) || isFieldHidden(CustomizableShippingField.PostalCode)) ? 8 : 0);
    }

    private final void updatePostalCodeInputFilter(Country country) {
        StripeEditText stripeEditText = this.postalCodeEditText;
        String value = country.getCode().getValue();
        Locale locale = Locale.CANADA;
        i.d(locale, "Locale.CANADA");
        stripeEditText.setFilters(i.a(value, locale.getCountry()) ? new InputFilter[]{new InputFilter.AllCaps()} : new InputFilter[0]);
    }

    public final List<CustomizableShippingField> getHiddenFields() {
        return this.hiddenFields;
    }

    public final List<CustomizableShippingField> getOptionalFields() {
        return this.optionalFields;
    }

    public final ShippingInformation getShippingInformation() {
        if (!validateAllFields()) {
            return null;
        }
        return getRawShippingInformation();
    }

    public final void populateShippingInfo(ShippingInformation shippingInformation) {
        if (shippingInformation != null) {
            Address address = shippingInformation.getAddress();
            if (address != null) {
                populateAddressFields(address);
            }
            this.nameEditText.setText(shippingInformation.getName());
            this.phoneNumberEditText.setText(shippingInformation.getPhone());
        }
    }

    public final void setAllowedCountryCodes(Set<String> set) {
        i.e(set, "allowedCountryCodes");
        this.countryAutoCompleteTextView.setAllowedCountryCodes$payments_core_release(set);
    }

    public final void setHiddenFields(List<? extends CustomizableShippingField> list) {
        i.e(list, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.hiddenFields = list;
        renderLabels();
        Country selectedCountry = this.countryAutoCompleteTextView.getSelectedCountry();
        if (selectedCountry != null) {
            updateConfigForCountry(selectedCountry);
        }
    }

    public final void setOptionalFields(List<? extends CustomizableShippingField> list) {
        i.e(list, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        this.optionalFields = list;
        renderLabels();
        Country selectedCountry = this.countryAutoCompleteTextView.getSelectedCountry();
        if (selectedCountry != null) {
            updateConfigForCountry(selectedCountry);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        r9 = r7.getCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean validateAllFields() {
        /*
            r12 = this;
            com.stripe.android.view.StripeEditText r0 = r12.addressEditText
            android.text.Editable r0 = r0.getText()
            r1 = 0
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0109
            com.stripe.android.view.StripeEditText r2 = r12.nameEditText
            android.text.Editable r2 = r2.getText()
            if (r2 == 0) goto L_0x0109
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x0109
            com.stripe.android.view.StripeEditText r3 = r12.cityEditText
            android.text.Editable r3 = r3.getText()
            if (r3 == 0) goto L_0x0109
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L_0x0109
            com.stripe.android.view.StripeEditText r4 = r12.stateEditText
            android.text.Editable r4 = r4.getText()
            if (r4 == 0) goto L_0x0109
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L_0x0109
            com.stripe.android.view.StripeEditText r5 = r12.postalCodeEditText
            android.text.Editable r5 = r5.getText()
            if (r5 == 0) goto L_0x0109
            java.lang.String r5 = r5.toString()
            if (r5 == 0) goto L_0x0109
            com.stripe.android.view.StripeEditText r6 = r12.phoneNumberEditText
            android.text.Editable r6 = r6.getText()
            if (r6 == 0) goto L_0x0109
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L_0x0109
            com.stripe.android.view.CountryTextInputLayout r7 = r12.countryAutoCompleteTextView
            r7.validateCountry$payments_core_release()
            com.stripe.android.view.CountryTextInputLayout r7 = r12.countryAutoCompleteTextView
            com.stripe.android.view.Country r7 = r7.getSelectedCountry()
            com.stripe.android.view.PostalCodeValidator r8 = r12.postalCodeValidator
            if (r7 == 0) goto L_0x006f
            com.stripe.android.model.CountryCode r9 = r7.getCode()
            if (r9 == 0) goto L_0x006f
            java.lang.String r9 = r9.getValue()
            goto L_0x0070
        L_0x006f:
            r9 = 0
        L_0x0070:
            java.util.List<? extends com.stripe.android.view.ShippingInfoWidget$CustomizableShippingField> r10 = r12.optionalFields
            java.util.List<? extends com.stripe.android.view.ShippingInfoWidget$CustomizableShippingField> r11 = r12.hiddenFields
            boolean r5 = r8.isValid(r5, r9, r10, r11)
            com.stripe.android.view.StripeEditText r8 = r12.postalCodeEditText
            r9 = r5 ^ 1
            r8.setShouldShowError(r9)
            int r0 = r0.length()
            r8 = 1
            if (r0 != 0) goto L_0x0088
            r0 = r8
            goto L_0x0089
        L_0x0088:
            r0 = r1
        L_0x0089:
            if (r0 == 0) goto L_0x0095
            com.stripe.android.view.ShippingInfoWidget$CustomizableShippingField r0 = com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField.Line1
            boolean r0 = r12.isFieldRequired(r0)
            if (r0 == 0) goto L_0x0095
            r0 = r8
            goto L_0x0096
        L_0x0095:
            r0 = r1
        L_0x0096:
            com.stripe.android.view.StripeEditText r9 = r12.addressEditText
            r9.setShouldShowError(r0)
            int r3 = r3.length()
            if (r3 != 0) goto L_0x00a3
            r3 = r8
            goto L_0x00a4
        L_0x00a3:
            r3 = r1
        L_0x00a4:
            if (r3 == 0) goto L_0x00b0
            com.stripe.android.view.ShippingInfoWidget$CustomizableShippingField r3 = com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField.City
            boolean r3 = r12.isFieldRequired(r3)
            if (r3 == 0) goto L_0x00b0
            r3 = r8
            goto L_0x00b1
        L_0x00b0:
            r3 = r1
        L_0x00b1:
            com.stripe.android.view.StripeEditText r9 = r12.cityEditText
            r9.setShouldShowError(r3)
            int r2 = r2.length()
            if (r2 != 0) goto L_0x00be
            r2 = r8
            goto L_0x00bf
        L_0x00be:
            r2 = r1
        L_0x00bf:
            com.stripe.android.view.StripeEditText r9 = r12.nameEditText
            r9.setShouldShowError(r2)
            int r4 = r4.length()
            if (r4 != 0) goto L_0x00cc
            r4 = r8
            goto L_0x00cd
        L_0x00cc:
            r4 = r1
        L_0x00cd:
            if (r4 == 0) goto L_0x00d9
            com.stripe.android.view.ShippingInfoWidget$CustomizableShippingField r4 = com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField.State
            boolean r4 = r12.isFieldRequired(r4)
            if (r4 == 0) goto L_0x00d9
            r4 = r8
            goto L_0x00da
        L_0x00d9:
            r4 = r1
        L_0x00da:
            com.stripe.android.view.StripeEditText r9 = r12.stateEditText
            r9.setShouldShowError(r4)
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00e7
            r6 = r8
            goto L_0x00e8
        L_0x00e7:
            r6 = r1
        L_0x00e8:
            if (r6 == 0) goto L_0x00f4
            com.stripe.android.view.ShippingInfoWidget$CustomizableShippingField r6 = com.stripe.android.view.ShippingInfoWidget.CustomizableShippingField.Phone
            boolean r6 = r12.isFieldRequired(r6)
            if (r6 == 0) goto L_0x00f4
            r6 = r8
            goto L_0x00f5
        L_0x00f4:
            r6 = r1
        L_0x00f5:
            com.stripe.android.view.StripeEditText r9 = r12.phoneNumberEditText
            r9.setShouldShowError(r6)
            if (r5 == 0) goto L_0x0109
            if (r0 != 0) goto L_0x0109
            if (r3 != 0) goto L_0x0109
            if (r4 != 0) goto L_0x0109
            if (r2 != 0) goto L_0x0109
            if (r6 != 0) goto L_0x0109
            if (r7 == 0) goto L_0x0109
            r1 = r8
        L_0x0109:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.ShippingInfoWidget.validateAllFields():boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        this.viewBinding$delegate = h.H2(new ShippingInfoWidget$viewBinding$2(this, context));
        this.postalCodeValidator = new PostalCodeValidator();
        EmptyList emptyList = EmptyList.c;
        this.optionalFields = emptyList;
        this.hiddenFields = emptyList;
        CountryTextInputLayout countryTextInputLayout = getViewBinding().countryAutocompleteAaw;
        i.d(countryTextInputLayout, "viewBinding.countryAutocompleteAaw");
        this.countryAutoCompleteTextView = countryTextInputLayout;
        TextInputLayout textInputLayout = getViewBinding().tlAddressLine1Aaw;
        i.d(textInputLayout, "viewBinding.tlAddressLine1Aaw");
        this.addressLine1TextInputLayout = textInputLayout;
        TextInputLayout textInputLayout2 = getViewBinding().tlAddressLine2Aaw;
        i.d(textInputLayout2, "viewBinding.tlAddressLine2Aaw");
        this.addressLine2TextInputLayout = textInputLayout2;
        TextInputLayout textInputLayout3 = getViewBinding().tlCityAaw;
        i.d(textInputLayout3, "viewBinding.tlCityAaw");
        this.cityTextInputLayout = textInputLayout3;
        TextInputLayout textInputLayout4 = getViewBinding().tlNameAaw;
        i.d(textInputLayout4, "viewBinding.tlNameAaw");
        this.nameTextInputLayout = textInputLayout4;
        TextInputLayout textInputLayout5 = getViewBinding().tlPostalCodeAaw;
        i.d(textInputLayout5, "viewBinding.tlPostalCodeAaw");
        this.postalCodeTextInputLayout = textInputLayout5;
        TextInputLayout textInputLayout6 = getViewBinding().tlStateAaw;
        i.d(textInputLayout6, "viewBinding.tlStateAaw");
        this.stateTextInputLayout = textInputLayout6;
        TextInputLayout textInputLayout7 = getViewBinding().tlPhoneNumberAaw;
        i.d(textInputLayout7, "viewBinding.tlPhoneNumberAaw");
        this.phoneNumberTextInputLayout = textInputLayout7;
        StripeEditText stripeEditText = getViewBinding().etAddressLineOneAaw;
        i.d(stripeEditText, "viewBinding.etAddressLineOneAaw");
        this.addressEditText = stripeEditText;
        StripeEditText stripeEditText2 = getViewBinding().etAddressLineTwoAaw;
        i.d(stripeEditText2, "viewBinding.etAddressLineTwoAaw");
        this.addressEditText2 = stripeEditText2;
        StripeEditText stripeEditText3 = getViewBinding().etCityAaw;
        i.d(stripeEditText3, "viewBinding.etCityAaw");
        this.cityEditText = stripeEditText3;
        StripeEditText stripeEditText4 = getViewBinding().etNameAaw;
        i.d(stripeEditText4, "viewBinding.etNameAaw");
        this.nameEditText = stripeEditText4;
        StripeEditText stripeEditText5 = getViewBinding().etPostalCodeAaw;
        i.d(stripeEditText5, "viewBinding.etPostalCodeAaw");
        this.postalCodeEditText = stripeEditText5;
        StripeEditText stripeEditText6 = getViewBinding().etStateAaw;
        i.d(stripeEditText6, "viewBinding.etStateAaw");
        this.stateEditText = stripeEditText6;
        StripeEditText stripeEditText7 = getViewBinding().etPhoneNumberAaw;
        i.d(stripeEditText7, "viewBinding.etPhoneNumberAaw");
        this.phoneNumberEditText = stripeEditText7;
        setOrientation(1);
        if (Build.VERSION.SDK_INT >= 26) {
            stripeEditText4.setAutofillHints(new String[]{"name"});
            textInputLayout.setAutofillHints(new String[]{"postalAddress"});
            stripeEditText5.setAutofillHints(new String[]{"postalCode"});
            stripeEditText7.setAutofillHints(new String[]{PaymentMethod.BillingDetails.PARAM_PHONE});
        }
        initView();
    }
}
