package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.R;
import com.google.android.material.textfield.TextInputLayout;
import i0.d.a.a.a;
import java.util.regex.Pattern;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import m0.o.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002\"#B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\r\u0010\u0004R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R+\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128@@@X\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/stripe/android/view/PostalCodeEditText;", "Lcom/stripe/android/view/StripeEditText;", "Lm0/i;", "configureForUs", "()V", "configureForGlobal", "", "hintRes", "updateHint", "(I)V", "Lcom/google/android/material/textfield/TextInputLayout;", "getTextInputLayout", "()Lcom/google/android/material/textfield/TextInputLayout;", "onFinishInflate", "", "getPostalCode$payments_core_release", "()Ljava/lang/String;", "postalCode", "Lcom/stripe/android/view/PostalCodeEditText$Config;", "<set-?>", "config$delegate", "Lm0/o/d;", "getConfig$payments_core_release", "()Lcom/stripe/android/view/PostalCodeEditText$Config;", "setConfig$payments_core_release", "(Lcom/stripe/android/view/PostalCodeEditText$Config;)V", "config", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "Config", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PostalCodeEditText.kt */
public final class PostalCodeEditText extends StripeEditText {
    public static final /* synthetic */ k[] $$delegatedProperties = {a.o1(PostalCodeEditText.class, "config", "getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;", 0)};
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final int MAX_LENGTH_GLOBAL = 13;
    @Deprecated
    private static final int MAX_LENGTH_US = 5;
    @Deprecated
    private static final Pattern ZIP_CODE_PATTERN = Pattern.compile("^[0-9]{5}$");
    private final d config$delegate;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001e\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/PostalCodeEditText$Companion;", "", "", "MAX_LENGTH_GLOBAL", "I", "MAX_LENGTH_US", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "ZIP_CODE_PATTERN", "Ljava/util/regex/Pattern;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PostalCodeEditText.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/view/PostalCodeEditText$Config;", "", "<init>", "(Ljava/lang/String;I)V", "Global", "US", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PostalCodeEditText.kt */
    public enum Config {
        Global,
        US
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Config.values();
            int[] iArr = new int[2];
            $EnumSwitchMapping$0 = iArr;
            iArr[Config.Global.ordinal()] = 1;
            iArr[Config.US.ordinal()] = 2;
        }
    }

    public PostalCodeEditText(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public PostalCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PostalCodeEditText(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    /* access modifiers changed from: private */
    public final void configureForGlobal() {
        updateHint(com.stripe.android.R.string.address_label_postal_code);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(13)});
        setKeyListener(TextKeyListener.getInstance());
        setInputType(112);
    }

    /* access modifiers changed from: private */
    public final void configureForUs() {
        updateHint(com.stripe.android.R.string.address_label_zip_code);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        setKeyListener(DigitsKeyListener.getInstance(false, true));
        setInputType(2);
    }

    private final TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private final void updateHint(int i) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout == null) {
            return;
        }
        if (textInputLayout.isHintEnabled()) {
            textInputLayout.setHint((CharSequence) getResources().getString(i));
        } else {
            setHint(i);
        }
    }

    public final Config getConfig$payments_core_release() {
        return (Config) this.config$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final String getPostalCode$payments_core_release() {
        if (getConfig$payments_core_release() != Config.US) {
            return getFieldText$payments_core_release();
        }
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        if (ZIP_CODE_PATTERN.matcher(getFieldText$payments_core_release()).matches()) {
            return fieldText$payments_core_release;
        }
        return null;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        configureForGlobal();
    }

    public final void setConfig$payments_core_release(Config config) {
        i.e(config, "<set-?>");
        this.config$delegate.setValue(this, $$delegatedProperties[0], config);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        Config config = Config.Global;
        this.config$delegate = new PostalCodeEditText$$special$$inlined$observable$1(config, config, this);
        setErrorMessage(getResources().getString(com.stripe.android.R.string.invalid_zip));
        setMaxLines(1);
        addTextChangedListener(new PostalCodeEditText$$special$$inlined$doAfterTextChanged$1(this));
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"postalCode"});
        }
    }
}
