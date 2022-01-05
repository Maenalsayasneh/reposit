package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
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

public final class ProtoBuf$Package extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Package> implements m {
    public static final ProtoBuf$Package d;
    public static n<ProtoBuf$Package> q = new a();
    public List<ProtoBuf$Function> Y1;
    public List<ProtoBuf$Property> Z1;
    public List<ProtoBuf$TypeAlias> a2;
    public ProtoBuf$TypeTable b2;
    public ProtoBuf$VersionRequirementTable c2;
    public byte d2;
    public int e2;
    public final c x;
    public int y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$Package> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Package(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.c<ProtoBuf$Package, b> implements m {
        public List<ProtoBuf$Property> Y1 = Collections.emptyList();
        public List<ProtoBuf$TypeAlias> Z1 = Collections.emptyList();
        public ProtoBuf$TypeTable a2 = ProtoBuf$TypeTable.c;
        public ProtoBuf$VersionRequirementTable b2 = ProtoBuf$VersionRequirementTable.c;
        public int x;
        public List<ProtoBuf$Function> y = Collections.emptyList();

        public l build() {
            ProtoBuf$Package m = m();
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
            n((ProtoBuf$Package) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public ProtoBuf$Package m() {
            ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(this, (m0.r.t.a.r.f.a) null);
            int i = this.x;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.y = Collections.unmodifiableList(this.y);
                this.x &= -2;
            }
            protoBuf$Package.Y1 = this.y;
            if ((this.x & 2) == 2) {
                this.Y1 = Collections.unmodifiableList(this.Y1);
                this.x &= -3;
            }
            protoBuf$Package.Z1 = this.Y1;
            if ((this.x & 4) == 4) {
                this.Z1 = Collections.unmodifiableList(this.Z1);
                this.x &= -5;
            }
            protoBuf$Package.a2 = this.Z1;
            if ((i & 8) != 8) {
                i2 = 0;
            }
            protoBuf$Package.b2 = this.a2;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            protoBuf$Package.c2 = this.b2;
            protoBuf$Package.y = i2;
            return protoBuf$Package;
        }

        public b n(ProtoBuf$Package protoBuf$Package) {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            ProtoBuf$TypeTable protoBuf$TypeTable;
            if (protoBuf$Package == ProtoBuf$Package.d) {
                return this;
            }
            boolean z = true;
            if (!protoBuf$Package.Y1.isEmpty()) {
                if (this.y.isEmpty()) {
                    this.y = protoBuf$Package.Y1;
                    this.x &= -2;
                } else {
                    if ((this.x & 1) != 1) {
                        this.y = new ArrayList(this.y);
                        this.x |= 1;
                    }
                    this.y.addAll(protoBuf$Package.Y1);
                }
            }
            if (!protoBuf$Package.Z1.isEmpty()) {
                if (this.Y1.isEmpty()) {
                    this.Y1 = protoBuf$Package.Z1;
                    this.x &= -3;
                } else {
                    if ((this.x & 2) != 2) {
                        this.Y1 = new ArrayList(this.Y1);
                        this.x |= 2;
                    }
                    this.Y1.addAll(protoBuf$Package.Z1);
                }
            }
            if (!protoBuf$Package.a2.isEmpty()) {
                if (this.Z1.isEmpty()) {
                    this.Z1 = protoBuf$Package.a2;
                    this.x &= -5;
                } else {
                    if ((this.x & 4) != 4) {
                        this.Z1 = new ArrayList(this.Z1);
                        this.x |= 4;
                    }
                    this.Z1.addAll(protoBuf$Package.a2);
                }
            }
            if ((protoBuf$Package.y & 1) == 1) {
                ProtoBuf$TypeTable protoBuf$TypeTable2 = protoBuf$Package.b2;
                if ((this.x & 8) != 8 || (protoBuf$TypeTable = this.a2) == ProtoBuf$TypeTable.c) {
                    this.a2 = protoBuf$TypeTable2;
                } else {
                    ProtoBuf$TypeTable.b i = ProtoBuf$TypeTable.i(protoBuf$TypeTable);
                    i.m(protoBuf$TypeTable2);
                    this.a2 = i.l();
                }
                this.x |= 8;
            }
            if ((protoBuf$Package.y & 2) != 2) {
                z = false;
            }
            if (z) {
                ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = protoBuf$Package.c2;
                if ((this.x & 16) != 16 || (protoBuf$VersionRequirementTable = this.b2) == ProtoBuf$VersionRequirementTable.c) {
                    this.b2 = protoBuf$VersionRequirementTable2;
                } else {
                    ProtoBuf$VersionRequirementTable.b i2 = ProtoBuf$VersionRequirementTable.i(protoBuf$VersionRequirementTable);
                    i2.m(protoBuf$VersionRequirementTable2);
                    this.b2 = i2.l();
                }
                this.x |= 16;
            }
            l(protoBuf$Package);
            this.c = this.c.c(protoBuf$Package.x);
            return this;
        }

        public b o(d dVar, e eVar) throws IOException {
            ProtoBuf$Package protoBuf$Package;
            ProtoBuf$Package protoBuf$Package2 = null;
            try {
                ProtoBuf$Package a = ProtoBuf$Package.q.a(dVar, eVar);
                if (a != null) {
                    n(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Package = (ProtoBuf$Package) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Package2 = protoBuf$Package;
            }
            if (protoBuf$Package2 != null) {
                n(protoBuf$Package2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package();
        d = protoBuf$Package;
        protoBuf$Package.x();
    }

    public ProtoBuf$Package(GeneratedMessageLite.c cVar, m0.r.t.a.r.f.a aVar) {
        super(cVar);
        this.d2 = -1;
        this.e2 = -1;
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
        for (int i = 0; i < this.Y1.size(); i++) {
            codedOutputStream.r(3, this.Y1.get(i));
        }
        for (int i2 = 0; i2 < this.Z1.size(); i2++) {
            codedOutputStream.r(4, this.Z1.get(i2));
        }
        for (int i3 = 0; i3 < this.a2.size(); i3++) {
            codedOutputStream.r(5, this.a2.get(i3));
        }
        if ((this.y & 1) == 1) {
            codedOutputStream.r(30, this.b2);
        }
        if ((this.y & 2) == 2) {
            codedOutputStream.r(32, this.c2);
        }
        q2.a(200, codedOutputStream);
        codedOutputStream.u(this.x);
    }

    public int e() {
        int i = this.e2;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.Y1.size(); i3++) {
            i2 += CodedOutputStream.e(3, this.Y1.get(i3));
        }
        for (int i4 = 0; i4 < this.Z1.size(); i4++) {
            i2 += CodedOutputStream.e(4, this.Z1.get(i4));
        }
        for (int i5 = 0; i5 < this.a2.size(); i5++) {
            i2 += CodedOutputStream.e(5, this.a2.get(i5));
        }
        if ((this.y & 1) == 1) {
            i2 += CodedOutputStream.e(30, this.b2);
        }
        if ((this.y & 2) == 2) {
            i2 += CodedOutputStream.e(32, this.c2);
        }
        int size = this.x.size() + l() + i2;
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
        for (int i = 0; i < this.Y1.size(); i++) {
            if (!this.Y1.get(i).g()) {
                this.d2 = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.Z1.size(); i2++) {
            if (!this.Z1.get(i2).g()) {
                this.d2 = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.a2.size(); i3++) {
            if (!this.a2.get(i3).g()) {
                this.d2 = 0;
                return false;
            }
        }
        if (((this.y & 1) == 1) && !this.b2.g()) {
            this.d2 = 0;
            return false;
        } else if (!i()) {
            this.d2 = 0;
            return false;
        } else {
            this.d2 = 1;
            return true;
        }
    }

    public final void x() {
        this.Y1 = Collections.emptyList();
        this.Z1 = Collections.emptyList();
        this.a2 = Collections.emptyList();
        this.b2 = ProtoBuf$TypeTable.c;
        this.c2 = ProtoBuf$VersionRequirementTable.c;
    }

    public ProtoBuf$Package() {
        this.d2 = -1;
        this.e2 = -1;
        this.x = c.c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$Package(m0.r.t.a.r.h.d r10, m0.r.t.a.r.h.e r11, m0.r.t.a.r.f.a r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r9 = this;
            r9.<init>()
            r12 = -1
            r9.d2 = r12
            r9.e2 = r12
            r9.x()
            m0.r.t.a.r.h.c$b r12 = m0.r.t.a.r.h.c.u()
            r0 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.k(r12, r0)
            r2 = 0
            r3 = r2
        L_0x0016:
            r4 = 2
            r5 = 4
            if (r2 != 0) goto L_0x012f
            int r6 = r10.o()     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            if (r6 == 0) goto L_0x00dd
            r7 = 26
            if (r6 == r7) goto L_0x00c3
            r7 = 34
            if (r6 == r7) goto L_0x00a9
            r7 = 42
            if (r6 == r7) goto L_0x008f
            r7 = 242(0xf2, float:3.39E-43)
            r8 = 0
            if (r6 == r7) goto L_0x0066
            r7 = 258(0x102, float:3.62E-43)
            if (r6 == r7) goto L_0x003d
            boolean r4 = r9.v(r10, r1, r11, r6)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            if (r4 != 0) goto L_0x0016
            goto L_0x00dd
        L_0x003d:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r6 = r6 & r4
            if (r6 != r4) goto L_0x004b
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r6 = r9.c2     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable.i(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
        L_0x004b:
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable> r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable.d     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            m0.r.t.a.r.h.l r6 = r10.h(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable) r6     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r9.c2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            if (r8 == 0) goto L_0x0060
            r8.m(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r6 = r8.l()     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r9.c2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
        L_0x0060:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r6 = r6 | r4
            r9.y = r6     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            goto L_0x0016
        L_0x0066:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r6 = r6 & r0
            if (r6 != r0) goto L_0x0074
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r6 = r9.b2     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.i(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
        L_0x0074:
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.d     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            m0.r.t.a.r.h.l r6 = r10.h(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable) r6     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r9.b2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            if (r8 == 0) goto L_0x0089
            r8.m(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r6 = r8.l()     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r9.b2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
        L_0x0089:
            int r6 = r9.y     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r6 = r6 | r0
            r9.y = r6     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            goto L_0x0016
        L_0x008f:
            r6 = r3 & 4
            if (r6 == r5) goto L_0x009c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r6.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r9.a2 = r6     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r3 = r3 | 4
        L_0x009c:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r6 = r9.a2     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias.q     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            m0.r.t.a.r.h.l r7 = r10.h(r7, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r6.add(r7)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            goto L_0x0016
        L_0x00a9:
            r6 = r3 & 2
            if (r6 == r4) goto L_0x00b6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r6.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r9.Z1 = r6     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r3 = r3 | 2
        L_0x00b6:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r6 = r9.Z1     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property.q     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            m0.r.t.a.r.h.l r7 = r10.h(r7, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r6.add(r7)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            goto L_0x0016
        L_0x00c3:
            r6 = r3 & 1
            if (r6 == r0) goto L_0x00d0
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r6.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r9.Y1 = r6     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r3 = r3 | 1
        L_0x00d0:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r6 = r9.Y1     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.q     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            m0.r.t.a.r.h.l r7 = r10.h(r7, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            r6.add(r7)     // Catch:{ InvalidProtocolBufferException -> 0x00ef, IOException -> 0x00e2 }
            goto L_0x0016
        L_0x00dd:
            r2 = r0
            goto L_0x0016
        L_0x00e0:
            r10 = move-exception
            goto L_0x00f3
        L_0x00e2:
            r10 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00e0 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00e0 }
            r11.<init>(r10)     // Catch:{ all -> 0x00e0 }
            r11.c = r9     // Catch:{ all -> 0x00e0 }
            throw r11     // Catch:{ all -> 0x00e0 }
        L_0x00ef:
            r10 = move-exception
            r10.c = r9     // Catch:{ all -> 0x00e0 }
            throw r10     // Catch:{ all -> 0x00e0 }
        L_0x00f3:
            r11 = r3 & 1
            if (r11 != r0) goto L_0x00ff
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r11 = r9.Y1
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.Y1 = r11
        L_0x00ff:
            r11 = r3 & 2
            if (r11 != r4) goto L_0x010b
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r11 = r9.Z1
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.Z1 = r11
        L_0x010b:
            r11 = r3 & 4
            if (r11 != r5) goto L_0x0117
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r11 = r9.a2
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.a2 = r11
        L_0x0117:
            r1.j()     // Catch:{ IOException -> 0x0123, all -> 0x011b }
            goto L_0x0123
        L_0x011b:
            r10 = move-exception
            m0.r.t.a.r.h.c r11 = r12.e()
            r9.x = r11
            throw r10
        L_0x0123:
            m0.r.t.a.r.h.c r11 = r12.e()
            r9.x = r11
            m0.r.t.a.r.h.f<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d> r11 = r9.c
            r11.i()
            throw r10
        L_0x012f:
            r10 = r3 & 1
            if (r10 != r0) goto L_0x013b
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r10 = r9.Y1
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.Y1 = r10
        L_0x013b:
            r10 = r3 & 2
            if (r10 != r4) goto L_0x0147
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r10 = r9.Z1
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.Z1 = r10
        L_0x0147:
            r10 = r3 & 4
            if (r10 != r5) goto L_0x0153
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r10 = r9.a2
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.a2 = r10
        L_0x0153:
            r1.j()     // Catch:{ IOException -> 0x015f, all -> 0x0157 }
            goto L_0x015f
        L_0x0157:
            r10 = move-exception
            m0.r.t.a.r.h.c r11 = r12.e()
            r9.x = r11
            throw r10
        L_0x015f:
            m0.r.t.a.r.h.c r10 = r12.e()
            r9.x = r10
            m0.r.t.a.r.h.f<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d> r10 = r9.c
            r10.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package.<init>(m0.r.t.a.r.h.d, m0.r.t.a.r.h.e, m0.r.t.a.r.f.a):void");
    }
}
