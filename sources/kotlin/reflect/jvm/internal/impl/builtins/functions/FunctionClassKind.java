package kotlin.reflect.jvm.internal.impl.builtins.functions;

import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.d;

/* compiled from: FunctionClassKind.kt */
public enum FunctionClassKind {
    Function(g.l, "Function"),
    SuspendFunction(g.d, "SuspendFunction"),
    KFunction(r4, "KFunction"),
    KSuspendFunction(r4, "KSuspendFunction");
    
    public static final a Companion = null;
    private final String classNamePrefix;
    private final b packageFqName;

    /* compiled from: FunctionClassKind.kt */
    public static final class a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind$a$a  reason: collision with other inner class name */
        /* compiled from: FunctionClassKind.kt */
        public static final class C0236a {
            public final FunctionClassKind a;
            public final int b;

            public C0236a(FunctionClassKind functionClassKind, int i) {
                i.e(functionClassKind, "kind");
                this.a = functionClassKind;
                this.b = i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0236a)) {
                    return false;
                }
                C0236a aVar = (C0236a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public int hashCode() {
                return (this.a.hashCode() * 31) + this.b;
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("KindWithArity(kind=");
                P0.append(this.a);
                P0.append(", arity=");
                return i0.d.a.a.a.s0(P0, this.b, ')');
            }
        }

        public a(f fVar) {
        }

        public final C0236a a(String str, b bVar) {
            FunctionClassKind functionClassKind;
            Integer num;
            i.e(str, "className");
            i.e(bVar, "packageFqName");
            i.e(bVar, "packageFqName");
            i.e(str, "className");
            FunctionClassKind[] values = FunctionClassKind.values();
            int i = 0;
            while (true) {
                if (i >= 4) {
                    functionClassKind = null;
                    break;
                }
                functionClassKind = values[i];
                if (i.a(functionClassKind.getPackageFqName(), bVar) && StringsKt__IndentKt.J(str, functionClassKind.getClassNamePrefix(), false, 2)) {
                    break;
                }
                i++;
            }
            if (functionClassKind == null) {
                return null;
            }
            String substring = str.substring(functionClassKind.getClassNamePrefix().length());
            i.d(substring, "(this as java.lang.String).substring(startIndex)");
            if (!(substring.length() == 0)) {
                int length = substring.length();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= length) {
                        num = Integer.valueOf(i3);
                        break;
                    }
                    char charAt = substring.charAt(i2);
                    i2++;
                    int i4 = charAt - '0';
                    if (!(i4 >= 0 && i4 <= 9)) {
                        break;
                    }
                    i3 = (i3 * 10) + i4;
                }
            }
            num = null;
            if (num == null) {
                return null;
            }
            return new C0236a(functionClassKind, num.intValue());
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a((f) null);
    }

    private FunctionClassKind(b bVar, String str) {
        this.packageFqName = bVar;
        this.classNamePrefix = str;
    }

    public final String getClassNamePrefix() {
        return this.classNamePrefix;
    }

    public final b getPackageFqName() {
        return this.packageFqName;
    }

    public final d numberedClassName(int i) {
        d g = d.g(i.k(this.classNamePrefix, Integer.valueOf(i)));
        i.d(g, "identifier(\"$classNamePrefix$arity\")");
        return g;
    }
}
