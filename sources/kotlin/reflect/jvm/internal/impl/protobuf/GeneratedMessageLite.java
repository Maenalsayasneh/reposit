package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import m0.r.t.a.r.h.a;
import m0.r.t.a.r.h.f;
import m0.r.t.a.r.h.g;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.h.m;
import m0.r.t.a.r.h.q;

public abstract class GeneratedMessageLite extends m0.r.t.a.r.h.a implements Serializable {

    public static abstract class b<MessageType extends GeneratedMessageLite, BuilderType extends b> extends a.C0267a<BuilderType> {
        public m0.r.t.a.r.h.c c = m0.r.t.a.r.h.c.c;

        /* renamed from: i */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract BuilderType j(MessageType messagetype);
    }

    public static abstract class c<MessageType extends ExtendableMessage<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements m {
        public f<d> d = f.a;
        public boolean q;

        public final void l(MessageType messagetype) {
            if (!this.q) {
                this.d = this.d.clone();
                this.q = true;
            }
            f<d> fVar = this.d;
            f<d> fVar2 = messagetype.c;
            Objects.requireNonNull(fVar);
            for (int i = 0; i < fVar2.b.d(); i++) {
                fVar.j(fVar2.b.c(i));
            }
            for (Map.Entry<FieldDescriptorType, Object> j : fVar2.b.f()) {
                fVar.j(j);
            }
        }
    }

    public static final class d implements f.a<d> {
        public final Internal.b<?> c;
        public final int d;
        public final WireFormat$FieldType q;
        public final boolean x;
        public final boolean y;

        public d(Internal.b<?> bVar, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, boolean z2) {
            this.c = bVar;
            this.d = i;
            this.q = wireFormat$FieldType;
            this.x = z;
            this.y = z2;
        }

        public WireFormat$JavaType J() {
            return this.q.getJavaType();
        }

        public boolean R() {
            return this.y;
        }

        public l.a c(l.a aVar, l lVar) {
            return ((b) aVar).j((GeneratedMessageLite) lVar);
        }

        public int compareTo(Object obj) {
            return this.d - ((d) obj).d;
        }

        public int getNumber() {
            return this.d;
        }

        public boolean k() {
            return this.x;
        }

        public WireFormat$FieldType m() {
            return this.q;
        }
    }

    public static class e<ContainingType extends l, Type> {
        public final ContainingType a;
        public final Type b;
        public final l c;
        public final d d;
        public final Method e;

        public e(ContainingType containingtype, Type type, l lVar, d dVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (dVar.q == WireFormat$FieldType.MESSAGE && lVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.a = containingtype;
                this.b = type;
                this.c = lVar;
                this.d = dVar;
                if (Internal.a.class.isAssignableFrom(cls)) {
                    try {
                        this.e = cls.getMethod("valueOf", new Class[]{Integer.TYPE});
                    } catch (NoSuchMethodException e2) {
                        String name = cls.getName();
                        StringBuilder sb = new StringBuilder(name.length() + 45 + 7);
                        i0.d.a.a.a.s(sb, "Generated message class \"", name, "\" missing method \"", "valueOf");
                        sb.append("\".");
                        throw new RuntimeException(sb.toString(), e2);
                    }
                } else {
                    this.e = null;
                }
            }
        }

        public Object a(Object obj) {
            if (this.d.J() != WireFormat$JavaType.ENUM) {
                return obj;
            }
            try {
                return this.e.invoke((Object) null, new Object[]{(Integer) obj});
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else if (cause instanceof Error) {
                    throw ((Error) cause);
                } else {
                    throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
                }
            }
        }

        public Object b(Object obj) {
            return this.d.J() == WireFormat$JavaType.ENUM ? Integer.valueOf(((Internal.a) obj).getNumber()) : obj;
        }
    }

    public GeneratedMessageLite() {
    }

    public static <ContainingType extends l, Type> e<ContainingType, Type> a(ContainingType containingtype, l lVar, Internal.b<?> bVar, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, Class cls) {
        return new e(containingtype, Collections.emptyList(), lVar, new d((Internal.b<?>) null, i, wireFormat$FieldType, true, z), cls);
    }

    public static <ContainingType extends l, Type> e<ContainingType, Type> h(ContainingType containingtype, Type type, l lVar, Internal.b<?> bVar, int i, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new e(containingtype, type, lVar, new d((Internal.b<?>) null, i, wireFormat$FieldType, false, false), cls);
    }

    public GeneratedMessageLite(b bVar) {
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements m {
        public final f<d> c;

        public class a {
            public final Iterator<Map.Entry<d, Object>> a;
            public Map.Entry<d, Object> b;
            public final boolean c;

            public a(boolean z, a aVar) {
                Iterator<Map.Entry<d, Object>> it;
                f<d> fVar = ExtendableMessage.this.c;
                if (fVar.d) {
                    it = new g.c<>(((q.d) fVar.b.entrySet()).iterator());
                } else {
                    it = ((q.d) fVar.b.entrySet()).iterator();
                }
                this.a = it;
                if (it.hasNext()) {
                    this.b = it.next();
                }
                this.c = z;
            }

            public void a(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<d, Object> entry = this.b;
                    if (entry != null && entry.getKey().d < i) {
                        d key = this.b.getKey();
                        if (!this.c || key.J() != WireFormat$JavaType.MESSAGE || key.x) {
                            Object value = this.b.getValue();
                            f fVar = f.a;
                            WireFormat$FieldType m = key.m();
                            int number = key.getNumber();
                            if (key.k()) {
                                List<Object> list = (List) value;
                                if (key.R()) {
                                    codedOutputStream.A(number, 2);
                                    int i2 = 0;
                                    for (Object d2 : list) {
                                        i2 += f.d(m, d2);
                                    }
                                    codedOutputStream.y(i2);
                                    for (Object o : list) {
                                        f.o(codedOutputStream, m, o);
                                    }
                                } else {
                                    for (Object n : list) {
                                        f.n(codedOutputStream, m, number, n);
                                    }
                                }
                            } else if (value instanceof g) {
                                f.n(codedOutputStream, m, number, ((g) value).a());
                            } else {
                                f.n(codedOutputStream, m, number, value);
                            }
                        } else {
                            int i3 = key.d;
                            codedOutputStream.A(1, 3);
                            codedOutputStream.y(16);
                            codedOutputStream.y(i3);
                            codedOutputStream.r(3, (l) this.b.getValue());
                            codedOutputStream.A(1, 4);
                        }
                        if (this.a.hasNext()) {
                            this.b = this.a.next();
                        } else {
                            this.b = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public ExtendableMessage() {
            this.c = new f<>();
        }

        public boolean i() {
            f<d> fVar = this.c;
            for (int i = 0; i < fVar.b.d(); i++) {
                if (!fVar.h(fVar.b.c(i))) {
                    return false;
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> h : fVar.b.f()) {
                if (!fVar.h(h)) {
                    return false;
                }
            }
            return true;
        }

        public int l() {
            f<d> fVar = this.c;
            int i = 0;
            for (int i2 = 0; i2 < fVar.b.d(); i2++) {
                Map.Entry<FieldDescriptorType, Object> c2 = fVar.b.c(i2);
                i += f.e((f.a) c2.getKey(), c2.getValue());
            }
            for (Map.Entry next : fVar.b.f()) {
                i += f.e((f.a) next.getKey(), next.getValue());
            }
            return i;
        }

        public final <Type> Type m(e<MessageType, Type> eVar) {
            w(eVar);
            Type f = this.c.f(eVar.d);
            if (f == null) {
                return eVar.b;
            }
            d dVar = eVar.d;
            if (!dVar.x) {
                return eVar.a(f);
            }
            if (dVar.J() != WireFormat$JavaType.ENUM) {
                return f;
            }
            Type arrayList = new ArrayList();
            for (Object a2 : (List) f) {
                arrayList.add(eVar.a(a2));
            }
            return arrayList;
        }

        public final <Type> boolean n(e<MessageType, Type> eVar) {
            w(eVar);
            f<d> fVar = this.c;
            d dVar = eVar.d;
            Objects.requireNonNull(fVar);
            if (!dVar.k()) {
                return fVar.b.get(dVar) != null;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        public void p() {
            this.c.i();
        }

        public ExtendableMessage<MessageType>.defpackage.a q() {
            return new a(false, (a) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean v(m0.r.t.a.r.h.d r8, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r9, m0.r.t.a.r.h.e r10, int r11) throws java.io.IOException {
            /*
                r7 = this;
                m0.r.t.a.r.h.f<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d> r0 = r7.c
                m0.r.t.a.r.h.l r1 = r7.b()
                r2 = r11 & 7
                int r3 = r11 >>> 3
                java.util.Map<m0.r.t.a.r.h.e$a, kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<?, ?>> r4 = r10.b
                m0.r.t.a.r.h.e$a r5 = new m0.r.t.a.r.h.e$a
                r5.<init>(r1, r3)
                java.lang.Object r1 = r4.get(r5)
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r1 = (kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.e) r1
                r3 = 0
                r4 = 1
                if (r1 != 0) goto L_0x001c
                goto L_0x0044
            L_0x001c:
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r5 = r1.d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r5 = r5.q
                int r5 = m0.r.t.a.r.h.f.g(r5, r3)
                if (r2 != r5) goto L_0x0029
                r2 = r3
                r5 = r2
                goto L_0x0046
            L_0x0029:
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r5 = r1.d
                boolean r6 = r5.x
                if (r6 == 0) goto L_0x0044
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r5 = r5.q
                boolean r5 = r5.isPackable()
                if (r5 == 0) goto L_0x0044
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r5 = r1.d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r5 = r5.q
                int r5 = m0.r.t.a.r.h.f.g(r5, r4)
                if (r2 != r5) goto L_0x0044
                r2 = r3
                r5 = r4
                goto L_0x0046
            L_0x0044:
                r5 = r3
                r2 = r4
            L_0x0046:
                if (r2 == 0) goto L_0x004e
                boolean r4 = r8.r(r11, r9)
                goto L_0x0151
            L_0x004e:
                if (r5 == 0) goto L_0x009b
                int r9 = r8.l()
                int r9 = r8.d(r9)
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r10 = r1.d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = r10.q
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r11 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.ENUM
                if (r10 != r11) goto L_0x0080
            L_0x0060:
                int r10 = r8.b()
                if (r10 <= 0) goto L_0x0094
                int r10 = r8.l()
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r11 = r1.d
                kotlin.reflect.jvm.internal.impl.protobuf.Internal$b<?> r11 = r11.c
                kotlin.reflect.jvm.internal.impl.protobuf.Internal$a r10 = r11.a(r10)
                if (r10 != 0) goto L_0x0076
                goto L_0x0151
            L_0x0076:
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r11 = r1.d
                java.lang.Object r10 = r1.b(r10)
                r0.a(r11, r10)
                goto L_0x0060
            L_0x0080:
                int r10 = r8.b()
                if (r10 <= 0) goto L_0x0094
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r10 = r1.d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = r10.q
                java.lang.Object r10 = m0.r.t.a.r.h.f.k(r8, r10, r3)
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r11 = r1.d
                r0.a(r11, r10)
                goto L_0x0080
            L_0x0094:
                r8.i = r9
                r8.p()
                goto L_0x0151
            L_0x009b:
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r2 = r1.d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r2 = r2.J()
                int r2 = r2.ordinal()
                r5 = 7
                if (r2 == r5) goto L_0x0126
                r9 = 8
                if (r2 == r9) goto L_0x00b6
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r9 = r1.d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r9 = r9.q
                java.lang.Object r8 = m0.r.t.a.r.h.f.k(r8, r9, r3)
                goto L_0x013c
            L_0x00b6:
                r9 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r11 = r1.d
                boolean r2 = r11.x
                if (r2 != 0) goto L_0x00c9
                java.lang.Object r11 = r0.f(r11)
                m0.r.t.a.r.h.l r11 = (m0.r.t.a.r.h.l) r11
                if (r11 == 0) goto L_0x00c9
                m0.r.t.a.r.h.l$a r9 = r11.c()
            L_0x00c9:
                if (r9 != 0) goto L_0x00d1
                m0.r.t.a.r.h.l r9 = r1.c
                m0.r.t.a.r.h.l$a r9 = r9.f()
            L_0x00d1:
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r11 = r1.d
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r2 = r11.q
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r5 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType.GROUP
                r6 = 64
                if (r2 != r5) goto L_0x00fa
                int r11 = r11.d
                int r2 = r8.j
                if (r2 >= r6) goto L_0x00f5
                int r2 = r2 + r4
                r8.j = r2
                r9.k(r8, r10)
                int r10 = r11 << 3
                r10 = r10 | 4
                r8.a(r10)
                int r10 = r8.j
                int r10 = r10 + -1
                r8.j = r10
                goto L_0x011c
            L_0x00f5:
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r8 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.b()
                throw r8
            L_0x00fa:
                int r11 = r8.l()
                int r2 = r8.j
                if (r2 >= r6) goto L_0x0121
                int r11 = r8.d(r11)
                int r2 = r8.j
                int r2 = r2 + r4
                r8.j = r2
                r9.k(r8, r10)
                r8.a(r3)
                int r10 = r8.j
                int r10 = r10 + -1
                r8.j = r10
                r8.i = r11
                r8.p()
            L_0x011c:
                m0.r.t.a.r.h.l r8 = r9.build()
                goto L_0x013c
            L_0x0121:
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r8 = kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException.b()
                throw r8
            L_0x0126:
                int r8 = r8.l()
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r10 = r1.d
                kotlin.reflect.jvm.internal.impl.protobuf.Internal$b<?> r10 = r10.c
                kotlin.reflect.jvm.internal.impl.protobuf.Internal$a r10 = r10.a(r8)
                if (r10 != 0) goto L_0x013b
                r9.y(r11)
                r9.y(r8)
                goto L_0x0151
            L_0x013b:
                r8 = r10
            L_0x013c:
                kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r9 = r1.d
                boolean r10 = r9.x
                if (r10 == 0) goto L_0x014a
                java.lang.Object r8 = r1.b(r8)
                r0.a(r9, r8)
                goto L_0x0151
            L_0x014a:
                java.lang.Object r8 = r1.b(r8)
                r0.l(r9, r8)
            L_0x0151:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableMessage.v(m0.r.t.a.r.h.d, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, m0.r.t.a.r.h.e, int):boolean");
        }

        public final void w(e<MessageType, ?> eVar) {
            if (eVar.a != b()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public ExtendableMessage(c<MessageType, ?> cVar) {
            cVar.d.i();
            cVar.q = false;
            this.c = cVar.d;
        }
    }
}
