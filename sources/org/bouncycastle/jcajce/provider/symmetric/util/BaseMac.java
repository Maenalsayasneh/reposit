package org.bouncycastle.jcajce.provider.symmetric.util;

import i0.d.a.a.a;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import s0.a.b.h0.g;
import s0.a.b.i;
import s0.a.b.k0.c1;
import s0.a.b.k0.g1;
import s0.a.b.k0.m1;
import s0.a.b.k0.y0;
import s0.a.b.s;
import s0.a.c.n.q;
import s0.a.e.b.b0.c.h3;

public class BaseMac extends MacSpi implements PBE {
    private static final Class gcmSpecClass = ClassUtil.loadClass(BaseMac.class, "javax.crypto.spec.GCMParameterSpec");
    private int keySize = 160;
    private s macEngine;
    private int pbeHash = 1;
    private int scheme = 2;

    public BaseMac(s sVar) {
        this.macEngine = sVar;
    }

    public BaseMac(s sVar, int i, int i2, int i3) {
        this.macEngine = sVar;
        this.scheme = i;
        this.pbeHash = i2;
        this.keySize = i3;
    }

    private static Hashtable copyMap(Map map) {
        Hashtable hashtable = new Hashtable();
        for (Object next : map.keySet()) {
            hashtable.put(next, map.get(next));
        }
        return hashtable;
    }

    public byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.macEngine.doFinal(bArr, 0);
        return bArr;
    }

    public int engineGetMacLength() {
        return this.macEngine.getMacSize();
    }

    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        i iVar;
        i iVar2;
        if (key != null) {
            if (key instanceof PKCS12Key) {
                try {
                    SecretKey secretKey = (SecretKey) key;
                    try {
                        PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                        if ((secretKey instanceof PBEKey) && pBEParameterSpec == null) {
                            PBEKey pBEKey = (PBEKey) secretKey;
                            pBEParameterSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                        }
                        int i = 1;
                        int i2 = 256;
                        if (this.macEngine.getAlgorithmName().startsWith("GOST")) {
                            i = 6;
                        } else {
                            s sVar = this.macEngine;
                            if ((sVar instanceof g) && !sVar.getAlgorithmName().startsWith("SHA-1")) {
                                if (this.macEngine.getAlgorithmName().startsWith("SHA-224")) {
                                    i = 7;
                                    i2 = 224;
                                } else if (this.macEngine.getAlgorithmName().startsWith("SHA-256")) {
                                    i = 4;
                                } else if (this.macEngine.getAlgorithmName().startsWith("SHA-384")) {
                                    i = 8;
                                    i2 = 384;
                                } else if (this.macEngine.getAlgorithmName().startsWith("SHA-512")) {
                                    i = 9;
                                    i2 = 512;
                                } else if (this.macEngine.getAlgorithmName().startsWith("RIPEMD160")) {
                                    i = 2;
                                } else {
                                    StringBuilder P0 = a.P0("no PKCS12 mapping for HMAC: ");
                                    P0.append(this.macEngine.getAlgorithmName());
                                    throw new InvalidAlgorithmParameterException(P0.toString());
                                }
                            }
                            i2 = 160;
                        }
                        iVar = PBE.Util.makePBEMacParameters(secretKey, 2, i, i2, pBEParameterSpec);
                    } catch (Exception unused) {
                        throw new InvalidAlgorithmParameterException("PKCS12 requires a PBEParameterSpec");
                    }
                } catch (Exception unused2) {
                    throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
                }
            } else if (key instanceof BCPBEKey) {
                BCPBEKey bCPBEKey = (BCPBEKey) key;
                if (bCPBEKey.getParam() != null) {
                    iVar = bCPBEKey.getParam();
                } else if (algorithmParameterSpec instanceof PBEParameterSpec) {
                    iVar = PBE.Util.makePBEMacParameters(bCPBEKey, algorithmParameterSpec);
                } else {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                iVar = new y0(key.getEncoded());
            } else {
                StringBuilder P02 = a.P0("inappropriate parameter type: ");
                P02.append(algorithmParameterSpec.getClass().getName());
                throw new InvalidAlgorithmParameterException(P02.toString());
            }
            y0 y0Var = iVar instanceof c1 ? (y0) ((c1) iVar).d : (y0) iVar;
            if (algorithmParameterSpec instanceof s0.a.c.n.a) {
                s0.a.c.n.a aVar = (s0.a.c.n.a) algorithmParameterSpec;
                iVar2 = new s0.a.b.k0.a(y0Var, aVar.b, aVar.getIV(), h3.I(aVar.a));
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                iVar2 = new c1(y0Var, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                iVar2 = new c1(new g1(y0Var.c, rC2ParameterSpec.getEffectiveKeyBits()), rC2ParameterSpec.getIV());
            } else if (algorithmParameterSpec instanceof q) {
                Hashtable copyMap = copyMap(((q) algorithmParameterSpec).a);
                Hashtable hashtable = new Hashtable();
                Enumeration keys = copyMap.keys();
                while (keys.hasMoreElements()) {
                    Integer num = (Integer) keys.nextElement();
                    hashtable.put(num, copyMap.get(num));
                }
                byte[] bArr = y0Var.c;
                if (bArr != null) {
                    hashtable.put(0, bArr);
                    iVar2 = new m1(hashtable, (m1.a) null);
                } else {
                    throw new IllegalArgumentException("Parameter value must not be null.");
                }
            } else if (algorithmParameterSpec == null) {
                iVar2 = new y0(key.getEncoded());
            } else {
                Class cls = gcmSpecClass;
                if (cls == null || !cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
                    iVar2 = iVar;
                    if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                        StringBuilder P03 = a.P0("unknown parameter type: ");
                        P03.append(algorithmParameterSpec.getClass().getName());
                        throw new InvalidAlgorithmParameterException(P03.toString());
                    }
                } else {
                    iVar2 = GcmSpecUtil.extractAeadParameters(y0Var, algorithmParameterSpec);
                }
            }
            try {
                this.macEngine.init(iVar2);
            } catch (Exception e) {
                throw new InvalidAlgorithmParameterException(a.a0(e, a.P0("cannot initialize MAC: ")));
            }
        } else {
            throw new InvalidKeyException("key is null");
        }
    }

    public void engineReset() {
        this.macEngine.reset();
    }

    public void engineUpdate(byte b) {
        this.macEngine.update(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.macEngine.update(bArr, i, i2);
    }
}
