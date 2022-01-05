package m0.r.t.a.r.b;

import com.pubnub.api.builder.PubNubErrorBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import m0.r.t.a.r.b.g;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.d0;
import m0.r.t.a.r.c.e0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.s0.a;
import m0.r.t.a.r.c.s0.c;
import m0.r.t.a.r.c.t0.v;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.c.w;
import m0.r.t.a.r.c.y;
import m0.r.t.a.r.l.h;
import m0.r.t.a.r.l.l;
import m0.r.t.a.r.m.a0;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.o0;
import m0.r.t.a.r.m.s0;

/* compiled from: KotlinBuiltIns */
public abstract class f {
    public static final m0.r.t.a.r.g.d a = m0.r.t.a.r.g.d.j("<built-ins module>");
    public v b;
    public final h<d> c;
    public final m0.r.t.a.r.l.f<m0.r.t.a.r.g.d, m0.r.t.a.r.c.d> d;
    public final l e;

    /* compiled from: KotlinBuiltIns */
    public class a implements m0.n.a.a<Collection<y>> {
        public a() {
        }

        public Object invoke() {
            return Arrays.asList(new y[]{f.this.b.M(g.l), f.this.b.M(g.n), f.this.b.M(g.o), f.this.b.M(g.m)});
        }
    }

    /* compiled from: KotlinBuiltIns */
    public class b implements m0.n.a.a<d> {
        public b() {
        }

        public Object invoke() {
            EnumMap enumMap = new EnumMap(PrimitiveType.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            PrimitiveType[] values = PrimitiveType.values();
            for (int i = 0; i < 8; i++) {
                PrimitiveType primitiveType = values[i];
                a0 b = f.b(f.this, primitiveType.getTypeName().b());
                a0 b2 = f.b(f.this, primitiveType.getArrayTypeName().b());
                enumMap.put(primitiveType, b2);
                hashMap.put(b, b2);
                hashMap2.put(b2, b);
            }
            return new d(enumMap, hashMap, hashMap2, (a) null);
        }
    }

    /* compiled from: KotlinBuiltIns */
    public class c implements m0.n.a.l<m0.r.t.a.r.g.d, m0.r.t.a.r.c.d> {
        public c() {
        }

        public Object invoke(Object obj) {
            m0.r.t.a.r.g.d dVar = (m0.r.t.a.r.g.d) obj;
            v vVar = f.this.b;
            m0.r.t.a.r.g.b bVar = g.l;
            MemberScope o = vVar.M(bVar).o();
            if (o != null) {
                m0.r.t.a.r.c.f f = o.f(dVar, NoLookupLocation.FROM_BUILTINS);
                if (f == null) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Built-in class ");
                    P0.append(bVar.c(dVar));
                    P0.append(" is not found");
                    throw new AssertionError(P0.toString());
                } else if (f instanceof m0.r.t.a.r.c.d) {
                    return (m0.r.t.a.r.c.d) f;
                } else {
                    throw new AssertionError("Must be a class descriptor " + dVar + ", but was " + f);
                }
            } else {
                f.a(10);
                throw null;
            }
        }
    }

    /* compiled from: KotlinBuiltIns */
    public static class d {
        public final Map<PrimitiveType, a0> a;
        public final Map<m0.r.t.a.r.m.v, a0> b;
        public final Map<a0, a0> c;

        public d(Map map, Map map2, Map map3, a aVar) {
            this.a = map;
            this.b = map2;
            this.c = map3;
        }
    }

    public f(l lVar) {
        this.e = lVar;
        lVar.d(new a());
        this.c = lVar.d(new b());
        this.d = lVar.g(new c());
    }

    public static boolean A(i iVar) {
        if (iVar != null) {
            return m0.r.t.a.r.j.d.k(iVar, a.class, false) != null;
        }
        a(8);
        throw null;
    }

    public static boolean B(m0.r.t.a.r.m.v vVar, m0.r.t.a.r.g.c cVar) {
        if (vVar == null) {
            a(96);
            throw null;
        } else if (cVar != null) {
            return L(vVar.I0(), cVar);
        } else {
            a(97);
            throw null;
        }
    }

    public static boolean C(m0.r.t.a.r.m.v vVar, m0.r.t.a.r.g.c cVar) {
        if (vVar == null) {
            a(PubNubErrorBuilder.PNERR_CONNECTION_NOT_SET);
            throw null;
        } else if (cVar != null) {
            return B(vVar, cVar) && !vVar.J0();
        } else {
            a(134);
            throw null;
        }
    }

    public static boolean D(i iVar) {
        if (iVar.a().getAnnotations().n(g.a.u)) {
            return true;
        }
        if (!(iVar instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) iVar;
        boolean i02 = c0Var.i0();
        d0 getter = c0Var.getGetter();
        e0 setter = c0Var.getSetter();
        if (getter != null && D(getter)) {
            if (!i02) {
                return true;
            }
            if (setter != null && D(setter)) {
                return true;
            }
        }
        return false;
    }

    public static boolean E(m0.r.t.a.r.m.v vVar, m0.r.t.a.r.g.c cVar) {
        if (vVar == null) {
            a(104);
            throw null;
        } else if (cVar != null) {
            return !vVar.J0() && B(vVar, cVar);
        } else {
            a(105);
            throw null;
        }
    }

    public static boolean F(m0.r.t.a.r.m.v vVar) {
        if (vVar == null) {
            a(PubNubErrorBuilder.PNERR_CRYPTO_ERROR);
            throw null;
        } else if (vVar != null) {
            return B(vVar, g.a.c) && !s0.g(vVar);
        } else {
            a(PubNubErrorBuilder.PNERR_AUTH_KEYS_MISSING);
            throw null;
        }
    }

    public static boolean G(m0.r.t.a.r.m.v vVar) {
        if (vVar != null) {
            return y(vVar) && vVar.J0();
        }
        a(PubNubErrorBuilder.PNERR_PUBLISH_KEY_MISSING);
        throw null;
    }

    public static boolean H(m0.r.t.a.r.c.d dVar) {
        if (dVar != null) {
            return u(dVar) != null;
        }
        a(95);
        throw null;
    }

    public static boolean I(m0.r.t.a.r.m.v vVar) {
        if (!vVar.J0()) {
            m0.r.t.a.r.c.f c2 = vVar.I0().c();
            if ((c2 instanceof m0.r.t.a.r.c.d) && H((m0.r.t.a.r.c.d) c2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean J(m0.r.t.a.r.c.d dVar) {
        if (dVar != null) {
            return c(dVar, g.a.b) || c(dVar, g.a.c);
        }
        a(106);
        throw null;
    }

    public static boolean K(m0.r.t.a.r.m.v vVar) {
        return E(vVar, g.a.g);
    }

    public static boolean L(j0 j0Var, m0.r.t.a.r.g.c cVar) {
        if (j0Var == null) {
            a(100);
            throw null;
        } else if (cVar != null) {
            m0.r.t.a.r.c.f c2 = j0Var.c();
            return (c2 instanceof m0.r.t.a.r.c.d) && c(c2, cVar);
        } else {
            a(101);
            throw null;
        }
    }

    public static boolean M(i iVar) {
        while (iVar != null) {
            if (iVar instanceof m0.r.t.a.r.c.v) {
                return ((m0.r.t.a.r.c.v) iVar).d().i(g.k);
            }
            iVar = iVar.b();
        }
        return false;
    }

    public static boolean N(m0.r.t.a.r.m.v vVar) {
        return E(vVar, g.a.e);
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 71:
                objArr[0] = "module";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 8:
            case 9:
            case 75:
            case 76:
            case 88:
            case 95:
            case 102:
            case 106:
            case 107:
            case PubNubErrorBuilder.PNERR_DEVICE_ID_MISSING:
            case PubNubErrorBuilder.PNERR_TIMETOKEN_MISSING:
            case PubNubErrorBuilder.PNERR_UUID_MISSING:
            case 155:
            case 156:
            case 157:
                objArr[0] = "descriptor";
                break;
            case 11:
            case 97:
            case 99:
            case 101:
            case 103:
            case 105:
            case 134:
                objArr[0] = "fqName";
                break;
            case 13:
                objArr[0] = "simpleName";
                break;
            case 15:
            case 16:
            case 52:
            case 87:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 96:
            case 98:
            case 104:
            case 108:
            case 109:
            case 110:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS:
            case PubNubErrorBuilder.PNERR_CHANNEL_MISSING:
            case PubNubErrorBuilder.PNERR_CONNECTION_NOT_SET:
            case PubNubErrorBuilder.PNERR_CRYPTO_ERROR:
            case PubNubErrorBuilder.PNERR_GROUP_MISSING:
            case PubNubErrorBuilder.PNERR_AUTH_KEYS_MISSING:
            case PubNubErrorBuilder.PNERR_SUBSCRIBE_KEY_MISSING:
            case PubNubErrorBuilder.PNERR_PUBLISH_KEY_MISSING:
            case PubNubErrorBuilder.PNERR_STATE_MISSING:
            case PubNubErrorBuilder.PNERR_CHANNEL_AND_GROUP_MISSING:
            case PubNubErrorBuilder.PNERR_MESSAGE_MISSING:
            case PubNubErrorBuilder.PNERR_PUSH_TYPE_MISSING:
            case PubNubErrorBuilder.PNERR_CHANNELS_TIMETOKEN_MISMATCH:
            case PubNubErrorBuilder.PNERR_USER_ID_MISSING:
            case PubNubErrorBuilder.PNERR_USER_NAME_MISSING:
            case PubNubErrorBuilder.PNERR_SPACE_MISSING:
            case 151:
            case 152:
            case 153:
            case 154:
            case PubNubErrorBuilder.PNERR_MESSAGE_ACTION_TYPE_MISSING:
                objArr[0] = "type";
                break;
            case 45:
                objArr[0] = "classSimpleName";
                break;
            case 66:
                objArr[0] = "arrayType";
                break;
            case 70:
                objArr[0] = "notNullArrayType";
                break;
            case 72:
                objArr[0] = "primitiveType";
                break;
            case 74:
                objArr[0] = "kotlinType";
                break;
            case 77:
            case 81:
                objArr[0] = "projectionType";
                break;
            case 78:
            case 82:
            case 84:
                objArr[0] = "argument";
                break;
            case 79:
                objArr[0] = "annotations";
                break;
            case 100:
                objArr[0] = "typeConstructor";
                break;
            case 111:
                objArr[0] = "classDescriptor";
                break;
            case PubNubErrorBuilder.PNERR_MESSAGE_ACTION_MISSING:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 2:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 3:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 4:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 5:
                objArr[1] = "getStorageManager";
                break;
            case 6:
                objArr[1] = "getBuiltInsModule";
                break;
            case 7:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 10:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 12:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 17:
                objArr[1] = "getSuspendFunction";
                break;
            case 18:
                objArr[1] = "getKFunction";
                break;
            case 19:
                objArr[1] = "getKSuspendFunction";
                break;
            case 20:
                objArr[1] = "getKClass";
                break;
            case 21:
                objArr[1] = "getKCallable";
                break;
            case 22:
                objArr[1] = "getKProperty";
                break;
            case 23:
                objArr[1] = "getKProperty0";
                break;
            case 24:
                objArr[1] = "getKProperty1";
                break;
            case 25:
                objArr[1] = "getKProperty2";
                break;
            case 26:
                objArr[1] = "getKMutableProperty0";
                break;
            case 27:
                objArr[1] = "getKMutableProperty1";
                break;
            case 28:
                objArr[1] = "getKMutableProperty2";
                break;
            case 29:
                objArr[1] = "getIterator";
                break;
            case 30:
                objArr[1] = "getIterable";
                break;
            case 31:
                objArr[1] = "getMutableIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterator";
                break;
            case 33:
                objArr[1] = "getCollection";
                break;
            case 34:
                objArr[1] = "getMutableCollection";
                break;
            case 35:
                objArr[1] = "getList";
                break;
            case 36:
                objArr[1] = "getMutableList";
                break;
            case 37:
                objArr[1] = "getSet";
                break;
            case 38:
                objArr[1] = "getMutableSet";
                break;
            case 39:
                objArr[1] = "getMap";
                break;
            case 40:
                objArr[1] = "getMutableMap";
                break;
            case 41:
                objArr[1] = "getMapEntry";
                break;
            case 42:
                objArr[1] = "getMutableMapEntry";
                break;
            case 43:
                objArr[1] = "getListIterator";
                break;
            case 44:
                objArr[1] = "getMutableListIterator";
                break;
            case 46:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 47:
                objArr[1] = "getNothingType";
                break;
            case 48:
                objArr[1] = "getNullableNothingType";
                break;
            case 49:
                objArr[1] = "getAnyType";
                break;
            case 50:
                objArr[1] = "getNullableAnyType";
                break;
            case 51:
                objArr[1] = "getDefaultBound";
                break;
            case 53:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 54:
                objArr[1] = "getNumberType";
                break;
            case 55:
                objArr[1] = "getByteType";
                break;
            case 56:
                objArr[1] = "getShortType";
                break;
            case 57:
                objArr[1] = "getIntType";
                break;
            case 58:
                objArr[1] = "getLongType";
                break;
            case 59:
                objArr[1] = "getFloatType";
                break;
            case 60:
                objArr[1] = "getDoubleType";
                break;
            case 61:
                objArr[1] = "getCharType";
                break;
            case 62:
                objArr[1] = "getBooleanType";
                break;
            case 63:
                objArr[1] = "getUnitType";
                break;
            case 64:
                objArr[1] = "getStringType";
                break;
            case 65:
                objArr[1] = "getIterableType";
                break;
            case 67:
            case 68:
            case 69:
                objArr[1] = "getArrayElementType";
                break;
            case 73:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 80:
            case 83:
                objArr[1] = "getArrayType";
                break;
            case 85:
                objArr[1] = "getEnumType";
                break;
            case 86:
                objArr[1] = "getAnnotationType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86:
                break;
            case 8:
                objArr[2] = "isBuiltIn";
                break;
            case 9:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 11:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 13:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 15:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 16:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 45:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 52:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 66:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
            case 71:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 72:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 74:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 75:
            case 92:
                objArr[2] = "getPrimitiveType";
                break;
            case 76:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 77:
            case 78:
            case 79:
            case 81:
            case 82:
                objArr[2] = "getArrayType";
                break;
            case 84:
                objArr[2] = "getEnumType";
                break;
            case 87:
                objArr[2] = "isArray";
                break;
            case 88:
            case 89:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 90:
                objArr[2] = "isPrimitiveArray";
                break;
            case 91:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 93:
                objArr[2] = "isPrimitiveType";
                break;
            case 94:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveClass";
                break;
            case 96:
            case 97:
            case 98:
            case 99:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 100:
            case 101:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 102:
            case 103:
                objArr[2] = "classFqNameEquals";
                break;
            case 104:
            case 105:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 106:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 107:
            case 108:
                objArr[2] = "isAny";
                break;
            case 109:
            case 111:
                objArr[2] = "isBoolean";
                break;
            case 110:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 112:
                objArr[2] = "isNumber";
                break;
            case 113:
                objArr[2] = "isChar";
                break;
            case 114:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 115:
                objArr[2] = "isInt";
                break;
            case 116:
                objArr[2] = "isByte";
                break;
            case 117:
                objArr[2] = "isLong";
                break;
            case 118:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 119:
                objArr[2] = "isShort";
                break;
            case 120:
                objArr[2] = "isFloat";
                break;
            case 121:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 122:
                objArr[2] = "isDouble";
                break;
            case 123:
                objArr[2] = "isUByte";
                break;
            case 124:
                objArr[2] = "isUShort";
                break;
            case 125:
                objArr[2] = "isUInt";
                break;
            case 126:
                objArr[2] = "isULong";
                break;
            case 127:
                objArr[2] = "isUByteArray";
                break;
            case 128:
                objArr[2] = "isUShortArray";
                break;
            case 129:
                objArr[2] = "isUIntArray";
                break;
            case 130:
                objArr[2] = "isULongArray";
                break;
            case PubNubErrorBuilder.PNERR_INVALID_ARGUMENTS:
                objArr[2] = "isUnsignedArrayType";
                break;
            case PubNubErrorBuilder.PNERR_CHANNEL_MISSING:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case PubNubErrorBuilder.PNERR_CONNECTION_NOT_SET:
            case 134:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case PubNubErrorBuilder.PNERR_CRYPTO_ERROR:
                objArr[2] = "isNothing";
                break;
            case PubNubErrorBuilder.PNERR_GROUP_MISSING:
                objArr[2] = "isNullableNothing";
                break;
            case PubNubErrorBuilder.PNERR_AUTH_KEYS_MISSING:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case PubNubErrorBuilder.PNERR_SUBSCRIBE_KEY_MISSING:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case PubNubErrorBuilder.PNERR_PUBLISH_KEY_MISSING:
                objArr[2] = "isNullableAny";
                break;
            case PubNubErrorBuilder.PNERR_STATE_MISSING:
                objArr[2] = "isDefaultBound";
                break;
            case PubNubErrorBuilder.PNERR_CHANNEL_AND_GROUP_MISSING:
                objArr[2] = "isUnit";
                break;
            case PubNubErrorBuilder.PNERR_MESSAGE_MISSING:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case PubNubErrorBuilder.PNERR_PUSH_TYPE_MISSING:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case PubNubErrorBuilder.PNERR_DEVICE_ID_MISSING:
                objArr[2] = "isMemberOfAny";
                break;
            case PubNubErrorBuilder.PNERR_TIMETOKEN_MISSING:
            case PubNubErrorBuilder.PNERR_CHANNELS_TIMETOKEN_MISMATCH:
                objArr[2] = "isEnum";
                break;
            case PubNubErrorBuilder.PNERR_UUID_MISSING:
            case PubNubErrorBuilder.PNERR_USER_ID_MISSING:
                objArr[2] = "isComparable";
                break;
            case PubNubErrorBuilder.PNERR_USER_NAME_MISSING:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case PubNubErrorBuilder.PNERR_SPACE_MISSING:
                objArr[2] = "isListOrNullableList";
                break;
            case 151:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 152:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 153:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 154:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 155:
                objArr[2] = "isKClass";
                break;
            case 156:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 157:
                objArr[2] = "isCloneable";
                break;
            case PubNubErrorBuilder.PNERR_MESSAGE_ACTION_MISSING:
                objArr[2] = "isDeprecated";
                break;
            case PubNubErrorBuilder.PNERR_MESSAGE_ACTION_TYPE_MISSING:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 12:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 73:
            case 80:
            case 83:
            case 85:
            case 86:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public static a0 b(f fVar, String str) {
        Objects.requireNonNull(fVar);
        if (str != null) {
            a0 q = fVar.k(str).q();
            if (q != null) {
                return q;
            }
            a(46);
            throw null;
        }
        a(45);
        throw null;
    }

    public static boolean c(m0.r.t.a.r.c.f fVar, m0.r.t.a.r.g.c cVar) {
        if (fVar == null) {
            a(102);
            throw null;
        } else if (cVar != null) {
            return fVar.getName().equals(cVar.h()) && cVar.equals(m0.r.t.a.r.j.d.g(fVar));
        } else {
            a(103);
            throw null;
        }
    }

    public static PrimitiveType s(i iVar) {
        if (g.a.f49n0.contains(iVar.getName())) {
            return g.a.f51p0.get(m0.r.t.a.r.j.d.g(iVar));
        }
        return null;
    }

    public static PrimitiveType u(i iVar) {
        if (iVar == null) {
            a(75);
            throw null;
        } else if (g.a.f48m0.contains(iVar.getName())) {
            return g.a.f50o0.get(m0.r.t.a.r.j.d.g(iVar));
        } else {
            return null;
        }
    }

    public static boolean y(m0.r.t.a.r.m.v vVar) {
        if (vVar != null) {
            return B(vVar, g.a.b);
        }
        a(PubNubErrorBuilder.PNERR_SUBSCRIBE_KEY_MISSING);
        throw null;
    }

    public static boolean z(m0.r.t.a.r.m.v vVar) {
        if (vVar != null) {
            return B(vVar, g.a.h);
        }
        a(87);
        throw null;
    }

    public void d(boolean z) {
        m0.r.t.a.r.g.d dVar = a;
        l lVar = this.e;
        m0.n.b.i.e(dVar, "moduleName");
        m0.n.b.i.e(lVar, "storageManager");
        m0.n.b.i.e(this, "builtIns");
        v vVar = new v(dVar, lVar, this, (Map) null, (m0.r.t.a.r.g.d) null, 48);
        this.b = vVar;
        Objects.requireNonNull(BuiltInsLoader.a);
        w a2 = BuiltInsLoader.Companion.b.getValue().a(this.e, this.b, l(), q(), e(), z);
        m0.n.b.i.e(a2, "providerForModuleContent");
        vVar.Z1 = a2;
        v vVar2 = this.b;
        vVar2.H0(vVar2);
    }

    public m0.r.t.a.r.c.s0.a e() {
        return a.C0252a.a;
    }

    public a0 f() {
        a0 q = k("Any").q();
        if (q != null) {
            return q;
        }
        a(49);
        throw null;
    }

    public m0.r.t.a.r.m.v g(m0.r.t.a.r.m.v vVar) {
        u uVar;
        m0.r.t.a.r.g.a g;
        m0.r.t.a.r.c.d D0;
        a0 a0Var = null;
        if (vVar == null) {
            a(66);
            throw null;
        } else if (!z(vVar)) {
            m0.r.t.a.r.m.v i = s0.i(vVar);
            m0.r.t.a.r.m.v vVar2 = ((d) this.c.invoke()).c.get(i);
            if (vVar2 != null) {
                return vVar2;
            }
            int i2 = m0.r.t.a.r.j.d.a;
            if (i != null) {
                m0.r.t.a.r.c.f c2 = i.I0().c();
                if (c2 == null) {
                    uVar = null;
                } else {
                    uVar = m0.r.t.a.r.j.d.e(c2);
                }
                if (uVar != null) {
                    m0.r.t.a.r.c.f c3 = i.I0().c();
                    if (c3 != null) {
                        i iVar = i.a;
                        m0.r.t.a.r.g.d name = c3.getName();
                        m0.n.b.i.e(name, "name");
                        if (i.e.contains(name) && (g = DescriptorUtilsKt.g(c3)) != null) {
                            m0.n.b.i.e(g, "arrayClassId");
                            m0.r.t.a.r.g.a aVar = i.c.get(g);
                            if (!(aVar == null || (D0 = i0.j.f.p.h.D0(uVar, aVar)) == null)) {
                                a0Var = D0.q();
                            }
                        }
                    }
                    if (a0Var != null) {
                        return a0Var;
                    }
                }
                throw new IllegalStateException("not array: " + vVar);
            }
            m0.r.t.a.r.j.d.a(18);
            throw null;
        } else if (vVar.H0().size() == 1) {
            m0.r.t.a.r.m.v type = vVar.H0().get(0).getType();
            if (type != null) {
                return type;
            }
            a(67);
            throw null;
        } else {
            throw new IllegalStateException();
        }
    }

    public a0 h(Variance variance, m0.r.t.a.r.m.v vVar) {
        if (variance == null) {
            a(81);
            throw null;
        } else if (vVar != null) {
            Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
            a0 i = i(variance, vVar, f.a.b);
            if (i != null) {
                return i;
            }
            a(83);
            throw null;
        } else {
            a(82);
            throw null;
        }
    }

    public a0 i(Variance variance, m0.r.t.a.r.m.v vVar, m0.r.t.a.r.c.r0.f fVar) {
        if (variance == null) {
            a(77);
            throw null;
        } else if (vVar == null) {
            a(78);
            throw null;
        } else if (fVar != null) {
            a0 e2 = KotlinTypeFactory.e(fVar, k("Array"), Collections.singletonList(new o0(variance, vVar)));
            if (e2 != null) {
                return e2;
            }
            a(80);
            throw null;
        } else {
            a(79);
            throw null;
        }
    }

    public m0.r.t.a.r.c.d j(m0.r.t.a.r.g.b bVar) {
        if (bVar != null) {
            m0.r.t.a.r.c.d A3 = i0.j.f.p.h.A3(this.b, bVar, NoLookupLocation.FROM_BUILTINS);
            if (A3 != null) {
                return A3;
            }
            a(12);
            throw null;
        }
        a(11);
        throw null;
    }

    public final m0.r.t.a.r.c.d k(String str) {
        if (str != null) {
            m0.r.t.a.r.c.d dVar = (m0.r.t.a.r.c.d) ((LockBasedStorageManager.m) this.d).invoke(m0.r.t.a.r.g.d.g(str));
            if (dVar != null) {
                return dVar;
            }
            a(14);
            throw null;
        }
        a(13);
        throw null;
    }

    public Iterable<m0.r.t.a.r.c.s0.b> l() {
        List singletonList = Collections.singletonList(new m0.r.t.a.r.b.j.a(this.e, this.b));
        if (singletonList != null) {
            return singletonList;
        }
        a(4);
        throw null;
    }

    public a0 m() {
        a0 p = p();
        if (p != null) {
            return p;
        }
        a(51);
        throw null;
    }

    public a0 n() {
        a0 t = t(PrimitiveType.INT);
        if (t != null) {
            return t;
        }
        a(57);
        throw null;
    }

    public a0 o() {
        a0 q = k("Nothing").q();
        if (q != null) {
            return q;
        }
        a(47);
        throw null;
    }

    public a0 p() {
        a0 P0 = f().M0(true);
        if (P0 != null) {
            return P0;
        }
        a(50);
        throw null;
    }

    public m0.r.t.a.r.c.s0.c q() {
        return c.b.a;
    }

    public a0 r(PrimitiveType primitiveType) {
        if (primitiveType != null) {
            a0 a0Var = ((d) this.c.invoke()).a.get(primitiveType);
            if (a0Var != null) {
                return a0Var;
            }
            a(73);
            throw null;
        }
        a(72);
        throw null;
    }

    public a0 t(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(52);
            throw null;
        } else if (primitiveType != null) {
            a0 q = k(primitiveType.getTypeName().b()).q();
            if (q != null) {
                return q;
            }
            a(53);
            throw null;
        } else {
            a(15);
            throw null;
        }
    }

    public a0 v() {
        a0 q = k("String").q();
        if (q != null) {
            return q;
        }
        a(64);
        throw null;
    }

    public m0.r.t.a.r.c.d w(int i) {
        m0.r.t.a.r.c.d j = j(g.d.c(m0.r.t.a.r.g.d.g(m0.n.b.i.k(FunctionClassKind.SuspendFunction.getClassNamePrefix(), Integer.valueOf(i)))));
        if (j != null) {
            return j;
        }
        a(17);
        throw null;
    }

    public a0 x() {
        a0 q = k("Unit").q();
        if (q != null) {
            return q;
        }
        a(63);
        throw null;
    }
}
