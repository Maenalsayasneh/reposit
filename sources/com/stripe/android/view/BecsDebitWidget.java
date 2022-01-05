package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.databinding.BecsDebitWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.BecsDebitBanks;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.c;
import m0.j.g;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001%B1\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u00138F@\u0006¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178@@\u0000X\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, d2 = {"Lcom/stripe/android/view/BecsDebitWidget;", "Landroid/widget/FrameLayout;", "Lm0/i;", "verifyCompanyName", "()V", "Landroid/util/AttributeSet;", "attrs", "applyAttributes", "(Landroid/util/AttributeSet;)V", "", "isInputValid", "()Z", "Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "validParamsCallback", "Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "getValidParamsCallback", "()Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "setValidParamsCallback", "(Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;)V", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getParams", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "params", "Lcom/stripe/android/databinding/BecsDebitWidgetBinding;", "viewBinding$delegate", "Lm0/c;", "getViewBinding$payments_core_release", "()Lcom/stripe/android/databinding/BecsDebitWidgetBinding;", "viewBinding", "Landroid/content/Context;", "context", "", "defStyleAttr", "", "companyName", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILjava/lang/String;)V", "ValidParamsCallback", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BecsDebitWidget.kt */
public final class BecsDebitWidget extends FrameLayout {
    private ValidParamsCallback validParamsCallback;
    private final c viewBinding$delegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/BecsDebitWidget$ValidParamsCallback;", "", "", "isValid", "Lm0/i;", "onInputChanged", "(Z)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BecsDebitWidget.kt */
    public interface ValidParamsCallback {
        void onInputChanged(boolean z);
    }

    public BecsDebitWidget(Context context) {
        this(context, (AttributeSet) null, 0, (String) null, 14, (f) null);
    }

    public BecsDebitWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (String) null, 12, (f) null);
    }

    public BecsDebitWidget(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (String) null, 8, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BecsDebitWidget(Context context, AttributeSet attributeSet, int i, String str, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str);
    }

    private final void applyAttributes(AttributeSet attributeSet) {
        Context context = getContext();
        i.d(context, "context");
        int[] iArr = R.styleable.BecsDebitWidget;
        i.d(iArr, "R.styleable.BecsDebitWidget");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        String string = obtainStyledAttributes.getString(R.styleable.BecsDebitWidget_companyName);
        if (string != null) {
            BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView = getViewBinding$payments_core_release().mandateAcceptanceTextView;
            i.d(string, "companyName");
            becsDebitMandateAcceptanceTextView.setCompanyName(string);
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: private */
    public final boolean isInputValid() {
        String fieldText$payments_core_release = getViewBinding$payments_core_release().nameEditText.getFieldText$payments_core_release();
        String email = getViewBinding$payments_core_release().emailEditText.getEmail();
        String bsb$payments_core_release = getViewBinding$payments_core_release().bsbEditText.getBsb$payments_core_release();
        String accountNumber = getViewBinding$payments_core_release().accountNumberEditText.getAccountNumber();
        if (!StringsKt__IndentKt.o(fieldText$payments_core_release)) {
            if (!(email == null || StringsKt__IndentKt.o(email))) {
                if (!(bsb$payments_core_release == null || StringsKt__IndentKt.o(bsb$payments_core_release))) {
                    if (!(accountNumber == null || StringsKt__IndentKt.o(accountNumber))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final void verifyCompanyName() {
        if (!getViewBinding$payments_core_release().mandateAcceptanceTextView.isValid$payments_core_release()) {
            throw new IllegalArgumentException("A company name is required to render a BecsDebitWidget.".toString());
        }
    }

    public final PaymentMethodCreateParams getParams() {
        String fieldText$payments_core_release = getViewBinding$payments_core_release().nameEditText.getFieldText$payments_core_release();
        String email = getViewBinding$payments_core_release().emailEditText.getEmail();
        String bsb$payments_core_release = getViewBinding$payments_core_release().bsbEditText.getBsb$payments_core_release();
        String accountNumber = getViewBinding$payments_core_release().accountNumberEditText.getAccountNumber();
        getViewBinding$payments_core_release().nameEditText.setShouldShowError(StringsKt__IndentKt.o(fieldText$payments_core_release));
        boolean z = false;
        getViewBinding$payments_core_release().emailEditText.setShouldShowError(email == null || StringsKt__IndentKt.o(email));
        getViewBinding$payments_core_release().bsbEditText.setShouldShowError(bsb$payments_core_release == null || StringsKt__IndentKt.o(bsb$payments_core_release));
        getViewBinding$payments_core_release().accountNumberEditText.setShouldShowError(accountNumber == null || StringsKt__IndentKt.o(accountNumber));
        if (StringsKt__IndentKt.o(fieldText$payments_core_release)) {
            return null;
        }
        if (email == null || StringsKt__IndentKt.o(email)) {
            return null;
        }
        if (bsb$payments_core_release == null || StringsKt__IndentKt.o(bsb$payments_core_release)) {
            return null;
        }
        if (accountNumber == null || StringsKt__IndentKt.o(accountNumber)) {
            z = true;
        }
        if (z) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, new PaymentMethodCreateParams.AuBecsDebit(bsb$payments_core_release, accountNumber), new PaymentMethod.BillingDetails((Address) null, email, fieldText$payments_core_release, (String) null, 9, (f) null), (Map) null, 4, (Object) null);
    }

    public final ValidParamsCallback getValidParamsCallback() {
        return this.validParamsCallback;
    }

    public final BecsDebitWidgetBinding getViewBinding$payments_core_release() {
        return (BecsDebitWidgetBinding) this.viewBinding$delegate.getValue();
    }

    public final void setValidParamsCallback(ValidParamsCallback validParamsCallback2) {
        i.e(validParamsCallback2, "<set-?>");
        this.validParamsCallback = validParamsCallback2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BecsDebitWidget(Context context, AttributeSet attributeSet, int i, String str) {
        super(context, attributeSet, i);
        i.e(context, "context");
        i.e(str, "companyName");
        this.viewBinding$delegate = h.H2(new BecsDebitWidget$viewBinding$2(this, context));
        this.validParamsCallback = new BecsDebitWidget$validParamsCallback$1();
        if (Build.VERSION.SDK_INT >= 26) {
            getViewBinding$payments_core_release().nameEditText.setAutofillHints(new String[]{"name"});
            getViewBinding$payments_core_release().emailEditText.setAutofillHints(new String[]{"emailAddress"});
        }
        for (StripeEditText stripeEditText : g.h0(getViewBinding$payments_core_release().nameEditText, getViewBinding$payments_core_release().emailEditText, getViewBinding$payments_core_release().bsbEditText, getViewBinding$payments_core_release().accountNumberEditText)) {
            i.d(stripeEditText, "field");
            stripeEditText.addTextChangedListener(new BecsDebitWidget$$special$$inlined$forEach$lambda$1(this));
        }
        getViewBinding$payments_core_release().bsbEditText.setOnBankChangedCallback(new l<BecsDebitBanks.Bank, m0.i>(this) {
            public final /* synthetic */ BecsDebitWidget this$0;

            {
                this.this$0 = r1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((BecsDebitBanks.Bank) obj);
                return m0.i.a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:29:0x0090, code lost:
                if (r0.equals("73") != false) goto L_0x00af;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:31:0x0099, code lost:
                if (r0.equals("08") != false) goto L_0x00c4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ad, code lost:
                if (r0.equals("03") != false) goto L_0x00af;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
                if (r0.equals("01") != false) goto L_0x00c4;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
                if (r0.equals("00") != false) goto L_0x00c4;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void invoke(com.stripe.android.view.BecsDebitBanks.Bank r5) {
                /*
                    r4 = this;
                    r0 = 0
                    java.lang.String r1 = "viewBinding.bsbTextInputLayout"
                    if (r5 == 0) goto L_0x0027
                    com.stripe.android.view.BecsDebitWidget r2 = r4.this$0
                    com.stripe.android.databinding.BecsDebitWidgetBinding r2 = r2.getViewBinding$payments_core_release()
                    com.google.android.material.textfield.TextInputLayout r2 = r2.bsbTextInputLayout
                    m0.n.b.i.d(r2, r1)
                    java.lang.String r3 = r5.getName$payments_core_release()
                    r2.setHelperText(r3)
                    com.stripe.android.view.BecsDebitWidget r2 = r4.this$0
                    com.stripe.android.databinding.BecsDebitWidgetBinding r2 = r2.getViewBinding$payments_core_release()
                    com.google.android.material.textfield.TextInputLayout r2 = r2.bsbTextInputLayout
                    m0.n.b.i.d(r2, r1)
                    r1 = 1
                    r2.setHelperTextEnabled(r1)
                    goto L_0x0044
                L_0x0027:
                    com.stripe.android.view.BecsDebitWidget r2 = r4.this$0
                    com.stripe.android.databinding.BecsDebitWidgetBinding r2 = r2.getViewBinding$payments_core_release()
                    com.google.android.material.textfield.TextInputLayout r2 = r2.bsbTextInputLayout
                    m0.n.b.i.d(r2, r1)
                    r2.setHelperText(r0)
                    com.stripe.android.view.BecsDebitWidget r2 = r4.this$0
                    com.stripe.android.databinding.BecsDebitWidgetBinding r2 = r2.getViewBinding$payments_core_release()
                    com.google.android.material.textfield.TextInputLayout r2 = r2.bsbTextInputLayout
                    m0.n.b.i.d(r2, r1)
                    r1 = 0
                    r2.setHelperTextEnabled(r1)
                L_0x0044:
                    com.stripe.android.view.BecsDebitWidget r1 = r4.this$0
                    com.stripe.android.databinding.BecsDebitWidgetBinding r1 = r1.getViewBinding$payments_core_release()
                    com.stripe.android.view.BecsDebitAccountNumberEditText r1 = r1.accountNumberEditText
                    if (r5 == 0) goto L_0x0059
                    java.lang.String r5 = r5.getPrefix$payments_core_release()
                    if (r5 == 0) goto L_0x0059
                    r0 = 2
                    java.lang.String r0 = m0.r.t.a.r.m.a1.a.S3(r5, r0)
                L_0x0059:
                    r5 = 9
                    if (r0 != 0) goto L_0x005f
                    goto L_0x00c3
                L_0x005f:
                    int r2 = r0.hashCode()
                    r3 = 1536(0x600, float:2.152E-42)
                    if (r2 == r3) goto L_0x00ba
                    r3 = 1537(0x601, float:2.154E-42)
                    if (r2 == r3) goto L_0x00b1
                    r3 = 1539(0x603, float:2.157E-42)
                    if (r2 == r3) goto L_0x00a7
                    r3 = 1542(0x606, float:2.161E-42)
                    if (r2 == r3) goto L_0x009c
                    r3 = 1544(0x608, float:2.164E-42)
                    if (r2 == r3) goto L_0x0093
                    r5 = 1756(0x6dc, float:2.46E-42)
                    if (r2 == r5) goto L_0x008a
                    r5 = 1784(0x6f8, float:2.5E-42)
                    if (r2 == r5) goto L_0x0080
                    goto L_0x00c3
                L_0x0080:
                    java.lang.String r5 = "80"
                    boolean r5 = r0.equals(r5)
                    if (r5 == 0) goto L_0x00c3
                    r5 = 4
                    goto L_0x00c4
                L_0x008a:
                    java.lang.String r5 = "73"
                    boolean r5 = r0.equals(r5)
                    if (r5 == 0) goto L_0x00c3
                    goto L_0x00af
                L_0x0093:
                    java.lang.String r2 = "08"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x00c3
                    goto L_0x00c4
                L_0x009c:
                    java.lang.String r5 = "06"
                    boolean r5 = r0.equals(r5)
                    if (r5 == 0) goto L_0x00c3
                    r5 = 8
                    goto L_0x00c4
                L_0x00a7:
                    java.lang.String r5 = "03"
                    boolean r5 = r0.equals(r5)
                    if (r5 == 0) goto L_0x00c3
                L_0x00af:
                    r5 = 6
                    goto L_0x00c4
                L_0x00b1:
                    java.lang.String r2 = "01"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x00c3
                    goto L_0x00c4
                L_0x00ba:
                    java.lang.String r2 = "00"
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x00c3
                    goto L_0x00c4
                L_0x00c3:
                    r5 = 5
                L_0x00c4:
                    r1.setMinLength(r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.BecsDebitWidget.AnonymousClass2.invoke(com.stripe.android.view.BecsDebitBanks$Bank):void");
            }
        });
        getViewBinding$payments_core_release().bsbEditText.setOnCompletedCallback(new a<m0.i>(this) {
            public final /* synthetic */ BecsDebitWidget this$0;

            {
                this.this$0 = r1;
            }

            public final void invoke() {
                this.this$0.getViewBinding$payments_core_release().accountNumberTextInputLayout.requestFocus();
            }
        });
        EmailEditText emailEditText = getViewBinding$payments_core_release().emailEditText;
        StripeEditText stripeEditText2 = getViewBinding$payments_core_release().nameEditText;
        i.d(stripeEditText2, "viewBinding.nameEditText");
        emailEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(stripeEditText2));
        BecsDebitBsbEditText becsDebitBsbEditText = getViewBinding$payments_core_release().bsbEditText;
        EmailEditText emailEditText2 = getViewBinding$payments_core_release().emailEditText;
        i.d(emailEditText2, "viewBinding.emailEditText");
        becsDebitBsbEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(emailEditText2));
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText = getViewBinding$payments_core_release().accountNumberEditText;
        BecsDebitBsbEditText becsDebitBsbEditText2 = getViewBinding$payments_core_release().bsbEditText;
        i.d(becsDebitBsbEditText2, "viewBinding.bsbEditText");
        becsDebitAccountNumberEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(becsDebitBsbEditText2));
        getViewBinding$payments_core_release().nameEditText.setErrorMessage$payments_core_release(getResources().getString(R.string.becs_widget_name_required));
        StripeEditText stripeEditText3 = getViewBinding$payments_core_release().nameEditText;
        TextInputLayout textInputLayout = getViewBinding$payments_core_release().nameTextInputLayout;
        i.d(textInputLayout, "viewBinding.nameTextInputLayout");
        stripeEditText3.setErrorMessageListener(new ErrorListener(textInputLayout));
        EmailEditText emailEditText3 = getViewBinding$payments_core_release().emailEditText;
        TextInputLayout textInputLayout2 = getViewBinding$payments_core_release().emailTextInputLayout;
        i.d(textInputLayout2, "viewBinding.emailTextInputLayout");
        emailEditText3.setErrorMessageListener(new ErrorListener(textInputLayout2));
        BecsDebitBsbEditText becsDebitBsbEditText3 = getViewBinding$payments_core_release().bsbEditText;
        TextInputLayout textInputLayout3 = getViewBinding$payments_core_release().bsbTextInputLayout;
        i.d(textInputLayout3, "viewBinding.bsbTextInputLayout");
        becsDebitBsbEditText3.setErrorMessageListener(new ErrorListener(textInputLayout3));
        BecsDebitAccountNumberEditText becsDebitAccountNumberEditText2 = getViewBinding$payments_core_release().accountNumberEditText;
        TextInputLayout textInputLayout4 = getViewBinding$payments_core_release().accountNumberTextInputLayout;
        i.d(textInputLayout4, "viewBinding.accountNumberTextInputLayout");
        becsDebitAccountNumberEditText2.setErrorMessageListener(new ErrorListener(textInputLayout4));
        for (StripeEditText stripeEditText4 : g.h0(getViewBinding$payments_core_release().nameEditText, getViewBinding$payments_core_release().emailEditText)) {
            i.d(stripeEditText4, "field");
            stripeEditText4.addTextChangedListener(new BecsDebitWidget$$special$$inlined$doAfterTextChanged$2(stripeEditText4));
        }
        str = !(StringsKt__IndentKt.o(str) ^ true) ? null : str;
        if (str != null) {
            getViewBinding$payments_core_release().mandateAcceptanceTextView.setCompanyName(str);
        }
        applyAttributes(attributeSet);
        verifyCompanyName();
    }
}
