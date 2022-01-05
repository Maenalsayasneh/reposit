package m0.r.t.a.r.m.y0;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import m0.r.t.a.r.c.a;
import m0.r.t.a.r.c.f0;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.h0;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.p;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.c.t0.d0;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.p;
import m0.r.t.a.r.m.p0;
import m0.r.t.a.r.m.v;

/* compiled from: ErrorSimpleFunctionDescriptorImpl */
public class a extends d0 {

    /* renamed from: m0.r.t.a.r.m.y0.a$a  reason: collision with other inner class name */
    /* compiled from: ErrorSimpleFunctionDescriptorImpl */
    public class C0275a implements r.a<g0> {
        public C0275a() {
        }

        public static /* synthetic */ void r(int i) {
            String str;
            int i2;
            Throwable th;
            int i3 = i;
            if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                switch (i3) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            }
            str = "@NotNull method %s.%s must not return null";
            if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                switch (i3) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        i2 = 3;
                        break;
                }
            }
            i2 = 2;
            Object[] objArr = new Object[i2];
            switch (i3) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                case 14:
                case 16:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                    break;
                case 2:
                    objArr[0] = "modality";
                    break;
                case 4:
                    objArr[0] = "visibility";
                    break;
                case 6:
                    objArr[0] = "kind";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 11:
                case 17:
                    objArr[0] = InstabugDbContract.SDKApiEntry.COLUMN_PARAMETERS;
                    break;
                case 13:
                    objArr[0] = "substitution";
                    break;
                case 15:
                    objArr[0] = "userDataKey";
                    break;
                case 19:
                    objArr[0] = "type";
                    break;
                case 29:
                    objArr[0] = "additionalAnnotations";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i3 == 1) {
                objArr[1] = "setOwner";
            } else if (i3 == 3) {
                objArr[1] = "setModality";
            } else if (i3 == 5) {
                objArr[1] = "setVisibility";
            } else if (i3 == 10) {
                objArr[1] = "setName";
            } else if (i3 == 12) {
                objArr[1] = "setValueParameters";
            } else if (i3 == 14) {
                objArr[1] = "setSubstitution";
            } else if (i3 == 16) {
                objArr[1] = "putUserData";
            } else if (i3 == 18) {
                objArr[1] = "setTypeParameters";
            } else if (i3 == 30) {
                objArr[1] = "setAdditionalAnnotations";
            } else if (i3 == 7) {
                objArr[1] = "setKind";
            } else if (i3 != 8) {
                switch (i3) {
                    case 20:
                        objArr[1] = "setReturnType";
                        break;
                    case 21:
                        objArr[1] = "setExtensionReceiverParameter";
                        break;
                    case 22:
                        objArr[1] = "setDispatchReceiverParameter";
                        break;
                    case 23:
                        objArr[1] = "setOriginal";
                        break;
                    case 24:
                        objArr[1] = "setSignatureChange";
                        break;
                    case 25:
                        objArr[1] = "setPreserveSourceElement";
                        break;
                    case 26:
                        objArr[1] = "setDropOriginalInContainingParts";
                        break;
                    case 27:
                        objArr[1] = "setHiddenToOvercomeSignatureClash";
                        break;
                    case 28:
                        objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl$1";
                        break;
                }
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i3) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                case 14:
                case 16:
                case 18:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 30:
                    break;
                case 2:
                    objArr[2] = "setModality";
                    break;
                case 4:
                    objArr[2] = "setVisibility";
                    break;
                case 6:
                    objArr[2] = "setKind";
                    break;
                case 9:
                    objArr[2] = "setName";
                    break;
                case 11:
                    objArr[2] = "setValueParameters";
                    break;
                case 13:
                    objArr[2] = "setSubstitution";
                    break;
                case 15:
                    objArr[2] = "putUserData";
                    break;
                case 17:
                    objArr[2] = "setTypeParameters";
                    break;
                case 19:
                    objArr[2] = "setReturnType";
                    break;
                case 29:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String format = String.format(str, objArr);
            if (!(i3 == 1 || i3 == 3 || i3 == 5 || i3 == 10 || i3 == 12 || i3 == 14 || i3 == 16 || i3 == 18 || i3 == 30 || i3 == 7 || i3 == 8)) {
                switch (i3) {
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        break;
                    default:
                        th = new IllegalArgumentException(format);
                        break;
                }
            }
            th = new IllegalStateException(format);
            throw th;
        }

        public r.a<g0> a(List<o0> list) {
            if (list != null) {
                return this;
            }
            r(11);
            throw null;
        }

        public r.a<g0> b(Modality modality) {
            if (modality != null) {
                return this;
            }
            r(2);
            throw null;
        }

        public r build() {
            return a.this;
        }

        public r.a<g0> c(f0 f0Var) {
            return this;
        }

        public r.a<g0> d() {
            return this;
        }

        public r.a<g0> e(v vVar) {
            if (vVar != null) {
                return this;
            }
            r(19);
            throw null;
        }

        public r.a<g0> f(CallableMemberDescriptor callableMemberDescriptor) {
            return this;
        }

        public r.a<g0> g() {
            return this;
        }

        public r.a<g0> h(boolean z) {
            return this;
        }

        public r.a<g0> i(p0 p0Var) {
            if (p0Var != null) {
                return this;
            }
            r(13);
            throw null;
        }

        public r.a<g0> j(List<m0> list) {
            if (list != null) {
                return this;
            }
            r(17);
            throw null;
        }

        public r.a<g0> k(p pVar) {
            if (pVar != null) {
                return this;
            }
            r(4);
            throw null;
        }

        public r.a<g0> l(i iVar) {
            if (iVar != null) {
                return this;
            }
            r(0);
            throw null;
        }

        public r.a<g0> m() {
            return this;
        }

        public r.a<g0> n(CallableMemberDescriptor.Kind kind) {
            if (kind != null) {
                return this;
            }
            r(6);
            throw null;
        }

        public r.a<g0> o(f fVar) {
            if (fVar != null) {
                return this;
            }
            r(29);
            throw null;
        }

        public r.a<g0> p(d dVar) {
            if (dVar != null) {
                return this;
            }
            r(9);
            throw null;
        }

        public r.a<g0> q() {
            return this;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(m0.r.t.a.r.c.d dVar, p.d dVar2) {
        super(dVar, (g0) null, f.a.b, d.j("<ERROR FUNCTION>"), CallableMemberDescriptor.Kind.DECLARATION, h0.a);
        if (dVar == null) {
            D(0);
            throw null;
        } else if (dVar2 != null) {
            Objects.requireNonNull(f.i);
        } else {
            D(1);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str = (i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 6 || i == 7) ? 2 : 3)];
        switch (i) {
            case 1:
                objArr[0] = "ownerScope";
                break;
            case 2:
                objArr[0] = "newOwner";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "annotations";
                break;
            case 5:
                objArr[0] = Stripe3ds2AuthParams.FIELD_SOURCE;
                break;
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
                break;
            case 8:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 6) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/error/ErrorSimpleFunctionDescriptorImpl";
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 6:
            case 7:
                break;
            case 8:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 6 || i == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public r B0(i iVar, Modality modality, m0.r.t.a.r.c.p pVar, CallableMemberDescriptor.Kind kind, boolean z) {
        return this;
    }

    public m0.r.t.a.r.c.t0.p H0(i iVar, r rVar, CallableMemberDescriptor.Kind kind, d dVar, f fVar, h0 h0Var) {
        if (iVar == null) {
            D(2);
            throw null;
        } else if (kind == null) {
            D(3);
            throw null;
        } else if (fVar != null) {
            return this;
        } else {
            D(4);
            throw null;
        }
    }

    public g0 Q0(i iVar, Modality modality, m0.r.t.a.r.c.p pVar, CallableMemberDescriptor.Kind kind, boolean z) {
        return this;
    }

    public <V> V h0(a.C0250a<V> aVar) {
        return null;
    }

    public boolean isSuspend() {
        return false;
    }

    public CallableMemberDescriptor j0(i iVar, Modality modality, m0.r.t.a.r.c.p pVar, CallableMemberDescriptor.Kind kind, boolean z) {
        return this;
    }

    public r.a<? extends g0> s() {
        return new C0275a();
    }

    public void v0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == null) {
            D(8);
            throw null;
        }
    }
}
