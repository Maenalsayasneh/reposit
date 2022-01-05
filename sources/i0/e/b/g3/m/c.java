package i0.e.b.g3.m;

import android.net.Uri;
import com.clubhouse.android.ui.common.PhotoCreationFragment;
import com.clubhouse.android.ui.common.PhotoCreationFragment$getCameraImage$1$1;
import h0.a.f.a;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class c implements a {
    public final /* synthetic */ PhotoCreationFragment a;

    public /* synthetic */ c(PhotoCreationFragment photoCreationFragment) {
        this.a = photoCreationFragment;
    }

    public final void onActivityResult(Object obj) {
        PhotoCreationFragment photoCreationFragment = this.a;
        Boolean bool = (Boolean) obj;
        int i = PhotoCreationFragment.q;
        i.e(photoCreationFragment, "this$0");
        i.d(bool, "success");
        if (bool.booleanValue()) {
            Uri uri = photoCreationFragment.x;
            if (uri == null) {
                v.f2(photoCreationFragment, PhotoCreationFragment$getCameraImage$1$1.c);
            } else {
                photoCreationFragment.O0(uri);
            }
        }
    }
}
