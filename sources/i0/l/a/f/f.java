package i0.l.a.f;

import com.nimbusds.jose.JWSAlgorithm;
import i0.l.a.e;
import i0.l.a.f.h.d;
import i0.l.a.f.h.g;
import java.security.interfaces.RSAPublicKey;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: RSASSAVerifier */
public class f extends d implements e {
    public static final Set<JWSAlgorithm> c;
    public final g d;
    public final RSAPublicKey e;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWSAlgorithm.Y1);
        linkedHashSet.add(JWSAlgorithm.Z1);
        linkedHashSet.add(JWSAlgorithm.a2);
        linkedHashSet.add(JWSAlgorithm.f2);
        linkedHashSet.add(JWSAlgorithm.g2);
        linkedHashSet.add(JWSAlgorithm.h2);
        c = Collections.unmodifiableSet(linkedHashSet);
    }

    public f(RSAPublicKey rSAPublicKey) {
        super(c);
        g gVar = new g();
        this.d = gVar;
        if (rSAPublicKey != null) {
            this.e = rSAPublicKey;
            gVar.b((Set<String>) null);
            return;
        }
        throw new IllegalArgumentException("The public RSA key must not be null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0089 A[SYNTHETIC, Splitter:B:24:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[Catch:{ NoSuchAlgorithmException -> 0x0093 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3 A[SYNTHETIC, Splitter:B:34:0x00a3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.nimbusds.jose.JWSHeader r11, byte[] r12, com.nimbusds.jose.util.Base64URL r13) throws com.nimbusds.jose.JOSEException {
        /*
            r10 = this;
            i0.l.a.f.h.g r0 = r10.d
            boolean r0 = r0.a(r11)
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            com.nimbusds.jose.Algorithm r11 = r11.d
            com.nimbusds.jose.JWSAlgorithm r11 = (com.nimbusds.jose.JWSAlgorithm) r11
            i0.l.a.g.a r0 = r10.b
            java.security.Provider r0 = r0.a
            com.nimbusds.jose.JWSAlgorithm r2 = com.nimbusds.jose.JWSAlgorithm.Y1
            boolean r2 = r11.equals(r2)
            r3 = 0
            if (r2 == 0) goto L_0x001e
            java.lang.String r11 = "SHA256withRSA"
            goto L_0x0033
        L_0x001e:
            com.nimbusds.jose.JWSAlgorithm r2 = com.nimbusds.jose.JWSAlgorithm.Z1
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0029
            java.lang.String r11 = "SHA384withRSA"
            goto L_0x0033
        L_0x0029:
            com.nimbusds.jose.JWSAlgorithm r2 = com.nimbusds.jose.JWSAlgorithm.a2
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0035
            java.lang.String r11 = "SHA512withRSA"
        L_0x0033:
            r2 = r3
            goto L_0x0087
        L_0x0035:
            com.nimbusds.jose.JWSAlgorithm r2 = com.nimbusds.jose.JWSAlgorithm.f2
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x004f
            java.security.spec.PSSParameterSpec r11 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r6 = java.security.spec.MGF1ParameterSpec.SHA256
            r7 = 32
            r8 = 1
            java.lang.String r4 = "SHA-256"
            java.lang.String r5 = "MGF1"
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r2 = "SHA256withRSAandMGF1"
            goto L_0x0082
        L_0x004f:
            com.nimbusds.jose.JWSAlgorithm r2 = com.nimbusds.jose.JWSAlgorithm.g2
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0069
            java.security.spec.PSSParameterSpec r11 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r6 = java.security.spec.MGF1ParameterSpec.SHA384
            r7 = 48
            r8 = 1
            java.lang.String r4 = "SHA-384"
            java.lang.String r5 = "MGF1"
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r2 = "SHA384withRSAandMGF1"
            goto L_0x0082
        L_0x0069:
            com.nimbusds.jose.JWSAlgorithm r2 = com.nimbusds.jose.JWSAlgorithm.h2
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0118
            java.security.spec.PSSParameterSpec r11 = new java.security.spec.PSSParameterSpec
            java.security.spec.MGF1ParameterSpec r6 = java.security.spec.MGF1ParameterSpec.SHA512
            r7 = 64
            r8 = 1
            java.lang.String r4 = "SHA-512"
            java.lang.String r5 = "MGF1"
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r2 = "SHA512withRSAandMGF1"
        L_0x0082:
            java.lang.String r11 = "RSASSA-PSS"
            r9 = r3
            r3 = r2
            r2 = r9
        L_0x0087:
            if (r0 == 0) goto L_0x008e
            java.security.Signature r11 = java.security.Signature.getInstance(r11, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0093 }
            goto L_0x00a1
        L_0x008e:
            java.security.Signature r11 = java.security.Signature.getInstance(r11)     // Catch:{ NoSuchAlgorithmException -> 0x0093 }
            goto L_0x00a1
        L_0x0093:
            r11 = move-exception
            if (r3 == 0) goto L_0x0101
            if (r0 == 0) goto L_0x009d
            java.security.Signature r11 = java.security.Signature.getInstance(r3, r0)     // Catch:{ NoSuchAlgorithmException -> 0x00e9 }
            goto L_0x00a1
        L_0x009d:
            java.security.Signature r11 = java.security.Signature.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x00e9 }
        L_0x00a1:
            if (r2 == 0) goto L_0x00bf
            r11.setParameter(r2)     // Catch:{ InvalidAlgorithmParameterException -> 0x00a7 }
            goto L_0x00bf
        L_0x00a7:
            r11 = move-exception
            com.nimbusds.jose.JOSEException r12 = new com.nimbusds.jose.JOSEException
            java.lang.String r13 = "Invalid RSASSA-PSS salt length parameter: "
            java.lang.StringBuilder r13 = i0.d.a.a.a.P0(r13)
            java.lang.String r0 = r11.getMessage()
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13, r11)
            throw r12
        L_0x00bf:
            java.security.interfaces.RSAPublicKey r0 = r10.e     // Catch:{ InvalidKeyException -> 0x00d1 }
            r11.initVerify(r0)     // Catch:{ InvalidKeyException -> 0x00d1 }
            r11.update(r12)     // Catch:{ SignatureException -> 0x00d0 }
            byte[] r12 = r13.a()     // Catch:{ SignatureException -> 0x00d0 }
            boolean r11 = r11.verify(r12)     // Catch:{ SignatureException -> 0x00d0 }
            return r11
        L_0x00d0:
            return r1
        L_0x00d1:
            r11 = move-exception
            com.nimbusds.jose.JOSEException r12 = new com.nimbusds.jose.JOSEException
            java.lang.String r13 = "Invalid public RSA key: "
            java.lang.StringBuilder r13 = i0.d.a.a.a.P0(r13)
            java.lang.String r0 = r11.getMessage()
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13, r11)
            throw r12
        L_0x00e9:
            r11 = move-exception
            com.nimbusds.jose.JOSEException r12 = new com.nimbusds.jose.JOSEException
            java.lang.String r13 = "Unsupported RSASSA algorithm (after retry with alternative): "
            java.lang.StringBuilder r13 = i0.d.a.a.a.P0(r13)
            java.lang.String r0 = r11.getMessage()
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13, r11)
            throw r12
        L_0x0101:
            com.nimbusds.jose.JOSEException r12 = new com.nimbusds.jose.JOSEException
            java.lang.String r13 = "Unsupported RSASSA algorithm: "
            java.lang.StringBuilder r13 = i0.d.a.a.a.P0(r13)
            java.lang.String r0 = r11.getMessage()
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13, r11)
            throw r12
        L_0x0118:
            com.nimbusds.jose.JOSEException r12 = new com.nimbusds.jose.JOSEException
            java.util.Set<com.nimbusds.jose.JWSAlgorithm> r13 = c
            java.lang.String r11 = i0.j.f.p.h.y4(r11, r13)
            r12.<init>(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.l.a.f.f.a(com.nimbusds.jose.JWSHeader, byte[], com.nimbusds.jose.util.Base64URL):boolean");
    }
}
