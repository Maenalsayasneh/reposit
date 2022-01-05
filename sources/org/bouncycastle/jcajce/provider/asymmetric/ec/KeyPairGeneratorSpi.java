package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.util.Hashtable;
import m0.r.t.a.r.m.a1.a;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import s0.a.a.d3.h;
import s0.a.a.n;
import s0.a.b.b;
import s0.a.b.f0.k;
import s0.a.b.j;
import s0.a.b.k0.b0;
import s0.a.b.k0.c0;
import s0.a.b.k0.w;
import s0.a.b.k0.y;
import s0.a.d.e.d;
import s0.a.d.e.e;

public abstract class KeyPairGeneratorSpi extends KeyPairGenerator {

    public static class EC extends KeyPairGeneratorSpi {
        private static Hashtable ecParameters;
        public String algorithm;
        public ProviderConfiguration configuration;
        public Object ecParams;
        public k engine;
        public boolean initialised;
        public y param;
        public SecureRandom random;
        public int strength;

        static {
            Hashtable hashtable = new Hashtable();
            ecParameters = hashtable;
            hashtable.put(192, new ECGenParameterSpec("prime192v1"));
            ecParameters.put(239, new ECGenParameterSpec("prime239v1"));
            ecParameters.put(256, new ECGenParameterSpec("prime256v1"));
            ecParameters.put(224, new ECGenParameterSpec("P-224"));
            ecParameters.put(384, new ECGenParameterSpec("P-384"));
            ecParameters.put(521, new ECGenParameterSpec("P-521"));
        }

        public EC() {
            super("EC");
            this.engine = new k();
            this.ecParams = null;
            this.strength = 239;
            this.random = j.a();
            this.initialised = false;
            this.algorithm = "EC";
            this.configuration = BouncyCastleProvider.CONFIGURATION;
        }

        public EC(String str, ProviderConfiguration providerConfiguration) {
            super(str);
            this.engine = new k();
            this.ecParams = null;
            this.strength = 239;
            this.random = j.a();
            this.initialised = false;
            this.algorithm = str;
            this.configuration = providerConfiguration;
        }

        public y createKeyGenParamsBC(e eVar, SecureRandom secureRandom) {
            return new y(new w(eVar.a, eVar.c, eVar.d, eVar.e), secureRandom);
        }

        public y createKeyGenParamsJCE(ECParameterSpec eCParameterSpec, SecureRandom secureRandom) {
            h domainParametersFromName;
            if ((eCParameterSpec instanceof d) && (domainParametersFromName = ECUtils.getDomainParametersFromName(((d) eCParameterSpec).a)) != null) {
                return new y(new w(domainParametersFromName.q, domainParametersFromName.s(), domainParametersFromName.y, domainParametersFromName.Y1), secureRandom);
            }
            s0.a.e.b.e convertCurve = EC5Util.convertCurve(eCParameterSpec.getCurve());
            return new y(new w(convertCurve, EC5Util.convertPoint(convertCurve, eCParameterSpec.getGenerator()), eCParameterSpec.getOrder(), BigInteger.valueOf((long) eCParameterSpec.getCofactor())), secureRandom);
        }

        public d createNamedCurveSpec(String str) throws InvalidAlgorithmParameterException {
            h domainParametersFromName = ECUtils.getDomainParametersFromName(str);
            if (domainParametersFromName == null) {
                try {
                    domainParametersFromName = a.H1(new n(str));
                    if (domainParametersFromName == null) {
                        domainParametersFromName = (h) this.configuration.getAdditionalECParameters().get(new n(str));
                        if (domainParametersFromName == null) {
                            throw new InvalidAlgorithmParameterException("unknown curve OID: " + str);
                        }
                    }
                } catch (IllegalArgumentException unused) {
                    throw new InvalidAlgorithmParameterException(i0.d.a.a.a.n0("unknown curve name: ", str));
                }
            }
            return new d(str, domainParametersFromName.q, domainParametersFromName.s(), domainParametersFromName.y, domainParametersFromName.Y1, (byte[]) null);
        }

        public KeyPair generateKeyPair() {
            if (!this.initialised) {
                initialize(this.strength, new SecureRandom());
            }
            b b = this.engine.b();
            c0 c0Var = (c0) b.a;
            b0 b0Var = (b0) b.b;
            Object obj = this.ecParams;
            if (obj instanceof e) {
                e eVar = (e) obj;
                BCECPublicKey bCECPublicKey = new BCECPublicKey(this.algorithm, c0Var, eVar, this.configuration);
                return new KeyPair(bCECPublicKey, new BCECPrivateKey(this.algorithm, b0Var, bCECPublicKey, eVar, this.configuration));
            } else if (obj == null) {
                return new KeyPair(new BCECPublicKey(this.algorithm, c0Var, this.configuration), new BCECPrivateKey(this.algorithm, b0Var, this.configuration));
            } else {
                ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
                BCECPublicKey bCECPublicKey2 = new BCECPublicKey(this.algorithm, c0Var, eCParameterSpec, this.configuration);
                return new KeyPair(bCECPublicKey2, new BCECPrivateKey(this.algorithm, b0Var, bCECPublicKey2, eCParameterSpec, this.configuration));
            }
        }

        public void initialize(int i, SecureRandom secureRandom) {
            this.strength = i;
            this.random = secureRandom;
            ECGenParameterSpec eCGenParameterSpec = (ECGenParameterSpec) ecParameters.get(Integer.valueOf(i));
            if (eCGenParameterSpec != null) {
                try {
                    initialize((AlgorithmParameterSpec) eCGenParameterSpec, secureRandom);
                } catch (InvalidAlgorithmParameterException unused) {
                    throw new InvalidParameterException("key size not configurable.");
                }
            } else {
                throw new InvalidParameterException("unknown key size.");
            }
        }

        public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            y yVar;
            e eVar;
            String str = null;
            if (algorithmParameterSpec == null) {
                eVar = this.configuration.getEcImplicitlyCa();
                if (eVar != null) {
                    this.ecParams = null;
                } else {
                    throw new InvalidAlgorithmParameterException("null parameter passed but no implicitCA set");
                }
            } else if (algorithmParameterSpec instanceof e) {
                this.ecParams = algorithmParameterSpec;
                eVar = (e) algorithmParameterSpec;
            } else if (algorithmParameterSpec instanceof ECParameterSpec) {
                this.ecParams = algorithmParameterSpec;
                yVar = createKeyGenParamsJCE((ECParameterSpec) algorithmParameterSpec, secureRandom);
                this.param = yVar;
                this.engine.a(this.param);
                this.initialised = true;
            } else {
                if (algorithmParameterSpec instanceof ECGenParameterSpec) {
                    initializeNamedCurve(((ECGenParameterSpec) algorithmParameterSpec).getName(), secureRandom);
                } else {
                    if (algorithmParameterSpec instanceof s0.a.d.e.b) {
                        s0.a.d.e.b bVar = (s0.a.d.e.b) algorithmParameterSpec;
                    } else {
                        str = ECUtil.getNameFrom(algorithmParameterSpec);
                        if (str == null) {
                            throw new InvalidAlgorithmParameterException("invalid parameterSpec: " + algorithmParameterSpec);
                        }
                    }
                    initializeNamedCurve(str, secureRandom);
                }
                this.engine.a(this.param);
                this.initialised = true;
            }
            yVar = createKeyGenParamsBC(eVar, secureRandom);
            this.param = yVar;
            this.engine.a(this.param);
            this.initialised = true;
        }

        public void initializeNamedCurve(String str, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
            d createNamedCurveSpec = createNamedCurveSpec(str);
            this.ecParams = createNamedCurveSpec;
            this.param = createKeyGenParamsJCE(createNamedCurveSpec, secureRandom);
        }
    }

    public static class ECDH extends EC {
        public ECDH() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends EC {
        public ECDHC() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends EC {
        public ECDSA() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends EC {
        public ECMQV() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public KeyPairGeneratorSpi(String str) {
        super(str);
    }
}
