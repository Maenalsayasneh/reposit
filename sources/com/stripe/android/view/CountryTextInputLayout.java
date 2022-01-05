package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.model.CountryCode;
import i0.d.a.a.a;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import m0.i;
import m0.n.a.l;
import m0.n.b.f;
import m0.o.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 U2\u00020\u0001:\u0002UVB'\b\u0007\u0012\u0006\u0010O\u001a\u00020N\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010P\u0012\b\b\u0002\u0010R\u001a\u000207¢\u0006\u0004\bS\u0010TJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001f\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010$\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\"\u0010%J\u0017\u0010'\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0001¢\u0006\u0004\b&\u0010#J\u0017\u0010)\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b(\u0010#J\u000f\u0010+\u001a\u00020\u0005H\u0000¢\u0006\u0004\b*\u0010\u0007R.\u0010-\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00050,8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00028\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b6\u0010\u0007\u001a\u0004\b5\u0010\u0004R\u0016\u00108\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0015\u0010@\u001a\u0004\u0018\u00010=8F@\u0006¢\u0006\u0006\u001a\u0004\b>\u0010?R4\u0010A\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\u00050,8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\bA\u0010.\u0012\u0004\bD\u0010\u0007\u001a\u0004\bB\u00100\"\u0004\bC\u00102R5\u0010L\u001a\u0004\u0018\u00010 2\b\u0010E\u001a\u0004\u0018\u00010 8F@FX\u0002¢\u0006\u0018\n\u0004\bF\u0010G\u0012\u0004\bK\u0010\u0007\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010#R\u0016\u0010M\u001a\u0002078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bM\u00109¨\u0006W"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Landroid/widget/AutoCompleteTextView;", "initializeCountryAutoCompleteWithStyle", "()Landroid/widget/AutoCompleteTextView;", "Lm0/i;", "updateInitialCountry", "()V", "clearError", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "", "enabled", "setEnabled", "(Z)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;", "restoreSelectedCountry$payments_core_release", "(Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;)V", "restoreSelectedCountry", "", "", "allowedCountryCodes", "setAllowedCountryCodes$payments_core_release", "(Ljava/util/Set;)V", "setAllowedCountryCodes", "Lcom/stripe/android/model/CountryCode;", "countryCode", "setCountrySelected$payments_core_release", "(Lcom/stripe/android/model/CountryCode;)V", "setCountrySelected", "(Ljava/lang/String;)V", "updateUiForCountryEntered$payments_core_release", "updateUiForCountryEntered", "updatedSelectedCountryCode$payments_core_release", "updatedSelectedCountryCode", "validateCountry$payments_core_release", "validateCountry", "Lkotlin/Function1;", "countryCodeChangeCallback", "Lm0/n/a/l;", "getCountryCodeChangeCallback$payments_core_release", "()Lm0/n/a/l;", "setCountryCodeChangeCallback$payments_core_release", "(Lm0/n/a/l;)V", "countryAutocomplete", "Landroid/widget/AutoCompleteTextView;", "getCountryAutocomplete$payments_core_release", "getCountryAutocomplete$payments_core_release$annotations", "", "itemLayoutRes", "I", "Lcom/stripe/android/view/CountryAdapter;", "countryAdapter", "Lcom/stripe/android/view/CountryAdapter;", "Lcom/stripe/android/view/Country;", "getSelectedCountry", "()Lcom/stripe/android/view/Country;", "selectedCountry", "countryChangeCallback", "getCountryChangeCallback$payments_core_release", "setCountryChangeCallback$payments_core_release", "getCountryChangeCallback$payments_core_release$annotations", "<set-?>", "selectedCountryCode$delegate", "Lm0/o/d;", "getSelectedCountryCode", "()Lcom/stripe/android/model/CountryCode;", "setSelectedCountryCode", "getSelectedCountryCode$annotations", "selectedCountryCode", "countryAutoCompleteStyleRes", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "SelectedCountryState", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CountryTextInputLayout.kt */
public final class CountryTextInputLayout extends TextInputLayout {
    public static final /* synthetic */ k[] $$delegatedProperties = {a.o1(CountryTextInputLayout.class, "selectedCountryCode", "getSelectedCountryCode()Lcom/stripe/android/model/CountryCode;", 0)};
    private static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    @Deprecated
    public static final int DEFAULT_ITEM_LAYOUT = R.layout.country_text_view;
    @Deprecated
    public static final int INVALID_COUNTRY_AUTO_COMPLETE_STYLE = 0;
    /* access modifiers changed from: private */
    public CountryAdapter countryAdapter;
    private int countryAutoCompleteStyleRes;
    private final AutoCompleteTextView countryAutocomplete;
    private /* synthetic */ l<? super Country, i> countryChangeCallback;
    private /* synthetic */ l<? super CountryCode, i> countryCodeChangeCallback;
    /* access modifiers changed from: private */
    public int itemLayoutRes;
    private final d selectedCountryCode$delegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout$Companion;", "", "", "DEFAULT_ITEM_LAYOUT", "I", "getDEFAULT_ITEM_LAYOUT", "()I", "INVALID_COUNTRY_AUTO_COMPLETE_STYLE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CountryTextInputLayout.kt */
    public static final class Companion {
        private Companion() {
        }

        public final int getDEFAULT_ITEM_LAYOUT() {
            return CountryTextInputLayout.DEFAULT_ITEM_LAYOUT;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u0004¨\u0006#"}, d2 = {"Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/CountryCode;", "component1", "()Lcom/stripe/android/model/CountryCode;", "component2", "()Landroid/os/Parcelable;", "countryCode", "superState", "copy", "(Lcom/stripe/android/model/CountryCode;Landroid/os/Parcelable;)Lcom/stripe/android/view/CountryTextInputLayout$SelectedCountryState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/os/Parcelable;", "getSuperState", "Lcom/stripe/android/model/CountryCode;", "getCountryCode", "<init>", "(Lcom/stripe/android/model/CountryCode;Landroid/os/Parcelable;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CountryTextInputLayout.kt */
    public static final class SelectedCountryState implements Parcelable {
        public static final Parcelable.Creator<SelectedCountryState> CREATOR = new Creator();
        private final CountryCode countryCode;
        private final Parcelable superState;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<SelectedCountryState> {
            public final SelectedCountryState createFromParcel(Parcel parcel) {
                m0.n.b.i.e(parcel, "in");
                return new SelectedCountryState(CountryCode.CREATOR.createFromParcel(parcel), parcel.readParcelable(SelectedCountryState.class.getClassLoader()));
            }

            public final SelectedCountryState[] newArray(int i) {
                return new SelectedCountryState[i];
            }
        }

        public SelectedCountryState(CountryCode countryCode2, Parcelable parcelable) {
            m0.n.b.i.e(countryCode2, "countryCode");
            this.countryCode = countryCode2;
            this.superState = parcelable;
        }

        public static /* synthetic */ SelectedCountryState copy$default(SelectedCountryState selectedCountryState, CountryCode countryCode2, Parcelable parcelable, int i, Object obj) {
            if ((i & 1) != 0) {
                countryCode2 = selectedCountryState.countryCode;
            }
            if ((i & 2) != 0) {
                parcelable = selectedCountryState.superState;
            }
            return selectedCountryState.copy(countryCode2, parcelable);
        }

        public final CountryCode component1() {
            return this.countryCode;
        }

        public final Parcelable component2() {
            return this.superState;
        }

        public final SelectedCountryState copy(CountryCode countryCode2, Parcelable parcelable) {
            m0.n.b.i.e(countryCode2, "countryCode");
            return new SelectedCountryState(countryCode2, parcelable);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SelectedCountryState)) {
                return false;
            }
            SelectedCountryState selectedCountryState = (SelectedCountryState) obj;
            return m0.n.b.i.a(this.countryCode, selectedCountryState.countryCode) && m0.n.b.i.a(this.superState, selectedCountryState.superState);
        }

        public final CountryCode getCountryCode() {
            return this.countryCode;
        }

        public final Parcelable getSuperState() {
            return this.superState;
        }

        public int hashCode() {
            CountryCode countryCode2 = this.countryCode;
            int i = 0;
            int hashCode = (countryCode2 != null ? countryCode2.hashCode() : 0) * 31;
            Parcelable parcelable = this.superState;
            if (parcelable != null) {
                i = parcelable.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("SelectedCountryState(countryCode=");
            P0.append(this.countryCode);
            P0.append(", superState=");
            P0.append(this.superState);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            m0.n.b.i.e(parcel, "parcel");
            this.countryCode.writeToParcel(parcel, 0);
            parcel.writeParcelable(this.superState, i);
        }
    }

    public CountryTextInputLayout(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public CountryTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CountryTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? com.google.android.material.R.attr.textInputStyle : i);
    }

    /* access modifiers changed from: private */
    public final void clearError() {
        setError((CharSequence) null);
        setErrorEnabled(false);
    }

    public static /* synthetic */ void getCountryAutocomplete$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getCountryChangeCallback$payments_core_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final Locale getLocale() {
        Context context = getContext();
        m0.n.b.i.d(context, "context");
        Resources resources = context.getResources();
        m0.n.b.i.d(resources, "context.resources");
        Locale b = g0.a.b.b.a.L(resources.getConfiguration()).b(0);
        m0.n.b.i.d(b, "ConfigurationCompat.getL…sources.configuration)[0]");
        return b;
    }

    public static /* synthetic */ void getSelectedCountryCode$annotations() {
    }

    private final AutoCompleteTextView initializeCountryAutoCompleteWithStyle() {
        if (this.countryAutoCompleteStyleRes != 0) {
            return new AutoCompleteTextView(getContext(), (AttributeSet) null, 0, this.countryAutoCompleteStyleRes);
        }
        return new AutoCompleteTextView(getContext(), (AttributeSet) null, R.attr.autoCompleteTextViewStyle);
    }

    private final void updateInitialCountry() {
        Country firstItem$payments_core_release = this.countryAdapter.getFirstItem$payments_core_release();
        this.countryAutocomplete.setText(firstItem$payments_core_release.getName());
        setSelectedCountryCode(firstItem$payments_core_release.getCode());
    }

    public final AutoCompleteTextView getCountryAutocomplete$payments_core_release() {
        return this.countryAutocomplete;
    }

    public final l<Country, i> getCountryChangeCallback$payments_core_release() {
        return this.countryChangeCallback;
    }

    public final l<CountryCode, i> getCountryCodeChangeCallback$payments_core_release() {
        return this.countryCodeChangeCallback;
    }

    public final Country getSelectedCountry() {
        CountryCode selectedCountryCode = getSelectedCountryCode();
        if (selectedCountryCode != null) {
            return CountryUtils.INSTANCE.getCountryByCode$payments_core_release(selectedCountryCode, getLocale());
        }
        return null;
    }

    public final CountryCode getSelectedCountryCode() {
        return (CountryCode) this.selectedCountryCode$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SelectedCountryState) {
            restoreSelectedCountry$payments_core_release((SelectedCountryState) parcelable);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    public Parcelable onSaveInstanceState() {
        Country selectedCountry = getSelectedCountry();
        if (selectedCountry != null) {
            return new SelectedCountryState(selectedCountry.getCode(), super.onSaveInstanceState());
        }
        return super.onSaveInstanceState();
    }

    public final void restoreSelectedCountry$payments_core_release(SelectedCountryState selectedCountryState) {
        m0.n.b.i.e(selectedCountryState, "state");
        super.onRestoreInstanceState(selectedCountryState.getSuperState());
        CountryCode countryCode = selectedCountryState.getCountryCode();
        updatedSelectedCountryCode$payments_core_release(countryCode);
        updateUiForCountryEntered$payments_core_release(countryCode);
        requestLayout();
    }

    public final void setAllowedCountryCodes$payments_core_release(Set<String> set) {
        m0.n.b.i.e(set, "allowedCountryCodes");
        if (this.countryAdapter.updateUnfilteredCountries$payments_core_release(set)) {
            updateInitialCountry();
        }
    }

    public final void setCountryChangeCallback$payments_core_release(l<? super Country, i> lVar) {
        m0.n.b.i.e(lVar, "<set-?>");
        this.countryChangeCallback = lVar;
    }

    public final void setCountryCodeChangeCallback$payments_core_release(l<? super CountryCode, i> lVar) {
        m0.n.b.i.e(lVar, "<set-?>");
        this.countryCodeChangeCallback = lVar;
    }

    public final void setCountrySelected$payments_core_release(CountryCode countryCode) {
        m0.n.b.i.e(countryCode, "countryCode");
        updateUiForCountryEntered$payments_core_release(countryCode);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        addOnLayoutChangeListener(new CountryTextInputLayout$setEnabled$$inlined$doOnNextLayout$1(this, z));
    }

    public final void setSelectedCountryCode(CountryCode countryCode) {
        this.selectedCountryCode$delegate.setValue(this, $$delegatedProperties[0], countryCode);
    }

    public final void updateUiForCountryEntered$payments_core_release(CountryCode countryCode) {
        m0.n.b.i.e(countryCode, "countryCode");
        CountryUtils countryUtils = CountryUtils.INSTANCE;
        Country countryByCode$payments_core_release = countryUtils.getCountryByCode$payments_core_release(countryCode, getLocale());
        if (countryByCode$payments_core_release != null) {
            updatedSelectedCountryCode$payments_core_release(countryCode);
        } else {
            countryByCode$payments_core_release = countryUtils.getCountryByCode$payments_core_release(getSelectedCountryCode(), getLocale());
        }
        this.countryAutocomplete.setText(countryByCode$payments_core_release != null ? countryByCode$payments_core_release.getName() : null);
    }

    public final void updatedSelectedCountryCode$payments_core_release(CountryCode countryCode) {
        m0.n.b.i.e(countryCode, "countryCode");
        clearError();
        if (!m0.n.b.i.a(getSelectedCountryCode(), countryCode)) {
            setSelectedCountryCode(countryCode);
        }
    }

    public final void validateCountry$payments_core_release() {
        this.countryAutocomplete.performValidation();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CountryTextInputLayout(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m0.n.b.i.e(context, "context");
        int i2 = DEFAULT_ITEM_LAYOUT;
        this.itemLayoutRes = i2;
        this.selectedCountryCode$delegate = new CountryTextInputLayout$$special$$inlined$observable$1((Object) null, (Object) null, this);
        this.countryChangeCallback = CountryTextInputLayout$countryChangeCallback$1.INSTANCE;
        this.countryCodeChangeCallback = CountryTextInputLayout$countryCodeChangeCallback$1.INSTANCE;
        int[] iArr = R.styleable.StripeCountryAutoCompleteTextInputLayout;
        m0.n.b.i.d(iArr, "R.styleable.StripeCountr…toCompleteTextInputLayout");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.countryAutoCompleteStyleRes = obtainStyledAttributes.getResourceId(R.styleable.StripeCountryAutoCompleteTextInputLayout_countryAutoCompleteStyle, 0);
        this.itemLayoutRes = obtainStyledAttributes.getResourceId(R.styleable.StripeCountryAutoCompleteTextInputLayout_countryItemLayout, i2);
        obtainStyledAttributes.recycle();
        AutoCompleteTextView initializeCountryAutoCompleteWithStyle = initializeCountryAutoCompleteWithStyle();
        this.countryAutocomplete = initializeCountryAutoCompleteWithStyle;
        addView(initializeCountryAutoCompleteWithStyle, new LinearLayout.LayoutParams(-1, -2));
        this.countryAdapter = new CountryAdapter(context, CountryUtils.INSTANCE.getOrderedCountries$payments_core_release(getLocale()), this.itemLayoutRes, new l<ViewGroup, TextView>(this) {
            public final /* synthetic */ CountryTextInputLayout this$0;

            {
                this.this$0 = r1;
            }

            public final TextView invoke(ViewGroup viewGroup) {
                m0.n.b.i.e(viewGroup, "it");
                View inflate = LayoutInflater.from(context).inflate(this.this$0.itemLayoutRes, viewGroup, false);
                Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
                return (TextView) inflate;
            }
        });
        initializeCountryAutoCompleteWithStyle.setThreshold(0);
        initializeCountryAutoCompleteWithStyle.setAdapter(this.countryAdapter);
        initializeCountryAutoCompleteWithStyle.setOnItemClickListener(new AdapterView.OnItemClickListener(this) {
            public final /* synthetic */ CountryTextInputLayout this$0;

            {
                this.this$0 = r1;
            }

            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                CountryTextInputLayout countryTextInputLayout = this.this$0;
                countryTextInputLayout.updatedSelectedCountryCode$payments_core_release(countryTextInputLayout.countryAdapter.getItem(i).getCode());
            }
        });
        initializeCountryAutoCompleteWithStyle.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            public final /* synthetic */ CountryTextInputLayout this$0;

            {
                this.this$0 = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    this.this$0.getCountryAutocomplete$payments_core_release().showDropDown();
                    return;
                }
                CountryCode countryCodeByName$payments_core_release = CountryUtils.INSTANCE.getCountryCodeByName$payments_core_release(this.this$0.getCountryAutocomplete$payments_core_release().getText().toString(), this.this$0.getLocale());
                if (countryCodeByName$payments_core_release != null) {
                    this.this$0.updateUiForCountryEntered$payments_core_release(countryCodeByName$payments_core_release);
                }
            }
        });
        setSelectedCountryCode(this.countryAdapter.getFirstItem$payments_core_release().getCode());
        updateInitialCountry();
        final String string = getResources().getString(R.string.address_country_invalid);
        m0.n.b.i.d(string, "resources.getString(R.st….address_country_invalid)");
        initializeCountryAutoCompleteWithStyle.setValidator(new CountryAutoCompleteTextViewValidator(this.countryAdapter, new l<Country, i>(this) {
            public final /* synthetic */ CountryTextInputLayout this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Country) obj);
                return i.a;
            }

            public final void invoke(Country country) {
                this.this$0.setSelectedCountryCode(country != null ? country.getCode() : null);
                if (country != null) {
                    this.this$0.clearError();
                    return;
                }
                this.this$0.setError(string);
                this.this$0.setErrorEnabled(true);
            }
        }));
    }

    public final void setCountrySelected$payments_core_release(String str) {
        m0.n.b.i.e(str, "countryCode");
        updateUiForCountryEntered$payments_core_release(CountryCode.Companion.create(str));
    }
}
