package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
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

public final class ProtoBuf$TypeParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeParameter> implements m {
    public static final ProtoBuf$TypeParameter d;
    public static n<ProtoBuf$TypeParameter> q = new a();
    public int Y1;
    public int Z1;
    public boolean a2;
    public Variance b2;
    public List<ProtoBuf$Type> c2;
    public List<Integer> d2;
    public int e2;
    public byte f2;
    public int g2;
    public final c x;
    public int y;

    public enum Variance implements Internal.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        
        private static Internal.b<Variance> internalValueMap;
        private final int value;

        public static class a implements Internal.b<Variance> {
            public Internal.a a(int i) {
                return Variance.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a();
        }

        private Variance(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static Variance valueOf(int i) {
            if (i == 0) {
                return IN;
            }
            if (i == 1) {
                return OUT;
            }
            if (i != 2) {
                return null;
            }
            return INV;
        }
    }

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$TypeParameter> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeParameter(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.c<ProtoBuf$TypeParameter, b> implements m {
        public int Y1;
        public boolean Z1;
        public Variance a2 = Variance.INV;
        public List<ProtoBuf$Type> b2 = Collections.emptyList();
        public List<Integer> c2 = Collections.emptyList();
        public int x;
        public int y;

        public l build() {
            ProtoBuf$TypeParameter m = m();
            if (m.g()) {
                return m;
            }
            throw new UninitializedMessageException();
        }

        public Object clone() throws CloneNotSupportedException {
            b bVar = new b();
            bVar.n(m());
            return bVar;
        }

        public /* bridge */ /* synthetic */ a.C0267a h(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public GeneratedMessageLite.b i() {
            b bVar = new b();
            bVar.n(m());
            return bVar;
        }

        public /* bridge */ /* synthetic */ GeneratedMessageLite.b j(GeneratedMessageLite generatedMessageLite) {
            n((ProtoBuf$TypeParameter) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public ProtoBuf$TypeParameter m() {
            ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(this, (m0.r.t.a.r.f.a) null);
            int i = this.x;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$TypeParameter.Y1 = this.y;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$TypeParameter.Z1 = this.Y1;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$TypeParameter.a2 = this.Z1;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$TypeParameter.b2 = this.a2;
            if ((i & 16) == 16) {
                this.b2 = Collections.unmodifiableList(this.b2);
                this.x &= -17;
            }
            protoBuf$TypeParameter.c2 = this.b2;
            if ((this.x & 32) == 32) {
                this.c2 = Collections.unmodifiableList(this.c2);
                this.x &= -33;
            }
            protoBuf$TypeParameter.d2 = this.c2;
            protoBuf$TypeParameter.y = i2;
            return protoBuf$TypeParameter;
        }

        public b n(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
            if (protoBuf$TypeParameter == ProtoBuf$TypeParameter.d) {
                return this;
            }
            int i = protoBuf$TypeParameter.y;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = protoBuf$TypeParameter.Y1;
                this.x |= 1;
                this.y = i2;
            }
            if ((i & 2) == 2) {
                int i3 = protoBuf$TypeParameter.Z1;
                this.x = 2 | this.x;
                this.Y1 = i3;
            }
            if ((i & 4) == 4) {
                boolean z2 = protoBuf$TypeParameter.a2;
                this.x = 4 | this.x;
                this.Z1 = z2;
            }
            if ((i & 8) == 8) {
                z = true;
            }
            if (z) {
                Variance variance = protoBuf$TypeParameter.b2;
                Objects.requireNonNull(variance);
                this.x = 8 | this.x;
                this.a2 = variance;
            }
            if (!protoBuf$TypeParameter.c2.isEmpty()) {
                if (this.b2.isEmpty()) {
                    this.b2 = protoBuf$TypeParameter.c2;
                    this.x &= -17;
                } else {
                    if ((this.x & 16) != 16) {
                        this.b2 = new ArrayList(this.b2);
                        this.x |= 16;
                    }
                    this.b2.addAll(protoBuf$TypeParameter.c2);
                }
            }
            if (!protoBuf$TypeParameter.d2.isEmpty()) {
                if (this.c2.isEmpty()) {
                    this.c2 = protoBuf$TypeParameter.d2;
                    this.x &= -33;
                } else {
                    if ((this.x & 32) != 32) {
                        this.c2 = new ArrayList(this.c2);
                        this.x |= 32;
                    }
                    this.c2.addAll(protoBuf$TypeParameter.d2);
                }
            }
            l(protoBuf$TypeParameter);
            this.c = this.c.c(protoBuf$TypeParameter.x);
            return this;
        }

        public b o(d dVar, e eVar) throws IOException {
            ProtoBuf$TypeParameter protoBuf$TypeParameter;
            ProtoBuf$TypeParameter protoBuf$TypeParameter2 = null;
            try {
                ProtoBuf$TypeParameter a = ProtoBuf$TypeParameter.q.a(dVar, eVar);
                if (a != null) {
                    n(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$TypeParameter = (ProtoBuf$TypeParameter) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$TypeParameter2 = protoBuf$TypeParameter;
            }
            if (protoBuf$TypeParameter2 != null) {
                n(protoBuf$TypeParameter2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter();
        d = protoBuf$TypeParameter;
        protoBuf$TypeParameter.x();
    }

    public ProtoBuf$TypeParameter(GeneratedMessageLite.c cVar, m0.r.t.a.r.f.a aVar) {
        super(cVar);
        this.e2 = -1;
        this.f2 = -1;
        this.g2 = -1;
        this.x = cVar.c;
    }

    public l b() {
        return d;
    }

    public l.a c() {
        b bVar = new b();
        bVar.n(this);
        return bVar;
    }

    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        GeneratedMessageLite.ExtendableMessage<MessageType>.defpackage.a q2 = q();
        if ((this.y & 1) == 1) {
            codedOutputStream.p(1, this.Y1);
        }
        if ((this.y & 2) == 2) {
            codedOutputStream.p(2, this.Z1);
        }
        if ((this.y & 4) == 4) {
            boolean z = this.a2;
            codedOutputStream.y(24);
            codedOutputStream.t(z ? 1 : 0);
        }
        if ((this.y & 8) == 8) {
            codedOutputStream.n(4, this.b2.getNumber());
        }
        for (int i = 0; i < this.c2.size(); i++) {
            codedOutputStream.r(5, this.c2.get(i));
        }
        if (this.d2.size() > 0) {
            codedOutputStream.y(50);
            codedOutputStream.y(this.e2);
        }
        for (int i2 = 0; i2 < this.d2.size(); i2++) {
            codedOutputStream.q(this.d2.get(i2).intValue());
        }
        q2.a(1000, codedOutputStream);
        codedOutputStream.u(this.x);
    }

    public int e() {
        int i = this.g2;
        if (i != -1) {
            return i;
        }
        int c = (this.y & 1) == 1 ? CodedOutputStream.c(1, this.Y1) + 0 : 0;
        if ((this.y & 2) == 2) {
            c += CodedOutputStream.c(2, this.Z1);
        }
        if ((this.y & 4) == 4) {
            c += CodedOutputStream.i(3) + 1;
        }
        if ((this.y & 8) == 8) {
            c += CodedOutputStream.b(4, this.b2.getNumber());
        }
        for (int i2 = 0; i2 < this.c2.size(); i2++) {
            c += CodedOutputStream.e(5, this.c2.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.d2.size(); i4++) {
            i3 += CodedOutputStream.d(this.d2.get(i4).intValue());
        }
        int i5 = c + i3;
        if (!this.d2.isEmpty()) {
            i5 = i5 + 1 + CodedOutputStream.d(i3);
        }
        this.e2 = i3;
        int size = this.x.size() + l() + i5;
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
        int i = this.y;
        if (!((i & 1) == 1)) {
            this.f2 = 0;
            return false;
        }
        if (!((i & 2) == 2)) {
            this.f2 = 0;
            return false;
        }
        for (int i2 = 0; i2 < this.c2.size(); i2++) {
            if (!this.c2.get(i2).g()) {
                this.f2 = 0;
                return false;
            }
        }
        if (!i()) {
            this.f2 = 0;
            return false;
        }
        this.f2 = 1;
        return true;
    }

    public final void x() {
        this.Y1 = 0;
        this.Z1 = 0;
        this.a2 = false;
        this.b2 = Variance.INV;
        this.c2 = Collections.emptyList();
        this.d2 = Collections.emptyList();
    }

    public ProtoBuf$TypeParameter() {
        this.e2 = -1;
        this.f2 = -1;
        this.g2 = -1;
        this.x = c.c;
    }

    public ProtoBuf$TypeParameter(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.e2 = -1;
        this.f2 = -1;
        this.g2 = -1;
        x();
        c.b u = c.u();
        CodedOutputStream k = CodedOutputStream.k(u, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.o();
                if (o != 0) {
                    if (o == 8) {
                        this.y |= 1;
                        this.Y1 = dVar.l();
                    } else if (o == 16) {
                        this.y |= 2;
                        this.Z1 = dVar.l();
                    } else if (o == 24) {
                        this.y |= 4;
                        this.a2 = dVar.e();
                    } else if (o == 32) {
                        int l = dVar.l();
                        Variance valueOf = Variance.valueOf(l);
                        if (valueOf == null) {
                            k.y(o);
                            k.y(l);
                        } else {
                            this.y |= 8;
                            this.b2 = valueOf;
                        }
                    } else if (o == 42) {
                        if (!(z2 & true)) {
                            this.c2 = new ArrayList();
                            z2 |= true;
                        }
                        this.c2.add(dVar.h(ProtoBuf$Type.q, eVar));
                    } else if (o == 48) {
                        if (!(z2 & true)) {
                            this.d2 = new ArrayList();
                            z2 |= true;
                        }
                        this.d2.add(Integer.valueOf(dVar.l()));
                    } else if (o == 50) {
                        int d3 = dVar.d(dVar.l());
                        if (!(z2 & true) && dVar.b() > 0) {
                            this.d2 = new ArrayList();
                            z2 |= true;
                        }
                        while (dVar.b() > 0) {
                            this.d2.add(Integer.valueOf(dVar.l()));
                        }
                        dVar.i = d3;
                        dVar.p();
                    } else if (!v(dVar, k, eVar, o)) {
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
                    this.x = u.e();
                    throw th2;
                }
                this.x = u.e();
                this.c.i();
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
            this.x = u.e();
            throw th3;
        }
        this.x = u.e();
        this.c.i();
    }
}
