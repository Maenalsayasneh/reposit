package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import s0.a.a.g2.a;
import s0.a.a.g2.c;
import s0.a.a.n;
import s0.a.a.o;
import s0.a.a.r;
import s0.a.a.s;
import s0.a.b.e;
import s0.a.b.e0.u;
import s0.a.b.e0.v;
import s0.a.b.f;
import s0.a.b.i0.m;
import s0.a.b.j;
import s0.a.c.n.h;
import s0.a.e.b.b0.c.h3;

public final class GOST28147 {
    /* access modifiers changed from: private */
    public static Map<String, n> nameMappings = new HashMap();
    private static Map<n, String> oidMappings = new HashMap();

    public static class AlgParamGen extends BaseAlgorithmParameterGenerator {
        public byte[] iv = new byte[8];
        public byte[] sBox = u.g("E-A");

        public AlgorithmParameters engineGenerateParameters() {
            if (this.random == null) {
                this.random = j.a();
            }
            this.random.nextBytes(this.iv);
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance("GOST28147");
                createParametersInstance.init(new h(this.sBox, this.iv));
                return createParametersInstance;
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec instanceof h) {
                this.sBox = ((h) algorithmParameterSpec).b();
                return;
            }
            throw new InvalidAlgorithmParameterException("parameter spec not supported");
        }
    }

    public static class AlgParams extends BaseAlgParams {
        private byte[] iv;
        private n sBox = a.h;

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else if (algorithmParameterSpec instanceof h) {
                this.iv = ((h) algorithmParameterSpec).a();
                try {
                    this.sBox = BaseAlgParams.getSBoxOID(((h) algorithmParameterSpec).b());
                } catch (IllegalArgumentException e) {
                    throw new InvalidParameterSpecException(e.getMessage());
                }
            } else {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
        }

        public String engineToString() {
            return "GOST 28147 IV Parameters";
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            if (cls == h.class || cls == AlgorithmParameterSpec.class) {
                return new h(this.sBox, this.iv);
            }
            throw new InvalidParameterSpecException(i0.d.a.a.a.W(cls, i0.d.a.a.a.P0("AlgorithmParameterSpec not recognized: ")));
        }

        public byte[] localGetEncoded() throws IOException {
            return new c(this.iv, this.sBox).getEncoded();
        }

        public void localInit(byte[] bArr) throws IOException {
            r x = r.x(bArr);
            if (x instanceof o) {
                this.iv = o.B(x).c;
            } else if (x instanceof s) {
                c s = c.s(x);
                this.sBox = s.d;
                this.iv = h3.I(s.c.c);
            } else {
                throw new IOException("Unable to recognize parameters");
            }
        }
    }

    public static abstract class BaseAlgParams extends BaseAlgorithmParameters {
        private byte[] iv;
        private n sBox = a.h;

        public static n getSBoxOID(String str) {
            n nVar = str != null ? (n) GOST28147.nameMappings.get(s0.a.g.j.g(str)) : null;
            if (nVar != null) {
                return nVar;
            }
            throw new IllegalArgumentException(i0.d.a.a.a.n0("Unknown SBOX name: ", str));
        }

        public static n getSBoxOID(byte[] bArr) {
            Enumeration keys = u.j.keys();
            while (keys.hasMoreElements()) {
                String str = (String) keys.nextElement();
                if (Arrays.equals((byte[]) u.j.get(str), bArr)) {
                    return getSBoxOID(str);
                }
            }
            throw new IllegalArgumentException("SBOX provided did not map to a known one");
        }

        public final byte[] engineGetEncoded() throws IOException {
            return engineGetEncoded("ASN.1");
        }

        public final byte[] engineGetEncoded(String str) throws IOException {
            if (isASN1FormatString(str)) {
                return localGetEncoded();
            }
            throw new IOException(i0.d.a.a.a.n0("Unknown parameter format: ", str));
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.iv = ((IvParameterSpec) algorithmParameterSpec).getIV();
            } else if (algorithmParameterSpec instanceof h) {
                this.iv = ((h) algorithmParameterSpec).a();
                try {
                    this.sBox = getSBoxOID(((h) algorithmParameterSpec).b());
                } catch (IllegalArgumentException e) {
                    throw new InvalidParameterSpecException(e.getMessage());
                }
            } else {
                throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
            }
        }

        public final void engineInit(byte[] bArr) throws IOException {
            engineInit(bArr, "ASN.1");
        }

        public final void engineInit(byte[] bArr, String str) throws IOException {
            Objects.requireNonNull(bArr, "Encoded parameters cannot be null");
            if (isASN1FormatString(str)) {
                try {
                    localInit(bArr);
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new IOException(i0.d.a.a.a.a0(e2, i0.d.a.a.a.P0("Parameter parsing failed: ")));
                }
            } else {
                throw new IOException(i0.d.a.a.a.n0("Unknown parameter format: ", str));
            }
        }

        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == IvParameterSpec.class) {
                return new IvParameterSpec(this.iv);
            }
            if (cls == h.class || cls == AlgorithmParameterSpec.class) {
                return new h(this.sBox, this.iv);
            }
            throw new InvalidParameterSpecException(i0.d.a.a.a.W(cls, i0.d.a.a.a.P0("AlgorithmParameterSpec not recognized: ")));
        }

        public byte[] localGetEncoded() throws IOException {
            return new c(this.iv, this.sBox).getEncoded();
        }

        public abstract void localInit(byte[] bArr) throws IOException;
    }

    public static class CBC extends BaseBlockCipher {
        public CBC() {
            super((e) new s0.a.b.i0.c(new u()), 64);
        }
    }

    public static class CryptoProWrap extends BaseWrapCipher {
        public CryptoProWrap() {
            super(new s0.a.b.e0.n());
        }
    }

    public static class ECB extends BaseBlockCipher {
        public ECB() {
            super((e) new u());
        }
    }

    public static class GCFB extends BaseBlockCipher {
        public GCFB() {
            super(new f(new m(new u())), 64);
        }
    }

    public static class GostWrap extends BaseWrapCipher {
        public GostWrap() {
            super(new v());
        }
    }

    public static class KeyGen extends BaseKeyGenerator {
        public KeyGen() {
            this(256);
        }

        public KeyGen(int i) {
            super("GOST28147", i, new s0.a.b.h());
        }
    }

    public static class Mac extends BaseMac {
        public Mac() {
            super(new s0.a.b.h0.f());
        }
    }

    public static class Mappings extends AlgorithmProvider {
        private static final String PREFIX = GOST28147.class.getName();

        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder sb = new StringBuilder();
            String str = PREFIX;
            i0.d.a.a.a.u(sb, str, "$ECB", configurableProvider, "Cipher.GOST28147");
            StringBuilder f1 = i0.d.a.a.a.f1(configurableProvider, "Alg.Alias.Cipher.GOST", "GOST28147", "Alg.Alias.Cipher.GOST-28147", "GOST28147");
            f1.append("Cipher.");
            n nVar = a.f;
            f1.append(nVar);
            i0.d.a.a.a.v(i0.d.a.a.a.V0(str, "$GCFB", configurableProvider, f1.toString(), str), "$KeyGen", configurableProvider, "KeyGenerator.GOST28147");
            StringBuilder f12 = i0.d.a.a.a.f1(configurableProvider, "Alg.Alias.KeyGenerator.GOST", "GOST28147", "Alg.Alias.KeyGenerator.GOST-28147", "GOST28147");
            f12.append("Alg.Alias.KeyGenerator.");
            f12.append(nVar);
            configurableProvider.addAlgorithm(f12.toString(), "GOST28147");
            StringBuilder Y0 = i0.d.a.a.a.Y0(i0.d.a.a.a.Y0(new StringBuilder(), str, "$AlgParams", configurableProvider, "AlgorithmParameters.GOST28147"), str, "$AlgParamGen", configurableProvider, "AlgorithmParameterGenerator.GOST28147");
            Y0.append("Alg.Alias.AlgorithmParameters.");
            Y0.append(nVar);
            configurableProvider.addAlgorithm(Y0.toString(), "GOST28147");
            configurableProvider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator." + nVar, "GOST28147");
            StringBuilder V0 = i0.d.a.a.a.V0(str, "$CryptoProWrap", configurableProvider, "Cipher." + a.e, "Cipher.");
            V0.append(a.d);
            i0.d.a.a.a.v(i0.d.a.a.a.V0(str, "$GostWrap", configurableProvider, V0.toString(), str), "$Mac", configurableProvider, "Mac.GOST28147MAC");
            configurableProvider.addAlgorithm("Alg.Alias.Mac.GOST28147", "GOST28147MAC");
        }
    }

    static {
        oidMappings.put(a.g, "E-TEST");
        Map<n, String> map = oidMappings;
        n nVar = a.h;
        map.put(nVar, "E-A");
        Map<n, String> map2 = oidMappings;
        n nVar2 = a.i;
        map2.put(nVar2, "E-B");
        Map<n, String> map3 = oidMappings;
        n nVar3 = a.j;
        map3.put(nVar3, "E-C");
        Map<n, String> map4 = oidMappings;
        n nVar4 = a.k;
        map4.put(nVar4, "E-D");
        Map<n, String> map5 = oidMappings;
        n nVar5 = s0.a.a.x2.a.t;
        map5.put(nVar5, "PARAM-Z");
        nameMappings.put("E-A", nVar);
        nameMappings.put("E-B", nVar2);
        nameMappings.put("E-C", nVar3);
        nameMappings.put("E-D", nVar4);
        nameMappings.put("PARAM-Z", nVar5);
    }

    private GOST28147() {
    }
}
