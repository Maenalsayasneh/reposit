package com.clubhouse.android.shared;

import androidx.fragment.app.Fragment;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.f3.b;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PermissionUtil.kt */
public final class PermissionUtil$showContactsPermanentlyDeniedDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ Fragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PermissionUtil$showContactsPermanentlyDeniedDialog$1(Fragment fragment) {
        super(1);
        this.c = fragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        a.j(aVar, "$this$alertDialog", R.string.contacts_permission_prompt_title, R.string.contacts_permission_prompt_explanation);
        aVar.d(R.string.go_to_settings, new b(this.c));
        return i.a;
    }
}
