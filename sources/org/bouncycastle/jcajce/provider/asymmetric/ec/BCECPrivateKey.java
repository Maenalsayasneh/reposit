package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.a.d3.f;
import s0.a.a.d3.m;
import s0.a.a.k;
import s0.a.a.n;
import s0.a.a.o0;
import s0.a.a.r;
import s0.a.a.v;
import s0.a.a.w2.p;
import s0.a.a.y2.a;
import s0.a.b.k0.b0;
import s0.a.b.k0.w;
import s0.a.d.d.e;

public class BCECPrivateKey implements ECPrivateKey, org.bouncycastle.jce.interfaces.ECPrivateKey, e {
    public static final long serialVersionUID = 994553197664784084L;
    private String algorithm = "EC";
    private transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    private transient ProviderConfiguration configuration;
    private transient BigInteger d;
    private transient ECParameterSpec ecSpec;
    private transient o0 publicKey;
    private boolean withCompression;

    public BCECPrivateKey() {
    }

    public BCECPrivateKey(String str, ECPrivateKeySpec eCPrivateKeySpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.d = eCPrivateKeySpec.getS();
        this.ecSpec = eCPrivateKeySpec.getParams();
        this.configuration = providerConfiguration;
    }

    public BCECPrivateKey(String str, BCECPrivateKey bCECPrivateKey) {
        this.algorithm = str;
        this.d = bCECPrivateKey.d;
        this.ecSpec = bCECPrivateKey.ecSpec;
        this.withCompression = bCECPrivateKey.withCompression;
        this.attrCarrier = bCECPrivateKey.attrCarrier;
        this.publicKey = bCECPrivateKey.publicKey;
        this.configuration = bCECPrivateKey.configuration;
    }

    public BCECPrivateKey(String str, p pVar, ProviderConfiguration providerConfiguration) throws IOException {
        this.algorithm = str;
        this.configuration = providerConfiguration;
        populateFromPrivKeyInfo(pVar);
    }

    public BCECPrivateKey(String str, b0 b0Var, BCECPublicKey bCECPublicKey, ECParameterSpec eCParameterSpec, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.d = b0Var.q;
        this.configuration = providerConfiguration;
        if (eCParameterSpec == null) {
            w wVar = b0Var.d;
            eCParameterSpec = new ECParameterSpec(EC5Util.convertCurve(wVar.g, wVar.a()), EC5Util.convertPoint(wVar.i), wVar.j, wVar.k.intValue());
        }
        this.ecSpec = eCParameterSpec;
        this.publicKey = getPublicKeyDetails(bCECPublicKey);
    }

    public BCECPrivateKey(ECPrivateKey eCPrivateKey, ProviderConfiguration providerConfiguration) {
        this.d = eCPrivateKey.getS();
        this.algorithm = eCPrivateKey.getAlgorithm();
        this.ecSpec = eCPrivateKey.getParams();
        this.configuration = providerConfiguration;
    }

    private o0 getPublicKeyDetails(BCECPublicKey bCECPublicKey) {
        try {
            return m0.s(r.x(bCECPublicKey.getEncoded())).d;
        } catch (IOException unused) {
            return null;
        }
    }

    private void populateFromPrivKeyInfo(p pVar) throws IOException {
        f s = f.s(pVar.d.d);
        this.ecSpec = EC5Util.convertToSpec(s, EC5Util.getCurve(this.configuration, s));
        s0.a.a.e u = pVar.u();
        if (u instanceof k) {
            this.d = k.B(u).E();
            return;
        }
        a s2 = a.s(u);
        this.d = s2.t();
        this.publicKey = s2.v();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.configuration = BouncyCastleProvider.CONFIGURATION;
        populateFromPrivKeyInfo(p.s(r.x((byte[]) objectInputStream.readObject())));
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public s0.a.d.e.e engineGetSpec() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        return eCParameterSpec != null ? EC5Util.convertSpec(eCParameterSpec) : this.configuration.getEcImplicitlyCa();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BCECPrivateKey)) {
            return false;
        }
        BCECPrivateKey bCECPrivateKey = (BCECPrivateKey) obj;
        return getD().equals(bCECPrivateKey.getD()) && engineGetSpec().equals(bCECPrivateKey.engineGetSpec());
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public s0.a.a.e getBagAttribute(n nVar) {
        return this.attrCarrier.getBagAttribute(nVar);
    }

    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    public BigInteger getD() {
        return this.d;
    }

    public byte[] getEncoded() {
        f domainParametersFromName = ECUtils.getDomainParametersFromName(this.ecSpec, this.withCompression);
        ECParameterSpec eCParameterSpec = this.ecSpec;
        int orderBitLength = eCParameterSpec == null ? ECUtil.getOrderBitLength(this.configuration, (BigInteger) null, getS()) : ECUtil.getOrderBitLength(this.configuration, eCParameterSpec.getOrder(), getS());
        try {
            return new p(new b(m.h1, domainParametersFromName), this.publicKey != null ? new a(orderBitLength, getS(), this.publicKey, domainParametersFromName) : new a(orderBitLength, getS(), (o0) null, domainParametersFromName), (v) null, (byte[]) null).r("DER");
        } catch (IOException unused) {
            return null;
        }
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public s0.a.d.e.e getParameters() {
        ECParameterSpec eCParameterSpec = this.ecSpec;
        if (eCParameterSpec == null) {
            return null;
        }
        return EC5Util.convertSpec(eCParameterSpec);
    }

    public ECParameterSpec getParams() {
        return this.ecSpec;
    }

    public BigInteger getS() {
        return this.d;
    }

    public int hashCode() {
        return getD().hashCode() ^ engineGetSpec().hashCode();
    }

    public void setBagAttribute(n nVar, s0.a.a.e eVar) {
        this.attrCarrier.setBagAttribute(nVar, eVar);
    }

    public void setPointFormat(String str) {
        this.withCompression = !"UNCOMPRESSED".equalsIgnoreCase(str);
    }

    public String toString() {
        return ECUtil.privateKeyToString("EC", this.d, engineGetSpec());
    }

    public BCECPrivateKey(String str, b0 b0Var, BCECPublicKey bCECPublicKey, s0.a.d.e.e eVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.d = b0Var.q;
        this.configuration = providerConfiguration;
        if (eVar == null) {
            w wVar = b0Var.d;
            this.ecSpec = new ECParameterSpec(EC5Util.convertCurve(wVar.g, wVar.a()), EC5Util.convertPoint(wVar.i), wVar.j, wVar.k.intValue());
        } else {
            this.ecSpec = EC5Util.convertSpec(EC5Util.convertCurve(eVar.a, eVar.b), eVar);
        }
        try {
            this.publicKey = getPublicKeyDetails(bCECPublicKey);
        } catch (Exception unused) {
            this.publicKey = null;
        }
    }

    public BCECPrivateKey(String str, b0 b0Var, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.d = b0Var.q;
        this.ecSpec = null;
        this.configuration = providerConfiguration;
    }

    public BCECPrivateKey(String str, s0.a.d.e.f fVar, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.d = fVar.d;
        s0.a.d.e.e eVar = fVar.c;
        this.ecSpec = eVar != null ? EC5Util.convertSpec(EC5Util.convertCurve(eVar.a, eVar.b), fVar.c) : null;
        this.configuration = providerConfiguration;
    }
}
