package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavController;
import androidx.navigation.R;
import g0.a.b.b.a;
import h0.q.k0;
import h0.q.m0;
import h0.q.n0;
import h0.t.f;
import h0.t.g;
import h0.t.o;
import h0.t.s;
import h0.t.t;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public class NavHostFragment extends Fragment {
    public o c;
    public Boolean d = null;
    public View q;
    public int x;
    public boolean y;

    public static NavController I0(Fragment fragment) {
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).J0();
            }
            Fragment fragment3 = fragment2.getParentFragmentManager().u;
            if (fragment3 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment3).J0();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return a.F(view);
        }
        Dialog dialog = fragment instanceof DialogFragment ? ((DialogFragment) fragment).e2 : null;
        if (dialog != null && dialog.getWindow() != null) {
            return a.F(dialog.getWindow().getDecorView());
        }
        throw new IllegalStateException(i0.d.a.a.a.m0("Fragment ", fragment, " does not have a NavController set"));
    }

    public final NavController J0() {
        o oVar = this.c;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalStateException("NavController is not available before onCreate()");
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.y) {
            h0.o.a.a aVar = new h0.o.a.a(getParentFragmentManager());
            aVar.t(this);
            aVar.h();
        }
    }

    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        t tVar = this.c.k;
        Objects.requireNonNull(tVar);
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) tVar.c(t.b(DialogFragmentNavigator.class));
        if (dialogFragmentNavigator.d.remove(fragment.getTag())) {
            fragment.getLifecycle().a(dialogFragmentNavigator.e);
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2;
        k0 k0Var;
        o oVar = new o(requireContext());
        this.c = oVar;
        oVar.i = this;
        getLifecycle().a(oVar.m);
        o oVar2 = this.c;
        OnBackPressedDispatcher onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        if (oVar2.i != null) {
            oVar2.n.b();
            onBackPressedDispatcher.a(oVar2.i, oVar2.n);
            o oVar3 = this.c;
            Boolean bool = this.d;
            int i = 0;
            oVar3.o = bool != null && bool.booleanValue();
            oVar3.p();
            Bundle bundle3 = null;
            this.d = null;
            o oVar4 = this.c;
            n0 viewModelStore = getViewModelStore();
            if (oVar4.h.isEmpty()) {
                m0.b bVar = g.a;
                Class cls = g.class;
                String canonicalName = cls.getCanonicalName();
                if (canonicalName != null) {
                    String n02 = i0.d.a.a.a.n0("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                    k0 k0Var2 = viewModelStore.a.get(n02);
                    if (!cls.isInstance(k0Var2)) {
                        if (bVar instanceof m0.c) {
                            k0Var = ((m0.c) bVar).create(n02, cls);
                        } else {
                            k0Var = new g();
                        }
                        k0Var2 = k0Var;
                        k0 put = viewModelStore.a.put(n02, k0Var2);
                        if (put != null) {
                            put.onCleared();
                        }
                    } else if (bVar instanceof m0.e) {
                        ((m0.e) bVar).onRequery(k0Var2);
                    }
                    oVar4.j = (g) k0Var2;
                    o oVar5 = this.c;
                    oVar5.k.a(new DialogFragmentNavigator(requireContext(), getChildFragmentManager()));
                    t tVar = oVar5.k;
                    Context requireContext = requireContext();
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    int id = getId();
                    if (id == 0 || id == -1) {
                        id = R.id.nav_host_fragment_container;
                    }
                    tVar.a(new h0.t.u.a(requireContext, childFragmentManager, id));
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("android-support-nav:fragment:navControllerState");
                        if (bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
                            this.y = true;
                            h0.o.a.a aVar = new h0.o.a.a(getParentFragmentManager());
                            aVar.t(this);
                            aVar.h();
                        }
                        this.x = bundle.getInt("android-support-nav:fragment:graphId");
                    } else {
                        bundle2 = null;
                    }
                    if (bundle2 != null) {
                        o oVar6 = this.c;
                        Objects.requireNonNull(oVar6);
                        bundle2.setClassLoader(oVar6.a.getClassLoader());
                        oVar6.e = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        oVar6.f = bundle2.getParcelableArray("android-support-nav:controller:backStack");
                        oVar6.g = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
                    }
                    int i2 = this.x;
                    if (i2 != 0) {
                        o oVar7 = this.c;
                        oVar7.o(oVar7.f().c(i2), (Bundle) null);
                    } else {
                        Bundle arguments = getArguments();
                        if (arguments != null) {
                            i = arguments.getInt("android-support-nav:fragment:graphId");
                        }
                        if (arguments != null) {
                            bundle3 = arguments.getBundle("android-support-nav:fragment:startDestinationArgs");
                        }
                        if (i != 0) {
                            o oVar8 = this.c;
                            oVar8.o(oVar8.f().c(i), bundle3);
                        }
                    }
                    super.onCreate(bundle);
                    return;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(layoutInflater.getContext());
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id);
        return fragmentContainerView;
    }

    public void onDestroyView() {
        super.onDestroyView();
        View view = this.q;
        if (view != null && a.F(view) == this.c) {
            this.q.setTag(R.id.nav_controller_view_tag, (Object) null);
        }
        this.q = null;
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.NavHost);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.NavHost_navGraph, 0);
        if (resourceId != 0) {
            this.x = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R.styleable.NavHostFragment);
        if (obtainStyledAttributes2.getBoolean(R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.y = true;
        }
        obtainStyledAttributes2.recycle();
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
        o oVar = this.c;
        if (oVar != null) {
            oVar.o = z;
            oVar.p();
            return;
        }
        this.d = Boolean.valueOf(z);
    }

    public void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2;
        super.onSaveInstanceState(bundle);
        o oVar = this.c;
        Objects.requireNonNull(oVar);
        ArrayList arrayList = new ArrayList();
        Bundle bundle3 = new Bundle();
        for (Map.Entry next : oVar.k.b.entrySet()) {
            String str = (String) next.getKey();
            Bundle d2 = ((s) next.getValue()).d();
            if (d2 != null) {
                arrayList.add(str);
                bundle3.putBundle(str, d2);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle2 = new Bundle();
            bundle3.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle2.putBundle("android-support-nav:controller:navigatorState", bundle3);
        } else {
            bundle2 = null;
        }
        if (!oVar.h.isEmpty()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[oVar.h.size()];
            int i = 0;
            for (f navBackStackEntryState : oVar.h) {
                parcelableArr[i] = new NavBackStackEntryState(navBackStackEntryState);
                i++;
            }
            bundle2.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (oVar.g) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putBoolean("android-support-nav:controller:deepLinkHandled", oVar.g);
        }
        if (bundle2 != null) {
            bundle.putBundle("android-support-nav:fragment:navControllerState", bundle2);
        }
        if (this.y) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
        int i2 = this.x;
        if (i2 != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i2);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (view instanceof ViewGroup) {
            o oVar = this.c;
            int i = R.id.nav_controller_view_tag;
            view.setTag(i, oVar);
            if (view.getParent() != null) {
                View view2 = (View) view.getParent();
                this.q = view2;
                if (view2.getId() == getId()) {
                    this.q.setTag(i, this.c);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("created host view " + view + " is not a ViewGroup");
    }
}
