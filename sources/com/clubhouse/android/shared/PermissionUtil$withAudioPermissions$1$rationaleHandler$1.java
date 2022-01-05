package com.clubhouse.android.shared;

import androidx.fragment.app.Fragment;
import com.afollestad.assent.Permission;
import com.afollestad.assent.rationale.RationaleHandler;
import com.clubhouse.app.R;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: PermissionUtil.kt */
public final class PermissionUtil$withAudioPermissions$1$rationaleHandler$1 extends Lambda implements l<RationaleHandler, i> {
    public final /* synthetic */ Fragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PermissionUtil$withAudioPermissions$1$rationaleHandler$1(Fragment fragment) {
        super(1);
        this.c = fragment;
    }

    public Object invoke(Object obj) {
        RationaleHandler rationaleHandler = (RationaleHandler) obj;
        m0.n.b.i.e(rationaleHandler, "$this$createDialogRationale");
        Permission permission = Permission.RECORD_AUDIO;
        String string = this.c.getString(R.string.microphone_permission_prompt_explanation);
        m0.n.b.i.d(string, "getString(R.string.microphone_permission_prompt_explanation)");
        m0.n.b.i.f(permission, "permission");
        m0.n.b.i.f(string, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        rationaleHandler.b.put(permission, string);
        return i.a;
    }
}
