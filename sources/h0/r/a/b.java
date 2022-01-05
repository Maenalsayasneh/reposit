package h0.r.a;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import h0.f.i;
import h0.q.k0;
import h0.q.m0;
import h0.q.n0;
import h0.q.p;
import h0.q.y;
import h0.q.z;
import h0.r.a.a;
import h0.r.b.a;
import h0.r.b.b;
import i0.h.a.b.a.a.d.b.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

/* compiled from: LoaderManagerImpl */
public class b extends a {
    public final p a;
    public final c b;

    /* compiled from: LoaderManagerImpl */
    public static class a<D> extends y<D> implements b.a<D> {
        public final int a;
        public final Bundle b;
        public final h0.r.b.b<D> c;
        public p d;
        public C0062b<D> e;
        public h0.r.b.b<D> f;

        public a(int i, Bundle bundle, h0.r.b.b<D> bVar, h0.r.b.b<D> bVar2) {
            this.a = i;
            this.b = bundle;
            this.c = bVar;
            this.f = bVar2;
            if (bVar.b == null) {
                bVar.b = this;
                bVar.a = i;
                return;
            }
            throw new IllegalStateException("There is already a listener registered");
        }

        public h0.r.b.b<D> a(boolean z) {
            this.c.a();
            this.c.d = true;
            C0062b<D> bVar = this.e;
            if (bVar != null) {
                super.removeObserver(bVar);
                this.d = null;
                this.e = null;
                if (z && bVar.c) {
                    Objects.requireNonNull((SignInHubActivity.a) bVar.b);
                }
            }
            h0.r.b.b<D> bVar2 = this.c;
            b.a<D> aVar = bVar2.b;
            if (aVar == null) {
                throw new IllegalStateException("No listener register");
            } else if (aVar == this) {
                bVar2.b = null;
                if ((bVar == null || bVar.c) && !z) {
                    return bVar2;
                }
                bVar2.e = true;
                bVar2.c = false;
                bVar2.d = false;
                bVar2.f = false;
                return this.f;
            } else {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
        }

        public void b() {
            p pVar = this.d;
            C0062b<D> bVar = this.e;
            if (pVar != null && bVar != null) {
                super.removeObserver(bVar);
                observe(pVar, bVar);
            }
        }

        public h0.r.b.b<D> c(p pVar, a.C0061a<D> aVar) {
            C0062b<D> bVar = new C0062b<>(this.c, aVar);
            observe(pVar, bVar);
            C0062b<D> bVar2 = this.e;
            if (bVar2 != null) {
                removeObserver(bVar2);
            }
            this.d = pVar;
            this.e = bVar;
            return this.c;
        }

        public void onActive() {
            h0.r.b.b<D> bVar = this.c;
            bVar.c = true;
            bVar.e = false;
            bVar.d = false;
            e eVar = (e) bVar;
            eVar.k.drainPermits();
            eVar.a();
            eVar.h = new a.C0063a();
            eVar.c();
        }

        public void onInactive() {
            this.c.c = false;
        }

        public void removeObserver(z<? super D> zVar) {
            super.removeObserver(zVar);
            this.d = null;
            this.e = null;
        }

        public void setValue(D d2) {
            super.setValue(d2);
            h0.r.b.b<D> bVar = this.f;
            if (bVar != null) {
                bVar.e = true;
                bVar.c = false;
                bVar.d = false;
                bVar.f = false;
                this.f = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.a);
            sb.append(" : ");
            g0.a.b.b.a.f(this.c, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: h0.r.a.b$b  reason: collision with other inner class name */
    /* compiled from: LoaderManagerImpl */
    public static class C0062b<D> implements z<D> {
        public final h0.r.b.b<D> a;
        public final a.C0061a<D> b;
        public boolean c = false;

        public C0062b(h0.r.b.b<D> bVar, a.C0061a<D> aVar) {
            this.a = bVar;
            this.b = aVar;
        }

        public void onChanged(D d) {
            SignInHubActivity.a aVar = (SignInHubActivity.a) this.b;
            Objects.requireNonNull(aVar);
            Void voidR = (Void) d;
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.y, signInHubActivity.Y1);
            SignInHubActivity.this.finish();
            this.c = true;
        }

        public String toString() {
            return this.b.toString();
        }
    }

    /* compiled from: LoaderManagerImpl */
    public static class c extends k0 {
        public static final m0.b a = new a();
        public i<a> b = new i<>();
        public boolean c = false;

        /* compiled from: LoaderManagerImpl */
        public static class a implements m0.b {
            public <T extends k0> T create(Class<T> cls) {
                return new c();
            }
        }

        public void onCleared() {
            super.onCleared();
            int i = this.b.i();
            for (int i2 = 0; i2 < i; i2++) {
                this.b.j(i2).a(true);
            }
            i<a> iVar = this.b;
            int i3 = iVar.y;
            Object[] objArr = iVar.x;
            for (int i4 = 0; i4 < i3; i4++) {
                objArr[i4] = null;
            }
            iVar.y = 0;
            iVar.d = false;
        }
    }

    public b(p pVar, n0 n0Var) {
        k0 k0Var;
        this.a = pVar;
        m0.b bVar = c.a;
        Class cls = c.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String n02 = i0.d.a.a.a.n0("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            k0 k0Var2 = n0Var.a.get(n02);
            if (!cls.isInstance(k0Var2)) {
                if (bVar instanceof m0.c) {
                    k0Var = ((m0.c) bVar).create(n02, cls);
                } else {
                    k0Var = ((c.a) bVar).create(cls);
                }
                k0Var2 = k0Var;
                k0 put = n0Var.a.put(n02, k0Var2);
                if (put != null) {
                    put.onCleared();
                }
            } else if (bVar instanceof m0.e) {
                ((m0.e) bVar).onRequery(k0Var2);
            }
            this.b = (c) k0Var2;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        c cVar = this.b;
        if (cVar.b.i() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < cVar.b.i(); i++) {
                a j = cVar.b.j(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(cVar.b.g(i));
                printWriter.print(": ");
                printWriter.println(j.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(j.a);
                printWriter.print(" mArgs=");
                printWriter.println(j.b);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(j.c);
                h0.r.b.b<D> bVar = j.c;
                String n02 = i0.d.a.a.a.n0(str2, "  ");
                h0.r.b.a aVar = (h0.r.b.a) bVar;
                Objects.requireNonNull(aVar);
                printWriter.print(n02);
                printWriter.print("mId=");
                printWriter.print(aVar.a);
                printWriter.print(" mListener=");
                printWriter.println(aVar.b);
                if (aVar.c || aVar.f) {
                    printWriter.print(n02);
                    printWriter.print("mStarted=");
                    printWriter.print(aVar.c);
                    printWriter.print(" mContentChanged=");
                    printWriter.print(aVar.f);
                    printWriter.print(" mProcessingChange=");
                    printWriter.println(false);
                }
                if (aVar.d || aVar.e) {
                    printWriter.print(n02);
                    printWriter.print("mAbandoned=");
                    printWriter.print(aVar.d);
                    printWriter.print(" mReset=");
                    printWriter.println(aVar.e);
                }
                if (aVar.h != null) {
                    printWriter.print(n02);
                    printWriter.print("mTask=");
                    printWriter.print(aVar.h);
                    printWriter.print(" waiting=");
                    Objects.requireNonNull(aVar.h);
                    printWriter.println(false);
                }
                if (aVar.i != null) {
                    printWriter.print(n02);
                    printWriter.print("mCancellingTask=");
                    printWriter.print(aVar.i);
                    printWriter.print(" waiting=");
                    Objects.requireNonNull(aVar.i);
                    printWriter.println(false);
                }
                if (j.e != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(j.e);
                    C0062b<D> bVar2 = j.e;
                    Objects.requireNonNull(bVar2);
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(bVar2.c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                h0.r.b.b<D> bVar3 = j.c;
                Object value = j.getValue();
                Objects.requireNonNull(bVar3);
                StringBuilder sb = new StringBuilder(64);
                g0.a.b.b.a.f(value, sb);
                sb.append("}");
                printWriter.println(sb.toString());
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(j.hasActiveObservers());
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        g0.a.b.b.a.f(this.a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
