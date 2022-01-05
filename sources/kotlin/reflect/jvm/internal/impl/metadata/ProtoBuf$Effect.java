package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import m0.r.t.a.r.h.a;
import m0.r.t.a.r.h.c;
import m0.r.t.a.r.h.d;
import m0.r.t.a.r.h.e;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.h.m;
import m0.r.t.a.r.h.n;

public final class ProtoBuf$Effect extends GeneratedMessageLite implements m {
    public static final ProtoBuf$Effect c;
    public static n<ProtoBuf$Effect> d = new a();
    public List<ProtoBuf$Expression> Y1;
    public ProtoBuf$Expression Z1;
    public InvocationKind a2;
    public byte b2;
    public int c2;
    public final c q;
    public int x;
    public EffectType y;

    public enum EffectType implements Internal.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        
        private static Internal.b<EffectType> internalValueMap;
        private final int value;

        public static class a implements Internal.b<EffectType> {
            public Internal.a a(int i) {
                return EffectType.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a();
        }

        private EffectType(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static EffectType valueOf(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }
    }

    public enum InvocationKind implements Internal.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        
        private static Internal.b<InvocationKind> internalValueMap;
        private final int value;

        public static class a implements Internal.b<InvocationKind> {
            public Internal.a a(int i) {
                return InvocationKind.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a();
        }

        private InvocationKind(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static InvocationKind valueOf(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }
    }

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$Effect> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Effect(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.b<ProtoBuf$Effect, b> implements m {
        public InvocationKind Y1 = InvocationKind.AT_MOST_ONCE;
        public int d;
        public EffectType q = EffectType.RETURNS_CONSTANT;
        public List<ProtoBuf$Expression> x = Collections.emptyList();
        public ProtoBuf$Expression y = ProtoBuf$Expression.c;

        public l build() {
            ProtoBuf$Effect l = l();
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
            m((ProtoBuf$Effect) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            n(dVar, eVar);
            return this;
        }

        public ProtoBuf$Effect l() {
            ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(this, (m0.r.t.a.r.f.a) null);
            int i = this.d;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$Effect.y = this.q;
            if ((i & 2) == 2) {
                this.x = Collections.unmodifiableList(this.x);
                this.d &= -3;
            }
            protoBuf$Effect.Y1 = this.x;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            protoBuf$Effect.Z1 = this.y;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            protoBuf$Effect.a2 = this.Y1;
            protoBuf$Effect.x = i2;
            return protoBuf$Effect;
        }

        public b m(ProtoBuf$Effect protoBuf$Effect) {
            ProtoBuf$Expression protoBuf$Expression;
            if (protoBuf$Effect == ProtoBuf$Effect.c) {
                return this;
            }
            boolean z = true;
            if ((protoBuf$Effect.x & 1) == 1) {
                EffectType effectType = protoBuf$Effect.y;
                Objects.requireNonNull(effectType);
                this.d |= 1;
                this.q = effectType;
            }
            if (!protoBuf$Effect.Y1.isEmpty()) {
                if (this.x.isEmpty()) {
                    this.x = protoBuf$Effect.Y1;
                    this.d &= -3;
                } else {
                    if ((this.d & 2) != 2) {
                        this.x = new ArrayList(this.x);
                        this.d |= 2;
                    }
                    this.x.addAll(protoBuf$Effect.Y1);
                }
            }
            if ((protoBuf$Effect.x & 2) == 2) {
                ProtoBuf$Expression protoBuf$Expression2 = protoBuf$Effect.Z1;
                if ((this.d & 4) != 4 || (protoBuf$Expression = this.y) == ProtoBuf$Expression.c) {
                    this.y = protoBuf$Expression2;
                } else {
                    ProtoBuf$Expression.b bVar = new ProtoBuf$Expression.b();
                    bVar.m(protoBuf$Expression);
                    bVar.m(protoBuf$Expression2);
                    this.y = bVar.l();
                }
                this.d |= 4;
            }
            if ((protoBuf$Effect.x & 4) != 4) {
                z = false;
            }
            if (z) {
                InvocationKind invocationKind = protoBuf$Effect.a2;
                Objects.requireNonNull(invocationKind);
                this.d |= 8;
                this.Y1 = invocationKind;
            }
            this.c = this.c.c(protoBuf$Effect.q);
            return this;
        }

        public b n(d dVar, e eVar) throws IOException {
            ProtoBuf$Effect protoBuf$Effect;
            ProtoBuf$Effect protoBuf$Effect2 = null;
            try {
                ProtoBuf$Effect a = ProtoBuf$Effect.d.a(dVar, eVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Effect = (ProtoBuf$Effect) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Effect2 = protoBuf$Effect;
            }
            if (protoBuf$Effect2 != null) {
                m(protoBuf$Effect2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect();
        c = protoBuf$Effect;
        protoBuf$Effect.y = EffectType.RETURNS_CONSTANT;
        protoBuf$Effect.Y1 = Collections.emptyList();
        protoBuf$Effect.Z1 = ProtoBuf$Expression.c;
        protoBuf$Effect.a2 = InvocationKind.AT_MOST_ONCE;
    }

    public ProtoBuf$Effect(GeneratedMessageLite.b bVar, m0.r.t.a.r.f.a aVar) {
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
            codedOutputStream.n(1, this.y.getNumber());
        }
        for (int i = 0; i < this.Y1.size(); i++) {
            codedOutputStream.r(2, this.Y1.get(i));
        }
        if ((this.x & 2) == 2) {
            codedOutputStream.r(3, this.Z1);
        }
        if ((this.x & 4) == 4) {
            codedOutputStream.n(4, this.a2.getNumber());
        }
        codedOutputStream.u(this.q);
    }

    public int e() {
        int i = this.c2;
        if (i != -1) {
            return i;
        }
        int b3 = (this.x & 1) == 1 ? CodedOutputStream.b(1, this.y.getNumber()) + 0 : 0;
        for (int i2 = 0; i2 < this.Y1.size(); i2++) {
            b3 += CodedOutputStream.e(2, this.Y1.get(i2));
        }
        if ((this.x & 2) == 2) {
            b3 += CodedOutputStream.e(3, this.Z1);
        }
        if ((this.x & 4) == 4) {
            b3 += CodedOutputStream.b(4, this.a2.getNumber());
        }
        int size = this.q.size() + b3;
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
        for (int i = 0; i < this.Y1.size(); i++) {
            if (!this.Y1.get(i).g()) {
                this.b2 = 0;
                return false;
            }
        }
        if (!((this.x & 2) == 2) || this.Z1.g()) {
            this.b2 = 1;
            return true;
        }
        this.b2 = 0;
        return false;
    }

    public ProtoBuf$Effect() {
        this.b2 = -1;
        this.c2 = -1;
        this.q = c.c;
    }

    public ProtoBuf$Effect(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.b2 = -1;
        this.c2 = -1;
        this.y = EffectType.RETURNS_CONSTANT;
        this.Y1 = Collections.emptyList();
        this.Z1 = ProtoBuf$Expression.c;
        this.a2 = InvocationKind.AT_MOST_ONCE;
        c.b u = c.u();
        CodedOutputStream k = CodedOutputStream.k(u, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.o();
                if (o != 0) {
                    if (o == 8) {
                        int l = dVar.l();
                        EffectType valueOf = EffectType.valueOf(l);
                        if (valueOf == null) {
                            k.y(o);
                            k.y(l);
                        } else {
                            this.x |= 1;
                            this.y = valueOf;
                        }
                    } else if (o == 18) {
                        if (!(z2 & true)) {
                            this.Y1 = new ArrayList();
                            z2 |= true;
                        }
                        this.Y1.add(dVar.h(ProtoBuf$Expression.d, eVar));
                    } else if (o == 26) {
                        ProtoBuf$Expression.b bVar = null;
                        if ((this.x & 2) == 2) {
                            ProtoBuf$Expression protoBuf$Expression = this.Z1;
                            Objects.requireNonNull(protoBuf$Expression);
                            ProtoBuf$Expression.b bVar2 = new ProtoBuf$Expression.b();
                            bVar2.m(protoBuf$Expression);
                            bVar = bVar2;
                        }
                        ProtoBuf$Expression protoBuf$Expression2 = (ProtoBuf$Expression) dVar.h(ProtoBuf$Expression.d, eVar);
                        this.Z1 = protoBuf$Expression2;
                        if (bVar != null) {
                            bVar.m(protoBuf$Expression2);
                            this.Z1 = bVar.l();
                        }
                        this.x |= 2;
                    } else if (o == 32) {
                        int l2 = dVar.l();
                        InvocationKind valueOf2 = InvocationKind.valueOf(l2);
                        if (valueOf2 == null) {
                            k.y(o);
                            k.y(l2);
                        } else {
                            this.x |= 4;
                            this.a2 = valueOf2;
                        }
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
                if (z2 & true) {
                    this.Y1 = Collections.unmodifiableList(this.Y1);
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
            this.Y1 = Collections.unmodifiableList(this.Y1);
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
