package m0.r.t.a.r.e.b;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import m0.r.t.a.r.e.b.f;
import m0.r.t.a.r.j.s.b;
import m0.r.t.a.r.m.a1.a;

/* compiled from: methodSignatureMapping.kt */
public final class h implements g<f> {
    public static final h a = new h();

    public Object d(Object obj) {
        JvmPrimitiveType jvmPrimitiveType;
        f fVar = (f) obj;
        i.e(fVar, "possiblyPrimitiveType");
        if (!(fVar instanceof f.c) || (jvmPrimitiveType = ((f.c) fVar).j) == null) {
            return fVar;
        }
        String e = b.c(jvmPrimitiveType.getWrapperFqName()).e();
        i.d(e, "byFqNameWithoutInnerClasses(possiblyPrimitiveType.jvmPrimitiveType.wrapperFqName).internalName");
        return c(e);
    }

    public Object e() {
        return c("java/lang/Class");
    }

    public Object f(PrimitiveType primitiveType) {
        i.e(primitiveType, "primitiveType");
        switch (primitiveType.ordinal()) {
            case 0:
                f fVar = f.a;
                return f.b;
            case 1:
                f fVar2 = f.a;
                return f.c;
            case 2:
                f fVar3 = f.a;
                return f.d;
            case 3:
                f fVar4 = f.a;
                return f.e;
            case 4:
                f fVar5 = f.a;
                return f.f;
            case 5:
                f fVar6 = f.a;
                return f.g;
            case 6:
                f fVar7 = f.a;
                return f.h;
            case 7:
                f fVar8 = f.a;
                return f.i;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: g */
    public f b(String str) {
        JvmPrimitiveType jvmPrimitiveType;
        f bVar;
        i.e(str, "representation");
        str.length();
        char charAt = str.charAt(0);
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int i = 0;
        while (true) {
            if (i >= 8) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = values[i];
            if (jvmPrimitiveType.getDesc().charAt(0) == charAt) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new f.c(jvmPrimitiveType);
        }
        if (charAt == 'V') {
            return new f.c((JvmPrimitiveType) null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            i.d(substring, "(this as java.lang.String).substring(startIndex)");
            bVar = new f.a(b(substring));
        } else {
            if (charAt == 'L') {
                i.e(str, "$this$endsWith");
                if (str.length() > 0) {
                    boolean o1 = a.o1(str.charAt(StringsKt__IndentKt.h(str)), ';', false);
                }
            }
            String substring2 = str.substring(1, str.length() - 1);
            i.d(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            bVar = new f.b(substring2);
        }
        return bVar;
    }

    /* renamed from: h */
    public f.b c(String str) {
        i.e(str, "internalName");
        return new f.b(str);
    }

    /* renamed from: i */
    public String a(f fVar) {
        String desc;
        i.e(fVar, "type");
        if (fVar instanceof f.a) {
            return i.k("[", a(((f.a) fVar).j));
        }
        if (fVar instanceof f.c) {
            JvmPrimitiveType jvmPrimitiveType = ((f.c) fVar).j;
            if (jvmPrimitiveType == null || (desc = jvmPrimitiveType.getDesc()) == null) {
                return "V";
            }
            return desc;
        } else if (fVar instanceof f.b) {
            return i0.d.a.a.a.x0(i0.d.a.a.a.N0('L'), ((f.b) fVar).j, ';');
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
