package com.stripe.android.stripe3ds2.transaction;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObject;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.util.Base64;
import com.nimbusds.jose.util.Base64URL;
import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import i0.d.a.a.a;
import i0.j.f.p.h;
import i0.l.a.e;
import i0.l.a.j.c;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\fJ-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;", "", "", "jws", "", "isLiveMode", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "Lorg/json/JSONObject;", "getPayload", "(Ljava/lang/String;ZLjava/util/List;)Lorg/json/JSONObject;", "Default", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: JwsValidator.kt */
public interface JwsValidator {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001a\u001a\u00020\u00072\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/JwsValidator$Default;", "Lcom/stripe/android/stripe3ds2/transaction/JwsValidator;", "Lcom/nimbusds/jose/JWSObject;", "jwsObject", "", "Ljava/security/cert/X509Certificate;", "rootCerts", "", "isValid", "(Lcom/nimbusds/jose/JWSObject;Ljava/util/List;)Z", "Lcom/nimbusds/jose/JWSHeader;", "jwsHeader", "Li0/l/a/e;", "getVerifier", "(Lcom/nimbusds/jose/JWSHeader;)Li0/l/a/e;", "Ljava/security/PublicKey;", "getPublicKeyFromHeader", "(Lcom/nimbusds/jose/JWSHeader;)Ljava/security/PublicKey;", "", "jws", "isLiveMode", "Lorg/json/JSONObject;", "getPayload", "(Ljava/lang/String;ZLjava/util/List;)Lorg/json/JSONObject;", "Lcom/nimbusds/jose/util/Base64;", "encodedChainCerts", "isCertificateChainValid", "(Ljava/util/List;Ljava/util/List;)Z", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "errorReporter", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", "<init>", "(Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: JwsValidator.kt */
    public static final class Default implements JwsValidator {
        public static final Companion Companion = new Companion((f) null);
        private final ErrorReporter errorReporter;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/JwsValidator$Default$Companion;", "", "", "Lcom/nimbusds/jose/util/Base64;", "encodedChainCerts", "Ljava/security/cert/X509Certificate;", "rootCerts", "Lm0/i;", "validateChain", "(Ljava/util/List;Ljava/util/List;)V", "Ljava/security/KeyStore;", "createKeyStore", "(Ljava/util/List;)Ljava/security/KeyStore;", "Lcom/nimbusds/jose/JWSHeader;", "jwsHeader", "sanitizedJwsHeader$3ds2sdk_release", "(Lcom/nimbusds/jose/JWSHeader;)Lcom/nimbusds/jose/JWSHeader;", "sanitizedJwsHeader", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: JwsValidator.kt */
        public static final class Companion {
            private Companion() {
            }

            /* access modifiers changed from: private */
            public final void validateChain(List<? extends Base64> list, List<? extends X509Certificate> list2) throws GeneralSecurityException, IOException, ParseException {
                List<X509Certificate> a3 = h.a3(list);
                KeyStore createKeyStore = createKeyStore(list2);
                X509CertSelector x509CertSelector = new X509CertSelector();
                x509CertSelector.setCertificate(a3.get(0));
                PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(createKeyStore, x509CertSelector);
                pKIXBuilderParameters.setRevocationEnabled(false);
                pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(a3)));
                CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters);
            }

            public final KeyStore createKeyStore(List<? extends X509Certificate> list) throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException {
                i.e(list, "rootCerts");
                KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
                instance.load((InputStream) null, (char[]) null);
                int i = 0;
                for (T next : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        X509Certificate x509Certificate = (X509Certificate) next;
                        String format = String.format(Locale.ROOT, "ca_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                        i.d(format, "java.lang.String.format(locale, format, *args)");
                        instance.setCertificateEntry(format, (Certificate) list.get(i));
                        i = i2;
                    } else {
                        g.r0();
                        throw null;
                    }
                }
                i.d(instance, "keyStore");
                return instance;
            }

            public final JWSHeader sanitizedJwsHeader$3ds2sdk_release(JWSHeader jWSHeader) {
                JWSHeader jWSHeader2 = jWSHeader;
                i.e(jWSHeader2, "jwsHeader");
                JWSAlgorithm jWSAlgorithm = (JWSAlgorithm) jWSHeader2.d;
                if (!jWSAlgorithm.d.equals(Algorithm.c.d)) {
                    JWSHeader jWSHeader3 = new JWSHeader(jWSAlgorithm, jWSHeader2.q, jWSHeader2.x, jWSHeader2.y, jWSHeader2.a2, (JWK) null, jWSHeader2.c2, jWSHeader2.d2, jWSHeader2.e2, jWSHeader2.f2, jWSHeader2.g2, jWSHeader2.i2, jWSHeader2.Y1, (Base64URL) null);
                    i.d(jWSHeader3, "JWSHeader.Builder(jwsHea…                 .build()");
                    return jWSHeader3;
                }
                throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Default(ErrorReporter errorReporter2) {
            i.e(errorReporter2, "errorReporter");
            this.errorReporter = errorReporter2;
        }

        private final PublicKey getPublicKeyFromHeader(JWSHeader jWSHeader) throws CertificateException {
            List<Base64> list = jWSHeader.f2;
            i.d(list, "jwsHeader.x509CertChain");
            X509Certificate g3 = h.g3(((Base64) g.u(list)).a());
            i.d(g3, "X509CertUtils.parseWithE…().decode()\n            )");
            PublicKey publicKey = g3.getPublicKey();
            i.d(publicKey, "X509CertUtils.parseWithE…)\n            ).publicKey");
            return publicKey;
        }

        /* JADX WARNING: type inference failed for: r5v10, types: [i0.l.a.f.f] */
        /* JADX WARNING: type inference failed for: r5v13, types: [i0.l.a.f.d] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final i0.l.a.e getVerifier(com.nimbusds.jose.JWSHeader r5) throws com.nimbusds.jose.JOSEException, java.security.cert.CertificateException {
            /*
                r4 = this;
                i0.l.a.f.g.a r0 = new i0.l.a.f.g.a
                r0.<init>()
                i0.l.a.g.a r1 = r0.a
                java.lang.String r2 = "verifierFactory.jcaContext"
                m0.n.b.i.d(r1, r2)
                org.bouncycastle.jce.provider.BouncyCastleProvider r2 = i0.j.f.p.h.a
                if (r2 != 0) goto L_0x0017
                org.bouncycastle.jce.provider.BouncyCastleProvider r2 = new org.bouncycastle.jce.provider.BouncyCastleProvider
                r2.<init>()
                i0.j.f.p.h.a = r2
            L_0x0017:
                org.bouncycastle.jce.provider.BouncyCastleProvider r2 = i0.j.f.p.h.a
                r1.a = r2
                java.security.PublicKey r1 = r4.getPublicKeyFromHeader(r5)
                java.util.Set<com.nimbusds.jose.JWSAlgorithm> r2 = i0.l.a.f.d.c
                com.nimbusds.jose.Algorithm r3 = r5.d
                com.nimbusds.jose.JWSAlgorithm r3 = (com.nimbusds.jose.JWSAlgorithm) r3
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto L_0x003f
                boolean r5 = r1 instanceof javax.crypto.SecretKey
                if (r5 == 0) goto L_0x0037
                javax.crypto.SecretKey r1 = (javax.crypto.SecretKey) r1
                i0.l.a.f.d r5 = new i0.l.a.f.d
                r5.<init>(r1)
                goto L_0x0076
            L_0x0037:
                com.nimbusds.jose.KeyTypeException r5 = new com.nimbusds.jose.KeyTypeException
                java.lang.Class<javax.crypto.SecretKey> r0 = javax.crypto.SecretKey.class
                r5.<init>(r0)
                throw r5
            L_0x003f:
                java.util.Set<com.nimbusds.jose.JWSAlgorithm> r2 = i0.l.a.f.f.c
                com.nimbusds.jose.Algorithm r3 = r5.d
                com.nimbusds.jose.JWSAlgorithm r3 = (com.nimbusds.jose.JWSAlgorithm) r3
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto L_0x005f
                boolean r5 = r1 instanceof java.security.interfaces.RSAPublicKey
                if (r5 == 0) goto L_0x0057
                java.security.interfaces.RSAPublicKey r1 = (java.security.interfaces.RSAPublicKey) r1
                i0.l.a.f.f r5 = new i0.l.a.f.f
                r5.<init>(r1)
                goto L_0x0076
            L_0x0057:
                com.nimbusds.jose.KeyTypeException r5 = new com.nimbusds.jose.KeyTypeException
                java.lang.Class<java.security.interfaces.RSAPublicKey> r0 = java.security.interfaces.RSAPublicKey.class
                r5.<init>(r0)
                throw r5
            L_0x005f:
                java.util.Set<com.nimbusds.jose.JWSAlgorithm> r2 = i0.l.a.f.c.c
                com.nimbusds.jose.Algorithm r3 = r5.d
                com.nimbusds.jose.JWSAlgorithm r3 = (com.nimbusds.jose.JWSAlgorithm) r3
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto L_0x008c
                boolean r5 = r1 instanceof java.security.interfaces.ECPublicKey
                if (r5 == 0) goto L_0x0084
                java.security.interfaces.ECPublicKey r1 = (java.security.interfaces.ECPublicKey) r1
                i0.l.a.f.c r5 = new i0.l.a.f.c
                r5.<init>(r1)
            L_0x0076:
                i0.l.a.g.a r1 = r5.b
                i0.l.a.g.a r0 = r0.a
                java.security.Provider r0 = r0.a
                r1.a = r0
                java.lang.String r0 = "verifierFactory.createJW…KeyFromHeader(jwsHeader))"
                m0.n.b.i.d(r5, r0)
                return r5
            L_0x0084:
                com.nimbusds.jose.KeyTypeException r5 = new com.nimbusds.jose.KeyTypeException
                java.lang.Class<java.security.interfaces.ECPublicKey> r0 = java.security.interfaces.ECPublicKey.class
                r5.<init>(r0)
                throw r5
            L_0x008c:
                com.nimbusds.jose.JOSEException r0 = new com.nimbusds.jose.JOSEException
                java.lang.String r1 = "Unsupported JWS algorithm: "
                java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
                com.nimbusds.jose.Algorithm r5 = r5.d
                com.nimbusds.jose.JWSAlgorithm r5 = (com.nimbusds.jose.JWSAlgorithm) r5
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.JwsValidator.Default.getVerifier(com.nimbusds.jose.JWSHeader):i0.l.a.e");
        }

        private final boolean isValid(JWSObject jWSObject, List<? extends X509Certificate> list) throws JOSEException, CertificateException {
            boolean a;
            JWSHeader jWSHeader = jWSObject.q;
            i.d(jWSHeader, "jwsObject.header");
            if (jWSHeader.b2 != null) {
                ErrorReporter errorReporter2 = this.errorReporter;
                StringBuilder P0 = a.P0("Encountered a JWK in ");
                P0.append(jWSObject.q);
                errorReporter2.reportError(new IllegalArgumentException(P0.toString()));
            }
            Companion companion = Companion;
            JWSHeader jWSHeader2 = jWSObject.q;
            i.d(jWSHeader2, "jwsObject.header");
            JWSHeader sanitizedJwsHeader$3ds2sdk_release = companion.sanitizedJwsHeader$3ds2sdk_release(jWSHeader2);
            if (!isCertificateChainValid(sanitizedJwsHeader$3ds2sdk_release.f2, list)) {
                return false;
            }
            e verifier = getVerifier(sanitizedJwsHeader$3ds2sdk_release);
            synchronized (jWSObject) {
                jWSObject.b();
                try {
                    a = verifier.a(jWSObject.q, jWSObject.x.getBytes(c.a), jWSObject.y);
                    if (a) {
                        jWSObject.Y1.set(JWSObject.State.VERIFIED);
                    }
                } catch (JOSEException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new JOSEException(e2.getMessage(), e2);
                }
            }
            return a;
        }

        public JSONObject getPayload(String str, boolean z, List<? extends X509Certificate> list) throws JSONException, ParseException, JOSEException, CertificateException {
            i.e(str, "jws");
            i.e(list, "rootCerts");
            Base64URL[] a = JOSEObject.a(str);
            if (a.length == 3) {
                JWSObject jWSObject = new JWSObject(a[0], a[1], a[2]);
                if (z) {
                    i.d(jWSObject, "jwsObject");
                    if (!isValid(jWSObject, list)) {
                        throw new IllegalStateException("Could not validate JWS");
                    }
                }
                i.d(jWSObject, "jwsObject");
                return new JSONObject(jWSObject.c.toString());
            }
            throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0017 A[Catch:{ all -> 0x0011 }] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0032 A[Catch:{ all -> 0x0011 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean isCertificateChainValid(java.util.List<? extends com.nimbusds.jose.util.Base64> r3, java.util.List<? extends java.security.cert.X509Certificate> r4) {
            /*
                r2 = this;
                java.lang.String r0 = "rootCerts"
                m0.n.b.i.e(r4, r0)
                r0 = 1
                if (r3 == 0) goto L_0x0013
                boolean r1 = r3.isEmpty()     // Catch:{ all -> 0x0011 }
                if (r1 == 0) goto L_0x000f
                goto L_0x0013
            L_0x000f:
                r1 = 0
                goto L_0x0014
            L_0x0011:
                r3 = move-exception
                goto L_0x003e
            L_0x0013:
                r1 = r0
            L_0x0014:
                r1 = r1 ^ r0
                if (r1 == 0) goto L_0x0032
                boolean r1 = r4.isEmpty()     // Catch:{ all -> 0x0011 }
                r1 = r1 ^ r0
                if (r1 == 0) goto L_0x0026
                com.stripe.android.stripe3ds2.transaction.JwsValidator$Default$Companion r1 = Companion     // Catch:{ all -> 0x0011 }
                r1.validateChain(r3, r4)     // Catch:{ all -> 0x0011 }
                m0.i r3 = m0.i.a     // Catch:{ all -> 0x0011 }
                goto L_0x0042
            L_0x0026:
                java.lang.String r3 = "Root certificates are empty"
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0011 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0011 }
                r4.<init>(r3)     // Catch:{ all -> 0x0011 }
                throw r4     // Catch:{ all -> 0x0011 }
            L_0x0032:
                java.lang.String r3 = "JWSHeader's X.509 certificate chain is null or empty"
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0011 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0011 }
                r4.<init>(r3)     // Catch:{ all -> 0x0011 }
                throw r4     // Catch:{ all -> 0x0011 }
            L_0x003e:
                java.lang.Object r3 = i0.j.f.p.h.l0(r3)
            L_0x0042:
                java.lang.Throwable r4 = kotlin.Result.a(r3)
                if (r4 == 0) goto L_0x004d
                com.stripe.android.stripe3ds2.observability.ErrorReporter r1 = r2.errorReporter
                r1.reportError(r4)
            L_0x004d:
                boolean r3 = r3 instanceof kotlin.Result.Failure
                r3 = r3 ^ r0
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.JwsValidator.Default.isCertificateChainValid(java.util.List, java.util.List):boolean");
        }
    }

    JSONObject getPayload(String str, boolean z, List<? extends X509Certificate> list);
}
