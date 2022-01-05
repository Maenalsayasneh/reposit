package kotlin.reflect.jvm.internal.impl.storage;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.reflect.jvm.internal.impl.utils.WrappedValues;
import kotlin.text.StringsKt__IndentKt;

public class LockBasedStorageManager implements m0.r.t.a.r.l.l {
    public static final String a;
    public static final m0.r.t.a.r.l.l b = new a("NO_LOCKS", f.a, m0.r.t.a.r.l.d.b);
    public final m0.r.t.a.r.l.j c;
    public final f d;
    public final String e;

    public enum NotValue {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    public static class a extends LockBasedStorageManager {
        public a(String str, f fVar, m0.r.t.a.r.l.j jVar) {
            super(str, fVar, jVar);
        }

        public <K, V> n<V> k(String str, K k) {
            return new n<>(null, true);
        }
    }

    public class b extends j<T> {
        public final /* synthetic */ Object x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(LockBasedStorageManager lockBasedStorageManager, LockBasedStorageManager lockBasedStorageManager2, m0.n.a.a aVar, Object obj) {
            super(lockBasedStorageManager2, aVar);
            this.x = obj;
        }

        public n<T> c(boolean z) {
            return new n<>(this.x, false);
        }
    }

    public class c extends k<T> {
        public final /* synthetic */ m0.n.a.l Y1;
        public final /* synthetic */ m0.n.a.l y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(LockBasedStorageManager lockBasedStorageManager, LockBasedStorageManager lockBasedStorageManager2, m0.n.a.a aVar, m0.n.a.l lVar, m0.n.a.l lVar2) {
            super(lockBasedStorageManager2, aVar);
            this.y = lVar;
            this.Y1 = lVar2;
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i != 2 ? 2 : 3)];
            if (i != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = InstabugDbContract.UserAttributesEntry.COLUMN_VALUE;
            }
            if (i != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i == 2) {
                objArr[2] = "doPostCompute";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public n<T> c(boolean z) {
            m0.n.a.l lVar = this.y;
            if (lVar != null) {
                return new n<>(lVar.invoke(Boolean.valueOf(z)), false);
            }
            n<T> c = super.c(z);
            if (c != null) {
                return c;
            }
            a(0);
            throw null;
        }
    }

    public static class d<K, V> extends e<K, V> implements m0.r.t.a.r.l.a<K, V> {
        public d(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, a aVar) {
            super(lockBasedStorageManager, concurrentMap, (a) null);
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "computation";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V c(K k, m0.n.a.a<? extends V> aVar) {
            V invoke = invoke(new g(k, aVar));
            if (invoke != null) {
                return invoke;
            }
            a(3);
            throw null;
        }
    }

    public static class e<K, V> extends l<g<K, V>, V> implements m0.r.t.a.r.l.b<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap concurrentMap, a aVar) {
            super(lockBasedStorageManager, concurrentMap, new m0.r.t.a.r.l.e());
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            } else if (concurrentMap != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public interface f {
        public static final f a = new a();

        public static class a implements f {
            public RuntimeException a(Throwable th) {
                m0.n.b.i.e(th, "e");
                throw th;
            }
        }
    }

    public static class g<K, V> {
        public final K a;
        public final m0.n.a.a<? extends V> b;

        public g(K k, m0.n.a.a<? extends V> aVar) {
            this.a = k;
            this.b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && g.class == obj.getClass() && this.a.equals(((g) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static class h<T> implements m0.r.t.a.r.l.i<T> {
        public final LockBasedStorageManager c;
        public final m0.n.a.a<? extends T> d;
        public volatile Object q;

        public h(LockBasedStorageManager lockBasedStorageManager, m0.n.a.a<? extends T> aVar) {
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
                this.q = NotValue.NOT_COMPUTED;
                this.c = lockBasedStorageManager;
                this.d = aVar;
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 2 || i == 3) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i == 2 || i == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 2) {
                objArr[1] = "recursionDetected";
            } else if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (!(i == 2 || i == 3)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 2 || i == 3) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public void b(T t) {
        }

        public n<T> c(boolean z) {
            n<T> k = this.c.k("in a lazy value", null);
            if (k != null) {
                return k;
            }
            a(2);
            throw null;
        }

        public T invoke() {
            T t = this.q;
            if (!(t instanceof NotValue)) {
                WrappedValues.b(t);
                return t;
            }
            this.c.c.b();
            try {
                T t2 = this.q;
                if (!(t2 instanceof NotValue)) {
                    WrappedValues.b(t2);
                } else {
                    T t3 = NotValue.COMPUTING;
                    if (t2 == t3) {
                        this.q = NotValue.RECURSION_WAS_DETECTED;
                        n c2 = c(true);
                        if (!c2.b) {
                            t2 = c2.a;
                        }
                    }
                    if (t2 == NotValue.RECURSION_WAS_DETECTED) {
                        n c3 = c(false);
                        if (!c3.b) {
                            t2 = c3.a;
                        }
                    }
                    this.q = t3;
                    t2 = this.d.invoke();
                    b(t2);
                    this.q = t2;
                }
                this.c.c.a();
                return t2;
            } catch (Throwable th) {
                this.c.c.a();
                throw th;
            }
        }
    }

    public static abstract class i<T> extends h<T> {
        public volatile m0.r.t.a.r.l.k<T> x;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(LockBasedStorageManager lockBasedStorageManager, m0.n.a.a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
                this.x = null;
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public final void b(T t) {
            this.x = new m0.r.t.a.r.l.k<>(t);
            try {
                c cVar = (c) this;
                if (t != null) {
                    cVar.Y1.invoke(t);
                } else {
                    c.a(2);
                    throw null;
                }
            } finally {
                this.x = null;
            }
        }

        public T invoke() {
            m0.r.t.a.r.l.k<T> kVar = this.x;
            if (kVar != null) {
                boolean z = true;
                if (kVar.b == Thread.currentThread()) {
                    if (kVar.b != Thread.currentThread()) {
                        z = false;
                    }
                    if (z) {
                        return kVar.a;
                    }
                    throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
                }
            }
            return super.invoke();
        }
    }

    public static class j<T> extends h<T> implements m0.r.t.a.r.l.h<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(LockBasedStorageManager lockBasedStorageManager, m0.n.a.a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke != null) {
                return invoke;
            }
            a(2);
            throw null;
        }
    }

    public static abstract class k<T> extends i<T> implements m0.r.t.a.r.l.h<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(LockBasedStorageManager lockBasedStorageManager, m0.n.a.a<? extends T> aVar) {
            super(lockBasedStorageManager, aVar);
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            } else if (aVar != null) {
            } else {
                a(1);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 2 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "computable";
            } else if (i != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 2) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public T invoke() {
            T invoke = super.invoke();
            if (invoke != null) {
                return invoke;
            }
            a(2);
            throw null;
        }
    }

    public static class l<K, V> implements m0.r.t.a.r.l.g<K, V> {
        public final LockBasedStorageManager c;
        public final ConcurrentMap<K, Object> d;
        public final m0.n.a.l<? super K, ? extends V> q;

        public l(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<K, Object> concurrentMap, m0.n.a.l<? super K, ? extends V> lVar) {
            if (lockBasedStorageManager == null) {
                a(0);
                throw null;
            } else if (concurrentMap == null) {
                a(1);
                throw null;
            } else if (lVar != null) {
                this.c = lockBasedStorageManager;
                this.d = concurrentMap;
                this.q = lVar;
            } else {
                a(2);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i == 3 || i == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i == 3) {
                objArr[1] = "recursionDetected";
            } else if (i != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (!(i == 3 || i == 4)) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public final AssertionError b(K k, Object obj) {
            AssertionError assertionError = new AssertionError("Race condition detected on input " + k + ". Old value is " + obj + " under " + this.c);
            LockBasedStorageManager.l(assertionError);
            return assertionError;
        }

        public V invoke(K k) {
            Object obj;
            AssertionError th;
            AssertionError assertionError;
            Object obj2 = this.d.get(k);
            if (obj2 != null && obj2 != NotValue.COMPUTING) {
                return WrappedValues.a(obj2);
            }
            this.c.c.b();
            try {
                Object obj3 = this.d.get(k);
                NotValue notValue = NotValue.COMPUTING;
                if (obj3 == notValue) {
                    obj3 = NotValue.RECURSION_WAS_DETECTED;
                    n k2 = this.c.k("", k);
                    if (k2 == null) {
                        a(3);
                        throw null;
                    } else if (!k2.b) {
                        obj = k2.a;
                        return obj;
                    }
                }
                if (obj3 == NotValue.RECURSION_WAS_DETECTED) {
                    n k3 = this.c.k("", k);
                    if (k3 == null) {
                        a(3);
                        throw null;
                    } else if (!k3.b) {
                        obj = k3.a;
                        return obj;
                    }
                }
                if (obj3 != null) {
                    obj = WrappedValues.a(obj3);
                    return obj;
                }
                try {
                    this.d.put(k, notValue);
                    V invoke = this.q.invoke(k);
                    Object put = this.d.put(k, invoke == null ? WrappedValues.a : invoke);
                    if (put == notValue) {
                        this.c.c.a();
                        return invoke;
                    }
                    assertionError = b(k, put);
                    try {
                        throw assertionError;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    assertionError = null;
                    if (m0.r.t.a.r.m.a1.a.y2(th)) {
                        this.d.remove(k);
                        throw ((RuntimeException) th);
                    } else if (th != assertionError) {
                        Object put2 = this.d.put(k, new WrappedValues.b(th, (WrappedValues.a) null));
                        if (put2 != NotValue.COMPUTING) {
                            throw b(k, put2);
                        }
                        ((f.a) this.c.d).a(th);
                        throw null;
                    } else {
                        ((f.a) this.c.d).a(th);
                        throw null;
                    }
                }
            } finally {
                this.c.c.a();
            }
        }
    }

    public static class m<K, V> extends l<K, V> implements m0.r.t.a.r.l.f<K, V> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(LockBasedStorageManager lockBasedStorageManager, ConcurrentMap<K, Object> concurrentMap, m0.n.a.l<? super K, ? extends V> lVar) {
            super(lockBasedStorageManager, concurrentMap, lVar);
            if (concurrentMap == null) {
                a(1);
                throw null;
            } else if (lVar != null) {
            } else {
                a(2);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 3 ? 3 : 2)];
            if (i == 1) {
                objArr[0] = "map";
            } else if (i == 2) {
                objArr[0] = "compute";
            } else if (i != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i != 3) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public V invoke(K k) {
            V invoke = super.invoke(k);
            if (invoke != null) {
                return invoke;
            }
            a(3);
            throw null;
        }
    }

    public static class n<T> {
        public final T a;
        public final boolean b;

        public n(T t, boolean z) {
            this.a = t;
            this.b = z;
        }

        public String toString() {
            if (this.b) {
                return "FALL_THROUGH";
            }
            return String.valueOf(this.a);
        }
    }

    static {
        String canonicalName = LockBasedStorageManager.class.getCanonicalName();
        String str = "";
        m0.n.b.i.e(canonicalName, "$this$substringBeforeLast");
        m0.n.b.i.e(".", "delimiter");
        m0.n.b.i.e(str, "missingDelimiterValue");
        int q = StringsKt__IndentKt.q(canonicalName, ".", 0, false, 6);
        if (q != -1) {
            str = canonicalName.substring(0, q);
            m0.n.b.i.d(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        a = str;
    }

    public LockBasedStorageManager(String str, f fVar, m0.r.t.a.r.l.j jVar) {
        if (str == null) {
            i(4);
            throw null;
        } else if (fVar == null) {
            i(5);
            throw null;
        } else if (jVar != null) {
            this.c = jVar;
            this.d = fVar;
            this.e = str;
        } else {
            i(6);
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void i(int r13) {
        /*
            r0 = 37
            r1 = 20
            r2 = 13
            r3 = 10
            if (r13 == r3) goto L_0x0013
            if (r13 == r2) goto L_0x0013
            if (r13 == r1) goto L_0x0013
            if (r13 == r0) goto L_0x0013
            java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L_0x0015
        L_0x0013:
            java.lang.String r4 = "@NotNull method %s.%s must not return null"
        L_0x0015:
            r5 = 3
            r6 = 2
            if (r13 == r3) goto L_0x0021
            if (r13 == r2) goto L_0x0021
            if (r13 == r1) goto L_0x0021
            if (r13 == r0) goto L_0x0021
            r7 = r5
            goto L_0x0022
        L_0x0021:
            r7 = r6
        L_0x0022:
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager"
            java.lang.String r9 = "compute"
            r10 = 1
            r11 = 0
            if (r13 == r10) goto L_0x0065
            if (r13 == r5) goto L_0x0065
            r5 = 5
            if (r13 == r5) goto L_0x0065
            r5 = 6
            if (r13 == r5) goto L_0x0060
            switch(r13) {
                case 8: goto L_0x0065;
                case 9: goto L_0x005d;
                case 10: goto L_0x005a;
                case 11: goto L_0x005d;
                case 12: goto L_0x0055;
                case 13: goto L_0x005a;
                case 14: goto L_0x005d;
                case 15: goto L_0x0050;
                case 16: goto L_0x005d;
                case 17: goto L_0x0055;
                case 18: goto L_0x0050;
                case 19: goto L_0x005d;
                case 20: goto L_0x005a;
                case 21: goto L_0x005d;
                case 22: goto L_0x0050;
                case 23: goto L_0x004b;
                case 24: goto L_0x004b;
                case 25: goto L_0x0055;
                case 26: goto L_0x004b;
                case 27: goto L_0x0055;
                case 28: goto L_0x004b;
                case 29: goto L_0x0046;
                case 30: goto L_0x004b;
                case 31: goto L_0x004b;
                case 32: goto L_0x004b;
                case 33: goto L_0x0046;
                case 34: goto L_0x004b;
                case 35: goto L_0x0041;
                case 36: goto L_0x003c;
                case 37: goto L_0x005a;
                default: goto L_0x0037;
            }
        L_0x0037:
            java.lang.String r5 = "debugText"
            r7[r11] = r5
            goto L_0x0069
        L_0x003c:
            java.lang.String r5 = "throwable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0041:
            java.lang.String r5 = "source"
            r7[r11] = r5
            goto L_0x0069
        L_0x0046:
            java.lang.String r5 = "postCompute"
            r7[r11] = r5
            goto L_0x0069
        L_0x004b:
            java.lang.String r5 = "computable"
            r7[r11] = r5
            goto L_0x0069
        L_0x0050:
            java.lang.String r5 = "map"
            r7[r11] = r5
            goto L_0x0069
        L_0x0055:
            java.lang.String r5 = "onRecursiveCall"
            r7[r11] = r5
            goto L_0x0069
        L_0x005a:
            r7[r11] = r8
            goto L_0x0069
        L_0x005d:
            r7[r11] = r9
            goto L_0x0069
        L_0x0060:
            java.lang.String r5 = "lock"
            r7[r11] = r5
            goto L_0x0069
        L_0x0065:
            java.lang.String r5 = "exceptionHandlingStrategy"
            r7[r11] = r5
        L_0x0069:
            java.lang.String r5 = "sanitizeStackTrace"
            java.lang.String r11 = "createMemoizedFunctionWithNullableValues"
            java.lang.String r12 = "createMemoizedFunction"
            if (r13 == r3) goto L_0x0080
            if (r13 == r2) goto L_0x0080
            if (r13 == r1) goto L_0x007d
            if (r13 == r0) goto L_0x007a
            r7[r10] = r8
            goto L_0x0082
        L_0x007a:
            r7[r10] = r5
            goto L_0x0082
        L_0x007d:
            r7[r10] = r11
            goto L_0x0082
        L_0x0080:
            r7[r10] = r12
        L_0x0082:
            switch(r13) {
                case 4: goto L_0x00be;
                case 5: goto L_0x00be;
                case 6: goto L_0x00be;
                case 7: goto L_0x00b9;
                case 8: goto L_0x00b9;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00b6;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00c2;
                case 14: goto L_0x00b6;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00b6;
                case 17: goto L_0x00b6;
                case 18: goto L_0x00b6;
                case 19: goto L_0x00b3;
                case 20: goto L_0x00c2;
                case 21: goto L_0x00b3;
                case 22: goto L_0x00b3;
                case 23: goto L_0x00ae;
                case 24: goto L_0x00ae;
                case 25: goto L_0x00ae;
                case 26: goto L_0x00a9;
                case 27: goto L_0x00a9;
                case 28: goto L_0x00a4;
                case 29: goto L_0x00a4;
                case 30: goto L_0x009f;
                case 31: goto L_0x009a;
                case 32: goto L_0x0095;
                case 33: goto L_0x0095;
                case 34: goto L_0x0092;
                case 35: goto L_0x008d;
                case 36: goto L_0x008a;
                case 37: goto L_0x00c2;
                default: goto L_0x0085;
            }
        L_0x0085:
            java.lang.String r5 = "createWithExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x008a:
            r7[r6] = r5
            goto L_0x00c2
        L_0x008d:
            java.lang.String r5 = "recursionDetectedDefault"
            r7[r6] = r5
            goto L_0x00c2
        L_0x0092:
            r7[r6] = r9
            goto L_0x00c2
        L_0x0095:
            java.lang.String r5 = "createNullableLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009a:
            java.lang.String r5 = "createRecursionTolerantNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x009f:
            java.lang.String r5 = "createNullableLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a4:
            java.lang.String r5 = "createLazyValueWithPostCompute"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00a9:
            java.lang.String r5 = "createRecursionTolerantLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00ae:
            java.lang.String r5 = "createLazyValue"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00b3:
            r7[r6] = r11
            goto L_0x00c2
        L_0x00b6:
            r7[r6] = r12
            goto L_0x00c2
        L_0x00b9:
            java.lang.String r5 = "replaceExceptionHandling"
            r7[r6] = r5
            goto L_0x00c2
        L_0x00be:
            java.lang.String r5 = "<init>"
            r7[r6] = r5
        L_0x00c2:
            java.lang.String r4 = java.lang.String.format(r4, r7)
            if (r13 == r3) goto L_0x00d4
            if (r13 == r2) goto L_0x00d4
            if (r13 == r1) goto L_0x00d4
            if (r13 == r0) goto L_0x00d4
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r4)
            goto L_0x00d9
        L_0x00d4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            r13.<init>(r4)
        L_0x00d9:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.i(int):void");
    }

    public static <K> ConcurrentMap<K, Object> j() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    public static <T extends Throwable> T l(T t) {
        if (t != null) {
            StackTraceElement[] stackTrace = t.getStackTrace();
            int length = stackTrace.length;
            int i2 = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (!stackTrace[i3].getClassName().startsWith(a)) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            List subList = Arrays.asList(stackTrace).subList(i2, length);
            t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
            return t;
        }
        i(36);
        throw null;
    }

    public <K, V> m0.r.t.a.r.l.b<K, V> a() {
        return new e(this, j(), (a) null);
    }

    public <K, V> m0.r.t.a.r.l.a<K, V> b() {
        return new d(this, j(), (a) null);
    }

    public <T> m0.r.t.a.r.l.h<T> c(m0.n.a.a<? extends T> aVar, T t) {
        if (t != null) {
            return new b(this, this, aVar, t);
        }
        i(27);
        throw null;
    }

    public <T> m0.r.t.a.r.l.h<T> d(m0.n.a.a<? extends T> aVar) {
        if (aVar != null) {
            return new j(this, aVar);
        }
        i(23);
        throw null;
    }

    public <T> m0.r.t.a.r.l.i<T> e(m0.n.a.a<? extends T> aVar) {
        return new h(this, aVar);
    }

    public <T> m0.r.t.a.r.l.h<T> f(m0.n.a.a<? extends T> aVar, m0.n.a.l<? super Boolean, ? extends T> lVar, m0.n.a.l<? super T, m0.i> lVar2) {
        return new c(this, this, aVar, lVar, lVar2);
    }

    public <K, V> m0.r.t.a.r.l.f<K, V> g(m0.n.a.l<? super K, ? extends V> lVar) {
        return new m(this, j(), lVar);
    }

    public <K, V> m0.r.t.a.r.l.g<K, V> h(m0.n.a.l<? super K, ? extends V> lVar) {
        return new l(this, j(), lVar);
    }

    public <K, V> n<V> k(String str, K k2) {
        String str2;
        StringBuilder S0 = i0.d.a.a.a.S0("Recursion detected ", str);
        if (k2 == null) {
            str2 = "";
        } else {
            str2 = "on input: " + k2;
        }
        S0.append(str2);
        S0.append(" under ");
        S0.append(this);
        AssertionError assertionError = new AssertionError(S0.toString());
        l(assertionError);
        throw assertionError;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return i0.d.a.a.a.y0(sb, this.e, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LockBasedStorageManager(java.lang.String r5) {
        /*
            r4 = this;
            kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager$f r0 = kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.f.a
            int r1 = m0.r.t.a.r.l.j.a
            m0.r.t.a.r.l.c r1 = new m0.r.t.a.r.l.c
            r2 = 0
            r3 = 1
            r1.<init>(r2, r3)
            r4.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager.<init>(java.lang.String):void");
    }
}
