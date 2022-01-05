package kotlin.reflect.jvm.internal.impl.metadata;

import h0.v.a.k;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import m0.r.t.a.r.h.a;
import m0.r.t.a.r.h.c;
import m0.r.t.a.r.h.d;
import m0.r.t.a.r.h.e;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.h.m;
import m0.r.t.a.r.h.n;

public final class ProtoBuf$TypeAlias extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeAlias> implements m {
    public static final ProtoBuf$TypeAlias d;
    public static n<ProtoBuf$TypeAlias> q = new a();
    public int Y1;
    public int Z1;
    public List<ProtoBuf$TypeParameter> a2;
    public ProtoBuf$Type b2;
    public int c2;
    public ProtoBuf$Type d2;
    public int e2;
    public List<ProtoBuf$Annotation> f2;
    public List<Integer> g2;
    public byte h2;
    public int i2;
    public final c x;
    public int y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$TypeAlias> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeAlias(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.c<ProtoBuf$TypeAlias, b> implements m {
        public int Y1;
        public List<ProtoBuf$TypeParameter> Z1 = Collections.emptyList();
        public ProtoBuf$Type a2;
        public int b2;
        public ProtoBuf$Type c2;
        public int d2;
        public List<ProtoBuf$Annotation> e2;
        public List<Integer> f2;
        public int x;
        public int y = 6;

        public b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.d;
            this.a2 = protoBuf$Type;
            this.c2 = protoBuf$Type;
            this.e2 = Collections.emptyList();
            this.f2 = Collections.emptyList();
        }

        public l build() {
            ProtoBuf$TypeAlias m = m();
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
            n((ProtoBuf$TypeAlias) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public ProtoBuf$TypeAlias m() {
            ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(this, (m0.r.t.a.r.f.a) null);
            int i = this.x;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$TypeAlias.Y1 = this.y;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$TypeAlias.Z1 = this.Y1;
            if ((i & 4) == 4) {
                this.Z1 = Collections.unmodifiableList(this.Z1);
                this.x &= -5;
            }
            protoBuf$TypeAlias.a2 = this.Z1;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            protoBuf$TypeAlias.b2 = this.a2;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            protoBuf$TypeAlias.c2 = this.b2;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            protoBuf$TypeAlias.d2 = this.c2;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            protoBuf$TypeAlias.e2 = this.d2;
            if ((this.x & 128) == 128) {
                this.e2 = Collections.unmodifiableList(this.e2);
                this.x &= -129;
            }
            protoBuf$TypeAlias.f2 = this.e2;
            if ((this.x & 256) == 256) {
                this.f2 = Collections.unmodifiableList(this.f2);
                this.x &= -257;
            }
            protoBuf$TypeAlias.g2 = this.f2;
            protoBuf$TypeAlias.y = i2;
            return protoBuf$TypeAlias;
        }

        public b n(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$TypeAlias == ProtoBuf$TypeAlias.d) {
                return this;
            }
            int i = protoBuf$TypeAlias.y;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = protoBuf$TypeAlias.Y1;
                this.x |= 1;
                this.y = i2;
            }
            if ((i & 2) == 2) {
                int i3 = protoBuf$TypeAlias.Z1;
                this.x = 2 | this.x;
                this.Y1 = i3;
            }
            if (!protoBuf$TypeAlias.a2.isEmpty()) {
                if (this.Z1.isEmpty()) {
                    this.Z1 = protoBuf$TypeAlias.a2;
                    this.x &= -5;
                } else {
                    if ((this.x & 4) != 4) {
                        this.Z1 = new ArrayList(this.Z1);
                        this.x |= 4;
                    }
                    this.Z1.addAll(protoBuf$TypeAlias.a2);
                }
            }
            if (protoBuf$TypeAlias.y()) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$TypeAlias.b2;
                if ((this.x & 8) != 8 || (protoBuf$Type2 = this.a2) == ProtoBuf$Type.d) {
                    this.a2 = protoBuf$Type3;
                } else {
                    this.a2 = i0.d.a.a.a.p1(protoBuf$Type2, protoBuf$Type3);
                }
                this.x |= 8;
            }
            if ((protoBuf$TypeAlias.y & 8) == 8) {
                int i4 = protoBuf$TypeAlias.c2;
                this.x |= 16;
                this.b2 = i4;
            }
            if (protoBuf$TypeAlias.x()) {
                ProtoBuf$Type protoBuf$Type4 = protoBuf$TypeAlias.d2;
                if ((this.x & 32) != 32 || (protoBuf$Type = this.c2) == ProtoBuf$Type.d) {
                    this.c2 = protoBuf$Type4;
                } else {
                    this.c2 = i0.d.a.a.a.p1(protoBuf$Type, protoBuf$Type4);
                }
                this.x |= 32;
            }
            if ((protoBuf$TypeAlias.y & 32) == 32) {
                z = true;
            }
            if (z) {
                int i5 = protoBuf$TypeAlias.e2;
                this.x |= 64;
                this.d2 = i5;
            }
            if (!protoBuf$TypeAlias.f2.isEmpty()) {
                if (this.e2.isEmpty()) {
                    this.e2 = protoBuf$TypeAlias.f2;
                    this.x &= -129;
                } else {
                    if ((this.x & 128) != 128) {
                        this.e2 = new ArrayList(this.e2);
                        this.x |= 128;
                    }
                    this.e2.addAll(protoBuf$TypeAlias.f2);
                }
            }
            if (!protoBuf$TypeAlias.g2.isEmpty()) {
                if (this.f2.isEmpty()) {
                    this.f2 = protoBuf$TypeAlias.g2;
                    this.x &= -257;
                } else {
                    if ((this.x & 256) != 256) {
                        this.f2 = new ArrayList(this.f2);
                        this.x |= 256;
                    }
                    this.f2.addAll(protoBuf$TypeAlias.g2);
                }
            }
            l(protoBuf$TypeAlias);
            this.c = this.c.c(protoBuf$TypeAlias.x);
            return this;
        }

        public b o(d dVar, e eVar) throws IOException {
            ProtoBuf$TypeAlias protoBuf$TypeAlias;
            ProtoBuf$TypeAlias protoBuf$TypeAlias2 = null;
            try {
                ProtoBuf$TypeAlias a = ProtoBuf$TypeAlias.q.a(dVar, eVar);
                if (a != null) {
                    n(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$TypeAlias = (ProtoBuf$TypeAlias) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$TypeAlias2 = protoBuf$TypeAlias;
            }
            if (protoBuf$TypeAlias2 != null) {
                n(protoBuf$TypeAlias2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias();
        d = protoBuf$TypeAlias;
        protoBuf$TypeAlias.z();
    }

    public ProtoBuf$TypeAlias(GeneratedMessageLite.c cVar, m0.r.t.a.r.f.a aVar) {
        super(cVar);
        this.h2 = -1;
        this.i2 = -1;
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
        for (int i = 0; i < this.a2.size(); i++) {
            codedOutputStream.r(3, this.a2.get(i));
        }
        if ((this.y & 4) == 4) {
            codedOutputStream.r(4, this.b2);
        }
        if ((this.y & 8) == 8) {
            codedOutputStream.p(5, this.c2);
        }
        if ((this.y & 16) == 16) {
            codedOutputStream.r(6, this.d2);
        }
        if ((this.y & 32) == 32) {
            codedOutputStream.p(7, this.e2);
        }
        for (int i3 = 0; i3 < this.f2.size(); i3++) {
            codedOutputStream.r(8, this.f2.get(i3));
        }
        for (int i4 = 0; i4 < this.g2.size(); i4++) {
            codedOutputStream.p(31, this.g2.get(i4).intValue());
        }
        q2.a(200, codedOutputStream);
        codedOutputStream.u(this.x);
    }

    public int e() {
        int i = this.i2;
        if (i != -1) {
            return i;
        }
        int c = (this.y & 1) == 1 ? CodedOutputStream.c(1, this.Y1) + 0 : 0;
        if ((this.y & 2) == 2) {
            c += CodedOutputStream.c(2, this.Z1);
        }
        for (int i3 = 0; i3 < this.a2.size(); i3++) {
            c += CodedOutputStream.e(3, this.a2.get(i3));
        }
        if ((this.y & 4) == 4) {
            c += CodedOutputStream.e(4, this.b2);
        }
        if ((this.y & 8) == 8) {
            c += CodedOutputStream.c(5, this.c2);
        }
        if ((this.y & 16) == 16) {
            c += CodedOutputStream.e(6, this.d2);
        }
        if ((this.y & 32) == 32) {
            c += CodedOutputStream.c(7, this.e2);
        }
        for (int i4 = 0; i4 < this.f2.size(); i4++) {
            c += CodedOutputStream.e(8, this.f2.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.g2.size(); i6++) {
            i5 += CodedOutputStream.d(this.g2.get(i6).intValue());
        }
        int size = this.x.size() + l() + (this.g2.size() * 2) + c + i5;
        this.i2 = size;
        return size;
    }

    public l.a f() {
        return new b();
    }

    public final boolean g() {
        byte b3 = this.h2;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if (!((this.y & 2) == 2)) {
            this.h2 = 0;
            return false;
        }
        for (int i = 0; i < this.a2.size(); i++) {
            if (!this.a2.get(i).g()) {
                this.h2 = 0;
                return false;
            }
        }
        if (y() && !this.b2.g()) {
            this.h2 = 0;
            return false;
        } else if (!x() || this.d2.g()) {
            for (int i3 = 0; i3 < this.f2.size(); i3++) {
                if (!this.f2.get(i3).g()) {
                    this.h2 = 0;
                    return false;
                }
            }
            if (!i()) {
                this.h2 = 0;
                return false;
            }
            this.h2 = 1;
            return true;
        } else {
            this.h2 = 0;
            return false;
        }
    }

    public boolean x() {
        return (this.y & 16) == 16;
    }

    public boolean y() {
        return (this.y & 4) == 4;
    }

    public final void z() {
        this.Y1 = 6;
        this.Z1 = 0;
        this.a2 = Collections.emptyList();
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.d;
        this.b2 = protoBuf$Type;
        this.c2 = 0;
        this.d2 = protoBuf$Type;
        this.e2 = 0;
        this.f2 = Collections.emptyList();
        this.g2 = Collections.emptyList();
    }

    public ProtoBuf$TypeAlias() {
        this.h2 = -1;
        this.i2 = -1;
        this.x = c.c;
    }

    public ProtoBuf$TypeAlias(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.h2 = -1;
        this.i2 = -1;
        z();
        c.b u = c.u();
        CodedOutputStream k = CodedOutputStream.k(u, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.o();
                ProtoBuf$Type.b bVar = null;
                switch (o) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.y |= 1;
                        this.Y1 = dVar.l();
                        break;
                    case 16:
                        this.y |= 2;
                        this.Z1 = dVar.l();
                        break;
                    case 26:
                        if (!(z2 & true)) {
                            this.a2 = new ArrayList();
                            z2 |= true;
                        }
                        this.a2.add(dVar.h(ProtoBuf$TypeParameter.q, eVar));
                        break;
                    case 34:
                        bVar = (this.y & 4) == 4 ? this.b2.c() : bVar;
                        ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) dVar.h(ProtoBuf$Type.q, eVar);
                        this.b2 = protoBuf$Type;
                        if (bVar != null) {
                            bVar.j(protoBuf$Type);
                            this.b2 = bVar.m();
                        }
                        this.y |= 4;
                        break;
                    case 40:
                        this.y |= 8;
                        this.c2 = dVar.l();
                        break;
                    case 50:
                        bVar = (this.y & 16) == 16 ? this.d2.c() : bVar;
                        ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) dVar.h(ProtoBuf$Type.q, eVar);
                        this.d2 = protoBuf$Type2;
                        if (bVar != null) {
                            bVar.j(protoBuf$Type2);
                            this.d2 = bVar.m();
                        }
                        this.y |= 16;
                        break;
                    case 56:
                        this.y |= 32;
                        this.e2 = dVar.l();
                        break;
                    case 66:
                        if (!(z2 & true)) {
                            this.f2 = new ArrayList();
                            z2 |= true;
                        }
                        this.f2.add(dVar.h(ProtoBuf$Annotation.d, eVar));
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.g2 = new ArrayList();
                            z2 |= true;
                        }
                        this.g2.add(Integer.valueOf(dVar.l()));
                        break;
                    case k.d.DEFAULT_SWIPE_ANIMATION_DURATION:
                        int d3 = dVar.d(dVar.l());
                        if (!(z2 & true) && dVar.b() > 0) {
                            this.g2 = new ArrayList();
                            z2 |= true;
                        }
                        while (dVar.b() > 0) {
                            this.g2.add(Integer.valueOf(dVar.l()));
                        }
                        dVar.i = d3;
                        dVar.p();
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
                if (z2 & true) {
                    this.a2 = Collections.unmodifiableList(this.a2);
                }
                if (z2 & true) {
                    this.f2 = Collections.unmodifiableList(this.f2);
                }
                if (z2 & true) {
                    this.g2 = Collections.unmodifiableList(this.g2);
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
            this.a2 = Collections.unmodifiableList(this.a2);
        }
        if (z2 & true) {
            this.f2 = Collections.unmodifiableList(this.f2);
        }
        if (z2 & true) {
            this.g2 = Collections.unmodifiableList(this.g2);
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
