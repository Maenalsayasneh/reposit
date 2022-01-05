package q0;

import com.pubnub.api.builder.PubNubErrorBuilder;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CipherSuite.kt */
public final class j {
    public static final Comparator<String> a = new a();
    public static final Map<String, j> b = new LinkedHashMap();
    public static final j c;
    public static final j d;
    public static final j e;
    public static final j f;
    public static final j g;
    public static final j h;
    public static final j i;
    public static final j j;
    public static final j k;
    public static final j l;
    public static final j m;
    public static final j n;
    public static final j o;
    public static final j p;
    public static final j q;
    public static final j r;
    public static final b s;
    public final String t;

    /* compiled from: CipherSuite.kt */
    public static final class a implements Comparator<String> {
        public int compare(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            i.e(str, "a");
            i.e(str2, "b");
            int min = Math.min(str.length(), str2.length());
            int i = 4;
            while (true) {
                if (i < min) {
                    char charAt = str.charAt(i);
                    char charAt2 = str2.charAt(i);
                    if (charAt == charAt2) {
                        i++;
                    } else if (i.g(charAt, charAt2) < 0) {
                        return -1;
                    }
                } else {
                    int length = str.length();
                    int length2 = str2.length();
                    if (length == length2) {
                        return 0;
                    }
                    if (length < length2) {
                        return -1;
                    }
                }
            }
            return 1;
        }
    }

    /* compiled from: CipherSuite.kt */
    public static final class b {
        public b(f fVar) {
        }

        public static final j a(b bVar, String str, int i) {
            j jVar = new j(str, (f) null);
            j.b.put(str, jVar);
            return jVar;
        }

        public final synchronized j b(String str) {
            j jVar;
            i.e(str, "javaName");
            Map<String, j> map = j.b;
            jVar = map.get(str);
            if (jVar == null) {
                jVar = map.get(c(str));
                if (jVar == null) {
                    jVar = new j(str, (f) null);
                }
                map.put(str, jVar);
            }
            return jVar;
        }

        public final String c(String str) {
            if (StringsKt__IndentKt.J(str, "TLS_", false, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("SSL_");
                String substring = str.substring(4);
                i.d(substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                return sb.toString();
            } else if (!StringsKt__IndentKt.J(str, "SSL_", false, 2)) {
                return str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TLS_");
                String substring2 = str.substring(4);
                i.d(substring2, "(this as java.lang.String).substring(startIndex)");
                sb2.append(substring2);
                return sb2.toString();
            }
        }
    }

    static {
        b bVar = new b((f) null);
        s = bVar;
        b.a(bVar, "SSL_RSA_WITH_NULL_MD5", 1);
        b.a(bVar, "SSL_RSA_WITH_NULL_SHA", 2);
        b.a(bVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        b.a(bVar, "SSL_RSA_WITH_RC4_128_MD5", 4);
        b.a(bVar, "SSL_RSA_WITH_RC4_128_SHA", 5);
        b.a(bVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        b.a(bVar, "SSL_RSA_WITH_DES_CBC_SHA", 9);
        c = b.a(bVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        b.a(bVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        b.a(bVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        b.a(bVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        b.a(bVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        b.a(bVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        b.a(bVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        b.a(bVar, "SSL_DH_anon_WITH_RC4_128_MD5", 24);
        b.a(bVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        b.a(bVar, "SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        b.a(bVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_SHA", 30);
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_SHA", 32);
        b.a(bVar, "TLS_KRB5_WITH_DES_CBC_MD5", 34);
        b.a(bVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        b.a(bVar, "TLS_KRB5_WITH_RC4_128_MD5", 36);
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        b.a(bVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        d = b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        e = b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        b.a(bVar, "TLS_RSA_WITH_NULL_SHA256", 59);
        b.a(bVar, "TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        b.a(bVar, "TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        b.a(bVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", PubNubErrorBuilder.PNERR_CHANNEL_MISSING);
        b.a(bVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", PubNubErrorBuilder.PNERR_CRYPTO_ERROR);
        b.a(bVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", PubNubErrorBuilder.PNERR_GROUP_MISSING);
        b.a(bVar, "TLS_PSK_WITH_RC4_128_SHA", PubNubErrorBuilder.PNERR_SUBSCRIBE_KEY_MISSING);
        b.a(bVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA", PubNubErrorBuilder.PNERR_PUBLISH_KEY_MISSING);
        b.a(bVar, "TLS_PSK_WITH_AES_128_CBC_SHA", PubNubErrorBuilder.PNERR_STATE_MISSING);
        b.a(bVar, "TLS_PSK_WITH_AES_256_CBC_SHA", PubNubErrorBuilder.PNERR_CHANNEL_AND_GROUP_MISSING);
        b.a(bVar, "TLS_RSA_WITH_SEED_CBC_SHA", PubNubErrorBuilder.PNERR_SPACE_MISSING);
        f = b.a(bVar, "TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        g = b.a(bVar, "TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", PubNubErrorBuilder.PNERR_MESSAGE_ACTION_MISSING);
        b.a(bVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", PubNubErrorBuilder.PNERR_MESSAGE_ACTION_TYPE_MISSING);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", PubNubErrorBuilder.PNERR_MESSAGE_ACTION_TIMETOKEN_MISSING);
        b.a(bVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", PubNubErrorBuilder.PNERR_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS);
        b.a(bVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256", PubNubErrorBuilder.PNERR_PAGINATION_PREV_OUT_OF_BOUNDS);
        b.a(bVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384", PubNubErrorBuilder.PNERR_PAYLOAD_TOO_LARGE);
        b.a(bVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        b.a(bVar, "TLS_FALLBACK_SCSV", 22016);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        b.a(bVar, "TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        b.a(bVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        b.a(bVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        h = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        i = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        b.a(bVar, "TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        b.a(bVar, "TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        b.a(bVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        b.a(bVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        j = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        k = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        b.a(bVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        l = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        m = b.a(bVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        b.a(bVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        b.a(bVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        n = b.a(bVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        o = b.a(bVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        b.a(bVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        b.a(bVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        p = b.a(bVar, "TLS_AES_128_GCM_SHA256", 4865);
        q = b.a(bVar, "TLS_AES_256_GCM_SHA384", 4866);
        r = b.a(bVar, "TLS_CHACHA20_POLY1305_SHA256", 4867);
        b.a(bVar, "TLS_AES_128_CCM_SHA256", 4868);
        b.a(bVar, "TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public j(String str, f fVar) {
        this.t = str;
    }

    public String toString() {
        return this.t;
    }
}
