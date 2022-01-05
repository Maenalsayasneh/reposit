package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
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

public final class ProtoBuf$EnumEntry extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$EnumEntry> implements m {
    public static final ProtoBuf$EnumEntry d;
    public static n<ProtoBuf$EnumEntry> q = new a();
    public int Y1;
    public byte Z1;
    public int a2;
    public final c x;
    public int y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$EnumEntry> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$EnumEntry(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.c<ProtoBuf$EnumEntry, b> implements m {
        public int x;
        public int y;

        public l build() {
            ProtoBuf$EnumEntry m = m();
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
            n((ProtoBuf$EnumEntry) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public ProtoBuf$EnumEntry m() {
            ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(this, (m0.r.t.a.r.f.a) null);
            int i = 1;
            if ((this.x & 1) != 1) {
                i = 0;
            }
            protoBuf$EnumEntry.Y1 = this.y;
            protoBuf$EnumEntry.y = i;
            return protoBuf$EnumEntry;
        }

        public b n(ProtoBuf$EnumEntry protoBuf$EnumEntry) {
            if (protoBuf$EnumEntry == ProtoBuf$EnumEntry.d) {
                return this;
            }
            if ((protoBuf$EnumEntry.y & 1) == 1) {
                int i = protoBuf$EnumEntry.Y1;
                this.x = 1 | this.x;
                this.y = i;
            }
            l(protoBuf$EnumEntry);
            this.c = this.c.c(protoBuf$EnumEntry.x);
            return this;
        }

        public b o(d dVar, e eVar) throws IOException {
            ProtoBuf$EnumEntry protoBuf$EnumEntry;
            ProtoBuf$EnumEntry protoBuf$EnumEntry2 = null;
            try {
                ProtoBuf$EnumEntry a = ProtoBuf$EnumEntry.q.a(dVar, eVar);
                if (a != null) {
                    n(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$EnumEntry = (ProtoBuf$EnumEntry) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$EnumEntry2 = protoBuf$EnumEntry;
            }
            if (protoBuf$EnumEntry2 != null) {
                n(protoBuf$EnumEntry2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry();
        d = protoBuf$EnumEntry;
        protoBuf$EnumEntry.Y1 = 0;
    }

    public ProtoBuf$EnumEntry(GeneratedMessageLite.c cVar, m0.r.t.a.r.f.a aVar) {
        super(cVar);
        this.Z1 = -1;
        this.a2 = -1;
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
        q2.a(200, codedOutputStream);
        codedOutputStream.u(this.x);
    }

    public int e() {
        int i = this.a2;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.y & 1) == 1) {
            i2 = 0 + CodedOutputStream.c(1, this.Y1);
        }
        int size = this.x.size() + l() + i2;
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
        if (!i()) {
            this.Z1 = 0;
            return false;
        }
        this.Z1 = 1;
        return true;
    }

    public ProtoBuf$EnumEntry() {
        this.Z1 = -1;
        this.a2 = -1;
        this.x = c.c;
    }

    public ProtoBuf$EnumEntry(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.Z1 = -1;
        this.a2 = -1;
        boolean z = false;
        this.Y1 = 0;
        c.b u = c.u();
        CodedOutputStream k = CodedOutputStream.k(u, 1);
        while (!z) {
            try {
                int o = dVar.o();
                if (o != 0) {
                    if (o == 8) {
                        this.y |= 1;
                        this.Y1 = dVar.l();
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
