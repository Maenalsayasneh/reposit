package i0.h.a.a.h;

import com.pubnub.api.vendor.FileEncryptionUtil;
import h0.b0.v;
import i0.h.a.a.b;
import i0.h.a.a.i.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: CCTDestination */
public final class a implements d {
    public static final String a = v.Y0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    public static final String b;
    public static final String c;
    public static final Set<b> d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{new b("proto"), new b("json")})));
    public static final a e;
    public final String f;
    public final String g;

    static {
        String Y0 = v.Y0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        b = Y0;
        String Y02 = v.Y0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        c = Y02;
        e = new a(Y0, Y02);
    }

    public a(String str, String str2) {
        this.f = str;
        this.g = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(FileEncryptionUtil.ENCODING_UTF_8));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public byte[] b() {
        String str = this.g;
        if (str == null && this.f == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(FileEncryptionUtil.ENCODING_UTF_8));
    }

    public Set<b> c() {
        return d;
    }
}
