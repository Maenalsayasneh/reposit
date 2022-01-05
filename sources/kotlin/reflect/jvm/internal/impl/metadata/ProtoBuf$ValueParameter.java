package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
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

public final class ProtoBuf$ValueParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$ValueParameter> implements m {
    public static final ProtoBuf$ValueParameter d;
    public static n<ProtoBuf$ValueParameter> q = new a();
    public int Y1;
    public int Z1;
    public ProtoBuf$Type a2;
    public int b2;
    public ProtoBuf$Type c2;
    public int d2;
    public byte e2;
    public int f2;
    public final c x;
    public int y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$ValueParameter> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$ValueParameter(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.c<ProtoBuf$ValueParameter, b> implements m {
        public int Y1;
        public ProtoBuf$Type Z1;
        public int a2;
        public ProtoBuf$Type b2;
        public int c2;
        public int x;
        public int y;

        public b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.d;
            this.Z1 = protoBuf$Type;
            this.b2 = protoBuf$Type;
        }

        public l build() {
            ProtoBuf$ValueParameter m = m();
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
            n((ProtoBuf$ValueParameter) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public ProtoBuf$ValueParameter m() {
            ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(this, (m0.r.t.a.r.f.a) null);
            int i = this.x;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$ValueParameter.Y1 = this.y;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$ValueParameter.Z1 = this.Y1;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$ValueParameter.a2 = this.Z1;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$ValueParameter.b2 = this.a2;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$ValueParameter.c2 = this.b2;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            protoBuf$ValueParameter.d2 = this.c2;
            protoBuf$ValueParameter.y = i2;
            return protoBuf$ValueParameter;
        }

        public b n(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$ValueParameter == ProtoBuf$ValueParameter.d) {
                return this;
            }
            int i = protoBuf$ValueParameter.y;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = protoBuf$ValueParameter.Y1;
                this.x |= 1;
                this.y = i2;
            }
            if ((i & 2) == 2) {
                int i3 = protoBuf$ValueParameter.Z1;
                this.x = 2 | this.x;
                this.Y1 = i3;
            }
            if (protoBuf$ValueParameter.x()) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$ValueParameter.a2;
                if ((this.x & 4) != 4 || (protoBuf$Type2 = this.Z1) == ProtoBuf$Type.d) {
                    this.Z1 = protoBuf$Type3;
                } else {
                    this.Z1 = i0.d.a.a.a.p1(protoBuf$Type2, protoBuf$Type3);
                }
                this.x |= 4;
            }
            if ((protoBuf$ValueParameter.y & 8) == 8) {
                int i4 = protoBuf$ValueParameter.b2;
                this.x = 8 | this.x;
                this.a2 = i4;
            }
            if (protoBuf$ValueParameter.y()) {
                ProtoBuf$Type protoBuf$Type4 = protoBuf$ValueParameter.c2;
                if ((this.x & 16) != 16 || (protoBuf$Type = this.b2) == ProtoBuf$Type.d) {
                    this.b2 = protoBuf$Type4;
                } else {
                    this.b2 = i0.d.a.a.a.p1(protoBuf$Type, protoBuf$Type4);
                }
                this.x |= 16;
            }
            if ((protoBuf$ValueParameter.y & 32) == 32) {
                z = true;
            }
            if (z) {
                int i5 = protoBuf$ValueParameter.d2;
                this.x = 32 | this.x;
                this.c2 = i5;
            }
            l(protoBuf$ValueParameter);
            this.c = this.c.c(protoBuf$ValueParameter.x);
            return this;
        }

        public b o(d dVar, e eVar) throws IOException {
            ProtoBuf$ValueParameter protoBuf$ValueParameter;
            ProtoBuf$ValueParameter protoBuf$ValueParameter2 = null;
            try {
                ProtoBuf$ValueParameter a = ProtoBuf$ValueParameter.q.a(dVar, eVar);
                if (a != null) {
                    n(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$ValueParameter = (ProtoBuf$ValueParameter) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$ValueParameter2 = protoBuf$ValueParameter;
            }
            if (protoBuf$ValueParameter2 != null) {
                n(protoBuf$ValueParameter2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter();
        d = protoBuf$ValueParameter;
        protoBuf$ValueParameter.Y1 = 0;
        protoBuf$ValueParameter.Z1 = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.d;
        protoBuf$ValueParameter.a2 = protoBuf$Type;
        protoBuf$ValueParameter.b2 = 0;
        protoBuf$ValueParameter.c2 = protoBuf$Type;
        protoBuf$ValueParameter.d2 = 0;
    }

    public ProtoBuf$ValueParameter(GeneratedMessageLite.c cVar, m0.r.t.a.r.f.a aVar) {
        super(cVar);
        this.e2 = -1;
        this.f2 = -1;
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
            codedOutputStream.r(3, this.a2);
        }
        if ((this.y & 16) == 16) {
            codedOutputStream.r(4, this.c2);
        }
        if ((this.y & 8) == 8) {
            codedOutputStream.p(5, this.b2);
        }
        if ((this.y & 32) == 32) {
            codedOutputStream.p(6, this.d2);
        }
        q2.a(200, codedOutputStream);
        codedOutputStream.u(this.x);
    }

    public int e() {
        int i = this.f2;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.y & 1) == 1) {
            i2 = 0 + CodedOutputStream.c(1, this.Y1);
        }
        if ((this.y & 2) == 2) {
            i2 += CodedOutputStream.c(2, this.Z1);
        }
        if ((this.y & 4) == 4) {
            i2 += CodedOutputStream.e(3, this.a2);
        }
        if ((this.y & 16) == 16) {
            i2 += CodedOutputStream.e(4, this.c2);
        }
        if ((this.y & 8) == 8) {
            i2 += CodedOutputStream.c(5, this.b2);
        }
        if ((this.y & 32) == 32) {
            i2 += CodedOutputStream.c(6, this.d2);
        }
        int size = this.x.size() + l() + i2;
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
        if (!((this.y & 2) == 2)) {
            this.e2 = 0;
            return false;
        } else if (x() && !this.a2.g()) {
            this.e2 = 0;
            return false;
        } else if (y() && !this.c2.g()) {
            this.e2 = 0;
            return false;
        } else if (!i()) {
            this.e2 = 0;
            return false;
        } else {
            this.e2 = 1;
            return true;
        }
    }

    public boolean x() {
        return (this.y & 4) == 4;
    }

    public boolean y() {
        return (this.y & 16) == 16;
    }

    public ProtoBuf$ValueParameter() {
        this.e2 = -1;
        this.f2 = -1;
        this.x = c.c;
    }

    public ProtoBuf$ValueParameter(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.e2 = -1;
        this.f2 = -1;
        boolean z = false;
        this.Y1 = 0;
        this.Z1 = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.d;
        this.a2 = protoBuf$Type;
        this.b2 = 0;
        this.c2 = protoBuf$Type;
        this.d2 = 0;
        c.b u = c.u();
        CodedOutputStream k = CodedOutputStream.k(u, 1);
        while (!z) {
            try {
                int o = dVar.o();
                if (o != 0) {
                    if (o == 8) {
                        this.y |= 1;
                        this.Y1 = dVar.l();
                    } else if (o != 16) {
                        ProtoBuf$Type.b bVar = null;
                        if (o == 26) {
                            bVar = (this.y & 4) == 4 ? this.a2.c() : bVar;
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) dVar.h(ProtoBuf$Type.q, eVar);
                            this.a2 = protoBuf$Type2;
                            if (bVar != null) {
                                bVar.j(protoBuf$Type2);
                                this.a2 = bVar.m();
                            }
                            this.y |= 4;
                        } else if (o == 34) {
                            bVar = (this.y & 16) == 16 ? this.c2.c() : bVar;
                            ProtoBuf$Type protoBuf$Type3 = (ProtoBuf$Type) dVar.h(ProtoBuf$Type.q, eVar);
                            this.c2 = protoBuf$Type3;
                            if (bVar != null) {
                                bVar.j(protoBuf$Type3);
                                this.c2 = bVar.m();
                            }
                            this.y |= 16;
                        } else if (o == 40) {
                            this.y |= 8;
                            this.b2 = dVar.l();
                        } else if (o == 48) {
                            this.y |= 32;
                            this.d2 = dVar.l();
                        } else if (!v(dVar, k, eVar, o)) {
                        }
                    } else {
                        this.y |= 2;
                        this.Z1 = dVar.l();
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
