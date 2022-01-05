package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
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

public final class ProtoBuf$VersionRequirement extends GeneratedMessageLite implements m {
    public static final ProtoBuf$VersionRequirement c;
    public static n<ProtoBuf$VersionRequirement> d = new a();
    public int Y1;
    public Level Z1;
    public int a2;
    public int b2;
    public VersionKind c2;
    public byte d2;
    public int e2;
    public final c q;
    public int x;
    public int y;

    public enum Level implements Internal.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        
        private static Internal.b<Level> internalValueMap;
        private final int value;

        public static class a implements Internal.b<Level> {
            public Internal.a a(int i) {
                return Level.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a();
        }

        private Level(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static Level valueOf(int i) {
            if (i == 0) {
                return WARNING;
            }
            if (i == 1) {
                return ERROR;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }
    }

    public enum VersionKind implements Internal.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        
        private static Internal.b<VersionKind> internalValueMap;
        private final int value;

        public static class a implements Internal.b<VersionKind> {
            public Internal.a a(int i) {
                return VersionKind.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            internalValueMap = new a();
        }

        private VersionKind(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static VersionKind valueOf(int i) {
            if (i == 0) {
                return LANGUAGE_VERSION;
            }
            if (i == 1) {
                return COMPILER_VERSION;
            }
            if (i != 2) {
                return null;
            }
            return API_VERSION;
        }
    }

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$VersionRequirement> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$VersionRequirement(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.b<ProtoBuf$VersionRequirement, b> implements m {
        public int Y1;
        public int Z1;
        public VersionKind a2 = VersionKind.LANGUAGE_VERSION;
        public int d;
        public int q;
        public int x;
        public Level y = Level.ERROR;

        public l build() {
            ProtoBuf$VersionRequirement l = l();
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
            m((ProtoBuf$VersionRequirement) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            n(dVar, eVar);
            return this;
        }

        public ProtoBuf$VersionRequirement l() {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement(this, (m0.r.t.a.r.f.a) null);
            int i = this.d;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$VersionRequirement.y = this.q;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$VersionRequirement.Y1 = this.x;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$VersionRequirement.Z1 = this.y;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            protoBuf$VersionRequirement.a2 = this.Y1;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            protoBuf$VersionRequirement.b2 = this.Z1;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            protoBuf$VersionRequirement.c2 = this.a2;
            protoBuf$VersionRequirement.x = i2;
            return protoBuf$VersionRequirement;
        }

        public b m(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
            if (protoBuf$VersionRequirement == ProtoBuf$VersionRequirement.c) {
                return this;
            }
            int i = protoBuf$VersionRequirement.x;
            boolean z = false;
            if ((i & 1) == 1) {
                int i2 = protoBuf$VersionRequirement.y;
                this.d |= 1;
                this.q = i2;
            }
            if ((i & 2) == 2) {
                int i3 = protoBuf$VersionRequirement.Y1;
                this.d = 2 | this.d;
                this.x = i3;
            }
            if ((i & 4) == 4) {
                Level level = protoBuf$VersionRequirement.Z1;
                Objects.requireNonNull(level);
                this.d = 4 | this.d;
                this.y = level;
            }
            int i4 = protoBuf$VersionRequirement.x;
            if ((i4 & 8) == 8) {
                int i5 = protoBuf$VersionRequirement.a2;
                this.d = 8 | this.d;
                this.Y1 = i5;
            }
            if ((i4 & 16) == 16) {
                int i6 = protoBuf$VersionRequirement.b2;
                this.d = 16 | this.d;
                this.Z1 = i6;
            }
            if ((i4 & 32) == 32) {
                z = true;
            }
            if (z) {
                VersionKind versionKind = protoBuf$VersionRequirement.c2;
                Objects.requireNonNull(versionKind);
                this.d = 32 | this.d;
                this.a2 = versionKind;
            }
            this.c = this.c.c(protoBuf$VersionRequirement.q);
            return this;
        }

        public b n(d dVar, e eVar) throws IOException {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement;
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement2 = null;
            try {
                ProtoBuf$VersionRequirement a = ProtoBuf$VersionRequirement.d.a(dVar, eVar);
                if (a != null) {
                    m(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$VersionRequirement = (ProtoBuf$VersionRequirement) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$VersionRequirement2 = protoBuf$VersionRequirement;
            }
            if (protoBuf$VersionRequirement2 != null) {
                m(protoBuf$VersionRequirement2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement();
        c = protoBuf$VersionRequirement;
        protoBuf$VersionRequirement.y = 0;
        protoBuf$VersionRequirement.Y1 = 0;
        protoBuf$VersionRequirement.Z1 = Level.ERROR;
        protoBuf$VersionRequirement.a2 = 0;
        protoBuf$VersionRequirement.b2 = 0;
        protoBuf$VersionRequirement.c2 = VersionKind.LANGUAGE_VERSION;
    }

    public ProtoBuf$VersionRequirement(GeneratedMessageLite.b bVar, m0.r.t.a.r.f.a aVar) {
        super(bVar);
        this.d2 = -1;
        this.e2 = -1;
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
        if ((this.x & 8) == 8) {
            codedOutputStream.p(4, this.a2);
        }
        if ((this.x & 16) == 16) {
            codedOutputStream.p(5, this.b2);
        }
        if ((this.x & 32) == 32) {
            codedOutputStream.n(6, this.c2.getNumber());
        }
        codedOutputStream.u(this.q);
    }

    public int e() {
        int i = this.e2;
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
        if ((this.x & 8) == 8) {
            i2 += CodedOutputStream.c(4, this.a2);
        }
        if ((this.x & 16) == 16) {
            i2 += CodedOutputStream.c(5, this.b2);
        }
        if ((this.x & 32) == 32) {
            i2 += CodedOutputStream.b(6, this.c2.getNumber());
        }
        int size = this.q.size() + i2;
        this.e2 = size;
        return size;
    }

    public l.a f() {
        return new b();
    }

    public final boolean g() {
        byte b3 = this.d2;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        this.d2 = 1;
        return true;
    }

    public ProtoBuf$VersionRequirement() {
        this.d2 = -1;
        this.e2 = -1;
        this.q = c.c;
    }

    public ProtoBuf$VersionRequirement(d dVar, e eVar, m0.r.t.a.r.f.a aVar) throws InvalidProtocolBufferException {
        this.d2 = -1;
        this.e2 = -1;
        boolean z = false;
        this.y = 0;
        this.Y1 = 0;
        this.Z1 = Level.ERROR;
        this.a2 = 0;
        this.b2 = 0;
        this.c2 = VersionKind.LANGUAGE_VERSION;
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
                        Level valueOf = Level.valueOf(l);
                        if (valueOf == null) {
                            k.y(o);
                            k.y(l);
                        } else {
                            this.x |= 4;
                            this.Z1 = valueOf;
                        }
                    } else if (o == 32) {
                        this.x |= 8;
                        this.a2 = dVar.l();
                    } else if (o == 40) {
                        this.x |= 16;
                        this.b2 = dVar.l();
                    } else if (o == 48) {
                        int l2 = dVar.l();
                        VersionKind valueOf2 = VersionKind.valueOf(l2);
                        if (valueOf2 == null) {
                            k.y(o);
                            k.y(l2);
                        } else {
                            this.x |= 32;
                            this.c2 = valueOf2;
                        }
                    } else if (!dVar.r(o, k)) {
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
