package h0.t;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: NavDeepLink */
public final class h {
    public static final Pattern a = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public final ArrayList<String> b = new ArrayList<>();
    public final Map<String, b> c = new HashMap();
    public Pattern d = null;
    public boolean e;
    public boolean f;
    public final String g;
    public Pattern h;
    public final String i;

    /* compiled from: NavDeepLink */
    public static class a implements Comparable<a> {
        public String c;
        public String d;

        public a(String str) {
            String[] split = str.split("/", -1);
            this.c = split[0];
            this.d = split[1];
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            int i = this.c.equals(aVar.c) ? 2 : 0;
            return this.d.equals(aVar.d) ? i + 1 : i;
        }
    }

    /* compiled from: NavDeepLink */
    public static class b {
        public String a;
        public ArrayList<String> b = new ArrayList<>();
    }

    public h(String str, String str2, String str3) {
        int i2 = 0;
        this.e = false;
        this.f = false;
        this.h = null;
        this.g = str2;
        this.i = str3;
        if (str != null) {
            Uri parse = Uri.parse(str);
            int i3 = 1;
            this.f = parse.getQuery() != null;
            StringBuilder sb = new StringBuilder("^");
            if (!a.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Pattern compile = Pattern.compile("\\{(.+?)\\}");
            if (this.f) {
                Matcher matcher = Pattern.compile("(\\?)").matcher(str);
                if (matcher.find()) {
                    a(str.substring(0, matcher.start()), sb, compile);
                }
                this.e = false;
                for (String next : parse.getQueryParameterNames()) {
                    StringBuilder sb2 = new StringBuilder();
                    String queryParameter = parse.getQueryParameter(next);
                    Matcher matcher2 = compile.matcher(queryParameter);
                    b bVar = new b();
                    while (matcher2.find()) {
                        bVar.b.add(matcher2.group(i3));
                        sb2.append(Pattern.quote(queryParameter.substring(i2, matcher2.start())));
                        sb2.append("(.+?)?");
                        i2 = matcher2.end();
                        i3 = 1;
                    }
                    if (i2 < queryParameter.length()) {
                        sb2.append(Pattern.quote(queryParameter.substring(i2)));
                    }
                    bVar.a = sb2.toString().replace(".*", "\\E.*\\Q");
                    this.c.put(next, bVar);
                    i2 = 0;
                    i3 = 1;
                }
            } else {
                this.e = a(str, sb, compile);
            }
            this.d = Pattern.compile(sb.toString().replace(".*", "\\E.*\\Q"));
        }
        if (str3 == null) {
            return;
        }
        if (Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            a aVar = new a(str3);
            StringBuilder P0 = i0.d.a.a.a.P0("^(");
            P0.append(aVar.c);
            P0.append("|[*]+)/(");
            P0.append(aVar.d);
            P0.append("|[*]+)$");
            this.h = Pattern.compile(P0.toString().replace("*|[*]", "[\\s\\S]"));
            return;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.o0("The given mimeType ", str3, " does not match to required \"type/subtype\" format"));
    }

    public final boolean a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int i2 = 0;
        while (matcher.find()) {
            this.b.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(i2, matcher.start())));
            sb.append("(.+?)");
            i2 = matcher.end();
            z = false;
        }
        if (i2 < str.length()) {
            sb.append(Pattern.quote(str.substring(i2)));
        }
        sb.append("($|(\\?(.)*))");
        return z;
    }

    public final boolean b(Bundle bundle, String str, String str2, e eVar) {
        if (eVar != null) {
            r rVar = eVar.a;
            try {
                rVar.d(bundle, str, rVar.c(str2));
                return false;
            } catch (IllegalArgumentException unused) {
                return true;
            }
        } else {
            bundle.putString(str, str2);
            return false;
        }
    }
}
