package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.core.app.TaskStackBuilder;
import androidx.lifecycle.Lifecycle;
import h0.q.n;
import h0.q.n0;
import h0.q.o;
import h0.t.d;
import h0.t.f;
import h0.t.g;
import h0.t.i;
import h0.t.j;
import h0.t.k;
import h0.t.m;
import h0.t.p;
import h0.t.q;
import h0.t.s;
import h0.t.t;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class NavController {
    public final Context a;
    public Activity b;
    public p c;
    public m d;
    public Bundle e;
    public Parcelable[] f;
    public boolean g;
    public final Deque<f> h = new ArrayDeque();
    public h0.q.p i;
    public g j;
    public t k = new t();
    public final CopyOnWriteArrayList<b> l = new CopyOnWriteArrayList<>();
    public final o m = new n() {
        public void a(h0.q.p pVar, Lifecycle.Event event) {
            Lifecycle.State state;
            NavController navController = NavController.this;
            if (navController.d != null) {
                for (f next : navController.h) {
                    Objects.requireNonNull(next);
                    int ordinal = event.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                state = Lifecycle.State.RESUMED;
                            } else if (ordinal != 3) {
                                if (ordinal != 4) {
                                    if (ordinal == 5) {
                                        state = Lifecycle.State.DESTROYED;
                                    } else {
                                        throw new IllegalArgumentException("Unexpected event value " + event);
                                    }
                                }
                            }
                            next.Z1 = state;
                            next.b();
                        }
                        state = Lifecycle.State.STARTED;
                        next.Z1 = state;
                        next.b();
                    }
                    state = Lifecycle.State.CREATED;
                    next.Z1 = state;
                    next.b();
                }
            }
        }
    };
    public final h0.a.b n = new a(false);
    public boolean o = true;

    public class a extends h0.a.b {
        public a(boolean z) {
            super(z);
        }

        public void a() {
            NavController.this.l();
        }
    }

    public interface b {
        void a(NavController navController, k kVar, Bundle bundle);
    }

    public NavController(Context context) {
        this.a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        t tVar = this.k;
        tVar.a(new h0.t.n(tVar));
        this.k.a(new h0.t.b(this.a));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:5:0x0027, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r10 = this;
        L_0x0000:
            java.util.Deque<h0.t.f> r0 = r10.h
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x002a
            java.util.Deque<h0.t.f> r0 = r10.h
            java.lang.Object r0 = r0.peekLast()
            h0.t.f r0 = (h0.t.f) r0
            h0.t.k r0 = r0.d
            boolean r0 = r0 instanceof h0.t.m
            if (r0 == 0) goto L_0x002a
            java.util.Deque<h0.t.f> r0 = r10.h
            java.lang.Object r0 = r0.peekLast()
            h0.t.f r0 = (h0.t.f) r0
            h0.t.k r0 = r0.d
            int r0 = r0.q
            boolean r0 = r10.n(r0, r1)
            if (r0 == 0) goto L_0x002a
            goto L_0x0000
        L_0x002a:
            java.util.Deque<h0.t.f> r0 = r10.h
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00f8
            java.util.Deque<h0.t.f> r0 = r10.h
            java.lang.Object r0 = r0.peekLast()
            h0.t.f r0 = (h0.t.f) r0
            h0.t.k r0 = r0.d
            r2 = 0
            boolean r3 = r0 instanceof h0.t.c
            if (r3 == 0) goto L_0x005e
            java.util.Deque<h0.t.f> r3 = r10.h
            java.util.Iterator r3 = r3.descendingIterator()
        L_0x0047:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x005e
            java.lang.Object r4 = r3.next()
            h0.t.f r4 = (h0.t.f) r4
            h0.t.k r4 = r4.d
            boolean r5 = r4 instanceof h0.t.m
            if (r5 != 0) goto L_0x0047
            boolean r5 = r4 instanceof h0.t.c
            if (r5 != 0) goto L_0x0047
            r2 = r4
        L_0x005e:
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Deque<h0.t.f> r4 = r10.h
            java.util.Iterator r4 = r4.descendingIterator()
        L_0x0069:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b1
            java.lang.Object r5 = r4.next()
            h0.t.f r5 = (h0.t.f) r5
            androidx.lifecycle.Lifecycle$State r6 = r5.a2
            h0.t.k r7 = r5.d
            if (r0 == 0) goto L_0x008b
            int r8 = r7.q
            int r9 = r0.q
            if (r8 != r9) goto L_0x008b
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r6 == r7) goto L_0x0088
            r3.put(r5, r7)
        L_0x0088:
            h0.t.m r0 = r0.d
            goto L_0x0069
        L_0x008b:
            if (r2 == 0) goto L_0x00a9
            int r7 = r7.q
            int r8 = r2.q
            if (r7 != r8) goto L_0x00a9
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r6 != r7) goto L_0x009f
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.STARTED
            r5.a2 = r6
            r5.b()
            goto L_0x00a6
        L_0x009f:
            androidx.lifecycle.Lifecycle$State r7 = androidx.lifecycle.Lifecycle.State.STARTED
            if (r6 == r7) goto L_0x00a6
            r3.put(r5, r7)
        L_0x00a6:
            h0.t.m r2 = r2.d
            goto L_0x0069
        L_0x00a9:
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.CREATED
            r5.a2 = r6
            r5.b()
            goto L_0x0069
        L_0x00b1:
            java.util.Deque<h0.t.f> r0 = r10.h
            java.util.Iterator r0 = r0.iterator()
        L_0x00b7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00d5
            java.lang.Object r2 = r0.next()
            h0.t.f r2 = (h0.t.f) r2
            java.lang.Object r4 = r3.get(r2)
            androidx.lifecycle.Lifecycle$State r4 = (androidx.lifecycle.Lifecycle.State) r4
            if (r4 == 0) goto L_0x00d1
            r2.a2 = r4
            r2.b()
            goto L_0x00b7
        L_0x00d1:
            r2.b()
            goto L_0x00b7
        L_0x00d5:
            java.util.Deque<h0.t.f> r0 = r10.h
            java.lang.Object r0 = r0.peekLast()
            h0.t.f r0 = (h0.t.f) r0
            java.util.concurrent.CopyOnWriteArrayList<androidx.navigation.NavController$b> r2 = r10.l
            java.util.Iterator r2 = r2.iterator()
        L_0x00e3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00f7
            java.lang.Object r3 = r2.next()
            androidx.navigation.NavController$b r3 = (androidx.navigation.NavController.b) r3
            h0.t.k r4 = r0.d
            android.os.Bundle r5 = r0.q
            r3.a(r10, r4, r5)
            goto L_0x00e3
        L_0x00f7:
            return r1
        L_0x00f8:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.a():boolean");
    }

    public k b(int i2) {
        k kVar;
        m mVar;
        m mVar2 = this.d;
        if (mVar2 == null) {
            return null;
        }
        if (mVar2.q == i2) {
            return mVar2;
        }
        if (this.h.isEmpty()) {
            kVar = this.d;
        } else {
            kVar = this.h.getLast().d;
        }
        if (kVar instanceof m) {
            mVar = (m) kVar;
        } else {
            mVar = kVar.d;
        }
        return mVar.t(i2, true);
    }

    public f c() {
        if (this.h.isEmpty()) {
            return null;
        }
        return this.h.getLast();
    }

    public k d() {
        f c2 = c();
        if (c2 != null) {
            return c2.d;
        }
        return null;
    }

    public final int e() {
        int i2 = 0;
        for (f fVar : this.h) {
            if (!(fVar.d instanceof m)) {
                i2++;
            }
        }
        return i2;
    }

    public p f() {
        if (this.c == null) {
            this.c = new p(this.a, this.k);
        }
        return this.c;
    }

    public boolean g(Intent intent) {
        String str;
        m mVar;
        k kVar;
        m mVar2;
        k.a k2;
        Intent intent2 = intent;
        int i2 = 0;
        if (intent2 == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (!((intArray != null && intArray.length != 0) || intent.getData() == null || (k2 = this.d.k(new j(intent.getData(), intent.getAction(), intent.getType()))) == null)) {
            k kVar2 = k2.c;
            int[] c2 = kVar2.c();
            bundle.putAll(kVar2.b(k2.d));
            intArray = c2;
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        m mVar3 = this.d;
        int i3 = 0;
        while (true) {
            if (i3 >= intArray.length) {
                str = null;
                break;
            }
            int i4 = intArray[i3];
            if (i3 == 0) {
                kVar = this.d;
                if (kVar.q != i4) {
                    kVar = null;
                }
            } else {
                kVar = mVar3.s(i4);
            }
            if (kVar == null) {
                str = k.j(this.a, i4);
                break;
            }
            if (i3 != intArray.length - 1) {
                while (true) {
                    mVar2 = (m) kVar;
                    if (!(mVar2.s(mVar2.c2) instanceof m)) {
                        break;
                    }
                    kVar = mVar2.s(mVar2.c2);
                }
                mVar3 = mVar2;
            }
            i3++;
        }
        if (str != null) {
            Log.i("NavController", "Could not find destination " + str + " in the navigation graph, ignoring the deep link from " + intent2);
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
        int flags = intent.getFlags();
        int i5 = 268435456 & flags;
        if (i5 != 0 && (flags & 32768) == 0) {
            intent2.addFlags(32768);
            TaskStackBuilder.create(this.a).addNextIntentWithParentStack(intent2).startActivities();
            Activity activity = this.b;
            if (activity != null) {
                activity.finish();
                this.b.overridePendingTransition(0, 0);
            }
            return true;
        } else if (i5 != 0) {
            if (!this.h.isEmpty()) {
                n(this.d.q, true);
            }
            while (i2 < intArray.length) {
                int i6 = i2 + 1;
                int i7 = intArray[i2];
                k b2 = b(i7);
                if (b2 != null) {
                    j(b2, bundle, new q(false, -1, false, 0, 0, -1, -1), (s.a) null);
                    i2 = i6;
                } else {
                    StringBuilder T0 = i0.d.a.a.a.T0("Deep Linking failed: destination ", k.j(this.a, i7), " cannot be found from the current destination ");
                    T0.append(d());
                    throw new IllegalStateException(T0.toString());
                }
            }
            return true;
        } else {
            m mVar4 = this.d;
            while (i2 < intArray.length) {
                int i8 = intArray[i2];
                k s = i2 == 0 ? this.d : mVar4.s(i8);
                if (s != null) {
                    if (i2 != intArray.length - 1) {
                        while (true) {
                            mVar = (m) s;
                            if (!(mVar.s(mVar.c2) instanceof m)) {
                                break;
                            }
                            s = mVar.s(mVar.c2);
                        }
                        mVar4 = mVar;
                    } else {
                        Bundle b3 = s.b(bundle);
                        q qVar = r10;
                        q qVar2 = new q(false, this.d.q, true, 0, 0, -1, -1);
                        j(s, b3, qVar2, (s.a) null);
                    }
                    i2++;
                } else {
                    throw new IllegalStateException("Deep Linking failed: destination " + k.j(this.a, i8) + " cannot be found in graph " + mVar4);
                }
            }
            this.g = true;
            return true;
        }
    }

    public void h(int i2, Bundle bundle, q qVar, s.a aVar) {
        k kVar;
        int i3;
        int i4;
        if (this.h.isEmpty()) {
            kVar = this.d;
        } else {
            kVar = this.h.getLast().d;
        }
        if (kVar != null) {
            d e2 = kVar.e(i2);
            Bundle bundle2 = null;
            if (e2 != null) {
                if (qVar == null) {
                    qVar = e2.b;
                }
                i3 = e2.a;
                Bundle bundle3 = e2.c;
                if (bundle3 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(bundle3);
                }
            } else {
                i3 = i2;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i3 == 0 && qVar != null && (i4 = qVar.b) != -1) {
                m(i4, qVar.c);
            } else if (i3 != 0) {
                k b2 = b(i3);
                if (b2 == null) {
                    String j2 = k.j(this.a, i3);
                    if (e2 != null) {
                        StringBuilder T0 = i0.d.a.a.a.T0("Navigation destination ", j2, " referenced from action ");
                        T0.append(k.j(this.a, i2));
                        T0.append(" cannot be found from the current destination ");
                        T0.append(kVar);
                        throw new IllegalArgumentException(T0.toString());
                    }
                    throw new IllegalArgumentException("Navigation action/destination " + j2 + " cannot be found from the current destination " + kVar);
                }
                j(b2, bundle2, qVar, aVar);
            } else {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
        } else {
            throw new IllegalStateException("no current navigation node");
        }
    }

    public void i(j jVar, q qVar, s.a aVar) {
        k.a k2 = this.d.k(jVar);
        if (k2 != null) {
            j(k2.c, k2.c.b(k2.d), qVar, aVar);
            return;
        }
        throw new IllegalArgumentException("Navigation destination that matches request " + jVar + " cannot be found in the navigation graph " + this.d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r14.b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027 A[LOOP:0: B:10:0x0027->B:15:0x004d, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cf A[LOOP:3: B:43:0x00cf->B:50:0x0109, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(h0.t.k r12, android.os.Bundle r13, h0.t.q r14, h0.t.s.a r15) {
        /*
            r11 = this;
            r0 = 0
            if (r14 == 0) goto L_0x000f
            int r1 = r14.b
            r2 = -1
            if (r1 == r2) goto L_0x000f
            boolean r2 = r14.c
            boolean r1 = r11.n(r1, r2)
            goto L_0x0010
        L_0x000f:
            r1 = r0
        L_0x0010:
            h0.t.t r2 = r11.k
            java.lang.String r3 = r12.c
            h0.t.s r2 = r2.c(r3)
            android.os.Bundle r13 = r12.b(r13)
            h0.t.k r15 = r2.b(r12, r13, r14, r15)
            r2 = 1
            if (r15 == 0) goto L_0x0152
            boolean r14 = r15 instanceof h0.t.c
            if (r14 != 0) goto L_0x0050
        L_0x0027:
            java.util.Deque<h0.t.f> r14 = r11.h
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x0050
            java.util.Deque<h0.t.f> r14 = r11.h
            java.lang.Object r14 = r14.peekLast()
            h0.t.f r14 = (h0.t.f) r14
            h0.t.k r14 = r14.d
            boolean r14 = r14 instanceof h0.t.c
            if (r14 == 0) goto L_0x0050
            java.util.Deque<h0.t.f> r14 = r11.h
            java.lang.Object r14 = r14.peekLast()
            h0.t.f r14 = (h0.t.f) r14
            h0.t.k r14 = r14.d
            int r14 = r14.q
            boolean r14 = r11.n(r14, r2)
            if (r14 == 0) goto L_0x0050
            goto L_0x0027
        L_0x0050:
            java.util.ArrayDeque r14 = new java.util.ArrayDeque
            r14.<init>()
            boolean r3 = r12 instanceof h0.t.m
            if (r3 == 0) goto L_0x008f
            r3 = r15
        L_0x005a:
            h0.t.m r9 = r3.d
            if (r9 == 0) goto L_0x0088
            h0.t.f r10 = new h0.t.f
            android.content.Context r4 = r11.a
            h0.q.p r7 = r11.i
            h0.t.g r8 = r11.j
            r3 = r10
            r5 = r9
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r14.addFirst(r10)
            java.util.Deque<h0.t.f> r3 = r11.h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0088
            java.util.Deque<h0.t.f> r3 = r11.h
            java.lang.Object r3 = r3.getLast()
            h0.t.f r3 = (h0.t.f) r3
            h0.t.k r3 = r3.d
            if (r3 != r9) goto L_0x0088
            int r3 = r9.q
            r11.n(r3, r2)
        L_0x0088:
            if (r9 == 0) goto L_0x008f
            if (r9 != r12) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r3 = r9
            goto L_0x005a
        L_0x008f:
            boolean r12 = r14.isEmpty()
            if (r12 == 0) goto L_0x0097
            r12 = r15
            goto L_0x009f
        L_0x0097:
            java.lang.Object r12 = r14.getFirst()
            h0.t.f r12 = (h0.t.f) r12
            h0.t.k r12 = r12.d
        L_0x009f:
            if (r12 == 0) goto L_0x00bf
            int r3 = r12.q
            h0.t.k r3 = r11.b(r3)
            if (r3 != 0) goto L_0x00bf
            h0.t.m r12 = r12.d
            if (r12 == 0) goto L_0x009f
            h0.t.f r9 = new h0.t.f
            android.content.Context r4 = r11.a
            h0.q.p r7 = r11.i
            h0.t.g r8 = r11.j
            r3 = r9
            r5 = r12
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r14.addFirst(r9)
            goto L_0x009f
        L_0x00bf:
            boolean r12 = r14.isEmpty()
            if (r12 == 0) goto L_0x00c7
            r12 = r15
            goto L_0x00cf
        L_0x00c7:
            java.lang.Object r12 = r14.getLast()
            h0.t.f r12 = (h0.t.f) r12
            h0.t.k r12 = r12.d
        L_0x00cf:
            java.util.Deque<h0.t.f> r3 = r11.h
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x010c
            java.util.Deque<h0.t.f> r3 = r11.h
            java.lang.Object r3 = r3.getLast()
            h0.t.f r3 = (h0.t.f) r3
            h0.t.k r3 = r3.d
            boolean r3 = r3 instanceof h0.t.m
            if (r3 == 0) goto L_0x010c
            java.util.Deque<h0.t.f> r3 = r11.h
            java.lang.Object r3 = r3.getLast()
            h0.t.f r3 = (h0.t.f) r3
            h0.t.k r3 = r3.d
            h0.t.m r3 = (h0.t.m) r3
            int r4 = r12.q
            h0.t.k r3 = r3.t(r4, r0)
            if (r3 != 0) goto L_0x010c
            java.util.Deque<h0.t.f> r3 = r11.h
            java.lang.Object r3 = r3.getLast()
            h0.t.f r3 = (h0.t.f) r3
            h0.t.k r3 = r3.d
            int r3 = r3.q
            boolean r3 = r11.n(r3, r2)
            if (r3 == 0) goto L_0x010c
            goto L_0x00cf
        L_0x010c:
            java.util.Deque<h0.t.f> r12 = r11.h
            r12.addAll(r14)
            java.util.Deque<h0.t.f> r12 = r11.h
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x0127
            java.util.Deque<h0.t.f> r12 = r11.h
            java.lang.Object r12 = r12.getFirst()
            h0.t.f r12 = (h0.t.f) r12
            h0.t.k r12 = r12.d
            h0.t.m r14 = r11.d
            if (r12 == r14) goto L_0x013b
        L_0x0127:
            h0.t.f r12 = new h0.t.f
            android.content.Context r4 = r11.a
            h0.t.m r5 = r11.d
            h0.q.p r7 = r11.i
            h0.t.g r8 = r11.j
            r3 = r12
            r6 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Deque<h0.t.f> r14 = r11.h
            r14.addFirst(r12)
        L_0x013b:
            h0.t.f r12 = new h0.t.f
            android.content.Context r4 = r11.a
            android.os.Bundle r6 = r15.b(r13)
            h0.q.p r7 = r11.i
            h0.t.g r8 = r11.j
            r3 = r12
            r5 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            java.util.Deque<h0.t.f> r13 = r11.h
            r13.add(r12)
            goto L_0x0165
        L_0x0152:
            if (r14 == 0) goto L_0x0165
            boolean r12 = r14.a
            if (r12 == 0) goto L_0x0165
            java.util.Deque<h0.t.f> r12 = r11.h
            java.lang.Object r12 = r12.peekLast()
            h0.t.f r12 = (h0.t.f) r12
            if (r12 == 0) goto L_0x0164
            r12.q = r13
        L_0x0164:
            r0 = r2
        L_0x0165:
            r11.p()
            if (r1 != 0) goto L_0x016e
            if (r15 != 0) goto L_0x016e
            if (r0 == 0) goto L_0x0171
        L_0x016e:
            r11.a()
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavController.j(h0.t.k, android.os.Bundle, h0.t.q, h0.t.s$a):void");
    }

    public boolean k() {
        if (e() != 1) {
            return l();
        }
        k d2 = d();
        int i2 = d2.q;
        for (m mVar = d2.d; mVar != null; mVar = mVar.d) {
            if (mVar.c2 != i2) {
                Bundle bundle = new Bundle();
                Activity activity = this.b;
                if (!(activity == null || activity.getIntent() == null || this.b.getIntent().getData() == null)) {
                    bundle.putParcelable("android-support-nav:controller:deepLinkIntent", this.b.getIntent());
                    m mVar2 = this.d;
                    Intent intent = this.b.getIntent();
                    k.a k2 = mVar2.k(new j(intent.getData(), intent.getAction(), intent.getType()));
                    if (k2 != null) {
                        bundle.putAll(k2.c.b(k2.d));
                    }
                }
                i iVar = new i(this.a);
                m mVar3 = this.d;
                if (mVar3 != null) {
                    iVar.c = mVar3;
                    iVar.d(mVar.q);
                    iVar.e = bundle;
                    iVar.b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                    iVar.b().startActivities();
                    Activity activity2 = this.b;
                    if (activity2 != null) {
                        activity2.finish();
                    }
                    return true;
                }
                throw new IllegalStateException("You must call setGraph() before calling getGraph()");
            }
            i2 = mVar.q;
        }
        return false;
    }

    public boolean l() {
        if (this.h.isEmpty()) {
            return false;
        }
        return m(d().q, true);
    }

    public boolean m(int i2, boolean z) {
        return n(i2, z) && a();
    }

    public boolean n(int i2, boolean z) {
        boolean z2;
        n0 remove;
        boolean z3 = false;
        if (this.h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<f> descendingIterator = this.h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            k kVar = descendingIterator.next().d;
            s c2 = this.k.c(kVar.c);
            if (z || kVar.q != i2) {
                arrayList.add(c2);
            }
            if (kVar.q == i2) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            Log.i("NavController", "Ignoring popBackStack to destination " + k.j(this.a, i2) + " as it was not found on the current back stack");
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((s) it.next()).e()) {
            f removeLast = this.h.removeLast();
            if (removeLast.x.c.isAtLeast(Lifecycle.State.CREATED)) {
                removeLast.a2 = Lifecycle.State.DESTROYED;
                removeLast.b();
            }
            g gVar = this.j;
            if (!(gVar == null || (remove = gVar.b.remove(removeLast.Y1)) == null)) {
                remove.a();
            }
            z3 = true;
        }
        p();
        return z3;
    }

    public void o(m mVar, Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        m mVar2 = this.d;
        boolean z = true;
        if (mVar2 != null) {
            n(mVar2.q, true);
        }
        this.d = mVar;
        Bundle bundle2 = this.e;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) == null)) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                s c2 = this.k.c(next);
                Bundle bundle3 = this.e.getBundle(next);
                if (bundle3 != null) {
                    c2.c(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i2 = 0;
            while (i2 < length) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelableArr[i2];
                k b2 = b(navBackStackEntryState.d);
                if (b2 != null) {
                    Bundle bundle4 = navBackStackEntryState.q;
                    if (bundle4 != null) {
                        bundle4.setClassLoader(this.a.getClassLoader());
                    }
                    this.h.add(new f(this.a, b2, bundle4, this.i, this.j, navBackStackEntryState.c, navBackStackEntryState.x));
                    i2++;
                } else {
                    StringBuilder T0 = i0.d.a.a.a.T0("Restoring the Navigation back stack failed: destination ", k.j(this.a, navBackStackEntryState.d), " cannot be found from the current destination ");
                    T0.append(d());
                    throw new IllegalStateException(T0.toString());
                }
            }
            p();
            this.f = null;
        }
        if (this.d == null || !this.h.isEmpty()) {
            a();
            return;
        }
        if (this.g || (activity = this.b) == null || !g(activity.getIntent())) {
            z = false;
        }
        if (!z) {
            j(this.d, bundle, (q) null, (s.a) null);
        }
    }

    public final void p() {
        h0.a.b bVar = this.n;
        boolean z = true;
        if (!this.o || e() <= 1) {
            z = false;
        }
        bVar.a = z;
    }
}
