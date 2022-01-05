package h0.o.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentState;
import androidx.fragment.app.SpecialEffectsController;
import androidx.lifecycle.Lifecycle;
import h0.i.i.q;
import h0.q.n0;
import h0.q.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: FragmentStateManager */
public class a0 {
    public final v a;
    public final b0 b;
    public final Fragment c;
    public boolean d = false;
    public int e = -1;

    /* compiled from: FragmentStateManager */
    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ View c;

        public a(a0 a0Var, View view) {
            this.c = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.c.removeOnAttachStateChangeListener(this);
            View view2 = this.c;
            AtomicInteger atomicInteger = q.a;
            view2.requestApplyInsets();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public a0(v vVar, b0 b0Var, Fragment fragment) {
        this.a = vVar;
        this.b = b0Var;
        this.c = fragment;
    }

    public void a() {
        if (FragmentManager.R(3)) {
            StringBuilder P0 = i0.d.a.a.a.P0("moveto ACTIVITY_CREATED: ");
            P0.append(this.c);
            Log.d("FragmentManager", P0.toString());
        }
        Fragment fragment = this.c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        v vVar = this.a;
        Fragment fragment2 = this.c;
        vVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        View view;
        View view2;
        b0 b0Var = this.b;
        Fragment fragment = this.c;
        Objects.requireNonNull(b0Var);
        ViewGroup viewGroup = fragment.mContainer;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = b0Var.a.indexOf(fragment);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= b0Var.a.size()) {
                            break;
                        }
                        Fragment fragment2 = b0Var.a.get(indexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = b0Var.a.get(i2);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        Fragment fragment4 = this.c;
        fragment4.mContainer.addView(fragment4.mView, i);
    }

    public void c() {
        if (FragmentManager.R(3)) {
            StringBuilder P0 = i0.d.a.a.a.P0("moveto ATTACHED: ");
            P0.append(this.c);
            Log.d("FragmentManager", P0.toString());
        }
        Fragment fragment = this.c;
        Fragment fragment2 = fragment.mTarget;
        a0 a0Var = null;
        if (fragment2 != null) {
            a0 h = this.b.h(fragment2.mWho);
            if (h != null) {
                Fragment fragment3 = this.c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                a0Var = h;
            } else {
                StringBuilder P02 = i0.d.a.a.a.P0("Fragment ");
                P02.append(this.c);
                P02.append(" declared target fragment ");
                P02.append(this.c.mTarget);
                P02.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(P02.toString());
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (a0Var = this.b.h(str)) == null) {
                StringBuilder P03 = i0.d.a.a.a.P0("Fragment ");
                P03.append(this.c);
                P03.append(" declared target fragment ");
                throw new IllegalStateException(i0.d.a.a.a.y0(P03, this.c.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (a0Var != null) {
            a0Var.k();
        }
        Fragment fragment4 = this.c;
        FragmentManager fragmentManager = fragment4.mFragmentManager;
        fragment4.mHost = fragmentManager.r;
        fragment4.mParentFragment = fragmentManager.t;
        this.a.g(fragment4, false);
        this.c.performAttach();
        this.a.b(this.c, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact} */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r9v4, types: [androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact] */
    /* JADX WARNING: type inference failed for: r8v6, types: [androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d() {
        /*
            r13 = this;
            androidx.fragment.app.Fragment r0 = r13.c
            androidx.fragment.app.FragmentManager r1 = r0.mFragmentManager
            if (r1 != 0) goto L_0x0009
            int r0 = r0.mState
            return r0
        L_0x0009:
            int r1 = r13.e
            androidx.lifecycle.Lifecycle$State r0 = r0.mMaxState
            int r0 = r0.ordinal()
            r2 = -1
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L_0x002e
            if (r0 == r6) goto L_0x0029
            if (r0 == r4) goto L_0x0024
            if (r0 == r5) goto L_0x0033
            int r1 = java.lang.Math.min(r1, r2)
            goto L_0x0033
        L_0x0024:
            int r1 = java.lang.Math.min(r1, r3)
            goto L_0x0033
        L_0x0029:
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x0033
        L_0x002e:
            r0 = 0
            int r1 = java.lang.Math.min(r1, r0)
        L_0x0033:
            androidx.fragment.app.Fragment r0 = r13.c
            boolean r8 = r0.mFromLayout
            if (r8 == 0) goto L_0x0063
            boolean r8 = r0.mInLayout
            if (r8 == 0) goto L_0x0054
            int r0 = r13.e
            int r1 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.Fragment r0 = r13.c
            android.view.View r0 = r0.mView
            if (r0 == 0) goto L_0x0063
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0063
            int r1 = java.lang.Math.min(r1, r6)
            goto L_0x0063
        L_0x0054:
            int r8 = r13.e
            if (r8 >= r5) goto L_0x005f
            int r0 = r0.mState
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0063
        L_0x005f:
            int r1 = java.lang.Math.min(r1, r7)
        L_0x0063:
            androidx.fragment.app.Fragment r0 = r13.c
            boolean r0 = r0.mAdded
            if (r0 != 0) goto L_0x006d
            int r1 = java.lang.Math.min(r1, r7)
        L_0x006d:
            androidx.fragment.app.Fragment r0 = r13.c
            android.view.ViewGroup r8 = r0.mContainer
            r9 = 0
            if (r8 == 0) goto L_0x00b8
            androidx.fragment.app.FragmentManager r0 = r0.getParentFragmentManager()
            androidx.fragment.app.SpecialEffectsController r0 = androidx.fragment.app.SpecialEffectsController.f(r8, r0)
            java.util.Objects.requireNonNull(r0)
            androidx.fragment.app.Fragment r8 = r13.c
            androidx.fragment.app.SpecialEffectsController$Operation r8 = r0.d(r8)
            if (r8 == 0) goto L_0x008a
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r8 = r8.b
            goto L_0x008b
        L_0x008a:
            r8 = r9
        L_0x008b:
            androidx.fragment.app.Fragment r10 = r13.c
            java.util.ArrayList<androidx.fragment.app.SpecialEffectsController$Operation> r0 = r0.c
            java.util.Iterator r0 = r0.iterator()
        L_0x0093:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00ac
            java.lang.Object r11 = r0.next()
            androidx.fragment.app.SpecialEffectsController$Operation r11 = (androidx.fragment.app.SpecialEffectsController.Operation) r11
            androidx.fragment.app.Fragment r12 = r11.c
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L_0x0093
            boolean r12 = r11.f
            if (r12 != 0) goto L_0x0093
            r9 = r11
        L_0x00ac:
            if (r9 == 0) goto L_0x00b7
            if (r8 == 0) goto L_0x00b4
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.NONE
            if (r8 != r0) goto L_0x00b7
        L_0x00b4:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r9 = r9.b
            goto L_0x00b8
        L_0x00b7:
            r9 = r8
        L_0x00b8:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.ADDING
            if (r9 != r0) goto L_0x00c2
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x00e0
        L_0x00c2:
            androidx.fragment.app.SpecialEffectsController$Operation$LifecycleImpact r0 = androidx.fragment.app.SpecialEffectsController.Operation.LifecycleImpact.REMOVING
            if (r9 != r0) goto L_0x00cb
            int r1 = java.lang.Math.max(r1, r4)
            goto L_0x00e0
        L_0x00cb:
            androidx.fragment.app.Fragment r0 = r13.c
            boolean r4 = r0.mRemoving
            if (r4 == 0) goto L_0x00e0
            boolean r0 = r0.isInBackStack()
            if (r0 == 0) goto L_0x00dc
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x00e0
        L_0x00dc:
            int r1 = java.lang.Math.min(r1, r2)
        L_0x00e0:
            androidx.fragment.app.Fragment r0 = r13.c
            boolean r2 = r0.mDeferStart
            if (r2 == 0) goto L_0x00ee
            int r0 = r0.mState
            if (r0 >= r3) goto L_0x00ee
            int r1 = java.lang.Math.min(r1, r5)
        L_0x00ee:
            boolean r0 = androidx.fragment.app.FragmentManager.R(r6)
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = "computeExpectedState() of "
            java.lang.String r2 = " for "
            java.lang.StringBuilder r0 = i0.d.a.a.a.Q0(r0, r1, r2)
            androidx.fragment.app.Fragment r2 = r13.c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
        L_0x010a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.o.a.a0.d():int");
    }

    public void e() {
        if (FragmentManager.R(3)) {
            StringBuilder P0 = i0.d.a.a.a.P0("moveto CREATED: ");
            P0.append(this.c);
            Log.d("FragmentManager", P0.toString());
        }
        Fragment fragment = this.c;
        if (!fragment.mIsCreated) {
            this.a.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            v vVar = this.a;
            Fragment fragment3 = this.c;
            vVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.c.mState = 1;
    }

    public void f() {
        String str;
        if (!this.c.mFromLayout) {
            if (FragmentManager.R(3)) {
                StringBuilder P0 = i0.d.a.a.a.P0("moveto CREATE_VIEW: ");
                P0.append(this.c);
                Log.d("FragmentManager", P0.toString());
            }
            Fragment fragment = this.c;
            LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
            ViewGroup viewGroup = null;
            Fragment fragment2 = this.c;
            ViewGroup viewGroup2 = fragment2.mContainer;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = fragment2.mContainerId;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) fragment2.mFragmentManager.s.b(i);
                        if (viewGroup == null) {
                            Fragment fragment3 = this.c;
                            if (!fragment3.mRestored) {
                                try {
                                    str = fragment3.getResources().getResourceName(this.c.mContainerId);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder P02 = i0.d.a.a.a.P0("No view found for id 0x");
                                P02.append(Integer.toHexString(this.c.mContainerId));
                                P02.append(" (");
                                P02.append(str);
                                P02.append(") for fragment ");
                                P02.append(this.c);
                                throw new IllegalArgumentException(P02.toString());
                            }
                        }
                    } else {
                        StringBuilder P03 = i0.d.a.a.a.P0("Cannot create fragment ");
                        P03.append(this.c);
                        P03.append(" for a container view with no id");
                        throw new IllegalArgumentException(P03.toString());
                    }
                }
            }
            Fragment fragment4 = this.c;
            fragment4.mContainer = viewGroup;
            fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
            View view = this.c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment5 = this.c;
                fragment5.mView.setTag(R.id.fragment_container_view_tag, fragment5);
                if (viewGroup != null) {
                    b();
                }
                Fragment fragment6 = this.c;
                if (fragment6.mHidden) {
                    fragment6.mView.setVisibility(8);
                }
                View view2 = this.c.mView;
                AtomicInteger atomicInteger = q.a;
                if (view2.isAttachedToWindow()) {
                    this.c.mView.requestApplyInsets();
                } else {
                    View view3 = this.c.mView;
                    view3.addOnAttachStateChangeListener(new a(this, view3));
                }
                this.c.performViewCreated();
                v vVar = this.a;
                Fragment fragment7 = this.c;
                vVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
                int visibility = this.c.mView.getVisibility();
                this.c.setPostOnViewCreatedAlpha(this.c.mView.getAlpha());
                Fragment fragment8 = this.c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View findFocus = fragment8.mView.findFocus();
                    if (findFocus != null) {
                        this.c.setFocusedView(findFocus);
                        if (FragmentManager.R(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.c);
                        }
                    }
                    this.c.mView.setAlpha(0.0f);
                }
            }
            this.c.mState = 2;
        }
    }

    public void g() {
        Fragment d2;
        if (FragmentManager.R(3)) {
            StringBuilder P0 = i0.d.a.a.a.P0("movefrom CREATED: ");
            P0.append(this.c);
            Log.d("FragmentManager", P0.toString());
        }
        Fragment fragment = this.c;
        boolean z = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (z2 || this.b.c.c(this.c)) {
            t<?> tVar = this.c.mHost;
            if (tVar instanceof o0) {
                z = this.b.c.f;
            } else {
                Context context = tVar.d;
                if (context instanceof Activity) {
                    z = true ^ ((Activity) context).isChangingConfigurations();
                }
            }
            if (z2 || z) {
                x xVar = this.b.c;
                Fragment fragment2 = this.c;
                Objects.requireNonNull(xVar);
                if (FragmentManager.R(3)) {
                    Log.d("FragmentManager", "Clearing non-config state for " + fragment2);
                }
                x xVar2 = xVar.c.get(fragment2.mWho);
                if (xVar2 != null) {
                    xVar2.onCleared();
                    xVar.c.remove(fragment2.mWho);
                }
                n0 n0Var = xVar.d.get(fragment2.mWho);
                if (n0Var != null) {
                    n0Var.a();
                    xVar.d.remove(fragment2.mWho);
                }
            }
            this.c.performDestroy();
            this.a.d(this.c, false);
            Iterator it = ((ArrayList) this.b.f()).iterator();
            while (it.hasNext()) {
                a0 a0Var = (a0) it.next();
                if (a0Var != null) {
                    Fragment fragment3 = a0Var.c;
                    if (this.c.mWho.equals(fragment3.mTargetWho)) {
                        fragment3.mTarget = this.c;
                        fragment3.mTargetWho = null;
                    }
                }
            }
            Fragment fragment4 = this.c;
            String str = fragment4.mTargetWho;
            if (str != null) {
                fragment4.mTarget = this.b.d(str);
            }
            this.b.k(this);
            return;
        }
        String str2 = this.c.mTargetWho;
        if (!(str2 == null || (d2 = this.b.d(str2)) == null || !d2.mRetainInstance)) {
            this.c.mTarget = d2;
        }
        this.c.mState = 0;
    }

    public void h() {
        View view;
        if (FragmentManager.R(3)) {
            StringBuilder P0 = i0.d.a.a.a.P0("movefrom CREATE_VIEW: ");
            P0.append(this.c);
            Log.d("FragmentManager", P0.toString());
        }
        Fragment fragment = this.c;
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || (view = fragment.mView) == null)) {
            viewGroup.removeView(view);
        }
        this.c.performDestroyView();
        this.a.n(this.c, false);
        Fragment fragment2 = this.c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.c.mInLayout = false;
    }

    public void i() {
        if (FragmentManager.R(3)) {
            StringBuilder P0 = i0.d.a.a.a.P0("movefrom ATTACHED: ");
            P0.append(this.c);
            Log.d("FragmentManager", P0.toString());
        }
        this.c.performDetach();
        boolean z = false;
        this.a.e(this.c, false);
        Fragment fragment = this.c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.b.c.c(this.c)) {
            if (FragmentManager.R(3)) {
                StringBuilder P02 = i0.d.a.a.a.P0("initState called for fragment: ");
                P02.append(this.c);
                Log.d("FragmentManager", P02.toString());
            }
            this.c.initState();
        }
    }

    public void j() {
        Fragment fragment = this.c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.R(3)) {
                StringBuilder P0 = i0.d.a.a.a.P0("moveto CREATE_VIEW: ");
                P0.append(this.c);
                Log.d("FragmentManager", P0.toString());
            }
            Fragment fragment2 = this.c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), (ViewGroup) null, this.c.mSavedFragmentState);
            View view = this.c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.c;
                fragment3.mView.setTag(R.id.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.c.performViewCreated();
                v vVar = this.a;
                Fragment fragment5 = this.c;
                vVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.c.mState = 2;
            }
        }
    }

    public void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (!this.d) {
            boolean z = false;
            z = true;
            try {
                while (true) {
                    int d2 = d();
                    Fragment fragment = this.c;
                    int i = fragment.mState;
                    if (d2 != i) {
                        if (d2 <= i) {
                            switch (i - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.c.mState = z ? 1 : 0;
                                    break;
                                case 2:
                                    fragment.mInLayout = z;
                                    fragment.mState = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.R(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.c);
                                    }
                                    Fragment fragment2 = this.c;
                                    if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                        o();
                                    }
                                    Fragment fragment3 = this.c;
                                    if (!(fragment3.mView == null || (viewGroup2 = fragment3.mContainer) == null)) {
                                        SpecialEffectsController f = SpecialEffectsController.f(viewGroup2, fragment3.getParentFragmentManager());
                                        Objects.requireNonNull(f);
                                        if (FragmentManager.R(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.c);
                                        }
                                        f.a(SpecialEffectsController.Operation.State.REMOVED, SpecialEffectsController.Operation.LifecycleImpact.REMOVING, this);
                                    }
                                    this.c.mState = 3;
                                    break;
                                case 4:
                                    q();
                                    break;
                                case 5:
                                    fragment.mState = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(fragment.mView == null || (viewGroup3 = fragment.mContainer) == null)) {
                                        SpecialEffectsController f2 = SpecialEffectsController.f(viewGroup3, fragment.getParentFragmentManager());
                                        SpecialEffectsController.Operation.State from = SpecialEffectsController.Operation.State.from(this.c.mView.getVisibility());
                                        Objects.requireNonNull(f2);
                                        if (FragmentManager.R(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.c);
                                        }
                                        f2.a(from, SpecialEffectsController.Operation.LifecycleImpact.ADDING, this);
                                    }
                                    this.c.mState = 4;
                                    break;
                                case 5:
                                    p();
                                    break;
                                case 6:
                                    fragment.mState = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                    } else {
                        if (fragment.mHiddenChanged) {
                            if (!(fragment.mView == null || (viewGroup = fragment.mContainer) == null)) {
                                SpecialEffectsController f3 = SpecialEffectsController.f(viewGroup, fragment.getParentFragmentManager());
                                if (this.c.mHidden) {
                                    Objects.requireNonNull(f3);
                                    if (FragmentManager.R(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.c);
                                    }
                                    f3.a(SpecialEffectsController.Operation.State.GONE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                                } else {
                                    Objects.requireNonNull(f3);
                                    if (FragmentManager.R(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.c);
                                    }
                                    f3.a(SpecialEffectsController.Operation.State.VISIBLE, SpecialEffectsController.Operation.LifecycleImpact.NONE, this);
                                }
                            }
                            Fragment fragment4 = this.c;
                            FragmentManager fragmentManager = fragment4.mFragmentManager;
                            if (fragmentManager != null && fragment4.mAdded && fragmentManager.S(fragment4)) {
                                fragmentManager.C = z;
                            }
                            Fragment fragment5 = this.c;
                            fragment5.mHiddenChanged = z;
                            fragment5.onHiddenChanged(fragment5.mHidden);
                        }
                        this.d = z;
                        return;
                    }
                }
            } finally {
                this.d = z;
            }
        } else if (FragmentManager.R(2)) {
            StringBuilder P0 = i0.d.a.a.a.P0("Ignoring re-entrant call to moveToExpectedState() for ");
            P0.append(this.c);
            Log.v("FragmentManager", P0.toString());
        }
    }

    public void l() {
        if (FragmentManager.R(3)) {
            StringBuilder P0 = i0.d.a.a.a.P0("movefrom RESUMED: ");
            P0.append(this.c);
            Log.d("FragmentManager", P0.toString());
        }
        this.c.performPause();
        this.a.f(this.c, false);
    }

    public void m(ClassLoader classLoader) {
        Bundle bundle = this.c.mSavedFragmentState;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.c;
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.c;
            fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
            Fragment fragment3 = this.c;
            fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
            Fragment fragment4 = this.c;
            if (fragment4.mTargetWho != null) {
                fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
            }
            Fragment fragment5 = this.c;
            Boolean bool = fragment5.mSavedUserVisibleHint;
            if (bool != null) {
                fragment5.mUserVisibleHint = bool.booleanValue();
                this.c.mSavedUserVisibleHint = null;
            } else {
                fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment6 = this.c;
            if (!fragment6.mUserVisibleHint) {
                fragment6.mDeferStart = true;
            }
        }
    }

    public void n() {
        if (FragmentManager.R(3)) {
            StringBuilder P0 = i0.d.a.a.a.P0("moveto RESUMED: ");
            P0.append(this.c);
            Log.d("FragmentManager", P0.toString());
        }
        View focusedView = this.c.getFocusedView();
        if (focusedView != null) {
            boolean z = true;
            if (focusedView != this.c.mView) {
                ViewParent parent = focusedView.getParent();
                while (true) {
                    if (parent == null) {
                        z = false;
                        break;
                    } else if (parent == this.c.mView) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            if (z) {
                boolean requestFocus = focusedView.requestFocus();
                if (FragmentManager.R(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Restoring focused view ");
                    sb.append(focusedView);
                    sb.append(" ");
                    sb.append(requestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(this.c);
                    sb.append(" resulting in focused view ");
                    sb.append(this.c.mView.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        this.c.setFocusedView((View) null);
        this.c.performResume();
        this.a.i(this.c, false);
        Fragment fragment = this.c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public void o() {
        if (this.c.mView != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.c.mView.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.c.mSavedViewState = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.c.mViewLifecycleOwner.y.b(bundle);
            if (!bundle.isEmpty()) {
                this.c.mSavedViewRegistryState = bundle;
            }
        }
    }

    public void p() {
        if (FragmentManager.R(3)) {
            StringBuilder P0 = i0.d.a.a.a.P0("moveto STARTED: ");
            P0.append(this.c);
            Log.d("FragmentManager", P0.toString());
        }
        this.c.performStart();
        this.a.k(this.c, false);
    }

    public void q() {
        if (FragmentManager.R(3)) {
            StringBuilder P0 = i0.d.a.a.a.P0("movefrom STARTED: ");
            P0.append(this.c);
            Log.d("FragmentManager", P0.toString());
        }
        this.c.performStop();
        this.a.l(this.c, false);
    }

    public a0(v vVar, b0 b0Var, ClassLoader classLoader, s sVar, FragmentState fragmentState) {
        this.a = vVar;
        this.b = b0Var;
        Fragment instantiate = sVar.instantiate(classLoader, fragmentState.c);
        this.c = instantiate;
        Bundle bundle = fragmentState.c2;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        instantiate.setArguments(fragmentState.c2);
        instantiate.mWho = fragmentState.d;
        instantiate.mFromLayout = fragmentState.q;
        instantiate.mRestored = true;
        instantiate.mFragmentId = fragmentState.x;
        instantiate.mContainerId = fragmentState.y;
        instantiate.mTag = fragmentState.Y1;
        instantiate.mRetainInstance = fragmentState.Z1;
        instantiate.mRemoving = fragmentState.a2;
        instantiate.mDetached = fragmentState.b2;
        instantiate.mHidden = fragmentState.d2;
        instantiate.mMaxState = Lifecycle.State.values()[fragmentState.e2];
        Bundle bundle2 = fragmentState.f2;
        if (bundle2 != null) {
            instantiate.mSavedFragmentState = bundle2;
        } else {
            instantiate.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.R(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + instantiate);
        }
    }

    public a0(v vVar, b0 b0Var, Fragment fragment, FragmentState fragmentState) {
        this.a = vVar;
        this.b = b0Var;
        this.c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f2;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
