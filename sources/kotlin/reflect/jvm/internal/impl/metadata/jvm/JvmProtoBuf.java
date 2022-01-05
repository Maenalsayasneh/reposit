package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType;
import m0.r.t.a.r.h.a;
import m0.r.t.a.r.h.c;
import m0.r.t.a.r.h.d;
import m0.r.t.a.r.h.e;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.h.m;
import m0.r.t.a.r.h.n;

public final class JvmProtoBuf {
    public static final GeneratedMessageLite.e<ProtoBuf$Constructor, JvmMethodSignature> a;
    public static final GeneratedMessageLite.e<ProtoBuf$Function, JvmMethodSignature> b;
    public static final GeneratedMessageLite.e<ProtoBuf$Function, Integer> c;
    public static final GeneratedMessageLite.e<ProtoBuf$Property, JvmPropertySignature> d;
    public static final GeneratedMessageLite.e<ProtoBuf$Property, Integer> e;
    public static final GeneratedMessageLite.e<ProtoBuf$Type, List<ProtoBuf$Annotation>> f;
    public static final GeneratedMessageLite.e<ProtoBuf$Type, Boolean> g;
    public static final GeneratedMessageLite.e<ProtoBuf$TypeParameter, List<ProtoBuf$Annotation>> h;
    public static final GeneratedMessageLite.e<ProtoBuf$Class, Integer> i;
    public static final GeneratedMessageLite.e<ProtoBuf$Class, List<ProtoBuf$Property>> j;
    public static final GeneratedMessageLite.e<ProtoBuf$Class, Integer> k;
    public static final GeneratedMessageLite.e<ProtoBuf$Class, Integer> l;
    public static final GeneratedMessageLite.e<ProtoBuf$Package, Integer> m;
    public static final GeneratedMessageLite.e<ProtoBuf$Package, List<ProtoBuf$Property>> n;

    static {
        ProtoBuf$Constructor protoBuf$Constructor = ProtoBuf$Constructor.d;
        JvmMethodSignature jvmMethodSignature = JvmMethodSignature.c;
        WireFormat$FieldType wireFormat$FieldType = WireFormat$FieldType.MESSAGE;
        a = GeneratedMessageLite.h(protoBuf$Constructor, jvmMethodSignature, jvmMethodSignature, (Internal.b<?>) null, 100, wireFormat$FieldType, JvmMethodSignature.class);
        ProtoBuf$Function protoBuf$Function = ProtoBuf$Function.d;
        b = GeneratedMessageLite.h(protoBuf$Function, jvmMethodSignature, jvmMethodSignature, (Internal.b<?>) null, 100, wireFormat$FieldType, JvmMethodSignature.class);
        WireFormat$FieldType wireFormat$FieldType2 = WireFormat$FieldType.INT32;
        c = GeneratedMessageLite.h(protoBuf$Function, 0, (l) null, (Internal.b<?>) null, 101, wireFormat$FieldType2, Integer.class);
        ProtoBuf$Property protoBuf$Property = ProtoBuf$Property.d;
        JvmPropertySignature jvmPropertySignature = JvmPropertySignature.c;
        d = GeneratedMessageLite.h(protoBuf$Property, jvmPropertySignature, jvmPropertySignature, (Internal.b<?>) null, 100, wireFormat$FieldType, JvmPropertySignature.class);
        e = GeneratedMessageLite.h(protoBuf$Property, 0, (l) null, (Internal.b<?>) null, 101, wireFormat$FieldType2, Integer.class);
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.d;
        ProtoBuf$Annotation protoBuf$Annotation = ProtoBuf$Annotation.c;
        f = GeneratedMessageLite.a(protoBuf$Type, protoBuf$Annotation, (Internal.b<?>) null, 100, wireFormat$FieldType, false, ProtoBuf$Annotation.class);
        g = GeneratedMessageLite.h(protoBuf$Type, Boolean.FALSE, (l) null, (Internal.b<?>) null, 101, WireFormat$FieldType.BOOL, Boolean.class);
        h = GeneratedMessageLite.a(ProtoBuf$TypeParameter.d, protoBuf$Annotation, (Internal.b<?>) null, 100, wireFormat$FieldType, false, ProtoBuf$Annotation.class);
        ProtoBuf$Class protoBuf$Class = ProtoBuf$Class.d;
        i = GeneratedMessageLite.h(protoBuf$Class, 0, (l) null, (Internal.b<?>) null, 101, wireFormat$FieldType2, Integer.class);
        j = GeneratedMessageLite.a(protoBuf$Class, protoBuf$Property, (Internal.b<?>) null, 102, wireFormat$FieldType, false, ProtoBuf$Property.class);
        k = GeneratedMessageLite.h(protoBuf$Class, 0, (l) null, (Internal.b<?>) null, 103, wireFormat$FieldType2, Integer.class);
        l = GeneratedMessageLite.h(protoBuf$Class, 0, (l) null, (Internal.b<?>) null, 104, wireFormat$FieldType2, Integer.class);
        ProtoBuf$Package protoBuf$Package = ProtoBuf$Package.d;
        m = GeneratedMessageLite.h(protoBuf$Package, 0, (l) null, (Internal.b<?>) null, 101, wireFormat$FieldType2, Integer.class);
        n = GeneratedMessageLite.a(protoBuf$Package, protoBuf$Property, (Internal.b<?>) null, 102, wireFormat$FieldType, false, ProtoBuf$Property.class);
    }

    public static final class JvmFieldSignature extends GeneratedMessageLite implements m {
        public static final JvmFieldSignature c;
        public static n<JvmFieldSignature> d = new a();
        public int Y1;
        public byte Z1;
        public int a2;
        public final c q;
        public int x;
        public int y;

        public static class a extends m0.r.t.a.r.h.b<JvmFieldSignature> {
            public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(dVar, eVar, (a) null);
            }
        }

        public static final class b extends GeneratedMessageLite.b<JvmFieldSignature, b> implements m {
            public int d;
            public int q;
            public int x;

            public l build() {
                JvmFieldSignature l = l();
                if (l.g()) {
                    return l;
                }
                throw new UninitializedMessageException();
            }

            public Object clone() throws CloneNotSupportedException {
                b bVar = new b();
                bVar.m(l());
                return bVar;
            }

            public /* bridge */ /* synthetic */ a.C0267a h(d dVar, e eVar) throws IOException {
                n(dVar, eVar);
                return this;
            }

            public GeneratedMessageLite.b i() {
                b bVar = new b();
                bVar.m(l());
                return bVar;
            }

            public /* bridge */ /* synthetic */ GeneratedMessageLite.b j(GeneratedMessageLite generatedMessageLite) {
                m((JvmFieldSignature) generatedMessageLite);
                return this;
            }

            public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
                n(dVar, eVar);
                return this;
            }

            public JvmFieldSignature l() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this, (a) null);
                int i = this.d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmFieldSignature.y = this.q;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmFieldSignature.Y1 = this.x;
                jvmFieldSignature.x = i2;
                return jvmFieldSignature;
            }

            public b m(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.c) {
                    return this;
                }
                int i = jvmFieldSignature.x;
                boolean z = false;
                if ((i & 1) == 1) {
                    int i2 = jvmFieldSignature.y;
                    this.d |= 1;
                    this.q = i2;
                }
                if ((i & 2) == 2) {
                    z = true;
                }
                if (z) {
                    int i3 = jvmFieldSignature.Y1;
                    this.d = 2 | this.d;
                    this.x = i3;
                }
                this.c = this.c.c(jvmFieldSignature.q);
                return this;
            }

            public b n(d dVar, e eVar) throws IOException {
                JvmFieldSignature jvmFieldSignature;
                JvmFieldSignature jvmFieldSignature2 = null;
                try {
                    JvmFieldSignature a = JvmFieldSignature.d.a(dVar, eVar);
                    if (a != null) {
                        m(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    jvmFieldSignature = (JvmFieldSignature) e.c;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmFieldSignature2 = jvmFieldSignature;
                }
                if (jvmFieldSignature2 != null) {
                    m(jvmFieldSignature2);
                }
                throw th;
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature();
            c = jvmFieldSignature;
            jvmFieldSignature.y = 0;
            jvmFieldSignature.Y1 = 0;
        }

        public JvmFieldSignature(GeneratedMessageLite.b bVar, a aVar) {
            super(bVar);
            this.Z1 = -1;
            this.a2 = -1;
            this.q = bVar.c;
        }

        public l.a c() {
            b bVar = new b();
            bVar.m(this);
            return bVar;
        }

        public void d(CodedOutputStream codedOutputStream) throws IOException {
            e();
            if ((this.x & 1) == 1) {
                codedOutputStream.p(1, this.y);
            }
            if ((this.x & 2) == 2) {
                codedOutputStream.p(2, this.Y1);
            }
            codedOutputStream.u(this.q);
        }

        public int e() {
            int i = this.a2;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.x & 1) == 1) {
                i2 = 0 + CodedOutputStream.c(1, this.y);
            }
            if ((this.x & 2) == 2) {
                i2 += CodedOutputStream.c(2, this.Y1);
            }
            int size = this.q.size() + i2;
            this.a2 = size;
            return size;
        }

        public l.a f() {
            return new b();
        }

        public final boolean g() {
            byte b2 = this.Z1;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.Z1 = 1;
            return true;
        }

        public JvmFieldSignature() {
            this.Z1 = -1;
            this.a2 = -1;
            this.q = c.c;
        }

        public JvmFieldSignature(d dVar, e eVar, a aVar) throws InvalidProtocolBufferException {
            this.Z1 = -1;
            this.a2 = -1;
            boolean z = false;
            this.y = 0;
            this.Y1 = 0;
            c.b u = c.u();
            CodedOutputStream k = CodedOutputStream.k(u, 1);
            while (!z) {
                try {
                    int o = dVar.o();
                    if (o != 0) {
                        if (o == 8) {
                            this.x |= 1;
                            this.y = dVar.l();
                        } else if (o == 16) {
                            this.x |= 2;
                            this.Y1 = dVar.l();
                        } else if (!dVar.r(o, k)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.c = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.c = this;
                    throw invalidProtocolBufferException;
                } catch (Throwable th) {
                    try {
                        k.j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.q = u.e();
                        throw th2;
                    }
                    this.q = u.e();
                    throw th;
                }
            }
            try {
                k.j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.q = u.e();
                throw th3;
            }
            this.q = u.e();
        }
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements m {
        public static final JvmMethodSignature c;
        public static n<JvmMethodSignature> d = new a();
        public int Y1;
        public byte Z1;
        public int a2;
        public final c q;
        public int x;
        public int y;

        public static class a extends m0.r.t.a.r.h.b<JvmMethodSignature> {
            public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(dVar, eVar, (a) null);
            }
        }

        public static final class b extends GeneratedMessageLite.b<JvmMethodSignature, b> implements m {
            public int d;
            public int q;
            public int x;

            public l build() {
                JvmMethodSignature l = l();
                if (l.g()) {
                    return l;
                }
                throw new UninitializedMessageException();
            }

            public Object clone() throws CloneNotSupportedException {
                b bVar = new b();
                bVar.m(l());
                return bVar;
            }

            public /* bridge */ /* synthetic */ a.C0267a h(d dVar, e eVar) throws IOException {
                n(dVar, eVar);
                return this;
            }

            public GeneratedMessageLite.b i() {
                b bVar = new b();
                bVar.m(l());
                return bVar;
            }

            public /* bridge */ /* synthetic */ GeneratedMessageLite.b j(GeneratedMessageLite generatedMessageLite) {
                m((JvmMethodSignature) generatedMessageLite);
                return this;
            }

            public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
                n(dVar, eVar);
                return this;
            }

            public JvmMethodSignature l() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this, (a) null);
                int i = this.d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmMethodSignature.y = this.q;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmMethodSignature.Y1 = this.x;
                jvmMethodSignature.x = i2;
                return jvmMethodSignature;
            }

            public b m(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.c) {
                    return this;
                }
                if (jvmMethodSignature.l()) {
                    int i = jvmMethodSignature.y;
                    this.d |= 1;
                    this.q = i;
                }
                if (jvmMethodSignature.i()) {
                    int i2 = jvmMethodSignature.Y1;
                    this.d |= 2;
                    this.x = i2;
                }
                this.c = this.c.c(jvmMethodSignature.q);
                return this;
            }

            public b n(d dVar, e eVar) throws IOException {
                JvmMethodSignature jvmMethodSignature;
                JvmMethodSignature jvmMethodSignature2 = null;
                try {
                    JvmMethodSignature a = JvmMethodSignature.d.a(dVar, eVar);
                    if (a != null) {
                        m(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    jvmMethodSignature = (JvmMethodSignature) e.c;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmMethodSignature2 = jvmMethodSignature;
                }
                if (jvmMethodSignature2 != null) {
                    m(jvmMethodSignature2);
                }
                throw th;
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature();
            c = jvmMethodSignature;
            jvmMethodSignature.y = 0;
            jvmMethodSignature.Y1 = 0;
        }

        public JvmMethodSignature(GeneratedMessageLite.b bVar, a aVar) {
            super(bVar);
            this.Z1 = -1;
            this.a2 = -1;
            this.q = bVar.c;
        }

        public static b m(JvmMethodSignature jvmMethodSignature) {
            b bVar = new b();
            bVar.m(jvmMethodSignature);
            return bVar;
        }

        public l.a c() {
            return m(this);
        }

        public void d(CodedOutputStream codedOutputStream) throws IOException {
            e();
            if ((this.x & 1) == 1) {
                codedOutputStream.p(1, this.y);
            }
            if ((this.x & 2) == 2) {
                codedOutputStream.p(2, this.Y1);
            }
            codedOutputStream.u(this.q);
        }

        public int e() {
            int i = this.a2;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.x & 1) == 1) {
                i2 = 0 + CodedOutputStream.c(1, this.y);
            }
            if ((this.x & 2) == 2) {
                i2 += CodedOutputStream.c(2, this.Y1);
            }
            int size = this.q.size() + i2;
            this.a2 = size;
            return size;
        }

        public l.a f() {
            return new b();
        }

        public final boolean g() {
            byte b2 = this.Z1;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.Z1 = 1;
            return true;
        }

        public boolean i() {
            return (this.x & 2) == 2;
        }

        public boolean l() {
            return (this.x & 1) == 1;
        }

        public JvmMethodSignature() {
            this.Z1 = -1;
            this.a2 = -1;
            this.q = c.c;
        }

        public JvmMethodSignature(d dVar, e eVar, a aVar) throws InvalidProtocolBufferException {
            this.Z1 = -1;
            this.a2 = -1;
            boolean z = false;
            this.y = 0;
            this.Y1 = 0;
            c.b u = c.u();
            CodedOutputStream k = CodedOutputStream.k(u, 1);
            while (!z) {
                try {
                    int o = dVar.o();
                    if (o != 0) {
                        if (o == 8) {
                            this.x |= 1;
                            this.y = dVar.l();
                        } else if (o == 16) {
                            this.x |= 2;
                            this.Y1 = dVar.l();
                        } else if (!dVar.r(o, k)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.c = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.c = this;
                    throw invalidProtocolBufferException;
                } catch (Throwable th) {
                    try {
                        k.j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.q = u.e();
                        throw th2;
                    }
                    this.q = u.e();
                    throw th;
                }
            }
            try {
                k.j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.q = u.e();
                throw th3;
            }
            this.q = u.e();
        }
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements m {
        public static final JvmPropertySignature c;
        public static n<JvmPropertySignature> d = new a();
        public JvmMethodSignature Y1;
        public JvmMethodSignature Z1;
        public JvmMethodSignature a2;
        public byte b2;
        public int c2;
        public final c q;
        public int x;
        public JvmFieldSignature y;

        public static class a extends m0.r.t.a.r.h.b<JvmPropertySignature> {
            public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(dVar, eVar, (a) null);
            }
        }

        public static final class b extends GeneratedMessageLite.b<JvmPropertySignature, b> implements m {
            public JvmMethodSignature Y1;
            public int d;
            public JvmFieldSignature q = JvmFieldSignature.c;
            public JvmMethodSignature x;
            public JvmMethodSignature y;

            public b() {
                JvmMethodSignature jvmMethodSignature = JvmMethodSignature.c;
                this.x = jvmMethodSignature;
                this.y = jvmMethodSignature;
                this.Y1 = jvmMethodSignature;
            }

            public l build() {
                JvmPropertySignature l = l();
                if (l.g()) {
                    return l;
                }
                throw new UninitializedMessageException();
            }

            public Object clone() throws CloneNotSupportedException {
                b bVar = new b();
                bVar.m(l());
                return bVar;
            }

            public /* bridge */ /* synthetic */ a.C0267a h(d dVar, e eVar) throws IOException {
                n(dVar, eVar);
                return this;
            }

            public GeneratedMessageLite.b i() {
                b bVar = new b();
                bVar.m(l());
                return bVar;
            }

            public /* bridge */ /* synthetic */ GeneratedMessageLite.b j(GeneratedMessageLite generatedMessageLite) {
                m((JvmPropertySignature) generatedMessageLite);
                return this;
            }

            public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
                n(dVar, eVar);
                return this;
            }

            public JvmPropertySignature l() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this, (a) null);
                int i = this.d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                jvmPropertySignature.y = this.q;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                jvmPropertySignature.Y1 = this.x;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                jvmPropertySignature.Z1 = this.y;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                jvmPropertySignature.a2 = this.Y1;
                jvmPropertySignature.x = i2;
                return jvmPropertySignature;
            }

            public b m(JvmPropertySignature jvmPropertySignature) {
                JvmMethodSignature jvmMethodSignature;
                JvmMethodSignature jvmMethodSignature2;
                JvmMethodSignature jvmMethodSignature3;
                JvmFieldSignature jvmFieldSignature;
                if (jvmPropertySignature == JvmPropertySignature.c) {
                    return this;
                }
                boolean z = true;
                if ((jvmPropertySignature.x & 1) == 1) {
                    JvmFieldSignature jvmFieldSignature2 = jvmPropertySignature.y;
                    if ((this.d & 1) != 1 || (jvmFieldSignature = this.q) == JvmFieldSignature.c) {
                        this.q = jvmFieldSignature2;
                    } else {
                        JvmFieldSignature.b bVar = new JvmFieldSignature.b();
                        bVar.m(jvmFieldSignature);
                        bVar.m(jvmFieldSignature2);
                        this.q = bVar.l();
                    }
                    this.d |= 1;
                }
                if ((jvmPropertySignature.x & 2) != 2) {
                    z = false;
                }
                if (z) {
                    JvmMethodSignature jvmMethodSignature4 = jvmPropertySignature.Y1;
                    if ((this.d & 2) != 2 || (jvmMethodSignature3 = this.x) == JvmMethodSignature.c) {
                        this.x = jvmMethodSignature4;
                    } else {
                        JvmMethodSignature.b m = JvmMethodSignature.m(jvmMethodSignature3);
                        m.m(jvmMethodSignature4);
                        this.x = m.l();
                    }
                    this.d |= 2;
                }
                if (jvmPropertySignature.i()) {
                    JvmMethodSignature jvmMethodSignature5 = jvmPropertySignature.Z1;
                    if ((this.d & 4) != 4 || (jvmMethodSignature2 = this.y) == JvmMethodSignature.c) {
                        this.y = jvmMethodSignature5;
                    } else {
                        JvmMethodSignature.b m2 = JvmMethodSignature.m(jvmMethodSignature2);
                        m2.m(jvmMethodSignature5);
                        this.y = m2.l();
                    }
                    this.d |= 4;
                }
                if (jvmPropertySignature.l()) {
                    JvmMethodSignature jvmMethodSignature6 = jvmPropertySignature.a2;
                    if ((this.d & 8) != 8 || (jvmMethodSignature = this.Y1) == JvmMethodSignature.c) {
                        this.Y1 = jvmMethodSignature6;
                    } else {
                        JvmMethodSignature.b m3 = JvmMethodSignature.m(jvmMethodSignature);
                        m3.m(jvmMethodSignature6);
                        this.Y1 = m3.l();
                    }
                    this.d |= 8;
                }
                this.c = this.c.c(jvmPropertySignature.q);
                return this;
            }

            public b n(d dVar, e eVar) throws IOException {
                JvmPropertySignature jvmPropertySignature;
                JvmPropertySignature jvmPropertySignature2 = null;
                try {
                    JvmPropertySignature a = JvmPropertySignature.d.a(dVar, eVar);
                    if (a != null) {
                        m(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    jvmPropertySignature = (JvmPropertySignature) e.c;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmPropertySignature2 = jvmPropertySignature;
                }
                if (jvmPropertySignature2 != null) {
                    m(jvmPropertySignature2);
                }
                throw th;
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature();
            c = jvmPropertySignature;
            jvmPropertySignature.y = JvmFieldSignature.c;
            JvmMethodSignature jvmMethodSignature = JvmMethodSignature.c;
            jvmPropertySignature.Y1 = jvmMethodSignature;
            jvmPropertySignature.Z1 = jvmMethodSignature;
            jvmPropertySignature.a2 = jvmMethodSignature;
        }

        public JvmPropertySignature(GeneratedMessageLite.b bVar, a aVar) {
            super(bVar);
            this.b2 = -1;
            this.c2 = -1;
            this.q = bVar.c;
        }

        public l.a c() {
            b bVar = new b();
            bVar.m(this);
            return bVar;
        }

        public void d(CodedOutputStream codedOutputStream) throws IOException {
            e();
            if ((this.x & 1) == 1) {
                codedOutputStream.r(1, this.y);
            }
            if ((this.x & 2) == 2) {
                codedOutputStream.r(2, this.Y1);
            }
            if ((this.x & 4) == 4) {
                codedOutputStream.r(3, this.Z1);
            }
            if ((this.x & 8) == 8) {
                codedOutputStream.r(4, this.a2);
            }
            codedOutputStream.u(this.q);
        }

        public int e() {
            int i = this.c2;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.x & 1) == 1) {
                i2 = 0 + CodedOutputStream.e(1, this.y);
            }
            if ((this.x & 2) == 2) {
                i2 += CodedOutputStream.e(2, this.Y1);
            }
            if ((this.x & 4) == 4) {
                i2 += CodedOutputStream.e(3, this.Z1);
            }
            if ((this.x & 8) == 8) {
                i2 += CodedOutputStream.e(4, this.a2);
            }
            int size = this.q.size() + i2;
            this.c2 = size;
            return size;
        }

        public l.a f() {
            return new b();
        }

        public final boolean g() {
            byte b3 = this.b2;
            if (b3 == 1) {
                return true;
            }
            if (b3 == 0) {
                return false;
            }
            this.b2 = 1;
            return true;
        }

        public boolean i() {
            return (this.x & 4) == 4;
        }

        public boolean l() {
            return (this.x & 8) == 8;
        }

        public JvmPropertySignature() {
            this.b2 = -1;
            this.c2 = -1;
            this.q = c.c;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b} */
        /* JADX WARNING: type inference failed for: r5v0 */
        /* JADX WARNING: type inference failed for: r5v9 */
        /* JADX WARNING: type inference failed for: r5v10 */
        /* JADX WARNING: type inference failed for: r5v11 */
        /* JADX WARNING: type inference failed for: r5v12 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public JvmPropertySignature(m0.r.t.a.r.h.d r7, m0.r.t.a.r.h.e r8, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.a r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                r6 = this;
                r6.<init>()
                r9 = -1
                r6.b2 = r9
                r6.c2 = r9
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r9 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.c
                r6.y = r9
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r9 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.c
                r6.Y1 = r9
                r6.Z1 = r9
                r6.a2 = r9
                m0.r.t.a.r.h.c$b r9 = m0.r.t.a.r.h.c.u()
                r0 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.k(r9, r0)
                r2 = 0
            L_0x001e:
                if (r2 != 0) goto L_0x0116
                int r3 = r7.o()     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                if (r3 == 0) goto L_0x00ed
                r4 = 10
                r5 = 0
                if (r3 == r4) goto L_0x00bf
                r4 = 18
                if (r3 == r4) goto L_0x0094
                r4 = 26
                if (r3 == r4) goto L_0x006a
                r4 = 34
                if (r3 == r4) goto L_0x003f
                boolean r3 = r7.r(r3, r1)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                if (r3 != 0) goto L_0x001e
                goto L_0x00ed
            L_0x003f:
                int r3 = r6.x     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r4 = 8
                r3 = r3 & r4
                if (r3 != r4) goto L_0x004f
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = r6.a2     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                java.util.Objects.requireNonNull(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.m(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
            L_0x004f:
                m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.d     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                m0.r.t.a.r.h.l r3 = r7.h(r3, r8)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r6.a2 = r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                if (r5 == 0) goto L_0x0064
                r5.m(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = r5.l()     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r6.a2 = r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
            L_0x0064:
                int r3 = r6.x     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r3 = r3 | r4
                r6.x = r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                goto L_0x001e
            L_0x006a:
                int r3 = r6.x     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r4 = 4
                r3 = r3 & r4
                if (r3 != r4) goto L_0x0079
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = r6.Z1     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                java.util.Objects.requireNonNull(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.m(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
            L_0x0079:
                m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.d     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                m0.r.t.a.r.h.l r3 = r7.h(r3, r8)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r6.Z1 = r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                if (r5 == 0) goto L_0x008e
                r5.m(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = r5.l()     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r6.Z1 = r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
            L_0x008e:
                int r3 = r6.x     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r3 = r3 | r4
                r6.x = r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                goto L_0x001e
            L_0x0094:
                int r3 = r6.x     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r4 = 2
                r3 = r3 & r4
                if (r3 != r4) goto L_0x00a3
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = r6.Y1     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                java.util.Objects.requireNonNull(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b r5 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.m(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
            L_0x00a3:
                m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.d     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                m0.r.t.a.r.h.l r3 = r7.h(r3, r8)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r6.Y1 = r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                if (r5 == 0) goto L_0x00b8
                r5.m(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = r5.l()     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r6.Y1 = r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
            L_0x00b8:
                int r3 = r6.x     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r3 = r3 | r4
                r6.x = r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                goto L_0x001e
            L_0x00bf:
                int r3 = r6.x     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r3 = r3 & r0
                if (r3 != r0) goto L_0x00d1
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r3 = r6.y     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                java.util.Objects.requireNonNull(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b r5 = new kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r5.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r5.m(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
            L_0x00d1:
                m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature> r3 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.d     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                m0.r.t.a.r.h.l r3 = r7.h(r3, r8)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r6.y = r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                if (r5 == 0) goto L_0x00e6
                r5.m(r3)     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r3 = r5.l()     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r6.y = r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
            L_0x00e6:
                int r3 = r6.x     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                r3 = r3 | r0
                r6.x = r3     // Catch:{ InvalidProtocolBufferException -> 0x00ff, IOException -> 0x00f2 }
                goto L_0x001e
            L_0x00ed:
                r2 = r0
                goto L_0x001e
            L_0x00f0:
                r7 = move-exception
                goto L_0x0103
            L_0x00f2:
                r7 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r8 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00f0 }
                java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x00f0 }
                r8.<init>(r7)     // Catch:{ all -> 0x00f0 }
                r8.c = r6     // Catch:{ all -> 0x00f0 }
                throw r8     // Catch:{ all -> 0x00f0 }
            L_0x00ff:
                r7 = move-exception
                r7.c = r6     // Catch:{ all -> 0x00f0 }
                throw r7     // Catch:{ all -> 0x00f0 }
            L_0x0103:
                r1.j()     // Catch:{ IOException -> 0x010f, all -> 0x0107 }
                goto L_0x010f
            L_0x0107:
                r7 = move-exception
                m0.r.t.a.r.h.c r8 = r9.e()
                r6.q = r8
                throw r7
            L_0x010f:
                m0.r.t.a.r.h.c r8 = r9.e()
                r6.q = r8
                throw r7
            L_0x0116:
                r1.j()     // Catch:{ IOException -> 0x0122, all -> 0x011a }
                goto L_0x0122
            L_0x011a:
                r7 = move-exception
                m0.r.t.a.r.h.c r8 = r9.e()
                r6.q = r8
                throw r7
            L_0x0122:
                m0.r.t.a.r.h.c r7 = r9.e()
                r6.q = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.<init>(m0.r.t.a.r.h.d, m0.r.t.a.r.h.e, kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$a):void");
        }
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements m {
        public static final StringTableTypes c;
        public static n<StringTableTypes> d = new a();
        public int Y1;
        public byte Z1;
        public int a2;
        public final c q;
        public List<Record> x;
        public List<Integer> y;

        public static class a extends m0.r.t.a.r.h.b<StringTableTypes> {
            public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
                return new StringTableTypes(dVar, eVar, (a) null);
            }
        }

        public static final class b extends GeneratedMessageLite.b<StringTableTypes, b> implements m {
            public int d;
            public List<Record> q = Collections.emptyList();
            public List<Integer> x = Collections.emptyList();

            public l build() {
                StringTableTypes l = l();
                if (l.g()) {
                    return l;
                }
                throw new UninitializedMessageException();
            }

            public Object clone() throws CloneNotSupportedException {
                b bVar = new b();
                bVar.m(l());
                return bVar;
            }

            public /* bridge */ /* synthetic */ a.C0267a h(d dVar, e eVar) throws IOException {
                n(dVar, eVar);
                return this;
            }

            public GeneratedMessageLite.b i() {
                b bVar = new b();
                bVar.m(l());
                return bVar;
            }

            public /* bridge */ /* synthetic */ GeneratedMessageLite.b j(GeneratedMessageLite generatedMessageLite) {
                m((StringTableTypes) generatedMessageLite);
                return this;
            }

            public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
                n(dVar, eVar);
                return this;
            }

            public StringTableTypes l() {
                StringTableTypes stringTableTypes = new StringTableTypes(this, (a) null);
                if ((this.d & 1) == 1) {
                    this.q = Collections.unmodifiableList(this.q);
                    this.d &= -2;
                }
                stringTableTypes.x = this.q;
                if ((this.d & 2) == 2) {
                    this.x = Collections.unmodifiableList(this.x);
                    this.d &= -3;
                }
                stringTableTypes.y = this.x;
                return stringTableTypes;
            }

            public b m(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.c) {
                    return this;
                }
                if (!stringTableTypes.x.isEmpty()) {
                    if (this.q.isEmpty()) {
                        this.q = stringTableTypes.x;
                        this.d &= -2;
                    } else {
                        if ((this.d & 1) != 1) {
                            this.q = new ArrayList(this.q);
                            this.d |= 1;
                        }
                        this.q.addAll(stringTableTypes.x);
                    }
                }
                if (!stringTableTypes.y.isEmpty()) {
                    if (this.x.isEmpty()) {
                        this.x = stringTableTypes.y;
                        this.d &= -3;
                    } else {
                        if ((this.d & 2) != 2) {
                            this.x = new ArrayList(this.x);
                            this.d |= 2;
                        }
                        this.x.addAll(stringTableTypes.y);
                    }
                }
                this.c = this.c.c(stringTableTypes.q);
                return this;
            }

            public b n(d dVar, e eVar) throws IOException {
                StringTableTypes stringTableTypes;
                StringTableTypes stringTableTypes2 = null;
                try {
                    StringTableTypes a = StringTableTypes.d.a(dVar, eVar);
                    if (a != null) {
                        m(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    stringTableTypes = (StringTableTypes) e.c;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    stringTableTypes2 = stringTableTypes;
                }
                if (stringTableTypes2 != null) {
                    m(stringTableTypes2);
                }
                throw th;
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes();
            c = stringTableTypes;
            stringTableTypes.x = Collections.emptyList();
            stringTableTypes.y = Collections.emptyList();
        }

        public StringTableTypes(GeneratedMessageLite.b bVar, a aVar) {
            super(bVar);
            this.Y1 = -1;
            this.Z1 = -1;
            this.a2 = -1;
            this.q = bVar.c;
        }

        public l.a c() {
            b bVar = new b();
            bVar.m(this);
            return bVar;
        }

        public void d(CodedOutputStream codedOutputStream) throws IOException {
            e();
            for (int i = 0; i < this.x.size(); i++) {
                codedOutputStream.r(1, this.x.get(i));
            }
            if (this.y.size() > 0) {
                codedOutputStream.y(42);
                codedOutputStream.y(this.Y1);
            }
            for (int i2 = 0; i2 < this.y.size(); i2++) {
                codedOutputStream.q(this.y.get(i2).intValue());
            }
            codedOutputStream.u(this.q);
        }

        public int e() {
            int i = this.a2;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.x.size(); i3++) {
                i2 += CodedOutputStream.e(1, this.x.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.y.size(); i5++) {
                i4 += CodedOutputStream.d(this.y.get(i5).intValue());
            }
            int i6 = i2 + i4;
            if (!this.y.isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.d(i4);
            }
            this.Y1 = i4;
            int size = this.q.size() + i6;
            this.a2 = size;
            return size;
        }

        public l.a f() {
            return new b();
        }

        public final boolean g() {
            byte b2 = this.Z1;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.Z1 = 1;
            return true;
        }

        public static final class Record extends GeneratedMessageLite implements m {
            public static final Record c;
            public static n<Record> d = new a();
            public int Y1;
            public Object Z1;
            public Operation a2;
            public List<Integer> b2;
            public int c2;
            public List<Integer> d2;
            public int e2;
            public byte f2;
            public int g2;
            public final c q;
            public int x;
            public int y;

            public enum Operation implements Internal.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                
                private static Internal.b<Operation> internalValueMap;
                private final int value;

                public static class a implements Internal.b<Operation> {
                    public Internal.a a(int i) {
                        return Operation.valueOf(i);
                    }
                }

                /* access modifiers changed from: public */
                static {
                    internalValueMap = new a();
                }

                private Operation(int i, int i2) {
                    this.value = i2;
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Operation valueOf(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            public static class a extends m0.r.t.a.r.h.b<Record> {
                public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
                    return new Record(dVar, eVar, (a) null);
                }
            }

            public static final class b extends GeneratedMessageLite.b<Record, b> implements m {
                public Operation Y1 = Operation.NONE;
                public List<Integer> Z1 = Collections.emptyList();
                public List<Integer> a2 = Collections.emptyList();
                public int d;
                public int q = 1;
                public int x;
                public Object y = "";

                public l build() {
                    Record l = l();
                    if (l.g()) {
                        return l;
                    }
                    throw new UninitializedMessageException();
                }

                public Object clone() throws CloneNotSupportedException {
                    b bVar = new b();
                    bVar.m(l());
                    return bVar;
                }

                public /* bridge */ /* synthetic */ a.C0267a h(d dVar, e eVar) throws IOException {
                    n(dVar, eVar);
                    return this;
                }

                public GeneratedMessageLite.b i() {
                    b bVar = new b();
                    bVar.m(l());
                    return bVar;
                }

                public /* bridge */ /* synthetic */ GeneratedMessageLite.b j(GeneratedMessageLite generatedMessageLite) {
                    m((Record) generatedMessageLite);
                    return this;
                }

                public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
                    n(dVar, eVar);
                    return this;
                }

                public Record l() {
                    Record record = new Record(this, (a) null);
                    int i = this.d;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    record.y = this.q;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    record.Y1 = this.x;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    record.Z1 = this.y;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    record.a2 = this.Y1;
                    if ((i & 16) == 16) {
                        this.Z1 = Collections.unmodifiableList(this.Z1);
                        this.d &= -17;
                    }
                    record.b2 = this.Z1;
                    if ((this.d & 32) == 32) {
                        this.a2 = Collections.unmodifiableList(this.a2);
                        this.d &= -33;
                    }
                    record.d2 = this.a2;
                    record.x = i2;
                    return record;
                }

                public b m(Record record) {
                    if (record == Record.c) {
                        return this;
                    }
                    int i = record.x;
                    boolean z = false;
                    if ((i & 1) == 1) {
                        int i2 = record.y;
                        this.d |= 1;
                        this.q = i2;
                    }
                    if ((i & 2) == 2) {
                        int i3 = record.Y1;
                        this.d = 2 | this.d;
                        this.x = i3;
                    }
                    if ((i & 4) == 4) {
                        this.d |= 4;
                        this.y = record.Z1;
                    }
                    if ((i & 8) == 8) {
                        z = true;
                    }
                    if (z) {
                        Operation operation = record.a2;
                        Objects.requireNonNull(operation);
                        this.d = 8 | this.d;
                        this.Y1 = operation;
                    }
                    if (!record.b2.isEmpty()) {
                        if (this.Z1.isEmpty()) {
                            this.Z1 = record.b2;
                            this.d &= -17;
                        } else {
                            if ((this.d & 16) != 16) {
                                this.Z1 = new ArrayList(this.Z1);
                                this.d |= 16;
                            }
                            this.Z1.addAll(record.b2);
                        }
                    }
                    if (!record.d2.isEmpty()) {
                        if (this.a2.isEmpty()) {
                            this.a2 = record.d2;
                            this.d &= -33;
                        } else {
                            if ((this.d & 32) != 32) {
                                this.a2 = new ArrayList(this.a2);
                                this.d |= 32;
                            }
                            this.a2.addAll(record.d2);
                        }
                    }
                    this.c = this.c.c(record.q);
                    return this;
                }

                public b n(d dVar, e eVar) throws IOException {
                    Record record;
                    Record record2 = null;
                    try {
                        Record a = Record.d.a(dVar, eVar);
                        if (a != null) {
                            m(a);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        record = (Record) e.c;
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        record2 = record;
                    }
                    if (record2 != null) {
                        m(record2);
                    }
                    throw th;
                }
            }

            static {
                Record record = new Record();
                c = record;
                record.i();
            }

            public Record(GeneratedMessageLite.b bVar, a aVar) {
                super(bVar);
                this.c2 = -1;
                this.e2 = -1;
                this.f2 = -1;
                this.g2 = -1;
                this.q = bVar.c;
            }

            public l.a c() {
                b bVar = new b();
                bVar.m(this);
                return bVar;
            }

            public void d(CodedOutputStream codedOutputStream) throws IOException {
                c cVar;
                e();
                if ((this.x & 1) == 1) {
                    codedOutputStream.p(1, this.y);
                }
                if ((this.x & 2) == 2) {
                    codedOutputStream.p(2, this.Y1);
                }
                if ((this.x & 8) == 8) {
                    codedOutputStream.n(3, this.a2.getNumber());
                }
                if (this.b2.size() > 0) {
                    codedOutputStream.y(34);
                    codedOutputStream.y(this.c2);
                }
                for (int i = 0; i < this.b2.size(); i++) {
                    codedOutputStream.q(this.b2.get(i).intValue());
                }
                if (this.d2.size() > 0) {
                    codedOutputStream.y(42);
                    codedOutputStream.y(this.e2);
                }
                for (int i2 = 0; i2 < this.d2.size(); i2++) {
                    codedOutputStream.q(this.d2.get(i2).intValue());
                }
                if ((this.x & 4) == 4) {
                    Object obj = this.Z1;
                    if (obj instanceof String) {
                        cVar = c.e((String) obj);
                        this.Z1 = cVar;
                    } else {
                        cVar = (c) obj;
                    }
                    codedOutputStream.y(50);
                    codedOutputStream.m(cVar);
                }
                codedOutputStream.u(this.q);
            }

            public int e() {
                c cVar;
                int i = this.g2;
                if (i != -1) {
                    return i;
                }
                int c3 = (this.x & 1) == 1 ? CodedOutputStream.c(1, this.y) + 0 : 0;
                if ((this.x & 2) == 2) {
                    c3 += CodedOutputStream.c(2, this.Y1);
                }
                if ((this.x & 8) == 8) {
                    c3 += CodedOutputStream.b(3, this.a2.getNumber());
                }
                int i2 = 0;
                for (int i3 = 0; i3 < this.b2.size(); i3++) {
                    i2 += CodedOutputStream.d(this.b2.get(i3).intValue());
                }
                int i4 = c3 + i2;
                if (!this.b2.isEmpty()) {
                    i4 = i4 + 1 + CodedOutputStream.d(i2);
                }
                this.c2 = i2;
                int i5 = 0;
                for (int i6 = 0; i6 < this.d2.size(); i6++) {
                    i5 += CodedOutputStream.d(this.d2.get(i6).intValue());
                }
                int i7 = i4 + i5;
                if (!this.d2.isEmpty()) {
                    i7 = i7 + 1 + CodedOutputStream.d(i5);
                }
                this.e2 = i5;
                if ((this.x & 4) == 4) {
                    Object obj = this.Z1;
                    if (obj instanceof String) {
                        cVar = c.e((String) obj);
                        this.Z1 = cVar;
                    } else {
                        cVar = (c) obj;
                    }
                    i7 += CodedOutputStream.a(cVar) + CodedOutputStream.i(6);
                }
                int size = this.q.size() + i7;
                this.g2 = size;
                return size;
            }

            public l.a f() {
                return new b();
            }

            public final boolean g() {
                byte b3 = this.f2;
                if (b3 == 1) {
                    return true;
                }
                if (b3 == 0) {
                    return false;
                }
                this.f2 = 1;
                return true;
            }

            public final void i() {
                this.y = 1;
                this.Y1 = 0;
                this.Z1 = "";
                this.a2 = Operation.NONE;
                this.b2 = Collections.emptyList();
                this.d2 = Collections.emptyList();
            }

            public Record() {
                this.c2 = -1;
                this.e2 = -1;
                this.f2 = -1;
                this.g2 = -1;
                this.q = c.c;
            }

            public Record(d dVar, e eVar, a aVar) throws InvalidProtocolBufferException {
                this.c2 = -1;
                this.e2 = -1;
                this.f2 = -1;
                this.g2 = -1;
                i();
                c.b u = c.u();
                CodedOutputStream k = CodedOutputStream.k(u, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int o = dVar.o();
                        if (o != 0) {
                            if (o == 8) {
                                this.x |= 1;
                                this.y = dVar.l();
                            } else if (o == 16) {
                                this.x |= 2;
                                this.Y1 = dVar.l();
                            } else if (o == 24) {
                                int l = dVar.l();
                                Operation valueOf = Operation.valueOf(l);
                                if (valueOf == null) {
                                    k.y(o);
                                    k.y(l);
                                } else {
                                    this.x |= 8;
                                    this.a2 = valueOf;
                                }
                            } else if (o == 32) {
                                if (!(z2 & true)) {
                                    this.b2 = new ArrayList();
                                    z2 |= true;
                                }
                                this.b2.add(Integer.valueOf(dVar.l()));
                            } else if (o == 34) {
                                int d3 = dVar.d(dVar.l());
                                if (!(z2 & true) && dVar.b() > 0) {
                                    this.b2 = new ArrayList();
                                    z2 |= true;
                                }
                                while (dVar.b() > 0) {
                                    this.b2.add(Integer.valueOf(dVar.l()));
                                }
                                dVar.i = d3;
                                dVar.p();
                            } else if (o == 40) {
                                if (!(z2 & true)) {
                                    this.d2 = new ArrayList();
                                    z2 |= true;
                                }
                                this.d2.add(Integer.valueOf(dVar.l()));
                            } else if (o == 42) {
                                int d4 = dVar.d(dVar.l());
                                if (!(z2 & true) && dVar.b() > 0) {
                                    this.d2 = new ArrayList();
                                    z2 |= true;
                                }
                                while (dVar.b() > 0) {
                                    this.d2.add(Integer.valueOf(dVar.l()));
                                }
                                dVar.i = d4;
                                dVar.p();
                            } else if (o == 50) {
                                c f = dVar.f();
                                this.x |= 4;
                                this.Z1 = f;
                            } else if (!dVar.r(o, k)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.c = this;
                        throw e;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                        invalidProtocolBufferException.c = this;
                        throw invalidProtocolBufferException;
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.b2 = Collections.unmodifiableList(this.b2);
                        }
                        if (z2 & true) {
                            this.d2 = Collections.unmodifiableList(this.d2);
                        }
                        try {
                            k.j();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.q = u.e();
                            throw th2;
                        }
                        this.q = u.e();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.b2 = Collections.unmodifiableList(this.b2);
                }
                if (z2 & true) {
                    this.d2 = Collections.unmodifiableList(this.d2);
                }
                try {
                    k.j();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.q = u.e();
                    throw th3;
                }
                this.q = u.e();
            }
        }

        public StringTableTypes() {
            this.Y1 = -1;
            this.Z1 = -1;
            this.a2 = -1;
            this.q = c.c;
        }

        public StringTableTypes(d dVar, e eVar, a aVar) throws InvalidProtocolBufferException {
            this.Y1 = -1;
            this.Z1 = -1;
            this.a2 = -1;
            this.x = Collections.emptyList();
            this.y = Collections.emptyList();
            c.b u = c.u();
            CodedOutputStream k = CodedOutputStream.k(u, 1);
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                try {
                    int o = dVar.o();
                    if (o != 0) {
                        if (o == 10) {
                            if (!z2 || !true) {
                                this.x = new ArrayList();
                                z2 |= true;
                            }
                            this.x.add(dVar.h(Record.d, eVar));
                        } else if (o == 40) {
                            if (!(z2 & true)) {
                                this.y = new ArrayList();
                                z2 |= true;
                            }
                            this.y.add(Integer.valueOf(dVar.l()));
                        } else if (o == 42) {
                            int d2 = dVar.d(dVar.l());
                            if (!(z2 & true) && dVar.b() > 0) {
                                this.y = new ArrayList();
                                z2 |= true;
                            }
                            while (dVar.b() > 0) {
                                this.y.add(Integer.valueOf(dVar.l()));
                            }
                            dVar.i = d2;
                            dVar.p();
                        } else if (!dVar.r(o, k)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.c = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.c = this;
                    throw invalidProtocolBufferException;
                } catch (Throwable th) {
                    if (z2 && true) {
                        this.x = Collections.unmodifiableList(this.x);
                    }
                    if (z2 & true) {
                        this.y = Collections.unmodifiableList(this.y);
                    }
                    try {
                        k.j();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.q = u.e();
                        throw th2;
                    }
                    this.q = u.e();
                    throw th;
                }
            }
            if (z2 && true) {
                this.x = Collections.unmodifiableList(this.x);
            }
            if (z2 & true) {
                this.y = Collections.unmodifiableList(this.y);
            }
            try {
                k.j();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.q = u.e();
                throw th3;
            }
            this.q = u.e();
        }
    }
}
