package i0.i;

import android.content.Context;
import android.util.SparseArray;
import com.hbb20.CountryCodePicker;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CCPCountryGroup */
public class b {
    public static SparseArray<b> a;
    public String b;
    public int c;
    public HashMap<String, String> d;

    public b(String str, int i, HashMap<String, String> hashMap) {
        this.b = str;
        this.c = i;
        this.d = hashMap;
    }

    public static b b(int i) {
        if (a == null) {
            a = new SparseArray<>();
            HashMap hashMap = new HashMap();
            hashMap.put("ag", "268");
            hashMap.put("ai", "264");
            hashMap.put("as", "684");
            hashMap.put("bb", "246");
            hashMap.put("bm", "441");
            hashMap.put("bs", "242");
            hashMap.put("ca", "204/226/236/249/250/289/306/343/365/403/416/418/431/437/438/450/506/514/519/579/581/587/600/601/604/613/639/647/705/709/769/778/780/782/807/819/825/867/873/902/905/");
            hashMap.put("dm", "767");
            hashMap.put("do", "809/829/849");
            hashMap.put("gd", "473");
            hashMap.put("gu", "671");
            hashMap.put("jm", "876");
            hashMap.put("kn", "869");
            hashMap.put("ky", "345");
            hashMap.put("lc", "758");
            hashMap.put("mp", "670");
            hashMap.put("ms", "664");
            hashMap.put("pr", "787");
            hashMap.put("sx", "721");
            hashMap.put("tc", "649");
            hashMap.put("tt", "868");
            hashMap.put("vc", "784");
            hashMap.put("vg", "284");
            hashMap.put("vi", "340");
            a.put(1, new b("us", 3, hashMap));
            HashMap hashMap2 = new HashMap();
            hashMap2.put("gg", "1481");
            hashMap2.put("im", "1624");
            hashMap2.put("je", "1534");
            a.put(44, new b("gb", 4, hashMap2));
            HashMap hashMap3 = new HashMap();
            hashMap3.put("ax", "18");
            a.put(358, new b("fi", 2, hashMap3));
        }
        return a.get(i);
    }

    public a a(Context context, CountryCodePicker.Language language, String str) {
        String str2 = this.b;
        for (Map.Entry next : this.d.entrySet()) {
            if (((String) next.getValue()).contains(str)) {
                str2 = (String) next.getKey();
            }
        }
        return a.i(context, language, str2);
    }
}
