package kotlin.reflect.jvm.internal.impl.resolve;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.c.e0;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.m;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.j.k;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.r.m.x0.d;
import m0.r.t.a.r.m.x0.e;
import m0.r.t.a.r.o.j;

public class OverridingUtil {
    public static final List<ExternalOverridabilityCondition> a;
    public static final OverridingUtil b;
    public static final d.a c;
    public final e d;
    public final d.a e;

    public static class OverrideCompatibilityInfo {
        public static final OverrideCompatibilityInfo a = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");
        public final Result b;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            if (result == null) {
                a(3);
                throw null;
            } else if (str != null) {
                this.b = result;
            } else {
                a(4);
                throw null;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L_0x000f
                if (r10 == r2) goto L_0x000f
                if (r10 == r1) goto L_0x000f
                if (r10 == r0) goto L_0x000f
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L_0x0011
            L_0x000f:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L_0x0011:
                if (r10 == r3) goto L_0x001b
                if (r10 == r2) goto L_0x001b
                if (r10 == r1) goto L_0x001b
                if (r10 == r0) goto L_0x001b
                r5 = r2
                goto L_0x001c
            L_0x001b:
                r5 = r1
            L_0x001c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L_0x0031
                if (r10 == r2) goto L_0x0031
                if (r10 == r1) goto L_0x002e
                if (r10 == r0) goto L_0x0031
                r5[r8] = r7
                goto L_0x0035
            L_0x002e:
                r5[r8] = r6
                goto L_0x0035
            L_0x0031:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L_0x0035:
                switch(r10) {
                    case 1: goto L_0x0045;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0045;
                    case 4: goto L_0x0045;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x003b;
                    default: goto L_0x0038;
                }
            L_0x0038:
                r5[r3] = r6
                goto L_0x0047
            L_0x003b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L_0x0047
            L_0x0040:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L_0x0047
            L_0x0045:
                r5[r3] = r7
            L_0x0047:
                if (r10 == r3) goto L_0x005a
                if (r10 == r2) goto L_0x0055
                if (r10 == r1) goto L_0x0050
                if (r10 == r0) goto L_0x0050
                goto L_0x005e
            L_0x0050:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L_0x005e
            L_0x0055:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L_0x005e
            L_0x005a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L_0x005e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L_0x0070
                if (r10 == r2) goto L_0x0070
                if (r10 == r1) goto L_0x0070
                if (r10 == r0) goto L_0x0070
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L_0x0075
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L_0x0075:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.a(int):void");
        }

        public static OverrideCompatibilityInfo b(String str) {
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        public static OverrideCompatibilityInfo d(String str) {
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        public Result c() {
            Result result = this.b;
            if (result != null) {
                return result;
            }
            a(5);
            throw null;
        }
    }

    public static class a implements d.a {
        public static /* synthetic */ void b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public boolean a(j0 j0Var, j0 j0Var2) {
            if (j0Var == null) {
                b(0);
                throw null;
            } else if (j0Var2 != null) {
                return j0Var.equals(j0Var2);
            } else {
                b(1);
                throw null;
            }
        }
    }

    public static class b implements l<CallableMemberDescriptor, m0.r.t.a.r.c.a> {
        public Object invoke(Object obj) {
            return (CallableMemberDescriptor) obj;
        }
    }

    public class c extends m0.r.t.a.r.m.x0.b {
        public final Map<j0, j0> i;

        public c(Map<j0, j0> map) {
            super(true, true, true, OverridingUtil.this.d);
            this.i = map;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
            if (r3.equals(r5) != false) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
            if (r1.equals(r6) != false) goto L_0x0036;
         */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
        /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean L(m0.r.t.a.r.m.j0 r5, m0.r.t.a.r.m.j0 r6) {
            /*
                r4 = this;
                r0 = 1
                boolean r1 = super.L(r5, r6)
                r2 = 0
                if (r1 != 0) goto L_0x003d
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.this
                m0.r.t.a.r.m.x0.d$a r1 = r1.e
                boolean r1 = r1.a(r5, r6)
                if (r1 == 0) goto L_0x0013
                goto L_0x0036
            L_0x0013:
                java.util.Map<m0.r.t.a.r.m.j0, m0.r.t.a.r.m.j0> r1 = r4.i
                if (r1 != 0) goto L_0x0018
                goto L_0x0038
            L_0x0018:
                java.lang.Object r1 = r1.get(r5)
                m0.r.t.a.r.m.j0 r1 = (m0.r.t.a.r.m.j0) r1
                java.util.Map<m0.r.t.a.r.m.j0, m0.r.t.a.r.m.j0> r3 = r4.i
                java.lang.Object r3 = r3.get(r6)
                m0.r.t.a.r.m.j0 r3 = (m0.r.t.a.r.m.j0) r3
                if (r1 == 0) goto L_0x002e
                boolean r6 = r1.equals(r6)
                if (r6 != 0) goto L_0x0036
            L_0x002e:
                if (r3 == 0) goto L_0x0038
                boolean r5 = r3.equals(r5)
                if (r5 == 0) goto L_0x0038
            L_0x0036:
                r5 = r0
                goto L_0x0039
            L_0x0038:
                r5 = r2
            L_0x0039:
                if (r5 == 0) goto L_0x003c
                goto L_0x003d
            L_0x003c:
                r0 = r2
            L_0x003d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.c.L(m0.r.t.a.r.m.j0, m0.r.t.a.r.m.j0):boolean");
        }
    }

    static {
        Class<ExternalOverridabilityCondition> cls = ExternalOverridabilityCondition.class;
        a = g.v0(ServiceLoader.load(cls, cls.getClassLoader()));
        a aVar = new a();
        c = aVar;
        b = new OverridingUtil(aVar, e.a.a);
    }

    public OverridingUtil(d.a aVar, e eVar) {
        if (aVar == null) {
            a(4);
            throw null;
        } else if (eVar != null) {
            this.e = aVar;
            this.d = eVar;
        } else {
            a(5);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 9 || i3 == 10 || i3 == 14 || i3 == 19 || i3 == 93 || i3 == 96 || i3 == 101)) {
            switch (i3) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i3) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i3) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i3) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 9 || i3 == 10 || i3 == 14 || i3 == 19 || i3 == 93 || i3 == 96 || i3 == 101)) {
            switch (i3) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i3) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i3) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i3) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 1:
            case 2:
            case 5:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "axioms";
                break;
            case 6:
            case 7:
                objArr[0] = "candidateSet";
                break;
            case 8:
                objArr[0] = "transformFirst";
                break;
            case 9:
            case 10:
            case 14:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 11:
                objArr[0] = "f";
                break;
            case 12:
                objArr[0] = "g";
                break;
            case 13:
            case 15:
                objArr[0] = "descriptor";
                break;
            case 16:
                objArr[0] = "result";
                break;
            case 17:
            case 20:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 18:
            case 21:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
            case 42:
                objArr[0] = "firstParameters";
                break;
            case 41:
            case 43:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeChecker";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "equalityAxioms";
                break;
        }
        if (i3 == 9 || i3 == 10) {
            objArr[1] = "filterOverrides";
        } else if (i3 != 14) {
            if (i3 != 19) {
                if (i3 == 93) {
                    objArr[1] = "getMinimalModality";
                } else if (i3 == 96) {
                    objArr[1] = "filterVisibleFakeOverrides";
                } else if (i3 != 101) {
                    switch (i3) {
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                            break;
                        default:
                            switch (i3) {
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                    objArr[1] = "isOverridableByWithoutExternalConditions";
                                    break;
                                default:
                                    switch (i3) {
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                            objArr[1] = "selectMostSpecificMember";
                                            break;
                                        default:
                                            switch (i3) {
                                                case 88:
                                                case 89:
                                                case 90:
                                                    objArr[1] = "determineModalityForFakeOverride";
                                                    break;
                                                default:
                                                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    objArr[1] = "extractMembersOverridableInBothWays";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i3) {
            case 1:
                objArr[2] = "createWithTypeRefiner";
                break;
            case 2:
            case 3:
                objArr[2] = "create";
                break;
            case 4:
            case 5:
                objArr[2] = "<init>";
                break;
            case 6:
                objArr[2] = "filterOutOverridden";
                break;
            case 7:
            case 8:
                objArr[2] = "filterOverrides";
                break;
            case 9:
            case 10:
            case 14:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 11:
            case 12:
                objArr[2] = "overrides";
                break;
            case 13:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 15:
            case 16:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 17:
            case 18:
            case 20:
            case 21:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeChecker";
                break;
            case 42:
            case 43:
                objArr[2] = "createTypeCheckerContext";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithEqualityAxioms";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 9 || i3 == 10 || i3 == 14 || i3 == 19 || i3 == 93 || i3 == 96 || i3 == 101)) {
            switch (i3) {
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i3) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i3) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i3) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public static void c(CallableMemberDescriptor callableMemberDescriptor, Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            a(15);
            throw null;
        } else if (set == null) {
            a(16);
            throw null;
        } else if (callableMemberDescriptor.f().isReal()) {
            set.add(callableMemberDescriptor);
        } else if (!callableMemberDescriptor.e().isEmpty()) {
            for (CallableMemberDescriptor c2 : callableMemberDescriptor.e()) {
                c(c2, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
    }

    public static List<v> d(m0.r.t.a.r.c.a aVar) {
        f0 l02 = aVar.l0();
        ArrayList arrayList = new ArrayList();
        if (l02 != null) {
            arrayList.add(l02.getType());
        }
        for (o0 type : aVar.h()) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        r2 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r15, m0.r.t.a.r.c.d r16, m0.r.t.a.r.j.h r17) {
        /*
            r0 = r15
            r1 = r16
            r6 = r17
            r2 = 0
            if (r0 == 0) goto L_0x01c9
            if (r1 == 0) goto L_0x01c3
            if (r6 == 0) goto L_0x01bd
            if (r1 == 0) goto L_0x01b7
            if (r0 == 0) goto L_0x01b1
            m0.r.t.a.r.j.i r3 = new m0.r.t.a.r.j.i
            r3.<init>(r1)
            java.util.List r3 = m0.j.g.r(r15, r3)
            r4 = r3
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0024
            r7 = r0
            goto L_0x0025
        L_0x0024:
            r7 = r3
        L_0x0025:
            java.util.Iterator r0 = r7.iterator()
            r3 = 0
            r5 = r3
            r8 = r5
        L_0x002c:
            boolean r9 = r0.hasNext()
            r10 = 1
            if (r9 == 0) goto L_0x0074
            java.lang.Object r9 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r9 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r9
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r11 = r9.j()
            int r11 = r11.ordinal()
            if (r11 == 0) goto L_0x0067
            if (r11 == r10) goto L_0x0050
            r9 = 2
            if (r11 == r9) goto L_0x004e
            r9 = 3
            if (r11 == r9) goto L_0x004c
            goto L_0x002c
        L_0x004c:
            r8 = r10
            goto L_0x002c
        L_0x004e:
            r5 = r10
            goto L_0x002c
        L_0x0050:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Member cannot have SEALED modality: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0067:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            if (r0 == 0) goto L_0x006e
        L_0x006b:
            r2 = r0
            goto L_0x0182
        L_0x006e:
            r0 = 88
            a(r0)
            throw r2
        L_0x0074:
            boolean r0 = r16.K()
            if (r0 == 0) goto L_0x008c
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r16.j()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r9 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            if (r0 == r9) goto L_0x008c
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r16.j()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r9 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED
            if (r0 == r9) goto L_0x008c
            r0 = r10
            goto L_0x008d
        L_0x008c:
            r0 = r3
        L_0x008d:
            if (r5 == 0) goto L_0x009c
            if (r8 != 0) goto L_0x009c
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN
            if (r0 == 0) goto L_0x0096
            goto L_0x006b
        L_0x0096:
            r0 = 89
            a(r0)
            throw r2
        L_0x009c:
            if (r5 != 0) goto L_0x00b2
            if (r8 == 0) goto L_0x00b2
            if (r0 == 0) goto L_0x00a7
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = r16.j()
            goto L_0x00a9
        L_0x00a7:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
        L_0x00a9:
            if (r0 == 0) goto L_0x00ac
            goto L_0x006b
        L_0x00ac:
            r0 = 90
            a(r0)
            throw r2
        L_0x00b2:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Iterator r8 = r7.iterator()
        L_0x00bb:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00db
            java.lang.Object r9 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r9 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r9
            if (r9 == 0) goto L_0x00d5
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            c(r9, r11)
            r5.addAll(r11)
            goto L_0x00bb
        L_0x00d5:
            r0 = 13
            a(r0)
            throw r2
        L_0x00db:
            boolean r8 = r5.isEmpty()
            if (r8 != 0) goto L_0x010c
            java.util.Iterator r8 = r5.iterator()
            java.lang.Object r8 = r8.next()
            m0.r.t.a.r.c.i r8 = (m0.r.t.a.r.c.i) r8
            m0.r.t.a.r.c.u r8 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.k(r8)
            java.lang.String r9 = "<this>"
            m0.n.b.i.e(r8, r9)
            m0.r.t.a.r.c.t<m0.r.t.a.r.m.x0.j<m0.r.t.a.r.m.x0.e>> r9 = m0.r.t.a.r.m.x0.f.a
            java.lang.Object r8 = r8.D0(r9)
            m0.r.t.a.r.m.x0.j r8 = (m0.r.t.a.r.m.x0.j) r8
            if (r8 != 0) goto L_0x0100
            r8 = r2
            goto L_0x0104
        L_0x0100:
            T r8 = r8.a
            m0.r.t.a.r.m.x0.e r8 = (m0.r.t.a.r.m.x0.e) r8
        L_0x0104:
            if (r8 == 0) goto L_0x0108
            r8 = r10
            goto L_0x0109
        L_0x0108:
            r8 = r3
        L_0x0109:
            if (r8 == 0) goto L_0x010c
            r3 = r10
        L_0x010c:
            int r8 = r5.size()
            if (r8 > r10) goto L_0x0113
            goto L_0x014f
        L_0x0113:
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x011c:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x014e
            java.lang.Object r9 = r5.next()
            java.util.Iterator r11 = r8.iterator()
        L_0x012a:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x014a
            java.lang.Object r12 = r11.next()
            r13 = r9
            m0.r.t.a.r.c.a r13 = (m0.r.t.a.r.c.a) r13
            m0.r.t.a.r.c.a r12 = (m0.r.t.a.r.c.a) r12
            boolean r14 = q(r13, r12, r3, r10)
            if (r14 == 0) goto L_0x0143
            r11.remove()
            goto L_0x012a
        L_0x0143:
            boolean r12 = q(r12, r13, r3, r10)
            if (r12 == 0) goto L_0x012a
            goto L_0x011c
        L_0x014a:
            r8.add(r9)
            goto L_0x011c
        L_0x014e:
            r5 = r8
        L_0x014f:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = r16.j()
            if (r3 == 0) goto L_0x01ab
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r8 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            java.util.Iterator r5 = r5.iterator()
        L_0x015b:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x017f
            java.lang.Object r9 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r9 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r9
            if (r0 == 0) goto L_0x0173
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r10 = r9.j()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r11 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            if (r10 != r11) goto L_0x0173
            r9 = r3
            goto L_0x0177
        L_0x0173:
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r9 = r9.j()
        L_0x0177:
            int r10 = r9.compareTo(r8)
            if (r10 >= 0) goto L_0x015b
            r8 = r9
            goto L_0x015b
        L_0x017f:
            if (r8 == 0) goto L_0x01a5
            r2 = r8
        L_0x0182:
            if (r4 == 0) goto L_0x0187
            m0.r.t.a.r.c.p r0 = m0.r.t.a.r.c.o.h
            goto L_0x0189
        L_0x0187:
            m0.r.t.a.r.c.p r0 = m0.r.t.a.r.c.o.g
        L_0x0189:
            r3 = r0
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$b r0 = new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$b
            r0.<init>()
            java.lang.Object r0 = s(r7, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r4 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            r5 = 0
            r1 = r16
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = r0.j0(r1, r2, r3, r4, r5)
            r6.d(r0, r7)
            r6.a(r0)
            return
        L_0x01a5:
            r0 = 93
            a(r0)
            throw r2
        L_0x01ab:
            r0 = 92
            a(r0)
            throw r2
        L_0x01b1:
            r0 = 95
            a(r0)
            throw r2
        L_0x01b7:
            r0 = 94
            a(r0)
            throw r2
        L_0x01bd:
            r0 = 85
            a(r0)
            throw r2
        L_0x01c3:
            r0 = 84
            a(r0)
            throw r2
        L_0x01c9:
            r0 = 83
            a(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.e(java.util.Collection, m0.r.t.a.r.c.d, m0.r.t.a.r.j.h):void");
    }

    public static <H> Collection<H> g(H h, Collection<H> collection, l<H, m0.r.t.a.r.c.a> lVar, l<H, i> lVar2) {
        if (h == null) {
            a(97);
            throw null;
        } else if (collection != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(h);
            m0.r.t.a.r.c.a invoke = lVar.invoke(h);
            Iterator<H> it = collection.iterator();
            while (it.hasNext()) {
                H next = it.next();
                m0.r.t.a.r.c.a invoke2 = lVar.invoke(next);
                if (h == next) {
                    it.remove();
                } else {
                    OverrideCompatibilityInfo.Result j = j(invoke, invoke2);
                    if (j == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                        arrayList.add(next);
                        it.remove();
                    } else if (j == OverrideCompatibilityInfo.Result.CONFLICT) {
                        lVar2.invoke(next);
                        it.remove();
                    }
                }
            }
            return arrayList;
        } else {
            a(98);
            throw null;
        }
    }

    public static OverrideCompatibilityInfo i(m0.r.t.a.r.c.a aVar, m0.r.t.a.r.c.a aVar2) {
        boolean z;
        OverrideCompatibilityInfo overrideCompatibilityInfo;
        if (aVar == null) {
            a(38);
            throw null;
        } else if (aVar2 != null) {
            boolean z2 = aVar instanceof r;
            if ((z2 && !(aVar2 instanceof r)) || (((z = aVar instanceof c0)) && !(aVar2 instanceof c0))) {
                return OverrideCompatibilityInfo.d("Member kind mismatch");
            }
            if (!z2 && !z) {
                throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
            } else if (!aVar.getName().equals(aVar2.getName())) {
                return OverrideCompatibilityInfo.d("Name mismatch");
            } else {
                boolean z3 = true;
                boolean z4 = aVar.l0() == null;
                if (aVar2.l0() != null) {
                    z3 = false;
                }
                if (z4 != z3) {
                    overrideCompatibilityInfo = OverrideCompatibilityInfo.d("Receiver presence mismatch");
                } else {
                    overrideCompatibilityInfo = aVar.h().size() != aVar2.h().size() ? OverrideCompatibilityInfo.d("Value parameter number mismatch") : null;
                }
                if (overrideCompatibilityInfo != null) {
                    return overrideCompatibilityInfo;
                }
                return null;
            }
        } else {
            a(39);
            throw null;
        }
    }

    public static OverrideCompatibilityInfo.Result j(m0.r.t.a.r.c.a aVar, m0.r.t.a.r.c.a aVar2) {
        OverridingUtil overridingUtil = b;
        OverrideCompatibilityInfo.Result c2 = overridingUtil.l(aVar2, aVar, (m0.r.t.a.r.c.d) null).c();
        OverrideCompatibilityInfo.Result c3 = overridingUtil.l(aVar, aVar2, (m0.r.t.a.r.c.d) null).c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (c2 == result && c3 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.CONFLICT;
        return (c2 == result2 || c3 == result2) ? result2 : OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    public static boolean k(m0.r.t.a.r.c.a aVar, m0.r.t.a.r.c.a aVar2) {
        if (aVar == null) {
            a(65);
            throw null;
        } else if (aVar2 != null) {
            v returnType = aVar.getReturnType();
            v returnType2 = aVar2.getReturnType();
            if (!p(aVar, aVar2)) {
                return false;
            }
            Pair<m0.r.t.a.r.m.x0.i, m0.r.t.a.r.m.x0.b> f = b.f(aVar.getTypeParameters(), aVar2.getTypeParameters());
            if (aVar instanceof r) {
                return o(aVar, returnType, aVar2, returnType2, f);
            }
            if (aVar instanceof c0) {
                c0 c0Var = (c0) aVar;
                c0 c0Var2 = (c0) aVar2;
                e0 setter = c0Var.getSetter();
                e0 setter2 = c0Var2.getSetter();
                if (!((setter == null || setter2 == null) ? true : p(setter, setter2))) {
                    return false;
                }
                if (c0Var.i0() && c0Var2.i0()) {
                    return ((m0.r.t.a.r.m.x0.i) f.c).e((m0.r.t.a.r.m.x0.b) f.d, returnType.L0(), returnType2.L0());
                }
                if ((c0Var.i0() || !c0Var2.i0()) && o(aVar, returnType, aVar2, returnType2, f)) {
                    return true;
                }
                return false;
            }
            StringBuilder P0 = i0.d.a.a.a.P0("Unexpected callable: ");
            P0.append(aVar.getClass());
            throw new IllegalArgumentException(P0.toString());
        } else {
            a(66);
            throw null;
        }
    }

    public static boolean o(m0.r.t.a.r.c.a aVar, v vVar, m0.r.t.a.r.c.a aVar2, v vVar2, Pair<m0.r.t.a.r.m.x0.i, m0.r.t.a.r.m.x0.b> pair) {
        if (vVar == null) {
            a(72);
            throw null;
        } else if (vVar2 != null) {
            return ((m0.r.t.a.r.m.x0.i) pair.c).f((m0.r.t.a.r.m.x0.b) pair.d, vVar.L0(), vVar2.L0());
        } else {
            a(74);
            throw null;
        }
    }

    public static boolean p(m mVar, m mVar2) {
        Integer b2 = o.b(mVar.getVisibility(), mVar2.getVisibility());
        return b2 == null || b2.intValue() >= 0;
    }

    public static <D extends m0.r.t.a.r.c.a> boolean q(D d2, D d3, boolean z, boolean z2) {
        if (d2 == null) {
            a(11);
            throw null;
        } else if (d3 == null) {
            a(12);
            throw null;
        } else if (!d2.equals(d3) && m0.r.t.a.r.j.b.a.a(d2.a(), d3.a(), z, z2)) {
            return true;
        } else {
            m0.r.t.a.r.c.a a2 = d3.a();
            int i = m0.r.t.a.r.j.d.a;
            LinkedHashSet<m0.r.t.a.r.c.a> linkedHashSet = new LinkedHashSet<>();
            m0.r.t.a.r.j.d.b(d2.a(), linkedHashSet);
            for (m0.r.t.a.r.c.a a3 : linkedHashSet) {
                if (m0.r.t.a.r.j.b.a.a(a2, a3, z, z2)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void r(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6, m0.n.a.l<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, m0.i> r7) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x011f
            java.util.Collection r1 = r6.e()
            java.util.Iterator r1 = r1.iterator()
        L_0x000b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0023
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
            m0.r.t.a.r.c.p r3 = r2.getVisibility()
            m0.r.t.a.r.c.p r4 = m0.r.t.a.r.c.o.g
            if (r3 != r4) goto L_0x000b
            r(r2, r7)
            goto L_0x000b
        L_0x0023:
            m0.r.t.a.r.c.p r1 = r6.getVisibility()
            m0.r.t.a.r.c.p r2 = m0.r.t.a.r.c.o.g
            if (r1 == r2) goto L_0x002c
            return
        L_0x002c:
            java.util.Collection r1 = r6.e()
            if (r1 == 0) goto L_0x0119
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x003b
            m0.r.t.a.r.c.p r2 = m0.r.t.a.r.c.o.k
            goto L_0x0088
        L_0x003b:
            java.util.Iterator r2 = r1.iterator()
        L_0x003f:
            r3 = r0
        L_0x0040:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0062
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            m0.r.t.a.r.c.p r4 = r4.getVisibility()
            if (r3 != 0) goto L_0x0053
            goto L_0x0060
        L_0x0053:
            java.lang.Integer r5 = m0.r.t.a.r.c.o.b(r4, r3)
            if (r5 != 0) goto L_0x005a
            goto L_0x003f
        L_0x005a:
            int r5 = r5.intValue()
            if (r5 <= 0) goto L_0x0040
        L_0x0060:
            r3 = r4
            goto L_0x0040
        L_0x0062:
            if (r3 != 0) goto L_0x0065
            goto L_0x0085
        L_0x0065:
            java.util.Iterator r2 = r1.iterator()
        L_0x0069:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0087
            java.lang.Object r4 = r2.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            m0.r.t.a.r.c.p r4 = r4.getVisibility()
            java.lang.Integer r4 = m0.r.t.a.r.c.o.b(r3, r4)
            if (r4 == 0) goto L_0x0085
            int r4 = r4.intValue()
            if (r4 >= 0) goto L_0x0069
        L_0x0085:
            r2 = r0
            goto L_0x0088
        L_0x0087:
            r2 = r3
        L_0x0088:
            if (r2 != 0) goto L_0x008c
        L_0x008a:
            r2 = r0
            goto L_0x00bb
        L_0x008c:
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r3 = r6.f()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r4 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE
            if (r3 != r4) goto L_0x00b7
            java.util.Iterator r1 = r1.iterator()
        L_0x0098:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = r3.j()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r5 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
            if (r4 == r5) goto L_0x0098
            m0.r.t.a.r.c.p r3 = r3.getVisibility()
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x0098
            goto L_0x008a
        L_0x00b7:
            m0.r.t.a.r.c.p r2 = r2.d()
        L_0x00bb:
            if (r2 != 0) goto L_0x00c5
            if (r7 == 0) goto L_0x00c2
            r7.invoke(r6)
        L_0x00c2:
            m0.r.t.a.r.c.p r1 = m0.r.t.a.r.c.o.e
            goto L_0x00c6
        L_0x00c5:
            r1 = r2
        L_0x00c6:
            boolean r3 = r6 instanceof m0.r.t.a.r.c.t0.z
            if (r3 == 0) goto L_0x00f6
            r3 = r6
            m0.r.t.a.r.c.t0.z r3 = (m0.r.t.a.r.c.t0.z) r3
            if (r1 == 0) goto L_0x00f0
            r3.b2 = r1
            m0.r.t.a.r.c.c0 r6 = (m0.r.t.a.r.c.c0) r6
            java.util.List r6 = r6.u()
            java.util.Iterator r6 = r6.iterator()
        L_0x00db:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0118
            java.lang.Object r1 = r6.next()
            m0.r.t.a.r.c.b0 r1 = (m0.r.t.a.r.c.b0) r1
            if (r2 != 0) goto L_0x00eb
            r3 = r0
            goto L_0x00ec
        L_0x00eb:
            r3 = r7
        L_0x00ec:
            r(r1, r3)
            goto L_0x00db
        L_0x00f0:
            r6 = 16
            m0.r.t.a.r.c.t0.z.D(r6)
            throw r0
        L_0x00f6:
            boolean r7 = r6 instanceof m0.r.t.a.r.c.t0.p
            if (r7 == 0) goto L_0x0107
            m0.r.t.a.r.c.t0.p r6 = (m0.r.t.a.r.c.t0.p) r6
            if (r1 == 0) goto L_0x0101
            r6.d2 = r1
            goto L_0x0118
        L_0x0101:
            r6 = 9
            m0.r.t.a.r.c.t0.p.D(r6)
            throw r0
        L_0x0107:
            m0.r.t.a.r.c.t0.y r6 = (m0.r.t.a.r.c.t0.y) r6
            r6.d2 = r1
            m0.r.t.a.r.c.c0 r7 = r6.x0()
            m0.r.t.a.r.c.p r7 = r7.getVisibility()
            if (r1 == r7) goto L_0x0118
            r7 = 0
            r6.y = r7
        L_0x0118:
            return
        L_0x0119:
            r6 = 107(0x6b, float:1.5E-43)
            a(r6)
            throw r0
        L_0x011f:
            r6 = 105(0x69, float:1.47E-43)
            a(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.r(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, m0.n.a.l):void");
    }

    public static <H> H s(Collection<H> collection, l<H, m0.r.t.a.r.c.a> lVar) {
        H h;
        boolean z;
        if (collection.size() == 1) {
            H t = g.t(collection);
            if (t != null) {
                return t;
            }
            a(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        m0.n.b.i.e(collection, "$this$map");
        m0.n.b.i.e(lVar, "transform");
        ArrayList arrayList2 = new ArrayList(h.K(collection, 10));
        for (H invoke : collection) {
            arrayList2.add(lVar.invoke(invoke));
        }
        H t2 = g.t(collection);
        m0.r.t.a.r.c.a invoke2 = lVar.invoke(t2);
        for (H next : collection) {
            m0.r.t.a.r.c.a invoke3 = lVar.invoke(next);
            if (invoke3 != null) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!k(invoke3, (m0.r.t.a.r.c.a) it.next())) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    arrayList.add(next);
                }
                if (k(invoke3, invoke2) && !k(invoke2, invoke3)) {
                    t2 = next;
                }
            } else {
                a(69);
                throw null;
            }
        }
        if (arrayList.isEmpty()) {
            if (t2 != null) {
                return t2;
            }
            a(79);
            throw null;
        } else if (arrayList.size() == 1) {
            H t3 = g.t(arrayList);
            if (t3 != null) {
                return t3;
            }
            a(80);
            throw null;
        } else {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    h = null;
                    break;
                }
                h = it2.next();
                if (!h.k2(lVar.invoke(h).getReturnType())) {
                    break;
                }
            }
            if (h != null) {
                return h;
            }
            H t4 = g.t(arrayList);
            if (t4 != null) {
                return t4;
            }
            a(82);
            throw null;
        }
    }

    public final boolean b(v vVar, v vVar2, Pair<m0.r.t.a.r.m.x0.i, m0.r.t.a.r.m.x0.b> pair) {
        if (vVar == null) {
            a(44);
            throw null;
        } else if (vVar2 == null) {
            a(45);
            throw null;
        } else if (pair != null) {
            if (h.h2(vVar) && h.h2(vVar2)) {
                return true;
            }
            return ((m0.r.t.a.r.m.x0.i) pair.c).e((m0.r.t.a.r.m.x0.b) pair.d, vVar.L0(), vVar2.L0());
        } else {
            a(46);
            throw null;
        }
    }

    public final Pair<m0.r.t.a.r.m.x0.i, m0.r.t.a.r.m.x0.b> f(List<m0> list, List<m0> list2) {
        c cVar;
        if (list == null) {
            a(40);
            throw null;
        } else if (list2 != null) {
            m0.r.t.a.r.m.x0.i iVar = new m0.r.t.a.r.m.x0.i(this.d);
            if (list == null) {
                a(42);
                throw null;
            } else if (list2 != null) {
                if (list.isEmpty()) {
                    cVar = new c((Map<j0, j0>) null);
                } else {
                    HashMap hashMap = new HashMap();
                    for (int i = 0; i < list.size(); i++) {
                        hashMap.put(list.get(i).i(), list2.get(i).i());
                    }
                    cVar = new c(hashMap);
                }
                return new Pair<>(iVar, cVar);
            } else {
                a(43);
                throw null;
            }
        } else {
            a(41);
            throw null;
        }
    }

    public void h(m0.r.t.a.r.g.d dVar, Collection<? extends CallableMemberDescriptor> collection, Collection<? extends CallableMemberDescriptor> collection2, m0.r.t.a.r.c.d dVar2, m0.r.t.a.r.j.h hVar) {
        Integer b2;
        Collection<? extends CallableMemberDescriptor> collection3 = collection;
        m0.r.t.a.r.c.d dVar3 = dVar2;
        m0.r.t.a.r.j.h hVar2 = hVar;
        if (dVar == null) {
            a(50);
            throw null;
        } else if (collection3 == null) {
            a(51);
            throw null;
        } else if (collection2 == null) {
            a(52);
            throw null;
        } else if (dVar3 != null) {
            LinkedHashSet<CallableMemberDescriptor> linkedHashSet = new LinkedHashSet<>(collection3);
            Iterator<? extends CallableMemberDescriptor> it = collection2.iterator();
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) it.next();
                    if (callableMemberDescriptor != null) {
                        ArrayList arrayList = new ArrayList(collection.size());
                        j b3 = j.b();
                        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
                            OverrideCompatibilityInfo.Result c2 = l(callableMemberDescriptor2, callableMemberDescriptor, dVar3).c();
                            boolean z2 = !o.e(callableMemberDescriptor2.getVisibility()) && o.f(callableMemberDescriptor2, callableMemberDescriptor);
                            int ordinal = c2.ordinal();
                            if (ordinal == 0) {
                                if (z2) {
                                    b3.add(callableMemberDescriptor2);
                                }
                                arrayList.add(callableMemberDescriptor2);
                            } else if (ordinal == 2) {
                                if (z2) {
                                    hVar2.c(callableMemberDescriptor2, callableMemberDescriptor);
                                }
                                arrayList.add(callableMemberDescriptor2);
                            }
                        }
                        hVar2.d(callableMemberDescriptor, b3);
                        linkedHashSet.removeAll(arrayList);
                    } else {
                        a(57);
                        throw null;
                    }
                } else {
                    if (linkedHashSet.size() >= 2) {
                        m0.r.t.a.r.c.i b4 = ((CallableMemberDescriptor) linkedHashSet.iterator().next()).b();
                        m0.n.b.i.e(linkedHashSet, "$this$all");
                        if (!linkedHashSet.isEmpty()) {
                            Iterator it2 = linkedHashSet.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                if (!Boolean.valueOf(((CallableMemberDescriptor) it2.next()).b() == b4).booleanValue()) {
                                    break;
                                }
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        for (CallableMemberDescriptor singleton : linkedHashSet) {
                            e(Collections.singleton(singleton), dVar3, hVar2);
                        }
                        return;
                    }
                    LinkedList<CallableMemberDescriptor> linkedList = new LinkedList<>(linkedHashSet);
                    while (!linkedList.isEmpty()) {
                        m0.n.b.i.e(linkedList, "descriptors");
                        linkedList.isEmpty();
                        CallableMemberDescriptor callableMemberDescriptor3 = null;
                        for (CallableMemberDescriptor callableMemberDescriptor4 : linkedList) {
                            if (callableMemberDescriptor3 == null || ((b2 = o.b(callableMemberDescriptor3.getVisibility(), callableMemberDescriptor4.getVisibility())) != null && b2.intValue() < 0)) {
                                callableMemberDescriptor3 = callableMemberDescriptor4;
                            }
                        }
                        m0.n.b.i.c(callableMemberDescriptor3);
                        e(g(callableMemberDescriptor3, linkedList, new m0.r.t.a.r.j.j(), new k(hVar2, callableMemberDescriptor3)), dVar3, hVar2);
                    }
                    return;
                }
            }
        } else {
            a(53);
            throw null;
        }
    }

    public OverrideCompatibilityInfo l(m0.r.t.a.r.c.a aVar, m0.r.t.a.r.c.a aVar2, m0.r.t.a.r.c.d dVar) {
        if (aVar == null) {
            a(17);
            throw null;
        } else if (aVar2 != null) {
            return m(aVar, aVar2, dVar, false);
        } else {
            a(18);
            throw null;
        }
    }

    public OverrideCompatibilityInfo m(m0.r.t.a.r.c.a aVar, m0.r.t.a.r.c.a aVar2, m0.r.t.a.r.c.d dVar, boolean z) {
        if (aVar == null) {
            a(20);
            throw null;
        } else if (aVar2 != null) {
            OverrideCompatibilityInfo n = n(aVar, aVar2, z);
            boolean z2 = n.c() == OverrideCompatibilityInfo.Result.OVERRIDABLE;
            for (ExternalOverridabilityCondition next : a) {
                if (next.a() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z2 || next.a() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                    int ordinal = next.b(aVar, aVar2, dVar).ordinal();
                    if (ordinal == 0) {
                        z2 = true;
                    } else if (ordinal == 1) {
                        return OverrideCompatibilityInfo.b("External condition failed");
                    } else {
                        if (ordinal == 2) {
                            return OverrideCompatibilityInfo.d("External condition");
                        }
                    }
                }
            }
            if (!z2) {
                return n;
            }
            for (ExternalOverridabilityCondition next2 : a) {
                if (next2.a() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                    int ordinal2 = next2.b(aVar, aVar2, dVar).ordinal();
                    if (ordinal2 == 0) {
                        StringBuilder P0 = i0.d.a.a.a.P0("Contract violation in ");
                        P0.append(next2.getClass().getName());
                        P0.append(" condition. It's not supposed to end with success");
                        throw new IllegalStateException(P0.toString());
                    } else if (ordinal2 == 1) {
                        return OverrideCompatibilityInfo.b("External condition failed");
                    } else {
                        if (ordinal2 == 2) {
                            return OverrideCompatibilityInfo.d("External condition");
                        }
                    }
                }
            }
            OverrideCompatibilityInfo overrideCompatibilityInfo = OverrideCompatibilityInfo.a;
            if (overrideCompatibilityInfo != null) {
                return overrideCompatibilityInfo;
            }
            OverrideCompatibilityInfo.a(0);
            throw null;
        } else {
            a(21);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c7 A[LOOP:1: B:18:0x0061->B:39:0x00c7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00c0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo n(m0.r.t.a.r.c.a r18, m0.r.t.a.r.c.a r19, boolean r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 0
            if (r1 == 0) goto L_0x0169
            if (r2 == 0) goto L_0x0163
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r4 = i(r18, r19)
            if (r4 == 0) goto L_0x0012
            return r4
        L_0x0012:
            java.util.List r4 = d(r18)
            java.util.List r5 = d(r19)
            java.util.List r6 = r18.getTypeParameters()
            java.util.List r7 = r19.getTypeParameters()
            int r8 = r6.size()
            int r9 = r7.size()
            r10 = 0
            if (r8 == r9) goto L_0x005c
        L_0x002d:
            r1 = r4
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            java.lang.String r3 = "Type parameter number mismatch"
            if (r10 >= r2) goto L_0x0057
            m0.r.t.a.r.m.x0.d r2 = m0.r.t.a.r.m.x0.d.a
            java.lang.Object r1 = r1.get(r10)
            m0.r.t.a.r.m.v r1 = (m0.r.t.a.r.m.v) r1
            r6 = r5
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r6 = r6.get(r10)
            m0.r.t.a.r.m.v r6 = (m0.r.t.a.r.m.v) r6
            boolean r1 = r2.b(r1, r6)
            if (r1 != 0) goto L_0x0054
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.d(r3)
            return r1
        L_0x0054:
            int r10 = r10 + 1
            goto L_0x002d
        L_0x0057:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.b(r3)
            return r1
        L_0x005c:
            kotlin.Pair r8 = r0.f(r6, r7)
            r9 = r10
        L_0x0061:
            int r11 = r6.size()
            if (r9 >= r11) goto L_0x00d6
            java.lang.Object r11 = r6.get(r9)
            m0.r.t.a.r.c.m0 r11 = (m0.r.t.a.r.c.m0) r11
            java.lang.Object r13 = r7.get(r9)
            m0.r.t.a.r.c.m0 r13 = (m0.r.t.a.r.c.m0) r13
            if (r11 == 0) goto L_0x00d0
            if (r13 == 0) goto L_0x00ca
            java.util.List r11 = r11.getUpperBounds()
            java.util.ArrayList r14 = new java.util.ArrayList
            java.util.List r13 = r13.getUpperBounds()
            r14.<init>(r13)
            int r13 = r11.size()
            int r15 = r14.size()
            if (r13 == r15) goto L_0x008f
            goto L_0x00bb
        L_0x008f:
            java.util.Iterator r11 = r11.iterator()
        L_0x0093:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00bd
            java.lang.Object r13 = r11.next()
            m0.r.t.a.r.m.v r13 = (m0.r.t.a.r.m.v) r13
            java.util.ListIterator r15 = r14.listIterator()
        L_0x00a3:
            boolean r16 = r15.hasNext()
            if (r16 == 0) goto L_0x00bb
            java.lang.Object r16 = r15.next()
            r12 = r16
            m0.r.t.a.r.m.v r12 = (m0.r.t.a.r.m.v) r12
            boolean r12 = r0.b(r13, r12, r8)
            if (r12 == 0) goto L_0x00a3
            r15.remove()
            goto L_0x0093
        L_0x00bb:
            r12 = r10
            goto L_0x00be
        L_0x00bd:
            r12 = 1
        L_0x00be:
            if (r12 != 0) goto L_0x00c7
            java.lang.String r1 = "Type parameter bounds mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.d(r1)
            return r1
        L_0x00c7:
            int r9 = r9 + 1
            goto L_0x0061
        L_0x00ca:
            r1 = 48
            a(r1)
            throw r3
        L_0x00d0:
            r1 = 47
            a(r1)
            throw r3
        L_0x00d6:
            r6 = r10
        L_0x00d7:
            r7 = r4
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r9 = r7.size()
            if (r6 >= r9) goto L_0x00ff
            java.lang.Object r7 = r7.get(r6)
            m0.r.t.a.r.m.v r7 = (m0.r.t.a.r.m.v) r7
            r9 = r5
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r9 = r9.get(r6)
            m0.r.t.a.r.m.v r9 = (m0.r.t.a.r.m.v) r9
            boolean r7 = r0.b(r7, r9, r8)
            if (r7 != 0) goto L_0x00fc
            java.lang.String r1 = "Value parameter type mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.d(r1)
            return r1
        L_0x00fc:
            int r6 = r6 + 1
            goto L_0x00d7
        L_0x00ff:
            boolean r4 = r1 instanceof m0.r.t.a.r.c.r
            if (r4 == 0) goto L_0x011e
            boolean r4 = r2 instanceof m0.r.t.a.r.c.r
            if (r4 == 0) goto L_0x011e
            r4 = r1
            m0.r.t.a.r.c.r r4 = (m0.r.t.a.r.c.r) r4
            boolean r4 = r4.isSuspend()
            r5 = r2
            m0.r.t.a.r.c.r r5 = (m0.r.t.a.r.c.r) r5
            boolean r5 = r5.isSuspend()
            if (r4 == r5) goto L_0x011e
            java.lang.String r1 = "Incompatible suspendability"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.b(r1)
            return r1
        L_0x011e:
            if (r20 == 0) goto L_0x015a
            m0.r.t.a.r.m.v r1 = r18.getReturnType()
            m0.r.t.a.r.m.v r2 = r19.getReturnType()
            if (r1 == 0) goto L_0x015a
            if (r2 == 0) goto L_0x015a
            boolean r4 = i0.j.f.p.h.h2(r2)
            if (r4 == 0) goto L_0x013a
            boolean r4 = i0.j.f.p.h.h2(r1)
            if (r4 == 0) goto L_0x013a
            r12 = 1
            goto L_0x013b
        L_0x013a:
            r12 = r10
        L_0x013b:
            if (r12 != 0) goto L_0x015a
            A r4 = r8.c
            m0.r.t.a.r.m.x0.i r4 = (m0.r.t.a.r.m.x0.i) r4
            B r5 = r8.d
            m0.r.t.a.r.m.x0.b r5 = (m0.r.t.a.r.m.x0.b) r5
            m0.r.t.a.r.m.v0 r2 = r2.L0()
            m0.r.t.a.r.m.v0 r1 = r1.L0()
            boolean r1 = r4.f(r5, r2, r1)
            if (r1 != 0) goto L_0x015a
            java.lang.String r1 = "Return type mismatch"
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.b(r1)
            return r1
        L_0x015a:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo r1 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.a
            if (r1 == 0) goto L_0x015f
            return r1
        L_0x015f:
            kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.a(r10)
            throw r3
        L_0x0163:
            r1 = 29
            a(r1)
            throw r3
        L_0x0169:
            r1 = 28
            a(r1)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.n(m0.r.t.a.r.c.a, m0.r.t.a.r.c.a, boolean):kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo");
    }
}
