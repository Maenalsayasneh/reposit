package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import h0.c.a.b.b;
import h0.q.n;
import h0.q.p;
import h0.q.r;
import h0.q.z;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {
    public static final Object NOT_SET = new Object();
    public static final int START_VERSION = -1;
    public int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    public final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private h0.c.a.b.b<z<? super T>, LiveData<T>.defpackage.c> mObservers;
    public volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public class LifecycleBoundObserver extends LiveData<T>.defpackage.c implements n {
        public final p y;

        public LifecycleBoundObserver(p pVar, z<? super T> zVar) {
            super(zVar);
            this.y = pVar;
        }

        public void a(p pVar, Lifecycle.Event event) {
            Lifecycle.State state = ((r) this.y.getLifecycle()).c;
            if (state == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.c);
                return;
            }
            Lifecycle.State state2 = null;
            while (state2 != state) {
                b(((r) this.y.getLifecycle()).c.isAtLeast(Lifecycle.State.STARTED));
                state2 = state;
                state = ((r) this.y.getLifecycle()).c;
            }
        }

        public void c() {
            r rVar = (r) this.y.getLifecycle();
            rVar.d("removeObserver");
            rVar.b.k(this);
        }

        public boolean d(p pVar) {
            return this.y == pVar;
        }

        public boolean e() {
            return ((r) this.y.getLifecycle()).c.isAtLeast(Lifecycle.State.STARTED);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    public class b extends LiveData<T>.defpackage.c {
        public b(LiveData liveData, z<? super T> zVar) {
            super(zVar);
        }

        public boolean e() {
            return true;
        }
    }

    public abstract class c {
        public final z<? super T> c;
        public boolean d;
        public int q = -1;

        public c(z<? super T> zVar) {
            this.c = zVar;
        }

        public void b(boolean z) {
            if (z != this.d) {
                this.d = z;
                LiveData.this.changeActiveCounter(z ? 1 : -1);
                if (this.d) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        public void c() {
        }

        public boolean d(p pVar) {
            return false;
        }

        public abstract boolean e();
    }

    public LiveData(T t) {
        this.mDataLock = new Object();
        this.mObservers = new h0.c.a.b.b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new a();
        this.mData = t;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (!h0.c.a.a.a.d().b()) {
            throw new IllegalStateException(i0.d.a.a.a.o0("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void considerNotify(LiveData<T>.defpackage.c cVar) {
        if (cVar.d) {
            if (!cVar.e()) {
                cVar.b(false);
                return;
            }
            int i = cVar.q;
            int i2 = this.mVersion;
            if (i < i2) {
                cVar.q = i2;
                cVar.c.onChanged(this.mData);
            }
        }
    }

    public void changeActiveCounter(int i) {
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (!this.mChangingActiveState) {
            this.mChangingActiveState = true;
            while (true) {
                try {
                    int i3 = this.mActiveCount;
                    if (i2 != i3) {
                        boolean z = i2 == 0 && i3 > 0;
                        boolean z2 = i2 > 0 && i3 == 0;
                        if (z) {
                            onActive();
                        } else if (z2) {
                            onInactive();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.mChangingActiveState = false;
                }
            }
        }
    }

    public void dispatchingValue(LiveData<T>.defpackage.c cVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (cVar == null) {
                h0.c.a.b.b<K, V>.d c2 = this.mObservers.c();
                while (c2.hasNext()) {
                    considerNotify((c) ((Map.Entry) c2.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(cVar);
                cVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t = this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public boolean hasObservers() {
        return this.mObservers.x > 0;
    }

    public void observe(p pVar, z<? super T> zVar) {
        assertMainThread("observe");
        if (((r) pVar.getLifecycle()).c != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(pVar, zVar);
            c j = this.mObservers.j(zVar, lifecycleBoundObserver);
            if (j != null && !j.d(pVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (j == null) {
                pVar.getLifecycle().a(lifecycleBoundObserver);
            }
        }
    }

    public void observeForever(z<? super T> zVar) {
        assertMainThread("observeForever");
        b bVar = new b(this, zVar);
        c j = this.mObservers.j(zVar, bVar);
        if (j instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (j == null) {
            bVar.b(true);
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            z = this.mPendingData == NOT_SET;
            this.mPendingData = t;
        }
        if (z) {
            h0.c.a.a.a.d().d.c(this.mPostValueRunnable);
        }
    }

    public void removeObserver(z<? super T> zVar) {
        assertMainThread("removeObserver");
        c k = this.mObservers.k(zVar);
        if (k != null) {
            k.c();
            k.b(false);
        }
    }

    public void removeObservers(p pVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<z<? super T>, LiveData<T>.defpackage.c>> it = this.mObservers.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (eVar.hasNext()) {
                Map.Entry entry = (Map.Entry) eVar.next();
                if (((c) entry.getValue()).d(pVar)) {
                    removeObserver((z) entry.getKey());
                }
            } else {
                return;
            }
        }
    }

    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue((LiveData<T>.defpackage.c) null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new h0.c.a.b.b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
