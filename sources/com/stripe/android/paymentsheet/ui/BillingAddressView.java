package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LiveData;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.databinding.StripeBillingAddressLayoutBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CountryCode;
import com.stripe.android.view.Country;
import com.stripe.android.view.CountryTextInputLayout;
import com.stripe.android.view.CountryUtils;
import com.stripe.android.view.PostalCodeValidator;
import com.stripe.android.view.StripeEditText;
import h0.q.y;
import i0.d.a.a.a;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.o.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0006\u0001\u0001\u0001B/\b\u0007\u0012\b\u0010\u0001\u001a\u00030\u0001\u0012\f\b\u0002\u0010\u0001\u001a\u0005\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0001\u001a\u00030\u0001¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0010J\u0019\u0010\u001c\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u001d8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010\"\u001a\u00020!8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010\u0010\u001a\u0004\b$\u0010%R*\u0010(\u001a\u0004\u0018\u00010'8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b.\u0010\u0010\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00100\u001a\u00020/8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010\u0010\u001a\u0004\b2\u00103R\u001e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u00109\u001a\u0002088\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b9\u0010:\u0012\u0004\b=\u0010\u0010\u001a\u0004\b;\u0010<R\u001c\u0010A\u001a\u0004\u0018\u00010\u0007*\u00020>8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R1\u0010K\u001a\u00020B2\u0006\u0010C\u001a\u00020B8@@@X\u0002¢\u0006\u0018\n\u0004\bD\u0010E\u0012\u0004\bJ\u0010\u0010\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010M\u001a\u00020L8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\bM\u0010N\u0012\u0004\bQ\u0010\u0010\u001a\u0004\bO\u0010PR\"\u0010R\u001a\u00020/8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\bR\u00101\u0012\u0004\bT\u0010\u0010\u001a\u0004\bS\u00103R(\u0010V\u001a\b\u0012\u0004\u0012\u00020\u000b0U8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R+\u0010b\u001a\u00020\\2\u0006\u0010C\u001a\u00020\\8B@BX\u0002¢\u0006\u0012\n\u0004\b]\u0010E\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010c\u001a\u00020/8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\bc\u00101\u0012\u0004\be\u0010\u0010\u001a\u0004\bd\u00103R\u0016\u0010g\u001a\u00020f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\"\u0010j\u001a\u00020i8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\bj\u0010k\u0012\u0004\bn\u0010\u0010\u001a\u0004\bl\u0010mR\"\u0010o\u001a\u00020!8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\bo\u0010#\u0012\u0004\bq\u0010\u0010\u001a\u0004\bp\u0010%R\"\u0010s\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\"\u0010u\u001a\u00020/8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\bu\u00101\u0012\u0004\bw\u0010\u0010\u001a\u0004\bv\u00103R\"\u0010x\u001a\u00020!8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\bx\u0010#\u0012\u0004\bz\u0010\u0010\u001a\u0004\by\u0010%R\u001c\u0010}\u001a\b\u0012\u0004\u0012\u00020|0{8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001c\u0010\u001a\b\u0012\u0004\u0012\u00020>0{8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010~R\u0019\u0010\u0001\u001a\u00020\u00148B@\u0002X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00030\u00018\u0000@\u0001X\u0004¢\u0006\u0017\n\u0006\b\u0001\u0010\u0001\u0012\u0005\b\u0001\u0010\u0010\u001a\u0006\b\u0001\u0010\u0001R\u001a\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView;", "Landroid/widget/FrameLayout;", "Lcom/stripe/android/model/Address;", "createAddress", "()Lcom/stripe/android/model/Address;", "Lcom/stripe/android/model/CountryCode;", "countryCode", "", "postalCode", "createRequiredAddress", "(Lcom/stripe/android/model/CountryCode;Ljava/lang/String;)Lcom/stripe/android/model/Address;", "Lm0/i;", "updateStateView", "(Lcom/stripe/android/model/CountryCode;)V", "updatePostalCodeView", "configureForLevel", "()V", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "", "enabled", "setEnabled", "(Z)V", "focusFirstField", "address", "populate$payments_core_release", "(Lcom/stripe/android/model/Address;)V", "populate", "Landroidx/lifecycle/LiveData;", "Landroidx/lifecycle/LiveData;", "getAddress$payments_core_release", "()Landroidx/lifecycle/LiveData;", "Lcom/google/android/material/textfield/TextInputLayout;", "cityLayout", "Lcom/google/android/material/textfield/TextInputLayout;", "getCityLayout$payments_core_release", "()Lcom/google/android/material/textfield/TextInputLayout;", "getCityLayout$payments_core_release$annotations", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;", "postalCodeViewListener", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;", "getPostalCodeViewListener$payments_core_release", "()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;", "setPostalCodeViewListener$payments_core_release", "(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;)V", "getPostalCodeViewListener$payments_core_release$annotations", "Lcom/google/android/material/textfield/TextInputEditText;", "address1View", "Lcom/google/android/material/textfield/TextInputEditText;", "getAddress1View$payments_core_release", "()Lcom/google/android/material/textfield/TextInputEditText;", "getAddress1View$payments_core_release$annotations", "Lh0/q/y;", "_address", "Lh0/q/y;", "Landroid/widget/AutoCompleteTextView;", "countryView", "Landroid/widget/AutoCompleteTextView;", "getCountryView$payments_core_release", "()Landroid/widget/AutoCompleteTextView;", "getCountryView$payments_core_release$annotations", "Landroid/widget/EditText;", "getValue", "(Landroid/widget/EditText;)Ljava/lang/String;", "value", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;", "<set-?>", "level$delegate", "Lm0/o/d;", "getLevel$payments_core_release", "()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;", "setLevel$payments_core_release", "(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;)V", "getLevel$payments_core_release$annotations", "level", "Lcom/stripe/android/view/StripeEditText;", "postalCodeView", "Lcom/stripe/android/view/StripeEditText;", "getPostalCodeView$payments_core_release", "()Lcom/stripe/android/view/StripeEditText;", "getPostalCodeView$payments_core_release$annotations", "stateView", "getStateView$payments_core_release", "getStateView$payments_core_release$annotations", "Lkotlin/Function0;", "onFocus", "Lm0/n/a/a;", "getOnFocus$payments_core_release", "()Lm0/n/a/a;", "setOnFocus$payments_core_release", "(Lm0/n/a/a;)V", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "postalCodeConfig$delegate", "getPostalCodeConfig", "()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "setPostalCodeConfig", "(Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;)V", "postalCodeConfig", "cityView", "getCityView$payments_core_release", "getCityView$payments_core_release$annotations", "Lcom/stripe/android/view/PostalCodeValidator;", "postalCodeValidator", "Lcom/stripe/android/view/PostalCodeValidator;", "Landroid/widget/LinearLayout;", "cityPostalContainer", "Landroid/widget/LinearLayout;", "getCityPostalContainer$payments_core_release", "()Landroid/widget/LinearLayout;", "getCityPostalContainer$payments_core_release$annotations", "postalCodeLayout", "getPostalCodeLayout$payments_core_release", "getPostalCodeLayout$payments_core_release$annotations", "Lkotlin/Function1;", "newCountryCodeCallback", "Lm0/n/a/l;", "address2View", "getAddress2View$payments_core_release", "getAddress2View$payments_core_release$annotations", "stateLayout", "getStateLayout$payments_core_release", "getStateLayout$payments_core_release$annotations", "", "Landroid/view/View;", "requiredViews", "Ljava/util/Set;", "allFields", "isUnitedStates", "()Z", "Lcom/stripe/android/view/CountryTextInputLayout;", "countryLayout", "Lcom/stripe/android/view/CountryTextInputLayout;", "getCountryLayout$payments_core_release", "()Lcom/stripe/android/view/CountryTextInputLayout;", "getCountryLayout$payments_core_release$annotations", "Lcom/stripe/android/databinding/StripeBillingAddressLayoutBinding;", "viewBinding", "Lcom/stripe/android/databinding/StripeBillingAddressLayoutBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "BillingAddressCollectionLevel", "PostalCodeConfig", "PostalCodeViewListener", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BillingAddressView.kt */
public final class BillingAddressView extends FrameLayout {
    public static final /* synthetic */ k[] $$delegatedProperties = {a.o1(BillingAddressView.class, "level", "getLevel$payments_core_release()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;", 0), a.o1(BillingAddressView.class, "postalCodeConfig", "getPostalCodeConfig()Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", 0)};
    /* access modifiers changed from: private */
    public final y<Address> _address;
    private final LiveData<Address> address;
    private final TextInputEditText address1View;
    private final TextInputEditText address2View;
    private final Set<EditText> allFields;
    private final TextInputLayout cityLayout;
    private final LinearLayout cityPostalContainer;
    private final TextInputEditText cityView;
    private final CountryTextInputLayout countryLayout;
    private final AutoCompleteTextView countryView;
    private final d level$delegate;
    private final l<CountryCode, i> newCountryCodeCallback;
    private m0.n.a.a<i> onFocus;
    private final d postalCodeConfig$delegate;
    private final TextInputLayout postalCodeLayout;
    /* access modifiers changed from: private */
    public final PostalCodeValidator postalCodeValidator;
    private final StripeEditText postalCodeView;
    private PostalCodeViewListener postalCodeViewListener;
    private final Set<View> requiredViews;
    private final TextInputLayout stateLayout;
    private final TextInputEditText stateView;
    private final StripeBillingAddressLayoutBinding viewBinding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$BillingAddressCollectionLevel;", "", "<init>", "(Ljava/lang/String;I)V", "Automatic", "Required", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BillingAddressView.kt */
    public enum BillingAddressCollectionLevel {
        Automatic,
        Required
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\r\u000eB\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u00020\u00058&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "", "Landroid/text/method/KeyListener;", "getKeyListener", "()Landroid/text/method/KeyListener;", "", "getInputType", "()I", "inputType", "getMaxLength", "maxLength", "<init>", "()V", "Global", "UnitedStates", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$UnitedStates;", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BillingAddressView.kt */
    public static abstract class PostalCodeConfig {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\u00020\u00058\u0016@\u0016XD¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u00058\u0016@\u0016XD¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$Global;", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "Landroid/text/method/KeyListener;", "getKeyListener", "()Landroid/text/method/KeyListener;", "", "maxLength", "I", "getMaxLength", "()I", "inputType", "getInputType", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: BillingAddressView.kt */
        public static final class Global extends PostalCodeConfig {
            public static final Global INSTANCE = new Global();
            private static final int inputType = 112;
            private static final int maxLength = 13;

            private Global() {
                super((f) null);
            }

            public int getInputType() {
                return inputType;
            }

            public KeyListener getKeyListener() {
                TextKeyListener instance = TextKeyListener.getInstance();
                m0.n.b.i.d(instance, "TextKeyListener.getInstance()");
                return instance;
            }

            public int getMaxLength() {
                return maxLength;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\u00020\u00058\u0016@\u0016XD¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00020\u00058\u0016@\u0016XD¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig$UnitedStates;", "Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeConfig;", "Landroid/text/method/KeyListener;", "getKeyListener", "()Landroid/text/method/KeyListener;", "", "maxLength", "I", "getMaxLength", "()I", "inputType", "getInputType", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: BillingAddressView.kt */
        public static final class UnitedStates extends PostalCodeConfig {
            public static final UnitedStates INSTANCE = new UnitedStates();
            private static final int inputType = 2;
            private static final int maxLength = 5;

            private UnitedStates() {
                super((f) null);
            }

            public int getInputType() {
                return inputType;
            }

            public KeyListener getKeyListener() {
                DigitsKeyListener instance = DigitsKeyListener.getInstance(false, true);
                m0.n.b.i.d(instance, "DigitsKeyListener.getInstance(false, true)");
                return instance;
            }

            public int getMaxLength() {
                return maxLength;
            }
        }

        private PostalCodeConfig() {
        }

        public abstract int getInputType();

        public abstract KeyListener getKeyListener();

        public abstract int getMaxLength();

        public /* synthetic */ PostalCodeConfig(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\bJ!\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BillingAddressView$PostalCodeViewListener;", "", "Lcom/stripe/android/view/Country;", "country", "", "isPostalValid", "Lm0/i;", "onLosingFocus", "(Lcom/stripe/android/view/Country;Z)V", "onGainingFocus", "onCountryChanged", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BillingAddressView.kt */
    public interface PostalCodeViewListener {
        void onCountryChanged(Country country, boolean z);

        void onGainingFocus(Country country, boolean z);

        void onLosingFocus(Country country, boolean z);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            BillingAddressCollectionLevel.values();
            int[] iArr = new int[2];
            $EnumSwitchMapping$0 = iArr;
            BillingAddressCollectionLevel billingAddressCollectionLevel = BillingAddressCollectionLevel.Automatic;
            iArr[billingAddressCollectionLevel.ordinal()] = 1;
            BillingAddressCollectionLevel billingAddressCollectionLevel2 = BillingAddressCollectionLevel.Required;
            iArr[billingAddressCollectionLevel2.ordinal()] = 2;
            BillingAddressCollectionLevel.values();
            int[] iArr2 = new int[2];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[billingAddressCollectionLevel.ordinal()] = 1;
            iArr2[billingAddressCollectionLevel2.ordinal()] = 2;
            BillingAddressCollectionLevel.values();
            int[] iArr3 = new int[2];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[billingAddressCollectionLevel.ordinal()] = 1;
            iArr3[billingAddressCollectionLevel2.ordinal()] = 2;
        }
    }

    public BillingAddressView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public BillingAddressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BillingAddressView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* access modifiers changed from: private */
    public final void configureForLevel() {
        int ordinal = getLevel$payments_core_release().ordinal();
        if (ordinal == 0) {
            for (View view : this.requiredViews) {
                m0.n.b.i.d(view, "it");
                view.setVisibility(8);
            }
        } else if (ordinal == 1) {
            for (View view2 : this.requiredViews) {
                m0.n.b.i.d(view2, "it");
                view2.setVisibility(0);
            }
        }
        this._address.setValue(createAddress());
    }

    /* access modifiers changed from: private */
    public final Address createAddress() {
        Address address2;
        CountryCode selectedCountryCode = this.countryLayout.getSelectedCountryCode();
        if (selectedCountryCode == null) {
            return null;
        }
        String value = getValue(this.postalCodeView);
        if (!this.postalCodeValidator.isValid(value != null ? value : "", selectedCountryCode.getValue())) {
            return null;
        }
        int ordinal = getLevel$payments_core_release().ordinal();
        if (ordinal == 0) {
            address2 = new Address.Builder().setCountryCode$payments_core_release(selectedCountryCode).setPostalCode(value).build();
        } else if (ordinal == 1) {
            address2 = createRequiredAddress(selectedCountryCode, value);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return address2;
    }

    private final Address createRequiredAddress(CountryCode countryCode, String str) {
        String value = getValue(this.address1View);
        String value2 = getValue(this.address2View);
        String value3 = getValue(this.cityView);
        String value4 = getValue(this.stateView);
        if (value == null || value3 == null) {
            return null;
        }
        if (!isUnitedStates()) {
            return new Address.Builder().setCountryCode$payments_core_release(countryCode).setPostalCode(str).setLine1(value).setLine2(value2).setCity(value3).build();
        }
        if (value4 != null) {
            return new Address.Builder().setCountryCode$payments_core_release(countryCode).setPostalCode(str).setLine1(value).setLine2(value2).setCity(value3).setState(value4).build();
        }
        return null;
    }

    public static /* synthetic */ void getAddress1View$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getAddress2View$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getCityLayout$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getCityPostalContainer$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getCityView$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getCountryLayout$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getCountryView$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getLevel$payments_core_release$annotations() {
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

    private final PostalCodeConfig getPostalCodeConfig() {
        return (PostalCodeConfig) this.postalCodeConfig$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public static /* synthetic */ void getPostalCodeLayout$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getPostalCodeView$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getPostalCodeViewListener$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getStateLayout$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getStateView$payments_core_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final String getValue(EditText editText) {
        Editable text;
        boolean z = true;
        if (!(editText.getVisibility() == 0)) {
            editText = null;
        }
        String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        if (obj != null && !StringsKt__IndentKt.o(obj)) {
            z = false;
        }
        if (!z) {
            return obj;
        }
        return null;
    }

    private final boolean isUnitedStates() {
        return CountryCode.Companion.isUS(this.countryLayout.getSelectedCountryCode());
    }

    private final void setPostalCodeConfig(PostalCodeConfig postalCodeConfig) {
        this.postalCodeConfig$delegate.setValue(this, $$delegatedProperties[1], postalCodeConfig);
    }

    /* access modifiers changed from: private */
    public final void updatePostalCodeView(CountryCode countryCode) {
        PostalCodeConfig postalCodeConfig;
        int i;
        boolean z = true;
        int i2 = 0;
        boolean z2 = countryCode == null || CountryUtils.INSTANCE.doesCountryUsePostalCode$payments_core_release(countryCode);
        this.postalCodeLayout.setVisibility(z2 ? 0 : 8);
        if (getLevel$payments_core_release() != BillingAddressCollectionLevel.Required && !z2) {
            z = false;
        }
        View view = this.viewBinding.cityPostalDivider;
        m0.n.b.i.d(view, "viewBinding.cityPostalDivider");
        view.setVisibility(z ? 0 : 8);
        LinearLayout linearLayout = this.viewBinding.cityPostalContainer;
        m0.n.b.i.d(linearLayout, "viewBinding.cityPostalContainer");
        if (!z) {
            i2 = 8;
        }
        linearLayout.setVisibility(i2);
        CountryCode.Companion companion = CountryCode.Companion;
        if (companion.isUS(countryCode)) {
            postalCodeConfig = PostalCodeConfig.UnitedStates.INSTANCE;
        } else {
            postalCodeConfig = PostalCodeConfig.Global.INSTANCE;
        }
        setPostalCodeConfig(postalCodeConfig);
        TextInputLayout textInputLayout = this.viewBinding.postalCodeLayout;
        m0.n.b.i.d(textInputLayout, "viewBinding.postalCodeLayout");
        Resources resources = getResources();
        if (companion.isUS(countryCode)) {
            i = R.string.acc_label_zip_short;
        } else {
            i = R.string.address_label_postal_code;
        }
        textInputLayout.setHint((CharSequence) resources.getString(i));
    }

    /* access modifiers changed from: private */
    public final void updateStateView(CountryCode countryCode) {
        int i;
        CountryCode.Companion companion = CountryCode.Companion;
        if (companion.isUS(countryCode)) {
            i = R.string.address_label_state;
        } else if (companion.isCA(countryCode)) {
            i = R.string.address_label_province;
        } else if (companion.isGB(countryCode)) {
            i = R.string.address_label_county;
        } else {
            i = R.string.address_label_region_generic;
        }
        this.stateLayout.setHint((CharSequence) getResources().getString(i));
    }

    public final void focusFirstField() {
        int ordinal = getLevel$payments_core_release().ordinal();
        if (ordinal == 0) {
            this.postalCodeLayout.requestFocus();
        } else if (ordinal == 1) {
            this.viewBinding.address1Layout.requestFocus();
        }
    }

    public final LiveData<Address> getAddress$payments_core_release() {
        return this.address;
    }

    public final TextInputEditText getAddress1View$payments_core_release() {
        return this.address1View;
    }

    public final TextInputEditText getAddress2View$payments_core_release() {
        return this.address2View;
    }

    public final TextInputLayout getCityLayout$payments_core_release() {
        return this.cityLayout;
    }

    public final LinearLayout getCityPostalContainer$payments_core_release() {
        return this.cityPostalContainer;
    }

    public final TextInputEditText getCityView$payments_core_release() {
        return this.cityView;
    }

    public final CountryTextInputLayout getCountryLayout$payments_core_release() {
        return this.countryLayout;
    }

    public final AutoCompleteTextView getCountryView$payments_core_release() {
        return this.countryView;
    }

    public final BillingAddressCollectionLevel getLevel$payments_core_release() {
        return (BillingAddressCollectionLevel) this.level$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final m0.n.a.a<i> getOnFocus$payments_core_release() {
        return this.onFocus;
    }

    public final TextInputLayout getPostalCodeLayout$payments_core_release() {
        return this.postalCodeLayout;
    }

    public final StripeEditText getPostalCodeView$payments_core_release() {
        return this.postalCodeView;
    }

    public final PostalCodeViewListener getPostalCodeViewListener$payments_core_release() {
        return this.postalCodeViewListener;
    }

    public final TextInputLayout getStateLayout$payments_core_release() {
        return this.stateLayout;
    }

    public final TextInputEditText getStateView$payments_core_release() {
        return this.stateView;
    }

    public final void populate$payments_core_release(Address address2) {
        if (address2 != null) {
            this.postalCodeView.setText(address2.getPostalCode());
            CountryCode countryCode$payments_core_release = address2.getCountryCode$payments_core_release();
            if (countryCode$payments_core_release != null) {
                this.countryLayout.setSelectedCountryCode(countryCode$payments_core_release);
                this.countryView.setText(CountryUtils.INSTANCE.getDisplayCountry(countryCode$payments_core_release, getLocale()));
            }
            this.address1View.setText(address2.getLine1());
            this.address2View.setText(address2.getLine2());
            this.cityView.setText(address2.getCity());
            this.stateView.setText(address2.getState());
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        StripeBillingAddressLayoutBinding stripeBillingAddressLayoutBinding = this.viewBinding;
        for (TextInputLayout textInputLayout : g.h0(this.countryLayout, stripeBillingAddressLayoutBinding.address1Layout, stripeBillingAddressLayoutBinding.address2Layout, stripeBillingAddressLayoutBinding.cityLayout, this.postalCodeLayout, this.stateLayout)) {
            m0.n.b.i.d(textInputLayout, "it");
            textInputLayout.setEnabled(z);
        }
    }

    public final void setLevel$payments_core_release(BillingAddressCollectionLevel billingAddressCollectionLevel) {
        m0.n.b.i.e(billingAddressCollectionLevel, "<set-?>");
        this.level$delegate.setValue(this, $$delegatedProperties[0], billingAddressCollectionLevel);
    }

    public final void setOnFocus$payments_core_release(m0.n.a.a<i> aVar) {
        m0.n.b.i.e(aVar, "<set-?>");
        this.onFocus = aVar;
    }

    public final void setPostalCodeViewListener$payments_core_release(PostalCodeViewListener postalCodeViewListener2) {
        this.postalCodeViewListener = postalCodeViewListener2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BillingAddressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m0.n.b.i.e(context, "context");
        BillingAddressCollectionLevel billingAddressCollectionLevel = BillingAddressCollectionLevel.Automatic;
        this.level$delegate = new BillingAddressView$$special$$inlined$observable$1(billingAddressCollectionLevel, billingAddressCollectionLevel, this);
        this.onFocus = BillingAddressView$onFocus$1.INSTANCE;
        StripeBillingAddressLayoutBinding inflate = StripeBillingAddressLayoutBinding.inflate(LayoutInflater.from(context), this);
        m0.n.b.i.d(inflate, "StripeBillingAddressLayo…text),\n        this\n    )");
        this.viewBinding = inflate;
        this.postalCodeValidator = new PostalCodeValidator();
        y<Address> yVar = new y<>(null);
        this._address = yVar;
        this.address = yVar;
        CountryTextInputLayout countryTextInputLayout = inflate.countryLayout;
        m0.n.b.i.d(countryTextInputLayout, "viewBinding.countryLayout");
        this.countryLayout = countryTextInputLayout;
        AutoCompleteTextView countryAutocomplete$payments_core_release = countryTextInputLayout.getCountryAutocomplete$payments_core_release();
        this.countryView = countryAutocomplete$payments_core_release;
        LinearLayout linearLayout = inflate.cityPostalContainer;
        m0.n.b.i.d(linearLayout, "viewBinding.cityPostalContainer");
        this.cityPostalContainer = linearLayout;
        StripeEditText stripeEditText = inflate.postalCode;
        m0.n.b.i.d(stripeEditText, "viewBinding.postalCode");
        this.postalCodeView = stripeEditText;
        TextInputLayout textInputLayout = inflate.postalCodeLayout;
        m0.n.b.i.d(textInputLayout, "viewBinding.postalCodeLayout");
        this.postalCodeLayout = textInputLayout;
        TextInputEditText textInputEditText = inflate.address1;
        m0.n.b.i.d(textInputEditText, "viewBinding.address1");
        this.address1View = textInputEditText;
        TextInputEditText textInputEditText2 = inflate.address2;
        m0.n.b.i.d(textInputEditText2, "viewBinding.address2");
        this.address2View = textInputEditText2;
        TextInputLayout textInputLayout2 = inflate.cityLayout;
        m0.n.b.i.d(textInputLayout2, "viewBinding.cityLayout");
        this.cityLayout = textInputLayout2;
        TextInputEditText textInputEditText3 = inflate.city;
        m0.n.b.i.d(textInputEditText3, "viewBinding.city");
        this.cityView = textInputEditText3;
        TextInputEditText textInputEditText4 = inflate.state;
        m0.n.b.i.d(textInputEditText4, "viewBinding.state");
        this.stateView = textInputEditText4;
        TextInputLayout textInputLayout3 = inflate.stateLayout;
        m0.n.b.i.d(textInputLayout3, "viewBinding.stateLayout");
        this.stateLayout = textInputLayout3;
        PostalCodeConfig.Global global = PostalCodeConfig.Global.INSTANCE;
        this.postalCodeConfig$delegate = new BillingAddressView$$special$$inlined$observable$2(global, global, this);
        BillingAddressView$newCountryCodeCallback$1 billingAddressView$newCountryCodeCallback$1 = new BillingAddressView$newCountryCodeCallback$1(this);
        this.newCountryCodeCallback = billingAddressView$newCountryCodeCallback$1;
        this.requiredViews = g.h0(inflate.address1Divider, inflate.address1Layout, textInputEditText, inflate.address2Divider, inflate.address2Layout, textInputEditText2, inflate.cityLayout, textInputEditText3, inflate.stateDivider, textInputLayout3, textInputEditText4);
        Set<EditText> h02 = g.h0(textInputEditText, textInputEditText2, textInputEditText3, textInputEditText4, stripeEditText, countryAutocomplete$payments_core_release);
        this.allFields = h02;
        countryTextInputLayout.setCountryCodeChangeCallback$payments_core_release(billingAddressView$newCountryCodeCallback$1);
        CountryCode selectedCountryCode = countryTextInputLayout.getSelectedCountryCode();
        if (selectedCountryCode != null) {
            billingAddressView$newCountryCodeCallback$1.invoke(selectedCountryCode);
        }
        configureForLevel();
        for (EditText editText : h02) {
            editText.addTextChangedListener(new BillingAddressView$$special$$inlined$forEach$lambda$1(this));
            editText.setOnFocusChangeListener(new BillingAddressView$$special$$inlined$forEach$lambda$2(this));
        }
        this.postalCodeView.getInternalFocusChangeListeners$payments_core_release().add(new View.OnFocusChangeListener(this) {
            public final /* synthetic */ BillingAddressView this$0;

            {
                this.this$0 = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
            /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onFocusChange(android.view.View r6, boolean r7) {
                /*
                    r5 = this;
                    com.stripe.android.paymentsheet.ui.BillingAddressView r6 = r5.this$0
                    com.stripe.android.view.CountryTextInputLayout r6 = r6.getCountryLayout$payments_core_release()
                    com.stripe.android.model.CountryCode r6 = r6.getSelectedCountryCode()
                    r0 = 0
                    if (r6 == 0) goto L_0x002b
                    com.stripe.android.paymentsheet.ui.BillingAddressView r1 = r5.this$0
                    com.stripe.android.view.PostalCodeValidator r1 = r1.postalCodeValidator
                    com.stripe.android.paymentsheet.ui.BillingAddressView r2 = r5.this$0
                    com.stripe.android.view.StripeEditText r3 = r2.getPostalCodeView$payments_core_release()
                    java.lang.String r2 = r2.getValue(r3)
                    if (r2 == 0) goto L_0x0020
                    goto L_0x0022
                L_0x0020:
                    java.lang.String r2 = ""
                L_0x0022:
                    java.lang.String r6 = r6.getValue()
                    boolean r6 = r1.isValid(r2, r6)
                    goto L_0x002c
                L_0x002b:
                    r6 = r0
                L_0x002c:
                    com.stripe.android.paymentsheet.ui.BillingAddressView r1 = r5.this$0
                    com.stripe.android.view.StripeEditText r1 = r1.getPostalCodeView$payments_core_release()
                    r2 = 1
                    if (r7 != 0) goto L_0x0051
                    com.stripe.android.paymentsheet.ui.BillingAddressView r3 = r5.this$0
                    com.stripe.android.view.StripeEditText r4 = r3.getPostalCodeView$payments_core_release()
                    java.lang.String r3 = r3.getValue(r4)
                    if (r3 == 0) goto L_0x004a
                    boolean r3 = kotlin.text.StringsKt__IndentKt.o(r3)
                    if (r3 == 0) goto L_0x0048
                    goto L_0x004a
                L_0x0048:
                    r3 = r0
                    goto L_0x004b
                L_0x004a:
                    r3 = r2
                L_0x004b:
                    if (r3 != 0) goto L_0x0051
                    if (r6 != 0) goto L_0x0051
                    r3 = r2
                    goto L_0x0052
                L_0x0051:
                    r3 = r0
                L_0x0052:
                    r1.setShouldShowError(r3)
                    r1 = 0
                    if (r7 == 0) goto L_0x007c
                    com.stripe.android.paymentsheet.ui.BillingAddressView r7 = r5.this$0
                    com.stripe.android.paymentsheet.ui.BillingAddressView$PostalCodeViewListener r7 = r7.getPostalCodeViewListener$payments_core_release()
                    if (r7 == 0) goto L_0x00c3
                    com.stripe.android.paymentsheet.ui.BillingAddressView r0 = r5.this$0
                    com.stripe.android.view.CountryTextInputLayout r0 = r0.getCountryLayout$payments_core_release()
                    com.stripe.android.model.CountryCode r0 = r0.getSelectedCountryCode()
                    if (r0 == 0) goto L_0x0078
                    com.stripe.android.view.CountryUtils r1 = com.stripe.android.view.CountryUtils.INSTANCE
                    com.stripe.android.paymentsheet.ui.BillingAddressView r2 = r5.this$0
                    java.util.Locale r2 = r2.getLocale()
                    com.stripe.android.view.Country r1 = r1.getCountryByCode$payments_core_release(r0, r2)
                L_0x0078:
                    r7.onGainingFocus(r1, r6)
                    goto L_0x00c3
                L_0x007c:
                    com.stripe.android.paymentsheet.ui.BillingAddressView r7 = r5.this$0
                    com.stripe.android.paymentsheet.ui.BillingAddressView$PostalCodeViewListener r7 = r7.getPostalCodeViewListener$payments_core_release()
                    if (r7 == 0) goto L_0x009f
                    com.stripe.android.paymentsheet.ui.BillingAddressView r3 = r5.this$0
                    com.stripe.android.view.CountryTextInputLayout r3 = r3.getCountryLayout$payments_core_release()
                    com.stripe.android.model.CountryCode r3 = r3.getSelectedCountryCode()
                    if (r3 == 0) goto L_0x009c
                    com.stripe.android.view.CountryUtils r1 = com.stripe.android.view.CountryUtils.INSTANCE
                    com.stripe.android.paymentsheet.ui.BillingAddressView r4 = r5.this$0
                    java.util.Locale r4 = r4.getLocale()
                    com.stripe.android.view.Country r1 = r1.getCountryByCode$payments_core_release(r3, r4)
                L_0x009c:
                    r7.onLosingFocus(r1, r6)
                L_0x009f:
                    com.stripe.android.paymentsheet.ui.BillingAddressView r7 = r5.this$0
                    com.stripe.android.view.StripeEditText r7 = r7.getPostalCodeView$payments_core_release()
                    com.stripe.android.paymentsheet.ui.BillingAddressView r1 = r5.this$0
                    com.stripe.android.view.StripeEditText r3 = r1.getPostalCodeView$payments_core_release()
                    java.lang.String r1 = r1.getValue(r3)
                    if (r1 == 0) goto L_0x00ba
                    boolean r1 = kotlin.text.StringsKt__IndentKt.o(r1)
                    if (r1 == 0) goto L_0x00b8
                    goto L_0x00ba
                L_0x00b8:
                    r1 = r0
                    goto L_0x00bb
                L_0x00ba:
                    r1 = r2
                L_0x00bb:
                    if (r1 != 0) goto L_0x00c0
                    if (r6 != 0) goto L_0x00c0
                    r0 = r2
                L_0x00c0:
                    r7.setShouldShowError(r0)
                L_0x00c3:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.ui.BillingAddressView.AnonymousClass3.onFocusChange(android.view.View, boolean):void");
            }
        });
    }
}
