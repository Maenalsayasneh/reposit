package com.clubhouse.android.shared;

import androidx.fragment.app.Fragment;
import com.afollestad.assent.AssentResult;
import com.afollestad.assent.GrantResult;
import com.afollestad.assent.Permission;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: PermissionUtil.kt */
public final class PermissionUtil$withContactsPermissions$1 extends Lambda implements l<AssentResult, i> {
    public final /* synthetic */ a<i> c;
    public final /* synthetic */ Fragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PermissionUtil$withContactsPermissions$1(a<i> aVar, Fragment fragment) {
        super(1);
        this.c = aVar;
        this.d = fragment;
    }

    public Object invoke(Object obj) {
        AssentResult assentResult = (AssentResult) obj;
        m0.n.b.i.e(assentResult, "it");
        if (assentResult.a(Permission.READ_CONTACTS) == GrantResult.GRANTED) {
            this.c.invoke();
        } else {
            Fragment fragment = this.d;
            PermissionUtil$showContactsPermanentlyDeniedDialog$1 permissionUtil$showContactsPermanentlyDeniedDialog$1 = new PermissionUtil$showContactsPermanentlyDeniedDialog$1(fragment);
            m0.n.b.i.e(fragment, "<this>");
            m0.n.b.i.e(permissionUtil$showContactsPermanentlyDeniedDialog$1, "f");
            d.a aVar = new d.a(fragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            permissionUtil$showContactsPermanentlyDeniedDialog$1.invoke(aVar);
            aVar.g();
        }
        return i.a;
    }
}
