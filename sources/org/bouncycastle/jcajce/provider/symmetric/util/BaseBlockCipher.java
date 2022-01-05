package org.bouncycastle.jcajce.provider.symmetric.util;

import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import s0.a.a.w2.n;
import s0.a.a.x0;
import s0.a.b.e;
import s0.a.b.e0.r;
import s0.a.b.f;
import s0.a.b.i;
import s0.a.b.i0.b;
import s0.a.b.i0.c;
import s0.a.b.i0.d;
import s0.a.b.i0.m;
import s0.a.b.i0.o;
import s0.a.b.i0.p;
import s0.a.b.i0.q;
import s0.a.b.i0.s;
import s0.a.b.i0.t;
import s0.a.b.i0.u;
import s0.a.b.i0.v;
import s0.a.b.i0.w;
import s0.a.b.j0.g;
import s0.a.b.k0.a;
import s0.a.b.k0.c1;
import s0.a.c.n.h;
import s0.a.g.j;

public class BaseBlockCipher extends BaseWrapCipher implements PBE {
    private static final int BUF_SIZE = 512;
    private static final Class gcmSpecClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.spec.GCMParameterSpec");
    private a aeadParams;
    private Class[] availableSpecs;
    private e baseEngine;
    private GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private c1 ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    public static class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        /* access modifiers changed from: private */
        public b cipher;

        static {
            Class loadClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
            aeadBadTagConstructor = loadClass != null ? findExceptionConstructor(loadClass) : null;
        }

        public AEADGenericBlockCipher(b bVar) {
            this.cipher = bVar;
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(new Class[]{String.class});
            } catch (Exception unused) {
                return null;
            }
        }

        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            try {
                return this.cipher.doFinal(bArr, i);
            } catch (InvalidCipherTextException e) {
                Constructor constructor = aeadBadTagConstructor;
                if (constructor != null) {
                    BadPaddingException badPaddingException = null;
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(new Object[]{e.getMessage()});
                    } catch (Exception unused) {
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e.getMessage());
            }
        }

        public String getAlgorithmName() {
            b bVar = this.cipher;
            return bVar instanceof s0.a.b.i0.a ? ((s0.a.b.i0.a) bVar).getUnderlyingCipher().getAlgorithmName() : bVar.getAlgorithmName();
        }

        public int getOutputSize(int i) {
            return this.cipher.getOutputSize(i);
        }

        public e getUnderlyingCipher() {
            b bVar = this.cipher;
            if (bVar instanceof s0.a.b.i0.a) {
                return ((s0.a.b.i0.a) bVar).getUnderlyingCipher();
            }
            return null;
        }

        public int getUpdateOutputSize(int i) {
            return this.cipher.getUpdateOutputSize(i);
        }

        public void init(boolean z, i iVar) throws IllegalArgumentException {
            this.cipher.init(z, iVar);
        }

        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            return this.cipher.processByte(b, bArr, i);
        }

        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
        }

        public void updateAAD(byte[] bArr, int i, int i2) {
            this.cipher.b(bArr, i, i2);
        }

        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    public static class BufferedGenericBlockCipher implements GenericBlockCipher {
        private f cipher;

        public BufferedGenericBlockCipher(e eVar) {
            this.cipher = new s0.a.b.j0.e(eVar);
        }

        public BufferedGenericBlockCipher(e eVar, s0.a.b.j0.a aVar) {
            this.cipher = new s0.a.b.j0.e(eVar, aVar);
        }

        public BufferedGenericBlockCipher(f fVar) {
            this.cipher = fVar;
        }

        public int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException {
            try {
                return this.cipher.a(bArr, i);
            } catch (InvalidCipherTextException e) {
                throw new BadPaddingException(e.getMessage());
            }
        }

        public String getAlgorithmName() {
            return this.cipher.d.getAlgorithmName();
        }

        public int getOutputSize(int i) {
            return this.cipher.c(i);
        }

        public e getUnderlyingCipher() {
            return this.cipher.d;
        }

        public int getUpdateOutputSize(int i) {
            return this.cipher.d(i);
        }

        public void init(boolean z, i iVar) throws IllegalArgumentException {
            this.cipher.e(z, iVar);
        }

        public int processByte(byte b, byte[] bArr, int i) throws DataLengthException {
            return this.cipher.f(b, bArr, i);
        }

        public int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException {
            return this.cipher.g(bArr, i, i2, bArr2, i3);
        }

        public void updateAAD(byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        public boolean wrapOnNoPadding() {
            return !(this.cipher instanceof s0.a.b.i0.f);
        }
    }

    public interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i) throws IllegalStateException, BadPaddingException;

        String getAlgorithmName();

        int getOutputSize(int i);

        e getUnderlyingCipher();

        int getUpdateOutputSize(int i);

        void init(boolean z, i iVar) throws IllegalArgumentException;

        int processByte(byte b, byte[] bArr, int i) throws DataLengthException;

        int processBytes(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException;

        void updateAAD(byte[] bArr, int i, int i2);

        boolean wrapOnNoPadding();
    }

    public BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
    }

    public BaseBlockCipher(e eVar) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = eVar;
        this.cipher = new BufferedGenericBlockCipher(eVar);
    }

    public BaseBlockCipher(e eVar, int i) {
        this(eVar, true, i);
    }

    public BaseBlockCipher(e eVar, int i, int i2, int i3, int i4) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = eVar;
        this.scheme = i;
        this.digest = i2;
        this.keySizeInBits = i3;
        this.ivLength = i4;
        this.cipher = new BufferedGenericBlockCipher(eVar);
    }

    public BaseBlockCipher(e eVar, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = eVar;
        this.fixedIv = z;
        this.cipher = new BufferedGenericBlockCipher(eVar);
        this.ivLength = i / 8;
    }

    public BaseBlockCipher(f fVar, int i) {
        this(fVar, true, i);
    }

    public BaseBlockCipher(f fVar, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = fVar.d;
        this.cipher = new BufferedGenericBlockCipher(fVar);
        this.fixedIv = z;
        this.ivLength = i / 8;
    }

    public BaseBlockCipher(s0.a.b.i0.a aVar) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        e underlyingCipher = aVar.getUnderlyingCipher();
        this.baseEngine = underlyingCipher;
        this.ivLength = underlyingCipher.b();
        this.cipher = new AEADGenericBlockCipher(aVar);
    }

    public BaseBlockCipher(s0.a.b.i0.a aVar, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aVar.getUnderlyingCipher();
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(aVar);
    }

    public BaseBlockCipher(b bVar, boolean z, int i) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = null;
        this.fixedIv = z;
        this.ivLength = i;
        this.cipher = new AEADGenericBlockCipher(bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: s0.a.b.k0.e1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: s0.a.b.k0.c1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: s0.a.b.k0.e1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: s0.a.b.k0.e1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: s0.a.b.k0.e1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private s0.a.b.i adjustParameters(java.security.spec.AlgorithmParameterSpec r4, s0.a.b.i r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof s0.a.b.k0.c1
            if (r0 == 0) goto L_0x0040
            r0 = r5
            s0.a.b.k0.c1 r0 = (s0.a.b.k0.c1) r0
            s0.a.b.i r0 = r0.d
            boolean r1 = r4 instanceof javax.crypto.spec.IvParameterSpec
            if (r1 == 0) goto L_0x001b
            javax.crypto.spec.IvParameterSpec r4 = (javax.crypto.spec.IvParameterSpec) r4
            s0.a.b.k0.c1 r5 = new s0.a.b.k0.c1
            byte[] r4 = r4.getIV()
            r5.<init>(r0, r4)
        L_0x0018:
            r3.ivParam = r5
            goto L_0x0075
        L_0x001b:
            boolean r1 = r4 instanceof s0.a.c.n.h
            if (r1 == 0) goto L_0x0075
            s0.a.c.n.h r4 = (s0.a.c.n.h) r4
            s0.a.b.k0.e1 r1 = new s0.a.b.k0.e1
            byte[] r2 = r4.c()
            r1.<init>(r5, r2)
            byte[] r5 = r4.a()
            if (r5 == 0) goto L_0x003e
            int r5 = r3.ivLength
            if (r5 == 0) goto L_0x003e
            s0.a.b.k0.c1 r5 = new s0.a.b.k0.c1
            byte[] r4 = r4.a()
            r5.<init>(r0, r4)
            goto L_0x0018
        L_0x003e:
            r5 = r1
            goto L_0x0075
        L_0x0040:
            boolean r0 = r4 instanceof javax.crypto.spec.IvParameterSpec
            if (r0 == 0) goto L_0x0053
            javax.crypto.spec.IvParameterSpec r4 = (javax.crypto.spec.IvParameterSpec) r4
            s0.a.b.k0.c1 r0 = new s0.a.b.k0.c1
            byte[] r4 = r4.getIV()
            r0.<init>(r5, r4)
            r3.ivParam = r0
        L_0x0051:
            r5 = r0
            goto L_0x0075
        L_0x0053:
            boolean r0 = r4 instanceof s0.a.c.n.h
            if (r0 == 0) goto L_0x0075
            s0.a.c.n.h r4 = (s0.a.c.n.h) r4
            s0.a.b.k0.e1 r0 = new s0.a.b.k0.e1
            byte[] r1 = r4.c()
            r0.<init>(r5, r1)
            byte[] r5 = r4.a()
            if (r5 == 0) goto L_0x0051
            int r5 = r3.ivLength
            if (r5 == 0) goto L_0x0051
            s0.a.b.k0.c1 r5 = new s0.a.b.k0.c1
            byte[] r4 = r4.a()
            r5.<init>(r0, r4)
        L_0x0075:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.adjustParameters(java.security.spec.AlgorithmParameterSpec, s0.a.b.i):s0.a.b.i");
    }

    private boolean isAEADModeName(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || "GCM".equals(str) || "OCB".equals(str);
    }

    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        int i4;
        if (engineGetOutputSize(i2) + i3 <= bArr2.length) {
            if (i2 != 0) {
                try {
                    i4 = this.cipher.processBytes(bArr, i, i2, bArr2, i3);
                } catch (OutputLengthException e) {
                    throw new IllegalBlockSizeException(e.getMessage());
                } catch (DataLengthException e2) {
                    throw new IllegalBlockSizeException(e2.getMessage());
                }
            } else {
                i4 = 0;
            }
            return i4 + this.cipher.doFinal(bArr2, i3 + i4);
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    public byte[] engineDoFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        int engineGetOutputSize = engineGetOutputSize(i2);
        byte[] bArr2 = new byte[engineGetOutputSize];
        int processBytes = i2 != 0 ? this.cipher.processBytes(bArr, i, i2, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.cipher.doFinal(bArr2, processBytes);
            if (doFinal == engineGetOutputSize) {
                return bArr2;
            }
            if (doFinal <= engineGetOutputSize) {
                byte[] bArr3 = new byte[doFinal];
                System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
                return bArr3;
            }
            throw new IllegalBlockSizeException("internal buffer overflow");
        } catch (DataLengthException e) {
            throw new IllegalBlockSizeException(e.getMessage());
        }
    }

    public int engineGetBlockSize() {
        e eVar = this.baseEngine;
        if (eVar == null) {
            return -1;
        }
        return eVar.b();
    }

    public byte[] engineGetIV() {
        a aVar = this.aeadParams;
        if (aVar != null) {
            return aVar.b();
        }
        c1 c1Var = this.ivParam;
        if (c1Var != null) {
            return c1Var.c;
        }
        return null;
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    public int engineGetOutputSize(int i) {
        return this.cipher.getOutputSize(i);
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    AlgorithmParameters createParametersInstance = createParametersInstance(this.pbeAlgorithm);
                    this.engineParams = createParametersInstance;
                    createParametersInstance.init(this.pbeSpec);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.aeadParams != null) {
                if (this.baseEngine == null) {
                    try {
                        AlgorithmParameters createParametersInstance2 = createParametersInstance(n.f67t0.d);
                        this.engineParams = createParametersInstance2;
                        createParametersInstance2.init(new x0(this.aeadParams.b()).getEncoded());
                    } catch (Exception e) {
                        throw new RuntimeException(e.toString());
                    }
                } else {
                    try {
                        AlgorithmParameters createParametersInstance3 = createParametersInstance("GCM");
                        this.engineParams = createParametersInstance3;
                        createParametersInstance3.init(new s0.a.a.e2.b(this.aeadParams.b(), this.aeadParams.x / 8).getEncoded());
                    } catch (Exception e2) {
                        throw new RuntimeException(e2.toString());
                    }
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    AlgorithmParameters createParametersInstance4 = createParametersInstance(algorithmName);
                    this.engineParams = createParametersInstance4;
                    createParametersInstance4.init(new IvParameterSpec(this.ivParam.c));
                } catch (Exception e3) {
                    throw new RuntimeException(e3.toString());
                }
            }
        }
        return this.engineParams;
    }

    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpec = SpecUtil.extractSpec(algorithmParameters, this.availableSpecs);
            if (algorithmParameterSpec == null) {
                StringBuilder P0 = i0.d.a.a.a.P0("can't handle parameter ");
                P0.append(algorithmParameters.toString());
                throw new InvalidAlgorithmParameterException(P0.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        engineInit(i, key, algorithmParameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    public void engineInit(int i, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidKeyException(e.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: s0.a.b.k0.d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: s0.a.b.k0.d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: s0.a.b.k0.d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: s0.a.b.k0.d1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: s0.a.b.k0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v58, resolved type: s0.a.b.k0.c1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: s0.a.b.k0.h1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v60, resolved type: s0.a.b.k0.h1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v61, resolved type: s0.a.b.k0.g1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v62, resolved type: s0.a.b.k0.g1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v63, resolved type: s0.a.b.k0.e1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v64, resolved type: s0.a.b.k0.e1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v70, resolved type: s0.a.b.k0.y0} */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a0, code lost:
        if (r7 != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e6, code lost:
        if (r7 != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0135, code lost:
        if (r7 != false) goto L_0x01ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ed, code lost:
        if (r7 != false) goto L_0x01ef;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0499 A[Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void engineInit(int r22, java.security.Key r23, java.security.spec.AlgorithmParameterSpec r24, java.security.SecureRandom r25) throws java.security.InvalidKeyException, java.security.InvalidAlgorithmParameterException {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = 0
            r1.pbeSpec = r5
            r1.pbeAlgorithm = r5
            r1.engineParams = r5
            r1.aeadParams = r5
            boolean r6 = r2 instanceof javax.crypto.SecretKey
            if (r6 != 0) goto L_0x002f
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.String r3 = "Key for algorithm "
            java.lang.StringBuilder r3 = i0.d.a.a.a.P0(r3)
            if (r2 == 0) goto L_0x0025
            java.lang.String r5 = r23.getAlgorithm()
        L_0x0025:
            java.lang.String r2 = " not suitable for symmetric enryption."
            java.lang.String r2 = i0.d.a.a.a.y0(r3, r5, r2)
            r0.<init>(r2)
            throw r0
        L_0x002f:
            java.lang.String r6 = "RC5-64"
            if (r3 != 0) goto L_0x004a
            s0.a.b.e r7 = r1.baseEngine
            if (r7 == 0) goto L_0x004a
            java.lang.String r7 = r7.getAlgorithmName()
            boolean r7 = r7.startsWith(r6)
            if (r7 != 0) goto L_0x0042
            goto L_0x004a
        L_0x0042:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "RC5 requires an RC5ParametersSpec to be passed in."
            r0.<init>(r2)
            throw r0
        L_0x004a:
            int r7 = r1.scheme
            r8 = 4
            java.lang.String r9 = "Algorithm requires a PBE key"
            r10 = 0
            r11 = 2
            r12 = 1
            if (r7 == r11) goto L_0x0153
            boolean r13 = r2 instanceof org.bouncycastle.jcajce.PKCS12Key
            if (r13 == 0) goto L_0x005a
            goto L_0x0153
        L_0x005a:
            boolean r13 = r2 instanceof org.bouncycastle.jcajce.PBKDF1Key
            if (r13 == 0) goto L_0x00a4
            r7 = r2
            org.bouncycastle.jcajce.PBKDF1Key r7 = (org.bouncycastle.jcajce.PBKDF1Key) r7
            boolean r9 = r3 instanceof javax.crypto.spec.PBEParameterSpec
            if (r9 == 0) goto L_0x006a
            r9 = r3
            javax.crypto.spec.PBEParameterSpec r9 = (javax.crypto.spec.PBEParameterSpec) r9
            r1.pbeSpec = r9
        L_0x006a:
            boolean r9 = r7 instanceof org.bouncycastle.jcajce.PBKDF1KeyWithParameters
            if (r9 == 0) goto L_0x007f
            javax.crypto.spec.PBEParameterSpec r9 = r1.pbeSpec
            if (r9 != 0) goto L_0x007f
            javax.crypto.spec.PBEParameterSpec r9 = new javax.crypto.spec.PBEParameterSpec
            r13 = r7
            org.bouncycastle.jcajce.PBKDF1KeyWithParameters r13 = (org.bouncycastle.jcajce.PBKDF1KeyWithParameters) r13
            java.util.Objects.requireNonNull(r13)
            r9.<init>(r5, r10)
            r1.pbeSpec = r9
        L_0x007f:
            byte[] r14 = r7.getEncoded()
            r15 = 0
            int r5 = r1.digest
            int r7 = r1.keySizeInBits
            int r9 = r1.ivLength
            int r18 = r9 * 8
            javax.crypto.spec.PBEParameterSpec r9 = r1.pbeSpec
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r13 = r1.cipher
            java.lang.String r20 = r13.getAlgorithmName()
            r16 = r5
            r17 = r7
            r19 = r9
            s0.a.b.i r5 = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r14, r15, r16, r17, r18, r19, r20)
            boolean r7 = r5 instanceof s0.a.b.k0.c1
            if (r7 == 0) goto L_0x01f4
            goto L_0x01ef
        L_0x00a4:
            boolean r5 = r2 instanceof org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey
            if (r5 == 0) goto L_0x00f2
            r5 = r2
            org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey r5 = (org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) r5
            s0.a.a.n r7 = r5.getOID()
            if (r7 == 0) goto L_0x00b8
            s0.a.a.n r7 = r5.getOID()
            java.lang.String r7 = r7.d
            goto L_0x00bc
        L_0x00b8:
            java.lang.String r7 = r5.getAlgorithm()
        L_0x00bc:
            r1.pbeAlgorithm = r7
            s0.a.b.i r7 = r5.getParam()
            if (r7 == 0) goto L_0x00cd
            s0.a.b.i r5 = r5.getParam()
            s0.a.b.i r5 = r1.adjustParameters(r3, r5)
            goto L_0x00e4
        L_0x00cd:
            boolean r7 = r3 instanceof javax.crypto.spec.PBEParameterSpec
            if (r7 == 0) goto L_0x00ea
            r7 = r3
            javax.crypto.spec.PBEParameterSpec r7 = (javax.crypto.spec.PBEParameterSpec) r7
            r1.pbeSpec = r7
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r7 = r1.cipher
            s0.a.b.e r7 = r7.getUnderlyingCipher()
            java.lang.String r7 = r7.getAlgorithmName()
            s0.a.b.i r5 = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r5, r3, r7)
        L_0x00e4:
            boolean r7 = r5 instanceof s0.a.b.k0.c1
            if (r7 == 0) goto L_0x01f4
            goto L_0x01ef
        L_0x00ea:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "PBE requires PBE parameters to be set."
            r0.<init>(r2)
            throw r0
        L_0x00f2:
            boolean r5 = r2 instanceof javax.crypto.interfaces.PBEKey
            if (r5 == 0) goto L_0x0139
            r5 = r2
            javax.crypto.interfaces.PBEKey r5 = (javax.crypto.interfaces.PBEKey) r5
            r7 = r3
            javax.crypto.spec.PBEParameterSpec r7 = (javax.crypto.spec.PBEParameterSpec) r7
            r1.pbeSpec = r7
            boolean r9 = r5 instanceof org.bouncycastle.jcajce.PKCS12KeyWithParameters
            if (r9 == 0) goto L_0x0113
            if (r7 != 0) goto L_0x0113
            javax.crypto.spec.PBEParameterSpec r7 = new javax.crypto.spec.PBEParameterSpec
            byte[] r9 = r5.getSalt()
            int r13 = r5.getIterationCount()
            r7.<init>(r9, r13)
            r1.pbeSpec = r7
        L_0x0113:
            byte[] r14 = r5.getEncoded()
            int r15 = r1.scheme
            int r5 = r1.digest
            int r7 = r1.keySizeInBits
            int r9 = r1.ivLength
            int r18 = r9 * 8
            javax.crypto.spec.PBEParameterSpec r9 = r1.pbeSpec
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r13 = r1.cipher
            java.lang.String r20 = r13.getAlgorithmName()
            r16 = r5
            r17 = r7
            r19 = r9
            s0.a.b.i r5 = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r14, r15, r16, r17, r18, r19, r20)
            boolean r7 = r5 instanceof s0.a.b.k0.c1
            if (r7 == 0) goto L_0x01f4
            goto L_0x01ef
        L_0x0139:
            if (r7 == 0) goto L_0x014d
            if (r7 == r8) goto L_0x014d
            if (r7 == r12) goto L_0x014d
            r5 = 5
            if (r7 == r5) goto L_0x014d
            s0.a.b.k0.y0 r5 = new s0.a.b.k0.y0
            byte[] r7 = r23.getEncoded()
            r5.<init>(r7)
            goto L_0x01f4
        L_0x014d:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r9)
            throw r0
        L_0x0153:
            r5 = r2
            javax.crypto.SecretKey r5 = (javax.crypto.SecretKey) r5     // Catch:{ Exception -> 0x04cf }
            boolean r7 = r3 instanceof javax.crypto.spec.PBEParameterSpec
            if (r7 == 0) goto L_0x015f
            r7 = r3
            javax.crypto.spec.PBEParameterSpec r7 = (javax.crypto.spec.PBEParameterSpec) r7
            r1.pbeSpec = r7
        L_0x015f:
            boolean r7 = r5 instanceof javax.crypto.interfaces.PBEKey
            if (r7 == 0) goto L_0x0188
            javax.crypto.spec.PBEParameterSpec r13 = r1.pbeSpec
            if (r13 != 0) goto L_0x0188
            r13 = r5
            javax.crypto.interfaces.PBEKey r13 = (javax.crypto.interfaces.PBEKey) r13
            byte[] r14 = r13.getSalt()
            if (r14 == 0) goto L_0x0180
            javax.crypto.spec.PBEParameterSpec r14 = new javax.crypto.spec.PBEParameterSpec
            byte[] r15 = r13.getSalt()
            int r13 = r13.getIterationCount()
            r14.<init>(r15, r13)
            r1.pbeSpec = r14
            goto L_0x0188
        L_0x0180:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "PBEKey requires parameters to specify salt"
            r0.<init>(r2)
            throw r0
        L_0x0188:
            javax.crypto.spec.PBEParameterSpec r13 = r1.pbeSpec
            if (r13 != 0) goto L_0x0195
            if (r7 == 0) goto L_0x018f
            goto L_0x0195
        L_0x018f:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            r0.<init>(r9)
            throw r0
        L_0x0195:
            boolean r7 = r2 instanceof org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey
            if (r7 == 0) goto L_0x01ce
            r7 = r2
            org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey r7 = (org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey) r7
            s0.a.b.i r7 = r7.getParam()
            boolean r9 = r7 instanceof s0.a.b.k0.c1
            if (r9 == 0) goto L_0x01a5
            goto L_0x01c4
        L_0x01a5:
            if (r7 != 0) goto L_0x01c6
            byte[] r13 = r5.getEncoded()
            r14 = 2
            int r15 = r1.digest
            int r5 = r1.keySizeInBits
            int r7 = r1.ivLength
            int r17 = r7 * 8
            javax.crypto.spec.PBEParameterSpec r7 = r1.pbeSpec
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r9 = r1.cipher
            java.lang.String r19 = r9.getAlgorithmName()
            r16 = r5
            r18 = r7
            s0.a.b.i r7 = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r13, r14, r15, r16, r17, r18, r19)
        L_0x01c4:
            r5 = r7
            goto L_0x01eb
        L_0x01c6:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.String r2 = "Algorithm requires a PBE key suitable for PKCS12"
            r0.<init>(r2)
            throw r0
        L_0x01ce:
            byte[] r13 = r5.getEncoded()
            r14 = 2
            int r15 = r1.digest
            int r5 = r1.keySizeInBits
            int r7 = r1.ivLength
            int r17 = r7 * 8
            javax.crypto.spec.PBEParameterSpec r7 = r1.pbeSpec
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r9 = r1.cipher
            java.lang.String r19 = r9.getAlgorithmName()
            r16 = r5
            r18 = r7
            s0.a.b.i r5 = org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util.makePBEParameters(r13, r14, r15, r16, r17, r18, r19)
        L_0x01eb:
            boolean r7 = r5 instanceof s0.a.b.k0.c1
            if (r7 == 0) goto L_0x01f4
        L_0x01ef:
            r7 = r5
            s0.a.b.k0.c1 r7 = (s0.a.b.k0.c1) r7
            r1.ivParam = r7
        L_0x01f4:
            boolean r7 = r3 instanceof s0.a.c.n.a
            if (r7 == 0) goto L_0x0233
            java.lang.String r2 = r1.modeName
            boolean r2 = r1.isAEADModeName(r2)
            if (r2 != 0) goto L_0x020f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r2 = r1.cipher
            boolean r2 = r2 instanceof org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher
            if (r2 == 0) goto L_0x0207
            goto L_0x020f
        L_0x0207:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "AEADParameterSpec can only be used with AEAD modes."
            r0.<init>(r2)
            throw r0
        L_0x020f:
            r2 = r3
            s0.a.c.n.a r2 = (s0.a.c.n.a) r2
            boolean r3 = r5 instanceof s0.a.b.k0.c1
            if (r3 == 0) goto L_0x021d
            s0.a.b.k0.c1 r5 = (s0.a.b.k0.c1) r5
            s0.a.b.i r3 = r5.d
            s0.a.b.k0.y0 r3 = (s0.a.b.k0.y0) r3
            goto L_0x0220
        L_0x021d:
            r3 = r5
            s0.a.b.k0.y0 r3 = (s0.a.b.k0.y0) r3
        L_0x0220:
            s0.a.b.k0.a r5 = new s0.a.b.k0.a
            int r6 = r2.b
            byte[] r7 = r2.getIV()
            byte[] r2 = r2.a
            byte[] r2 = s0.a.e.b.b0.c.h3.I(r2)
            r5.<init>(r3, r6, r7, r2)
            goto L_0x03fd
        L_0x0233:
            boolean r7 = r3 instanceof javax.crypto.spec.IvParameterSpec
            if (r7 == 0) goto L_0x029a
            int r2 = r1.ivLength
            if (r2 == 0) goto L_0x0284
            r2 = r3
            javax.crypto.spec.IvParameterSpec r2 = (javax.crypto.spec.IvParameterSpec) r2
            byte[] r3 = r2.getIV()
            int r3 = r3.length
            int r6 = r1.ivLength
            if (r3 == r6) goto L_0x0266
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r3 = r1.cipher
            boolean r3 = r3 instanceof org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher
            if (r3 != 0) goto L_0x0266
            boolean r3 = r1.fixedIv
            if (r3 != 0) goto L_0x0252
            goto L_0x0266
        L_0x0252:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "IV must be "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            int r3 = r1.ivLength
            java.lang.String r4 = " bytes long."
            java.lang.String r2 = i0.d.a.a.a.u0(r2, r3, r4)
            r0.<init>(r2)
            throw r0
        L_0x0266:
            boolean r3 = r5 instanceof s0.a.b.k0.c1
            if (r3 == 0) goto L_0x0278
            s0.a.b.k0.c1 r3 = new s0.a.b.k0.c1
            s0.a.b.k0.c1 r5 = (s0.a.b.k0.c1) r5
            s0.a.b.i r5 = r5.d
            byte[] r2 = r2.getIV()
            r3.<init>(r5, r2)
            goto L_0x0281
        L_0x0278:
            s0.a.b.k0.c1 r3 = new s0.a.b.k0.c1
            byte[] r2 = r2.getIV()
            r3.<init>(r5, r2)
        L_0x0281:
            r5 = r3
            goto L_0x03be
        L_0x0284:
            java.lang.String r2 = r1.modeName
            if (r2 == 0) goto L_0x040f
            java.lang.String r3 = "ECB"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0292
            goto L_0x040f
        L_0x0292:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "ECB mode does not use an IV"
            r0.<init>(r2)
            throw r0
        L_0x029a:
            boolean r7 = r3 instanceof s0.a.c.n.h
            if (r7 == 0) goto L_0x02da
            s0.a.c.n.h r3 = (s0.a.c.n.h) r3
            s0.a.b.k0.e1 r5 = new s0.a.b.k0.e1
            s0.a.b.k0.y0 r6 = new s0.a.b.k0.y0
            byte[] r2 = r23.getEncoded()
            r6.<init>(r2)
            byte[] r2 = r3.c()
            r5.<init>(r6, r2)
            byte[] r2 = r3.a()
            if (r2 == 0) goto L_0x040f
            int r2 = r1.ivLength
            if (r2 == 0) goto L_0x040f
            boolean r2 = r5 instanceof s0.a.b.k0.c1
            if (r2 == 0) goto L_0x02cf
            s0.a.b.k0.c1 r2 = new s0.a.b.k0.c1
            s0.a.b.k0.c1 r5 = (s0.a.b.k0.c1) r5
            s0.a.b.i r5 = r5.d
            byte[] r3 = r3.a()
            r2.<init>(r5, r3)
            goto L_0x03bd
        L_0x02cf:
            s0.a.b.k0.c1 r2 = new s0.a.b.k0.c1
            byte[] r3 = r3.a()
            r2.<init>(r5, r3)
            goto L_0x03bd
        L_0x02da:
            boolean r7 = r3 instanceof javax.crypto.spec.RC2ParameterSpec
            if (r7 == 0) goto L_0x0315
            javax.crypto.spec.RC2ParameterSpec r3 = (javax.crypto.spec.RC2ParameterSpec) r3
            s0.a.b.k0.g1 r5 = new s0.a.b.k0.g1
            byte[] r2 = r23.getEncoded()
            int r6 = r3.getEffectiveKeyBits()
            r5.<init>(r2, r6)
            byte[] r2 = r3.getIV()
            if (r2 == 0) goto L_0x040f
            int r2 = r1.ivLength
            if (r2 == 0) goto L_0x040f
            boolean r2 = r5 instanceof s0.a.b.k0.c1
            if (r2 == 0) goto L_0x030a
            s0.a.b.k0.c1 r2 = new s0.a.b.k0.c1
            s0.a.b.k0.c1 r5 = (s0.a.b.k0.c1) r5
            s0.a.b.i r5 = r5.d
            byte[] r3 = r3.getIV()
            r2.<init>(r5, r3)
            goto L_0x03bd
        L_0x030a:
            s0.a.b.k0.c1 r2 = new s0.a.b.k0.c1
            byte[] r3 = r3.getIV()
            r2.<init>(r5, r3)
            goto L_0x03bd
        L_0x0315:
            boolean r7 = r3 instanceof javax.crypto.spec.RC5ParameterSpec
            if (r7 == 0) goto L_0x03c9
            javax.crypto.spec.RC5ParameterSpec r3 = (javax.crypto.spec.RC5ParameterSpec) r3
            s0.a.b.k0.h1 r5 = new s0.a.b.k0.h1
            byte[] r2 = r23.getEncoded()
            int r7 = r3.getRounds()
            r5.<init>(r2, r7)
            s0.a.b.e r2 = r1.baseEngine
            java.lang.String r2 = r2.getAlgorithmName()
            java.lang.String r7 = "RC5"
            boolean r2 = r2.startsWith(r7)
            if (r2 == 0) goto L_0x03c1
            s0.a.b.e r2 = r1.baseEngine
            java.lang.String r2 = r2.getAlgorithmName()
            java.lang.String r7 = "RC5-32"
            boolean r2 = r2.equals(r7)
            java.lang.String r7 = "."
            if (r2 == 0) goto L_0x0369
            int r2 = r3.getWordSize()
            r6 = 32
            if (r2 != r6) goto L_0x034f
            goto L_0x0398
        L_0x034f:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "RC5 already set up for a word size of 32 not "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            int r3 = r3.getWordSize()
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0369:
            s0.a.b.e r2 = r1.baseEngine
            java.lang.String r2 = r2.getAlgorithmName()
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x0398
            int r2 = r3.getWordSize()
            r6 = 64
            if (r2 != r6) goto L_0x037e
            goto L_0x0398
        L_0x037e:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "RC5 already set up for a word size of 64 not "
            java.lang.StringBuilder r2 = i0.d.a.a.a.P0(r2)
            int r3 = r3.getWordSize()
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0398:
            byte[] r2 = r3.getIV()
            if (r2 == 0) goto L_0x040f
            int r2 = r1.ivLength
            if (r2 == 0) goto L_0x040f
            boolean r2 = r5 instanceof s0.a.b.k0.c1
            if (r2 == 0) goto L_0x03b4
            s0.a.b.k0.c1 r2 = new s0.a.b.k0.c1
            s0.a.b.k0.c1 r5 = (s0.a.b.k0.c1) r5
            s0.a.b.i r5 = r5.d
            byte[] r3 = r3.getIV()
            r2.<init>(r5, r3)
            goto L_0x03bd
        L_0x03b4:
            s0.a.b.k0.c1 r2 = new s0.a.b.k0.c1
            byte[] r3 = r3.getIV()
            r2.<init>(r5, r3)
        L_0x03bd:
            r5 = r2
        L_0x03be:
            r1.ivParam = r5
            goto L_0x040f
        L_0x03c1:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "RC5 parameters passed to a cipher that is not RC5."
            r0.<init>(r2)
            throw r0
        L_0x03c9:
            java.lang.Class r2 = gcmSpecClass
            if (r2 == 0) goto L_0x0400
            boolean r2 = r2.isInstance(r3)
            if (r2 == 0) goto L_0x0400
            java.lang.String r2 = r1.modeName
            boolean r2 = r1.isAEADModeName(r2)
            if (r2 != 0) goto L_0x03ea
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r2 = r1.cipher
            boolean r2 = r2 instanceof org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher
            if (r2 == 0) goto L_0x03e2
            goto L_0x03ea
        L_0x03e2:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "GCMParameterSpec can only be used with AEAD modes."
            r0.<init>(r2)
            throw r0
        L_0x03ea:
            boolean r2 = r5 instanceof s0.a.b.k0.c1
            if (r2 == 0) goto L_0x03f5
            s0.a.b.k0.c1 r5 = (s0.a.b.k0.c1) r5
            s0.a.b.i r2 = r5.d
            s0.a.b.k0.y0 r2 = (s0.a.b.k0.y0) r2
            goto L_0x03f8
        L_0x03f5:
            r2 = r5
            s0.a.b.k0.y0 r2 = (s0.a.b.k0.y0) r2
        L_0x03f8:
            s0.a.b.k0.a r2 = org.bouncycastle.jcajce.provider.symmetric.util.GcmSpecUtil.extractAeadParameters(r2, r3)
            r5 = r2
        L_0x03fd:
            r1.aeadParams = r5
            goto L_0x040f
        L_0x0400:
            if (r3 == 0) goto L_0x040f
            boolean r2 = r3 instanceof javax.crypto.spec.PBEParameterSpec
            if (r2 == 0) goto L_0x0407
            goto L_0x040f
        L_0x0407:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "unknown parameter type."
            r0.<init>(r2)
            throw r0
        L_0x040f:
            int r2 = r1.ivLength
            r3 = 3
            if (r2 == 0) goto L_0x0453
            boolean r2 = r5 instanceof s0.a.b.k0.c1
            if (r2 != 0) goto L_0x0453
            boolean r2 = r5 instanceof s0.a.b.k0.a
            if (r2 != 0) goto L_0x0453
            if (r4 != 0) goto L_0x0423
            java.security.SecureRandom r2 = s0.a.b.j.a()
            goto L_0x0424
        L_0x0423:
            r2 = r4
        L_0x0424:
            if (r0 == r12) goto L_0x0444
            if (r0 != r3) goto L_0x0429
            goto L_0x0444
        L_0x0429:
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r2 = r1.cipher
            s0.a.b.e r2 = r2.getUnderlyingCipher()
            java.lang.String r2 = r2.getAlgorithmName()
            java.lang.String r6 = "PGPCFB"
            int r2 = r2.indexOf(r6)
            if (r2 < 0) goto L_0x043c
            goto L_0x0453
        L_0x043c:
            java.security.InvalidAlgorithmParameterException r0 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r2 = "no IV set when one expected"
            r0.<init>(r2)
            throw r0
        L_0x0444:
            int r6 = r1.ivLength
            byte[] r6 = new byte[r6]
            r2.nextBytes(r6)
            s0.a.b.k0.c1 r2 = new s0.a.b.k0.c1
            r2.<init>(r5, r6)
            r1.ivParam = r2
            r5 = r2
        L_0x0453:
            if (r4 == 0) goto L_0x045f
            boolean r2 = r1.padded
            if (r2 == 0) goto L_0x045f
            s0.a.b.k0.d1 r2 = new s0.a.b.k0.d1
            r2.<init>(r5, r4)
            r5 = r2
        L_0x045f:
            if (r0 == r12) goto L_0x048a
            if (r0 == r11) goto L_0x0484
            if (r0 == r3) goto L_0x048a
            if (r0 != r8) goto L_0x0468
            goto L_0x0484
        L_0x0468:
            java.security.InvalidParameterException r2 = new java.security.InvalidParameterException     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            r3.<init>()     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            java.lang.String r4 = "unknown opmode "
            r3.append(r4)     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            r3.append(r0)     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            java.lang.String r0 = " passed"
            r3.append(r0)     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            java.lang.String r0 = r3.toString()     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            r2.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
        L_0x0484:
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r0 = r1.cipher     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            r0.init(r10, r5)     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            goto L_0x048f
        L_0x048a:
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r0 = r1.cipher     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            r0.init(r12, r5)     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
        L_0x048f:
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$GenericBlockCipher r0 = r1.cipher     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            boolean r2 = r0 instanceof org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            if (r2 == 0) goto L_0x04b8
            s0.a.b.k0.a r2 = r1.aeadParams     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            if (r2 != 0) goto L_0x04b8
            org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$AEADGenericBlockCipher r0 = (org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.AEADGenericBlockCipher) r0     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            s0.a.b.i0.b r0 = r0.cipher     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            s0.a.b.k0.a r2 = new s0.a.b.k0.a     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            s0.a.b.k0.c1 r3 = r1.ivParam     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            s0.a.b.i r3 = r3.d     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            s0.a.b.k0.y0 r3 = (s0.a.b.k0.y0) r3     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            byte[] r0 = r0.a()     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            int r0 = r0.length     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            int r0 = r0 * 8
            s0.a.b.k0.c1 r4 = r1.ivParam     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            byte[] r4 = r4.c     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            r5 = 0
            r2.<init>(r3, r0, r4, r5)     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
            r1.aeadParams = r2     // Catch:{ IllegalArgumentException -> 0x04c4, Exception -> 0x04b9 }
        L_0x04b8:
            return
        L_0x04b9:
            r0 = move-exception
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$InvalidKeyOrParametersException r2 = new org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$InvalidKeyOrParametersException
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0)
            throw r2
        L_0x04c4:
            r0 = move-exception
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = r0.getMessage()
            r2.<init>(r3, r0)
            throw r2
        L_0x04cf:
            java.security.InvalidKeyException r0 = new java.security.InvalidKeyException
            java.lang.String r2 = "PKCS12 requires a SecretKey/PBEKey"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        GenericBlockCipher genericBlockCipher;
        BufferedGenericBlockCipher bufferedGenericBlockCipher;
        if (this.baseEngine != null) {
            String g = j.g(str);
            this.modeName = g;
            if (g.equals("ECB")) {
                this.ivLength = 0;
                genericBlockCipher = new BufferedGenericBlockCipher(this.baseEngine);
            } else if (this.modeName.equals("CBC")) {
                this.ivLength = this.baseEngine.b();
                genericBlockCipher = new BufferedGenericBlockCipher((e) new c(this.baseEngine));
            } else {
                if (this.modeName.startsWith("OFB")) {
                    this.ivLength = this.baseEngine.b();
                    if (this.modeName.length() != 3) {
                        bufferedGenericBlockCipher = new BufferedGenericBlockCipher((e) new t(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                    } else {
                        e eVar = this.baseEngine;
                        genericBlockCipher = new BufferedGenericBlockCipher((e) new t(eVar, eVar.b() * 8));
                    }
                } else if (this.modeName.startsWith("CFB")) {
                    this.ivLength = this.baseEngine.b();
                    if (this.modeName.length() != 3) {
                        bufferedGenericBlockCipher = new BufferedGenericBlockCipher((e) new s0.a.b.i0.e(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                    } else {
                        e eVar2 = this.baseEngine;
                        genericBlockCipher = new BufferedGenericBlockCipher((e) new s0.a.b.i0.e(eVar2, eVar2.b() * 8));
                    }
                } else if (this.modeName.startsWith("PGPCFB")) {
                    boolean equals = this.modeName.equals("PGPCFBWITHIV");
                    if (equals || this.modeName.length() == 6) {
                        this.ivLength = this.baseEngine.b();
                        bufferedGenericBlockCipher = new BufferedGenericBlockCipher((e) new v(this.baseEngine, equals));
                    } else {
                        StringBuilder P0 = i0.d.a.a.a.P0("no mode support for ");
                        P0.append(this.modeName);
                        throw new NoSuchAlgorithmException(P0.toString());
                    }
                } else if (this.modeName.equals("OPENPGPCFB")) {
                    this.ivLength = 0;
                    genericBlockCipher = new BufferedGenericBlockCipher((e) new u(this.baseEngine));
                } else if (this.modeName.equals("SIC")) {
                    int b = this.baseEngine.b();
                    this.ivLength = b;
                    if (b >= 16) {
                        this.fixedIv = false;
                        genericBlockCipher = new BufferedGenericBlockCipher(new f(new w(this.baseEngine)));
                    } else {
                        throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
                    }
                } else if (this.modeName.equals("CTR")) {
                    this.ivLength = this.baseEngine.b();
                    this.fixedIv = false;
                    e eVar3 = this.baseEngine;
                    bufferedGenericBlockCipher = eVar3 instanceof r ? new BufferedGenericBlockCipher(new f(new q(eVar3))) : new BufferedGenericBlockCipher(new f(new w(eVar3)));
                } else if (this.modeName.equals("GOFB")) {
                    this.ivLength = this.baseEngine.b();
                    genericBlockCipher = new BufferedGenericBlockCipher(new f(new o(this.baseEngine)));
                } else if (this.modeName.equals("GCFB")) {
                    this.ivLength = this.baseEngine.b();
                    genericBlockCipher = new BufferedGenericBlockCipher(new f(new m(this.baseEngine)));
                } else if (this.modeName.equals("CTS")) {
                    this.ivLength = this.baseEngine.b();
                    genericBlockCipher = new BufferedGenericBlockCipher((f) new s0.a.b.i0.f(new c(this.baseEngine)));
                } else if (this.modeName.equals("CCM")) {
                    this.ivLength = 12;
                    genericBlockCipher = this.baseEngine instanceof r ? new AEADGenericBlockCipher(new p(this.baseEngine)) : new AEADGenericBlockCipher(new d(this.baseEngine));
                } else if (this.modeName.equals("OCB")) {
                    if (this.engineProvider != null) {
                        this.ivLength = 15;
                        genericBlockCipher = new AEADGenericBlockCipher(new s(this.baseEngine, this.engineProvider.get()));
                    } else {
                        throw new NoSuchAlgorithmException(i0.d.a.a.a.n0("can't support mode ", str));
                    }
                } else if (this.modeName.equals("EAX")) {
                    this.ivLength = this.baseEngine.b();
                    genericBlockCipher = new AEADGenericBlockCipher(new s0.a.b.i0.h(this.baseEngine));
                } else if (this.modeName.equals("GCM")) {
                    this.ivLength = this.baseEngine.b();
                    genericBlockCipher = this.baseEngine instanceof r ? new AEADGenericBlockCipher(new s0.a.b.i0.r(this.baseEngine)) : new AEADGenericBlockCipher(new s0.a.b.i0.n(this.baseEngine));
                } else {
                    throw new NoSuchAlgorithmException(i0.d.a.a.a.n0("can't support mode ", str));
                }
                this.cipher = bufferedGenericBlockCipher;
                return;
            }
            this.cipher = genericBlockCipher;
            return;
        }
        throw new NoSuchAlgorithmException("no mode supported for this algorithm");
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        BufferedGenericBlockCipher bufferedGenericBlockCipher;
        if (this.baseEngine != null) {
            String g = j.g(str);
            if (g.equals("NOPADDING")) {
                if (this.cipher.wrapOnNoPadding()) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new f(this.cipher.getUnderlyingCipher()));
                } else {
                    return;
                }
            } else if (g.equals("WITHCTS") || g.equals("CTSPADDING") || g.equals("CS3PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher((f) new s0.a.b.i0.f(this.cipher.getUnderlyingCipher()));
            } else {
                this.padded = true;
                if (isAEADModeName(this.modeName)) {
                    throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
                } else if (g.equals("PKCS5PADDING") || g.equals("PKCS7PADDING")) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
                } else if (g.equals("ZEROBYTEPADDING")) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new s0.a.b.j0.h());
                } else if (g.equals("ISO10126PADDING") || g.equals("ISO10126-2PADDING")) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new s0.a.b.j0.b());
                } else if (g.equals("X9.23PADDING") || g.equals("X923PADDING")) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new g());
                } else if (g.equals("ISO7816-4PADDING") || g.equals("ISO9797-1PADDING")) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new s0.a.b.j0.c());
                } else if (g.equals("TBCPADDING")) {
                    bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new s0.a.b.j0.f());
                } else {
                    throw new NoSuchPaddingException(i0.d.a.a.a.o0("Padding ", str, " unknown."));
                }
            }
            this.cipher = bufferedGenericBlockCipher;
            return;
        }
        throw new NoSuchPaddingException("no padding supported for this algorithm");
    }

    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws ShortBufferException {
        if (this.cipher.getUpdateOutputSize(i2) + i3 <= bArr2.length) {
            try {
                return this.cipher.processBytes(bArr, i, i2, bArr2, i3);
            } catch (DataLengthException e) {
                throw new IllegalStateException(e.toString());
            }
        } else {
            throw new ShortBufferException("output buffer too short for input.");
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i2);
        if (updateOutputSize > 0) {
            byte[] bArr2 = new byte[updateOutputSize];
            int processBytes = this.cipher.processBytes(bArr, i, i2, bArr2, 0);
            if (processBytes == 0) {
                return null;
            }
            if (processBytes == updateOutputSize) {
                return bArr2;
            }
            byte[] bArr3 = new byte[processBytes];
            System.arraycopy(bArr2, 0, bArr3, 0, processBytes);
            return bArr3;
        }
        this.cipher.processBytes(bArr, i, i2, (byte[]) null, 0);
        return null;
    }

    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining >= 1) {
            if (byteBuffer.hasArray()) {
                engineUpdateAAD(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), remaining);
                byteBuffer.position(byteBuffer.limit());
            } else if (remaining <= 512) {
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                engineUpdateAAD(bArr, 0, remaining);
                Arrays.fill(bArr, (byte) 0);
            } else {
                byte[] bArr2 = new byte[512];
                do {
                    int min = Math.min(512, remaining);
                    byteBuffer.get(bArr2, 0, min);
                    engineUpdateAAD(bArr2, 0, min);
                    remaining -= min;
                } while (remaining > 0);
                Arrays.fill(bArr2, (byte) 0);
            }
        }
    }

    public void engineUpdateAAD(byte[] bArr, int i, int i2) {
        this.cipher.updateAAD(bArr, i, i2);
    }
}
