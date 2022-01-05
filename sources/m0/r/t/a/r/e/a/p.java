package m0.r.t.a.r.e.a;

import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.b;

/* compiled from: JvmAbi.kt */
public final class p {
    public static final p a = null;
    public static final b b = new b("kotlin.jvm.JvmField");

    static {
        i.d(a.l(new b("kotlin.reflect.jvm.internal.ReflectionFactoryImpl")), "topLevel(FqName(\"kotlin.reflect.jvm.internal.ReflectionFactoryImpl\"))");
    }

    public static final String a(String str) {
        i.e(str, "propertyName");
        return c(str) ? str : i.k("get", m0.r.t.a.r.m.a1.a.t0(str));
    }

    public static final String b(String str) {
        String str2;
        i.e(str, "propertyName");
        if (c(str)) {
            str2 = str.substring(2);
            i.d(str2, "(this as java.lang.String).substring(startIndex)");
        } else {
            str2 = m0.r.t.a.r.m.a1.a.t0(str);
        }
        return i.k("set", str2);
    }

    public static final boolean c(String str) {
        i.e(str, "name");
        if (!StringsKt__IndentKt.J(str, "is", false, 2) || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if (i.g(97, charAt) > 0 || i.g(charAt, 122) > 0) {
            return true;
        }
        return false;
    }
}
