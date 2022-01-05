package m0.r.t.a;

import com.pubnub.api.PubNubUtil;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.MutablePropertyReference1;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.ReflectLambdaKt$reflect$descriptor$1;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;
import kotlin.reflect.jvm.internal.KMutableProperty1Impl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.KProperty1Impl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer;
import kotlin.reflect.jvm.internal.ReflectionObjectRenderer$renderLambda$1$1;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.pcollections.MapEntry;
import m0.n.b.i;
import m0.n.b.n;
import m0.r.d;
import m0.r.f;
import m0.r.g;
import m0.r.j;
import m0.r.p;
import m0.r.t.a.r.c.g0;
import m0.r.t.a.r.c.m0;
import m0.r.t.a.r.c.o0;
import m0.r.t.a.r.c.r;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.f.d.a.h;
import m0.r.t.a.r.h.e;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.m.j0;
import m0.r.t.a.r.m.v;
import m0.r.t.a.s.a;
import m0.r.t.a.s.b;

/* compiled from: ReflectionFactoryImpl */
public class m extends n {
    public static KDeclarationContainerImpl j(CallableReference callableReference) {
        f owner = callableReference.getOwner();
        return owner instanceof KDeclarationContainerImpl ? (KDeclarationContainerImpl) owner : b.q;
    }

    public g a(FunctionReference functionReference) {
        KDeclarationContainerImpl j = j(functionReference);
        String name = functionReference.getName();
        String signature = functionReference.getSignature();
        Object boundReceiver = functionReference.getBoundReceiver();
        i.e(j, "container");
        i.e(name, "name");
        i.e(signature, PubNubUtil.SIGNATURE_QUERY_PARAM_NAME);
        return new KFunctionImpl(j, name, signature, (r) null, boundReceiver);
    }

    public d b(Class cls) {
        Class<T> cls2;
        V v;
        b<String, Object> bVar = e.a;
        i.e(cls, "jClass");
        String name = cls.getName();
        b<String, Object> bVar2 = e.a;
        Objects.requireNonNull(bVar2);
        a aVar = (a) bVar2.b.b.a((long) name.hashCode());
        if (aVar == null) {
            aVar = a.c;
        }
        while (true) {
            cls2 = null;
            if (aVar == null || aVar.x <= 0) {
                v = null;
            } else {
                MapEntry mapEntry = (MapEntry) aVar.d;
                if (mapEntry.c.equals(name)) {
                    v = mapEntry.d;
                    break;
                }
                aVar = aVar.q;
            }
        }
        v = null;
        if (v instanceof WeakReference) {
            KClassImpl kClassImpl = (KClassImpl) ((WeakReference) v).get();
            if (kClassImpl != null) {
                cls2 = kClassImpl.y;
            }
            if (i.a(cls2, cls)) {
                return kClassImpl;
            }
        } else if (v != null) {
            for (WeakReference weakReference : (WeakReference[]) v) {
                KClassImpl kClassImpl2 = (KClassImpl) weakReference.get();
                if (i.a(kClassImpl2 != null ? kClassImpl2.y : null, cls)) {
                    return kClassImpl2;
                }
            }
            int length = ((Object[]) v).length;
            WeakReference[] weakReferenceArr = new WeakReference[(length + 1)];
            System.arraycopy(v, 0, weakReferenceArr, 0, length);
            KClassImpl kClassImpl3 = new KClassImpl(cls);
            weakReferenceArr[length] = new WeakReference(kClassImpl3);
            b<String, Object> a = e.a.a(name, weakReferenceArr);
            i.d(a, "K_CLASS_CACHE.plus(name, newArray)");
            e.a = a;
            return kClassImpl3;
        }
        KClassImpl kClassImpl4 = new KClassImpl(cls);
        b<String, Object> a2 = e.a.a(name, new WeakReference(kClassImpl4));
        i.d(a2, "K_CLASS_CACHE.plus(name, WeakReference(newKClass))");
        e.a = a2;
        return kClassImpl4;
    }

    public f c(Class cls, String str) {
        return new KPackageImpl(cls, str);
    }

    public m0.r.i d(MutablePropertyReference0 mutablePropertyReference0) {
        return new KMutableProperty0Impl(j(mutablePropertyReference0), mutablePropertyReference0.getName(), mutablePropertyReference0.getSignature(), mutablePropertyReference0.getBoundReceiver());
    }

    public j e(MutablePropertyReference1 mutablePropertyReference1) {
        return new KMutableProperty1Impl(j(mutablePropertyReference1), mutablePropertyReference1.getName(), mutablePropertyReference1.getSignature(), mutablePropertyReference1.getBoundReceiver());
    }

    public m0.r.m f(PropertyReference1 propertyReference1) {
        return new KProperty1Impl(j(propertyReference1), propertyReference1.getName(), propertyReference1.getSignature(), propertyReference1.getBoundReceiver());
    }

    public String g(m0.n.b.g gVar) {
        KFunctionImpl a;
        i.e(gVar, "$this$reflect");
        Metadata metadata = (Metadata) gVar.getClass().getAnnotation(Metadata.class);
        KFunctionImpl kFunctionImpl = null;
        if (metadata != null) {
            String[] d1 = metadata.d1();
            boolean z = true;
            if (d1.length == 0) {
                d1 = null;
            }
            if (d1 != null) {
                String[] d2 = metadata.d2();
                h hVar = h.a;
                i.e(d1, MessageExtension.FIELD_DATA);
                i.e(d2, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m0.r.t.a.r.f.d.a.a.a(d1));
                e eVar = h.b;
                JvmProtoBuf.StringTableTypes stringTableTypes = (JvmProtoBuf.StringTableTypes) ((m0.r.t.a.r.h.b) JvmProtoBuf.StringTableTypes.d).c(byteArrayInputStream, eVar);
                i.d(stringTableTypes, "parseDelimitedFrom(this, EXTENSION_REGISTRY)");
                m0.r.t.a.r.f.d.a.g gVar2 = new m0.r.t.a.r.f.d.a.g(stringTableTypes, d2);
                m0.r.t.a.r.h.b bVar = (m0.r.t.a.r.h.b) ProtoBuf$Function.q;
                l d = bVar.d(byteArrayInputStream, eVar);
                bVar.b(d);
                ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) d;
                int[] mv = metadata.mv();
                if ((metadata.xi() & 8) == 0) {
                    z = false;
                }
                m0.r.t.a.r.f.d.a.f fVar = new m0.r.t.a.r.f.d.a.f(mv, z);
                Class<?> cls = gVar.getClass();
                ProtoBuf$TypeTable protoBuf$TypeTable = protoBuf$Function.h2;
                i.d(protoBuf$TypeTable, "proto.typeTable");
                g0 g0Var = (g0) o.d(cls, protoBuf$Function, gVar2, new m0.r.t.a.r.f.c.e(protoBuf$TypeTable), fVar, ReflectLambdaKt$reflect$descriptor$1.c);
                if (g0Var != null) {
                    kFunctionImpl = new KFunctionImpl(b.q, g0Var);
                }
            }
        }
        if (kFunctionImpl == null || (a = o.a(kFunctionImpl)) == null) {
            return super.g(gVar);
        }
        ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.b;
        r v = a.p();
        i.e(v, "invoke");
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer.b(sb, v);
        List<o0> h = v.h();
        i.d(h, "invoke.valueParameters");
        m0.j.g.C(h, sb, ", ", "(", ")", 0, (CharSequence) null, ReflectionObjectRenderer$renderLambda$1$1.c, 48);
        sb.append(" -> ");
        v returnType = v.getReturnType();
        i.c(returnType);
        i.d(returnType, "invoke.returnType!!");
        sb.append(ReflectionObjectRenderer.e(returnType));
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public String h(Lambda lambda) {
        return g(lambda);
    }

    public m0.r.n i(m0.r.e eVar, List<p> list, boolean z) {
        m0.r.t.a.r.c.f descriptor;
        m0.r.t.a.r.c.r0.f fVar;
        Object obj;
        List emptyList = Collections.emptyList();
        i.e(eVar, "$this$createType");
        i.e(list, "arguments");
        i.e(emptyList, "annotations");
        f fVar2 = (f) (!(eVar instanceof f) ? null : eVar);
        if (fVar2 == null || (descriptor = fVar2.getDescriptor()) == null) {
            throw new KotlinReflectionInternalError("Cannot create type for an unsupported classifier: " + eVar + " (" + eVar.getClass() + ')');
        }
        j0 i = descriptor.i();
        i.d(i, "descriptor.typeConstructor");
        List<m0> parameters = i.getParameters();
        i.d(parameters, "typeConstructor.parameters");
        if (parameters.size() == list.size()) {
            if (emptyList.isEmpty()) {
                Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
                fVar = f.a.b;
            } else {
                Objects.requireNonNull(m0.r.t.a.r.c.r0.f.i);
                fVar = f.a.b;
            }
            m0.r.t.a.r.c.r0.f fVar3 = fVar;
            List<m0> parameters2 = i.getParameters();
            i.d(parameters2, "typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(i0.j.f.p.h.K(list, 10));
            int i2 = 0;
            for (T next : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    p pVar = (p) next;
                    KTypeImpl kTypeImpl = (KTypeImpl) pVar.d;
                    v vVar = kTypeImpl != null ? kTypeImpl.y : null;
                    KVariance kVariance = pVar.c;
                    if (kVariance == null) {
                        m0 m0Var = parameters2.get(i2);
                        i.d(m0Var, "parameters[index]");
                        obj = new StarProjectionImpl(m0Var);
                    } else {
                        int ordinal = kVariance.ordinal();
                        if (ordinal == 0) {
                            Variance variance = Variance.INVARIANT;
                            i.c(vVar);
                            obj = new m0.r.t.a.r.m.o0(variance, vVar);
                        } else if (ordinal == 1) {
                            Variance variance2 = Variance.IN_VARIANCE;
                            i.c(vVar);
                            obj = new m0.r.t.a.r.m.o0(variance2, vVar);
                        } else if (ordinal == 2) {
                            Variance variance3 = Variance.OUT_VARIANCE;
                            i.c(vVar);
                            obj = new m0.r.t.a.r.m.o0(variance3, vVar);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    arrayList.add(obj);
                    i2 = i3;
                } else {
                    m0.j.g.r0();
                    throw null;
                }
            }
            return new KTypeImpl(KotlinTypeFactory.g(fVar3, i, arrayList, z, (m0.r.t.a.r.m.x0.e) null, 16), (m0.n.a.a<? extends Type>) null);
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Class declares ");
        P0.append(parameters.size());
        P0.append(" type parameters, but ");
        P0.append(list.size());
        P0.append(" were provided.");
        throw new IllegalArgumentException(P0.toString());
    }
}
