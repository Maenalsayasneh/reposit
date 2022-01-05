package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import i0.h.a.b.d.c;
import i0.h.a.b.d.d;
import i0.h.a.b.d.e;
import i0.h.a.b.d.f;
import i0.h.a.b.d.g;
import i0.h.a.b.d.h;
import i0.h.a.b.d.k;
import i0.h.a.b.d.l;
import i0.h.a.b.h.f.m;
import i0.h.a.b.h.f.n;
import i0.h.a.b.h.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SupportMapFragment extends Fragment {
    public final b c = new b(this);

    public static class a implements c {
        public final Fragment a;
        public final i0.h.a.b.h.f.c b;

        public a(Fragment fragment, i0.h.a.b.h.f.c cVar) {
            this.b = cVar;
            Objects.requireNonNull(fragment, "null reference");
            this.a = fragment;
        }

        public final void a(i0.h.a.b.h.c cVar) {
            try {
                this.b.a0(new j(cVar));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void b() {
            try {
                this.b.b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void c() {
            try {
                this.b.c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void e(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                m.b(bundle, bundle2);
                this.b.e(bundle2);
                m.b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void f() {
            try {
                this.b.f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void g() {
            try {
                this.b.g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void i(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                m.b(bundle, bundle2);
                Bundle arguments = this.a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    m.c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.b.i(bundle2);
                m.b(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void j(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                m.b(bundle2, bundle3);
                this.b.z(new d(activity), googleMapOptions, bundle3);
                m.b(bundle3, bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final View k(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                m.b(bundle, bundle2);
                i0.h.a.b.d.b k = this.b.k(new d(layoutInflater), new d(viewGroup), bundle2);
                m.b(bundle2, bundle);
                return (View) d.j0(k);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onLowMemory() {
            try {
                this.b.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStart() {
            try {
                this.b.onStart();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onStop() {
            try {
                this.b.onStop();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public static class b extends i0.h.a.b.d.a<a> {
        public final Fragment e;
        public e<a> f;
        public Activity g;
        public final List<i0.h.a.b.h.c> h = new ArrayList();

        public b(Fragment fragment) {
            this.e = fragment;
        }

        public final void a(e<a> eVar) {
            this.f = eVar;
            e();
        }

        public final void e() {
            Activity activity = this.g;
            if (activity != null && this.f != null && this.a == null) {
                try {
                    i0.h.a.b.h.b.a(activity);
                    i0.h.a.b.h.f.c g02 = n.a(this.g).g0(new d(this.g));
                    if (g02 != null) {
                        ((f) this.f).a(new a(this.e, g02));
                        for (i0.h.a.b.h.c a : this.h) {
                            ((a) this.a).a(a);
                        }
                        this.h.clear();
                    }
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        b bVar = this.c;
        bVar.g = activity;
        bVar.e();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b bVar = this.c;
        bVar.d(bundle, new g(bVar, bundle));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View b2 = this.c.b(layoutInflater, viewGroup, bundle);
        b2.setClickable(true);
        return b2;
    }

    public void onDestroy() {
        b bVar = this.c;
        T t = bVar.a;
        if (t != null) {
            t.f();
        } else {
            bVar.c(1);
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        b bVar = this.c;
        T t = bVar.a;
        if (t != null) {
            t.g();
        } else {
            bVar.c(2);
        }
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            b bVar = this.c;
            bVar.g = activity;
            bVar.e();
            GoogleMapOptions I0 = GoogleMapOptions.I0(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", I0);
            b bVar2 = this.c;
            bVar2.d(bundle, new h(bVar2, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        T t = this.c.a;
        if (t != null) {
            t.onLowMemory();
        }
        super.onLowMemory();
    }

    public void onPause() {
        b bVar = this.c;
        T t = bVar.a;
        if (t != null) {
            t.c();
        } else {
            bVar.c(5);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        b bVar = this.c;
        bVar.d((Bundle) null, new k(bVar));
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        b bVar = this.c;
        T t = bVar.a;
        if (t != null) {
            t.e(bundle);
            return;
        }
        Bundle bundle2 = bVar.b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void onStart() {
        super.onStart();
        b bVar = this.c;
        bVar.d((Bundle) null, new l(bVar));
    }

    public void onStop() {
        b bVar = this.c;
        T t = bVar.a;
        if (t != null) {
            t.onStop();
        } else {
            bVar.c(4);
        }
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
