package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m0.r.t.a.r.m.a1.a;
import s0.a.a.n;
import s0.a.a.v2.b;
import s0.a.b.b0.a0;
import s0.a.b.b0.p;
import s0.a.b.b0.v;
import s0.a.b.b0.w;
import s0.a.b.b0.x;
import s0.a.b.b0.y;
import s0.a.g.j;

public class DigestFactory {
    private static Set md5 = new HashSet();
    private static Map oids = new HashMap();
    private static Set sha1 = new HashSet();
    private static Set sha224 = new HashSet();
    private static Set sha256 = new HashSet();
    private static Set sha384 = new HashSet();
    private static Set sha3_224 = new HashSet();
    private static Set sha3_256 = new HashSet();
    private static Set sha3_384 = new HashSet();
    private static Set sha3_512 = new HashSet();
    private static Set sha512 = new HashSet();
    private static Set sha512_224 = new HashSet();
    private static Set sha512_256 = new HashSet();

    static {
        md5.add("MD5");
        Set set = md5;
        n nVar = s0.a.a.w2.n.X;
        set.add(nVar.d);
        sha1.add("SHA1");
        sha1.add("SHA-1");
        Set set2 = sha1;
        n nVar2 = b.f;
        set2.add(nVar2.d);
        sha224.add("SHA224");
        sha224.add("SHA-224");
        Set set3 = sha224;
        n nVar3 = s0.a.a.r2.b.f;
        set3.add(nVar3.d);
        sha256.add("SHA256");
        sha256.add("SHA-256");
        Set set4 = sha256;
        n nVar4 = s0.a.a.r2.b.c;
        set4.add(nVar4.d);
        sha384.add("SHA384");
        sha384.add("SHA-384");
        Set set5 = sha384;
        n nVar5 = s0.a.a.r2.b.d;
        set5.add(nVar5.d);
        sha512.add("SHA512");
        sha512.add("SHA-512");
        Set set6 = sha512;
        n nVar6 = s0.a.a.r2.b.e;
        set6.add(nVar6.d);
        sha512_224.add("SHA512(224)");
        sha512_224.add("SHA-512(224)");
        Set set7 = sha512_224;
        n nVar7 = s0.a.a.r2.b.g;
        n nVar8 = nVar6;
        set7.add(nVar7.d);
        sha512_256.add("SHA512(256)");
        sha512_256.add("SHA-512(256)");
        Set set8 = sha512_256;
        n nVar9 = s0.a.a.r2.b.h;
        n nVar10 = nVar7;
        set8.add(nVar9.d);
        sha3_224.add("SHA3-224");
        Set set9 = sha3_224;
        n nVar11 = s0.a.a.r2.b.i;
        n nVar12 = nVar9;
        set9.add(nVar11.d);
        sha3_256.add("SHA3-256");
        Set set10 = sha3_256;
        n nVar13 = s0.a.a.r2.b.j;
        n nVar14 = nVar11;
        set10.add(nVar13.d);
        sha3_384.add("SHA3-384");
        Set set11 = sha3_384;
        n nVar15 = s0.a.a.r2.b.k;
        n nVar16 = nVar13;
        set11.add(nVar15.d);
        sha3_512.add("SHA3-512");
        Set set12 = sha3_512;
        n nVar17 = s0.a.a.r2.b.l;
        set12.add(nVar17.d);
        oids.put("MD5", nVar);
        oids.put(nVar.d, nVar);
        oids.put("SHA1", nVar2);
        oids.put("SHA-1", nVar2);
        oids.put(nVar2.d, nVar2);
        oids.put("SHA224", nVar3);
        oids.put("SHA-224", nVar3);
        oids.put(nVar3.d, nVar3);
        oids.put("SHA256", nVar4);
        oids.put("SHA-256", nVar4);
        oids.put(nVar4.d, nVar4);
        oids.put("SHA384", nVar5);
        oids.put("SHA-384", nVar5);
        oids.put(nVar5.d, nVar5);
        n nVar18 = nVar8;
        oids.put("SHA512", nVar18);
        oids.put("SHA-512", nVar18);
        oids.put(nVar18.d, nVar18);
        n nVar19 = nVar10;
        oids.put("SHA512(224)", nVar19);
        oids.put("SHA-512(224)", nVar19);
        oids.put(nVar19.d, nVar19);
        n nVar20 = nVar12;
        oids.put("SHA512(256)", nVar20);
        oids.put("SHA-512(256)", nVar20);
        oids.put(nVar20.d, nVar20);
        n nVar21 = nVar14;
        oids.put("SHA3-224", nVar21);
        oids.put(nVar21.d, nVar21);
        n nVar22 = nVar16;
        oids.put("SHA3-256", nVar22);
        oids.put(nVar22.d, nVar22);
        n nVar23 = nVar15;
        oids.put("SHA3-384", nVar23);
        oids.put(nVar23.d, nVar23);
        oids.put("SHA3-512", nVar17);
        oids.put(nVar17.d, nVar17);
    }

    public static s0.a.b.n getDigest(String str) {
        String g = j.g(str);
        if (sha1.contains(g)) {
            return new v();
        }
        if (md5.contains(g)) {
            return new p();
        }
        if (sha224.contains(g)) {
            return new w();
        }
        if (sha256.contains(g)) {
            return new x();
        }
        if (sha384.contains(g)) {
            return new y();
        }
        if (sha512.contains(g)) {
            return new a0();
        }
        if (sha512_224.contains(g)) {
            return a.V0();
        }
        if (sha512_256.contains(g)) {
            return a.W0();
        }
        if (sha3_224.contains(g)) {
            return a.R0();
        }
        if (sha3_256.contains(g)) {
            return a.S0();
        }
        if (sha3_384.contains(g)) {
            return a.T0();
        }
        if (sha3_512.contains(g)) {
            return a.U0();
        }
        return null;
    }

    public static n getOID(String str) {
        return (n) oids.get(str);
    }

    public static boolean isSameDigest(String str, String str2) {
        return (sha1.contains(str) && sha1.contains(str2)) || (sha224.contains(str) && sha224.contains(str2)) || ((sha256.contains(str) && sha256.contains(str2)) || ((sha384.contains(str) && sha384.contains(str2)) || ((sha512.contains(str) && sha512.contains(str2)) || ((sha512_224.contains(str) && sha512_224.contains(str2)) || ((sha512_256.contains(str) && sha512_256.contains(str2)) || ((sha3_224.contains(str) && sha3_224.contains(str2)) || ((sha3_256.contains(str) && sha3_256.contains(str2)) || ((sha3_384.contains(str) && sha3_384.contains(str2)) || ((sha3_512.contains(str) && sha3_512.contains(str2)) || (md5.contains(str) && md5.contains(str2)))))))))));
    }
}
