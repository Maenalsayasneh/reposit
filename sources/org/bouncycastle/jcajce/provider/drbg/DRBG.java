package org.bouncycastle.jcajce.provider.drbg;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.security.Security;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.crypto.prng.SP800SecureRandom;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import s0.a.b.b0.a0;
import s0.a.b.m0.a;
import s0.a.b.m0.c;
import s0.a.b.m0.d;
import s0.a.b.m0.e;
import s0.a.e.b.b0.c.h3;
import s0.a.g.g;
import s0.a.g.j;

public class DRBG {
    /* access modifiers changed from: private */
    public static final String PREFIX = "org.bouncycastle.jcajce.provider.drbg.DRBG";
    private static final String[][] initialEntropySourceNames = {new String[]{"sun.security.provider.Sun", "sun.security.provider.SecureRandom"}, new String[]{"org.apache.harmony.security.provider.crypto.CryptoProvider", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl"}, new String[]{"com.android.org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLRandom"}, new String[]{"org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLRandom"}};

    public static class CoreSecureRandom extends SecureRandom {
        public CoreSecureRandom(Object[] objArr) {
            super(objArr[1], objArr[0]);
        }
    }

    public static class Default extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(true);

        public byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }

        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public static class HybridRandomProvider extends Provider {
        public HybridRandomProvider() {
            super("BCHEP", 1.0d, "Bouncy Castle Hybrid Entropy Provider");
        }
    }

    public static class HybridSecureRandom extends SecureRandom {
        /* access modifiers changed from: private */
        public final SecureRandom baseRandom;
        private final SP800SecureRandom drbg;
        private final AtomicInteger samples = new AtomicInteger(0);
        /* access modifiers changed from: private */
        public final AtomicBoolean seedAvailable = new AtomicBoolean(false);

        public class SignallingEntropySource implements c {
            /* access modifiers changed from: private */
            public final int byteLength;
            /* access modifiers changed from: private */
            public final AtomicReference entropy = new AtomicReference();
            private final AtomicBoolean scheduled = new AtomicBoolean(false);

            public class EntropyGatherer implements Runnable {
                private final int numBytes;

                public EntropyGatherer(int i) {
                    this.numBytes = i;
                }

                private void sleep(long j) {
                    try {
                        Thread.sleep(j);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }

                public void run() {
                    String a = g.a("org.bouncycastle.drbg.gather_pause_secs");
                    long j = 5000;
                    if (a != null) {
                        try {
                            j = Long.parseLong(a) * 1000;
                        } catch (Exception unused) {
                        }
                    }
                    int i = this.numBytes;
                    byte[] bArr = new byte[i];
                    for (int i2 = 0; i2 < SignallingEntropySource.this.byteLength / 8; i2++) {
                        sleep(j);
                        byte[] generateSeed = HybridSecureRandom.this.baseRandom.generateSeed(8);
                        System.arraycopy(generateSeed, 0, bArr, i2 * 8, generateSeed.length);
                    }
                    int access$600 = SignallingEntropySource.this.byteLength - ((SignallingEntropySource.this.byteLength / 8) * 8);
                    if (access$600 != 0) {
                        sleep(j);
                        byte[] generateSeed2 = HybridSecureRandom.this.baseRandom.generateSeed(access$600);
                        System.arraycopy(generateSeed2, 0, bArr, i - generateSeed2.length, generateSeed2.length);
                    }
                    SignallingEntropySource.this.entropy.set(bArr);
                    HybridSecureRandom.this.seedAvailable.set(true);
                }
            }

            public SignallingEntropySource(int i) {
                this.byteLength = (i + 7) / 8;
            }

            public int entropySize() {
                return this.byteLength * 8;
            }

            public byte[] getEntropy() {
                byte[] bArr = (byte[]) this.entropy.getAndSet((Object) null);
                if (bArr == null || bArr.length != this.byteLength) {
                    bArr = HybridSecureRandom.this.baseRandom.generateSeed(this.byteLength);
                } else {
                    this.scheduled.set(false);
                }
                if (!this.scheduled.getAndSet(true)) {
                    Thread thread = new Thread(new EntropyGatherer(this.byteLength));
                    thread.setDaemon(true);
                    thread.start();
                }
                return bArr;
            }

            public boolean isPredictionResistant() {
                return true;
            }
        }

        public HybridSecureRandom() {
            super((SecureRandomSpi) null, new HybridRandomProvider());
            SecureRandom access$400 = DRBG.createInitialEntropySource();
            this.baseRandom = access$400;
            AnonymousClass1 r3 = new d() {
                public c get(int i) {
                    return new SignallingEntropySource(i);
                }
            };
            byte[] I = h3.I(j.c("Bouncy Castle Hybrid Entropy Source"));
            this.drbg = new SP800SecureRandom((SecureRandom) null, r3.get(256), new e.a(new s0.a.b.h0.g(new a0()), access$400.generateSeed(32), I, 256), false);
        }

        public byte[] generateSeed(int i) {
            byte[] bArr = new byte[i];
            if (this.samples.getAndIncrement() > 20 && this.seedAvailable.getAndSet(false)) {
                this.samples.set(0);
                SP800SecureRandom sP800SecureRandom = this.drbg;
                synchronized (sP800SecureRandom) {
                    if (sP800SecureRandom.y == null) {
                        sP800SecureRandom.y = sP800SecureRandom.c.a(sP800SecureRandom.x);
                    }
                    sP800SecureRandom.y.a((byte[]) null);
                }
            }
            this.drbg.nextBytes(bArr);
            return bArr;
        }

        public void setSeed(long j) {
            SP800SecureRandom sP800SecureRandom = this.drbg;
            if (sP800SecureRandom != null) {
                sP800SecureRandom.setSeed(j);
            }
        }

        public void setSeed(byte[] bArr) {
            SP800SecureRandom sP800SecureRandom = this.drbg;
            if (sP800SecureRandom != null) {
                sP800SecureRandom.setSeed(bArr);
            }
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm("SecureRandom.DEFAULT", DRBG.PREFIX + "$Default");
            configurableProvider.addAlgorithm("SecureRandom.NONCEANDIV", DRBG.PREFIX + "$NonceAndIV");
        }
    }

    public static class NonceAndIV extends SecureRandomSpi {
        private static final SecureRandom random = DRBG.createBaseRandom(false);

        public byte[] engineGenerateSeed(int i) {
            return random.generateSeed(i);
        }

        public void engineNextBytes(byte[] bArr) {
            random.nextBytes(bArr);
        }

        public void engineSetSeed(byte[] bArr) {
            random.setSeed(bArr);
        }
    }

    public static class URLSeededSecureRandom extends SecureRandom {
        /* access modifiers changed from: private */
        public final InputStream seedStream;

        public URLSeededSecureRandom(final URL url) {
            super((SecureRandomSpi) null, new HybridRandomProvider());
            this.seedStream = (InputStream) AccessController.doPrivileged(new PrivilegedAction<InputStream>() {
                public InputStream run() {
                    try {
                        return url.openStream();
                    } catch (IOException unused) {
                        throw new IllegalStateException("unable to open random source");
                    }
                }
            });
        }

        private int privilegedRead(final byte[] bArr, final int i, final int i2) {
            return ((Integer) AccessController.doPrivileged(new PrivilegedAction<Integer>() {
                public Integer run() {
                    try {
                        return Integer.valueOf(URLSeededSecureRandom.this.seedStream.read(bArr, i, i2));
                    } catch (IOException unused) {
                        throw new InternalError("unable to read random source");
                    }
                }
            })).intValue();
        }

        public byte[] generateSeed(int i) {
            byte[] bArr;
            synchronized (this) {
                bArr = new byte[i];
                int i2 = 0;
                while (i2 != i) {
                    int privilegedRead = privilegedRead(bArr, i2, i - i2);
                    if (privilegedRead <= -1) {
                        break;
                    }
                    i2 += privilegedRead;
                }
                if (i2 != i) {
                    throw new InternalError("unable to fully read random source");
                }
            }
            return bArr;
        }

        public void setSeed(long j) {
        }

        public void setSeed(byte[] bArr) {
        }
    }

    /* access modifiers changed from: private */
    public static SecureRandom createBaseRandom(boolean z) {
        if (g.a("org.bouncycastle.drbg.entropysource") != null) {
            d createEntropySource = createEntropySource();
            c cVar = createEntropySource.get(128);
            byte[] entropy = cVar.getEntropy();
            return new SP800SecureRandom((SecureRandom) null, createEntropySource.get(256), new e.b(new a0(), h3.R(cVar.getEntropy(), cVar.getEntropy()), h3.I(z ? generateDefaultPersonalizationString(entropy) : generateNonceIVPersonalizationString(entropy)), 256), z);
        }
        HybridSecureRandom hybridSecureRandom = new HybridSecureRandom();
        byte[] generateSeed = hybridSecureRandom.generateSeed(16);
        return new SP800SecureRandom(hybridSecureRandom, new a.C0301a(256), new e.b(new a0(), hybridSecureRandom.generateSeed(32), h3.I(z ? generateDefaultPersonalizationString(generateSeed) : generateNonceIVPersonalizationString(generateSeed)), 256), z);
    }

    /* access modifiers changed from: private */
    public static SecureRandom createCoreSecureRandom() {
        if (Security.getProperty("securerandom.source") == null) {
            return new CoreSecureRandom(findSource());
        }
        try {
            return new URLSeededSecureRandom(new URL(Security.getProperty("securerandom.source")));
        } catch (Exception unused) {
            return new CoreSecureRandom(findSource());
        }
    }

    private static d createEntropySource() {
        final String a = g.a("org.bouncycastle.drbg.entropysource");
        return (d) AccessController.doPrivileged(new PrivilegedAction<d>() {
            public d run() {
                try {
                    return (d) ClassUtil.loadClass(DRBG.class, a).newInstance();
                } catch (Exception e) {
                    StringBuilder P0 = i0.d.a.a.a.P0("entropy source ");
                    P0.append(a);
                    P0.append(" not created: ");
                    P0.append(e.getMessage());
                    throw new IllegalStateException(P0.toString(), e);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public static SecureRandom createInitialEntropySource() {
        return ((Boolean) AccessController.doPrivileged(new PrivilegedAction<Boolean>() {
            public Boolean run() {
                boolean z = false;
                try {
                    if (SecureRandom.class.getMethod("getInstanceStrong", new Class[0]) != null) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } catch (Exception unused) {
                    return Boolean.FALSE;
                }
            }
        })).booleanValue() ? (SecureRandom) AccessController.doPrivileged(new PrivilegedAction<SecureRandom>() {
            public SecureRandom run() {
                try {
                    return (SecureRandom) SecureRandom.class.getMethod("getInstanceStrong", new Class[0]).invoke((Object) null, new Object[0]);
                } catch (Exception unused) {
                    return DRBG.createCoreSecureRandom();
                }
            }
        }) : createCoreSecureRandom();
    }

    private static final Object[] findSource() {
        int i = 0;
        while (true) {
            String[][] strArr = initialEntropySourceNames;
            if (i >= strArr.length) {
                return null;
            }
            String[] strArr2 = strArr[i];
            try {
                return new Object[]{Class.forName(strArr2[0]).newInstance(), Class.forName(strArr2[1]).newInstance()};
            } catch (Throwable unused) {
                i++;
            }
        }
    }

    private static byte[] generateDefaultPersonalizationString(byte[] bArr) {
        byte[] c = j.c("Default");
        byte[] bArr2 = new byte[8];
        h3.l2(Thread.currentThread().getId(), bArr2, 0);
        byte[] bArr3 = new byte[8];
        h3.l2(System.currentTimeMillis(), bArr3, 0);
        return h3.T(c, bArr, bArr2, bArr3);
    }

    private static byte[] generateNonceIVPersonalizationString(byte[] bArr) {
        return h3.T(j.c("Nonce"), bArr, h3.o2(Thread.currentThread().getId()), h3.o2(System.currentTimeMillis()));
    }
}
