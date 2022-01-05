package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
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

public final class ProtoBuf$Expression extends GeneratedMessageLite implements m {
    public static final ProtoBuf$Expression c;
    public static n<ProtoBuf$Expression> d = new a();
    public int Y1;
    public ConstantValue Z1;
    public ProtoBuf$Type a2;
    public int b2;
    public List<ProtoBuf$Expression> c2;
    public List<ProtoBuf$Expression> d2;
    public byte e2;
    public int f2;
    public final c q;
    public int x;
    public int y;

    public enum ConstantValue implements Internal.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        
        private static Internal.b<ConstantValue> internalValueMap;
        private final int value;

        public static class a implements Internal.b<ConstantValue> {
            public Internal.a a(int i) {
                return ConstantValue.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a();
        }

        private ConstantValue(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static ConstantValue valueOf(int i) {
            if (i == 0) {
                return TRUE;
            }
            if (i == 1) {
                return FALSE;
            }
            if (i != 2) {
                return null;
            }
            return NULL;
        }
    }

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$Expression> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Expression(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.b<ProtoBuf$Expression, b> implements m {
        public ProtoBuf$Type Y1 = ProtoBuf$Type.d;
        public int Z1;
        public List<ProtoBuf$Expression> a2 = Collections.emptyList();
        public List<ProtoBuf$Expression> b2 = Collections.emptyList();
        public int d;
        public int q;
        public int x;
        public ConstantValue y = ConstantValue.TRUE;

        public l build() {
            ProtoBuf$Expression l = l();
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
            m((ProtoBuf$Expression) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            n(dVar, eVar);
            return this;
        }

        public ProtoBuf$Expression l() {
            ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(this, (m0.r.t.a.r.f.a) null);
            int i = this.d;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$Expression.y = this.q;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$Expression.Y1 = this.x;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$Expression.Z1 = this.y;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$Expression.a2 = this.Y1;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$Expression.b2 = this.Z1;
            if ((i & 32) == 32) {
                this.a2 = Collections.unmodifiableList(this.a2);
                this.d &= -33;
            }
            protoBuf$Expression.c2 = this.a2;
            if ((this.d & 64) == 64) {
                this.b2 = Collections.unmodifiableList(this.b2);
                this.d &= -65;
            }
            protoBuf$Expression.d2 = this.b2;
            protoBuf$Expression.x = i2;
            return protoBuf$Expression;
        }

        public b m(ProtoBuf$Expression protoBuf$Expression) {
            ProtoBuf$Type protoBuf$Type;
            if (protoBuf$Expression == ProtoBuf$Expression.c) {
                return this;
            }
            int i = protoBuf$Expression.x;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = protoBuf$Expression.y;
                this.d |= 1;
                this.q = i2;
            }
            if ((i & 2) == 2) {
                int i3 = protoBuf$Expression.Y1;
                this.d = 2 | this.d;
                this.x = i3;
            }
            if ((i & 4) == 4) {
                ConstantValue constantValue = protoBuf$Expression.Z1;
                Objects.requireNonNull(constantValue);
                this.d = 4 | this.d;
                this.y = constantValue;
            }
            if ((protoBuf$Expression.x & 8) == 8) {
                ProtoBuf$Type protoBuf$Type2 = protoBuf$Expression.a2;
                if ((this.d & 8) != 8 || (protoBuf$Type = this.Y1) == ProtoBuf$Type.d) {
                    this.Y1 = protoBuf$Type2;
                } else {
                    this.Y1 = i0.d.a.a.a.p1(protoBuf$Type, protoBuf$Type2);
                }
                this.d |= 8;
            }
            if ((protoBuf$Expression.x & 16) == 16) {
                z = true;
            }
            if (z) {
                int i4 = protoBuf$Expression.b2;
                this.d = 16 | this.d;
                this.Z1 = i4;
            }
            if (!protoBuf$Expression.c2.isEmpty()) {
                if (this.a2.isEmpty()) {
                    this.a2 = protoBuf$Expression.c2;
                    this.d &= -33;
                } else {
                    if ((this.d & 32) != 32) {
                        this.a2 = new ArrayList(this.a2);
                        this.d |= 32;
                    }
                    this.a2.addAll(protoBuf$Expression.c2);
                }
            }
            if (!protoBuf$Expression.d2.isEmpty()) {
                if (this.b2.isEmpty()) {
                    this.b2 = protoBuf$Expression.d2;
                    this.d &= -65;
                } else {
                    if ((this.d & 64) != 64) {
                        this.b2 = new ArrayList(this.b2);
                        this.d |= 64;
                    }
                    this.b2.addAll(protoBuf$Expression.d2);
                }
            }
            this.c = this.c.c(protoBuf$Expression.q);
            return this;
        }

        public b n(d dVar, e eVar) throws IOException {
            ProtoBuf$Expression protoBuf$Expression;
            ProtoBuf$Expression protoBuf$Expression2 = null;
            try {
                ProtoBuf$Expression a = ProtoBuf$Expression.d.a(dVar, eVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Expression = (ProtoBuf$Expression) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Expression2 = protoBuf$Expression;
            }
            if (protoBuf$Expression2 != null) {
                m(protoBuf$Expression2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression();
        c = protoBuf$Expression;
        protoBuf$Expression.i();
    }

    public ProtoBuf$Expression(GeneratedMessageLite.b bVar, m0.r.t.a.r.f.a aVar) {
        super(bVar);
        this.e2 = -1;
        this.f2 = -1;
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
        if ((this.x & 4) == 4) {
            codedOutputStream.n(3, this.Z1.getNumber());
        }
        if ((this.x & 8) == 8) {
            codedOutputStream.r(4, this.a2);
        }
        if ((this.x & 16) == 16) {
            codedOutputStream.p(5, this.b2);
        }
        for (int i = 0; i < this.c2.size(); i++) {
            codedOutputStream.r(6, this.c2.get(i));
        }
        for (int i2 = 0; i2 < this.d2.size(); i2++) {
            codedOutputStream.r(7, this.d2.get(i2));
        }
        codedOutputStream.u(this.q);
    }

    public int e() {
        int i = this.f2;
        if (i != -1) {
            return i;
        }
        int c3 = (this.x & 1) == 1 ? CodedOutputStream.c(1, this.y) + 0 : 0;
        if ((this.x & 2) == 2) {
            c3 += CodedOutputStream.c(2, this.Y1);
        }
        if ((this.x & 4) == 4) {
            c3 += CodedOutputStream.b(3, this.Z1.getNumber());
        }
        if ((this.x & 8) == 8) {
            c3 += CodedOutputStream.e(4, this.a2);
        }
        if ((this.x & 16) == 16) {
            c3 += CodedOutputStream.c(5, this.b2);
        }
        for (int i2 = 0; i2 < this.c2.size(); i2++) {
            c3 += CodedOutputStream.e(6, this.c2.get(i2));
        }
        for (int i3 = 0; i3 < this.d2.size(); i3++) {
            c3 += CodedOutputStream.e(7, this.d2.get(i3));
        }
        int size = this.q.size() + c3;
        this.f2 = size;
        return size;
    }

    public l.a f() {
        return new b();
    }

    public final boolean g() {
        byte b3 = this.e2;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if (!((this.x & 8) == 8) || this.a2.g()) {
            for (int i = 0; i < this.c2.size(); i++) {
                if (!this.c2.get(i).g()) {
                    this.e2 = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.d2.size(); i2++) {
                if (!this.d2.get(i2).g()) {
                    this.e2 = 0;
                    return false;
                }
            }
            this.e2 = 1;
            return true;
        }
        this.e2 = 0;
        return false;
    }

    public final void i() {
        this.y = 0;
        this.Y1 = 0;
        this.Z1 = ConstantValue.TRUE;
        this.a2 = ProtoBuf$Type.d;
        this.b2 = 0;
        this.c2 = Collections.emptyList();
        this.d2 = Collections.emptyList();
    }

    public ProtoBuf$Expression() {
        this.e2 = -1;
        this.f2 = -1;
        this.q = c.c;
    }

    public ProtoBuf$Expression(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.e2 = -1;
        this.f2 = -1;
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
                        ConstantValue valueOf = ConstantValue.valueOf(l);
                        if (valueOf == null) {
                            k.y(o);
                            k.y(l);
                        } else {
                            this.x |= 4;
                            this.Z1 = valueOf;
                        }
                    } else if (o == 34) {
                        ProtoBuf$Type.b G = (this.x & 8) == 8 ? this.a2.c() : null;
                        ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) dVar.h(ProtoBuf$Type.q, eVar);
                        this.a2 = protoBuf$Type;
                        if (G != null) {
                            G.j(protoBuf$Type);
                            this.a2 = G.m();
                        }
                        this.x |= 8;
                    } else if (o == 40) {
                        this.x |= 16;
                        this.b2 = dVar.l();
                    } else if (o == 50) {
                        if (!(z2 & true)) {
                            this.c2 = new ArrayList();
                            z2 |= true;
                        }
                        this.c2.add(dVar.h(d, eVar));
                    } else if (o == 58) {
                        if (!(z2 & true)) {
                            this.d2 = new ArrayList();
                            z2 |= true;
                        }
                        this.d2.add(dVar.h(d, eVar));
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
                    this.c2 = Collections.unmodifiableList(this.c2);
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
            this.c2 = Collections.unmodifiableList(this.c2);
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
