package com.stripe.android.model.parsers;

import com.stripe.android.model.StripeJsonUtils;
import com.stripe.android.model.WeChat;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/WeChatJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/WeChat;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/WeChat;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: WeChatJsonParser.kt */
public final class WeChatJsonParser implements ModelJsonParser<WeChat> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_APPID = "android_appId";
    @Deprecated
    private static final String FIELD_NONCE = "android_nonceStr";
    @Deprecated
    private static final String FIELD_PACKAGE = "android_package";
    @Deprecated
    private static final String FIELD_PARTNERID = "android_partnerId";
    @Deprecated
    private static final String FIELD_PREPAYID = "android_prepayId";
    @Deprecated
    private static final String FIELD_QR_CODE_URL = "qr_code_url";
    @Deprecated
    private static final String FIELD_SIGN = "android_sign";
    @Deprecated
    private static final String FIELD_STATEMENT_DESCRIPTOR = "statement_descriptor";
    @Deprecated
    private static final String FIELD_TIMESTAMP = "android_timeStamp";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/parsers/WeChatJsonParser$Companion;", "", "", "FIELD_APPID", "Ljava/lang/String;", "FIELD_NONCE", "FIELD_PACKAGE", "FIELD_PARTNERID", "FIELD_PREPAYID", "FIELD_QR_CODE_URL", "FIELD_SIGN", "FIELD_STATEMENT_DESCRIPTOR", "FIELD_TIMESTAMP", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: WeChatJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public WeChat parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        return new WeChat(StripeJsonUtils.optString(jSONObject, FIELD_STATEMENT_DESCRIPTOR), StripeJsonUtils.optString(jSONObject, FIELD_APPID), StripeJsonUtils.optString(jSONObject, FIELD_NONCE), StripeJsonUtils.optString(jSONObject, FIELD_PACKAGE), StripeJsonUtils.optString(jSONObject, FIELD_PARTNERID), StripeJsonUtils.optString(jSONObject, FIELD_PREPAYID), StripeJsonUtils.optString(jSONObject, FIELD_SIGN), StripeJsonUtils.optString(jSONObject, FIELD_TIMESTAMP), StripeJsonUtils.optString(jSONObject, FIELD_QR_CODE_URL));
    }
}
