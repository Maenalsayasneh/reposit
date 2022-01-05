package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import m0.r.t.a.r.m.a1.a;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSABase;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import s0.a.b.b0.a0;
import s0.a.b.b0.q;
import s0.a.b.b0.v;
import s0.a.b.b0.w;
import s0.a.b.b0.x;
import s0.a.b.b0.y;
import s0.a.b.k;
import s0.a.b.k0.b;
import s0.a.b.k0.d1;
import s0.a.b.n;
import s0.a.b.n0.e;
import s0.a.b.n0.h;
import s0.a.b.n0.l;
import s0.a.b.n0.p;
import s0.a.b.n0.s;

public class SignatureSpi extends DSABase {

    public static class ecCVCDSA extends SignatureSpi {
        public ecCVCDSA() {
            super(new v(), new e(), p.a);
        }
    }

    public static class ecCVCDSA224 extends SignatureSpi {
        public ecCVCDSA224() {
            super(new w(), new e(), p.a);
        }
    }

    public static class ecCVCDSA256 extends SignatureSpi {
        public ecCVCDSA256() {
            super(new x(), new e(), p.a);
        }
    }

    public static class ecCVCDSA384 extends SignatureSpi {
        public ecCVCDSA384() {
            super(new y(), new e(), p.a);
        }
    }

    public static class ecCVCDSA512 extends SignatureSpi {
        public ecCVCDSA512() {
            super(new a0(), new e(), p.a);
        }
    }

    public static class ecDSA extends SignatureSpi {
        public ecDSA() {
            super(new v(), new e(), s.a);
        }
    }

    public static class ecDSA224 extends SignatureSpi {
        public ecDSA224() {
            super(new w(), new e(), s.a);
        }
    }

    public static class ecDSA256 extends SignatureSpi {
        public ecDSA256() {
            super(new x(), new e(), s.a);
        }
    }

    public static class ecDSA384 extends SignatureSpi {
        public ecDSA384() {
            super(new y(), new e(), s.a);
        }
    }

    public static class ecDSA512 extends SignatureSpi {
        public ecDSA512() {
            super(new a0(), new e(), s.a);
        }
    }

    public static class ecDSARipeMD160 extends SignatureSpi {
        public ecDSARipeMD160() {
            super(new s0.a.b.b0.s(), new e(), s.a);
        }
    }

    public static class ecDSASha3_224 extends SignatureSpi {
        public ecDSASha3_224() {
            super(a.R0(), new e(), s.a);
        }
    }

    public static class ecDSASha3_256 extends SignatureSpi {
        public ecDSASha3_256() {
            super(a.S0(), new e(), s.a);
        }
    }

    public static class ecDSASha3_384 extends SignatureSpi {
        public ecDSASha3_384() {
            super(a.T0(), new e(), s.a);
        }
    }

    public static class ecDSASha3_512 extends SignatureSpi {
        public ecDSASha3_512() {
            super(a.U0(), new e(), s.a);
        }
    }

    public static class ecDSAnone extends SignatureSpi {
        public ecDSAnone() {
            super(new q(), new e(), s.a);
        }
    }

    public static class ecDetDSA extends SignatureSpi {
        public ecDetDSA() {
            super(new v(), new e(new l(new v())), s.a);
        }
    }

    public static class ecDetDSA224 extends SignatureSpi {
        public ecDetDSA224() {
            super(new w(), new e(new l(new w())), s.a);
        }
    }

    public static class ecDetDSA256 extends SignatureSpi {
        public ecDetDSA256() {
            super(new x(), new e(new l(new x())), s.a);
        }
    }

    public static class ecDetDSA384 extends SignatureSpi {
        public ecDetDSA384() {
            super(new y(), new e(new l(new y())), s.a);
        }
    }

    public static class ecDetDSA512 extends SignatureSpi {
        public ecDetDSA512() {
            super(new a0(), new e(new l(new a0())), s.a);
        }
    }

    public static class ecDetDSASha3_224 extends SignatureSpi {
        public ecDetDSASha3_224() {
            super(a.R0(), new e(new l(a.R0())), s.a);
        }
    }

    public static class ecDetDSASha3_256 extends SignatureSpi {
        public ecDetDSASha3_256() {
            super(a.S0(), new e(new l(a.S0())), s.a);
        }
    }

    public static class ecDetDSASha3_384 extends SignatureSpi {
        public ecDetDSASha3_384() {
            super(a.T0(), new e(new l(a.T0())), s.a);
        }
    }

    public static class ecDetDSASha3_512 extends SignatureSpi {
        public ecDetDSASha3_512() {
            super(a.U0(), new e(new l(a.U0())), s.a);
        }
    }

    public static class ecNR extends SignatureSpi {
        public ecNR() {
            super(new v(), new h(), s.a);
        }
    }

    public static class ecNR224 extends SignatureSpi {
        public ecNR224() {
            super(new w(), new h(), s.a);
        }
    }

    public static class ecNR256 extends SignatureSpi {
        public ecNR256() {
            super(new x(), new h(), s.a);
        }
    }

    public static class ecNR384 extends SignatureSpi {
        public ecNR384() {
            super(new y(), new h(), s.a);
        }
    }

    public static class ecNR512 extends SignatureSpi {
        public ecNR512() {
            super(new a0(), new h(), s.a);
        }
    }

    public static class ecPlainDSARP160 extends SignatureSpi {
        public ecPlainDSARP160() {
            super(new s0.a.b.b0.s(), new e(), p.a);
        }
    }

    public SignatureSpi(n nVar, k kVar, s0.a.b.n0.a aVar) {
        super(nVar, kVar, aVar);
    }

    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    public void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        b generatePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
        this.digest.reset();
        SecureRandom secureRandom = this.appRandom;
        if (secureRandom != null) {
            this.signer.init(true, new d1(generatePrivateKeyParameter, secureRandom));
        } else {
            this.signer.init(true, generatePrivateKeyParameter);
        }
    }

    public void engineInitVerify(PublicKey publicKey) throws InvalidKeyException {
        b generatePublicKeyParameter = ECUtils.generatePublicKeyParameter(publicKey);
        this.digest.reset();
        this.signer.init(false, generatePublicKeyParameter);
    }
}
