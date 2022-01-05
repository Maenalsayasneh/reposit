package com.afollestad.assent.internal;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.afollestad.assent.AssentResult;
import com.afollestad.assent.GrantResult;
import com.afollestad.assent.Permission;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import h0.b0.v;
import h0.o.a.k;
import i0.a.a.d;
import i0.a.a.e.a;
import i0.a.a.e.b;
import i0.a.a.f.c;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/afollestad/assent/internal/PermissionFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", "context", "Lm0/i;", "onAttach", "(Landroid/content/Context;)V", "onDetach", "()V", "Li0/a/a/e/a;", "request", "I0", "(Li0/a/a/e/a;)V", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "<init>", "core"}, k = 1, mv = {1, 4, 0})
/* compiled from: PermissionFragment.kt */
public final class PermissionFragment extends Fragment {
    public final void I0(a aVar) {
        i.f(aVar, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        i.f(this, "$this$log");
        i.f("perform(%s)", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        i.f(new Object[]{aVar}, "args");
        Set<Permission> set = aVar.a;
        i.f(set, "$this$allValues");
        ArrayList arrayList = new ArrayList(h.K(set, 10));
        for (Permission value : set) {
            arrayList.add(value.getValue());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            requestPermissions((String[]) array, aVar.b);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public void onAttach(Context context) {
        i.f(context, "context");
        super.onAttach(context);
        i.f(this, "$this$log");
        i.f("onAttach(%s)", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        i.f(new Object[]{context}, "args");
    }

    public void onDetach() {
        i.f(this, "$this$log");
        i.f("onDetach()", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        i.f(new Object[0], "args");
        super.onDetach();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        boolean z;
        Object w;
        GrantResult grantResult;
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        i.f(strArr2, "permissions");
        i.f(iArr2, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        i.f(this, "$this$onPermissionsResponse");
        i.f(strArr2, "permissions");
        i.f(iArr2, "grantResults");
        k activity = getActivity();
        if (activity != null) {
            i.b(activity, "activity ?: error(\"Fragm… is not attached: $this\")");
            c cVar = new c(activity, new d(activity));
            i.f(strArr2, "$this$toPermissions");
            ArrayList arrayList = new ArrayList(strArr2.length);
            for (String a : strArr2) {
                arrayList.add(Permission.Companion.a(a));
            }
            Set D0 = g.D0(arrayList);
            i.f(D0, "permissions");
            i.f(iArr2, "grantResults");
            i.f(cVar, "shouldShowRationale");
            i.f(iArr2, "$this$mapGrantResults");
            i.f(D0, "permissions");
            i.f(cVar, "shouldShowRationale");
            ArrayList arrayList2 = new ArrayList(iArr2.length);
            int length = iArr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                int i4 = iArr2[i2];
                int i5 = i3 + 1;
                Permission permission = (Permission) g.n(D0, i3);
                i.f(permission, "forPermission");
                i.f(cVar, "shouldShowRationale");
                if (cVar.b(permission)) {
                    grantResult = GrantResult.PERMANENTLY_DENIED;
                } else if (i4 != 0) {
                    grantResult = GrantResult.DENIED;
                } else {
                    grantResult = GrantResult.GRANTED;
                }
                arrayList2.add(grantResult);
                i2++;
                i3 = i5;
            }
            i.f(D0, "permissions");
            i.f(arrayList2, "grantResults");
            ArrayList arrayList3 = new ArrayList(h.K(D0, 10));
            int i6 = 0;
            for (Object next : D0) {
                int i7 = i6 + 1;
                if (i6 >= 0) {
                    arrayList3.add(new Pair((Permission) next, arrayList2.get(i6)));
                    i6 = i7;
                } else {
                    g.r0();
                    throw null;
                }
            }
            AssentResult assentResult = new AssentResult(g.w0(arrayList3));
            i.f(this, "$this$log");
            i.f("onPermissionsResponse(): %s", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            i.f(new Object[]{assentResult}, "args");
            Assent assent = Assent.a;
            a aVar = Assent.b().e;
            if (aVar == null) {
                i.f(this, "$this$warn");
                i.f("onPermissionsResponse() called but there's no current pending request.", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
                i.f(new Object[0], "args");
                return;
            }
            Set<Permission> set = aVar.a;
            i.f(set, "$this$equalsStrings");
            i.f(strArr2, "strings");
            if (set.size() == strArr2.length) {
                Iterator<T> it = set.iterator();
                int i8 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    } else if (!i.a(((Permission) it.next()).getValue(), strArr2[i8])) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            z = false;
            if (z) {
                List<l<AssentResult, m0.i>> list = aVar.c;
                i.f(list, "$this$invokeAll");
                i.f(assentResult, "result");
                for (l<AssentResult, m0.i> invoke : list) {
                    invoke.invoke(assentResult);
                }
                Assent assent2 = Assent.a;
                Assent.b().e = null;
                if (!Assent.b().d.a.isEmpty()) {
                    b<a> bVar = Assent.b().d;
                    synchronized (bVar.b) {
                        w = g.w(bVar.a);
                        if (w != null) {
                            bVar.a.remove(0);
                        } else {
                            throw new IllegalStateException("Queue is empty, cannot pop.".toString());
                        }
                    }
                    a aVar2 = (a) w;
                    Assent.b().e = aVar2;
                    i.f(this, "$this$log");
                    i.f("Executing next request in the queue: %s", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
                    i.f(new Object[]{aVar2}, "args");
                    Assent.a(this).I0(aVar2);
                    return;
                }
                i.f(this, "$this$log");
                i.f("Nothing more in the queue to execute, forgetting the PermissionFragment.", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
                i.f(new Object[0], "args");
                Assent b = Assent.b();
                i.f(b, "$this$log");
                i.f("forgetFragment()", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
                i.f(new Object[0], "args");
                PermissionFragment permissionFragment = b.f;
                if (permissionFragment != null) {
                    if (permissionFragment.getParentFragment() != null) {
                        Object[] objArr = {permissionFragment.getParentFragment()};
                        i.f(permissionFragment, "$this$log");
                        i.f("Detaching PermissionFragment from parent Fragment %s", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
                        i.f(objArr, "args");
                        Fragment parentFragment = permissionFragment.getParentFragment();
                        if (parentFragment != null) {
                            v.n2(parentFragment, new a0(0, permissionFragment));
                        }
                    } else if (permissionFragment.getActivity() != null) {
                        Object[] objArr2 = {permissionFragment.getActivity()};
                        i.f(permissionFragment, "$this$log");
                        i.f("Detaching PermissionFragment from Activity %s", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
                        i.f(objArr2, "args");
                        k activity2 = permissionFragment.getActivity();
                        if (activity2 != null) {
                            v.o2(activity2, new a0(1, permissionFragment));
                        }
                    }
                }
                b.f = null;
                return;
            }
            i.f(this, "$this$warn");
            i.f("onPermissionsResponse() called with a result that doesn't match the current pending request.", InstabugDbContract.BugEntry.COLUMN_MESSAGE);
            i.f(new Object[0], "args");
            return;
        }
        throw new IllegalStateException(("Fragment is not attached: " + this).toString());
    }
}
