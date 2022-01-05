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

public final class ProtoBuf$QualifiedNameTable extends GeneratedMessageLite implements m {
    public static final ProtoBuf$QualifiedNameTable c;
    public static n<ProtoBuf$QualifiedNameTable> d = new a();
    public int Y1;
    public final c q;
    public List<QualifiedName> x;
    public byte y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$QualifiedNameTable> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$QualifiedNameTable(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.b<ProtoBuf$QualifiedNameTable, b> implements m {
        public int d;
        public List<QualifiedName> q = Collections.emptyList();

        public l build() {
            ProtoBuf$QualifiedNameTable l = l();
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
            m((ProtoBuf$QualifiedNameTable) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            n(dVar, eVar);
            return this;
        }

        public ProtoBuf$QualifiedNameTable l() {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable(this, (m0.r.t.a.r.f.a) null);
            if ((this.d & 1) == 1) {
                this.q = Collections.unmodifiableList(this.q);
                this.d &= -2;
            }
            protoBuf$QualifiedNameTable.x = this.q;
            return protoBuf$QualifiedNameTable;
        }

        public b m(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
            if (protoBuf$QualifiedNameTable == ProtoBuf$QualifiedNameTable.c) {
                return this;
            }
            if (!protoBuf$QualifiedNameTable.x.isEmpty()) {
                if (this.q.isEmpty()) {
                    this.q = protoBuf$QualifiedNameTable.x;
                    this.d &= -2;
                } else {
                    if ((this.d & 1) != 1) {
                        this.q = new ArrayList(this.q);
                        this.d |= 1;
                    }
                    this.q.addAll(protoBuf$QualifiedNameTable.x);
                }
            }
            this.c = this.c.c(protoBuf$QualifiedNameTable.q);
            return this;
        }

        public b n(d dVar, e eVar) throws IOException {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable;
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable2 = null;
            try {
                ProtoBuf$QualifiedNameTable a = ProtoBuf$QualifiedNameTable.d.a(dVar, eVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$QualifiedNameTable = (ProtoBuf$QualifiedNameTable) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$QualifiedNameTable2 = protoBuf$QualifiedNameTable;
            }
            if (protoBuf$QualifiedNameTable2 != null) {
                m(protoBuf$QualifiedNameTable2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable();
        c = protoBuf$QualifiedNameTable;
        protoBuf$QualifiedNameTable.x = Collections.emptyList();
    }

    public ProtoBuf$QualifiedNameTable(GeneratedMessageLite.b bVar, m0.r.t.a.r.f.a aVar) {
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
        for (int i = 0; i < this.x.size(); i++) {
            if (!this.x.get(i).g()) {
                this.y = 0;
                return false;
            }
        }
        this.y = 1;
        return true;
    }

    public static final class QualifiedName extends GeneratedMessageLite implements m {
        public static final QualifiedName c;
        public static n<QualifiedName> d = new a();
        public int Y1;
        public Kind Z1;
        public byte a2;
        public int b2;
        public final c q;
        public int x;
        public int y;

        public enum Kind implements Internal.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            
            private static Internal.b<Kind> internalValueMap;
            private final int value;

            public static class a implements Internal.b<Kind> {
                public Internal.a a(int i) {
                    return Kind.valueOf(i);
                }
            }

            /* access modifiers changed from: public */
            static {
                internalValueMap = new a();
            }

            private Kind(int i, int i2) {
                this.value = i2;
            }

            public final int getNumber() {
                return this.value;
            }

            public static Kind valueOf(int i) {
                if (i == 0) {
                    return CLASS;
                }
                if (i == 1) {
                    return PACKAGE;
                }
                if (i != 2) {
                    return null;
                }
                return LOCAL;
            }
        }

        public static class a extends m0.r.t.a.r.h.b<QualifiedName> {
            public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
                return new QualifiedName(dVar, eVar, (m0.r.t.a.r.f.a) null);
            }
        }

        public static final class b extends GeneratedMessageLite.b<QualifiedName, b> implements m {
            public int d;
            public int q = -1;
            public int x;
            public Kind y = Kind.PACKAGE;

            public l build() {
                QualifiedName l = l();
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
                m((QualifiedName) generatedMessageLite);
                return this;
            }

            public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
                n(dVar, eVar);
                return this;
            }

            public QualifiedName l() {
                QualifiedName qualifiedName = new QualifiedName(this, (m0.r.t.a.r.f.a) null);
                int i = this.d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                qualifiedName.y = this.q;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                qualifiedName.Y1 = this.x;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                qualifiedName.Z1 = this.y;
                qualifiedName.x = i2;
                return qualifiedName;
            }

            public b m(QualifiedName qualifiedName) {
                if (qualifiedName == QualifiedName.c) {
                    return this;
                }
                int i = qualifiedName.x;
                boolean z = false;
                if ((i & 1) == 1) {
                    int i2 = qualifiedName.y;
                    this.d |= 1;
                    this.q = i2;
                }
                if ((i & 2) == 2) {
                    int i3 = qualifiedName.Y1;
                    this.d = 2 | this.d;
                    this.x = i3;
                }
                if ((i & 4) == 4) {
                    z = true;
                }
                if (z) {
                    Kind kind = qualifiedName.Z1;
                    Objects.requireNonNull(kind);
                    this.d = 4 | this.d;
                    this.y = kind;
                }
                this.c = this.c.c(qualifiedName.q);
                return this;
            }

            public b n(d dVar, e eVar) throws IOException {
                QualifiedName qualifiedName;
                QualifiedName qualifiedName2 = null;
                try {
                    QualifiedName a = QualifiedName.d.a(dVar, eVar);
                    if (a != null) {
                        m(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    qualifiedName = (QualifiedName) e.c;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    qualifiedName2 = qualifiedName;
                }
                if (qualifiedName2 != null) {
                    m(qualifiedName2);
                }
                throw th;
            }
        }

        static {
            QualifiedName qualifiedName = new QualifiedName();
            c = qualifiedName;
            qualifiedName.y = -1;
            qualifiedName.Y1 = 0;
            qualifiedName.Z1 = Kind.PACKAGE;
        }

        public QualifiedName(GeneratedMessageLite.b bVar, m0.r.t.a.r.f.a aVar) {
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
                codedOutputStream.p(1, this.y);
            }
            if ((this.x & 2) == 2) {
                codedOutputStream.p(2, this.Y1);
            }
            if ((this.x & 4) == 4) {
                codedOutputStream.n(3, this.Z1.getNumber());
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
                i2 = 0 + CodedOutputStream.c(1, this.y);
            }
            if ((this.x & 2) == 2) {
                i2 += CodedOutputStream.c(2, this.Y1);
            }
            if ((this.x & 4) == 4) {
                i2 += CodedOutputStream.b(3, this.Z1.getNumber());
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
            if (!((this.x & 2) == 2)) {
                this.a2 = 0;
                return false;
            }
            this.a2 = 1;
            return true;
        }

        public QualifiedName() {
            this.a2 = -1;
            this.b2 = -1;
            this.q = c.c;
        }

        public QualifiedName(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
            this.a2 = -1;
            this.b2 = -1;
            this.y = -1;
            boolean z = false;
            this.Y1 = 0;
            this.Z1 = Kind.PACKAGE;
            c.b u = c.u();
            CodedOutputStream k = CodedOutputStream.k(u, 1);
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
                            Kind valueOf = Kind.valueOf(l);
                            if (valueOf == null) {
                                k.y(o);
                                k.y(l);
                            } else {
                                this.x |= 4;
                                this.Z1 = valueOf;
                            }
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

    public ProtoBuf$QualifiedNameTable() {
        this.y = -1;
        this.Y1 = -1;
        this.q = c.c;
    }

    public ProtoBuf$QualifiedNameTable(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
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
                        this.x.add(dVar.h(QualifiedName.d, eVar));
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
