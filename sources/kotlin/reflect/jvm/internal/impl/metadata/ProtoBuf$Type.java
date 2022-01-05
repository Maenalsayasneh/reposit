package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
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

public final class ProtoBuf$Type extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Type> implements m {
    public static final ProtoBuf$Type d;
    public static n<ProtoBuf$Type> q = new a();
    public List<Argument> Y1;
    public boolean Z1;
    public int a2;
    public ProtoBuf$Type b2;
    public int c2;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public ProtoBuf$Type h2;
    public int i2;
    public ProtoBuf$Type j2;
    public int k2;
    public int l2;
    public byte m2;
    public int n2;
    public final c x;
    public int y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$Type> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Type(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.c<ProtoBuf$Type, b> implements m {
        public boolean Y1;
        public int Z1;
        public ProtoBuf$Type a2;
        public int b2;
        public int c2;
        public int d2;
        public int e2;
        public int f2;
        public ProtoBuf$Type g2;
        public int h2;
        public ProtoBuf$Type i2;
        public int j2;
        public int k2;
        public int x;
        public List<Argument> y = Collections.emptyList();

        public b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.d;
            this.a2 = protoBuf$Type;
            this.g2 = protoBuf$Type;
            this.i2 = protoBuf$Type;
        }

        public l build() {
            ProtoBuf$Type m = m();
            if (m.g()) {
                return m;
            }
            throw new UninitializedMessageException();
        }

        public Object clone() throws CloneNotSupportedException {
            b bVar = new b();
            bVar.j(m());
            return bVar;
        }

        public /* bridge */ /* synthetic */ a.C0267a h(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public GeneratedMessageLite.b i() {
            b bVar = new b();
            bVar.j(m());
            return bVar;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public ProtoBuf$Type m() {
            ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(this, (m0.r.t.a.r.f.a) null);
            int i = this.x;
            int i3 = 1;
            if ((i & 1) == 1) {
                this.y = Collections.unmodifiableList(this.y);
                this.x &= -2;
            }
            protoBuf$Type.Y1 = this.y;
            if ((i & 2) != 2) {
                i3 = 0;
            }
            protoBuf$Type.Z1 = this.Y1;
            if ((i & 4) == 4) {
                i3 |= 2;
            }
            protoBuf$Type.a2 = this.Z1;
            if ((i & 8) == 8) {
                i3 |= 4;
            }
            protoBuf$Type.b2 = this.a2;
            if ((i & 16) == 16) {
                i3 |= 8;
            }
            protoBuf$Type.c2 = this.b2;
            if ((i & 32) == 32) {
                i3 |= 16;
            }
            protoBuf$Type.d2 = this.c2;
            if ((i & 64) == 64) {
                i3 |= 32;
            }
            protoBuf$Type.e2 = this.d2;
            if ((i & 128) == 128) {
                i3 |= 64;
            }
            protoBuf$Type.f2 = this.e2;
            if ((i & 256) == 256) {
                i3 |= 128;
            }
            protoBuf$Type.g2 = this.f2;
            if ((i & 512) == 512) {
                i3 |= 256;
            }
            protoBuf$Type.h2 = this.g2;
            if ((i & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                i3 |= 512;
            }
            protoBuf$Type.i2 = this.h2;
            if ((i & 2048) == 2048) {
                i3 |= RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;
            }
            protoBuf$Type.j2 = this.i2;
            if ((i & 4096) == 4096) {
                i3 |= 2048;
            }
            protoBuf$Type.k2 = this.j2;
            if ((i & 8192) == 8192) {
                i3 |= 4096;
            }
            protoBuf$Type.l2 = this.k2;
            protoBuf$Type.y = i3;
            return protoBuf$Type;
        }

        /* renamed from: n */
        public b j(ProtoBuf$Type protoBuf$Type) {
            ProtoBuf$Type protoBuf$Type2;
            ProtoBuf$Type protoBuf$Type3;
            ProtoBuf$Type protoBuf$Type4;
            ProtoBuf$Type protoBuf$Type5 = ProtoBuf$Type.d;
            if (protoBuf$Type == protoBuf$Type5) {
                return this;
            }
            boolean z = true;
            if (!protoBuf$Type.Y1.isEmpty()) {
                if (this.y.isEmpty()) {
                    this.y = protoBuf$Type.Y1;
                    this.x &= -2;
                } else {
                    if ((this.x & 1) != 1) {
                        this.y = new ArrayList(this.y);
                        this.x |= 1;
                    }
                    this.y.addAll(protoBuf$Type.Y1);
                }
            }
            int i = protoBuf$Type.y;
            if ((i & 1) == 1) {
                boolean z2 = protoBuf$Type.Z1;
                this.x |= 2;
                this.Y1 = z2;
            }
            if ((i & 2) == 2) {
                int i3 = protoBuf$Type.a2;
                this.x |= 4;
                this.Z1 = i3;
            }
            if (protoBuf$Type.z()) {
                ProtoBuf$Type protoBuf$Type6 = protoBuf$Type.b2;
                if ((this.x & 8) != 8 || (protoBuf$Type4 = this.a2) == protoBuf$Type5) {
                    this.a2 = protoBuf$Type6;
                } else {
                    this.a2 = i0.d.a.a.a.p1(protoBuf$Type4, protoBuf$Type6);
                }
                this.x |= 8;
            }
            if ((protoBuf$Type.y & 8) == 8) {
                int i4 = protoBuf$Type.c2;
                this.x |= 16;
                this.b2 = i4;
            }
            if (protoBuf$Type.y()) {
                int i5 = protoBuf$Type.d2;
                this.x |= 32;
                this.c2 = i5;
            }
            int i6 = protoBuf$Type.y;
            if ((i6 & 32) == 32) {
                int i7 = protoBuf$Type.e2;
                this.x |= 64;
                this.d2 = i7;
            }
            if ((i6 & 64) == 64) {
                int i8 = protoBuf$Type.f2;
                this.x |= 128;
                this.e2 = i8;
            }
            if (protoBuf$Type.C()) {
                int i9 = protoBuf$Type.g2;
                this.x |= 256;
                this.f2 = i9;
            }
            if (protoBuf$Type.A()) {
                ProtoBuf$Type protoBuf$Type7 = protoBuf$Type.h2;
                if ((this.x & 512) != 512 || (protoBuf$Type3 = this.g2) == protoBuf$Type5) {
                    this.g2 = protoBuf$Type7;
                } else {
                    this.g2 = i0.d.a.a.a.p1(protoBuf$Type3, protoBuf$Type7);
                }
                this.x |= 512;
            }
            if ((protoBuf$Type.y & 512) == 512) {
                int i10 = protoBuf$Type.i2;
                this.x |= RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;
                this.h2 = i10;
            }
            if (protoBuf$Type.x()) {
                ProtoBuf$Type protoBuf$Type8 = protoBuf$Type.j2;
                if ((this.x & 2048) != 2048 || (protoBuf$Type2 = this.i2) == protoBuf$Type5) {
                    this.i2 = protoBuf$Type8;
                } else {
                    this.i2 = i0.d.a.a.a.p1(protoBuf$Type2, protoBuf$Type8);
                }
                this.x |= 2048;
            }
            int i11 = protoBuf$Type.y;
            if ((i11 & 2048) == 2048) {
                int i12 = protoBuf$Type.k2;
                this.x |= 4096;
                this.j2 = i12;
            }
            if ((i11 & 4096) != 4096) {
                z = false;
            }
            if (z) {
                int i13 = protoBuf$Type.l2;
                this.x |= 8192;
                this.k2 = i13;
            }
            l(protoBuf$Type);
            this.c = this.c.c(protoBuf$Type.x);
            return this;
        }

        public b o(d dVar, e eVar) throws IOException {
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2 = null;
            try {
                ProtoBuf$Type a = ProtoBuf$Type.q.a(dVar, eVar);
                if (a != null) {
                    j(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Type = (ProtoBuf$Type) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Type2 = protoBuf$Type;
            }
            if (protoBuf$Type2 != null) {
                j(protoBuf$Type2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type();
        d = protoBuf$Type;
        protoBuf$Type.E();
    }

    public ProtoBuf$Type(GeneratedMessageLite.c cVar, m0.r.t.a.r.f.a aVar) {
        super(cVar);
        this.m2 = -1;
        this.n2 = -1;
        this.x = cVar.c;
    }

    public static b F(ProtoBuf$Type protoBuf$Type) {
        b bVar = new b();
        bVar.j(protoBuf$Type);
        return bVar;
    }

    public boolean A() {
        return (this.y & 256) == 256;
    }

    public boolean C() {
        return (this.y & 128) == 128;
    }

    public final void E() {
        this.Y1 = Collections.emptyList();
        this.Z1 = false;
        this.a2 = 0;
        ProtoBuf$Type protoBuf$Type = d;
        this.b2 = protoBuf$Type;
        this.c2 = 0;
        this.d2 = 0;
        this.e2 = 0;
        this.f2 = 0;
        this.g2 = 0;
        this.h2 = protoBuf$Type;
        this.i2 = 0;
        this.j2 = protoBuf$Type;
        this.k2 = 0;
        this.l2 = 0;
    }

    /* renamed from: G */
    public b c() {
        return F(this);
    }

    public l b() {
        return d;
    }

    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        GeneratedMessageLite.ExtendableMessage<MessageType>.defpackage.a q2 = q();
        if ((this.y & 4096) == 4096) {
            codedOutputStream.p(1, this.l2);
        }
        for (int i = 0; i < this.Y1.size(); i++) {
            codedOutputStream.r(2, this.Y1.get(i));
        }
        if ((this.y & 1) == 1) {
            boolean z = this.Z1;
            codedOutputStream.y(24);
            codedOutputStream.t(z ? 1 : 0);
        }
        if ((this.y & 2) == 2) {
            codedOutputStream.p(4, this.a2);
        }
        if ((this.y & 4) == 4) {
            codedOutputStream.r(5, this.b2);
        }
        if ((this.y & 16) == 16) {
            codedOutputStream.p(6, this.d2);
        }
        if ((this.y & 32) == 32) {
            codedOutputStream.p(7, this.e2);
        }
        if ((this.y & 8) == 8) {
            codedOutputStream.p(8, this.c2);
        }
        if ((this.y & 64) == 64) {
            codedOutputStream.p(9, this.f2);
        }
        if ((this.y & 256) == 256) {
            codedOutputStream.r(10, this.h2);
        }
        if ((this.y & 512) == 512) {
            codedOutputStream.p(11, this.i2);
        }
        if ((this.y & 128) == 128) {
            codedOutputStream.p(12, this.g2);
        }
        if ((this.y & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
            codedOutputStream.r(13, this.j2);
        }
        if ((this.y & 2048) == 2048) {
            codedOutputStream.p(14, this.k2);
        }
        q2.a(200, codedOutputStream);
        codedOutputStream.u(this.x);
    }

    public int e() {
        int i = this.n2;
        if (i != -1) {
            return i;
        }
        int c = (this.y & 4096) == 4096 ? CodedOutputStream.c(1, this.l2) + 0 : 0;
        for (int i3 = 0; i3 < this.Y1.size(); i3++) {
            c += CodedOutputStream.e(2, this.Y1.get(i3));
        }
        if ((this.y & 1) == 1) {
            c += CodedOutputStream.i(3) + 1;
        }
        if ((this.y & 2) == 2) {
            c += CodedOutputStream.c(4, this.a2);
        }
        if ((this.y & 4) == 4) {
            c += CodedOutputStream.e(5, this.b2);
        }
        if ((this.y & 16) == 16) {
            c += CodedOutputStream.c(6, this.d2);
        }
        if ((this.y & 32) == 32) {
            c += CodedOutputStream.c(7, this.e2);
        }
        if ((this.y & 8) == 8) {
            c += CodedOutputStream.c(8, this.c2);
        }
        if ((this.y & 64) == 64) {
            c += CodedOutputStream.c(9, this.f2);
        }
        if ((this.y & 256) == 256) {
            c += CodedOutputStream.e(10, this.h2);
        }
        if ((this.y & 512) == 512) {
            c += CodedOutputStream.c(11, this.i2);
        }
        if ((this.y & 128) == 128) {
            c += CodedOutputStream.c(12, this.g2);
        }
        if ((this.y & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
            c += CodedOutputStream.e(13, this.j2);
        }
        if ((this.y & 2048) == 2048) {
            c += CodedOutputStream.c(14, this.k2);
        }
        int size = this.x.size() + l() + c;
        this.n2 = size;
        return size;
    }

    public l.a f() {
        return new b();
    }

    public final boolean g() {
        byte b3 = this.m2;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        for (int i = 0; i < this.Y1.size(); i++) {
            if (!this.Y1.get(i).g()) {
                this.m2 = 0;
                return false;
            }
        }
        if (z() && !this.b2.g()) {
            this.m2 = 0;
            return false;
        } else if (A() && !this.h2.g()) {
            this.m2 = 0;
            return false;
        } else if (x() && !this.j2.g()) {
            this.m2 = 0;
            return false;
        } else if (!i()) {
            this.m2 = 0;
            return false;
        } else {
            this.m2 = 1;
            return true;
        }
    }

    public boolean x() {
        return (this.y & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 1024;
    }

    public boolean y() {
        return (this.y & 16) == 16;
    }

    public boolean z() {
        return (this.y & 4) == 4;
    }

    public static final class Argument extends GeneratedMessageLite implements m {
        public static final Argument c;
        public static n<Argument> d = new a();
        public ProtoBuf$Type Y1;
        public int Z1;
        public byte a2;
        public int b2;
        public final c q;
        public int x;
        public Projection y;

        public enum Projection implements Internal.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            
            private static Internal.b<Projection> internalValueMap;
            private final int value;

            public static class a implements Internal.b<Projection> {
                public Internal.a a(int i) {
                    return Projection.valueOf(i);
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new a();
            }

            private Projection(int i, int i2) {
                this.value = i2;
            }

            public final int getNumber() {
                return this.value;
            }

            public static Projection valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i == 2) {
                    return INV;
                }
                if (i != 3) {
                    return null;
                }
                return STAR;
            }
        }

        public static class a extends m0.r.t.a.r.h.b<Argument> {
            public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
                return new Argument(dVar, eVar, (m0.r.t.a.r.f.a) null);
            }
        }

        public static final class b extends GeneratedMessageLite.b<Argument, b> implements m {
            public int d;
            public Projection q = Projection.INV;
            public ProtoBuf$Type x = ProtoBuf$Type.d;
            public int y;

            public l build() {
                Argument l = l();
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
                m((Argument) generatedMessageLite);
                return this;
            }

            public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
                n(dVar, eVar);
                return this;
            }

            public Argument l() {
                Argument argument = new Argument(this, (m0.r.t.a.r.f.a) null);
                int i = this.d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                argument.y = this.q;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                argument.Y1 = this.x;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                argument.Z1 = this.y;
                argument.x = i2;
                return argument;
            }

            public b m(Argument argument) {
                ProtoBuf$Type protoBuf$Type;
                if (argument == Argument.c) {
                    return this;
                }
                boolean z = true;
                if ((argument.x & 1) == 1) {
                    Projection projection = argument.y;
                    Objects.requireNonNull(projection);
                    this.d |= 1;
                    this.q = projection;
                }
                if (argument.i()) {
                    ProtoBuf$Type protoBuf$Type2 = argument.Y1;
                    if ((this.d & 2) != 2 || (protoBuf$Type = this.x) == ProtoBuf$Type.d) {
                        this.x = protoBuf$Type2;
                    } else {
                        this.x = i0.d.a.a.a.p1(protoBuf$Type, protoBuf$Type2);
                    }
                    this.d |= 2;
                }
                if ((argument.x & 4) != 4) {
                    z = false;
                }
                if (z) {
                    int i = argument.Z1;
                    this.d |= 4;
                    this.y = i;
                }
                this.c = this.c.c(argument.q);
                return this;
            }

            public b n(d dVar, e eVar) throws IOException {
                Argument argument;
                Argument argument2 = null;
                try {
                    Argument a = Argument.d.a(dVar, eVar);
                    if (a != null) {
                        m(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    argument = (Argument) e.c;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    argument2 = argument;
                }
                if (argument2 != null) {
                    m(argument2);
                }
                throw th;
            }
        }

        static {
            Argument argument = new Argument();
            c = argument;
            argument.y = Projection.INV;
            argument.Y1 = ProtoBuf$Type.d;
            argument.Z1 = 0;
        }

        public Argument(GeneratedMessageLite.b bVar, m0.r.t.a.r.f.a aVar) {
            super(bVar);
            this.a2 = -1;
            this.b2 = -1;
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
            if ((this.x & 2) == 2) {
                codedOutputStream.r(2, this.Y1);
            }
            if ((this.x & 4) == 4) {
                codedOutputStream.p(3, this.Z1);
            }
            codedOutputStream.u(this.q);
        }

        public int e() {
            int i = this.b2;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.x & 1) == 1) {
                i2 = 0 + CodedOutputStream.b(1, this.y.getNumber());
            }
            if ((this.x & 2) == 2) {
                i2 += CodedOutputStream.e(2, this.Y1);
            }
            if ((this.x & 4) == 4) {
                i2 += CodedOutputStream.c(3, this.Z1);
            }
            int size = this.q.size() + i2;
            this.b2 = size;
            return size;
        }

        public l.a f() {
            return new b();
        }

        public final boolean g() {
            byte b3 = this.a2;
            if (b3 == 1) {
                return true;
            }
            if (b3 == 0) {
                return false;
            }
            if (!i() || this.Y1.g()) {
                this.a2 = 1;
                return true;
            }
            this.a2 = 0;
            return false;
        }

        public boolean i() {
            return (this.x & 2) == 2;
        }

        public Argument() {
            this.a2 = -1;
            this.b2 = -1;
            this.q = c.c;
        }

        public Argument(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
            this.a2 = -1;
            this.b2 = -1;
            this.y = Projection.INV;
            this.Y1 = ProtoBuf$Type.d;
            boolean z = false;
            this.Z1 = 0;
            c.b u = c.u();
            CodedOutputStream k = CodedOutputStream.k(u, 1);
            while (!z) {
                try {
                    int o = dVar.o();
                    if (o != 0) {
                        if (o == 8) {
                            int l = dVar.l();
                            Projection valueOf = Projection.valueOf(l);
                            if (valueOf == null) {
                                k.y(o);
                                k.y(l);
                            } else {
                                this.x |= 1;
                                this.y = valueOf;
                            }
                        } else if (o == 18) {
                            b G = (this.x & 2) == 2 ? this.Y1.c() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) dVar.h(ProtoBuf$Type.q, eVar);
                            this.Y1 = protoBuf$Type;
                            if (G != null) {
                                G.j(protoBuf$Type);
                                this.Y1 = G.m();
                            }
                            this.x |= 2;
                        } else if (o == 24) {
                            this.x |= 4;
                            this.Z1 = dVar.l();
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

    public ProtoBuf$Type() {
        this.m2 = -1;
        this.n2 = -1;
        this.x = c.c;
    }

    public ProtoBuf$Type(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.m2 = -1;
        this.n2 = -1;
        E();
        c.b u = c.u();
        CodedOutputStream k = CodedOutputStream.k(u, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.o();
                b bVar = null;
                switch (o) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.y |= 4096;
                        this.l2 = dVar.l();
                        break;
                    case 18:
                        if (!z2 || !true) {
                            this.Y1 = new ArrayList();
                            z2 |= true;
                        }
                        this.Y1.add(dVar.h(Argument.d, eVar));
                        break;
                    case 24:
                        this.y |= 1;
                        this.Z1 = dVar.e();
                        break;
                    case 32:
                        this.y |= 2;
                        this.a2 = dVar.l();
                        break;
                    case 42:
                        bVar = (this.y & 4) == 4 ? this.b2.c() : bVar;
                        ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) dVar.h(q, eVar);
                        this.b2 = protoBuf$Type;
                        if (bVar != null) {
                            bVar.j(protoBuf$Type);
                            this.b2 = bVar.m();
                        }
                        this.y |= 4;
                        break;
                    case 48:
                        this.y |= 16;
                        this.d2 = dVar.l();
                        break;
                    case 56:
                        this.y |= 32;
                        this.e2 = dVar.l();
                        break;
                    case 64:
                        this.y |= 8;
                        this.c2 = dVar.l();
                        break;
                    case 72:
                        this.y |= 64;
                        this.f2 = dVar.l();
                        break;
                    case 82:
                        bVar = (this.y & 256) == 256 ? this.h2.c() : bVar;
                        ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) dVar.h(q, eVar);
                        this.h2 = protoBuf$Type2;
                        if (bVar != null) {
                            bVar.j(protoBuf$Type2);
                            this.h2 = bVar.m();
                        }
                        this.y |= 256;
                        break;
                    case 88:
                        this.y |= 512;
                        this.i2 = dVar.l();
                        break;
                    case 96:
                        this.y |= 128;
                        this.g2 = dVar.l();
                        break;
                    case 106:
                        bVar = (this.y & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 1024 ? this.j2.c() : bVar;
                        ProtoBuf$Type protoBuf$Type3 = (ProtoBuf$Type) dVar.h(q, eVar);
                        this.j2 = protoBuf$Type3;
                        if (bVar != null) {
                            bVar.j(protoBuf$Type3);
                            this.j2 = bVar.m();
                        }
                        this.y |= RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;
                        break;
                    case 112:
                        this.y |= 2048;
                        this.k2 = dVar.l();
                        break;
                    default:
                        if (v(dVar, k, eVar, o)) {
                            break;
                        }
                        z = true;
                        break;
                }
            } catch (InvalidProtocolBufferException e) {
                e.c = this;
                throw e;
            } catch (IOException e3) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3.getMessage());
                invalidProtocolBufferException.c = this;
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z2 && true) {
                    this.Y1 = Collections.unmodifiableList(this.Y1);
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
        if (z2 && true) {
            this.Y1 = Collections.unmodifiableList(this.Y1);
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
