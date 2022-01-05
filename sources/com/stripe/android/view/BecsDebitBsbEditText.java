package com.stripe.android.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.appcompat.R;
import com.stripe.android.view.BecsDebitBanks;
import kotlin.Metadata;
import m0.i;
import m0.j.g;
import m0.n.a.a;
import m0.n.a.l;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B'\b\u0007\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR0\u0010\u0010\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00040\u000e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00028B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000f8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006-"}, d2 = {"Lcom/stripe/android/view/BecsDebitBsbEditText;", "Lcom/stripe/android/view/StripeEditText;", "", "isError", "Lm0/i;", "updateIcon", "(Z)V", "", "bsb", "formatBsb", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/stripe/android/view/BecsDebitBanks;", "banks", "Lcom/stripe/android/view/BecsDebitBanks;", "Lkotlin/Function1;", "Lcom/stripe/android/view/BecsDebitBanks$Bank;", "onBankChangedCallback", "Lm0/n/a/l;", "getOnBankChangedCallback", "()Lm0/n/a/l;", "setOnBankChangedCallback", "(Lm0/n/a/l;)V", "isComplete", "()Z", "getBank", "()Lcom/stripe/android/view/BecsDebitBanks$Bank;", "bank", "getBsb$payments_core_release", "()Ljava/lang/String;", "Lkotlin/Function0;", "onCompletedCallback", "Lm0/n/a/a;", "getOnCompletedCallback", "()Lm0/n/a/a;", "setOnCompletedCallback", "(Lm0/n/a/a;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BecsDebitBsbEditText.kt */
public final class BecsDebitBsbEditText extends StripeEditText {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final int MAX_LENGTH = 7;
    @Deprecated
    private static final int MIN_VALIDATION_THRESHOLD = 2;
    @Deprecated
    private static final String SEPARATOR = "-";
    private final BecsDebitBanks banks;
    private l<? super BecsDebitBanks.Bank, i> onBankChangedCallback;
    private a<i> onCompletedCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/BecsDebitBsbEditText$Companion;", "", "", "MAX_LENGTH", "I", "MIN_VALIDATION_THRESHOLD", "", "SEPARATOR", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BecsDebitBsbEditText.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public BecsDebitBsbEditText(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BecsDebitBsbEditText(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    /* access modifiers changed from: private */
    public final String formatBsb(String str) {
        if (str.length() < 3) {
            return str;
        }
        return g.E(g.K(m0.r.t.a.r.m.a1.a.S3(str, 3), m0.r.t.a.r.m.a1.a.U3(str, str.length() - 3)), SEPARATOR, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62);
    }

    /* access modifiers changed from: private */
    public final BecsDebitBanks.Bank getBank() {
        return this.banks.byPrefix(getFieldText$payments_core_release());
    }

    /* access modifiers changed from: private */
    public final boolean isComplete() {
        return getBank() != null && getFieldText$payments_core_release().length() == 7;
    }

    /* access modifiers changed from: private */
    public final void updateIcon(boolean z) {
        int i;
        if (z) {
            i = com.stripe.android.R.drawable.stripe_ic_bank_error;
        } else {
            i = com.stripe.android.R.drawable.stripe_ic_bank;
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
    }

    public final String getBsb$payments_core_release() {
        String str;
        if (getFieldText$payments_core_release().length() < 2) {
            str = getResources().getString(com.stripe.android.R.string.becs_widget_bsb_incomplete);
        } else if (getBank() == null) {
            str = getResources().getString(com.stripe.android.R.string.becs_widget_bsb_invalid);
        } else {
            str = getFieldText$payments_core_release().length() < 7 ? getResources().getString(com.stripe.android.R.string.becs_widget_bsb_incomplete) : null;
        }
        setErrorMessage$payments_core_release(str);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        StringBuilder sb = new StringBuilder();
        int length = fieldText$payments_core_release.length();
        for (int i = 0; i < length; i++) {
            char charAt = fieldText$payments_core_release.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        m0.n.b.i.d(sb2, "filterTo(StringBuilder(), predicate).toString()");
        if (isComplete()) {
            return sb2;
        }
        return null;
    }

    public final l<BecsDebitBanks.Bank, i> getOnBankChangedCallback() {
        return this.onBankChangedCallback;
    }

    public final a<i> getOnCompletedCallback() {
        return this.onCompletedCallback;
    }

    public final void setOnBankChangedCallback(l<? super BecsDebitBanks.Bank, i> lVar) {
        m0.n.b.i.e(lVar, "<set-?>");
        this.onBankChangedCallback = lVar;
    }

    public final void setOnCompletedCallback(a<i> aVar) {
        m0.n.b.i.e(aVar, "<set-?>");
        this.onCompletedCallback = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BecsDebitBsbEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m0.n.b.i.e(context, "context");
        this.banks = new BecsDebitBanks(context, false, 2, (f) null);
        this.onBankChangedCallback = BecsDebitBsbEditText$onBankChangedCallback$1.INSTANCE;
        this.onCompletedCallback = BecsDebitBsbEditText$onCompletedCallback$1.INSTANCE;
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(7)});
        setInputType(2);
        addTextChangedListener(new StripeTextWatcher(this) {
            private String formattedBsb;
            private boolean ignoreChanges;
            private Integer newCursorPosition;
            public final /* synthetic */ BecsDebitBsbEditText this$0;

            {
                this.this$0 = r1;
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x0059  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
            /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void afterTextChanged(android.text.Editable r6) {
                /*
                    r5 = this;
                    boolean r6 = r5.ignoreChanges
                    if (r6 == 0) goto L_0x0005
                    return
                L_0x0005:
                    r6 = 1
                    r5.ignoreChanges = r6
                    com.stripe.android.view.BecsDebitBsbEditText r0 = r5.this$0
                    boolean r0 = r0.isLastKeyDelete()
                    r1 = 0
                    if (r0 != 0) goto L_0x0033
                    java.lang.String r0 = r5.formattedBsb
                    if (r0 == 0) goto L_0x0033
                    com.stripe.android.view.BecsDebitBsbEditText r2 = r5.this$0
                    r2.setText(r0)
                    java.lang.Integer r0 = r5.newCursorPosition
                    if (r0 == 0) goto L_0x0033
                    int r0 = r0.intValue()
                    com.stripe.android.view.BecsDebitBsbEditText r2 = r5.this$0
                    java.lang.String r3 = r2.getFieldText$payments_core_release()
                    int r3 = r3.length()
                    int r0 = m0.q.i.b(r0, r1, r3)
                    r2.setSelection(r0)
                L_0x0033:
                    r0 = 0
                    r5.formattedBsb = r0
                    r5.newCursorPosition = r0
                    r5.ignoreChanges = r1
                    com.stripe.android.view.BecsDebitBsbEditText r2 = r5.this$0
                    com.stripe.android.view.BecsDebitBanks$Bank r2 = r2.getBank()
                    if (r2 != 0) goto L_0x0054
                    com.stripe.android.view.BecsDebitBsbEditText r2 = r5.this$0
                    java.lang.String r2 = r2.getFieldText$payments_core_release()
                    int r2 = r2.length()
                    com.stripe.android.view.BecsDebitBsbEditText.Companion unused = com.stripe.android.view.BecsDebitBsbEditText.Companion
                    r3 = 2
                    if (r2 < r3) goto L_0x0054
                    r2 = r6
                    goto L_0x0055
                L_0x0054:
                    r2 = r1
                L_0x0055:
                    com.stripe.android.view.BecsDebitBsbEditText r3 = r5.this$0
                    if (r2 == 0) goto L_0x0063
                    android.content.res.Resources r0 = r3.getResources()
                    int r4 = com.stripe.android.R.string.becs_widget_bsb_invalid
                    java.lang.String r0 = r0.getString(r4)
                L_0x0063:
                    r3.setErrorMessage$payments_core_release(r0)
                    com.stripe.android.view.BecsDebitBsbEditText r0 = r5.this$0
                    java.lang.String r3 = r0.getErrorMessage$payments_core_release()
                    if (r3 == 0) goto L_0x006f
                    goto L_0x0070
                L_0x006f:
                    r6 = r1
                L_0x0070:
                    r0.setShouldShowError(r6)
                    com.stripe.android.view.BecsDebitBsbEditText r6 = r5.this$0
                    m0.n.a.l r6 = r6.getOnBankChangedCallback()
                    com.stripe.android.view.BecsDebitBsbEditText r0 = r5.this$0
                    com.stripe.android.view.BecsDebitBanks$Bank r0 = r0.getBank()
                    r6.invoke(r0)
                    com.stripe.android.view.BecsDebitBsbEditText r6 = r5.this$0
                    r6.updateIcon(r2)
                    com.stripe.android.view.BecsDebitBsbEditText r6 = r5.this$0
                    boolean r6 = r6.isComplete()
                    if (r6 == 0) goto L_0x0098
                    com.stripe.android.view.BecsDebitBsbEditText r6 = r5.this$0
                    m0.n.a.a r6 = r6.getOnCompletedCallback()
                    r6.invoke()
                L_0x0098:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.BecsDebitBsbEditText.AnonymousClass1.afterTextChanged(android.text.Editable):void");
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!this.ignoreChanges && i <= 4) {
                    Integer num = null;
                    String obj = charSequence != null ? charSequence.toString() : null;
                    if (obj == null) {
                        obj = "";
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = obj.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        char charAt = obj.charAt(i4);
                        if (Character.isDigit(charAt)) {
                            sb.append(charAt);
                        }
                    }
                    String sb2 = sb.toString();
                    m0.n.b.i.d(sb2, "filterTo(StringBuilder(), predicate).toString()");
                    String access$formatBsb = this.this$0.formatBsb(sb2);
                    this.formattedBsb = access$formatBsb;
                    if (access$formatBsb != null) {
                        num = Integer.valueOf(access$formatBsb.length());
                    }
                    this.newCursorPosition = num;
                }
            }
        });
    }
}
