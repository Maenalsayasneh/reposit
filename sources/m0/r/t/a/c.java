package m0.r.t.a;

import i0.j.f.p.h;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.c.c0;
import m0.r.t.a.r.e.a.p;
import m0.r.t.a.r.f.c.e;

/* compiled from: RuntimeTypeMapper.kt */
public abstract class c {

    /* compiled from: RuntimeTypeMapper.kt */
    public static final class a extends c {
        public final Field a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super((f) null);
            i.e(field, "field");
            this.a = field;
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            String name = this.a.getName();
            i.d(name, "field.name");
            sb.append(p.a(name));
            sb.append("()");
            Class<?> type = this.a.getType();
            i.d(type, "field.type");
            sb.append(ReflectClassUtilKt.c(type));
            return sb.toString();
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    public static final class b extends c {
        public final Method a;
        public final Method b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Method method, Method method2) {
            super((f) null);
            i.e(method, "getterMethod");
            this.a = method;
            this.b = method2;
        }

        public String a() {
            return h.l(this.a);
        }
    }

    /* renamed from: m0.r.t.a.c$c  reason: collision with other inner class name */
    /* compiled from: RuntimeTypeMapper.kt */
    public static final class C0244c extends c {
        public final String a;
        public final c0 b;
        public final ProtoBuf$Property c;
        public final JvmProtoBuf.JvmPropertySignature d;
        public final m0.r.t.a.r.f.c.c e;
        public final e f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x009d, code lost:
            r3 = r6.b(r3.intValue());
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0244c(m0.r.t.a.r.c.c0 r3, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r4, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature r5, m0.r.t.a.r.f.c.c r6, m0.r.t.a.r.f.c.e r7) {
            /*
                r2 = this;
                java.lang.String r0 = "descriptor"
                m0.n.b.i.e(r3, r0)
                java.lang.String r0 = "proto"
                m0.n.b.i.e(r4, r0)
                java.lang.String r0 = "signature"
                m0.n.b.i.e(r5, r0)
                java.lang.String r0 = "nameResolver"
                m0.n.b.i.e(r6, r0)
                java.lang.String r0 = "typeTable"
                m0.n.b.i.e(r7, r0)
                r0 = 0
                r2.<init>(r0)
                r2.b = r3
                r2.c = r4
                r2.d = r5
                r2.e = r6
                r2.f = r7
                boolean r0 = r5.i()
                if (r0 == 0) goto L_0x0056
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r5.Z1
                java.lang.String r7 = "signature.getter"
                m0.n.b.i.d(r4, r7)
                int r4 = r4.y
                java.lang.String r4 = r6.b(r4)
                r3.append(r4)
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r5.Z1
                m0.n.b.i.d(r4, r7)
                int r4 = r4.Y1
                java.lang.String r4 = r6.b(r4)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                goto L_0x00ff
            L_0x0056:
                m0.r.t.a.r.f.d.a.h r5 = m0.r.t.a.r.f.d.a.h.a
                r0 = 1
                m0.r.t.a.r.f.d.a.e$a r4 = r5.b(r4, r6, r7, r0)
                if (r4 == 0) goto L_0x0102
                java.lang.String r5 = r4.a
                java.lang.String r4 = r4.b
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r5 = m0.r.t.a.r.e.a.p.a(r5)
                r7.append(r5)
                m0.r.t.a.r.c.i r5 = r3.b()
                java.lang.String r0 = "descriptor.containingDeclaration"
                m0.n.b.i.d(r5, r0)
                m0.r.t.a.r.c.p r0 = r3.getVisibility()
                m0.r.t.a.r.c.p r1 = m0.r.t.a.r.c.o.d
                boolean r0 = m0.n.b.i.a(r0, r1)
                java.lang.String r1 = "$"
                if (r0 == 0) goto L_0x00c5
                boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor
                if (r0 == 0) goto L_0x00c5
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor r5 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor) r5
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r3 = r5.y
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, java.lang.Integer> r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.i
                java.lang.String r0 = "JvmProtoBuf.classModuleName"
                m0.n.b.i.d(r5, r0)
                java.lang.Object r3 = i0.j.f.p.h.c1(r3, r5)
                java.lang.Integer r3 = (java.lang.Integer) r3
                if (r3 == 0) goto L_0x00a8
                int r3 = r3.intValue()
                java.lang.String r3 = r6.b(r3)
                if (r3 == 0) goto L_0x00a8
                goto L_0x00aa
            L_0x00a8:
                java.lang.String r3 = "main"
            L_0x00aa:
                java.lang.StringBuilder r5 = i0.d.a.a.a.P0(r1)
                kotlin.text.Regex r6 = m0.r.t.a.r.g.e.a
                java.lang.String r6 = "name"
                m0.n.b.i.e(r3, r6)
                kotlin.text.Regex r6 = m0.r.t.a.r.g.e.a
                java.lang.String r0 = "_"
                java.lang.String r3 = r6.b(r3, r0)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                goto L_0x00f9
            L_0x00c5:
                m0.r.t.a.r.c.p r6 = r3.getVisibility()
                m0.r.t.a.r.c.p r0 = m0.r.t.a.r.c.o.a
                boolean r6 = m0.n.b.i.a(r6, r0)
                if (r6 == 0) goto L_0x00f7
                boolean r5 = r5 instanceof m0.r.t.a.r.c.v
                if (r5 == 0) goto L_0x00f7
                m0.r.t.a.r.k.b.w.f r3 = (m0.r.t.a.r.k.b.w.f) r3
                m0.r.t.a.r.k.b.w.d r3 = r3.x2
                boolean r5 = r3 instanceof m0.r.t.a.r.e.b.e
                if (r5 == 0) goto L_0x00f7
                m0.r.t.a.r.e.b.e r3 = (m0.r.t.a.r.e.b.e) r3
                m0.r.t.a.r.j.s.b r5 = r3.c
                if (r5 == 0) goto L_0x00f7
                java.lang.StringBuilder r5 = i0.d.a.a.a.P0(r1)
                m0.r.t.a.r.g.d r3 = r3.e()
                java.lang.String r3 = r3.b()
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                goto L_0x00f9
            L_0x00f7:
                java.lang.String r3 = ""
            L_0x00f9:
                java.lang.String r5 = "()"
                java.lang.String r3 = i0.d.a.a.a.z0(r7, r3, r5, r4)
            L_0x00ff:
                r2.a = r3
                return
            L_0x0102:
                kotlin.reflect.jvm.internal.KotlinReflectionInternalError r4 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "No field signature for property: "
                r5.append(r6)
                r5.append(r3)
                java.lang.String r3 = r5.toString()
                r4.<init>(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: m0.r.t.a.c.C0244c.<init>(m0.r.t.a.r.c.c0, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature, m0.r.t.a.r.f.c.c, m0.r.t.a.r.f.c.e):void");
        }

        public String a() {
            return this.a;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    public static final class d extends c {
        public final JvmFunctionSignature.c a;
        public final JvmFunctionSignature.c b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(JvmFunctionSignature.c cVar, JvmFunctionSignature.c cVar2) {
            super((f) null);
            i.e(cVar, "getterSignature");
            this.a = cVar;
            this.b = cVar2;
        }

        public String a() {
            return this.a.a;
        }
    }

    public c(f fVar) {
    }

    public abstract String a();
}
