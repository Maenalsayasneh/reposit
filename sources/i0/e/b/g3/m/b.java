package i0.e.b.g3.m;

import android.net.Uri;
import androidx.core.app.ActivityOptionsCompat;
import com.clubhouse.android.ui.common.PhotoCreationFragment;
import h0.a.f.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b implements a {
    public final /* synthetic */ PhotoCreationFragment a;

    public /* synthetic */ b(PhotoCreationFragment photoCreationFragment) {
        this.a = photoCreationFragment;
    }

    public final void onActivityResult(Object obj) {
        PhotoCreationFragment photoCreationFragment = this.a;
        int i = PhotoCreationFragment.q;
        i.e(photoCreationFragment, "this$0");
        Collection values = ((Map) obj).values();
        boolean z = true;
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator it = values.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!i.a((Boolean) it.next(), Boolean.TRUE)) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z) {
            Uri L0 = photoCreationFragment.L0();
            photoCreationFragment.x = L0;
            photoCreationFragment.y.a(L0, (ActivityOptionsCompat) null);
        }
    }
}
