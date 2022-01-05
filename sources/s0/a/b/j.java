package s0.a.b;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.crypto.CryptoServicesPermission;
import s0.a.b.k0.h;
import s0.a.b.k0.l;
import s0.a.b.k0.p;
import s0.a.b.k0.s;
import s0.a.e.b.b0.c.h3;
import s0.a.g.k.d;

public final class j {
    public static final ThreadLocal<Map<String, Object[]>> a = new ThreadLocal<>();
    public static final Map<String, Object[]> b = Collections.synchronizedMap(new HashMap());
    public static final Object c = new Object();
    public static SecureRandom d;

    public static final class a {
        public static final a a = new a("dhDefaultParams", h.class);
        public static final a b = new a("dsaDefaultParams", p.class);
        public final String c;
        public final Class d;

        public a(String str, Class cls) {
            this.c = str;
            this.d = cls;
        }
    }

    static {
        new CryptoServicesPermission("globalConfig");
        new CryptoServicesPermission("threadLocalConfig");
        new CryptoServicesPermission("defaultRandomConfig");
        p pVar = new p(new BigInteger("fca682ce8e12caba26efccf7110e526db078b05edecbcd1eb4a208f3ae1617ae01f35b91a47e6df63413c5e12ed0899bcd132acd50d99151bdc43ee737592e17", 16), new BigInteger("962eddcc369cba8ebb260ee6b6a126d9346e38c5", 16), new BigInteger("678471b27a9cf44ee91a49c5147db1a9aaf244f05a434d6486931d2d14271b9e35030b71fd73da179069b32e2935630e1c2062354d0da20a6c416e50be794ca4", 16), new s(d.b("b869c82b35d70e1b1ff91b28e37a62ecdc34409b"), 123));
        p pVar2 = new p(new BigInteger("e9e642599d355f37c97ffd3567120b8e25c9cd43e927b3a9670fbec5d890141922d2c3b3ad2480093799869d1e846aab49fab0ad26d2ce6a22219d470bce7d777d4a21fbe9c270b57f607002f3cef8393694cf45ee3688c11a8c56ab127a3daf", 16), new BigInteger("9cdbd84c9f1ac2f38d0f80f42ab952e7338bf511", 16), new BigInteger("30470ad5a005fb14ce2d9dcd87e38bc7d1b1c5facbaecbe95f190aa7a31d23c4dbbcbe06174544401a5b2c020965d8c2bd2171d3668445771f74ba084d2029d83c1c158547f3a9f1a2715be23d51ae4d3e5a1f6a7064f316933a346d3f529252", 16), new s(d.b("77d0f8c4dad15eb8c4f2f8d6726cefd96d5bb399"), 263));
        p pVar3 = new p(new BigInteger("fd7f53811d75122952df4a9c2eece4e7f611b7523cef4400c31e3f80b6512669455d402251fb593d8d58fabfc5f5ba30f6cb9b556cd7813b801d346ff26660b76b9950a5a49f9fe8047b1022c24fbba9d7feb7c61bf83b57e7c6a8a6150f04fb83f6d3c51ec3023554135a169132f675f3ae2b61d72aeff22203199dd14801c7", 16), new BigInteger("9760508f15230bccb292b982a2eb840bf0581cf5", 16), new BigInteger("f7e1a085d69b3ddecbbcab5c36b857b97994afbbfa3aea82f9574c0b3d0782675159578ebad4594fe67107108180b449167123e84c281613b7cf09328cc8a6e13c167a8b547c8d28e0a3ae1e2bb3a675916ea37f0bfa213562f1fb627a01243bcca4f1bea8519089a883dfe15ae59f06928b665e807b552564014c3bfecf492a", 16), new s(d.b("8d5155894229d5e689ee01e6018a237e2cae64cd"), 92));
        p pVar4 = new p(new BigInteger("95475cf5d93e596c3fcd1d902add02f427f5f3c7210313bb45fb4d5bb2e5fe1cbd678cd4bbdd84c9836be1f31c0777725aeb6c2fc38b85f48076fa76bcd8146cc89a6fb2f706dd719898c2083dc8d896f84062e2c9c94d137b054a8d8096adb8d51952398eeca852a0af12df83e475aa65d4ec0c38a9560d5661186ff98b9fc9eb60eee8b030376b236bc73be3acdbd74fd61c1d2475fa3077b8f080467881ff7e1ca56fee066d79506ade51edbb5443a563927dbc4ba520086746175c8885925ebc64c6147906773496990cb714ec667304e261faee33b3cbdf008e0c3fa90650d97d3909c9275bf4ac86ffcb3d03e6dfc8ada5934242dd6d3bcca2a406cb0b", 16), new BigInteger("f8183668ba5fc5bb06b5981e6d8b795d30b8978d43ca0ec572e37e09939a9773", 16), new BigInteger("42debb9da5b3d88cc956e08787ec3f3a09bba5f48b889a74aaf53174aa0fbe7e3c5b8fcd7a53bef563b0e98560328960a9517f4014d3325fc7962bf1e049370d76d1314a76137e792f3f0db859d095e4a5b932024f079ecf2ef09c797452b0770e1350782ed57ddf794979dcef23cb96f183061965c4ebc93c9c71c56b925955a75f94cccf1449ac43d586d0beee43251b0b2287349d68de0d144403f13e802f4146d882e057af19b6f6275c6676c8fa0e3ca2713a3257fd1b27d0639f695e347d8d1cf9ac819a26ca9b04cb0eb9b7b035988d15bbac65212a55239cfc7e58fae38d7250ab9991ffbc97134025fe8ce04c4399ad96569be91a546f4978693c7a", 16), new s(d.b("b0b4417601b59cbc9d8ac8f935cadaec4f5fbb2f23785609ae466748d9b5a536"), 497));
        d(a.b, pVar, pVar2, pVar3, pVar4);
        d(a.a, e(pVar), e(pVar2), e(pVar3), e(pVar4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0012, code lost:
        if (d != null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0014, code lost:
        d = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0016, code lost:
        r1 = d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0018, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0019, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        r1 = new java.security.SecureRandom();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        monitor-enter(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.security.SecureRandom a() {
        /*
            java.lang.Object r0 = c
            monitor-enter(r0)
            java.security.SecureRandom r1 = d     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return r1
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
            monitor-enter(r0)
            java.security.SecureRandom r2 = d     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x0016
            d = r1     // Catch:{ all -> 0x001a }
        L_0x0016:
            java.security.SecureRandom r1 = d     // Catch:{ all -> 0x001a }
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s0.a.b.j.a():java.security.SecureRandom");
    }

    public static SecureRandom b(SecureRandom secureRandom) {
        return secureRandom == null ? a() : secureRandom;
    }

    public static <T> T c(a aVar, int i) {
        Map<String, Object[]> map = a.get();
        if (map == null || !map.containsKey(aVar.c)) {
            map = b;
        }
        T[] tArr = (Object[]) map.get(aVar.c);
        if (tArr == null) {
            return null;
        }
        int i2 = 0;
        if (aVar.d.isAssignableFrom(h.class)) {
            while (i2 != tArr.length) {
                T t = (h) tArr[i2];
                if (t.d.bitLength() == i) {
                    return t;
                }
                i2++;
            }
        } else if (aVar.d.isAssignableFrom(p.class)) {
            while (i2 != tArr.length) {
                T t2 = (p) tArr[i2];
                if (t2.q.bitLength() == i) {
                    return t2;
                }
                i2++;
            }
        }
        return null;
    }

    public static <T> void d(a aVar, T... tArr) {
        if (aVar.d.isAssignableFrom(tArr[0].getClass())) {
            ThreadLocal<Map<String, Object[]>> threadLocal = a;
            Map map = threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            map.put(aVar.c, tArr);
            b.put(aVar.c, tArr);
            return;
        }
        throw new IllegalArgumentException("Bad property value passed");
    }

    public static h e(p pVar) {
        int bitLength = pVar.q.bitLength();
        return new h(pVar.q, pVar.c, pVar.d, bitLength > 1024 ? bitLength <= 2048 ? 224 : bitLength <= 3072 ? 256 : bitLength <= 7680 ? 384 : 512 : 160, 0, (BigInteger) null, new l(h3.I(pVar.x.a), pVar.x.b));
    }
}
