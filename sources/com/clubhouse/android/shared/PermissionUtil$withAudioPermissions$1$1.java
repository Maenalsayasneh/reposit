package com.clubhouse.android.shared;

import androidx.fragment.app.Fragment;
import com.afollestad.assent.AssentResult;
import com.afollestad.assent.GrantResult;
import com.afollestad.assent.Permission;
import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.analytics.AmplitudeAnalytics$setMicrophonePermissionsGranted$1;
import com.clubhouse.core.ui.R;
import h0.b.a.d;
import h0.b0.v;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: PermissionUtil.kt */
public final class PermissionUtil$withAudioPermissions$1$1 extends Lambda implements l<AssentResult, i> {
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ a<i> d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PermissionUtil$withAudioPermissions$1$1(Fragment fragment, a<i> aVar) {
        super(1);
        this.c = fragment;
        this.d = aVar;
    }

    public Object invoke(Object obj) {
        AssentResult assentResult = (AssentResult) obj;
        m0.n.b.i.e(assentResult, "it");
        boolean z = assentResult.a(Permission.RECORD_AUDIO) == GrantResult.GRANTED;
        AmplitudeAnalytics amplitudeAnalytics = (AmplitudeAnalytics) v.l(this.c);
        Objects.requireNonNull(amplitudeAnalytics);
        amplitudeAnalytics.c(new AmplitudeAnalytics$setMicrophonePermissionsGranted$1(z));
        if (z) {
            this.d.invoke();
        } else {
            Fragment fragment = this.c;
            PermissionUtil$showAudioPermanentlyDeniedDialog$1 permissionUtil$showAudioPermanentlyDeniedDialog$1 = new PermissionUtil$showAudioPermanentlyDeniedDialog$1(fragment);
            m0.n.b.i.e(fragment, "<this>");
            m0.n.b.i.e(permissionUtil$showAudioPermanentlyDeniedDialog$1, "f");
            d.a aVar = new d.a(fragment.requireContext(), R.style.Clubhouse_AlertDialog_Rounded);
            permissionUtil$showAudioPermanentlyDeniedDialog$1.invoke(aVar);
            aVar.g();
        }
        return i.a;
    }
}
