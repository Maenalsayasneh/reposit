package i0.e.b.g3.m;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.clubhouse.android.ui.common.PhotoCreationFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class a implements h0.a.f.a {
    public final /* synthetic */ PhotoCreationFragment a;

    public /* synthetic */ a(PhotoCreationFragment photoCreationFragment) {
        this.a = photoCreationFragment;
    }

    public final void onActivityResult(Object obj) {
        PhotoCreationFragment photoCreationFragment = this.a;
        Uri uri = (Uri) obj;
        int i = PhotoCreationFragment.q;
        i.e(photoCreationFragment, "this$0");
        if (uri != null) {
            i.d(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            photoCreationFragment.O0(uri);
        }
    }
}
