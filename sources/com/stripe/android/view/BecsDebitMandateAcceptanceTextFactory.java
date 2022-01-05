package com.stripe.android.view;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import com.stripe.android.R;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/view/BecsDebitMandateAcceptanceTextFactory;", "", "", "companyName", "", "create", "(Ljava/lang/String;)Ljava/lang/CharSequence;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BecsDebitMandateAcceptanceTextFactory.kt */
public final class BecsDebitMandateAcceptanceTextFactory {
    private final Context context;

    public BecsDebitMandateAcceptanceTextFactory(Context context2) {
        i.e(context2, "context");
        this.context = context2;
    }

    public final CharSequence create(String str) {
        i.e(str, "companyName");
        String string = this.context.getString(R.string.becs_mandate_acceptance, new Object[]{str});
        i.d(string, "context.getString(\n     …    companyName\n        )");
        Spanned fromHtml = Html.fromHtml(string, 0);
        i.d(fromHtml, "Html.fromHtml(mandateAcc…ml.FROM_HTML_MODE_LEGACY)");
        return fromHtml;
    }
}
