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

public final class ProtoBuf$VersionRequirementTable extends GeneratedMessageLite implements m {
    public static final ProtoBuf$VersionRequirementTable c;
    public static n<ProtoBuf$VersionRequirementTable> d = new a();
    public int Y1;
    public final c q;
    public List<ProtoBuf$VersionRequirement> x;
    public byte y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$VersionRequirementTable> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$VersionRequirementTable(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.b<ProtoBuf$VersionRequirementTable, b> implements m {
        public int d;
        public List<ProtoBuf$VersionRequirement> q = Collections.emptyList();

        public l build() {
            ProtoBuf$VersionRequirementTable l = l();
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
            m((ProtoBuf$VersionRequirementTable) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            n(dVar, eVar);
            return this;
        }

        public ProtoBuf$VersionRequirementTable l() {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable(this, (m0.r.t.a.r.f.a) null);
            if ((this.d & 1) == 1) {
                this.q = Collections.unmodifiableList(this.q);
                this.d &= -2;
            }
            protoBuf$VersionRequirementTable.x = this.q;
            return protoBuf$VersionRequirementTable;
        }

        public b m(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if (protoBuf$VersionRequirementTable == ProtoBuf$VersionRequirementTable.c) {
                return this;
            }
            if (!protoBuf$VersionRequirementTable.x.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = protoBuf$VersionRequirementTable.x;
                    this.d &= -2;
                } else {
                    if ((this.d & 1) != 1) {
                        this.q = new ArrayList(this.q);
                        this.d |= 1;
                    }
                    this.q.addAll(protoBuf$VersionRequirementTable.x);
                }
            }
            this.c = this.c.c(protoBuf$VersionRequirementTable.q);
            return this;
        }

        public b n(d dVar, e eVar) throws IOException {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = null;
            try {
                ProtoBuf$VersionRequirementTable a = ProtoBuf$VersionRequirementTable.d.a(dVar, eVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$VersionRequirementTable = (ProtoBuf$VersionRequirementTable) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$VersionRequirementTable2 = protoBuf$VersionRequirementTable;
            }
            if (protoBuf$VersionRequirementTable2 != null) {
                m(protoBuf$VersionRequirementTable2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable();
        c = protoBuf$VersionRequirementTable;
        protoBuf$VersionRequirementTable.x = Collections.emptyList();
    }

    public ProtoBuf$VersionRequirementTable(GeneratedMessageLite.b bVar, m0.r.t.a.r.f.a aVar) {
        super(bVar);
        this.y = -1;
        this.Y1 = -1;
        this.q = bVar.c;
    }

    public static b i(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
        b bVar = new b();
        bVar.m(protoBuf$VersionRequirementTable);
        return bVar;
    }

    public l.a c() {
        return i(this);
    }

    public void d(CodedOutputStream codedOutputStream) throws IOException {
        e();
        for (int i = 0; i < this.x.size(); i++) {
            codedOutputStream.r(1, this.x.get(i));
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
            i2 += CodedOutputStream.e(1, this.x.get(i3));
        }
        int size = this.q.size() + i2;
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

    public b l() {
        return i(this);
    }

    public ProtoBuf$VersionRequirementTable() {
        this.y = -1;
        this.Y1 = -1;
        this.q = c.c;
    }

    public ProtoBuf$VersionRequirementTable(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.y = -1;
        this.Y1 = -1;
        this.x = Collections.emptyList();
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
                            this.x = new ArrayList();
                            z2 |= true;
                        }
                        this.x.add(dVar.h(ProtoBuf$VersionRequirement.d, eVar));
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
                    this.x = Collections.unmodifiableList(this.x);
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
            this.x = Collections.unmodifiableList(this.x);
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
