package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import h0.o.a.a0;
import h0.o.a.b0;
import h0.o.a.c0;
import h0.o.a.j0;
import h0.o.a.p0;
import h0.o.a.q;
import h0.o.a.q0;
import h0.o.a.s;
import h0.o.a.t;
import h0.o.a.u;
import h0.o.a.v;
import h0.o.a.x;
import h0.o.a.y;
import h0.q.p;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class FragmentManager {
    public h0.a.f.b<String[]> A;
    public ArrayDeque<LaunchedFragmentInfo> B = new ArrayDeque<>();
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public ArrayList<h0.o.a.a> H;
    public ArrayList<Boolean> I;
    public ArrayList<Fragment> J;
    public ArrayList<o> K;
    public x L;
    public Runnable M = new g();
    public final ArrayList<m> a = new ArrayList<>();
    public boolean b;
    public final b0 c = new b0();
    public ArrayList<h0.o.a.a> d;
    public ArrayList<Fragment> e;
    public final u f = new u(this);
    public OnBackPressedDispatcher g;
    public final h0.a.b h = new c(false);
    public final AtomicInteger i = new AtomicInteger();
    public final Map<String, Bundle> j = Collections.synchronizedMap(new HashMap());
    public final Map<String, ?> k = Collections.synchronizedMap(new HashMap());
    public ArrayList<l> l;
    public Map<Fragment, HashSet<h0.i.e.a>> m = Collections.synchronizedMap(new HashMap());
    public final j0.a n = new d();
    public final v o = new v(this);
    public final CopyOnWriteArrayList<y> p = new CopyOnWriteArrayList<>();
    public int q = -1;
    public t<?> r;
    public q s;
    public Fragment t;
    public Fragment u;
    public s v = null;
    public s w = new e();
    public q0 x = new f(this);
    public h0.a.f.b<Intent> y;
    public h0.a.f.b<IntentSenderRequest> z;

    /* renamed from: androidx.fragment.app.FragmentManager$6  reason: invalid class name */
    public class AnonymousClass6 implements h0.q.n {
        public void a(p pVar, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                throw null;
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                throw null;
            }
        }
    }

    public class a implements h0.a.f.a<ActivityResult> {
        public a() {
        }

        public void onActivityResult(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.B.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = pollFirst.c;
            int i = pollFirst.d;
            Fragment e = FragmentManager.this.c.e(str);
            if (e == null) {
                Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                return;
            }
            e.onActivityResult(i, activityResult.c, activityResult.d);
        }
    }

    public class b implements h0.a.f.a<Map<String, Boolean>> {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onActivityResult(Object obj) {
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo pollFirst = FragmentManager.this.B.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = pollFirst.c;
            int i2 = pollFirst.d;
            Fragment e = FragmentManager.this.c.e(str);
            if (e == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                return;
            }
            e.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    public class c extends h0.a.b {
        public c(boolean z) {
            super(z);
        }

        public void a() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.C(true);
            if (fragmentManager.h.a) {
                fragmentManager.b0();
            } else {
                fragmentManager.g.b();
            }
        }
    }

    public class d implements j0.a {
        public d() {
        }

        public void a(Fragment fragment, h0.i.e.a aVar) {
            boolean z;
            synchronized (aVar) {
                z = aVar.a;
            }
            if (!z) {
                FragmentManager fragmentManager = FragmentManager.this;
                HashSet hashSet = fragmentManager.m.get(fragment);
                if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
                    fragmentManager.m.remove(fragment);
                    if (fragment.mState < 5) {
                        fragmentManager.i(fragment);
                        fragmentManager.X(fragment, fragmentManager.q);
                    }
                }
            }
        }

        public void b(Fragment fragment, h0.i.e.a aVar) {
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.m.get(fragment) == null) {
                fragmentManager.m.put(fragment, new HashSet());
            }
            fragmentManager.m.get(fragment).add(aVar);
        }
    }

    public class e extends s {
        public e() {
        }

        public Fragment instantiate(ClassLoader classLoader, String str) {
            t<?> tVar = FragmentManager.this.r;
            Context context = tVar.d;
            Objects.requireNonNull(tVar);
            return Fragment.instantiate(context, str, (Bundle) null);
        }
    }

    public class f implements q0 {
        public f(FragmentManager fragmentManager) {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            FragmentManager.this.C(true);
        }
    }

    public class h implements y {
        public final /* synthetic */ Fragment c;

        public h(FragmentManager fragmentManager, Fragment fragment) {
            this.c = fragment;
        }

        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.c.onAttachFragment(fragment);
        }
    }

    public class i implements h0.a.f.a<ActivityResult> {
        public i() {
        }

        public void onActivityResult(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            LaunchedFragmentInfo pollFirst = FragmentManager.this.B.pollFirst();
            if (pollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = pollFirst.c;
            int i = pollFirst.d;
            Fragment e = FragmentManager.this.c.e(str);
            if (e == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                return;
            }
            e.onActivityResult(i, activityResult.c, activityResult.d);
        }
    }

    public static class j extends h0.a.f.d.a<IntentSenderRequest, ActivityResult> {
        public Intent createIntent(Context context, Object obj) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent intent2 = intentSenderRequest.d;
            if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequest = new IntentSenderRequest(intentSenderRequest.c, (Intent) null, intentSenderRequest.q, intentSenderRequest.x);
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        public Object parseResult(int i, Intent intent) {
            return new ActivityResult(i, intent);
        }
    }

    public static abstract class k {
        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    public interface l {
        void onBackStackChanged();
    }

    public interface m {
        boolean a(ArrayList<h0.o.a.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class n implements m {
        public final String a;
        public final int b;
        public final int c;

        public n(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public boolean a(ArrayList<h0.o.a.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.u;
            if (fragment != null && this.b < 0 && this.a == null && fragment.getChildFragmentManager().b0()) {
                return false;
            }
            return FragmentManager.this.c0(arrayList, arrayList2, this.a, this.b, this.c);
        }
    }

    public static class o implements Fragment.k {
        public final boolean a;
        public final h0.o.a.a b;
        public int c;

        public void a() {
            boolean z = this.c > 0;
            for (Fragment next : this.b.s.O()) {
                next.setOnStartEnterTransitionListener((Fragment.k) null);
                if (z && next.isPostponed()) {
                    next.startPostponedEnterTransition();
                }
            }
            h0.o.a.a aVar = this.b;
            aVar.s.g(aVar, this.a, !z, true);
        }
    }

    public static boolean R(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public void A(m mVar, boolean z2) {
        if (!z2) {
            if (this.r == null) {
                if (this.F) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (V()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            if (this.r != null) {
                this.a.add(mVar);
                h0();
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void B(boolean z2) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.r == null) {
            if (this.F) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.r.q.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z2 || !V()) {
            if (this.H == null) {
                this.H = new ArrayList<>();
                this.I = new ArrayList<>();
            }
            this.b = true;
            try {
                G((ArrayList<h0.o.a.a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.b = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean C(boolean z2) {
        boolean z3;
        B(z2);
        boolean z4 = false;
        while (true) {
            ArrayList<h0.o.a.a> arrayList = this.H;
            ArrayList<Boolean> arrayList2 = this.I;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z3 = false;
                } else {
                    int size = this.a.size();
                    z3 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z3 |= this.a.get(i2).a(arrayList, arrayList2);
                    }
                    this.a.clear();
                    this.r.q.removeCallbacks(this.M);
                }
            }
            if (z3) {
                this.b = true;
                try {
                    e0(this.H, this.I);
                    e();
                    z4 = true;
                } catch (Throwable th) {
                    e();
                    throw th;
                }
            } else {
                o0();
                x();
                this.c.b();
                return z4;
            }
        }
        while (true) {
        }
    }

    /* JADX INFO: finally extract failed */
    public void D(m mVar, boolean z2) {
        if (!z2 || (this.r != null && !this.F)) {
            B(z2);
            ((h0.o.a.a) mVar).a(this.H, this.I);
            this.b = true;
            try {
                e0(this.H, this.I);
                e();
                o0();
                x();
                this.c.b();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
    }

    public final void E(ArrayList<h0.o.a.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        int i4;
        int i5;
        ArrayList<h0.o.a.a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i6 = i2;
        int i7 = i3;
        boolean z2 = arrayList3.get(i6).r;
        ArrayList<Fragment> arrayList5 = this.J;
        if (arrayList5 == null) {
            this.J = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.J.addAll(this.c.i());
        Fragment fragment = this.u;
        int i8 = i6;
        boolean z3 = false;
        while (true) {
            int i9 = 1;
            if (i8 < i7) {
                h0.o.a.a aVar = arrayList3.get(i8);
                int i10 = 3;
                if (!arrayList4.get(i8).booleanValue()) {
                    ArrayList<Fragment> arrayList6 = this.J;
                    int i11 = 0;
                    while (i11 < aVar.c.size()) {
                        c0.a aVar2 = aVar.c.get(i11);
                        int i12 = aVar2.a;
                        if (i12 != i9) {
                            if (i12 == 2) {
                                Fragment fragment2 = aVar2.b;
                                int i13 = fragment2.mContainerId;
                                int size = arrayList6.size() - 1;
                                boolean z4 = false;
                                while (size >= 0) {
                                    Fragment fragment3 = arrayList6.get(size);
                                    if (fragment3.mContainerId != i13) {
                                        i5 = i13;
                                    } else if (fragment3 == fragment2) {
                                        i5 = i13;
                                        z4 = true;
                                    } else {
                                        if (fragment3 == fragment) {
                                            i5 = i13;
                                            aVar.c.add(i11, new c0.a(9, fragment3));
                                            i11++;
                                            fragment = null;
                                        } else {
                                            i5 = i13;
                                        }
                                        c0.a aVar3 = new c0.a(3, fragment3);
                                        aVar3.c = aVar2.c;
                                        aVar3.e = aVar2.e;
                                        aVar3.d = aVar2.d;
                                        aVar3.f = aVar2.f;
                                        aVar.c.add(i11, aVar3);
                                        arrayList6.remove(fragment3);
                                        i11++;
                                    }
                                    size--;
                                    ArrayList<Boolean> arrayList7 = arrayList2;
                                    i13 = i5;
                                }
                                if (z4) {
                                    aVar.c.remove(i11);
                                    i11--;
                                } else {
                                    i4 = 1;
                                    aVar2.a = 1;
                                    arrayList6.add(fragment2);
                                    i11 += i4;
                                    int i14 = i2;
                                    i9 = i4;
                                    i10 = 3;
                                    ArrayList<Boolean> arrayList8 = arrayList2;
                                }
                            } else if (i12 == i10 || i12 == 6) {
                                arrayList6.remove(aVar2.b);
                                Fragment fragment4 = aVar2.b;
                                if (fragment4 == fragment) {
                                    aVar.c.add(i11, new c0.a(9, fragment4));
                                    i11++;
                                    i4 = 1;
                                    fragment = null;
                                    i11 += i4;
                                    int i142 = i2;
                                    i9 = i4;
                                    i10 = 3;
                                    ArrayList<Boolean> arrayList82 = arrayList2;
                                }
                            } else if (i12 == 7) {
                                i4 = 1;
                            } else if (i12 == 8) {
                                aVar.c.add(i11, new c0.a(9, fragment));
                                i11++;
                                fragment = aVar2.b;
                            }
                            i4 = 1;
                            i11 += i4;
                            int i1422 = i2;
                            i9 = i4;
                            i10 = 3;
                            ArrayList<Boolean> arrayList822 = arrayList2;
                        } else {
                            i4 = i9;
                        }
                        arrayList6.add(aVar2.b);
                        i11 += i4;
                        int i14222 = i2;
                        i9 = i4;
                        i10 = 3;
                        ArrayList<Boolean> arrayList8222 = arrayList2;
                    }
                } else {
                    int i15 = 1;
                    ArrayList<Fragment> arrayList9 = this.J;
                    int size2 = aVar.c.size() - 1;
                    while (size2 >= 0) {
                        c0.a aVar4 = aVar.c.get(size2);
                        int i16 = aVar4.a;
                        if (i16 != i15) {
                            if (i16 != 3) {
                                switch (i16) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        fragment = null;
                                        break;
                                    case 9:
                                        fragment = aVar4.b;
                                        break;
                                    case 10:
                                        aVar4.h = aVar4.g;
                                        break;
                                }
                            }
                            arrayList9.add(aVar4.b);
                            size2--;
                            i15 = 1;
                        }
                        arrayList9.remove(aVar4.b);
                        size2--;
                        i15 = 1;
                    }
                }
                z3 = z3 || aVar.i;
                i8++;
                arrayList4 = arrayList2;
                int i17 = i2;
            } else {
                this.J.clear();
                if (!z2 && this.q >= 1) {
                    for (int i18 = i2; i18 < i7; i18++) {
                        Iterator<c0.a> it = arrayList3.get(i18).c.iterator();
                        while (it.hasNext()) {
                            Fragment fragment5 = it.next().b;
                            if (!(fragment5 == null || fragment5.mFragmentManager == null)) {
                                this.c.j(h(fragment5));
                            }
                        }
                    }
                }
                int i19 = i2;
                while (i19 < i7) {
                    h0.o.a.a aVar5 = arrayList3.get(i19);
                    if (arrayList2.get(i19).booleanValue()) {
                        aVar5.u(-1);
                        aVar5.y(i19 == i7 + -1);
                    } else {
                        aVar5.u(1);
                        aVar5.x();
                    }
                    i19++;
                }
                ArrayList<Boolean> arrayList10 = arrayList2;
                boolean booleanValue = arrayList10.get(i7 - 1).booleanValue();
                for (int i20 = i2; i20 < i7; i20++) {
                    h0.o.a.a aVar6 = arrayList3.get(i20);
                    if (booleanValue) {
                        for (int size3 = aVar6.c.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment6 = aVar6.c.get(size3).b;
                            if (fragment6 != null) {
                                h(fragment6).k();
                            }
                        }
                    } else {
                        Iterator<c0.a> it2 = aVar6.c.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment7 = it2.next().b;
                            if (fragment7 != null) {
                                h(fragment7).k();
                            }
                        }
                    }
                }
                W(this.q, true);
                HashSet hashSet = new HashSet();
                for (int i21 = i2; i21 < i7; i21++) {
                    Iterator<c0.a> it3 = arrayList3.get(i21).c.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment8 = it3.next().b;
                        if (!(fragment8 == null || (viewGroup = fragment8.mContainer) == null)) {
                            hashSet.add(SpecialEffectsController.g(viewGroup, P()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    SpecialEffectsController specialEffectsController = (SpecialEffectsController) it4.next();
                    specialEffectsController.d = booleanValue;
                    specialEffectsController.h();
                    specialEffectsController.c();
                }
                for (int i22 = i2; i22 < i7; i22++) {
                    h0.o.a.a aVar7 = arrayList3.get(i22);
                    if (arrayList10.get(i22).booleanValue() && aVar7.u >= 0) {
                        aVar7.u = -1;
                    }
                    Objects.requireNonNull(aVar7);
                }
                if (z3 && this.l != null) {
                    for (int i23 = 0; i23 < this.l.size(); i23++) {
                        this.l.get(i23).onBackStackChanged();
                    }
                    return;
                }
                return;
            }
        }
    }

    public boolean F() {
        boolean C2 = C(true);
        K();
        return C2;
    }

    public final void G(ArrayList<h0.o.a.a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<o> arrayList3 = this.K;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            o oVar = this.K.get(i2);
            if (arrayList == null || oVar.a || (indexOf2 = arrayList.indexOf(oVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((oVar.c == 0) || (arrayList != null && oVar.b.A(arrayList, 0, arrayList.size()))) {
                    this.K.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || oVar.a || (indexOf = arrayList.indexOf(oVar.b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        oVar.a();
                    } else {
                        h0.o.a.a aVar = oVar.b;
                        aVar.s.g(aVar, oVar.a, false, false);
                    }
                }
            } else {
                this.K.remove(i2);
                i2--;
                size--;
                h0.o.a.a aVar2 = oVar.b;
                aVar2.s.g(aVar2, oVar.a, false, false);
            }
            i2++;
        }
    }

    public Fragment H(String str) {
        return this.c.d(str);
    }

    public Fragment I(int i2) {
        b0 b0Var = this.c;
        int size = b0Var.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                Fragment fragment = b0Var.a.get(size);
                if (fragment != null && fragment.mFragmentId == i2) {
                    return fragment;
                }
            } else {
                for (a0 next : b0Var.b.values()) {
                    if (next != null) {
                        Fragment fragment2 = next.c;
                        if (fragment2.mFragmentId == i2) {
                            return fragment2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public Fragment J(String str) {
        b0 b0Var = this.c;
        Objects.requireNonNull(b0Var);
        if (str != null) {
            int size = b0Var.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                Fragment fragment = b0Var.a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (a0 next : b0Var.b.values()) {
                if (next != null) {
                    Fragment fragment2 = next.c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        }
        return null;
    }

    public final void K() {
        Iterator it = ((HashSet) f()).iterator();
        while (it.hasNext()) {
            SpecialEffectsController specialEffectsController = (SpecialEffectsController) it.next();
            if (specialEffectsController.e) {
                specialEffectsController.e = false;
                specialEffectsController.c();
            }
        }
    }

    public int L() {
        ArrayList<h0.o.a.a> arrayList = this.d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public final ViewGroup M(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.s.c()) {
            View b2 = this.s.b(fragment.mContainerId);
            if (b2 instanceof ViewGroup) {
                return (ViewGroup) b2;
            }
        }
        return null;
    }

    public s N() {
        s sVar = this.v;
        if (sVar != null) {
            return sVar;
        }
        Fragment fragment = this.t;
        if (fragment != null) {
            return fragment.mFragmentManager.N();
        }
        return this.w;
    }

    public List<Fragment> O() {
        return this.c.i();
    }

    public q0 P() {
        Fragment fragment = this.t;
        if (fragment != null) {
            return fragment.mFragmentManager.P();
        }
        return this.x;
    }

    public void Q(Fragment fragment) {
        if (R(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            l0(fragment);
        }
    }

    public final boolean S(Fragment fragment) {
        boolean z2;
        if (fragment.mHasMenu && fragment.mMenuVisible) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mChildFragmentManager;
        Iterator it = ((ArrayList) fragmentManager.c.g()).iterator();
        boolean z3 = false;
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            Fragment fragment2 = (Fragment) it.next();
            if (fragment2 != null) {
                z3 = fragmentManager.S(fragment2);
                continue;
            }
            if (z3) {
                z2 = true;
                break;
            }
        }
        if (z2) {
            return true;
        }
        return false;
    }

    public boolean T(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public boolean U(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.u) || !U(fragmentManager.t)) {
            return false;
        }
        return true;
    }

    public boolean V() {
        return this.D || this.E;
    }

    public void W(int i2, boolean z2) {
        t<?> tVar;
        if (this.r == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.q) {
            this.q = i2;
            b0 b0Var = this.c;
            Iterator<Fragment> it = b0Var.a.iterator();
            while (it.hasNext()) {
                a0 a0Var = b0Var.b.get(it.next().mWho);
                if (a0Var != null) {
                    a0Var.k();
                }
            }
            Iterator<a0> it2 = b0Var.b.values().iterator();
            while (true) {
                boolean z3 = false;
                if (!it2.hasNext()) {
                    break;
                }
                a0 next = it2.next();
                if (next != null) {
                    next.k();
                    Fragment fragment = next.c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        z3 = true;
                    }
                    if (z3) {
                        b0Var.k(next);
                    }
                }
            }
            n0();
            if (this.C && (tVar = this.r) != null && this.q == 7) {
                tVar.h();
                this.C = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 != 5) goto L_0x01bc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void X(androidx.fragment.app.Fragment r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            h0.o.a.b0 r1 = r0.c
            java.lang.String r2 = r7.mWho
            h0.o.a.a0 r1 = r1.h(r2)
            r8 = 1
            if (r1 != 0) goto L_0x001a
            h0.o.a.a0 r1 = new h0.o.a.a0
            h0.o.a.v r2 = r0.o
            h0.o.a.b0 r3 = r0.c
            r1.<init>(r2, r3, r7)
            r1.e = r8
        L_0x001a:
            r9 = r1
            boolean r1 = r7.mFromLayout
            r10 = 2
            if (r1 == 0) goto L_0x002f
            boolean r1 = r7.mInLayout
            if (r1 == 0) goto L_0x002f
            int r1 = r7.mState
            if (r1 != r10) goto L_0x002f
            r1 = r18
            int r1 = java.lang.Math.max(r1, r10)
            goto L_0x0031
        L_0x002f:
            r1 = r18
        L_0x0031:
            int r2 = r9.d()
            int r11 = java.lang.Math.min(r1, r2)
            int r1 = r7.mState
            r12 = 3
            java.lang.String r13 = "FragmentManager"
            r2 = -1
            r3 = 5
            r4 = 4
            if (r1 > r11) goto L_0x0085
            if (r1 >= r11) goto L_0x0050
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<h0.i.e.a>> r1 = r0.m
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0050
            r16.d(r17)
        L_0x0050:
            int r1 = r7.mState
            if (r1 == r2) goto L_0x0060
            if (r1 == 0) goto L_0x0065
            if (r1 == r8) goto L_0x006a
            if (r1 == r10) goto L_0x0074
            if (r1 == r4) goto L_0x0079
            if (r1 == r3) goto L_0x007e
            goto L_0x01bc
        L_0x0060:
            if (r11 <= r2) goto L_0x0065
            r9.c()
        L_0x0065:
            if (r11 <= 0) goto L_0x006a
            r9.e()
        L_0x006a:
            if (r11 <= r2) goto L_0x006f
            r9.j()
        L_0x006f:
            if (r11 <= r8) goto L_0x0074
            r9.f()
        L_0x0074:
            if (r11 <= r10) goto L_0x0079
            r9.a()
        L_0x0079:
            if (r11 <= r4) goto L_0x007e
            r9.p()
        L_0x007e:
            if (r11 <= r3) goto L_0x01bc
            r9.n()
            goto L_0x01bc
        L_0x0085:
            if (r1 <= r11) goto L_0x01bc
            if (r1 == 0) goto L_0x01b5
            if (r1 == r8) goto L_0x01a5
            if (r1 == r10) goto L_0x00cf
            if (r1 == r4) goto L_0x00a0
            if (r1 == r3) goto L_0x009b
            r5 = 7
            if (r1 == r5) goto L_0x0096
            goto L_0x01bc
        L_0x0096:
            if (r11 >= r5) goto L_0x009b
            r9.l()
        L_0x009b:
            if (r11 >= r3) goto L_0x00a0
            r9.q()
        L_0x00a0:
            if (r11 >= r4) goto L_0x00cf
            boolean r1 = R(r12)
            if (r1 == 0) goto L_0x00bc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "movefrom ACTIVITY_CREATED: "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r13, r1)
        L_0x00bc:
            android.view.View r1 = r7.mView
            if (r1 == 0) goto L_0x00cf
            h0.o.a.t<?> r1 = r0.r
            boolean r1 = r1.f(r7)
            if (r1 == 0) goto L_0x00cf
            android.util.SparseArray<android.os.Parcelable> r1 = r7.mSavedViewState
            if (r1 != 0) goto L_0x00cf
            r9.o()
        L_0x00cf:
            if (r11 >= r10) goto L_0x01a5
            r1 = 0
            android.view.View r3 = r7.mView
            if (r3 == 0) goto L_0x0198
            android.view.ViewGroup r4 = r7.mContainer
            if (r4 == 0) goto L_0x0198
            r4.endViewTransition(r3)
            android.view.View r3 = r7.mView
            r3.clearAnimation()
            boolean r3 = r17.isRemovingParent()
            if (r3 != 0) goto L_0x0198
            int r3 = r0.q
            r4 = 0
            if (r3 <= r2) goto L_0x010c
            boolean r2 = r0.F
            if (r2 != 0) goto L_0x010c
            android.view.View r2 = r7.mView
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x010c
            float r2 = r7.mPostponedAlpha
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x010c
            h0.o.a.t<?> r1 = r0.r
            android.content.Context r1 = r1.d
            r2 = 0
            boolean r3 = r17.getPopDirection()
            h0.o.a.o r1 = g0.a.b.b.a.b0(r1, r7, r2, r3)
        L_0x010c:
            r7.mPostponedAlpha = r4
            android.view.ViewGroup r14 = r7.mContainer
            android.view.View r15 = r7.mView
            if (r1 == 0) goto L_0x0166
            h0.o.a.j0$a r2 = r0.n
            r14.startViewTransition(r15)
            h0.i.e.a r6 = new h0.i.e.a
            r6.<init>()
            h0.o.a.l r3 = new h0.o.a.l
            r3.<init>(r7)
            r6.b(r3)
            r5 = r2
            androidx.fragment.app.FragmentManager$d r5 = (androidx.fragment.app.FragmentManager.d) r5
            r5.b(r7, r6)
            android.view.animation.Animation r2 = r1.a
            if (r2 == 0) goto L_0x014a
            h0.o.a.p r2 = new h0.o.a.p
            android.view.animation.Animation r1 = r1.a
            r2.<init>(r1, r14, r15)
            android.view.View r1 = r7.mView
            r7.setAnimatingAway(r1)
            h0.o.a.m r1 = new h0.o.a.m
            r1.<init>(r14, r7, r5, r6)
            r2.setAnimationListener(r1)
            android.view.View r1 = r7.mView
            r1.startAnimation(r2)
            goto L_0x0166
        L_0x014a:
            android.animation.Animator r4 = r1.b
            r7.setAnimator(r4)
            h0.o.a.n r3 = new h0.o.a.n
            r1 = r3
            r2 = r14
            r12 = r3
            r3 = r15
            r8 = r4
            r4 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r8.addListener(r12)
            android.view.View r1 = r7.mView
            r8.setTarget(r1)
            r8.start()
        L_0x0166:
            r14.removeView(r15)
            boolean r1 = R(r10)
            if (r1 == 0) goto L_0x0193
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Removing view "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " for fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " from container "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r13, r1)
        L_0x0193:
            android.view.ViewGroup r1 = r7.mContainer
            if (r14 == r1) goto L_0x0198
            return
        L_0x0198:
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<h0.i.e.a>> r1 = r0.m
            java.lang.Object r1 = r1.get(r7)
            if (r1 != 0) goto L_0x01a3
            r9.h()
        L_0x01a3:
            r1 = 1
            goto L_0x01a6
        L_0x01a5:
            r1 = r8
        L_0x01a6:
            if (r11 >= r1) goto L_0x01b5
            java.util.Map<androidx.fragment.app.Fragment, java.util.HashSet<h0.i.e.a>> r2 = r0.m
            java.lang.Object r2 = r2.get(r7)
            if (r2 == 0) goto L_0x01b2
            r8 = r1
            goto L_0x01b6
        L_0x01b2:
            r9.g()
        L_0x01b5:
            r8 = r11
        L_0x01b6:
            if (r8 >= 0) goto L_0x01bb
            r9.i()
        L_0x01bb:
            r11 = r8
        L_0x01bc:
            int r1 = r7.mState
            if (r1 == r11) goto L_0x01ef
            r1 = 3
            boolean r1 = R(r1)
            if (r1 == 0) goto L_0x01ed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " not updated inline; expected state "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.mState
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r13, r1)
        L_0x01ed:
            r7.mState = r11
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.X(androidx.fragment.app.Fragment, int):void");
    }

    public void Y() {
        if (this.r != null) {
            this.D = false;
            this.E = false;
            this.L.g = false;
            for (Fragment next : this.c.i()) {
                if (next != null) {
                    next.noteStateNotSaved();
                }
            }
        }
    }

    public void Z(a0 a0Var) {
        Fragment fragment = a0Var.c;
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.b) {
            this.G = true;
            return;
        }
        fragment.mDeferStart = false;
        a0Var.k();
    }

    public a0 a(Fragment fragment) {
        if (R(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        a0 h2 = h(fragment);
        fragment.mFragmentManager = this;
        this.c.j(h2);
        if (!fragment.mDetached) {
            this.c.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (S(fragment)) {
                this.C = true;
            }
        }
        return h2;
    }

    public void a0(String str, int i2) {
        A(new n(str, -1, i2), false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: h0.a.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v36, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(h0.o.a.t<?> r5, h0.o.a.q r6, androidx.fragment.app.Fragment r7) {
        /*
            r4 = this;
            h0.o.a.t<?> r0 = r4.r
            if (r0 != 0) goto L_0x013d
            r4.r = r5
            r4.s = r6
            r4.t = r7
            if (r7 == 0) goto L_0x0017
            androidx.fragment.app.FragmentManager$h r6 = new androidx.fragment.app.FragmentManager$h
            r6.<init>(r4, r7)
            java.util.concurrent.CopyOnWriteArrayList<h0.o.a.y> r0 = r4.p
            r0.add(r6)
            goto L_0x0023
        L_0x0017:
            boolean r6 = r5 instanceof h0.o.a.y
            if (r6 == 0) goto L_0x0023
            r6 = r5
            h0.o.a.y r6 = (h0.o.a.y) r6
            java.util.concurrent.CopyOnWriteArrayList<h0.o.a.y> r0 = r4.p
            r0.add(r6)
        L_0x0023:
            androidx.fragment.app.Fragment r6 = r4.t
            if (r6 == 0) goto L_0x002a
            r4.o0()
        L_0x002a:
            boolean r6 = r5 instanceof h0.a.d
            if (r6 == 0) goto L_0x003f
            r6 = r5
            h0.a.d r6 = (h0.a.d) r6
            androidx.activity.OnBackPressedDispatcher r0 = r6.getOnBackPressedDispatcher()
            r4.g = r0
            if (r7 == 0) goto L_0x003a
            r6 = r7
        L_0x003a:
            h0.a.b r1 = r4.h
            r0.a(r6, r1)
        L_0x003f:
            if (r7 == 0) goto L_0x0062
            androidx.fragment.app.FragmentManager r5 = r7.mFragmentManager
            h0.o.a.x r5 = r5.L
            java.util.HashMap<java.lang.String, h0.o.a.x> r6 = r5.c
            java.lang.String r0 = r7.mWho
            java.lang.Object r6 = r6.get(r0)
            h0.o.a.x r6 = (h0.o.a.x) r6
            if (r6 != 0) goto L_0x005f
            h0.o.a.x r6 = new h0.o.a.x
            boolean r0 = r5.e
            r6.<init>(r0)
            java.util.HashMap<java.lang.String, h0.o.a.x> r5 = r5.c
            java.lang.String r0 = r7.mWho
            r5.put(r0, r6)
        L_0x005f:
            r4.L = r6
            goto L_0x00c8
        L_0x0062:
            boolean r6 = r5 instanceof h0.q.o0
            if (r6 == 0) goto L_0x00c0
            h0.q.o0 r5 = (h0.q.o0) r5
            h0.q.n0 r5 = r5.getViewModelStore()
            h0.q.m0$b r6 = h0.o.a.x.a
            java.lang.Class<h0.o.a.x> r0 = h0.o.a.x.class
            java.lang.String r1 = r0.getCanonicalName()
            if (r1 == 0) goto L_0x00b8
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r1 = i0.d.a.a.a.n0(r2, r1)
            java.util.HashMap<java.lang.String, h0.q.k0> r2 = r5.a
            java.lang.Object r2 = r2.get(r1)
            h0.q.k0 r2 = (h0.q.k0) r2
            boolean r3 = r0.isInstance(r2)
            if (r3 == 0) goto L_0x0094
            boolean r5 = r6 instanceof h0.q.m0.e
            if (r5 == 0) goto L_0x00b3
            h0.q.m0$e r6 = (h0.q.m0.e) r6
            r6.onRequery(r2)
            goto L_0x00b3
        L_0x0094:
            boolean r2 = r6 instanceof h0.q.m0.c
            if (r2 == 0) goto L_0x009f
            h0.q.m0$c r6 = (h0.q.m0.c) r6
            h0.q.k0 r6 = r6.create(r1, r0)
            goto L_0x00a5
        L_0x009f:
            h0.o.a.x$a r6 = (h0.o.a.x.a) r6
            h0.q.k0 r6 = r6.create(r0)
        L_0x00a5:
            r2 = r6
            java.util.HashMap<java.lang.String, h0.q.k0> r5 = r5.a
            java.lang.Object r5 = r5.put(r1, r2)
            h0.q.k0 r5 = (h0.q.k0) r5
            if (r5 == 0) goto L_0x00b3
            r5.onCleared()
        L_0x00b3:
            h0.o.a.x r2 = (h0.o.a.x) r2
            r4.L = r2
            goto L_0x00c8
        L_0x00b8:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            r5.<init>(r6)
            throw r5
        L_0x00c0:
            h0.o.a.x r5 = new h0.o.a.x
            r6 = 0
            r5.<init>(r6)
            r4.L = r5
        L_0x00c8:
            h0.o.a.x r5 = r4.L
            boolean r6 = r4.V()
            r5.g = r6
            h0.o.a.b0 r5 = r4.c
            h0.o.a.x r6 = r4.L
            r5.c = r6
            h0.o.a.t<?> r5 = r4.r
            boolean r6 = r5 instanceof h0.a.f.c
            if (r6 == 0) goto L_0x013c
            h0.a.f.c r5 = (h0.a.f.c) r5
            androidx.activity.result.ActivityResultRegistry r5 = r5.getActivityResultRegistry()
            if (r7 == 0) goto L_0x00f2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.mWho
            java.lang.String r0 = ":"
            java.lang.String r6 = i0.d.a.a.a.y0(r6, r7, r0)
            goto L_0x00f4
        L_0x00f2:
            java.lang.String r6 = ""
        L_0x00f4:
            java.lang.String r7 = "FragmentManager:"
            java.lang.String r6 = i0.d.a.a.a.n0(r7, r6)
            java.lang.String r7 = "StartActivityForResult"
            java.lang.String r7 = i0.d.a.a.a.n0(r6, r7)
            h0.a.f.d.d r0 = new h0.a.f.d.d
            r0.<init>()
            androidx.fragment.app.FragmentManager$i r1 = new androidx.fragment.app.FragmentManager$i
            r1.<init>()
            h0.a.f.b r7 = r5.c(r7, r0, r1)
            r4.y = r7
            java.lang.String r7 = "StartIntentSenderForResult"
            java.lang.String r7 = i0.d.a.a.a.n0(r6, r7)
            androidx.fragment.app.FragmentManager$j r0 = new androidx.fragment.app.FragmentManager$j
            r0.<init>()
            androidx.fragment.app.FragmentManager$a r1 = new androidx.fragment.app.FragmentManager$a
            r1.<init>()
            h0.a.f.b r7 = r5.c(r7, r0, r1)
            r4.z = r7
            java.lang.String r7 = "RequestPermissions"
            java.lang.String r6 = i0.d.a.a.a.n0(r6, r7)
            h0.a.f.d.c r7 = new h0.a.f.d.c
            r7.<init>()
            androidx.fragment.app.FragmentManager$b r0 = new androidx.fragment.app.FragmentManager$b
            r0.<init>()
            h0.a.f.b r5 = r5.c(r6, r7, r0)
            r4.A = r5
        L_0x013c:
            return
        L_0x013d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.b(h0.o.a.t, h0.o.a.q, androidx.fragment.app.Fragment):void");
    }

    public boolean b0() {
        C(false);
        B(true);
        Fragment fragment = this.u;
        if (fragment != null && fragment.getChildFragmentManager().b0()) {
            return true;
        }
        boolean c0 = c0(this.H, this.I, (String) null, -1, 0);
        if (c0) {
            this.b = true;
            try {
                e0(this.H, this.I);
            } finally {
                e();
            }
        }
        o0();
        x();
        this.c.b();
        return c0;
    }

    public void c(Fragment fragment) {
        if (R(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.c.a(fragment);
                if (R(2)) {
                    Log.v("FragmentManager", "add from attach: " + fragment);
                }
                if (S(fragment)) {
                    this.C = true;
                }
            }
        }
    }

    public boolean c0(ArrayList<h0.o.a.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        ArrayList<h0.o.a.a> arrayList3 = this.d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i4 = -1;
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    h0.o.a.a aVar = this.d.get(size2);
                    if ((str != null && str.equals(aVar.k)) || (i2 >= 0 && i2 == aVar.u)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        h0.o.a.a aVar2 = this.d.get(size2);
                        if ((str == null || !str.equals(aVar2.k)) && (i2 < 0 || i2 != aVar2.u)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            }
            if (i4 == this.d.size() - 1) {
                return false;
            }
            for (int size3 = this.d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public final void d(Fragment fragment) {
        HashSet hashSet = this.m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((h0.i.e.a) it.next()).a();
            }
            hashSet.clear();
            i(fragment);
            this.m.remove(fragment);
        }
    }

    public void d0(Fragment fragment) {
        if (R(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z2 = !fragment.isInBackStack();
        if (!fragment.mDetached || z2) {
            this.c.l(fragment);
            if (S(fragment)) {
                this.C = true;
            }
            fragment.mRemoving = true;
            l0(fragment);
        }
    }

    public final void e() {
        this.b = false;
        this.I.clear();
        this.H.clear();
    }

    public final void e0(ArrayList<h0.o.a.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                G(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).r) {
                        if (i3 != i2) {
                            E(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).r) {
                                i3++;
                            }
                        }
                        E(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    E(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final Set<SpecialEffectsController> f() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.c.f()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((a0) it.next()).c.mContainer;
            if (viewGroup != null) {
                hashSet.add(SpecialEffectsController.g(viewGroup, P()));
            }
        }
        return hashSet;
    }

    public void f0(Parcelable parcelable) {
        a0 a0Var;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.c != null) {
                this.c.b.clear();
                Iterator<FragmentState> it = fragmentManagerState.c.iterator();
                while (it.hasNext()) {
                    FragmentState next = it.next();
                    if (next != null) {
                        Fragment fragment = this.L.b.get(next.d);
                        if (fragment != null) {
                            if (R(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragment);
                            }
                            a0Var = new a0(this.o, this.c, fragment, next);
                        } else {
                            a0Var = new a0(this.o, this.c, this.r.d.getClassLoader(), N(), next);
                        }
                        Fragment fragment2 = a0Var.c;
                        fragment2.mFragmentManager = this;
                        if (R(2)) {
                            StringBuilder P0 = i0.d.a.a.a.P0("restoreSaveState: active (");
                            P0.append(fragment2.mWho);
                            P0.append("): ");
                            P0.append(fragment2);
                            Log.v("FragmentManager", P0.toString());
                        }
                        a0Var.m(this.r.d.getClassLoader());
                        this.c.j(a0Var);
                        a0Var.e = this.q;
                    }
                }
                x xVar = this.L;
                Objects.requireNonNull(xVar);
                Iterator it2 = new ArrayList(xVar.b.values()).iterator();
                while (it2.hasNext()) {
                    Fragment fragment3 = (Fragment) it2.next();
                    if (!this.c.c(fragment3.mWho)) {
                        if (R(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + fragment3 + " that was not found in the set of active Fragments " + fragmentManagerState.c);
                        }
                        this.L.b(fragment3);
                        fragment3.mFragmentManager = this;
                        a0 a0Var2 = new a0(this.o, this.c, fragment3);
                        a0Var2.e = 1;
                        a0Var2.k();
                        fragment3.mRemoving = true;
                        a0Var2.k();
                    }
                }
                b0 b0Var = this.c;
                ArrayList<String> arrayList = fragmentManagerState.d;
                b0Var.a.clear();
                if (arrayList != null) {
                    for (String next2 : arrayList) {
                        Fragment d2 = b0Var.d(next2);
                        if (d2 != null) {
                            if (R(2)) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + d2);
                            }
                            b0Var.a(d2);
                        } else {
                            throw new IllegalStateException(i0.d.a.a.a.o0("No instantiated fragment for (", next2, ")"));
                        }
                    }
                }
                Fragment fragment4 = null;
                if (fragmentManagerState.q != null) {
                    this.d = new ArrayList<>(fragmentManagerState.q.length);
                    int i2 = 0;
                    while (true) {
                        BackStackState[] backStackStateArr = fragmentManagerState.q;
                        if (i2 >= backStackStateArr.length) {
                            break;
                        }
                        BackStackState backStackState = backStackStateArr[i2];
                        Objects.requireNonNull(backStackState);
                        h0.o.a.a aVar = new h0.o.a.a(this);
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int[] iArr = backStackState.c;
                            if (i3 >= iArr.length) {
                                break;
                            }
                            c0.a aVar2 = new c0.a();
                            int i5 = i3 + 1;
                            aVar2.a = iArr[i3];
                            if (R(2)) {
                                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i4 + " base fragment #" + backStackState.c[i5]);
                            }
                            String str = backStackState.d.get(i4);
                            if (str != null) {
                                aVar2.b = this.c.d(str);
                            } else {
                                aVar2.b = fragment4;
                            }
                            aVar2.g = Lifecycle.State.values()[backStackState.q[i4]];
                            aVar2.h = Lifecycle.State.values()[backStackState.x[i4]];
                            int[] iArr2 = backStackState.c;
                            int i6 = i5 + 1;
                            int i7 = iArr2[i5];
                            aVar2.c = i7;
                            int i8 = i6 + 1;
                            int i9 = iArr2[i6];
                            aVar2.d = i9;
                            int i10 = i8 + 1;
                            int i11 = iArr2[i8];
                            aVar2.e = i11;
                            int i12 = iArr2[i10];
                            aVar2.f = i12;
                            aVar.d = i7;
                            aVar.e = i9;
                            aVar.f = i11;
                            aVar.g = i12;
                            aVar.e(aVar2);
                            i4++;
                            fragment4 = null;
                            i3 = i10 + 1;
                        }
                        aVar.h = backStackState.y;
                        aVar.k = backStackState.Y1;
                        aVar.u = backStackState.Z1;
                        aVar.i = true;
                        aVar.l = backStackState.a2;
                        aVar.m = backStackState.b2;
                        aVar.n = backStackState.c2;
                        aVar.o = backStackState.d2;
                        aVar.p = backStackState.e2;
                        aVar.q = backStackState.f2;
                        aVar.r = backStackState.g2;
                        aVar.u(1);
                        if (R(2)) {
                            StringBuilder Q0 = i0.d.a.a.a.Q0("restoreAllState: back stack #", i2, " (index ");
                            Q0.append(aVar.u);
                            Q0.append("): ");
                            Q0.append(aVar);
                            Log.v("FragmentManager", Q0.toString());
                            PrintWriter printWriter = new PrintWriter(new p0("FragmentManager"));
                            aVar.w("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.d.add(aVar);
                        i2++;
                        fragment4 = null;
                    }
                } else {
                    this.d = null;
                }
                this.i.set(fragmentManagerState.x);
                String str2 = fragmentManagerState.y;
                if (str2 != null) {
                    Fragment H2 = H(str2);
                    this.u = H2;
                    t(H2);
                }
                ArrayList<String> arrayList2 = fragmentManagerState.Y1;
                if (arrayList2 != null) {
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        Bundle bundle = fragmentManagerState.Z1.get(i13);
                        bundle.setClassLoader(this.r.d.getClassLoader());
                        this.j.put(arrayList2.get(i13), bundle);
                    }
                }
                this.B = new ArrayDeque<>(fragmentManagerState.a2);
            }
        }
    }

    public void g(h0.o.a.a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.y(z4);
        } else {
            aVar.x();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3 && this.q >= 1) {
            j0.r(this.r.d, this.s, arrayList, arrayList2, 0, 1, true, this.n);
        }
        if (z4) {
            W(this.q, true);
        }
        Iterator it = ((ArrayList) this.c.g()).iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.z(fragment.mContainerId)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                if (z4) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: androidx.fragment.app.BackStackState[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable g0() {
        /*
            r11 = this;
            r11.K()
            r11.z()
            r0 = 1
            r11.C(r0)
            r11.D = r0
            h0.o.a.x r1 = r11.L
            r1.g = r0
            h0.o.a.b0 r0 = r11.c
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, h0.o.a.a0> r2 = r0.b
            int r2 = r2.size()
            r1.<init>(r2)
            java.util.HashMap<java.lang.String, h0.o.a.a0> r0 = r0.b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x002a:
            boolean r2 = r0.hasNext()
            r3 = 0
            r4 = 0
            r5 = 2
            if (r2 == 0) goto L_0x010d
            java.lang.Object r2 = r0.next()
            h0.o.a.a0 r2 = (h0.o.a.a0) r2
            if (r2 == 0) goto L_0x002a
            androidx.fragment.app.Fragment r6 = r2.c
            androidx.fragment.app.FragmentState r7 = new androidx.fragment.app.FragmentState
            r7.<init>((androidx.fragment.app.Fragment) r6)
            androidx.fragment.app.Fragment r8 = r2.c
            int r9 = r8.mState
            r10 = -1
            if (r9 <= r10) goto L_0x00de
            android.os.Bundle r9 = r7.f2
            if (r9 != 0) goto L_0x00de
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            androidx.fragment.app.Fragment r9 = r2.c
            r9.performSaveInstanceState(r8)
            h0.o.a.v r9 = r2.a
            androidx.fragment.app.Fragment r10 = r2.c
            r9.j(r10, r8, r3)
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r4 = r8
        L_0x0066:
            androidx.fragment.app.Fragment r3 = r2.c
            android.view.View r3 = r3.mView
            if (r3 == 0) goto L_0x006f
            r2.o()
        L_0x006f:
            androidx.fragment.app.Fragment r3 = r2.c
            android.util.SparseArray<android.os.Parcelable> r3 = r3.mSavedViewState
            if (r3 == 0) goto L_0x0086
            if (r4 != 0) goto L_0x007d
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = r3
        L_0x007d:
            androidx.fragment.app.Fragment r3 = r2.c
            android.util.SparseArray<android.os.Parcelable> r3 = r3.mSavedViewState
            java.lang.String r8 = "android:view_state"
            r4.putSparseParcelableArray(r8, r3)
        L_0x0086:
            androidx.fragment.app.Fragment r3 = r2.c
            android.os.Bundle r3 = r3.mSavedViewRegistryState
            if (r3 == 0) goto L_0x009d
            if (r4 != 0) goto L_0x0094
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = r3
        L_0x0094:
            androidx.fragment.app.Fragment r3 = r2.c
            android.os.Bundle r3 = r3.mSavedViewRegistryState
            java.lang.String r8 = "android:view_registry_state"
            r4.putBundle(r8, r3)
        L_0x009d:
            androidx.fragment.app.Fragment r3 = r2.c
            boolean r3 = r3.mUserVisibleHint
            if (r3 != 0) goto L_0x00b4
            if (r4 != 0) goto L_0x00ab
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = r3
        L_0x00ab:
            androidx.fragment.app.Fragment r3 = r2.c
            boolean r3 = r3.mUserVisibleHint
            java.lang.String r8 = "android:user_visible_hint"
            r4.putBoolean(r8, r3)
        L_0x00b4:
            r7.f2 = r4
            androidx.fragment.app.Fragment r3 = r2.c
            java.lang.String r3 = r3.mTargetWho
            if (r3 == 0) goto L_0x00e2
            if (r4 != 0) goto L_0x00c5
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r7.f2 = r3
        L_0x00c5:
            android.os.Bundle r3 = r7.f2
            androidx.fragment.app.Fragment r4 = r2.c
            java.lang.String r4 = r4.mTargetWho
            java.lang.String r8 = "android:target_state"
            r3.putString(r8, r4)
            androidx.fragment.app.Fragment r2 = r2.c
            int r2 = r2.mTargetRequestCode
            if (r2 == 0) goto L_0x00e2
            android.os.Bundle r3 = r7.f2
            java.lang.String r4 = "android:target_req_state"
            r3.putInt(r4, r2)
            goto L_0x00e2
        L_0x00de:
            android.os.Bundle r2 = r8.mSavedFragmentState
            r7.f2 = r2
        L_0x00e2:
            r1.add(r7)
            boolean r2 = R(r5)
            if (r2 == 0) goto L_0x002a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Saved state of "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r3 = ": "
            r2.append(r3)
            android.os.Bundle r3 = r7.f2
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
            goto L_0x002a
        L_0x010d:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0121
            boolean r0 = R(r5)
            if (r0 == 0) goto L_0x0120
            java.lang.String r0 = "FragmentManager"
            java.lang.String r1 = "saveAllState: no fragments!"
            android.util.Log.v(r0, r1)
        L_0x0120:
            return r4
        L_0x0121:
            h0.o.a.b0 r0 = r11.c
            java.util.ArrayList<androidx.fragment.app.Fragment> r2 = r0.a
            monitor-enter(r2)
            java.util.ArrayList<androidx.fragment.app.Fragment> r6 = r0.a     // Catch:{ all -> 0x01f6 }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x01f6 }
            if (r6 == 0) goto L_0x0131
            monitor-exit(r2)     // Catch:{ all -> 0x01f6 }
            r6 = r4
            goto L_0x017b
        L_0x0131:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x01f6 }
            java.util.ArrayList<androidx.fragment.app.Fragment> r7 = r0.a     // Catch:{ all -> 0x01f6 }
            int r7 = r7.size()     // Catch:{ all -> 0x01f6 }
            r6.<init>(r7)     // Catch:{ all -> 0x01f6 }
            java.util.ArrayList<androidx.fragment.app.Fragment> r0 = r0.a     // Catch:{ all -> 0x01f6 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x01f6 }
        L_0x0142:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x01f6 }
            if (r7 == 0) goto L_0x017a
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x01f6 }
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7     // Catch:{ all -> 0x01f6 }
            java.lang.String r8 = r7.mWho     // Catch:{ all -> 0x01f6 }
            r6.add(r8)     // Catch:{ all -> 0x01f6 }
            boolean r8 = R(r5)     // Catch:{ all -> 0x01f6 }
            if (r8 == 0) goto L_0x0142
            java.lang.String r8 = "FragmentManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01f6 }
            r9.<init>()     // Catch:{ all -> 0x01f6 }
            java.lang.String r10 = "saveAllState: adding fragment ("
            r9.append(r10)     // Catch:{ all -> 0x01f6 }
            java.lang.String r10 = r7.mWho     // Catch:{ all -> 0x01f6 }
            r9.append(r10)     // Catch:{ all -> 0x01f6 }
            java.lang.String r10 = "): "
            r9.append(r10)     // Catch:{ all -> 0x01f6 }
            r9.append(r7)     // Catch:{ all -> 0x01f6 }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x01f6 }
            android.util.Log.v(r8, r7)     // Catch:{ all -> 0x01f6 }
            goto L_0x0142
        L_0x017a:
            monitor-exit(r2)     // Catch:{ all -> 0x01f6 }
        L_0x017b:
            java.util.ArrayList<h0.o.a.a> r0 = r11.d
            if (r0 == 0) goto L_0x01bb
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01bb
            androidx.fragment.app.BackStackState[] r4 = new androidx.fragment.app.BackStackState[r0]
        L_0x0187:
            if (r3 >= r0) goto L_0x01bb
            androidx.fragment.app.BackStackState r2 = new androidx.fragment.app.BackStackState
            java.util.ArrayList<h0.o.a.a> r7 = r11.d
            java.lang.Object r7 = r7.get(r3)
            h0.o.a.a r7 = (h0.o.a.a) r7
            r2.<init>((h0.o.a.a) r7)
            r4[r3] = r2
            boolean r2 = R(r5)
            if (r2 == 0) goto L_0x01b8
            java.lang.String r2 = "FragmentManager"
            java.lang.String r7 = "saveAllState: adding back stack #"
            java.lang.String r8 = ": "
            java.lang.StringBuilder r7 = i0.d.a.a.a.Q0(r7, r3, r8)
            java.util.ArrayList<h0.o.a.a> r8 = r11.d
            java.lang.Object r8 = r8.get(r3)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r2, r7)
        L_0x01b8:
            int r3 = r3 + 1
            goto L_0x0187
        L_0x01bb:
            androidx.fragment.app.FragmentManagerState r0 = new androidx.fragment.app.FragmentManagerState
            r0.<init>()
            r0.c = r1
            r0.d = r6
            r0.q = r4
            java.util.concurrent.atomic.AtomicInteger r1 = r11.i
            int r1 = r1.get()
            r0.x = r1
            androidx.fragment.app.Fragment r1 = r11.u
            if (r1 == 0) goto L_0x01d6
            java.lang.String r1 = r1.mWho
            r0.y = r1
        L_0x01d6:
            java.util.ArrayList<java.lang.String> r1 = r0.Y1
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r11.j
            java.util.Set r2 = r2.keySet()
            r1.addAll(r2)
            java.util.ArrayList<android.os.Bundle> r1 = r0.Z1
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r11.j
            java.util.Collection r2 = r2.values()
            r1.addAll(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.FragmentManager$LaunchedFragmentInfo> r2 = r11.B
            r1.<init>(r2)
            r0.a2 = r1
            return r0
        L_0x01f6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01f6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.g0():android.os.Parcelable");
    }

    public a0 h(Fragment fragment) {
        a0 h2 = this.c.h(fragment.mWho);
        if (h2 != null) {
            return h2;
        }
        a0 a0Var = new a0(this.o, this.c, fragment);
        a0Var.m(this.r.d.getClassLoader());
        a0Var.e = this.q;
        return a0Var;
    }

    public void h0() {
        synchronized (this.a) {
            ArrayList<o> arrayList = this.K;
            boolean z2 = false;
            boolean z3 = arrayList != null && !arrayList.isEmpty();
            if (this.a.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.r.q.removeCallbacks(this.M);
                this.r.q.post(this.M);
                o0();
            }
        }
    }

    public final void i(Fragment fragment) {
        fragment.performDestroyView();
        this.o.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    public void i0(Fragment fragment, boolean z2) {
        ViewGroup M2 = M(fragment);
        if (M2 != null && (M2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) M2).setDrawDisappearingViewsLast(!z2);
        }
    }

    public void j(Fragment fragment) {
        if (R(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (R(2)) {
                    Log.v("FragmentManager", "remove from detach: " + fragment);
                }
                this.c.l(fragment);
                if (S(fragment)) {
                    this.C = true;
                }
                l0(fragment);
            }
        }
    }

    public void j0(Fragment fragment, Lifecycle.State state) {
        if (!fragment.equals(H(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
        }
        fragment.mMaxState = state;
    }

    public void k(Configuration configuration) {
        for (Fragment next : this.c.i()) {
            if (next != null) {
                next.performConfigurationChanged(configuration);
            }
        }
    }

    public void k0(Fragment fragment) {
        if (fragment == null || (fragment.equals(H(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.u;
            this.u = fragment;
            t(fragment2);
            t(this.u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public boolean l(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment next : this.c.i()) {
            if (next != null && next.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void l0(Fragment fragment) {
        ViewGroup M2 = M(fragment);
        if (M2 != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                int i2 = R.id.visible_removing_fragment_view_tag;
                if (M2.getTag(i2) == null) {
                    M2.setTag(i2, fragment);
                }
                ((Fragment) M2.getTag(i2)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public void m() {
        this.D = false;
        this.E = false;
        this.L.g = false;
        w(1);
    }

    public void m0(Fragment fragment) {
        if (R(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public boolean n(Menu menu, MenuInflater menuInflater) {
        if (this.q < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (Fragment next : this.c.i()) {
            if (next != null && T(next) && next.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(next);
                z2 = true;
            }
        }
        if (this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                Fragment fragment = this.e.get(i2);
                if (arrayList == null || !arrayList.contains(fragment)) {
                    fragment.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public final void n0() {
        Iterator it = ((ArrayList) this.c.f()).iterator();
        while (it.hasNext()) {
            Z((a0) it.next());
        }
    }

    public void o() {
        this.F = true;
        C(true);
        z();
        w(-1);
        this.r = null;
        this.s = null;
        this.t = null;
        if (this.g != null) {
            this.h.b();
            this.g = null;
        }
        h0.a.f.b<Intent> bVar = this.y;
        if (bVar != null) {
            bVar.b();
            this.z.b();
            this.A.b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (L() <= 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (U(r3.t) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r0.a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r3.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o0() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$m> r0 = r3.a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$m> r1 = r3.a     // Catch:{ all -> 0x0028 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0028 }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            h0.a.b r1 = r3.h     // Catch:{ all -> 0x0028 }
            r1.a = r2     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            h0.a.b r0 = r3.h
            int r1 = r3.L()
            if (r1 <= 0) goto L_0x0024
            androidx.fragment.app.Fragment r1 = r3.t
            boolean r1 = r3.U(r1)
            if (r1 == 0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            r0.a = r2
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.o0():void");
    }

    public void p() {
        for (Fragment next : this.c.i()) {
            if (next != null) {
                next.performLowMemory();
            }
        }
    }

    public void q(boolean z2) {
        for (Fragment next : this.c.i()) {
            if (next != null) {
                next.performMultiWindowModeChanged(z2);
            }
        }
    }

    public boolean r(MenuItem menuItem) {
        if (this.q < 1) {
            return false;
        }
        for (Fragment next : this.c.i()) {
            if (next != null && next.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void s(Menu menu) {
        if (this.q >= 1) {
            for (Fragment next : this.c.i()) {
                if (next != null) {
                    next.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void t(Fragment fragment) {
        if (fragment != null && fragment.equals(H(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.t;
        if (fragment != null) {
            i0.d.a.a.a.k(fragment, sb, "{");
            sb.append(Integer.toHexString(System.identityHashCode(this.t)));
            sb.append("}");
        } else {
            t<?> tVar = this.r;
            if (tVar != null) {
                sb.append(tVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.r)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public void u(boolean z2) {
        for (Fragment next : this.c.i()) {
            if (next != null) {
                next.performPictureInPictureModeChanged(z2);
            }
        }
    }

    public boolean v(Menu menu) {
        boolean z2 = false;
        if (this.q < 1) {
            return false;
        }
        for (Fragment next : this.c.i()) {
            if (next != null && T(next) && next.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: finally extract failed */
    public final void w(int i2) {
        try {
            this.b = true;
            for (a0 next : this.c.b.values()) {
                if (next != null) {
                    next.e = i2;
                }
            }
            W(i2, false);
            Iterator it = ((HashSet) f()).iterator();
            while (it.hasNext()) {
                ((SpecialEffectsController) it.next()).e();
            }
            this.b = false;
            C(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void x() {
        if (this.G) {
            this.G = false;
            n0();
        }
    }

    public void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String n02 = i0.d.a.a.a.n0(str, "    ");
        b0 b0Var = this.c;
        Objects.requireNonNull(b0Var);
        String str2 = str + "    ";
        if (!b0Var.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (a0 next : b0Var.b.values()) {
                printWriter.print(str);
                if (next != null) {
                    Fragment fragment = next.c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = b0Var.a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(b0Var.a.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.e.get(i3).toString());
            }
        }
        ArrayList<h0.o.a.a> arrayList2 = this.d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                h0.o.a.a aVar = this.d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.w(n02, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.i.get());
        synchronized (this.a) {
            int size4 = this.a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size4; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.a.get(i5));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.s);
        if (this.t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.D);
        printWriter.print(" mStopped=");
        printWriter.print(this.E);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.F);
        if (this.C) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.C);
        }
    }

    public final void z() {
        Iterator it = ((HashSet) f()).iterator();
        while (it.hasNext()) {
            ((SpecialEffectsController) it.next()).e();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();
        public String c;
        public int d;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new LaunchedFragmentInfo[i];
            }
        }

        public LaunchedFragmentInfo(String str, int i) {
            this.c = str;
            this.d = i;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.c);
            parcel.writeInt(this.d);
        }

        public LaunchedFragmentInfo(Parcel parcel) {
            this.c = parcel.readString();
            this.d = parcel.readInt();
        }
    }
}
