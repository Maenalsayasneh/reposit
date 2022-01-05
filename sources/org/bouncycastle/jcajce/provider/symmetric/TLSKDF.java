package org.bouncycastle.jcajce.provider.symmetric;

import i0.d.a.a.a;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Objects;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.n;
import s0.a.b.b0.a0;
import s0.a.b.b0.p;
import s0.a.b.b0.v;
import s0.a.b.b0.x;
import s0.a.b.b0.y;
import s0.a.b.h0.g;
import s0.a.b.k0.y0;
import s0.a.b.s;
import s0.a.c.n.r;
import s0.a.g.j;

public class TLSKDF {

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = TLSKDF.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            a.u(a.Y0(a.Y0(a.Y0(a.Y0(sb, str, "$TLS10", configurableProvider, "SecretKeyFactory.TLS10KDF"), str, "$TLS11", configurableProvider, "SecretKeyFactory.TLS11KDF"), str, "$TLS12withSHA256", configurableProvider, "SecretKeyFactory.TLS12WITHSHA256KDF"), str, "$TLS12withSHA384", configurableProvider, "SecretKeyFactory.TLS12WITHSHA384KDF"), str, "$TLS12withSHA512", configurableProvider, "SecretKeyFactory.TLS12WITHSHA512KDF");
        }
    }

    public static final class TLS10 extends TLSKeyMaterialFactory {
        public TLS10() {
            super("TLS10KDF");
        }

        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof r) {
                return new SecretKeySpec(TLSKDF.PRF_legacy((r) keySpec), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public static final class TLS11 extends TLSKeyMaterialFactory {
        public TLS11() {
            super("TLS11KDF");
        }

        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof r) {
                return new SecretKeySpec(TLSKDF.PRF_legacy((r) keySpec), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public static class TLS12 extends TLSKeyMaterialFactory {
        private final s prf;

        public TLS12(String str, s sVar) {
            super(str);
            this.prf = sVar;
        }

        private byte[] PRF(r rVar, s sVar) {
            Objects.requireNonNull(rVar);
            j.c((String) null);
            throw null;
        }

        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (keySpec instanceof r) {
                return new SecretKeySpec(PRF((r) keySpec, this.prf), this.algName);
            }
            throw new InvalidKeySpecException("Invalid KeySpec");
        }
    }

    public static final class TLS12withSHA256 extends TLS12 {
        public TLS12withSHA256() {
            super("TLS12withSHA256KDF", new g(new x()));
        }
    }

    public static final class TLS12withSHA384 extends TLS12 {
        public TLS12withSHA384() {
            super("TLS12withSHA384KDF", new g(new y()));
        }
    }

    public static final class TLS12withSHA512 extends TLS12 {
        public TLS12withSHA512() {
            super("TLS12withSHA512KDF", new g(new a0()));
        }
    }

    public static class TLSKeyMaterialFactory extends BaseSecretKeyFactory {
        public TLSKeyMaterialFactory(String str) {
            super(str, (n) null);
        }
    }

    /* access modifiers changed from: private */
    public static byte[] PRF_legacy(r rVar) {
        new g(new p());
        new g(new v());
        Objects.requireNonNull(rVar);
        j.c((String) null);
        throw null;
    }

    /* access modifiers changed from: private */
    public static void hmac_hash(s sVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        sVar.init(new y0(bArr));
        int macSize = sVar.getMacSize();
        int length = ((bArr3.length + macSize) - 1) / macSize;
        int macSize2 = sVar.getMacSize();
        byte[] bArr4 = new byte[macSize2];
        byte[] bArr5 = new byte[sVar.getMacSize()];
        byte[] bArr6 = bArr2;
        int i = 0;
        while (i < length) {
            sVar.update(bArr6, 0, bArr6.length);
            sVar.doFinal(bArr4, 0);
            sVar.update(bArr4, 0, macSize2);
            sVar.update(bArr2, 0, bArr2.length);
            sVar.doFinal(bArr5, 0);
            int i2 = macSize * i;
            System.arraycopy(bArr5, 0, bArr3, i2, Math.min(macSize, bArr3.length - i2));
            i++;
            bArr6 = bArr4;
        }
    }
}
