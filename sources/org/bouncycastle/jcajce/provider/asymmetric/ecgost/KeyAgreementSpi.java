package org.bouncycastle.jcajce.provider.asymmetric.ecgost;

import i0.d.a.a.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jce.interfaces.ECPrivateKey;
import org.bouncycastle.jce.interfaces.ECPublicKey;
import s0.a.a.d3.l;
import s0.a.b.a0.g;
import s0.a.b.b0.d;
import s0.a.b.k0.b;
import s0.a.b.k0.b0;
import s0.a.b.k0.f1;
import s0.a.b.k0.w;
import s0.a.c.n.s;

public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final l converter = new l();
    private g agreement;
    private String kaAlgorithm;
    private w parameters;
    private byte[] result;

    public static class ECVKO extends KeyAgreementSpi {
        public ECVKO() {
            super("ECGOST3410", new g(new d()), (s0.a.b.l) null);
        }
    }

    public KeyAgreementSpi(String str, g gVar, s0.a.b.l lVar) {
        super(str, lVar);
        this.kaAlgorithm = str;
        this.agreement = gVar;
    }

    public static b generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        return publicKey instanceof BCECPublicKey ? ((BCECGOST3410PublicKey) publicKey).engineGetKeyParameters() : ECUtil.generatePublicKeyParameter(publicKey);
    }

    private static String getSimpleName(Class cls) {
        String name = cls.getName();
        return name.substring(name.lastIndexOf(46) + 1);
    }

    private void initFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException {
        if (key instanceof PrivateKey) {
            b0 b0Var = (b0) ECUtil.generatePrivateKeyParameter((PrivateKey) key);
            this.parameters = b0Var.d;
            byte[] a = algorithmParameterSpec instanceof s ? ((s) algorithmParameterSpec).a() : null;
            this.ukmParameters = a;
            this.agreement.b(new f1(b0Var, a));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.kaAlgorithm);
        sb.append(" key agreement requires ");
        throw new InvalidKeyException(a.y0(sb, getSimpleName(ECPrivateKey.class), " for initialisation"));
    }

    public byte[] calcSecret() {
        return this.result;
    }

    public Key engineDoPhase(Key key, boolean z) throws InvalidKeyException, IllegalStateException {
        if (this.parameters == null) {
            throw new IllegalStateException(a.y0(new StringBuilder(), this.kaAlgorithm, " not initialised."));
        } else if (!z) {
            throw new IllegalStateException(a.y0(new StringBuilder(), this.kaAlgorithm, " can only be between two parties."));
        } else if (key instanceof PublicKey) {
            try {
                this.result = this.agreement.a(generatePublicKeyParameter((PublicKey) key));
                return null;
            } catch (Exception e) {
                throw new InvalidKeyException(a.a0(e, a.P0("calculation failed: "))) {
                    public Throwable getCause() {
                        return e;
                    }
                };
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.kaAlgorithm);
            sb.append(" key agreement requires ");
            throw new InvalidKeyException(a.y0(sb, getSimpleName(ECPublicKey.class), " for doPhase"));
        }
    }

    public void engineInit(Key key, SecureRandom secureRandom) throws InvalidKeyException {
        initFromKey(key, (AlgorithmParameterSpec) null);
    }

    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (algorithmParameterSpec == null || (algorithmParameterSpec instanceof s)) {
            initFromKey(key, algorithmParameterSpec);
            return;
        }
        throw new InvalidAlgorithmParameterException("No algorithm parameters supported");
    }
}
