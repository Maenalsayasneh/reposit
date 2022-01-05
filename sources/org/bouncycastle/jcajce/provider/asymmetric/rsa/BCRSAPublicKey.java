package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import org.bouncycastle.jcajce.provider.asymmetric.util.KeyUtil;
import s0.a.a.c3.b;
import s0.a.a.c3.m0;
import s0.a.a.e;
import s0.a.a.v0;
import s0.a.a.w2.n;
import s0.a.a.w2.t;
import s0.a.b.k0.k1;
import s0.a.g.j;

public class BCRSAPublicKey implements RSAPublicKey {
    public static final b DEFAULT_ALGORITHM_IDENTIFIER = new b(n.n, v0.c);
    public static final long serialVersionUID = 2675817738516720772L;
    private transient b algorithmIdentifier;
    private BigInteger modulus;
    private BigInteger publicExponent;
    private transient k1 rsaPublicKey;

    public BCRSAPublicKey(RSAPublicKey rSAPublicKey) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKey.getModulus();
        this.publicExponent = rSAPublicKey.getPublicExponent();
        this.rsaPublicKey = new k1(false, this.modulus, this.publicExponent);
    }

    public BCRSAPublicKey(RSAPublicKeySpec rSAPublicKeySpec) {
        this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        this.modulus = rSAPublicKeySpec.getModulus();
        this.publicExponent = rSAPublicKeySpec.getPublicExponent();
        this.rsaPublicKey = new k1(false, this.modulus, this.publicExponent);
    }

    public BCRSAPublicKey(b bVar, k1 k1Var) {
        this.algorithmIdentifier = bVar;
        this.modulus = k1Var.x;
        this.publicExponent = k1Var.y;
        this.rsaPublicKey = k1Var;
    }

    public BCRSAPublicKey(m0 m0Var) {
        populateFromPublicKeyInfo(m0Var);
    }

    public BCRSAPublicKey(k1 k1Var) {
        this(DEFAULT_ALGORITHM_IDENTIFIER, k1Var);
    }

    private void populateFromPublicKeyInfo(m0 m0Var) {
        try {
            t s = t.s(m0Var.t());
            this.algorithmIdentifier = m0Var.c;
            this.modulus = s.c;
            this.publicExponent = s.d;
            this.rsaPublicKey = new k1(false, this.modulus, this.publicExponent);
        } catch (IOException unused) {
            throw new IllegalArgumentException("invalid info structure in RSA public key");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        try {
            this.algorithmIdentifier = b.s(objectInputStream.readObject());
        } catch (Exception unused) {
            this.algorithmIdentifier = DEFAULT_ALGORITHM_IDENTIFIER;
        }
        this.rsaPublicKey = new k1(false, this.modulus, this.publicExponent);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        if (!this.algorithmIdentifier.equals(DEFAULT_ALGORITHM_IDENTIFIER)) {
            objectOutputStream.writeObject(this.algorithmIdentifier.getEncoded());
        }
    }

    public k1 engineGetKeyParameters() {
        return this.rsaPublicKey;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RSAPublicKey)) {
            return false;
        }
        RSAPublicKey rSAPublicKey = (RSAPublicKey) obj;
        return getModulus().equals(rSAPublicKey.getModulus()) && getPublicExponent().equals(rSAPublicKey.getPublicExponent());
    }

    public String getAlgorithm() {
        return this.algorithmIdentifier.c.w(n.w) ? "RSASSA-PSS" : "RSA";
    }

    public byte[] getEncoded() {
        return KeyUtil.getEncodedSubjectPublicKeyInfo(this.algorithmIdentifier, (e) new t(getModulus(), getPublicExponent()));
    }

    public String getFormat() {
        return "X.509";
    }

    public BigInteger getModulus() {
        return this.modulus;
    }

    public BigInteger getPublicExponent() {
        return this.publicExponent;
    }

    public int hashCode() {
        return getModulus().hashCode() ^ getPublicExponent().hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = j.a;
        stringBuffer.append("RSA Public Key [");
        stringBuffer.append(RSAUtil.generateKeyFingerprint(getModulus()));
        stringBuffer.append("]");
        stringBuffer.append(",[");
        stringBuffer.append(RSAUtil.generateExponentFingerprint(getPublicExponent()));
        stringBuffer.append("]");
        stringBuffer.append(str);
        stringBuffer.append("        modulus: ");
        stringBuffer.append(getModulus().toString(16));
        stringBuffer.append(str);
        stringBuffer.append("public exponent: ");
        stringBuffer.append(getPublicExponent().toString(16));
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
