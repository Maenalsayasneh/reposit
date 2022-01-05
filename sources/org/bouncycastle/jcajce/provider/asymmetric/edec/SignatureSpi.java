package org.bouncycastle.jcajce.provider.asymmetric.edec;

import i0.d.a.a.a;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import org.bouncycastle.crypto.CryptoException;
import s0.a.b.k0.b;
import s0.a.b.k0.h0;
import s0.a.b.k0.i0;
import s0.a.b.n0.i;
import s0.a.b.n0.j;
import s0.a.b.v;

public class SignatureSpi extends java.security.SignatureSpi {
    private static final byte[] EMPTY_CONTEXT = new byte[0];
    private final String algorithm;
    private v signer;

    public static final class Ed25519 extends SignatureSpi {
        public Ed25519() {
            super("Ed25519");
        }
    }

    public static final class Ed448 extends SignatureSpi {
        public Ed448() {
            super("Ed448");
        }
    }

    public static final class EdDSA extends SignatureSpi {
        public EdDSA() {
            super((String) null);
        }
    }

    public SignatureSpi(String str) {
        this.algorithm = str;
    }

    private v getSigner(String str) throws InvalidKeyException {
        String str2 = this.algorithm;
        if (str2 == null || str.equals(str2)) {
            return str.equals("Ed448") ? new j(EMPTY_CONTEXT) : new i();
        }
        StringBuilder P0 = a.P0("inappropriate key for ");
        P0.append(this.algorithm);
        throw new InvalidKeyException(P0.toString());
    }

    public Object engineGetParameter(String str) throws InvalidParameterException {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof BCEdDSAPrivateKey) {
            b engineGetKeyParameters = ((BCEdDSAPrivateKey) privateKey).engineGetKeyParameters();
            this.signer = getSigner(engineGetKeyParameters instanceof h0 ? "Ed448" : "Ed25519");
            this.signer.init(true, engineGetKeyParameters);
            return;
        }
        throw new InvalidKeyException("cannot identify EdDSA private key");
    }

    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof BCEdDSAPublicKey) {
            b engineGetKeyParameters = ((BCEdDSAPublicKey) publicKey).engineGetKeyParameters();
            this.signer = getSigner(engineGetKeyParameters instanceof i0 ? "Ed448" : "Ed25519");
            this.signer.init(false, engineGetKeyParameters);
            return;
        }
        throw new InvalidKeyException("cannot identify EdDSA public key");
    }

    public void engineSetParameter(String str, Object obj) throws InvalidParameterException {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public byte[] engineSign() throws SignatureException {
        try {
            return this.signer.b();
        } catch (CryptoException e) {
            throw new SignatureException(e.getMessage());
        }
    }

    public void engineUpdate(byte b) throws SignatureException {
        this.signer.update(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.signer.update(bArr, i, i2);
    }

    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.signer.a(bArr);
    }
}
