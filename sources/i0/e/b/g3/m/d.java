package i0.e.b.g3.m;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.ActivityOptionsCompat;
import com.clubhouse.android.ui.common.PhotoCreationFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {
    public final /* synthetic */ PhotoCreationFragment c;

    public /* synthetic */ d(PhotoCreationFragment photoCreationFragment) {
        this.c = photoCreationFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        PhotoCreationFragment photoCreationFragment = this.c;
        i.e(photoCreationFragment, "this$0");
        if (i != 0) {
            photoCreationFragment.Y1.a("image/*", (ActivityOptionsCompat) null);
        } else if (Build.VERSION.SDK_INT >= 29) {
            int i2 = PhotoCreationFragment.q;
            Uri L0 = photoCreationFragment.L0();
            photoCreationFragment.x = L0;
            photoCreationFragment.y.a(L0, (ActivityOptionsCompat) null);
        } else {
            photoCreationFragment.Z1.a(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, (ActivityOptionsCompat) null);
        }
    }
}
