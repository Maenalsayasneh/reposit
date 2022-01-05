package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.a.d3.m;
import s0.a.a.r;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.d.e.e;
import s0.a.e.b.h;
import s0.a.g.g;

public class BCECPublicKey implements ECPublicKey, org.bouncycastle.jce.interfaces.ECPublicKey {
    public static final long serialVersionUID = 2422789860422731812L;
    private String algorithm = "EC";
    private transient ProviderConfiguration configuration;
    private transient c0 ecPublicKey;
    private transient ECParameterSpec ecSpec;
    private boolean withCompression;

    public BCECPublicKey(String str, ECPublicKeySpec eCPublicKeySpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        ECParameterSpec params = eCPublicKeySpec.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new c0(EC5Util.convertPoint(params, eCPublicKeySpec.getW()), EC5Util.getDomainParameters(providerConfiguration, eCPublicKeySpec.getParams()));
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, BCECPublicKey bCECPublicKey) {
        this.algorithm = str;
        this.ecPublicKey = bCECPublicKey.ecPublicKey;
        this.ecSpec = bCECPublicKey.ecSpec;
        this.withCompression = bCECPublicKey.withCompression;
        this.configuration = bCECPublicKey.configuration;
    }

    public BCECPublicKey(String str, m0 m0Var, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.configuration = providerConfiguration;
        populateFromPubKeyInfo(m0Var);
    }

    public BCECPublicKey(String str, c0 c0Var, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        w wVar = c0Var.d;
        this.algorithm = str;
        this.ecPublicKey = c0Var;
        if (eCParameterSpec == null) {
            this.ecSpec = createSpec(EC5Util.convertCurve(wVar.g, wVar.a()), wVar);
        } else {
            this.ecSpec = eCParameterSpec;
        }
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, c0 c0Var, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.ecPublicKey = c0Var;
        this.ecSpec = null;
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(ECPublicKey eCPublicKey, ProviderConfiguration providerConfiguration) {
        this.algorithm = eCPublicKey.getAlgorithm();
        ECParameterSpec params = eCPublicKey.getParams();
        this.ecSpec = params;
        this.ecPublicKey = new c0(EC5Util.convertPoint(params, eCPublicKey.getW()), EC5Util.getDomainParameters(providerConfiguration, eCPublicKey.getParams()));
        this.configuration = providerConfiguration;
    }

    private ECParameterSpec createSpec(EllipticCurve ellipticCurve, w wVar) {
        return new ECParameterSpec(ellipticCurve, EC5Util.convertPoint(wVar.i), wVar.j, wVar.k.intValue());
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [s0.a.a.r] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void populateFromPubKeyInfo(s0.a.a.c3.m0 r7) {
        /*
            r6 = this;
            s0.a.a.c3.b r0 = r7.c
            s0.a.a.e r0 = r0.d
            s0.a.a.d3.f r0 = s0.a.a.d3.f.s(r0)
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r1 = r6.configuration
            s0.a.e.b.e r1 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.getCurve(r1, r0)
            java.security.spec.ECParameterSpec r2 = org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util.convertToSpec(r0, r1)
            r6.ecSpec = r2
            s0.a.a.o0 r7 = r7.d
            byte[] r7 = r7.B()
            s0.a.a.x0 r2 = new s0.a.a.x0
            r2.<init>((byte[]) r7)
            r3 = 0
            byte r3 = r7[r3]
            r4 = 4
            if (r3 != r4) goto L_0x0052
            r3 = 1
            byte r3 = r7[r3]
            int r4 = r7.length
            r5 = 2
            int r4 = r4 - r5
            if (r3 != r4) goto L_0x0052
            byte r3 = r7[r5]
            r4 = 3
            if (r3 == r5) goto L_0x0036
            byte r3 = r7[r5]
            if (r3 != r4) goto L_0x0052
        L_0x0036:
            int r3 = r1.l()
            int r3 = r3 + 7
            int r3 = r3 / 8
            int r5 = r7.length
            int r5 = r5 - r4
            if (r3 < r5) goto L_0x0052
            s0.a.a.r r7 = s0.a.a.r.x(r7)     // Catch:{ IOException -> 0x004a }
            r2 = r7
            s0.a.a.o r2 = (s0.a.a.o) r2     // Catch:{ IOException -> 0x004a }
            goto L_0x0052
        L_0x004a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "error recovering public key"
            r7.<init>(r0)
            throw r7
        L_0x0052:
            byte[] r7 = r2.c
            s0.a.a.x0 r2 = new s0.a.a.x0
            byte[] r7 = s0.a.e.b.b0.c.h3.I(r7)
            r2.<init>((byte[]) r7)
            s0.a.b.k0.c0 r7 = new s0.a.b.k0.c0
            byte[] r2 = r2.c     // Catch:{ all -> 0x0075 }
            s0.a.e.b.h r1 = r1.h(r2)     // Catch:{ all -> 0x0075 }
            s0.a.e.b.h r1 = r1.q()     // Catch:{ all -> 0x0075 }
            org.bouncycastle.jcajce.provider.config.ProviderConfiguration r2 = r6.configuration
            s0.a.b.k0.w r0 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.getDomainParameters((org.bouncycastle.jcajce.provider.config.ProviderConfiguration) r2, (s0.a.a.d3.f) r0)
            r7.<init>(r1, r0)
            r6.ecPublicKey = r7
            return
        L_0x0075:
            r7 = move-exception
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey.populateFromPubKeyInfo(s0.a.a.c3.m0):void");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        populateFromPubKeyInfo(m0.s(r.x((byte[]) objectInputStream.readObject())));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public c0 engineGetKeyParameters() {
        return this.ecPublicKey;
    }

    public e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : this.configuration.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPublicKey)) {
            return false;
        }
        BCECPublicKey bCECPublicKey = (BCECPublicKey) obj;
        if (!this.ecPublicKey.q.c(bCECPublicKey.ecPublicKey.q) || !engineGetSpec().equals(bCECPublicKey.engineGetSpec())) {
            return false;
        }
        return true;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public byte[] getEncoded() {
        boolean z = this.withCompression || g.b("org.bouncycastle.ec.enable_pc");
        return KeyUtil.getEncodedSubjectPublicKeyInfo(new b(m.h1, ECUtils.getDomainParametersFromName(this.ecSpec, z)), this.ecPublicKey.q.i(z));
    }

    public String getFormat() {
        return "X.509";
    }

    public e getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    public h getQ() {
        h hVar = this.ecPublicKey.q;
        return this.ecSpec == null ? hVar.h() : hVar;
    }

    public ECPoint getW() {
        return EC5Util.convertPoint(this.ecPublicKey.q);
    }

    public int hashCode() {
        return this.ecPublicKey.q.hashCode() ^ engineGetSpec().hashCode();
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.publicKeyToString("EC", this.ecPublicKey.q, engineGetSpec());
    }

    public BCECPublicKey(String str, c0 c0Var, e eVar, ProviderConfiguration providerConfiguration) {
        ECParameterSpec eCParameterSpec;
        w wVar = c0Var.d;
        this.algorithm = str;
        if (eVar == null) {
            eCParameterSpec = createSpec(EC5Util.convertCurve(wVar.g, wVar.a()), wVar);
        } else {
            eCParameterSpec = EC5Util.convertSpec(EC5Util.convertCurve(eVar.a, eVar.b), eVar);
        }
        this.ecSpec = eCParameterSpec;
        this.ecPublicKey = c0Var;
        this.configuration = providerConfiguration;
    }

    public BCECPublicKey(String str, s0.a.d.e.g gVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        e eVar = gVar.c;
        if (eVar != null) {
            EllipticCurve convertCurve = EC5Util.convertCurve(eVar.a, eVar.b);
            this.ecPublicKey = new c0(gVar.d, ECUtil.getDomainParameters(providerConfiguration, gVar.c));
            this.ecSpec = EC5Util.convertSpec(convertCurve, gVar.c);
        } else {
            this.ecPublicKey = new c0(providerConfiguration.getEcImplicitlyCa().a.e(gVar.d.d().t(), gVar.d.e().t()), EC5Util.getDomainParameters(providerConfiguration, (ECParameterSpec) null));
            this.ecSpec = null;
        }
        this.configuration = providerConfiguration;
    }
}
