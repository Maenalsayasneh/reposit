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
import m0.r.t.a.r.h.i;
import m0.r.t.a.r.h.j;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.h.m;
import m0.r.t.a.r.h.n;

public final class ProtoBuf$StringTable extends GeneratedMessageLite implements m {
    public static final ProtoBuf$StringTable c;
    public static n<ProtoBuf$StringTable> d = new a();
    public int Y1;
    public final c q;
    public j x;
    public byte y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$StringTable> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$StringTable(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.b<ProtoBuf$StringTable, b> implements m {
        public int d;
        public j q = i.c;

        public l build() {
            ProtoBuf$StringTable l = l();
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
            m((ProtoBuf$StringTable) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            n(dVar, eVar);
            return this;
        }

        public ProtoBuf$StringTable l() {
            ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable(this, (m0.r.t.a.r.f.a) null);
            if ((this.d & 1) == 1) {
                this.q = this.q.p();
                this.d &= -2;
            }
            protoBuf$StringTable.x = this.q;
            return protoBuf$StringTable;
        }

        public b m(ProtoBuf$StringTable protoBuf$StringTable) {
            if (protoBuf$StringTable == ProtoBuf$StringTable.c) {
                return this;
            }
            if (!protoBuf$StringTable.x.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = protoBuf$StringTable.x;
                    this.d &= -2;
                } else {
                    if ((this.d & 1) != 1) {
                        this.q = new i(this.q);
                        this.d |= 1;
                    }
                    this.q.addAll(protoBuf$StringTable.x);
                }
            }
            this.c = this.c.c(protoBuf$StringTable.q);
            return this;
        }

        public b n(d dVar, e eVar) throws IOException {
            ProtoBuf$StringTable protoBuf$StringTable;
            ProtoBuf$StringTable protoBuf$StringTable2 = null;
            try {
                ProtoBuf$StringTable a = ProtoBuf$StringTable.d.a(dVar, eVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$StringTable = (ProtoBuf$StringTable) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$StringTable2 = protoBuf$StringTable;
            }
            if (protoBuf$StringTable2 != null) {
                m(protoBuf$StringTable2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable();
        c = protoBuf$StringTable;
        protoBuf$StringTable.x = i.c;
    }

    public ProtoBuf$StringTable(GeneratedMessageLite.b bVar, m0.r.t.a.r.f.a aVar) {
        super(bVar);
        this.y = -1;
        this.Y1 = -1;
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
            c m = this.x.m(i);
            codedOutputStream.y(10);
            codedOutputStream.m(m);
        }
        codedOutputStream.u(this.q);
    }

    public int e() {
        int i = this.Y1;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.x.size(); i3++) {
            i2 += CodedOutputStream.a(this.x.m(i3));
        }
        int size = this.q.size() + (this.x.size() * 1) + 0 + i2;
        this.Y1 = size;
        return size;
    }

    public l.a f() {
        return new b();
    }

    public final boolean g() {
        byte b2 = this.y;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.y = 1;
        return true;
    }

    public ProtoBuf$StringTable() {
        this.y = -1;
        this.Y1 = -1;
        this.q = c.c;
    }

    public ProtoBuf$StringTable(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.y = -1;
        this.Y1 = -1;
        this.x = i.c;
        c.b u = c.u();
        CodedOutputStream k = CodedOutputStream.k(u, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int o = dVar.o();
                if (o != 0) {
                    if (o == 10) {
                        c f = dVar.f();
                        if (!z2 || !true) {
                            this.x = new i();
                            z2 |= true;
                        }
                        this.x.q(f);
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
                    this.x = this.x.p();
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
            this.x = this.x.p();
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
