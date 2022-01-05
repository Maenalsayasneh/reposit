package i0.e.b.f3;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import h0.b.a.d;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ Fragment c;

    public /* synthetic */ b(Fragment fragment) {
        this.c = fragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Fragment fragment = this.c;
        i.e(fragment, "$this_showContactsPermanentlyDeniedDialog");
        Objects.requireNonNull(dialogInterface, "null cannot be cast to non-null type androidx.appcompat.app.AlertDialog");
        ((d) dialogInterface).setOnDismissListener((DialogInterface.OnDismissListener) null);
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", fragment.requireContext().getPackageName(), (String) null));
        fragment.startActivity(intent);
    }
}
