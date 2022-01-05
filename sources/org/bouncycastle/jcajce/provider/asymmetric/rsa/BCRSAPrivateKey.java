package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.RSAPrivateKeySpec;
import java.util.Enumeration;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.PKCS12BagAttributeCarrierImpl;
import s0.a.a.c3.b;
import s0.a.a.w2.n;
import s0.a.a.w2.s;
import s0.a.b.k0.k1;
import s0.a.d.d.e;
import s0.a.g.j;

public class BCRSAPrivateKey implements RSAPrivateKey, e {
    private static BigInteger ZERO = BigInteger.valueOf(0);
    public static final long serialVersionUID = 5110188922551353628L;
    public transient b algorithmIdentifier;
    private byte[] algorithmIdentifierEnc;
    public transient PKCS12BagAttributeCarrierImpl attrCarrier = new PKCS12BagAttributeCarrierImpl();
    public BigInteger modulus;
    public BigInteger privateExponent;
    public transient k1 rsaPrivateKey;

    public BCRSAPrivateKey(RSAPrivateKey rSAPrivateKey) {
        b bVar = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.algorithmIdentifier = bVar;
        this.modulus = rSAPrivateKey.getModulus();
        this.privateExponent = rSAPrivateKey.getPrivateExponent();
        this.rsaPrivateKey = new k1(true, this.modulus, this.privateExponent);
    }

    public BCRSAPrivateKey(RSAPrivateKeySpec rSAPrivateKeySpec) {
        b bVar = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.algorithmIdentifier = bVar;
        this.modulus = rSAPrivateKeySpec.getModulus();
        this.privateExponent = rSAPrivateKeySpec.getPrivateExponent();
        this.rsaPrivateKey = new k1(true, this.modulus, this.privateExponent);
    }

    public BCRSAPrivateKey(b bVar, s sVar) {
        b bVar2 = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar2);
        this.algorithmIdentifier = bVar2;
        this.algorithmIdentifier = bVar;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.modulus = sVar.d;
        this.privateExponent = sVar.x;
        this.rsaPrivateKey = new k1(true, this.modulus, this.privateExponent);
    }

    private static byte[] getEncoding(b bVar) {
        try {
            return bVar.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        if (this.algorithmIdentifierEnc == null) {
            this.algorithmIdentifierEnc = getEncoding(BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER);
        }
        this.algorithmIdentifier = b.s(this.algorithmIdentifierEnc);
        this.attrCarrier = new PKCS12BagAttributeCarrierImpl();
        this.rsaPrivateKey = new k1(true, this.modulus, this.privateExponent);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    public k1 engineGetKeyParameters() {
        return this.rsaPrivateKey;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RSAPrivateKey)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        RSAPrivateKey rSAPrivateKey = (RSAPrivateKey) obj;
        return getModulus().equals(rSAPrivateKey.getModulus()) && getPrivateExponent().equals(rSAPrivateKey.getPrivateExponent());
    }

    public String getAlgorithm() {
        return this.algorithmIdentifier.c.w(n.w) ? "RSASSA-PSS" : "RSA";
    }

    public s0.a.a.e getBagAttribute(s0.a.a.n nVar) {
        return this.attrCarrier.getBagAttribute(nVar);
    }

    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    public byte[] getEncoded() {
        b bVar = this.algorithmIdentifier;
        BigInteger modulus2 = getModulus();
        BigInteger bigInteger = ZERO;
        BigInteger privateExponent2 = getPrivateExponent();
        BigInteger bigInteger2 = ZERO;
        return KeyUtil.getEncodedPrivateKeyInfo(bVar, new s(modulus2, bigInteger, privateExponent2, bigInteger2, bigInteger2, bigInteger2, bigInteger2, bigInteger2));
    }

    public String getFormat() {
        return "PKCS#8";
    }

    public BigInteger getModulus() {
        return this.modulus;
    }

    public BigInteger getPrivateExponent() {
        return this.privateExponent;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPrivateExponent().hashCode();
    }

    public void setBagAttribute(s0.a.a.n nVar, s0.a.a.e eVar) {
        this.attrCarrier.setBagAttribute(nVar, eVar);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = j.a;
        stringBuffer.append("RSA Private Key [");
        stringBuffer.append(RSAUtil.generateKeyFingerprint(getModulus()));
        stringBuffer.append("],[]");
        stringBuffer.append(str);
        stringBuffer.append("            modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public BCRSAPrivateKey(b bVar, k1 k1Var) {
        b bVar2 = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar2);
        this.algorithmIdentifier = bVar2;
        this.algorithmIdentifier = bVar;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.modulus = k1Var.x;
        this.privateExponent = k1Var.y;
        this.rsaPrivateKey = k1Var;
    }

    public BCRSAPrivateKey(k1 k1Var) {
        b bVar = BCRSAPublicKey.DEFAULT_ALGORITHM_IDENTIFIER;
        this.algorithmIdentifierEnc = getEncoding(bVar);
        this.algorithmIdentifier = bVar;
        this.modulus = k1Var.x;
        this.privateExponent = k1Var.y;
        this.rsaPrivateKey = k1Var;
    }
}
