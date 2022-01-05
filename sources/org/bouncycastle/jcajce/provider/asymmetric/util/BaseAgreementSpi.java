package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.KeyAgreementSpi;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.SecretKeySpec;
import s0.a.a.n;
import s0.a.a.q2.c;
import s0.a.a.r2.b;
import s0.a.a.t2.a;
import s0.a.b.k0.x0;
import s0.a.b.l;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public abstract class BaseAgreementSpi extends KeyAgreementSpi {
    private static final Map<String, n> defaultOids;
    private static final Hashtable des = new Hashtable();
    private static final Map<String, Integer> keySizes;
    private static final Map<String, String> nameTable;
    private static final Hashtable oids = new Hashtable();
    public final String kaAlgorithm;
    public final l kdf;
    public byte[] ukmParameters;

    static {
        HashMap hashMap = new HashMap();
        defaultOids = hashMap;
        HashMap hashMap2 = new HashMap();
        keySizes = hashMap2;
        HashMap hashMap3 = new HashMap();
        nameTable = hashMap3;
        hashMap2.put("DES", 64);
        hashMap2.put("DESEDE", 192);
        hashMap2.put("BLOWFISH", 128);
        hashMap2.put("AES", 256);
        hashMap2.put(b.t.d, 128);
        hashMap2.put(b.B.d, 192);
        hashMap2.put(b.J.d, 256);
        hashMap2.put(b.u.d, 128);
        hashMap2.put(b.C.d, 192);
        n nVar = b.K;
        hashMap2.put(nVar.d, 256);
        hashMap2.put(b.w.d, 128);
        hashMap2.put(b.E.d, 192);
        hashMap2.put(b.M.d, 256);
        hashMap2.put(b.v.d, 128);
        hashMap2.put(b.D.d, 192);
        hashMap2.put(b.L.d, 256);
        n nVar2 = b.x;
        hashMap2.put(nVar2.d, 128);
        hashMap2.put(b.F.d, 192);
        hashMap2.put(b.N.d, 256);
        n nVar3 = b.z;
        hashMap2.put(nVar3.d, 128);
        hashMap2.put(b.H.d, 192);
        hashMap2.put(b.P.d, 256);
        hashMap2.put(b.y.d, 128);
        hashMap2.put(b.G.d, 192);
        hashMap2.put(b.O.d, 256);
        n nVar4 = a.d;
        hashMap2.put(nVar4.d, 128);
        n nVar5 = a.e;
        hashMap2.put(nVar5.d, 192);
        n nVar6 = a.f;
        n nVar7 = nVar3;
        hashMap2.put(nVar6.d, 256);
        n nVar8 = s0.a.a.p2.a.c;
        n nVar9 = nVar2;
        hashMap2.put(nVar8.d, 128);
        n nVar10 = s0.a.a.w2.n.M0;
        hashMap2.put(nVar10.d, 192);
        n nVar11 = s0.a.a.w2.n.R;
        n nVar12 = nVar8;
        hashMap2.put(nVar11.d, 192);
        n nVar13 = s0.a.a.v2.b.b;
        hashMap2.put(nVar13.d, 64);
        n nVar14 = s0.a.a.g2.a.f;
        hashMap2.put(nVar14.d, 256);
        hashMap2.put(s0.a.a.g2.a.d.d, 256);
        hashMap2.put(s0.a.a.g2.a.e.d, 256);
        n nVar15 = s0.a.a.w2.n.Y;
        n nVar16 = nVar14;
        hashMap2.put(nVar15.d, 160);
        n nVar17 = s0.a.a.w2.n.a0;
        hashMap2.put(nVar17.d, 256);
        n nVar18 = s0.a.a.w2.n.b0;
        n nVar19 = nVar5;
        hashMap2.put(nVar18.d, 384);
        n nVar20 = s0.a.a.w2.n.c0;
        n nVar21 = nVar4;
        hashMap2.put(nVar20.d, 512);
        hashMap.put("DESEDE", nVar11);
        hashMap.put("AES", nVar);
        n nVar22 = a.c;
        hashMap.put("CAMELLIA", nVar22);
        n nVar23 = s0.a.a.p2.a.a;
        hashMap.put("SEED", nVar23);
        hashMap.put("DES", nVar13);
        hashMap3.put(c.h.d, "CAST5");
        hashMap3.put(c.i.d, "IDEA");
        hashMap3.put(c.l.d, "Blowfish");
        hashMap3.put(c.m.d, "Blowfish");
        hashMap3.put(c.n.d, "Blowfish");
        hashMap3.put(c.o.d, "Blowfish");
        hashMap3.put(s0.a.a.v2.b.a.d, "DES");
        hashMap3.put(nVar13.d, "DES");
        hashMap3.put(s0.a.a.v2.b.d.d, "DES");
        hashMap3.put(s0.a.a.v2.b.c.d, "DES");
        hashMap3.put(s0.a.a.v2.b.e.d, "DESede");
        Map<String, String> map = nameTable;
        map.put(nVar11.d, "DESede");
        map.put(nVar10.d, "DESede");
        map.put(s0.a.a.w2.n.N0.d, "RC2");
        map.put(nVar15.d, "HmacSHA1");
        map.put(s0.a.a.w2.n.Z.d, "HmacSHA224");
        map.put(nVar17.d, "HmacSHA256");
        map.put(nVar18.d, "HmacSHA384");
        map.put(nVar20.d, "HmacSHA512");
        map.put(a.a.d, "Camellia");
        map.put(a.b.d, "Camellia");
        map.put(nVar22.d, "Camellia");
        map.put(nVar21.d, "Camellia");
        map.put(nVar19.d, "Camellia");
        map.put(nVar6.d, "Camellia");
        map.put(nVar12.d, "SEED");
        map.put(nVar23.d, "SEED");
        map.put(s0.a.a.p2.a.b.d, "SEED");
        map.put(nVar16.d, "GOST28147");
        map.put(nVar9.d, "AES");
        n nVar24 = nVar7;
        map.put(nVar24.d, "AES");
        map.put(nVar24.d, "AES");
        Hashtable hashtable = oids;
        hashtable.put("DESEDE", nVar11);
        hashtable.put("AES", nVar);
        hashtable.put("DES", nVar13);
        Hashtable hashtable2 = des;
        hashtable2.put("DES", "DES");
        hashtable2.put("DESEDE", "DES");
        hashtable2.put(nVar13.d, "DES");
        hashtable2.put(nVar11.d, "DES");
        hashtable2.put(nVar10.d, "DES");
    }

    public BaseAgreementSpi(String str, l lVar) {
        this.kaAlgorithm = str;
        this.kdf = lVar;
    }

    public static String getAlgorithm(String str) {
        if (str.indexOf(91) > 0) {
            return str.substring(0, str.indexOf(91));
        }
        if (str.startsWith(b.s.d)) {
            return "AES";
        }
        if (str.startsWith(s0.a.a.k2.a.b.d)) {
            return "Serpent";
        }
        String str2 = nameTable.get(j.g(str));
        return str2 != null ? str2 : str;
    }

    public static int getKeySize(String str) {
        if (str.indexOf(91) > 0) {
            return Integer.parseInt(str.substring(str.indexOf(91) + 1, str.indexOf(93)));
        }
        String g = j.g(str);
        Map<String, Integer> map = keySizes;
        if (!map.containsKey(g)) {
            return -1;
        }
        return map.get(g).intValue();
    }

    private byte[] getSharedSecretBytes(byte[] bArr, String str, int i) throws NoSuchAlgorithmException {
        l lVar = this.kdf;
        if (lVar != null) {
            if (i >= 0) {
                int i2 = i / 8;
                byte[] bArr2 = new byte[i2];
                if (!(lVar instanceof s0.a.b.a0.l.c)) {
                    lVar.init(new x0(bArr, this.ukmParameters));
                } else if (str != null) {
                    try {
                        this.kdf.init(new s0.a.b.a0.l.b(new n(str), i, bArr, this.ukmParameters));
                    } catch (IllegalArgumentException unused) {
                        throw new NoSuchAlgorithmException(i0.d.a.a.a.n0("no OID for algorithm: ", str));
                    }
                } else {
                    throw new NoSuchAlgorithmException("algorithm OID is null");
                }
                this.kdf.generateBytes(bArr2, 0, i2);
                h3.H(bArr);
                return bArr2;
            }
            throw new NoSuchAlgorithmException(i0.d.a.a.a.n0("unknown algorithm encountered: ", str));
        } else if (i <= 0) {
            return bArr;
        } else {
            int i3 = i / 8;
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, 0, bArr3, 0, i3);
            h3.H(bArr);
            return bArr3;
        }
    }

    public static byte[] trimZeroes(byte[] bArr) {
        if (bArr[0] != 0) {
            return bArr;
        }
        int i = 0;
        while (i < bArr.length && bArr[i] == 0) {
            i++;
        }
        int length = bArr.length - i;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, i, bArr2, 0, length);
        return bArr2;
    }

    public abstract byte[] calcSecret();

    public int engineGenerateSecret(byte[] bArr, int i) throws IllegalStateException, ShortBufferException {
        byte[] engineGenerateSecret = engineGenerateSecret();
        if (bArr.length - i >= engineGenerateSecret.length) {
            System.arraycopy(engineGenerateSecret, 0, bArr, i, engineGenerateSecret.length);
            return engineGenerateSecret.length;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.kaAlgorithm);
        sb.append(" key agreement: need ");
        throw new ShortBufferException(i0.d.a.a.a.u0(sb, engineGenerateSecret.length, " bytes"));
    }

    public SecretKey engineGenerateSecret(String str) throws NoSuchAlgorithmException {
        String g = j.g(str);
        Hashtable hashtable = oids;
        String str2 = hashtable.containsKey(g) ? ((n) hashtable.get(g)).d : str;
        byte[] sharedSecretBytes = getSharedSecretBytes(calcSecret(), str2, getKeySize(str2));
        String algorithm = getAlgorithm(str);
        if (des.containsKey(algorithm)) {
            s0.a.b.k0.c.c(sharedSecretBytes);
        }
        return new SecretKeySpec(sharedSecretBytes, algorithm);
    }

    public byte[] engineGenerateSecret() throws IllegalStateException {
        if (this.kdf == null) {
            return calcSecret();
        }
        byte[] calcSecret = calcSecret();
        try {
            return getSharedSecretBytes(calcSecret, (String) null, calcSecret.length * 8);
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e.getMessage());
        }
    }
}
