package h0.o.a;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import h0.o.a.c0;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: BackStackRecord */
public final class a extends c0 implements FragmentManager.m {
    public final FragmentManager s;
    public boolean t;
    public int u;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(androidx.fragment.app.FragmentManager r3) {
        /*
            r2 = this;
            h0.o.a.s r0 = r3.N()
            h0.o.a.t<?> r1 = r3.r
            if (r1 == 0) goto L_0x000f
            android.content.Context r1 = r1.d
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r2.<init>(r0, r1)
            r0 = -1
            r2.u = r0
            r2.s = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.o.a.a.<init>(androidx.fragment.app.FragmentManager):void");
    }

    public boolean A(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.c.get(i4).b;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.c.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.c.get(i7).b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.R(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        FragmentManager fragmentManager = this.s;
        if (fragmentManager.d == null) {
            fragmentManager.d = new ArrayList<>();
        }
        fragmentManager.d.add(this);
        return true;
    }

    public int h() {
        return v(false);
    }

    public int i() {
        return v(true);
    }

    public void j() {
        if (!this.i) {
            this.j = false;
            this.s.D(this, true);
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public c0 l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.s) {
            super.l(fragment);
            return this;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
        P0.append(fragment.toString());
        P0.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(P0.toString());
    }

    public void m(int i, Fragment fragment, String str, int i2) {
        super.m(i, fragment, str, i2);
        fragment.mFragmentManager = this.s;
    }

    public c0 n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.s) {
            super.n(fragment);
            return this;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        P0.append(fragment.toString());
        P0.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(P0.toString());
    }

    public c0 s(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager != this.s) {
            StringBuilder P0 = i0.d.a.a.a.P0("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            P0.append(this.s);
            throw new IllegalArgumentException(P0.toString());
        } else if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + " after the Fragment has been created");
        } else if (state != Lifecycle.State.DESTROYED) {
            super.s(fragment, state);
            return this;
        } else {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + state + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
    }

    public c0 t(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.s) {
            super.t(fragment);
            return this;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ");
        P0.append(fragment.toString());
        P0.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(P0.toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.u >= 0) {
            sb.append(" #");
            sb.append(this.u);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    public void u(int i) {
        if (this.i) {
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                c0.a aVar = this.c.get(i2);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (FragmentManager.R(2)) {
                        StringBuilder P0 = i0.d.a.a.a.P0("Bump nesting of ");
                        P0.append(aVar.b);
                        P0.append(" to ");
                        P0.append(aVar.b.mBackStackNesting);
                        Log.v("FragmentManager", P0.toString());
                    }
                }
            }
        }
    }

    public int v(boolean z) {
        if (!this.t) {
            if (FragmentManager.R(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new p0("FragmentManager"));
                w("  ", printWriter, true);
                printWriter.close();
            }
            this.t = true;
            if (this.i) {
                this.u = this.s.i.getAndIncrement();
            } else {
                this.u = -1;
            }
            this.s.A(this, z);
            return this.u;
        }
        throw new IllegalStateException("commit already called");
    }

    public void w(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.t);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (!(this.d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.f == 0 && this.g == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (!(this.l == 0 && this.m == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (!(this.n == 0 && this.o == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (!this.c.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                c0.a aVar = this.c.get(i);
                switch (aVar.a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder P0 = i0.d.a.a.a.P0("cmd=");
                        P0.append(aVar.a);
                        str2 = P0.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.b);
                if (z) {
                    if (!(aVar.c == 0 && aVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    public void x() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            c0.a aVar = this.c.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setPopDirection(false);
                fragment.setNextTransition(this.h);
                fragment.setSharedElementNames(this.p, this.q);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.s.i0(fragment, false);
                    this.s.a(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.s.d0(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.s.Q(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.s.i0(fragment, false);
                    this.s.m0(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.s.j(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.s.i0(fragment, false);
                    this.s.c(fragment);
                    break;
                case 8:
                    this.s.k0(fragment);
                    break;
                case 9:
                    this.s.k0((Fragment) null);
                    break;
                case 10:
                    this.s.j0(fragment, aVar.h);
                    break;
                default:
                    StringBuilder P0 = i0.d.a.a.a.P0("Unknown cmd: ");
                    P0.append(aVar.a);
                    throw new IllegalArgumentException(P0.toString());
            }
            if (!this.r) {
                int i2 = aVar.a;
            }
        }
    }

    public void y(boolean z) {
        for (int size = this.c.size() - 1; size >= 0; size--) {
            c0.a aVar = this.c.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setPopDirection(true);
                int i = this.h;
                int i2 = 8194;
                if (i != 4097) {
                    i2 = i != 4099 ? i != 8194 ? 0 : 4097 : 4099;
                }
                fragment.setNextTransition(i2);
                fragment.setSharedElementNames(this.q, this.p);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.s.i0(fragment, true);
                    this.s.d0(fragment);
                    break;
                case 3:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.s.a(fragment);
                    break;
                case 4:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.s.m0(fragment);
                    break;
                case 5:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.s.i0(fragment, true);
                    this.s.Q(fragment);
                    break;
                case 6:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.s.c(fragment);
                    break;
                case 7:
                    fragment.setAnimations(aVar.c, aVar.d, aVar.e, aVar.f);
                    this.s.i0(fragment, true);
                    this.s.j(fragment);
                    break;
                case 8:
                    this.s.k0((Fragment) null);
                    break;
                case 9:
                    this.s.k0(fragment);
                    break;
                case 10:
                    this.s.j0(fragment, aVar.g);
                    break;
                default:
                    StringBuilder P0 = i0.d.a.a.a.P0("Unknown cmd: ");
                    P0.append(aVar.a);
                    throw new IllegalArgumentException(P0.toString());
            }
            if (!this.r) {
                int i3 = aVar.a;
            }
        }
    }

    public boolean z(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.c.get(i2).b;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }
}
