package s0.a.a.j2;

import java.math.BigInteger;
import java.util.Hashtable;
import s0.a.a.d3.h;
import s0.a.a.d3.i;
import s0.a.a.d3.j;
import s0.a.a.n;
import s0.a.e.b.e;
import s0.a.e.b.v;
import s0.a.g.k.d;

public class a {
    public static i a = new C0297a();
    public static i b = new b();
    public static final Hashtable c;
    public static final Hashtable d;
    public static final Hashtable e;

    /* renamed from: s0.a.a.j2.a$a  reason: collision with other inner class name */
    public static class C0297a extends i {
        public h a() {
            BigInteger a = a.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF");
            BigInteger a2 = a.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC");
            BigInteger a3 = a.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93");
            BigInteger a4 = a.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123");
            BigInteger valueOf = BigInteger.valueOf(1);
            e.C0302e eVar = new e.C0302e(a, a2, a3, a4, valueOf);
            j jVar = new j((e) eVar, d.b("0432C4AE2C1F1981195F9904466A39C9948FE30BBFF2660BE1715A4589334C74C7BC3736A2F4F6779C59BDCEE36B692153D0A9877CC62A474002DF32E52139F0A0"));
            v.a(jVar.s());
            return new h(eVar, jVar, a4, valueOf, (byte[]) null);
        }
    }

    public static class b extends i {
        public h a() {
            BigInteger a = a.a("BDB6F4FE3E8B1D9E0DA8C0D46F4C318CEFE4AFE3B6B8551F");
            BigInteger a2 = a.a("BB8E5E8FBC115E139FE6A814FE48AAA6F0ADA1AA5DF91985");
            BigInteger a3 = a.a("1854BEBDC31B21B7AEFC80AB0ECD10D5B1B3308E6DBF11C1");
            BigInteger a4 = a.a("BDB6F4FE3E8B1D9E0DA8C0D40FC962195DFAE76F56564677");
            BigInteger valueOf = BigInteger.valueOf(1);
            e.C0302e eVar = new e.C0302e(a, a2, a3, a4, valueOf);
            j jVar = new j((e) eVar, d.b("044AD5F7048DE709AD51236DE65E4D4B482C836DC6E410664002BB3A02D4AAADACAE24817A4CA3A1B014B5270432DB27D2"));
            v.a(jVar.s());
            return new h(eVar, jVar, a4, valueOf, (byte[]) null);
        }
    }

    static {
        Hashtable hashtable = new Hashtable();
        c = hashtable;
        Hashtable hashtable2 = new Hashtable();
        d = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        e = hashtable3;
        n nVar = b.d;
        i iVar = b;
        hashtable.put(s0.a.g.j.d("wapip192v1"), nVar);
        hashtable3.put(nVar, "wapip192v1");
        hashtable2.put(nVar, iVar);
        n nVar2 = b.b;
        i iVar2 = a;
        hashtable.put(s0.a.g.j.d("sm2p256v1"), nVar2);
        hashtable3.put(nVar2, "sm2p256v1");
        hashtable2.put(nVar2, iVar2);
    }

    public static BigInteger a(String str) {
        return new BigInteger(1, d.b(str));
    }
}
