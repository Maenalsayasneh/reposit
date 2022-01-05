package h0.u;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.EmptyList;
import m0.i;
import m0.l.c;
import m0.n.b.f;

/* compiled from: PagingSource.kt */
public abstract class x<Key, Value> {
    public final CopyOnWriteArrayList<m0.n.a.a<i>> a = new CopyOnWriteArrayList<>();
    public final AtomicBoolean b = new AtomicBoolean(false);

    /* compiled from: PagingSource.kt */
    public static abstract class a<Key> {
        public final int a;
        public final boolean b;

        /* renamed from: h0.u.x$a$a  reason: collision with other inner class name */
        /* compiled from: PagingSource.kt */
        public static final class C0068a<Key> extends a<Key> {
            public final Key c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0068a(Key key, int i, boolean z) {
                super(i, z, (f) null);
                m0.n.b.i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
                this.c = key;
            }

            public Key a() {
                return this.c;
            }
        }

        /* compiled from: PagingSource.kt */
        public static final class b<Key> extends a<Key> {
            public final Key c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Key key, int i, boolean z) {
                super(i, z, (f) null);
                m0.n.b.i.e(key, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
                this.c = key;
            }

            public Key a() {
                return this.c;
            }
        }

        /* compiled from: PagingSource.kt */
        public static final class c<Key> extends a<Key> {
            public final Key c;

            public c(Key key, int i, boolean z) {
                super(i, z, (f) null);
                this.c = key;
            }

            public Key a() {
                return this.c;
            }
        }

        public a(int i, boolean z, f fVar) {
            this.a = i;
            this.b = z;
        }

        public abstract Key a();
    }

    /* compiled from: PagingSource.kt */
    public static abstract class b<Key, Value> {

        /* compiled from: PagingSource.kt */
        public static final class a<Key, Value> extends b<Key, Value> {
            public final Throwable a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super((f) null);
                m0.n.b.i.e(th, "throwable");
                this.a = th;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof a) && m0.n.b.i.a(this.a, ((a) obj).a);
                }
                return true;
            }

            public int hashCode() {
                Throwable th = this.a;
                if (th != null) {
                    return th.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("Error(throwable=");
                P0.append(this.a);
                P0.append(")");
                return P0.toString();
            }
        }

        public b() {
        }

        public b(f fVar) {
        }

        /* renamed from: h0.u.x$b$b  reason: collision with other inner class name */
        /* compiled from: PagingSource.kt */
        public static final class C0069b<Key, Value> extends b<Key, Value> {
            public final List<Value> a;
            public final Key b;
            public final Key c;
            public final int d;
            public final int e;

            static {
                m0.n.b.i.e(EmptyList.c, MessageExtension.FIELD_DATA);
                if (1 == 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
                } else if (1 == 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0069b(List<? extends Value> list, Key key, Key key2, int i, int i2) {
                super((f) null);
                m0.n.b.i.e(list, MessageExtension.FIELD_DATA);
                this.a = list;
                this.b = key;
                this.c = key2;
                this.d = i;
                this.e = i2;
                boolean z = false;
                if (i == Integer.MIN_VALUE || i >= 0) {
                    if (!((i2 == Integer.MIN_VALUE || i2 >= 0) ? true : z)) {
                        throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
                    }
                    return;
                }
                throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0069b)) {
                    return false;
                }
                C0069b bVar = (C0069b) obj;
                return m0.n.b.i.a(this.a, bVar.a) && m0.n.b.i.a(this.b, bVar.b) && m0.n.b.i.a(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e;
            }

            public int hashCode() {
                List<Value> list = this.a;
                int i = 0;
                int hashCode = (list != null ? list.hashCode() : 0) * 31;
                Key key = this.b;
                int hashCode2 = (hashCode + (key != null ? key.hashCode() : 0)) * 31;
                Key key2 = this.c;
                if (key2 != null) {
                    i = key2.hashCode();
                }
                return Integer.hashCode(this.e) + i0.d.a.a.a.M(this.d, (hashCode2 + i) * 31, 31);
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("Page(data=");
                P0.append(this.a);
                P0.append(", prevKey=");
                P0.append(this.b);
                P0.append(", nextKey=");
                P0.append(this.c);
                P0.append(", itemsBefore=");
                P0.append(this.d);
                P0.append(", itemsAfter=");
                return i0.d.a.a.a.u0(P0, this.e, ")");
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public C0069b(List<? extends Value> list, Key key, Key key2) {
                this(list, (Object) null, key2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                m0.n.b.i.e(list, MessageExtension.FIELD_DATA);
            }
        }
    }

    public boolean a() {
        return false;
    }

    public abstract Key b(y<Key, Value> yVar);

    public abstract Object c(a<Key> aVar, c<? super b<Key, Value>> cVar);
}
