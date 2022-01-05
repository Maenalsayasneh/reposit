package h0.o.a;

import android.view.View;
import androidx.core.app.SharedElementCallback;
import androidx.fragment.app.Fragment;
import h0.f.g;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentTransition */
public class j0 {
    public static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final l0 b = new k0();
    public static final l0 c;

    /* compiled from: FragmentTransition */
    public interface a {
    }

    /* compiled from: FragmentTransition */
    public static class b {
        public Fragment a;
        public boolean b;
        public a c;
        public Fragment d;
        public boolean e;
        public a f;
    }

    static {
        l0 l0Var;
        try {
            l0Var = (l0) Class.forName("h0.b0.d").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            l0Var = null;
        }
        c = l0Var;
    }

    public static void a(ArrayList<View> arrayList, h0.f.a<String, View> aVar, Collection<String> collection) {
        for (int i = aVar.Z1 - 1; i >= 0; i--) {
            View l = aVar.l(i);
            AtomicInteger atomicInteger = q.a;
            if (collection.contains(l.getTransitionName())) {
                arrayList.add(l);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0039, code lost:
        if (r0.mAdded != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0077, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        if (r0.mHidden == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(h0.o.a.a r8, h0.o.a.c0.a r9, android.util.SparseArray<h0.o.a.j0.b> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.mContainerId
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = a
            int r9 = r9.a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = r2
            r3 = r9
            r4 = r3
            goto L_0x0090
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x008c
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x008c
            goto L_0x008a
        L_0x003c:
            boolean r9 = r0.mHidden
            goto L_0x008d
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x0079
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0079
            boolean r9 = r0.mHidden
            if (r9 == 0) goto L_0x0079
            goto L_0x0077
        L_0x004e:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0079
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0079
            goto L_0x0077
        L_0x0057:
            if (r12 == 0) goto L_0x006f
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x0079
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L_0x0079
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0079
            float r9 = r0.mPostponedAlpha
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0079
            goto L_0x0077
        L_0x006f:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0079
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0079
        L_0x0077:
            r9 = r3
            goto L_0x007a
        L_0x0079:
            r9 = r2
        L_0x007a:
            r4 = r3
            r3 = r2
            goto L_0x0090
        L_0x007d:
            if (r12 == 0) goto L_0x0082
            boolean r9 = r0.mIsNewlyAdded
            goto L_0x008d
        L_0x0082:
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x008c
        L_0x008a:
            r9 = r3
            goto L_0x008d
        L_0x008c:
            r9 = r2
        L_0x008d:
            r4 = r2
            r2 = r9
            r9 = r4
        L_0x0090:
            java.lang.Object r5 = r10.get(r1)
            h0.o.a.j0$b r5 = (h0.o.a.j0.b) r5
            if (r2 == 0) goto L_0x00a9
            if (r5 != 0) goto L_0x00a3
            h0.o.a.j0$b r2 = new h0.o.a.j0$b
            r2.<init>()
            r10.put(r1, r2)
            r5 = r2
        L_0x00a3:
            r5.a = r0
            r5.b = r11
            r5.c = r8
        L_0x00a9:
            r2 = 0
            if (r12 != 0) goto L_0x00ca
            if (r3 == 0) goto L_0x00ca
            if (r5 == 0) goto L_0x00b6
            androidx.fragment.app.Fragment r3 = r5.d
            if (r3 != r0) goto L_0x00b6
            r5.d = r2
        L_0x00b6:
            boolean r3 = r8.r
            if (r3 != 0) goto L_0x00ca
            androidx.fragment.app.FragmentManager r3 = r8.s
            h0.o.a.a0 r6 = r3.h(r0)
            h0.o.a.b0 r7 = r3.c
            r7.j(r6)
            int r6 = r3.q
            r3.X(r0, r6)
        L_0x00ca:
            if (r9 == 0) goto L_0x00e3
            if (r5 == 0) goto L_0x00d2
            androidx.fragment.app.Fragment r9 = r5.d
            if (r9 != 0) goto L_0x00e3
        L_0x00d2:
            if (r5 != 0) goto L_0x00dd
            h0.o.a.j0$b r9 = new h0.o.a.j0$b
            r9.<init>()
            r10.put(r1, r9)
            r5 = r9
        L_0x00dd:
            r5.d = r0
            r5.e = r11
            r5.f = r8
        L_0x00e3:
            if (r12 != 0) goto L_0x00ef
            if (r4 == 0) goto L_0x00ef
            if (r5 == 0) goto L_0x00ef
            androidx.fragment.app.Fragment r8 = r5.a
            if (r8 != r0) goto L_0x00ef
            r5.a = r2
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.o.a.j0.b(h0.o.a.a, h0.o.a.c0$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(Fragment fragment, Fragment fragment2, boolean z, h0.f.a<String, View> aVar, boolean z2) {
        SharedElementCallback sharedElementCallback;
        int i;
        if (z) {
            sharedElementCallback = fragment2.getEnterTransitionCallback();
        } else {
            sharedElementCallback = fragment.getEnterTransitionCallback();
        }
        if (sharedElementCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.Z1;
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.i(i2));
                arrayList.add(aVar.l(i2));
            }
            if (z2) {
                sharedElementCallback.onSharedElementStart(arrayList2, arrayList, (List<View>) null);
            } else {
                sharedElementCallback.onSharedElementEnd(arrayList2, arrayList, (List<View>) null);
            }
        }
    }

    public static boolean d(l0 l0Var, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!l0Var.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static h0.f.a<String, View> e(l0 l0Var, h0.f.a<String, String> aVar, Object obj, b bVar) {
        SharedElementCallback sharedElementCallback;
        ArrayList<String> arrayList;
        String i;
        Fragment fragment = bVar.a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        h0.f.a<String, View> aVar2 = new h0.f.a<>();
        l0Var.i(aVar2, view);
        a aVar3 = bVar.c;
        if (bVar.b) {
            sharedElementCallback = fragment.getExitTransitionCallback();
            arrayList = aVar3.p;
        } else {
            sharedElementCallback = fragment.getEnterTransitionCallback();
            arrayList = aVar3.q;
        }
        if (arrayList != null) {
            g.k(aVar2, arrayList);
            g.k(aVar2, aVar.values());
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.onMapSharedElements(arrayList, aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = aVar2.get(str);
                if (view2 == null) {
                    String i2 = i(aVar, str);
                    if (i2 != null) {
                        aVar.remove(i2);
                    }
                } else {
                    AtomicInteger atomicInteger = q.a;
                    if (!str.equals(view2.getTransitionName()) && (i = i(aVar, str)) != null) {
                        aVar.put(i, view2.getTransitionName());
                    }
                }
            }
        } else {
            o(aVar, aVar2);
        }
        return aVar2;
    }

    public static h0.f.a<String, View> f(l0 l0Var, h0.f.a<String, String> aVar, Object obj, b bVar) {
        SharedElementCallback sharedElementCallback;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = bVar.d;
        h0.f.a<String, View> aVar2 = new h0.f.a<>();
        l0Var.i(aVar2, fragment.requireView());
        a aVar3 = bVar.f;
        if (bVar.e) {
            sharedElementCallback = fragment.getEnterTransitionCallback();
            arrayList = aVar3.q;
        } else {
            sharedElementCallback = fragment.getExitTransitionCallback();
            arrayList = aVar3.p;
        }
        if (arrayList != null) {
            g.k(aVar2, arrayList);
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.onMapSharedElements(arrayList, aVar2);
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else {
                    AtomicInteger atomicInteger = q.a;
                    if (!str.equals(view.getTransitionName())) {
                        aVar.put(view.getTransitionName(), aVar.remove(str));
                    }
                }
            }
        } else {
            g.k(aVar, aVar2.keySet());
        }
        return aVar2;
    }

    public static l0 g(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        l0 l0Var = b;
        if (d(l0Var, arrayList)) {
            return l0Var;
        }
        l0 l0Var2 = c;
        if (l0Var2 != null && d(l0Var2, arrayList)) {
            return l0Var2;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList<View> h(l0 l0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            l0Var.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        l0Var.b(obj, arrayList2);
        return arrayList2;
    }

    public static String i(h0.f.a<String, String> aVar, String str) {
        int i = aVar.Z1;
        for (int i2 = 0; i2 < i; i2++) {
            if (str.equals(aVar.l(i2))) {
                return aVar.i(i2);
            }
        }
        return null;
    }

    public static Object j(l0 l0Var, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return l0Var.g(obj);
    }

    public static Object k(l0 l0Var, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return l0Var.g(obj);
    }

    public static View l(h0.f.a<String, View> aVar, b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        a aVar2 = bVar.c;
        if (obj == null || aVar == null || (arrayList = aVar2.p) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar2.p.get(0);
        } else {
            str = aVar2.q.get(0);
        }
        return aVar.get(str);
    }

    public static Object m(l0 l0Var, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return l0Var.y(l0Var.g(obj));
    }

    public static Object n(l0 l0Var, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return l0Var.m(obj2, obj, obj3);
        }
        return l0Var.l(obj2, obj, obj3);
    }

    public static void o(h0.f.a<String, String> aVar, h0.f.a<String, View> aVar2) {
        int i = aVar.Z1;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (!aVar2.containsKey(aVar.l(i))) {
                aVar.j(i);
            }
        }
    }

    public static void p(l0 l0Var, Object obj, Object obj2, h0.f.a<String, View> aVar, boolean z, a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.p;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = aVar2.q.get(0);
            } else {
                str = aVar2.p.get(0);
            }
            View view = aVar.get(str);
            l0Var.t(obj, view);
            if (obj2 != null) {
                l0Var.t(obj2, view);
            }
        }
    }

    public static void q(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x03e4  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0428 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void r(android.content.Context r39, h0.o.a.q r40, java.util.ArrayList<h0.o.a.a> r41, java.util.ArrayList<java.lang.Boolean> r42, int r43, int r44, boolean r45, h0.o.a.j0.a r46) {
        /*
            r0 = r41
            r1 = r42
            r2 = r44
            r3 = r45
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r5 = r43
        L_0x000f:
            r6 = 0
            r7 = 1
            if (r5 >= r2) goto L_0x0061
            java.lang.Object r8 = r0.get(r5)
            h0.o.a.a r8 = (h0.o.a.a) r8
            java.lang.Object r9 = r1.get(r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0047
            androidx.fragment.app.FragmentManager r6 = r8.s
            h0.o.a.q r6 = r6.s
            boolean r6 = r6.c()
            if (r6 != 0) goto L_0x0030
            goto L_0x005e
        L_0x0030:
            java.util.ArrayList<h0.o.a.c0$a> r6 = r8.c
            int r6 = r6.size()
            int r6 = r6 - r7
        L_0x0037:
            if (r6 < 0) goto L_0x005e
            java.util.ArrayList<h0.o.a.c0$a> r9 = r8.c
            java.lang.Object r9 = r9.get(r6)
            h0.o.a.c0$a r9 = (h0.o.a.c0.a) r9
            b(r8, r9, r4, r7, r3)
            int r6 = r6 + -1
            goto L_0x0037
        L_0x0047:
            java.util.ArrayList<h0.o.a.c0$a> r7 = r8.c
            int r7 = r7.size()
            r9 = r6
        L_0x004e:
            if (r9 >= r7) goto L_0x005e
            java.util.ArrayList<h0.o.a.c0$a> r10 = r8.c
            java.lang.Object r10 = r10.get(r9)
            h0.o.a.c0$a r10 = (h0.o.a.c0.a) r10
            b(r8, r10, r4, r6, r3)
            int r9 = r9 + 1
            goto L_0x004e
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0061:
            int r5 = r4.size()
            if (r5 == 0) goto L_0x043a
            android.view.View r5 = new android.view.View
            r8 = r39
            r5.<init>(r8)
            int r15 = r4.size()
            r14 = r6
        L_0x0073:
            if (r14 >= r15) goto L_0x043a
            int r8 = r4.keyAt(r14)
            h0.f.a r13 = new h0.f.a
            r13.<init>()
            int r9 = r2 + -1
            r12 = r43
        L_0x0082:
            if (r9 < r12) goto L_0x00ea
            java.lang.Object r10 = r0.get(r9)
            h0.o.a.a r10 = (h0.o.a.a) r10
            boolean r11 = r10.z(r8)
            if (r11 != 0) goto L_0x0091
            goto L_0x00df
        L_0x0091:
            java.lang.Object r11 = r1.get(r9)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.util.ArrayList<java.lang.String> r7 = r10.p
            if (r7 == 0) goto L_0x00df
            int r7 = r7.size()
            if (r11 == 0) goto L_0x00aa
            java.util.ArrayList<java.lang.String> r11 = r10.p
            java.util.ArrayList<java.lang.String> r10 = r10.q
            goto L_0x00b3
        L_0x00aa:
            java.util.ArrayList<java.lang.String> r11 = r10.p
            java.util.ArrayList<java.lang.String> r10 = r10.q
            r38 = r11
            r11 = r10
            r10 = r38
        L_0x00b3:
            if (r6 >= r7) goto L_0x00df
            java.lang.Object r16 = r10.get(r6)
            r0 = r16
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r16 = r11.get(r6)
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r16 = r13.remove(r1)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00d3
            r13.put(r0, r2)
            goto L_0x00d6
        L_0x00d3:
            r13.put(r0, r1)
        L_0x00d6:
            int r6 = r6 + 1
            r0 = r41
            r1 = r42
            r2 = r44
            goto L_0x00b3
        L_0x00df:
            int r9 = r9 + -1
            r0 = r41
            r1 = r42
            r2 = r44
            r6 = 0
            r7 = 1
            goto L_0x0082
        L_0x00ea:
            java.lang.Object r0 = r4.valueAt(r14)
            h0.o.a.j0$b r0 = (h0.o.a.j0.b) r0
            boolean r1 = r40.c()
            if (r1 == 0) goto L_0x0422
            r1 = r40
            android.view.View r2 = r1.b(r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x0102
            goto L_0x0422
        L_0x0102:
            if (r3 == 0) goto L_0x0292
            androidx.fragment.app.Fragment r7 = r0.a
            androidx.fragment.app.Fragment r8 = r0.d
            h0.o.a.l0 r9 = g(r8, r7)
            if (r9 != 0) goto L_0x0117
            r30 = r4
            r31 = r14
            r32 = r15
        L_0x0114:
            r3 = 0
            goto L_0x02a5
        L_0x0117:
            boolean r10 = r0.b
            boolean r11 = r0.e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r3 = j(r9, r7, r10)
            java.lang.Object r11 = k(r9, r8, r11)
            r30 = r4
            androidx.fragment.app.Fragment r4 = r0.a
            androidx.fragment.app.Fragment r12 = r0.d
            if (r4 == 0) goto L_0x0142
            r31 = r14
            android.view.View r14 = r4.requireView()
            r32 = r15
            r15 = 0
            r14.setVisibility(r15)
            goto L_0x0146
        L_0x0142:
            r31 = r14
            r32 = r15
        L_0x0146:
            if (r4 == 0) goto L_0x01e7
            if (r12 != 0) goto L_0x014c
            goto L_0x01e7
        L_0x014c:
            boolean r14 = r0.b
            boolean r15 = r13.isEmpty()
            if (r15 == 0) goto L_0x0158
            r33 = r10
            r15 = 0
            goto L_0x015e
        L_0x0158:
            java.lang.Object r15 = m(r9, r4, r12, r14)
            r33 = r10
        L_0x015e:
            h0.f.a r10 = f(r9, r13, r15, r0)
            r34 = r7
            h0.f.a r7 = e(r9, r13, r15, r0)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x017a
            if (r10 == 0) goto L_0x0173
            r10.clear()
        L_0x0173:
            if (r7 == 0) goto L_0x0178
            r7.clear()
        L_0x0178:
            r15 = 0
            goto L_0x018c
        L_0x017a:
            r16 = r15
            java.util.Set r15 = r13.keySet()
            a(r1, r10, r15)
            java.util.Collection r15 = r13.values()
            a(r6, r7, r15)
            r15 = r16
        L_0x018c:
            if (r3 != 0) goto L_0x0195
            if (r11 != 0) goto L_0x0195
            if (r15 != 0) goto L_0x0195
            r36 = r6
            goto L_0x01ed
        L_0x0195:
            r35 = r13
            r13 = 1
            c(r4, r12, r14, r10, r13)
            if (r15 == 0) goto L_0x01cb
            r6.add(r5)
            r9.w(r15, r5, r1)
            boolean r13 = r0.e
            r36 = r6
            h0.o.a.a r6 = r0.f
            r16 = r9
            r17 = r15
            r18 = r11
            r19 = r10
            r20 = r13
            r21 = r6
            p(r16, r17, r18, r19, r20, r21)
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.view.View r0 = l(r7, r0, r3, r14)
            if (r0 == 0) goto L_0x01c6
            r9.s(r3, r6)
        L_0x01c6:
            r27 = r0
            r29 = r6
            goto L_0x01d1
        L_0x01cb:
            r36 = r6
            r27 = 0
            r29 = 0
        L_0x01d1:
            h0.o.a.h0 r0 = new h0.o.a.h0
            r22 = r0
            r23 = r4
            r24 = r12
            r25 = r14
            r26 = r7
            r28 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            h0.i.i.p.a(r2, r0)
            r6 = r15
            goto L_0x01f0
        L_0x01e7:
            r36 = r6
            r34 = r7
            r33 = r10
        L_0x01ed:
            r35 = r13
            r6 = 0
        L_0x01f0:
            if (r3 != 0) goto L_0x01f8
            if (r6 != 0) goto L_0x01f8
            if (r11 != 0) goto L_0x01f8
            goto L_0x0114
        L_0x01f8:
            java.util.ArrayList r0 = h(r9, r11, r8, r1, r5)
            r4 = r34
            r7 = r36
            java.util.ArrayList r10 = h(r9, r3, r4, r7, r5)
            r12 = 4
            q(r10, r12)
            r16 = r9
            r17 = r3
            r18 = r11
            r19 = r6
            r20 = r4
            r21 = r33
            java.lang.Object r4 = n(r16, r17, r18, r19, r20, r21)
            if (r8 == 0) goto L_0x023c
            if (r0 == 0) goto L_0x023c
            int r12 = r0.size()
            if (r12 > 0) goto L_0x0228
            int r12 = r1.size()
            if (r12 <= 0) goto L_0x023c
        L_0x0228:
            h0.i.e.a r12 = new h0.i.e.a
            r12.<init>()
            r13 = r46
            androidx.fragment.app.FragmentManager$d r13 = (androidx.fragment.app.FragmentManager.d) r13
            r13.b(r8, r12)
            h0.o.a.d0 r14 = new h0.o.a.d0
            r14.<init>(r13, r8, r12)
            r9.u(r8, r4, r12, r14)
        L_0x023c:
            if (r4 == 0) goto L_0x0114
            if (r8 == 0) goto L_0x0263
            if (r11 == 0) goto L_0x0263
            boolean r12 = r8.mAdded
            if (r12 == 0) goto L_0x0263
            boolean r12 = r8.mHidden
            if (r12 == 0) goto L_0x0263
            boolean r12 = r8.mHiddenChanged
            if (r12 == 0) goto L_0x0263
            r12 = 1
            r8.setHideReplaced(r12)
            android.view.View r12 = r8.getView()
            r9.q(r11, r12, r0)
            android.view.ViewGroup r8 = r8.mContainer
            h0.o.a.e0 r12 = new h0.o.a.e0
            r12.<init>(r0)
            h0.i.i.p.a(r8, r12)
        L_0x0263:
            java.util.ArrayList r20 = r9.n(r7)
            r22 = r9
            r23 = r4
            r24 = r3
            r25 = r10
            r26 = r11
            r27 = r0
            r28 = r6
            r29 = r7
            r22.r(r23, r24, r25, r26, r27, r28, r29)
            r9.c(r2, r4)
            r16 = r9
            r17 = r2
            r18 = r1
            r19 = r7
            r21 = r35
            r16.v(r17, r18, r19, r20, r21)
            r3 = 0
            q(r10, r3)
            r9.x(r6, r1, r7)
            goto L_0x02a5
        L_0x0292:
            r30 = r4
            r35 = r13
            r31 = r14
            r32 = r15
            r3 = 0
            androidx.fragment.app.Fragment r1 = r0.a
            androidx.fragment.app.Fragment r4 = r0.d
            h0.o.a.l0 r15 = g(r4, r1)
            if (r15 != 0) goto L_0x02ab
        L_0x02a5:
            r25 = r31
            r27 = r32
            goto L_0x0428
        L_0x02ab:
            boolean r6 = r0.b
            boolean r7 = r0.e
            java.lang.Object r14 = j(r15, r1, r6)
            java.lang.Object r13 = k(r15, r4, r7)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            androidx.fragment.app.Fragment r10 = r0.a
            androidx.fragment.app.Fragment r9 = r0.d
            if (r10 == 0) goto L_0x037c
            if (r9 != 0) goto L_0x02cb
            goto L_0x037c
        L_0x02cb:
            boolean r8 = r0.b
            boolean r6 = r35.isEmpty()
            if (r6 == 0) goto L_0x02d7
            r7 = r35
            r6 = 0
            goto L_0x02dd
        L_0x02d7:
            java.lang.Object r6 = m(r15, r10, r9, r8)
            r7 = r35
        L_0x02dd:
            h0.f.a r3 = f(r15, r7, r6, r0)
            boolean r16 = r7.isEmpty()
            if (r16 == 0) goto L_0x02e9
            r6 = 0
            goto L_0x02f4
        L_0x02e9:
            r16 = r6
            java.util.Collection r6 = r3.values()
            r12.addAll(r6)
            r6 = r16
        L_0x02f4:
            if (r14 != 0) goto L_0x030f
            if (r13 != 0) goto L_0x030f
            if (r6 != 0) goto L_0x030f
            r24 = r0
            r21 = r1
            r28 = r4
            r37 = r7
            r23 = r11
            r7 = r12
            r0 = r13
            r26 = r14
            r4 = r15
            r25 = r31
            r27 = r32
            goto L_0x038f
        L_0x030f:
            r21 = r1
            r1 = 1
            c(r10, r9, r8, r3, r1)
            if (r6 == 0) goto L_0x0341
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r15.w(r6, r5, r12)
            r16 = r10
            boolean r10 = r0.e
            r17 = r11
            h0.o.a.a r11 = r0.f
            r22 = r6
            r6 = r15
            r18 = r7
            r7 = r22
            r19 = r8
            r8 = r13
            r20 = r9
            r9 = r3
            r3 = r16
            r23 = r17
            p(r6, r7, r8, r9, r10, r11)
            if (r14 == 0) goto L_0x034d
            r15.s(r14, r1)
            goto L_0x034d
        L_0x0341:
            r22 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r3 = r10
            r23 = r11
            r1 = 0
        L_0x034d:
            h0.o.a.i0 r6 = new h0.o.a.i0
            r8 = r6
            r9 = r15
            r10 = r18
            r11 = r22
            r7 = r12
            r12 = r0
            r24 = r0
            r0 = r13
            r37 = r18
            r13 = r23
            r26 = r14
            r25 = r31
            r14 = r5
            r28 = r4
            r4 = r15
            r27 = r32
            r15 = r3
            r16 = r20
            r17 = r19
            r18 = r7
            r19 = r26
            r20 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            h0.i.i.p.a(r2, r6)
            r1 = r26
            goto L_0x0393
        L_0x037c:
            r24 = r0
            r21 = r1
            r28 = r4
            r23 = r11
            r7 = r12
            r0 = r13
            r26 = r14
            r4 = r15
            r25 = r31
            r27 = r32
            r37 = r35
        L_0x038f:
            r1 = r26
            r22 = 0
        L_0x0393:
            if (r1 != 0) goto L_0x039b
            if (r22 != 0) goto L_0x039b
            if (r0 != 0) goto L_0x039b
            goto L_0x0428
        L_0x039b:
            r3 = r28
            java.util.ArrayList r17 = h(r4, r0, r3, r7, r5)
            if (r17 == 0) goto L_0x03a9
            boolean r6 = r17.isEmpty()
            if (r6 == 0) goto L_0x03aa
        L_0x03a9:
            r0 = 0
        L_0x03aa:
            r4.a(r1, r5)
            r6 = r24
            boolean r6 = r6.b
            r11 = r4
            r12 = r1
            r13 = r0
            r14 = r22
            r15 = r21
            r16 = r6
            java.lang.Object r15 = n(r11, r12, r13, r14, r15, r16)
            if (r3 == 0) goto L_0x03e2
            if (r17 == 0) goto L_0x03e2
            int r6 = r17.size()
            if (r6 > 0) goto L_0x03ce
            int r6 = r7.size()
            if (r6 <= 0) goto L_0x03e2
        L_0x03ce:
            h0.i.e.a r6 = new h0.i.e.a
            r6.<init>()
            r7 = r46
            androidx.fragment.app.FragmentManager$d r7 = (androidx.fragment.app.FragmentManager.d) r7
            r7.b(r3, r6)
            h0.o.a.f0 r8 = new h0.o.a.f0
            r8.<init>(r7, r3, r6)
            r4.u(r3, r15, r6, r8)
        L_0x03e2:
            if (r15 == 0) goto L_0x0428
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r6 = r4
            r7 = r15
            r8 = r1
            r9 = r14
            r10 = r0
            r11 = r17
            r12 = r22
            r13 = r23
            r6.r(r7, r8, r9, r10, r11, r12, r13)
            h0.o.a.g0 r3 = new h0.o.a.g0
            r8 = r3
            r9 = r1
            r10 = r4
            r11 = r5
            r12 = r21
            r1 = r15
            r15 = r17
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            h0.i.i.p.a(r2, r3)
            h0.o.a.m0 r0 = new h0.o.a.m0
            r6 = r23
            r3 = r37
            r0.<init>(r4, r6, r3)
            h0.i.i.p.a(r2, r0)
            r4.c(r2, r1)
            h0.o.a.n0 r0 = new h0.o.a.n0
            r0.<init>(r4, r6, r3)
            h0.i.i.p.a(r2, r0)
            goto L_0x0428
        L_0x0422:
            r30 = r4
            r25 = r14
            r27 = r15
        L_0x0428:
            int r14 = r25 + 1
            r0 = r41
            r1 = r42
            r2 = r44
            r3 = r45
            r15 = r27
            r4 = r30
            r6 = 0
            r7 = 1
            goto L_0x0073
        L_0x043a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.o.a.j0.r(android.content.Context, h0.o.a.q, java.util.ArrayList, java.util.ArrayList, int, int, boolean, h0.o.a.j0$a):void");
    }
}
