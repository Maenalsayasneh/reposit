package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import s0.a.b.b0.x;
import s0.a.b.i;
import s0.a.b.k0.b1;
import s0.a.b.k0.d1;
import s0.a.b.n0.r;
import s0.a.c.n.o;
import s0.a.c.o.a;
import s0.a.c.o.c;
import s0.a.e.b.b0.c.h3;

public class GMSignatureSpi extends SignatureSpi {
    private AlgorithmParameters engineParams;
    private final c helper = new a();
    private o paramSpec;
    private final r signer;

    public static class sha256WithSM2 extends GMSignatureSpi {
        public sha256WithSM2() {
            super(new r(new x()));
        }
    }

    public static class sm3WithSM2 extends GMSignatureSpi {
        public sm3WithSM2() {
            super(new r());
        }
    }

    public GMSignatureSpi(r rVar) {
        this.signer = rVar;
    }

    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters f = this.helper.f("PSS");
                this.engineParams = f;
                f.init(this.paramSpec);
            } catch (Exception e) {
                throw new RuntimeException(e.toString());
            }
        }
        return this.engineParams;
    }

    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        i generatePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = this.appRandom;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new d1(generatePrivateKeyParameter, secureRandom);
        }
        if (this.paramSpec != null) {
            this.signer.init(true, new b1(generatePrivateKeyParameter, h3.I((byte[]) null)));
        } else {
            this.signer.init(true, generatePrivateKeyParameter);
        }
    }

    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        i generatePublicKeyParameter = ECUtils.generatePublicKeyParameter(publicKey);
        if (this.paramSpec != null) {
            generatePublicKeyParameter = new b1(generatePublicKeyParameter, h3.I((byte[]) null));
        }
        this.signer.init(false, generatePublicKeyParameter);
    }

    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidAlgorithmParameterException {
        if (algorithmParameterSpec instanceof o) {
            this.paramSpec = (o) algorithmParameterSpec;
            return;
        }
        throw new InvalidAlgorithmParameterException("only SM2ParameterSpec supported");
    }

    public byte[] engineSign() throws SignatureException {
        try {
            return this.signer.b();
        } catch (CryptoException e) {
            StringBuilder P0 = i0.d.a.a.a.P0("unable to create signature: ");
            P0.append(e.getMessage());
            throw new SignatureException(P0.toString());
        }
    }

    public void engineUpdate(byte b) throws SignatureException {
        this.signer.h.update(b);
    }

    public boolean engineVerify(byte[] bArr) throws SignatureException {
        return this.signer.a(bArr);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) throws SignatureException {
        this.signer.h.update(bArr, i, i2);
    }
}
