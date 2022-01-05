package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable;
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

public final class ProtoBuf$PackageFragment extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$PackageFragment> implements m {
    public static final ProtoBuf$PackageFragment d;
    public static n<ProtoBuf$PackageFragment> q = new a();
    public ProtoBuf$StringTable Y1;
    public ProtoBuf$QualifiedNameTable Z1;
    public ProtoBuf$Package a2;
    public List<ProtoBuf$Class> b2;
    public byte c2;
    public int d2;
    public final c x;
    public int y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$PackageFragment> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$PackageFragment(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.c<ProtoBuf$PackageFragment, b> implements m {
        public ProtoBuf$QualifiedNameTable Y1 = ProtoBuf$QualifiedNameTable.c;
        public ProtoBuf$Package Z1 = ProtoBuf$Package.d;
        public List<ProtoBuf$Class> a2 = Collections.emptyList();
        public int x;
        public ProtoBuf$StringTable y = ProtoBuf$StringTable.c;

        public l build() {
            ProtoBuf$PackageFragment m = m();
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
            n((ProtoBuf$PackageFragment) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public ProtoBuf$PackageFragment m() {
            ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(this, (m0.r.t.a.r.f.a) null);
            int i = this.x;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            protoBuf$PackageFragment.Y1 = this.y;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            protoBuf$PackageFragment.Z1 = this.Y1;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            protoBuf$PackageFragment.a2 = this.Z1;
            if ((i & 8) == 8) {
                this.a2 = Collections.unmodifiableList(this.a2);
                this.x &= -9;
            }
            protoBuf$PackageFragment.b2 = this.a2;
            protoBuf$PackageFragment.y = i2;
            return protoBuf$PackageFragment;
        }

        public b n(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
            ProtoBuf$Package protoBuf$Package;
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable;
            ProtoBuf$StringTable protoBuf$StringTable;
            if (protoBuf$PackageFragment == ProtoBuf$PackageFragment.d) {
                return this;
            }
            boolean z = true;
            if ((protoBuf$PackageFragment.y & 1) == 1) {
                ProtoBuf$StringTable protoBuf$StringTable2 = protoBuf$PackageFragment.Y1;
                if ((this.x & 1) != 1 || (protoBuf$StringTable = this.y) == ProtoBuf$StringTable.c) {
                    this.y = protoBuf$StringTable2;
                } else {
                    ProtoBuf$StringTable.b bVar = new ProtoBuf$StringTable.b();
                    bVar.m(protoBuf$StringTable);
                    bVar.m(protoBuf$StringTable2);
                    this.y = bVar.l();
                }
                this.x |= 1;
            }
            if ((protoBuf$PackageFragment.y & 2) == 2) {
                ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable2 = protoBuf$PackageFragment.Z1;
                if ((this.x & 2) != 2 || (protoBuf$QualifiedNameTable = this.Y1) == ProtoBuf$QualifiedNameTable.c) {
                    this.Y1 = protoBuf$QualifiedNameTable2;
                } else {
                    ProtoBuf$QualifiedNameTable.b bVar2 = new ProtoBuf$QualifiedNameTable.b();
                    bVar2.m(protoBuf$QualifiedNameTable);
                    bVar2.m(protoBuf$QualifiedNameTable2);
                    this.Y1 = bVar2.l();
                }
                this.x |= 2;
            }
            if ((protoBuf$PackageFragment.y & 4) != 4) {
                z = false;
            }
            if (z) {
                ProtoBuf$Package protoBuf$Package2 = protoBuf$PackageFragment.a2;
                if ((this.x & 4) != 4 || (protoBuf$Package = this.Z1) == ProtoBuf$Package.d) {
                    this.Z1 = protoBuf$Package2;
                } else {
                    ProtoBuf$Package.b bVar3 = new ProtoBuf$Package.b();
                    bVar3.n(protoBuf$Package);
                    bVar3.n(protoBuf$Package2);
                    this.Z1 = bVar3.m();
                }
                this.x |= 4;
            }
            if (!protoBuf$PackageFragment.b2.isEmpty()) {
                if (this.a2.isEmpty()) {
                    this.a2 = protoBuf$PackageFragment.b2;
                    this.x &= -9;
                } else {
                    if ((this.x & 8) != 8) {
                        this.a2 = new ArrayList(this.a2);
                        this.x |= 8;
                    }
                    this.a2.addAll(protoBuf$PackageFragment.b2);
                }
            }
            l(protoBuf$PackageFragment);
            this.c = this.c.c(protoBuf$PackageFragment.x);
            return this;
        }

        public b o(d dVar, e eVar) throws IOException {
            ProtoBuf$PackageFragment protoBuf$PackageFragment;
            ProtoBuf$PackageFragment protoBuf$PackageFragment2 = null;
            try {
                ProtoBuf$PackageFragment a = ProtoBuf$PackageFragment.q.a(dVar, eVar);
                if (a != null) {
                    n(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$PackageFragment = (ProtoBuf$PackageFragment) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$PackageFragment2 = protoBuf$PackageFragment;
            }
            if (protoBuf$PackageFragment2 != null) {
                n(protoBuf$PackageFragment2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment();
        d = protoBuf$PackageFragment;
        protoBuf$PackageFragment.Y1 = ProtoBuf$StringTable.c;
        protoBuf$PackageFragment.Z1 = ProtoBuf$QualifiedNameTable.c;
        protoBuf$PackageFragment.a2 = ProtoBuf$Package.d;
        protoBuf$PackageFragment.b2 = Collections.emptyList();
    }

    public ProtoBuf$PackageFragment(GeneratedMessageLite.c cVar, m0.r.t.a.r.f.a aVar) {
        super(cVar);
        this.c2 = -1;
        this.d2 = -1;
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
            codedOutputStream.r(1, this.Y1);
        }
        if ((this.y & 2) == 2) {
            codedOutputStream.r(2, this.Z1);
        }
        if ((this.y & 4) == 4) {
            codedOutputStream.r(3, this.a2);
        }
        for (int i = 0; i < this.b2.size(); i++) {
            codedOutputStream.r(4, this.b2.get(i));
        }
        q2.a(200, codedOutputStream);
        codedOutputStream.u(this.x);
    }

    public int e() {
        int i = this.d2;
        if (i != -1) {
            return i;
        }
        int e = (this.y & 1) == 1 ? CodedOutputStream.e(1, this.Y1) + 0 : 0;
        if ((this.y & 2) == 2) {
            e += CodedOutputStream.e(2, this.Z1);
        }
        if ((this.y & 4) == 4) {
            e += CodedOutputStream.e(3, this.a2);
        }
        for (int i2 = 0; i2 < this.b2.size(); i2++) {
            e += CodedOutputStream.e(4, this.b2.get(i2));
        }
        int size = this.x.size() + l() + e;
        this.d2 = size;
        return size;
    }

    public l.a f() {
        return new b();
    }

    public final boolean g() {
        byte b3 = this.c2;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if (!((this.y & 2) == 2) || this.Z1.g()) {
            if (!((this.y & 4) == 4) || this.a2.g()) {
                for (int i = 0; i < this.b2.size(); i++) {
                    if (!this.b2.get(i).g()) {
                        this.c2 = 0;
                        return false;
                    }
                }
                if (!i()) {
                    this.c2 = 0;
                    return false;
                }
                this.c2 = 1;
                return true;
            }
            this.c2 = 0;
            return false;
        }
        this.c2 = 0;
        return false;
    }

    public ProtoBuf$PackageFragment() {
        this.c2 = -1;
        this.d2 = -1;
        this.x = c.c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$b} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$PackageFragment(m0.r.t.a.r.h.d r9, m0.r.t.a.r.h.e r10, m0.r.t.a.r.f.a r11) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r8 = this;
            r8.<init>()
            r11 = -1
            r8.c2 = r11
            r8.d2 = r11
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable.c
            r8.Y1 = r11
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable.c
            r8.Z1 = r11
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package.d
            r8.a2 = r11
            java.util.List r11 = java.util.Collections.emptyList()
            r8.b2 = r11
            m0.r.t.a.r.h.c$b r11 = m0.r.t.a.r.h.c.u()
            r0 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.k(r11, r0)
            r2 = 0
            r3 = r2
        L_0x0025:
            r4 = 8
            if (r2 != 0) goto L_0x0126
            int r5 = r9.o()     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            if (r5 == 0) goto L_0x00ec
            r6 = 10
            r7 = 0
            if (r5 == r6) goto L_0x00be
            r6 = 18
            if (r5 == r6) goto L_0x008f
            r6 = 26
            if (r5 == r6) goto L_0x0061
            r6 = 34
            if (r5 == r6) goto L_0x0048
            boolean r4 = r8.v(r9, r1, r10, r5)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            if (r4 != 0) goto L_0x0025
            goto L_0x00ec
        L_0x0048:
            r5 = r3 & 8
            if (r5 == r4) goto L_0x0055
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r5.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r8.b2 = r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r3 = r3 | 8
        L_0x0055:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r5 = r8.b2     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class.q     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            m0.r.t.a.r.h.l r6 = r9.h(r6, r10)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r5.add(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            goto L_0x0025
        L_0x0061:
            int r5 = r8.y     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r6 = 4
            r5 = r5 & r6
            if (r5 != r6) goto L_0x0074
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r5 = r8.a2     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$b r7 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$b     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r7.n(r5)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
        L_0x0074:
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package> r5 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package.q     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            m0.r.t.a.r.h.l r5 = r9.h(r5, r10)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package) r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r8.a2 = r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            if (r7 == 0) goto L_0x0089
            r7.n(r5)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r5 = r7.m()     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r8.a2 = r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
        L_0x0089:
            int r5 = r8.y     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r5 = r5 | r6
            r8.y = r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            goto L_0x0025
        L_0x008f:
            int r5 = r8.y     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r6 = 2
            r5 = r5 & r6
            if (r5 != r6) goto L_0x00a2
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r5 = r8.Z1     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$b r7 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$b     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r7.m(r5)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
        L_0x00a2:
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable> r5 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable.d     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            m0.r.t.a.r.h.l r5 = r9.h(r5, r10)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable) r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r8.Z1 = r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            if (r7 == 0) goto L_0x00b7
            r7.m(r5)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r5 = r7.l()     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r8.Z1 = r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
        L_0x00b7:
            int r5 = r8.y     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r5 = r5 | r6
            r8.y = r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            goto L_0x0025
        L_0x00be:
            int r5 = r8.y     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r5 = r5 & r0
            if (r5 != r0) goto L_0x00d0
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r5 = r8.Y1     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$b r7 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$b     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r7.m(r5)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
        L_0x00d0:
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable> r5 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable.d     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            m0.r.t.a.r.h.l r5 = r9.h(r5, r10)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r5 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable) r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r8.Y1 = r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            if (r7 == 0) goto L_0x00e5
            r7.m(r5)     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r5 = r7.l()     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r8.Y1 = r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
        L_0x00e5:
            int r5 = r8.y     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            r5 = r5 | r0
            r8.y = r5     // Catch:{ InvalidProtocolBufferException -> 0x00fe, IOException -> 0x00f1 }
            goto L_0x0025
        L_0x00ec:
            r2 = r0
            goto L_0x0025
        L_0x00ef:
            r9 = move-exception
            goto L_0x0102
        L_0x00f1:
            r9 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r10 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00ef }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00ef }
            r10.<init>(r9)     // Catch:{ all -> 0x00ef }
            r10.c = r8     // Catch:{ all -> 0x00ef }
            throw r10     // Catch:{ all -> 0x00ef }
        L_0x00fe:
            r9 = move-exception
            r9.c = r8     // Catch:{ all -> 0x00ef }
            throw r9     // Catch:{ all -> 0x00ef }
        L_0x0102:
            r10 = r3 & 8
            if (r10 != r4) goto L_0x010e
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r10 = r8.b2
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r8.b2 = r10
        L_0x010e:
            r1.j()     // Catch:{ IOException -> 0x011a, all -> 0x0112 }
            goto L_0x011a
        L_0x0112:
            r9 = move-exception
            m0.r.t.a.r.h.c r10 = r11.e()
            r8.x = r10
            throw r9
        L_0x011a:
            m0.r.t.a.r.h.c r10 = r11.e()
            r8.x = r10
            m0.r.t.a.r.h.f<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d> r10 = r8.c
            r10.i()
            throw r9
        L_0x0126:
            r9 = r3 & 8
            if (r9 != r4) goto L_0x0132
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r9 = r8.b2
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            r8.b2 = r9
        L_0x0132:
            r1.j()     // Catch:{ IOException -> 0x013e, all -> 0x0136 }
            goto L_0x013e
        L_0x0136:
            r9 = move-exception
            m0.r.t.a.r.h.c r10 = r11.e()
            r8.x = r10
            throw r9
        L_0x013e:
            m0.r.t.a.r.h.c r9 = r11.e()
            r8.x = r9
            m0.r.t.a.r.h.f<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d> r9 = r8.c
            r9.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment.<init>(m0.r.t.a.r.h.d, m0.r.t.a.r.h.e, m0.r.t.a.r.f.a):void");
    }
}
