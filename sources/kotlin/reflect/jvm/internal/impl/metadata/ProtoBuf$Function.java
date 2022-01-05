package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
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

public final class ProtoBuf$Function extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Function> implements m {
    public static final ProtoBuf$Function d;
    public static n<ProtoBuf$Function> q = new a();
    public int Y1;
    public int Z1;
    public int a2;
    public ProtoBuf$Type b2;
    public int c2;
    public List<ProtoBuf$TypeParameter> d2;
    public ProtoBuf$Type e2;
    public int f2;
    public List<ProtoBuf$ValueParameter> g2;
    public ProtoBuf$TypeTable h2;
    public List<Integer> i2;
    public ProtoBuf$Contract j2;
    public byte k2;
    public int l2;
    public final c x;
    public int y;

    public static class a extends m0.r.t.a.r.h.b<ProtoBuf$Function> {
        public Object a(d dVar, e eVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Function(dVar, eVar, (m0.r.t.a.r.f.a) null);
        }
    }

    public static final class b extends GeneratedMessageLite.c<ProtoBuf$Function, b> implements m {
        public int Y1 = 6;
        public int Z1;
        public ProtoBuf$Type a2;
        public int b2;
        public List<ProtoBuf$TypeParameter> c2;
        public ProtoBuf$Type d2;
        public int e2;
        public List<ProtoBuf$ValueParameter> f2;
        public ProtoBuf$TypeTable g2;
        public List<Integer> h2;
        public ProtoBuf$Contract i2;
        public int x;
        public int y = 6;

        public b() {
            ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.d;
            this.a2 = protoBuf$Type;
            this.c2 = Collections.emptyList();
            this.d2 = protoBuf$Type;
            this.f2 = Collections.emptyList();
            this.g2 = ProtoBuf$TypeTable.c;
            this.h2 = Collections.emptyList();
            this.i2 = ProtoBuf$Contract.c;
        }

        public l build() {
            ProtoBuf$Function m = m();
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
            n((ProtoBuf$Function) generatedMessageLite);
            return this;
        }

        public /* bridge */ /* synthetic */ l.a k(d dVar, e eVar) throws IOException {
            o(dVar, eVar);
            return this;
        }

        public ProtoBuf$Function m() {
            ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(this, (m0.r.t.a.r.f.a) null);
            int i = this.x;
            int i3 = 1;
            if ((i & 1) != 1) {
                i3 = 0;
            }
            protoBuf$Function.Y1 = this.y;
            if ((i & 2) == 2) {
                i3 |= 2;
            }
            protoBuf$Function.Z1 = this.Y1;
            if ((i & 4) == 4) {
                i3 |= 4;
            }
            protoBuf$Function.a2 = this.Z1;
            if ((i & 8) == 8) {
                i3 |= 8;
            }
            protoBuf$Function.b2 = this.a2;
            if ((i & 16) == 16) {
                i3 |= 16;
            }
            protoBuf$Function.c2 = this.b2;
            if ((i & 32) == 32) {
                this.c2 = Collections.unmodifiableList(this.c2);
                this.x &= -33;
            }
            protoBuf$Function.d2 = this.c2;
            if ((i & 64) == 64) {
                i3 |= 32;
            }
            protoBuf$Function.e2 = this.d2;
            if ((i & 128) == 128) {
                i3 |= 64;
            }
            protoBuf$Function.f2 = this.e2;
            if ((this.x & 256) == 256) {
                this.f2 = Collections.unmodifiableList(this.f2);
                this.x &= -257;
            }
            protoBuf$Function.g2 = this.f2;
            if ((i & 512) == 512) {
                i3 |= 128;
            }
            protoBuf$Function.h2 = this.g2;
            if ((this.x & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                this.h2 = Collections.unmodifiableList(this.h2);
                this.x &= -1025;
            }
            protoBuf$Function.i2 = this.h2;
            if ((i & 2048) == 2048) {
                i3 |= 256;
            }
            protoBuf$Function.j2 = this.i2;
            protoBuf$Function.y = i3;
            return protoBuf$Function;
        }

        public b n(ProtoBuf$Function protoBuf$Function) {
            ProtoBuf$Contract protoBuf$Contract;
            ProtoBuf$TypeTable protoBuf$TypeTable;
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2;
            if (protoBuf$Function == ProtoBuf$Function.d) {
                return this;
            }
            int i = protoBuf$Function.y;
            boolean z = false;
            if ((i & 1) == 1) {
                int i3 = protoBuf$Function.Y1;
                this.x |= 1;
                this.y = i3;
            }
            if ((i & 2) == 2) {
                int i4 = protoBuf$Function.Z1;
                this.x = 2 | this.x;
                this.Y1 = i4;
            }
            if ((i & 4) == 4) {
                int i5 = protoBuf$Function.a2;
                this.x = 4 | this.x;
                this.Z1 = i5;
            }
            if (protoBuf$Function.z()) {
                ProtoBuf$Type protoBuf$Type3 = protoBuf$Function.b2;
                if ((this.x & 8) != 8 || (protoBuf$Type2 = this.a2) == ProtoBuf$Type.d) {
                    this.a2 = protoBuf$Type3;
                } else {
                    this.a2 = i0.d.a.a.a.p1(protoBuf$Type2, protoBuf$Type3);
                }
                this.x |= 8;
            }
            if ((protoBuf$Function.y & 16) == 16) {
                int i6 = protoBuf$Function.c2;
                this.x = 16 | this.x;
                this.b2 = i6;
            }
            if (!protoBuf$Function.d2.isEmpty()) {
                if (this.c2.isEmpty()) {
                    this.c2 = protoBuf$Function.d2;
                    this.x &= -33;
                } else {
                    if ((this.x & 32) != 32) {
                        this.c2 = new ArrayList(this.c2);
                        this.x |= 32;
                    }
                    this.c2.addAll(protoBuf$Function.d2);
                }
            }
            if (protoBuf$Function.x()) {
                ProtoBuf$Type protoBuf$Type4 = protoBuf$Function.e2;
                if ((this.x & 64) != 64 || (protoBuf$Type = this.d2) == ProtoBuf$Type.d) {
                    this.d2 = protoBuf$Type4;
                } else {
                    this.d2 = i0.d.a.a.a.p1(protoBuf$Type, protoBuf$Type4);
                }
                this.x |= 64;
            }
            if (protoBuf$Function.y()) {
                int i7 = protoBuf$Function.f2;
                this.x |= 128;
                this.e2 = i7;
            }
            if (!protoBuf$Function.g2.isEmpty()) {
                if (this.f2.isEmpty()) {
                    this.f2 = protoBuf$Function.g2;
                    this.x &= -257;
                } else {
                    if ((this.x & 256) != 256) {
                        this.f2 = new ArrayList(this.f2);
                        this.x |= 256;
                    }
                    this.f2.addAll(protoBuf$Function.g2);
                }
            }
            if ((protoBuf$Function.y & 128) == 128) {
                ProtoBuf$TypeTable protoBuf$TypeTable2 = protoBuf$Function.h2;
                if ((this.x & 512) != 512 || (protoBuf$TypeTable = this.g2) == ProtoBuf$TypeTable.c) {
                    this.g2 = protoBuf$TypeTable2;
                } else {
                    ProtoBuf$TypeTable.b i8 = ProtoBuf$TypeTable.i(protoBuf$TypeTable);
                    i8.m(protoBuf$TypeTable2);
                    this.g2 = i8.l();
                }
                this.x |= 512;
            }
            if (!protoBuf$Function.i2.isEmpty()) {
                if (this.h2.isEmpty()) {
                    this.h2 = protoBuf$Function.i2;
                    this.x &= -1025;
                } else {
                    if ((this.x & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 1024) {
                        this.h2 = new ArrayList(this.h2);
                        this.x |= RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE;
                    }
                    this.h2.addAll(protoBuf$Function.i2);
                }
            }
            if ((protoBuf$Function.y & 256) == 256) {
                z = true;
            }
            if (z) {
                ProtoBuf$Contract protoBuf$Contract2 = protoBuf$Function.j2;
                if ((this.x & 2048) != 2048 || (protoBuf$Contract = this.i2) == ProtoBuf$Contract.c) {
                    this.i2 = protoBuf$Contract2;
                } else {
                    ProtoBuf$Contract.b bVar = new ProtoBuf$Contract.b();
                    bVar.m(protoBuf$Contract);
                    bVar.m(protoBuf$Contract2);
                    this.i2 = bVar.l();
                }
                this.x |= 2048;
            }
            l(protoBuf$Function);
            this.c = this.c.c(protoBuf$Function.x);
            return this;
        }

        public b o(d dVar, e eVar) throws IOException {
            ProtoBuf$Function protoBuf$Function;
            ProtoBuf$Function protoBuf$Function2 = null;
            try {
                ProtoBuf$Function a = ProtoBuf$Function.q.a(dVar, eVar);
                if (a != null) {
                    n(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Function = (ProtoBuf$Function) e.c;
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Function2 = protoBuf$Function;
            }
            if (protoBuf$Function2 != null) {
                n(protoBuf$Function2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function();
        d = protoBuf$Function;
        protoBuf$Function.A();
    }

    public ProtoBuf$Function(GeneratedMessageLite.c cVar, m0.r.t.a.r.f.a aVar) {
        super(cVar);
        this.k2 = -1;
        this.l2 = -1;
        this.x = cVar.c;
    }

    public final void A() {
        this.Y1 = 6;
        this.Z1 = 6;
        this.a2 = 0;
        ProtoBuf$Type protoBuf$Type = ProtoBuf$Type.d;
        this.b2 = protoBuf$Type;
        this.c2 = 0;
        this.d2 = Collections.emptyList();
        this.e2 = protoBuf$Type;
        this.f2 = 0;
        this.g2 = Collections.emptyList();
        this.h2 = ProtoBuf$TypeTable.c;
        this.i2 = Collections.emptyList();
        this.j2 = ProtoBuf$Contract.c;
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
        if ((this.y & 2) == 2) {
            codedOutputStream.p(1, this.Z1);
        }
        if ((this.y & 4) == 4) {
            codedOutputStream.p(2, this.a2);
        }
        if ((this.y & 8) == 8) {
            codedOutputStream.r(3, this.b2);
        }
        for (int i = 0; i < this.d2.size(); i++) {
            codedOutputStream.r(4, this.d2.get(i));
        }
        if ((this.y & 32) == 32) {
            codedOutputStream.r(5, this.e2);
        }
        for (int i3 = 0; i3 < this.g2.size(); i3++) {
            codedOutputStream.r(6, this.g2.get(i3));
        }
        if ((this.y & 16) == 16) {
            codedOutputStream.p(7, this.c2);
        }
        if ((this.y & 64) == 64) {
            codedOutputStream.p(8, this.f2);
        }
        if ((this.y & 1) == 1) {
            codedOutputStream.p(9, this.Y1);
        }
        if ((this.y & 128) == 128) {
            codedOutputStream.r(30, this.h2);
        }
        for (int i4 = 0; i4 < this.i2.size(); i4++) {
            codedOutputStream.p(31, this.i2.get(i4).intValue());
        }
        if ((this.y & 256) == 256) {
            codedOutputStream.r(32, this.j2);
        }
        q2.a(19000, codedOutputStream);
        codedOutputStream.u(this.x);
    }

    public int e() {
        int i = this.l2;
        if (i != -1) {
            return i;
        }
        int c = (this.y & 2) == 2 ? CodedOutputStream.c(1, this.Z1) + 0 : 0;
        if ((this.y & 4) == 4) {
            c += CodedOutputStream.c(2, this.a2);
        }
        if ((this.y & 8) == 8) {
            c += CodedOutputStream.e(3, this.b2);
        }
        for (int i3 = 0; i3 < this.d2.size(); i3++) {
            c += CodedOutputStream.e(4, this.d2.get(i3));
        }
        if ((this.y & 32) == 32) {
            c += CodedOutputStream.e(5, this.e2);
        }
        for (int i4 = 0; i4 < this.g2.size(); i4++) {
            c += CodedOutputStream.e(6, this.g2.get(i4));
        }
        if ((this.y & 16) == 16) {
            c += CodedOutputStream.c(7, this.c2);
        }
        if ((this.y & 64) == 64) {
            c += CodedOutputStream.c(8, this.f2);
        }
        if ((this.y & 1) == 1) {
            c += CodedOutputStream.c(9, this.Y1);
        }
        if ((this.y & 128) == 128) {
            c += CodedOutputStream.e(30, this.h2);
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.i2.size(); i6++) {
            i5 += CodedOutputStream.d(this.i2.get(i6).intValue());
        }
        int size = (this.i2.size() * 2) + c + i5;
        if ((this.y & 256) == 256) {
            size += CodedOutputStream.e(32, this.j2);
        }
        int size2 = this.x.size() + l() + size;
        this.l2 = size2;
        return size2;
    }

    public l.a f() {
        return new b();
    }

    public final boolean g() {
        byte b3 = this.k2;
        if (b3 == 1) {
            return true;
        }
        if (b3 == 0) {
            return false;
        }
        if (!((this.y & 4) == 4)) {
            this.k2 = 0;
            return false;
        } else if (!z() || this.b2.g()) {
            for (int i = 0; i < this.d2.size(); i++) {
                if (!this.d2.get(i).g()) {
                    this.k2 = 0;
                    return false;
                }
            }
            if (!x() || this.e2.g()) {
                for (int i3 = 0; i3 < this.g2.size(); i3++) {
                    if (!this.g2.get(i3).g()) {
                        this.k2 = 0;
                        return false;
                    }
                }
                if (!((this.y & 128) == 128) || this.h2.g()) {
                    if (((this.y & 256) == 256) && !this.j2.g()) {
                        this.k2 = 0;
                        return false;
                    } else if (!i()) {
                        this.k2 = 0;
                        return false;
                    } else {
                        this.k2 = 1;
                        return true;
                    }
                } else {
                    this.k2 = 0;
                    return false;
                }
            } else {
                this.k2 = 0;
                return false;
            }
        } else {
            this.k2 = 0;
            return false;
        }
    }

    public boolean x() {
        return (this.y & 32) == 32;
    }

    public boolean y() {
        return (this.y & 64) == 64;
    }

    public boolean z() {
        return (this.y & 8) == 8;
    }

    public ProtoBuf$Function() {
        this.k2 = -1;
        this.l2 = -1;
        this.x = c.c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$Function(m0.r.t.a.r.h.d r11, m0.r.t.a.r.h.e r12, m0.r.t.a.r.f.a r13) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r10 = this;
            r10.<init>()
            r13 = -1
            r10.k2 = r13
            r10.l2 = r13
            r10.A()
            m0.r.t.a.r.h.c$b r13 = m0.r.t.a.r.h.c.u()
            r0 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r1 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.k(r13, r0)
            r2 = 0
            r3 = r2
        L_0x0016:
            r4 = 32
            r5 = 256(0x100, float:3.59E-43)
            r6 = 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L_0x01f3
            int r7 = r11.o()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r8 = 0
            switch(r7) {
                case 0: goto L_0x01a1;
                case 8: goto L_0x0191;
                case 16: goto L_0x0183;
                case 26: goto L_0x015a;
                case 34: goto L_0x0140;
                case 42: goto L_0x0119;
                case 50: goto L_0x00ff;
                case 56: goto L_0x00f1;
                case 64: goto L_0x00e3;
                case 72: goto L_0x00d6;
                case 242: goto L_0x00aa;
                case 248: goto L_0x008e;
                case 250: goto L_0x0059;
                case 258: goto L_0x002c;
                default: goto L_0x0026;
            }     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
        L_0x0026:
            boolean r4 = r10.v(r11, r1, r12, r7)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x019f
        L_0x002c:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7 = r7 & r5
            if (r7 != r5) goto L_0x003e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r7 = r10.j2     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$b r8 = new kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$b     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r8.m(r7)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
        L_0x003e:
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract.d     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            m0.r.t.a.r.h.l r7 = r11.h(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract) r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.j2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            if (r8 == 0) goto L_0x0053
            r8.m(r7)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r7 = r8.l()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.j2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
        L_0x0053:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7 = r7 | r5
            r10.y = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x0059:
            int r7 = r11.l()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            int r7 = r11.d(r7)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r8 = r3 & 1024(0x400, float:1.435E-42)
            if (r8 == r6) goto L_0x0074
            int r8 = r11.b()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            if (r8 <= 0) goto L_0x0074
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.i2 = r8     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r3 = r3 | 1024(0x400, float:1.435E-42)
        L_0x0074:
            int r8 = r11.b()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            if (r8 <= 0) goto L_0x0088
            java.util.List<java.lang.Integer> r8 = r10.i2     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            int r9 = r11.l()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0074
        L_0x0088:
            r11.i = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r11.p()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x008e:
            r7 = r3 & 1024(0x400, float:1.435E-42)
            if (r7 == r6) goto L_0x009b
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.i2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r3 = r3 | 1024(0x400, float:1.435E-42)
        L_0x009b:
            java.util.List<java.lang.Integer> r7 = r10.i2     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            int r8 = r11.l()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x00aa:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r9 = 128(0x80, float:1.794E-43)
            r7 = r7 & r9
            if (r7 != r9) goto L_0x00ba
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r7 = r10.h2     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.i(r7)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
        L_0x00ba:
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.d     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            m0.r.t.a.r.h.l r7 = r11.h(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable) r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.h2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            if (r8 == 0) goto L_0x00cf
            r8.m(r7)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r7 = r8.l()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.h2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
        L_0x00cf:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7 = r7 | r9
            r10.y = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x00d6:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7 = r7 | r0
            r10.y = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            int r7 = r11.l()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.Y1 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x00e3:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7 = r7 | 64
            r10.y = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            int r7 = r11.l()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.f2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x00f1:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7 = r7 | 16
            r10.y = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            int r7 = r11.l()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.c2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x00ff:
            r7 = r3 & 256(0x100, float:3.59E-43)
            if (r7 == r5) goto L_0x010c
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.g2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r3 = r3 | 256(0x100, float:3.59E-43)
        L_0x010c:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r7 = r10.g2     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter.q     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            m0.r.t.a.r.h.l r8 = r11.h(r8, r12)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x0119:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7 = r7 & r4
            if (r7 != r4) goto L_0x0124
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r10.e2     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r8 = r7.c()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
        L_0x0124:
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.q     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            m0.r.t.a.r.h.l r7 = r11.h(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.e2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            if (r8 == 0) goto L_0x0139
            r8.j(r7)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r8.m()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.e2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
        L_0x0139:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7 = r7 | r4
            r10.y = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x0140:
            r7 = r3 & 32
            if (r7 == r4) goto L_0x014d
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.d2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r3 = r3 | 32
        L_0x014d:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r7 = r10.d2     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter.q     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            m0.r.t.a.r.h.l r8 = r11.h(r8, r12)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x015a:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r9 = 8
            r7 = r7 & r9
            if (r7 != r9) goto L_0x0167
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r10.b2     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r8 = r7.c()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
        L_0x0167:
            m0.r.t.a.r.h.n<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.q     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            m0.r.t.a.r.h.l r7 = r11.h(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.b2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            if (r8 == 0) goto L_0x017c
            r8.j(r7)     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r7 = r8.m()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.b2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
        L_0x017c:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7 = r7 | r9
            r10.y = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x0183:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7 = r7 | 4
            r10.y = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            int r7 = r11.l()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.a2 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x0191:
            int r7 = r10.y     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r7 = r7 | 2
            r10.y = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            int r7 = r11.l()     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            r10.Z1 = r7     // Catch:{ InvalidProtocolBufferException -> 0x01b3, IOException -> 0x01a6 }
            goto L_0x0016
        L_0x019f:
            if (r4 != 0) goto L_0x0016
        L_0x01a1:
            r2 = r0
            goto L_0x0016
        L_0x01a4:
            r11 = move-exception
            goto L_0x01b7
        L_0x01a6:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r12 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x01a4 }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x01a4 }
            r12.<init>(r11)     // Catch:{ all -> 0x01a4 }
            r12.c = r10     // Catch:{ all -> 0x01a4 }
            throw r12     // Catch:{ all -> 0x01a4 }
        L_0x01b3:
            r11 = move-exception
            r11.c = r10     // Catch:{ all -> 0x01a4 }
            throw r11     // Catch:{ all -> 0x01a4 }
        L_0x01b7:
            r12 = r3 & 32
            if (r12 != r4) goto L_0x01c3
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r12 = r10.d2
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.d2 = r12
        L_0x01c3:
            r12 = r3 & 256(0x100, float:3.59E-43)
            if (r12 != r5) goto L_0x01cf
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r12 = r10.g2
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.g2 = r12
        L_0x01cf:
            r12 = r3 & 1024(0x400, float:1.435E-42)
            if (r12 != r6) goto L_0x01db
            java.util.List<java.lang.Integer> r12 = r10.i2
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.i2 = r12
        L_0x01db:
            r1.j()     // Catch:{ IOException -> 0x01e7, all -> 0x01df }
            goto L_0x01e7
        L_0x01df:
            r11 = move-exception
            m0.r.t.a.r.h.c r12 = r13.e()
            r10.x = r12
            throw r11
        L_0x01e7:
            m0.r.t.a.r.h.c r12 = r13.e()
            r10.x = r12
            m0.r.t.a.r.h.f<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d> r12 = r10.c
            r12.i()
            throw r11
        L_0x01f3:
            r11 = r3 & 32
            if (r11 != r4) goto L_0x01ff
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r11 = r10.d2
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.d2 = r11
        L_0x01ff:
            r11 = r3 & 256(0x100, float:3.59E-43)
            if (r11 != r5) goto L_0x020b
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r11 = r10.g2
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.g2 = r11
        L_0x020b:
            r11 = r3 & 1024(0x400, float:1.435E-42)
            if (r11 != r6) goto L_0x0217
            java.util.List<java.lang.Integer> r11 = r10.i2
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.i2 = r11
        L_0x0217:
            r1.j()     // Catch:{ IOException -> 0x0223, all -> 0x021b }
            goto L_0x0223
        L_0x021b:
            r11 = move-exception
            m0.r.t.a.r.h.c r12 = r13.e()
            r10.x = r12
            throw r11
        L_0x0223:
            m0.r.t.a.r.h.c r11 = r13.e()
            r10.x = r11
            m0.r.t.a.r.h.f<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d> r11 = r10.c
            r11.i()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.<init>(m0.r.t.a.r.h.d, m0.r.t.a.r.h.e, m0.r.t.a.r.f.a):void");
    }
}
