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

public final class ProtoBuf$TypeTable extends GeneratedMessageLite implements m {
    public static final ProtoBuf$TypeTable c;
    public static n<ProtoBuf$TypeTable> d = new a();
    public int Y1;
    public byte Z1;
    public int a2;
    public final c q;
    public int x;
    public List<ProtoBuf$Type> y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$TypeTable> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeTable(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.b<ProtoBuf$TypeTable, b> implements m {
        public int d;
        public List<ProtoBuf$Type> q = Collections.emptyList();
        public int x = -1;

        public l build() {
            ProtoBuf$TypeTable l = l();
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
            m((ProtoBuf$TypeTable) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            n(dVar, eVar);
            return this;
        }

        public ProtoBuf$TypeTable l() {
            ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable(this, (m0.r.t.a.r.f.a) null);
            int i = this.d;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.q = Collections.unmodifiableList(this.q);
                this.d &= -2;
            }
            protoBuf$TypeTable.y = this.q;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            protoBuf$TypeTable.Y1 = this.x;
            protoBuf$TypeTable.x = i2;
            return protoBuf$TypeTable;
        }

        public b m(ProtoBuf$TypeTable protoBuf$TypeTable) {
            if (protoBuf$TypeTable == ProtoBuf$TypeTable.c) {
                return this;
            }
            boolean z = true;
            if (!protoBuf$TypeTable.y.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = protoBuf$TypeTable.y;
                    this.d &= -2;
                } else {
                    if ((this.d & 1) != 1) {
                        this.q = new ArrayList(this.q);
                        this.d |= 1;
                    }
                    this.q.addAll(protoBuf$TypeTable.y);
                }
            }
            if ((protoBuf$TypeTable.x & 1) != 1) {
                z = false;
            }
            if (z) {
                int i = protoBuf$TypeTable.Y1;
                this.d |= 2;
                this.x = i;
            }
            this.c = this.c.c(protoBuf$TypeTable.q);
            return this;
        }

        public b n(d dVar, e eVar) throws IOException {
            ProtoBuf$TypeTable protoBuf$TypeTable;
            ProtoBuf$TypeTable protoBuf$TypeTable2 = null;
            try {
                ProtoBuf$TypeTable a = ProtoBuf$TypeTable.d.a(dVar, eVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$TypeTable = (ProtoBuf$TypeTable) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$TypeTable2 = protoBuf$TypeTable;
            }
            if (protoBuf$TypeTable2 != null) {
                m(protoBuf$TypeTable2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable();
        c = protoBuf$TypeTable;
        protoBuf$TypeTable.y = Collections.emptyList();
        protoBuf$TypeTable.Y1 = -1;
    }

    public ProtoBuf$TypeTable(GeneratedMessageLite.b bVar, m0.r.t.a.r.f.a aVar) {
        super(bVar);
        this.Z1 = -1;
        this.a2 = -1;
        this.q = bVar.c;
    }

    public static b i(ProtoBuf$TypeTable protoBuf$TypeTable) {
        b bVar = new b();
        bVar.m(protoBuf$TypeTable);
        return bVar;
    }

    public l.a c() {
        return i(this);
    }

    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        for (int i = 0; i < this.y.size(); i++) {
            codedOutputStream.r(1, this.y.get(i));
        }
        if ((this.x & 1) == 1) {
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
        for (int i3 = 0; i3 < this.y.size(); i3++) {
            i2 += CodedOutputStream.e(1, this.y.get(i3));
        }
        if ((this.x & 1) == 1) {
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
        for (int i = 0; i < this.y.size(); i++) {
            if (!this.y.get(i).g()) {
                this.Z1 = 0;
                return false;
            }
        }
        this.Z1 = 1;
        return true;
    }

    public b l() {
        return i(this);
    }

    public ProtoBuf$TypeTable() {
        this.Z1 = -1;
        this.a2 = -1;
        this.q = c.c;
    }

    public ProtoBuf$TypeTable(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.Z1 = -1;
        this.a2 = -1;
        this.y = Collections.emptyList();
        this.Y1 = -1;
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
                            this.y = new ArrayList();
                            z2 |= true;
                        }
                        this.y.add(dVar.h(ProtoBuf$Type.q, eVar));
                    } else if (o == 16) {
                        this.x |= 1;
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
                if (z2 && true) {
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
