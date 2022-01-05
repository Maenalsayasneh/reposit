package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser;", "", "ephemPubkey", "Ljava/security/interfaces/ECPublicKey;", "parsePublicKey", "(Ljava/lang/Object;)Ljava/security/interfaces/ECPublicKey;", "Lorg/json/JSONObject;", "payloadJson", "Lcom/stripe/android/stripe3ds2/transaction/AcsData;", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transaction/AcsData;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "<init>", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AcsDataParser.kt */
public final class AcsDataParser {
    public static final Companion Companion = new Companion((f) null);
    public static final String FIELD_ACS_EPHEM_PUB_KEY = "acsEphemPubKey";
    public static final String FIELD_ACS_URL = "acsURL";
    public static final String FIELD_SDK_EPHEM_PUB_KEY = "sdkEphemPubKey";
    private final ErrorReporter errorReporter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/AcsDataParser$Companion;", "", "", "FIELD_ACS_EPHEM_PUB_KEY", "Ljava/lang/String;", "FIELD_ACS_URL", "FIELD_SDK_EPHEM_PUB_KEY", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AcsDataParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public AcsDataParser(ErrorReporter errorReporter2) {
        i.e(errorReporter2, "errorReporter");
        this.errorReporter = errorReporter2;
    }

    private final ECPublicKey parsePublicKey(Object obj) {
        ECKey eCKey;
        if (obj instanceof Map) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            eCKey = ECKey.h((Map) obj);
        } else {
            String obj2 = obj != null ? obj.toString() : null;
            if (obj2 == null) {
                obj2 = "";
            }
            Set<Curve> set = ECKey.e2;
            eCKey = ECKey.h(h.b3(obj2));
        }
        ECParameterSpec b = eCKey.f2.b();
        if (b != null) {
            try {
                ECPublicKey eCPublicKey = (ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(eCKey.g2.b(), eCKey.h2.b()), b));
                i.d(eCPublicKey, "when (ephemPubkey) {\n   …        }.toECPublicKey()");
                return eCPublicKey;
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                throw new JOSEException(e.getMessage(), e);
            }
        } else {
            StringBuilder P0 = a.P0("Couldn't get EC parameter spec for curve ");
            P0.append(eCKey.f2);
            throw new JOSEException(P0.toString());
        }
    }

    public final AcsData parse(JSONObject jSONObject) throws JSONException, ParseException, JOSEException {
        Object obj;
        i.e(jSONObject, "payloadJson");
        try {
            Map<String, Object> b3 = h.b3(jSONObject.toString());
            i.d(b3, "JSONObjectUtils.parse(payloadJson.toString())");
            Map<String, Object> y0 = g.y0(b3);
            obj = new AcsData(String.valueOf(y0.get(FIELD_ACS_URL)), parsePublicKey(y0.get(FIELD_ACS_EPHEM_PUB_KEY)), parsePublicKey(y0.get(FIELD_SDK_EPHEM_PUB_KEY)));
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Throwable a = Result.a(obj);
        if (a != null) {
            ErrorReporter errorReporter2 = this.errorReporter;
            errorReporter2.reportError(new IllegalArgumentException("Failed to parse ACS data: " + jSONObject, a));
        }
        h.d4(obj);
        return (AcsData) obj;
    }
}
