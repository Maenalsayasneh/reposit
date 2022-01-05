package s0.a.f.b.h;

import com.pubnub.api.builder.PubNubErrorBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a implements r {
    public static final Map<String, a> a;
    public final int b;
    public final String c;

    static {
        HashMap hashMap = new HashMap();
        i0.d.a.a.a.u1(1, "XMSSMT_SHA2_20/2_256", hashMap, b("SHA-256", 32, 16, 67, 20, 2));
        i0.d.a.a.a.u1(2, "XMSSMT_SHA2_20/4_256", hashMap, b("SHA-256", 32, 16, 67, 20, 4));
        i0.d.a.a.a.u1(3, "XMSSMT_SHA2_40/2_256", hashMap, b("SHA-256", 32, 16, 67, 40, 2));
        i0.d.a.a.a.u1(4, "XMSSMT_SHA2_40/4_256", hashMap, b("SHA-256", 32, 16, 67, 40, 2));
        i0.d.a.a.a.u1(5, "XMSSMT_SHA2_40/8_256", hashMap, b("SHA-256", 32, 16, 67, 40, 4));
        i0.d.a.a.a.u1(6, "XMSSMT_SHA2_60/3_256", hashMap, b("SHA-256", 32, 16, 67, 60, 8));
        i0.d.a.a.a.u1(7, "XMSSMT_SHA2_60/6_256", hashMap, b("SHA-256", 32, 16, 67, 60, 6));
        i0.d.a.a.a.u1(8, "XMSSMT_SHA2_60/12_256", hashMap, b("SHA-256", 32, 16, 67, 60, 12));
        i0.d.a.a.a.u1(9, "XMSSMT_SHA2_20/2_512", hashMap, b("SHA-512", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 20, 2));
        i0.d.a.a.a.u1(10, "XMSSMT_SHA2_20/4_512", hashMap, b("SHA-512", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 20, 4));
        i0.d.a.a.a.u1(11, "XMSSMT_SHA2_40/2_512", hashMap, b("SHA-512", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 40, 2));
        i0.d.a.a.a.u1(12, "XMSSMT_SHA2_40/4_512", hashMap, b("SHA-512", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 40, 4));
        i0.d.a.a.a.u1(13, "XMSSMT_SHA2_40/8_512", hashMap, b("SHA-512", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 40, 8));
        i0.d.a.a.a.u1(14, "XMSSMT_SHA2_60/3_512", hashMap, b("SHA-512", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 60, 3));
        i0.d.a.a.a.u1(15, "XMSSMT_SHA2_60/6_512", hashMap, b("SHA-512", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 60, 6));
        i0.d.a.a.a.u1(16, "XMSSMT_SHA2_60/12_512", hashMap, b("SHA-512", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 60, 12));
        i0.d.a.a.a.u1(17, "XMSSMT_SHAKE_20/2_256", hashMap, b("SHAKE128", 32, 16, 67, 20, 2));
        i0.d.a.a.a.u1(18, "XMSSMT_SHAKE_20/4_256", hashMap, b("SHAKE128", 32, 16, 67, 20, 4));
        i0.d.a.a.a.u1(19, "XMSSMT_SHAKE_40/2_256", hashMap, b("SHAKE128", 32, 16, 67, 40, 2));
        i0.d.a.a.a.u1(20, "XMSSMT_SHAKE_40/4_256", hashMap, b("SHAKE128", 32, 16, 67, 40, 4));
        i0.d.a.a.a.u1(21, "XMSSMT_SHAKE_40/8_256", hashMap, b("SHAKE128", 32, 16, 67, 40, 8));
        i0.d.a.a.a.u1(22, "XMSSMT_SHAKE_60/3_256", hashMap, b("SHAKE128", 32, 16, 67, 60, 3));
        i0.d.a.a.a.u1(23, "XMSSMT_SHAKE_60/6_256", hashMap, b("SHAKE128", 32, 16, 67, 60, 6));
        i0.d.a.a.a.u1(24, "XMSSMT_SHAKE_60/12_256", hashMap, b("SHAKE128", 32, 16, 67, 60, 12));
        i0.d.a.a.a.u1(25, "XMSSMT_SHAKE_20/2_512", hashMap, b("SHAKE256", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 20, 2));
        i0.d.a.a.a.u1(26, "XMSSMT_SHAKE_20/4_512", hashMap, b("SHAKE256", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 20, 4));
        i0.d.a.a.a.u1(27, "XMSSMT_SHAKE_40/2_512", hashMap, b("SHAKE256", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 40, 2));
        i0.d.a.a.a.u1(28, "XMSSMT_SHAKE_40/4_512", hashMap, b("SHAKE256", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 40, 4));
        i0.d.a.a.a.u1(29, "XMSSMT_SHAKE_40/8_512", hashMap, b("SHAKE256", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 40, 8));
        i0.d.a.a.a.u1(30, "XMSSMT_SHAKE_60/3_512", hashMap, b("SHAKE256", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 60, 3));
        i0.d.a.a.a.u1(31, "XMSSMT_SHAKE_60/6_512", hashMap, b("SHAKE256", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 60, 6));
        hashMap.put(b("SHAKE256", 64, 16, PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS, 60, 12), new a(32, "XMSSMT_SHAKE_60/12_512"));
        a = Collections.unmodifiableMap(hashMap);
    }

    public a(int i, String str) {
        this.b = i;
        this.c = str;
    }

    public static String b(String str, int i, int i2, int i3, int i4, int i5) {
        return str + "-" + i + "-" + i2 + "-" + i3 + "-" + i4 + "-" + i5;
    }

    public int a() {
        return this.b;
    }

    public String toString() {
        return this.c;
    }
}
