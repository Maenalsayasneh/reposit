package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Objects;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import s0.a.b.a0.i;
import s0.a.b.a0.j;
import s0.a.b.a0.k;
import s0.a.b.a0.l.a;
import s0.a.b.b0.a0;
import s0.a.b.b0.x;
import s0.a.b.b0.y;
import s0.a.b.f0.r;
import s0.a.b.k0.b;
import s0.a.b.k0.s1;
import s0.a.b.l;
import s0.a.b.u;
import s0.a.c.n.e;
import s0.a.c.n.s;

public class KeyAgreementSpi extends BaseAgreementSpi {
    private u agreement;
    private e dhuSpec;
    private byte[] result;

    public static final class X25519 extends KeyAgreementSpi {
        public X25519() {
            super("X25519");
        }
    }

    public static class X25519UwithSHA256CKDF extends KeyAgreementSpi {
        public X25519UwithSHA256CKDF() {
            super("X25519UwithSHA256CKDF", new a(new x()));
        }
    }

    public static class X25519UwithSHA256KDF extends KeyAgreementSpi {
        public X25519UwithSHA256KDF() {
            super("X25519UwithSHA256KDF", new r(new x()));
        }
    }

    public static final class X25519withSHA256CKDF extends KeyAgreementSpi {
        public X25519withSHA256CKDF() {
            super("X25519withSHA256CKDF", new a(new x()));
        }
    }

    public static final class X25519withSHA256KDF extends KeyAgreementSpi {
        public X25519withSHA256KDF() {
            super("X25519withSHA256KDF", new r(new x()));
        }
    }

    public static class X25519withSHA384CKDF extends KeyAgreementSpi {
        public X25519withSHA384CKDF() {
            super("X25519withSHA384CKDF", new a(new y()));
        }
    }

    public static class X25519withSHA512CKDF extends KeyAgreementSpi {
        public X25519withSHA512CKDF() {
            super("X25519withSHA512CKDF", new a(new a0()));
        }
    }

    public static final class X448 extends KeyAgreementSpi {
        public X448() {
            super("X448");
        }
    }

    public static class X448UwithSHA512CKDF extends KeyAgreementSpi {
        public X448UwithSHA512CKDF() {
            super("X448UwithSHA512CKDF", new a(new a0()));
        }
    }

    public static class X448UwithSHA512KDF extends KeyAgreementSpi {
        public X448UwithSHA512KDF() {
            super("X448UwithSHA512KDF", new r(new a0()));
        }
    }

    public static final class X448withSHA256CKDF extends KeyAgreementSpi {
        public X448withSHA256CKDF() {
            super("X448withSHA256CKDF", new a(new x()));
        }
    }

    public static class X448withSHA384CKDF extends KeyAgreementSpi {
        public X448withSHA384CKDF() {
            super("X448withSHA384CKDF", new a(new y()));
        }
    }

    public static final class X448withSHA512CKDF extends KeyAgreementSpi {
        public X448withSHA512CKDF() {
            super("X448withSHA512CKDF", new a(new a0()));
        }
    }

    public static final class X448withSHA512KDF extends KeyAgreementSpi {
        public X448withSHA512KDF() {
            super("X448withSHA512KDF", new r(new a0()));
        }
    }

    public static final class XDH extends KeyAgreementSpi {
        public XDH() {
            super("XDH");
        }
    }

    public KeyAgreementSpi(String str) {
        super(str, (l) null);
    }

    public KeyAgreementSpi(String str, l lVar) {
        super(str, lVar);
    }

    private u getAgreement(String str) throws InvalidKeyException {
        if (this.kaAlgorithm.equals("XDH") || this.kaAlgorithm.startsWith(str)) {
            int indexOf = this.kaAlgorithm.indexOf(85);
            boolean startsWith = str.startsWith("X448");
            return indexOf > 0 ? startsWith ? new k(new j()) : new k(new i()) : startsWith ? new j() : new i();
        }
        StringBuilder P0 = i0.d.a.a.a.P0("inappropriate key for ");
        P0.append(this.kaAlgorithm);
        throw new InvalidKeyException(P0.toString());
    }

    public byte[] calcSecret() {
        return this.result;
    }

    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (this.agreement == null) {
            throw new IllegalStateException(i0.d.a.a.a.y0(new StringBuilder(), this.kaAlgorithm, " not initialised."));
        } else if (!z) {
            throw new IllegalStateException(i0.d.a.a.a.y0(new StringBuilder(), this.kaAlgorithm, " can only be between two parties."));
        } else if (key instanceof BCXDHPublicKey) {
            b engineGetKeyParameters = ((BCXDHPublicKey) key).engineGetKeyParameters();
            byte[] bArr = new byte[this.agreement.b()];
            this.result = bArr;
            e eVar = this.dhuSpec;
            if (eVar == null) {
                this.agreement.a(engineGetKeyParameters, bArr, 0);
                return null;
            }
            Objects.requireNonNull(eVar);
            throw null;
        } else {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
    }

    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        if (key instanceof BCXDHPrivateKey) {
            b engineGetKeyParameters = ((BCXDHPrivateKey) key).engineGetKeyParameters();
            this.agreement = getAgreement(engineGetKeyParameters instanceof s1 ? "X448" : "X25519");
            this.agreement.init(engineGetKeyParameters);
            if (this.kdf != null) {
                this.ukmParameters = new byte[0];
            } else {
                this.ukmParameters = null;
            }
        } else {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
    }

    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (key instanceof BCXDHPrivateKey) {
            b engineGetKeyParameters = ((BCXDHPrivateKey) key).engineGetKeyParameters();
            this.agreement = getAgreement(engineGetKeyParameters instanceof s1 ? "X448" : "X25519");
            this.ukmParameters = null;
            if (!(algorithmParameterSpec instanceof e)) {
                this.agreement.init(engineGetKeyParameters);
                if (!(algorithmParameterSpec instanceof s)) {
                    throw new InvalidAlgorithmParameterException("unknown ParameterSpec");
                } else if (this.kdf != null) {
                    byte[] a = ((s) algorithmParameterSpec).a();
                    this.ukmParameters = a;
                    if (this.kdf != null && a == null) {
                        this.ukmParameters = new byte[0];
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("no KDF specified for UserKeyingMaterialSpec");
                }
            } else if (this.kaAlgorithm.indexOf(85) < 0) {
                throw new InvalidAlgorithmParameterException("agreement algorithm not DHU based");
            } else {
                e eVar = (e) algorithmParameterSpec;
                this.dhuSpec = eVar;
                this.ukmParameters = eVar.a();
                Objects.requireNonNull(this.dhuSpec);
                throw null;
            }
        } else {
            throw new InvalidKeyException("cannot identify XDH private key");
        }
    }
}
