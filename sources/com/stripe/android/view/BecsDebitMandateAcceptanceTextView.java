package com.stripe.android.view;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import i0.d.a.a.a;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;
import m0.o.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00028@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "isValid$payments_core_release", "()Z", "isValid", "", "<set-?>", "companyName$delegate", "Lm0/o/d;", "getCompanyName", "()Ljava/lang/String;", "setCompanyName", "(Ljava/lang/String;)V", "companyName", "Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextFactory;", "factory", "Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextFactory;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BecsDebitMandateAcceptanceTextView.kt */
public final class BecsDebitMandateAcceptanceTextView extends AppCompatTextView {
    public static final /* synthetic */ k[] $$delegatedProperties = {a.o1(BecsDebitMandateAcceptanceTextView.class, "companyName", "getCompanyName()Ljava/lang/String;", 0)};
    private final d companyName$delegate;
    /* access modifiers changed from: private */
    public final BecsDebitMandateAcceptanceTextFactory factory;

    public BecsDebitMandateAcceptanceTextView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 16842884 : i);
    }

    public final String getCompanyName() {
        return (String) this.companyName$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final boolean isValid$payments_core_release() {
        CharSequence text = getText();
        return !(text == null || StringsKt__IndentKt.o(text));
    }

    public final void setCompanyName(String str) {
        i.e(str, "<set-?>");
        this.companyName$delegate.setValue(this, $$delegatedProperties[0], str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        this.factory = new BecsDebitMandateAcceptanceTextFactory(context);
        setMovementMethod(LinkMovementMethod.getInstance());
        this.companyName$delegate = new BecsDebitMandateAcceptanceTextView$$special$$inlined$observable$1("", "", this);
    }
}
