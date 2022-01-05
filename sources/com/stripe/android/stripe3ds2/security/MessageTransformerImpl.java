package com.stripe.android.stripe3ds2.security;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.CompressionAlgorithm;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObject;
import com.nimbusds.jose.JOSEObjectType;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEHeader;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.Payload;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import com.stripe.android.stripe3ds2.transactions.ProtocolError;
import i0.j.f.p.h;
import i0.l.a.f.a;
import java.net.URI;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u0000 92\u00020\u0001:\u00019B!\b\u0001\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020\u0005¢\u0006\u0004\b7\u00108J\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÂ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010$\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020!2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b%\u0010#J.\u0010*\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u00022\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u00105R\u0016\u0010(\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u00106R\u0016\u0010)\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u00106¨\u0006:"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/MessageTransformerImpl;", "Lcom/stripe/android/stripe3ds2/security/MessageTransformer;", "", "component1", "()Z", "", "component2", "()B", "component3", "Lorg/json/JSONObject;", "challengeRequest", "Ljavax/crypto/SecretKey;", "secretKey", "", "encrypt", "(Lorg/json/JSONObject;Ljavax/crypto/SecretKey;)Ljava/lang/String;", "message", "decrypt", "(Ljava/lang/String;Ljavax/crypto/SecretKey;)Lorg/json/JSONObject;", "cres", "Lm0/i;", "validateAcsToSdkCounter$3ds2sdk_release", "(Lorg/json/JSONObject;)V", "validateAcsToSdkCounter", "decryptMessage$3ds2sdk_release", "decryptMessage", "keyId", "Lcom/nimbusds/jose/JWEHeader;", "createEncryptionHeader$3ds2sdk_release", "(Ljava/lang/String;)Lcom/nimbusds/jose/JWEHeader;", "createEncryptionHeader", "Lcom/nimbusds/jose/EncryptionMethod;", "encryptionMethod", "", "getDecryptionKey$3ds2sdk_release", "(Ljavax/crypto/SecretKey;Lcom/nimbusds/jose/EncryptionMethod;)[B", "getDecryptionKey", "getEncryptionKey$3ds2sdk_release", "getEncryptionKey", "isLiveMode", "counterSdkToAcs", "counterAcsToSdk", "copy", "(ZBB)Lcom/stripe/android/stripe3ds2/security/MessageTransformerImpl;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "B", "<init>", "(ZBB)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: MessageTransformerImpl.kt */
public final class MessageTransformerImpl implements MessageTransformer {
    public static final int BITS_IN_BYTE = 8;
    public static final Companion Companion = new Companion((f) null);
    private static final EncryptionMethod ENCRYPTION_METHOD = EncryptionMethod.q;
    public static final String FIELD_ACS_COUNTER_ACS_TO_SDK = "acsCounterAtoS";
    public static final String FIELD_SDK_COUNTER_SDK_TO_ACS = "sdkCounterStoA";
    private byte counterAcsToSdk;
    private byte counterSdkToAcs;
    private final boolean isLiveMode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00108\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/stripe3ds2/security/MessageTransformerImpl$Companion;", "", "", "isLiveMode", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/security/MessageTransformerImpl;", "create", "(ZLcom/stripe/android/stripe3ds2/observability/ErrorReporter;)Lcom/stripe/android/stripe3ds2/security/MessageTransformerImpl;", "", "BITS_IN_BYTE", "I", "Lcom/nimbusds/jose/EncryptionMethod;", "kotlin.jvm.PlatformType", "ENCRYPTION_METHOD", "Lcom/nimbusds/jose/EncryptionMethod;", "", "FIELD_ACS_COUNTER_ACS_TO_SDK", "Ljava/lang/String;", "FIELD_SDK_COUNTER_SDK_TO_ACS", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: MessageTransformerImpl.kt */
    public static final class Companion {
        private Companion() {
        }

        public final MessageTransformerImpl create(boolean z, ErrorReporter errorReporter) {
            i.e(errorReporter, "errorReporter");
            byte b = (byte) 0;
            return new MessageTransformerImpl(z, b, b);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public MessageTransformerImpl(boolean z, byte b, byte b2) {
        this.isLiveMode = z;
        this.counterSdkToAcs = b;
        this.counterAcsToSdk = b2;
    }

    private final boolean component1() {
        return this.isLiveMode;
    }

    private final byte component2() {
        return this.counterSdkToAcs;
    }

    private final byte component3() {
        return this.counterAcsToSdk;
    }

    public static /* synthetic */ MessageTransformerImpl copy$default(MessageTransformerImpl messageTransformerImpl, boolean z, byte b, byte b2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = messageTransformerImpl.isLiveMode;
        }
        if ((i & 2) != 0) {
            b = messageTransformerImpl.counterSdkToAcs;
        }
        if ((i & 4) != 0) {
            b2 = messageTransformerImpl.counterAcsToSdk;
        }
        return messageTransformerImpl.copy(z, b, b2);
    }

    public static final MessageTransformerImpl create(boolean z, ErrorReporter errorReporter) {
        return Companion.create(z, errorReporter);
    }

    public final MessageTransformerImpl copy(boolean z, byte b, byte b2) {
        return new MessageTransformerImpl(z, b, b2);
    }

    public final JWEHeader createEncryptionHeader$3ds2sdk_release(String str) {
        i.e(str, "keyId");
        JWEAlgorithm jWEAlgorithm = JWEAlgorithm.b2;
        EncryptionMethod encryptionMethod = ENCRYPTION_METHOD;
        if (jWEAlgorithm.d.equals(Algorithm.c.d)) {
            throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
        } else if (encryptionMethod != null) {
            JWEHeader jWEHeader = new JWEHeader(jWEAlgorithm, encryptionMethod, (JOSEObjectType) null, (String) null, (Set<String>) null, (URI) null, (JWK) null, (URI) null, (Base64URL) null, (Base64URL) null, (List<Base64>) null, str, (JWK) null, (CompressionAlgorithm) null, (Base64URL) null, (Base64URL) null, (Base64URL) null, 0, (Base64URL) null, (Base64URL) null, (Map<String, Object>) null, (Base64URL) null);
            i.d(jWEHeader, "JWEHeader.Builder(JWEAlg…yId)\n            .build()");
            return jWEHeader;
        } else {
            throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
        }
    }

    public JSONObject decrypt(String str, SecretKey secretKey) throws ParseException, JOSEException, JSONException, ChallengeResponseParseException {
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        i.e(secretKey, "secretKey");
        JSONObject decryptMessage$3ds2sdk_release = decryptMessage$3ds2sdk_release(str, secretKey);
        validateAcsToSdkCounter$3ds2sdk_release(decryptMessage$3ds2sdk_release);
        byte b = (byte) (this.counterAcsToSdk + 1);
        this.counterAcsToSdk = b;
        if (b != 0) {
            return decryptMessage$3ds2sdk_release;
        }
        throw new RuntimeException("ACS to SDK counter is zero");
    }

    public final JSONObject decryptMessage$3ds2sdk_release(String str, SecretKey secretKey) throws ParseException, JOSEException, JSONException {
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        i.e(secretKey, "secretKey");
        Base64URL[] a = JOSEObject.a(str);
        if (a.length == 5) {
            JWEObject jWEObject = new JWEObject(a[0], a[1], a[2], a[3], a[4]);
            i.d(jWEObject, "jweObject");
            JWEHeader jWEHeader = jWEObject.q;
            i.d(jWEHeader, "jweObject.header");
            EncryptionMethod encryptionMethod = jWEHeader.i2;
            i.d(encryptionMethod, "jweObject.header.encryptionMethod");
            a aVar = new a(getDecryptionKey$3ds2sdk_release(secretKey, encryptionMethod));
            synchronized (jWEObject) {
                if (jWEObject.a2 == JWEObject.State.ENCRYPTED) {
                    try {
                        jWEObject.c = new Payload(aVar.a(jWEObject.q, jWEObject.x, jWEObject.y, jWEObject.Y1, jWEObject.Z1));
                        jWEObject.a2 = JWEObject.State.DECRYPTED;
                    } catch (JOSEException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw new JOSEException(e2.getMessage(), e2);
                    }
                } else {
                    throw new IllegalStateException("The JWE object must be in an encrypted state");
                }
            }
            return new JSONObject(jWEObject.c.toString());
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
    }

    public String encrypt(JSONObject jSONObject, SecretKey secretKey) throws JOSEException, JSONException {
        i.e(jSONObject, "challengeRequest");
        i.e(secretKey, "secretKey");
        String string = jSONObject.getString(ChallengeRequestData.FIELD_ACS_TRANS_ID);
        i.d(string, "challengeRequest.getStri…tData.FIELD_ACS_TRANS_ID)");
        JWEHeader createEncryptionHeader$3ds2sdk_release = createEncryptionHeader$3ds2sdk_release(string);
        String format = String.format(Locale.ROOT, "%03d", Arrays.copyOf(new Object[]{Byte.valueOf(this.counterSdkToAcs)}, 1));
        i.d(format, "java.lang.String.format(locale, format, *args)");
        jSONObject.put(FIELD_SDK_COUNTER_SDK_TO_ACS, (Object) format);
        JWEObject jWEObject = new JWEObject(createEncryptionHeader$3ds2sdk_release, new Payload(jSONObject.toString()));
        EncryptionMethod encryptionMethod = createEncryptionHeader$3ds2sdk_release.i2;
        i.d(encryptionMethod, "header.encryptionMethod");
        jWEObject.b(new TransactionEncrypter(getEncryptionKey$3ds2sdk_release(secretKey, encryptionMethod), this.counterSdkToAcs));
        byte b = (byte) (this.counterSdkToAcs + 1);
        this.counterSdkToAcs = b;
        if (b != 0) {
            String d = jWEObject.d();
            i.d(d, "jweObject.serialize()");
            return d;
        }
        throw new RuntimeException("SDK to ACS counter is zero");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageTransformerImpl)) {
            return false;
        }
        MessageTransformerImpl messageTransformerImpl = (MessageTransformerImpl) obj;
        return this.isLiveMode == messageTransformerImpl.isLiveMode && this.counterSdkToAcs == messageTransformerImpl.counterSdkToAcs && this.counterAcsToSdk == messageTransformerImpl.counterAcsToSdk;
    }

    public final byte[] getDecryptionKey$3ds2sdk_release(SecretKey secretKey, EncryptionMethod encryptionMethod) {
        i.e(secretKey, "secretKey");
        i.e(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        EncryptionMethod encryptionMethod2 = EncryptionMethod.a2;
        if (encryptionMethod2 == encryptionMethod) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, encoded.length - (encryptionMethod2.d2 / 8), encoded.length);
            i.d(copyOfRange, "Arrays.copyOfRange(\n    …dedKey.size\n            )");
            return copyOfRange;
        }
        i.d(encoded, "encodedKey");
        return encoded;
    }

    public final byte[] getEncryptionKey$3ds2sdk_release(SecretKey secretKey, EncryptionMethod encryptionMethod) {
        i.e(secretKey, "secretKey");
        i.e(encryptionMethod, "encryptionMethod");
        byte[] encoded = secretKey.getEncoded();
        EncryptionMethod encryptionMethod2 = EncryptionMethod.a2;
        if (encryptionMethod2 == encryptionMethod) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, encryptionMethod2.d2 / 8);
            i.d(copyOfRange, "Arrays.copyOfRange(\n    …ITS_IN_BYTE\n            )");
            return copyOfRange;
        }
        i.d(encoded, "encodedKey");
        return encoded;
    }

    public int hashCode() {
        boolean z = this.isLiveMode;
        if (z) {
            z = true;
        }
        int hashCode = Byte.hashCode(this.counterSdkToAcs);
        return Byte.hashCode(this.counterAcsToSdk) + ((hashCode + ((z ? 1 : 0) * true)) * 31);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("MessageTransformerImpl(isLiveMode=");
        P0.append(this.isLiveMode);
        P0.append(", counterSdkToAcs=");
        P0.append(this.counterSdkToAcs);
        P0.append(", counterAcsToSdk=");
        return i0.d.a.a.a.u0(P0, this.counterAcsToSdk, ")");
    }

    public final void validateAcsToSdkCounter$3ds2sdk_release(JSONObject jSONObject) throws ChallengeResponseParseException, JSONException {
        Object obj;
        i.e(jSONObject, "cres");
        if (this.isLiveMode) {
            if (jSONObject.has(FIELD_ACS_COUNTER_ACS_TO_SDK)) {
                try {
                    String string = jSONObject.getString(FIELD_ACS_COUNTER_ACS_TO_SDK);
                    i.d(string, "cres.getString(FIELD_ACS_COUNTER_ACS_TO_SDK)");
                    obj = Byte.valueOf(Byte.parseByte(string));
                } catch (Throwable th) {
                    obj = h.l0(th);
                }
                if (Result.a(obj) == null) {
                    byte byteValue = ((Number) obj).byteValue();
                    if (this.counterAcsToSdk != byteValue) {
                        ProtocolError protocolError = ProtocolError.DataDecryptionFailure;
                        StringBuilder P0 = i0.d.a.a.a.P0("Counters are not equal. SDK counter: ");
                        P0.append(this.counterAcsToSdk);
                        P0.append(", ACS counter: ");
                        P0.append(byteValue);
                        throw new ChallengeResponseParseException(protocolError, P0.toString());
                    }
                    return;
                }
                throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(FIELD_ACS_COUNTER_ACS_TO_SDK);
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(FIELD_ACS_COUNTER_ACS_TO_SDK);
        }
    }
}
