package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

public final class ProtoBuf$Constructor extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Constructor> implements m {
    public static final ProtoBuf$Constructor d;
    public static n<ProtoBuf$Constructor> q = new a();
    public int Y1;
    public List<ProtoBuf$ValueParameter> Z1;
    public List<Integer> a2;
    public byte b2;
    public int c2;
    public final c x;
    public int y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$Constructor> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Constructor(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.c<ProtoBuf$Constructor, b> implements m {
        public List<ProtoBuf$ValueParameter> Y1 = Collections.emptyList();
        public List<Integer> Z1 = Collections.emptyList();
        public int x;
        public int y = 6;

        public l build() {
            ProtoBuf$Constructor m = m();
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
            n((ProtoBuf$Constructor) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public ProtoBuf$Constructor m() {
            ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(this, (m0.r.t.a.r.f.a) null);
            int i = this.x;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$Constructor.Y1 = this.y;
            if ((i & 2) == 2) {
                this.Y1 = Collections.unmodifiableList(this.Y1);
                this.x &= -3;
            }
            protoBuf$Constructor.Z1 = this.Y1;
            if ((this.x & 4) == 4) {
                this.Z1 = Collections.unmodifiableList(this.Z1);
                this.x &= -5;
            }
            protoBuf$Constructor.a2 = this.Z1;
            protoBuf$Constructor.y = i2;
            return protoBuf$Constructor;
        }

        public b n(ProtoBuf$Constructor protoBuf$Constructor) {
            if (protoBuf$Constructor == ProtoBuf$Constructor.d) {
                return this;
            }
            if ((protoBuf$Constructor.y & 1) == 1) {
                int i = protoBuf$Constructor.Y1;
                this.x = 1 | this.x;
                this.y = i;
            }
            if (!protoBuf$Constructor.Z1.isEmpty()) {
                if (this.Y1.isEmpty()) {
                    this.Y1 = protoBuf$Constructor.Z1;
                    this.x &= -3;
                } else {
                    if ((this.x & 2) != 2) {
                        this.Y1 = new ArrayList(this.Y1);
                        this.x |= 2;
                    }
                    this.Y1.addAll(protoBuf$Constructor.Z1);
                }
            }
            if (!protoBuf$Constructor.a2.isEmpty()) {
                if (this.Z1.isEmpty()) {
                    this.Z1 = protoBuf$Constructor.a2;
                    this.x &= -5;
                } else {
                    if ((this.x & 4) != 4) {
                        this.Z1 = new ArrayList(this.Z1);
                        this.x |= 4;
                    }
                    this.Z1.addAll(protoBuf$Constructor.a2);
                }
            }
            l(protoBuf$Constructor);
            this.c = this.c.c(protoBuf$Constructor.x);
            return this;
        }

        public b o(d dVar, e eVar) throws IOException {
            ProtoBuf$Constructor protoBuf$Constructor;
            ProtoBuf$Constructor protoBuf$Constructor2 = null;
            try {
                ProtoBuf$Constructor a = ProtoBuf$Constructor.q.a(dVar, eVar);
                if (a != null) {
                    n(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Constructor = (ProtoBuf$Constructor) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Constructor2 = protoBuf$Constructor;
            }
            if (protoBuf$Constructor2 != null) {
                n(protoBuf$Constructor2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor();
        d = protoBuf$Constructor;
        protoBuf$Constructor.Y1 = 6;
        protoBuf$Constructor.Z1 = Collections.emptyList();
        protoBuf$Constructor.a2 = Collections.emptyList();
    }

    public ProtoBuf$Constructor(GeneratedMessageLite.c cVar, m0.r.t.a.r.f.a aVar) {
        super(cVar);
        this.b2 = -1;
        this.c2 = -1;
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
        for (int i = 0; i < this.Z1.size(); i++) {
            codedOutputStream.r(2, this.Z1.get(i));
        }
        for (int i2 = 0; i2 < this.a2.size(); i2++) {
            codedOutputStream.p(31, this.a2.get(i2).intValue());
        }
        q2.a(19000, codedOutputStream);
        codedOutputStream.u(this.x);
    }

    public int e() {
        int i = this.c2;
        if (i != -1) {
            return i;
        }
        int c = (this.y & 1) == 1 ? CodedOutputStream.c(1, this.Y1) + 0 : 0;
        for (int i2 = 0; i2 < this.Z1.size(); i2++) {
            c += CodedOutputStream.e(2, this.Z1.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.a2.size(); i4++) {
            i3 += CodedOutputStream.d(this.a2.get(i4).intValue());
        }
        int size = this.x.size() + l() + (this.a2.size() * 2) + c + i3;
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
        for (int i = 0; i < this.Z1.size(); i++) {
            if (!this.Z1.get(i).g()) {
                this.b2 = 0;
                return false;
            }
        }
        if (!i()) {
            this.b2 = 0;
            return false;
        }
        this.b2 = 1;
        return true;
    }

    public ProtoBuf$Constructor() {
        this.b2 = -1;
        this.c2 = -1;
        this.x = c.c;
    }

    public ProtoBuf$Constructor(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.b2 = -1;
        this.c2 = -1;
        this.Y1 = 6;
        this.Z1 = Collections.emptyList();
        this.a2 = Collections.emptyList();
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
                    } else if (o == 18) {
                        if (!(z2 & true)) {
                            this.Z1 = new ArrayList();
                            z2 |= true;
                        }
                        this.Z1.add(dVar.h(ProtoBuf$ValueParameter.q, eVar));
                    } else if (o == 248) {
                        if (!(z2 & true)) {
                            this.a2 = new ArrayList();
                            z2 |= true;
                        }
                        this.a2.add(Integer.valueOf(dVar.l()));
                    } else if (o == 250) {
                        int d2 = dVar.d(dVar.l());
                        if (!(z2 & true) && dVar.b() > 0) {
                            this.a2 = new ArrayList();
                            z2 |= true;
                        }
                        while (dVar.b() > 0) {
                            this.a2.add(Integer.valueOf(dVar.l()));
                        }
                        dVar.i = d2;
                        dVar.p();
                    } else if (!v(dVar, k, eVar, o)) {
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
                    this.Z1 = Collections.unmodifiableList(this.Z1);
                }
                if (z2 & true) {
                    this.a2 = Collections.unmodifiableList(this.a2);
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
            this.Z1 = Collections.unmodifiableList(this.Z1);
        }
        if (z2 & true) {
            this.a2 = Collections.unmodifiableList(this.a2);
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
