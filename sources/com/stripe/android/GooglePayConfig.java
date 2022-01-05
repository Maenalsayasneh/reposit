package com.stripe.android;

import android.content.Context;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013B\u001d\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0014B\u0011\b\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u000f\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00028B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0013\u0010\f\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/GooglePayConfig;", "", "", "getKey", "()Ljava/lang/String;", "key", "validPublishableKey", "Ljava/lang/String;", "connectedAccountId", "Lorg/json/JSONObject;", "getTokenizationSpecification", "()Lorg/json/JSONObject;", "tokenizationSpecification", "apiVersion", "publishableKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;)V", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/stripe/android/PaymentConfiguration;", "paymentConfiguration", "(Lcom/stripe/android/PaymentConfiguration;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: GooglePayConfig.kt */
public final class GooglePayConfig {
    private final String apiVersion;
    private final String connectedAccountId;
    private final String validPublishableKey;

    public GooglePayConfig(String str) {
        this(str, (String) null, 2, (f) null);
    }

    public GooglePayConfig(String str, String str2) {
        i.e(str, "publishableKey");
        this.connectedAccountId = str2;
        this.validPublishableKey = ApiKeyValidator.Companion.get$payments_core_release().requireValid(str);
        this.apiVersion = ApiVersion.Companion.get$payments_core_release().getCode();
    }

    private final String getKey() {
        String str = this.connectedAccountId;
        if (str != null) {
            String str2 = this.validPublishableKey + '/' + str;
            if (str2 != null) {
                return str2;
            }
        }
        return this.validPublishableKey;
    }

    public final JSONObject getTokenizationSpecification() throws JSONException {
        JSONObject put = new JSONObject().put("type", (Object) "PAYMENT_GATEWAY").put(InstabugDbContract.SDKApiEntry.COLUMN_PARAMETERS, (Object) new JSONObject().put("gateway", (Object) "stripe").put("stripe:version", (Object) this.apiVersion).put("stripe:publishableKey", (Object) getKey()));
        i.d(put, "JSONObject()\n           …eKey\", key)\n            )");
        return put;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePayConfig(String str, String str2, int i, f fVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GooglePayConfig(Context context) {
        this(PaymentConfiguration.Companion.getInstance(context));
        i.e(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePayConfig(Context context, String str, int i, f fVar) {
        this(context, (i & 2) != 0 ? null : str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GooglePayConfig(Context context, String str) {
        this(PaymentConfiguration.Companion.getInstance(context).getPublishableKey(), str);
        i.e(context, "context");
    }

    private GooglePayConfig(PaymentConfiguration paymentConfiguration) {
        this(paymentConfiguration.getPublishableKey(), paymentConfiguration.getStripeAccountId());
    }
}
