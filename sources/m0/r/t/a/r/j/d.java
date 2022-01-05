package m0.r.t.a.r.j;

import com.google.android.gms.recaptcha.RecaptchaActionType;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.e0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.i0;
import m0.r.t.a.r.c.l;
import m0.r.t.a.r.c.m;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.y;
import m0.r.t.a.r.g.b;
import m0.r.t.a.r.g.c;
import m0.r.t.a.r.g.f;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.v;

/* compiled from: DescriptorUtils */
public class d {
    public static final /* synthetic */ int a = 0;

    static {
        new b("kotlin.jvm.JvmName");
    }

    public static <D extends m> D A(D d) {
        if (d == null) {
            a(59);
            throw null;
        } else if (d instanceof CallableMemberDescriptor) {
            return z((CallableMemberDescriptor) d);
        } else {
            if (d != null) {
                return d;
            }
            a(60);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 21:
            case 22:
            case 32:
            case 33:
            case 34:
            case 55:
            case 56:
            case 57:
            case 59:
            case 77:
            case 90:
            case 92:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 14:
                objArr[0] = "first";
                break;
            case 15:
                objArr[0] = "second";
                break;
            case 16:
            case 17:
                objArr[0] = "aClass";
                break;
            case 18:
                objArr[0] = "kotlinType";
                break;
            case 23:
                objArr[0] = "declarationDescriptor";
                break;
            case 24:
            case 26:
                objArr[0] = "subClass";
                break;
            case 25:
            case 27:
            case 31:
                objArr[0] = "superClass";
                break;
            case 28:
            case 30:
            case 43:
            case 62:
                objArr[0] = "type";
                break;
            case 29:
                objArr[0] = RecaptchaActionType.OTHER;
                break;
            case 35:
                objArr[0] = "classKind";
                break;
            case 36:
            case 37:
            case 39:
            case 42:
            case 46:
            case 52:
            case 63:
            case 64:
            case 65:
            case 72:
            case 73:
                objArr[0] = "classDescriptor";
                break;
            case 44:
                objArr[0] = "typeConstructor";
                break;
            case 53:
                objArr[0] = "innerClassName";
                break;
            case 54:
                objArr[0] = "location";
                break;
            case 61:
                objArr[0] = "variable";
                break;
            case 66:
                objArr[0] = "f";
                break;
            case 68:
                objArr[0] = "current";
                break;
            case 69:
                objArr[0] = "result";
                break;
            case 70:
                objArr[0] = "memberDescriptor";
                break;
            case 74:
            case 75:
            case 76:
                objArr[0] = "annotated";
                break;
            case 80:
            case 82:
            case 85:
            case 87:
                objArr[0] = "scope";
                break;
            case 83:
            case 86:
            case 88:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 20:
                objArr[1] = "getContainingModule";
                break;
            case 38:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 40:
            case 41:
                objArr[1] = "getSuperClassType";
                break;
            case 45:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 58:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 67:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 78:
            case 79:
                objArr[1] = "getContainingSourceFile";
                break;
            case 81:
                objArr[1] = "getAllDescriptors";
                break;
            case 84:
                objArr[1] = "getFunctionByName";
                break;
            case 89:
                objArr[1] = "getPropertyByName";
                break;
            case 91:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "isExtension";
                break;
            case 12:
                objArr[2] = "isOverride";
                break;
            case 13:
                objArr[2] = "isStaticDeclaration";
                break;
            case 14:
            case 15:
                objArr[2] = "areInSameModule";
                break;
            case 16:
            case 17:
                objArr[2] = "getParentOfType";
                break;
            case 18:
            case 21:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 19:
                objArr[2] = "getContainingModule";
                break;
            case 22:
                objArr[2] = "getContainingClass";
                break;
            case 23:
                objArr[2] = "isAncestor";
                break;
            case 24:
            case 25:
                objArr[2] = "isDirectSubclass";
                break;
            case 26:
            case 27:
                objArr[2] = "isSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSameClass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 32:
                objArr[2] = "isAnonymousObject";
                break;
            case 33:
                objArr[2] = "isAnonymousFunction";
                break;
            case 34:
                objArr[2] = "isEnumEntry";
                break;
            case 35:
                objArr[2] = "isKindOf";
                break;
            case 36:
                objArr[2] = "hasAbstractMembers";
                break;
            case 37:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 39:
                objArr[2] = "getSuperClassType";
                break;
            case 42:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 43:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 44:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 46:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 52:
            case 53:
            case 54:
                objArr[2] = "getInnerClassByName";
                break;
            case 55:
                objArr[2] = "isStaticNestedClass";
                break;
            case 56:
                objArr[2] = "isTopLevelOrInnerClass";
                break;
            case 57:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 59:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 61:
            case 62:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 63:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 64:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 65:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 66:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 68:
            case 69:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 72:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 73:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 74:
                objArr[2] = "getJvmName";
                break;
            case 75:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 76:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 77:
                objArr[2] = "getContainingSourceFile";
                break;
            case 80:
                objArr[2] = "getAllDescriptors";
                break;
            case 82:
            case 83:
                objArr[2] = "getFunctionByName";
                break;
            case 85:
            case 86:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 87:
            case 88:
                objArr[2] = "getPropertyByName";
                break;
            case 90:
                objArr[2] = "getDirectMember";
                break;
            case 92:
                objArr[2] = "isMethodOfAny";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 20:
            case 38:
            case 40:
            case 41:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 58:
            case 60:
            case 67:
            case 71:
            case 78:
            case 79:
            case 81:
            case 84:
            case 89:
            case 91:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public static <D extends a> void b(D d, Set<D> set) {
        if (d == null) {
            a(68);
            throw null;
        } else if (!set.contains(d)) {
            for (a a2 : d.a().e()) {
                a a3 = a2.a();
                b(a3, set);
                set.add(a3);
            }
        }
    }

    public static m0.r.t.a.r.c.d c(v vVar) {
        if (vVar != null) {
            j0 I0 = vVar.I0();
            if (I0 != null) {
                m0.r.t.a.r.c.d dVar = (m0.r.t.a.r.c.d) I0.c();
                if (dVar != null) {
                    return dVar;
                }
                a(45);
                throw null;
            }
            a(44);
            throw null;
        }
        a(43);
        throw null;
    }

    public static u d(i iVar) {
        if (iVar != null) {
            u e = e(iVar);
            if (e != null) {
                return e;
            }
            a(20);
            throw null;
        }
        a(19);
        throw null;
    }

    public static u e(i iVar) {
        if (iVar != null) {
            while (iVar != null) {
                if (iVar instanceof u) {
                    return (u) iVar;
                }
                if (iVar instanceof y) {
                    return ((y) iVar).t0();
                }
                iVar = iVar.b();
            }
            return null;
        }
        a(21);
        throw null;
    }

    public static i0 f(i iVar) {
        if (iVar != null) {
            if (iVar instanceof e0) {
                iVar = ((e0) iVar).x0();
            }
            if (!(iVar instanceof l)) {
                return i0.a;
            }
            i0 a2 = ((l) iVar).r().a();
            if (a2 != null) {
                return a2;
            }
            a(78);
            throw null;
        }
        a(77);
        throw null;
    }

    public static c g(i iVar) {
        if (iVar != null) {
            b h = h(iVar);
            return h != null ? h.j() : i(iVar);
        }
        a(2);
        throw null;
    }

    public static b h(i iVar) {
        if (iVar == null) {
            a(5);
            throw null;
        } else if ((iVar instanceof u) || p.j(iVar)) {
            return b.a;
        } else {
            if (iVar instanceof y) {
                return ((y) iVar).d();
            }
            if (iVar instanceof m0.r.t.a.r.c.v) {
                return ((m0.r.t.a.r.c.v) iVar).d();
            }
            return null;
        }
    }

    public static c i(i iVar) {
        if (iVar != null) {
            return g(iVar.b()).c(iVar.getName());
        }
        a(6);
        throw null;
    }

    public static <D extends i> D j(i iVar, Class<D> cls) {
        return k(iVar, cls, true);
    }

    public static <D extends i> D k(D d, Class<D> cls, boolean z) {
        if (cls == null) {
            a(17);
            throw null;
        } else if (d == null) {
            return null;
        } else {
            if (z) {
                d = d.b();
            }
            while (d != null) {
                if (cls.isInstance(d)) {
                    return d;
                }
                d = d.b();
            }
            return null;
        }
    }

    public static m0.r.t.a.r.c.d l(m0.r.t.a.r.c.d dVar) {
        for (v c : dVar.i().b()) {
            m0.r.t.a.r.c.d c2 = c(c);
            if (c2.f() != ClassKind.INTERFACE) {
                return c2;
            }
        }
        return null;
    }

    public static boolean m(i iVar) {
        return s(iVar, ClassKind.ANNOTATION_CLASS);
    }

    public static boolean n(i iVar) {
        return s(iVar, ClassKind.CLASS) && iVar.getName().equals(f.a);
    }

    public static boolean o(i iVar) {
        return s(iVar, ClassKind.CLASS) || q(iVar);
    }

    public static boolean p(i iVar) {
        return s(iVar, ClassKind.OBJECT) && ((m0.r.t.a.r.c.d) iVar).w();
    }

    public static boolean q(i iVar) {
        return s(iVar, ClassKind.ENUM_CLASS);
    }

    public static boolean r(i iVar) {
        if (iVar != null) {
            return s(iVar, ClassKind.ENUM_ENTRY);
        }
        a(34);
        throw null;
    }

    public static boolean s(i iVar, ClassKind classKind) {
        if (classKind != null) {
            return (iVar instanceof m0.r.t.a.r.c.d) && ((m0.r.t.a.r.c.d) iVar).f() == classKind;
        }
        a(35);
        throw null;
    }

    public static boolean t(i iVar) {
        if (iVar != null) {
            while (true) {
                boolean z = false;
                if (iVar == null) {
                    return false;
                }
                if (n(iVar)) {
                    break;
                }
                if ((iVar instanceof m) && ((m) iVar).getVisibility() == o.f) {
                    z = true;
                }
                if (z) {
                    break;
                }
                iVar = iVar.b();
            }
            return true;
        }
        a(1);
        throw null;
    }

    public static boolean u(v vVar, i iVar) {
        if (vVar == null) {
            a(28);
            throw null;
        } else if (iVar != null) {
            m0.r.t.a.r.c.f c = vVar.I0().c();
            if (c == null) {
                return false;
            }
            i a2 = c.a();
            return (a2 instanceof m0.r.t.a.r.c.f) && (iVar instanceof m0.r.t.a.r.c.f) && ((m0.r.t.a.r.c.f) iVar).i().equals(((m0.r.t.a.r.c.f) a2).i());
        } else {
            a(29);
            throw null;
        }
    }

    public static boolean v(i iVar) {
        return (s(iVar, ClassKind.CLASS) || s(iVar, ClassKind.INTERFACE)) && ((m0.r.t.a.r.c.d) iVar).j() == Modality.SEALED;
    }

    public static boolean w(m0.r.t.a.r.c.d dVar, m0.r.t.a.r.c.d dVar2) {
        return x(dVar.q(), dVar2.a());
    }

    public static boolean x(v vVar, i iVar) {
        if (vVar == null) {
            a(30);
            throw null;
        } else if (iVar == null) {
            a(31);
            throw null;
        } else if (u(vVar, iVar)) {
            return true;
        } else {
            for (v x : vVar.I0().b()) {
                if (x(x, iVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean y(i iVar) {
        return iVar != null && (iVar.b() instanceof m0.r.t.a.r.c.v);
    }

    public static <D extends CallableMemberDescriptor> D z(D d) {
        if (d != null) {
            while (d.f() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                Collection e = d.e();
                if (!e.isEmpty()) {
                    d = (CallableMemberDescriptor) e.iterator().next();
                } else {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + d);
                }
            }
            return d;
        }
        a(57);
        throw null;
    }
}
