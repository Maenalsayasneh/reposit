package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.KeyOperation;
import com.nimbusds.jose.jwk.KeyUse;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.stripe.android.stripe3ds2.init.AppInfoRepository;
import com.stripe.android.stripe3ds2.init.DeviceDataFactory;
import com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactory;
import com.stripe.android.stripe3ds2.init.SecurityChecker;
import com.stripe.android.stripe3ds2.init.Warning;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.security.DirectoryServer;
import com.stripe.android.stripe3ds2.security.JweEncrypter;
import i0.j.f.p.h;
import java.net.URI;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 02\u00020\u0001:\u00010BI\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b+\u0010,BI\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b+\u0010/J=\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00028A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory;", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParametersFactory;", "", "directoryServerId", "Ljava/security/PublicKey;", "directoryServerPublicKey", "keyId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "sdkTransactionId", "sdkPublicKey", "Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "create", "(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/security/PublicKey;Lm0/l/c;)Ljava/lang/Object;", "Lcom/nimbusds/jose/jwk/KeyUse;", "getKeyUse$3ds2sdk_release", "(Ljava/lang/String;)Lcom/nimbusds/jose/jwk/KeyUse;", "getKeyUse", "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;", "deviceDataFactory", "Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;", "sdkReferenceNumber", "Ljava/lang/String;", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "messageVersionRegistry", "Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;", "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;", "deviceParamNotAvailableFactory", "Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "securityChecker", "Lcom/stripe/android/stripe3ds2/init/SecurityChecker;", "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;", "appInfoRepository", "Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "getDeviceDataJson$3ds2sdk_release", "()Ljava/lang/String;", "deviceDataJson", "Lcom/stripe/android/stripe3ds2/security/JweEncrypter;", "jweEncrypter", "Lcom/stripe/android/stripe3ds2/security/JweEncrypter;", "<init>", "(Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lcom/stripe/android/stripe3ds2/security/JweEncrypter;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;", "ephemeralKeyPairGenerator", "(Lcom/stripe/android/stripe3ds2/init/DeviceDataFactory;Lcom/stripe/android/stripe3ds2/init/DeviceParamNotAvailableFactory;Lcom/stripe/android/stripe3ds2/init/SecurityChecker;Lcom/stripe/android/stripe3ds2/security/EphemeralKeyPairGenerator;Lcom/stripe/android/stripe3ds2/init/AppInfoRepository;Lcom/stripe/android/stripe3ds2/transaction/MessageVersionRegistry;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultAuthenticationRequestParametersFactory.kt */
public final class DefaultAuthenticationRequestParametersFactory implements AuthenticationRequestParametersFactory {
    public static final Companion Companion = new Companion((f) null);
    private static final String DATA_VERSION = "1.1";
    public static final String KEY_DATA_VERSION = "DV";
    public static final String KEY_DEVICE_DATA = "DD";
    public static final String KEY_DEVICE_PARAM_NOT_AVAILABLE = "DPNA";
    public static final String KEY_SECURITY_WARNINGS = "SW";
    private final AppInfoRepository appInfoRepository;
    private final DeviceDataFactory deviceDataFactory;
    private final DeviceParamNotAvailableFactory deviceParamNotAvailableFactory;
    private final ErrorReporter errorReporter;
    private final JweEncrypter jweEncrypter;
    private final MessageVersionRegistry messageVersionRegistry;
    private final String sdkReferenceNumber;
    private final SecurityChecker securityChecker;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00048\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00048\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/DefaultAuthenticationRequestParametersFactory$Companion;", "", "Ljava/security/PublicKey;", "publicKey", "", "keyId", "Lcom/nimbusds/jose/jwk/KeyUse;", "keyUse", "Lcom/nimbusds/jose/jwk/JWK;", "createPublicJwk$3ds2sdk_release", "(Ljava/security/PublicKey;Ljava/lang/String;Lcom/nimbusds/jose/jwk/KeyUse;)Lcom/nimbusds/jose/jwk/JWK;", "createPublicJwk", "DATA_VERSION", "Ljava/lang/String;", "KEY_DATA_VERSION", "KEY_DEVICE_DATA", "KEY_DEVICE_PARAM_NOT_AVAILABLE", "KEY_SECURITY_WARNINGS", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultAuthenticationRequestParametersFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public final JWK createPublicJwk$3ds2sdk_release(PublicKey publicKey, String str, KeyUse keyUse) {
            PublicKey publicKey2 = publicKey;
            i.e(publicKey2, "publicKey");
            Curve curve = Curve.c;
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey2;
            Base64URL e = ECKey.e(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX());
            Base64URL e2 = ECKey.e(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY());
            if (curve != null) {
                List<T> list = null;
                try {
                    ECKey eCKey = new ECKey(curve, e, e2, keyUse, (Set<KeyOperation>) null, (Algorithm) null, !(str == null || StringsKt__IndentKt.o(str)) ? str : null, (URI) null, (Base64URL) null, (Base64URL) null, (List<Base64>) null, (KeyStore) null);
                    Curve curve2 = eCKey.f2;
                    Base64URL base64URL = eCKey.g2;
                    Base64URL base64URL2 = eCKey.h2;
                    KeyUse keyUse2 = eCKey.d;
                    Set<KeyOperation> set = eCKey.q;
                    Algorithm algorithm = eCKey.x;
                    String str2 = eCKey.y;
                    URI uri = eCKey.Y1;
                    Base64URL base64URL3 = eCKey.Z1;
                    Base64URL base64URL4 = eCKey.a2;
                    List<Base64> list2 = eCKey.b2;
                    if (list2 != null) {
                        list = Collections.unmodifiableList(list2);
                    }
                    ECKey eCKey2 = new ECKey(curve2, base64URL, base64URL2, keyUse2, set, algorithm, str2, uri, base64URL3, base64URL4, list, eCKey.d2);
                    i.d(eCKey2, "ECKey.Builder(Curve.P_25…           .toPublicJWK()");
                    return eCKey2;
                } catch (IllegalArgumentException e3) {
                    throw new IllegalStateException(e3.getMessage(), e3);
                }
            } else {
                throw new IllegalArgumentException("The curve must not be null");
            }
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DefaultAuthenticationRequestParametersFactory(DeviceDataFactory deviceDataFactory2, DeviceParamNotAvailableFactory deviceParamNotAvailableFactory2, SecurityChecker securityChecker2, AppInfoRepository appInfoRepository2, JweEncrypter jweEncrypter2, MessageVersionRegistry messageVersionRegistry2, String str, ErrorReporter errorReporter2) {
        i.e(deviceDataFactory2, "deviceDataFactory");
        i.e(deviceParamNotAvailableFactory2, "deviceParamNotAvailableFactory");
        i.e(securityChecker2, "securityChecker");
        i.e(appInfoRepository2, "appInfoRepository");
        i.e(jweEncrypter2, "jweEncrypter");
        i.e(messageVersionRegistry2, "messageVersionRegistry");
        i.e(str, "sdkReferenceNumber");
        i.e(errorReporter2, "errorReporter");
        this.deviceDataFactory = deviceDataFactory2;
        this.deviceParamNotAvailableFactory = deviceParamNotAvailableFactory2;
        this.securityChecker = securityChecker2;
        this.appInfoRepository = appInfoRepository2;
        this.jweEncrypter = jweEncrypter2;
        this.messageVersionRegistry = messageVersionRegistry2;
        this.sdkReferenceNumber = str;
        this.errorReporter = errorReporter2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: com.stripe.android.stripe3ds2.transaction.SdkTransactionId} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: java.security.PublicKey} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object create(java.lang.String r9, java.security.PublicKey r10, java.lang.String r11, com.stripe.android.stripe3ds2.transaction.SdkTransactionId r12, java.security.PublicKey r13, m0.l.c<? super com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParameters> r14) {
        /*
            r8 = this;
            boolean r0 = r14 instanceof com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory$create$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory$create$1 r0 = (com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory$create$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory$create$1 r0 = new com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory$create$1
            r0.<init>(r8, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            java.lang.Object r9 = r0.L$5
            r12 = r9
            com.stripe.android.stripe3ds2.transaction.SdkTransactionId r12 = (com.stripe.android.stripe3ds2.transaction.SdkTransactionId) r12
            java.lang.Object r9 = r0.L$4
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.L$3
            r13 = r10
            java.security.PublicKey r13 = (java.security.PublicKey) r13
            java.lang.Object r10 = r0.L$2
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r0.L$1
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r0.L$0
            com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory r0 = (com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory) r0
            i0.j.f.p.h.d4(r14)
            r1 = r9
            r9 = r10
        L_0x0043:
            r2 = r12
            goto L_0x00ac
        L_0x0045:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x004d:
            i0.j.f.p.h.d4(r14)
            com.stripe.android.stripe3ds2.security.JweEncrypter r14 = r8.jweEncrypter     // Catch:{ all -> 0x005b }
            java.lang.String r2 = r8.getDeviceDataJson$3ds2sdk_release()     // Catch:{ all -> 0x005b }
            java.lang.String r10 = r14.encrypt(r2, r10, r9, r11)     // Catch:{ all -> 0x005b }
            goto L_0x0060
        L_0x005b:
            r10 = move-exception
            java.lang.Object r10 = i0.j.f.p.h.l0(r10)
        L_0x0060:
            java.lang.Throwable r14 = kotlin.Result.a(r10)
            if (r14 == 0) goto L_0x008a
            com.stripe.android.stripe3ds2.observability.ErrorReporter r2 = r8.errorReporter
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.String r5 = "\n                    Failed to encrypt AReq parameters.\n                        \n                    directoryServerId="
            java.lang.String r6 = "\n                    keyId="
            java.lang.String r7 = "\n                    sdkTransactionId="
            java.lang.StringBuilder r5 = i0.d.a.a.a.U0(r5, r9, r6, r11, r7)
            r5.append(r12)
            java.lang.String r6 = "\n                    "
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = kotlin.text.StringsKt__IndentKt.Y(r5)
            r4.<init>(r5, r14)
            r2.reportError(r4)
        L_0x008a:
            java.lang.Throwable r14 = kotlin.Result.a(r10)
            if (r14 != 0) goto L_0x00d8
            java.lang.String r10 = (java.lang.String) r10
            com.stripe.android.stripe3ds2.init.AppInfoRepository r14 = r8.appInfoRepository
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r11
            r0.L$3 = r13
            r0.L$4 = r10
            r0.L$5 = r12
            r0.label = r3
            java.lang.Object r14 = r14.get(r0)
            if (r14 != r1) goto L_0x00a9
            return r1
        L_0x00a9:
            r0 = r8
            r1 = r10
            goto L_0x0043
        L_0x00ac:
            com.stripe.android.stripe3ds2.init.AppInfo r14 = (com.stripe.android.stripe3ds2.init.AppInfo) r14
            java.lang.String r3 = r14.getSdkAppId()
            java.lang.String r4 = r0.sdkReferenceNumber
            com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory$Companion r10 = Companion
            com.nimbusds.jose.jwk.KeyUse r9 = r0.getKeyUse$3ds2sdk_release(r9)
            com.nimbusds.jose.jwk.JWK r9 = r10.createPublicJwk$3ds2sdk_release(r13, r11, r9)
            java.util.Map r9 = r9.d()
            java.lang.String r5 = i0.j.f.p.h.k4(r9)
            java.lang.String r9 = "createPublicJwk(\n       …         ).toJSONString()"
            m0.n.b.i.d(r5, r9)
            com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry r9 = r0.messageVersionRegistry
            java.lang.String r6 = r9.getCurrent()
            com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParameters r9 = new com.stripe.android.stripe3ds2.transaction.AuthenticationRequestParameters
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
        L_0x00d8:
            com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException r9 = new com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException
            r9.<init>(r14)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory.create(java.lang.String, java.security.PublicKey, java.lang.String, com.stripe.android.stripe3ds2.transaction.SdkTransactionId, java.security.PublicKey, m0.l.c):java.lang.Object");
    }

    public final String getDeviceDataJson$3ds2sdk_release() throws JSONException {
        JSONObject put = new JSONObject().put(KEY_DATA_VERSION, (Object) DATA_VERSION).put(KEY_DEVICE_DATA, (Object) new JSONObject((Map<?, ?>) this.deviceDataFactory.create())).put(KEY_DEVICE_PARAM_NOT_AVAILABLE, (Object) new JSONObject((Map<?, ?>) this.deviceParamNotAvailableFactory.create()));
        List<Warning> warnings = this.securityChecker.getWarnings();
        ArrayList arrayList = new ArrayList(h.K(warnings, 10));
        for (Warning id : warnings) {
            arrayList.add(id.getId());
        }
        String jSONObject = put.put(KEY_SECURITY_WARNINGS, (Object) new JSONArray((Collection<?>) arrayList)).toString();
        i.d(jSONObject, "JSONObject()\n           …              .toString()");
        return jSONObject;
    }

    public final KeyUse getKeyUse$3ds2sdk_release(String str) {
        DirectoryServer directoryServer;
        i.e(str, "directoryServerId");
        DirectoryServer[] values = DirectoryServer.values();
        int i = 0;
        while (true) {
            if (i >= 7) {
                directoryServer = null;
                break;
            }
            directoryServer = values[i];
            if (directoryServer.getIds().contains(str)) {
                break;
            }
            i++;
        }
        if (directoryServer != null) {
            return directoryServer.getKeyUse();
        }
        return KeyUse.c;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DefaultAuthenticationRequestParametersFactory(com.stripe.android.stripe3ds2.init.DeviceDataFactory r11, com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactory r12, com.stripe.android.stripe3ds2.init.SecurityChecker r13, com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator r14, com.stripe.android.stripe3ds2.init.AppInfoRepository r15, com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry r16, java.lang.String r17, com.stripe.android.stripe3ds2.observability.ErrorReporter r18) {
        /*
            r10 = this;
            r0 = r14
            r8 = r18
            java.lang.String r1 = "deviceDataFactory"
            r2 = r11
            m0.n.b.i.e(r11, r1)
            java.lang.String r1 = "deviceParamNotAvailableFactory"
            r3 = r12
            m0.n.b.i.e(r12, r1)
            java.lang.String r1 = "securityChecker"
            r4 = r13
            m0.n.b.i.e(r13, r1)
            java.lang.String r1 = "ephemeralKeyPairGenerator"
            m0.n.b.i.e(r14, r1)
            java.lang.String r1 = "appInfoRepository"
            r5 = r15
            m0.n.b.i.e(r15, r1)
            java.lang.String r1 = "messageVersionRegistry"
            r6 = r16
            m0.n.b.i.e(r6, r1)
            java.lang.String r1 = "sdkReferenceNumber"
            r7 = r17
            m0.n.b.i.e(r7, r1)
            java.lang.String r1 = "errorReporter"
            m0.n.b.i.e(r8, r1)
            com.stripe.android.stripe3ds2.security.JweEncrypter r9 = new com.stripe.android.stripe3ds2.security.JweEncrypter
            r9.<init>(r14, r8)
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            r5 = r9
            r0.<init>((com.stripe.android.stripe3ds2.init.DeviceDataFactory) r1, (com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactory) r2, (com.stripe.android.stripe3ds2.init.SecurityChecker) r3, (com.stripe.android.stripe3ds2.init.AppInfoRepository) r4, (com.stripe.android.stripe3ds2.security.JweEncrypter) r5, (com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry) r6, (java.lang.String) r7, (com.stripe.android.stripe3ds2.observability.ErrorReporter) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.DefaultAuthenticationRequestParametersFactory.<init>(com.stripe.android.stripe3ds2.init.DeviceDataFactory, com.stripe.android.stripe3ds2.init.DeviceParamNotAvailableFactory, com.stripe.android.stripe3ds2.init.SecurityChecker, com.stripe.android.stripe3ds2.security.EphemeralKeyPairGenerator, com.stripe.android.stripe3ds2.init.AppInfoRepository, com.stripe.android.stripe3ds2.transaction.MessageVersionRegistry, java.lang.String, com.stripe.android.stripe3ds2.observability.ErrorReporter):void");
    }
}
