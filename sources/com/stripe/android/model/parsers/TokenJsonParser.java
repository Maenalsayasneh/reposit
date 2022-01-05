package com.stripe.android.model.parsers;

import com.stripe.android.model.BankAccount;
import com.stripe.android.model.Card;
import com.stripe.android.model.StripeJsonUtils;
import com.stripe.android.model.Token;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/TokenJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/model/Token;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/Token;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: TokenJsonParser.kt */
public final class TokenJsonParser implements ModelJsonParser<Token> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_TYPE = "type";
    @Deprecated
    private static final String FIELD_USED = "used";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/parsers/TokenJsonParser$Companion;", "", "", "FIELD_CREATED", "Ljava/lang/String;", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_TYPE", "FIELD_USED", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: TokenJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Token.Type.values();
            int[] iArr = new int[6];
            $EnumSwitchMapping$0 = iArr;
            iArr[Token.Type.Card.ordinal()] = 1;
            iArr[Token.Type.BankAccount.ordinal()] = 2;
        }
    }

    public Token parse(JSONObject jSONObject) {
        Token token;
        i.e(jSONObject, "json");
        String optString = StripeJsonUtils.optString(jSONObject, "id");
        StripeJsonUtils stripeJsonUtils = StripeJsonUtils.INSTANCE;
        Long optLong$payments_core_release = stripeJsonUtils.optLong$payments_core_release(jSONObject, FIELD_CREATED);
        Token.Type fromCode = Token.Type.Companion.fromCode(StripeJsonUtils.optString(jSONObject, "type"));
        if (fromCode == null || optString == null || optLong$payments_core_release == null) {
            return null;
        }
        boolean optBoolean$payments_core_release = stripeJsonUtils.optBoolean$payments_core_release(jSONObject, FIELD_USED);
        boolean optBoolean$payments_core_release2 = stripeJsonUtils.optBoolean$payments_core_release(jSONObject, FIELD_LIVEMODE);
        Date date = new Date(TimeUnit.SECONDS.toMillis(optLong$payments_core_release.longValue()));
        int ordinal = fromCode.ordinal();
        if (ordinal == 0) {
            Token.Type type = Token.Type.Card;
            JSONObject optJSONObject = jSONObject.optJSONObject(type.getCode$payments_core_release());
            if (optJSONObject == null) {
                return null;
            }
            token = new Token(optString, type, date, optBoolean$payments_core_release2, optBoolean$payments_core_release, (BankAccount) null, new CardJsonParser().parse(optJSONObject), 32, (f) null);
        } else if (ordinal != 1) {
            return new Token(optString, fromCode, date, optBoolean$payments_core_release2, optBoolean$payments_core_release, (BankAccount) null, (Card) null, 96, (f) null);
        } else {
            Token.Type type2 = Token.Type.BankAccount;
            JSONObject optJSONObject2 = jSONObject.optJSONObject(type2.getCode$payments_core_release());
            if (optJSONObject2 == null) {
                return null;
            }
            token = new Token(optString, type2, date, optBoolean$payments_core_release2, optBoolean$payments_core_release, new BankAccountJsonParser().parse(optJSONObject2), (Card) null, 64, (f) null);
        }
        return token;
    }
}
