package i0.e.b.g3.u.y5;

import android.net.Uri;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyFragment;
import h0.a.f.a;
import h0.b0.v;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class x implements a {
    public final /* synthetic */ ReportProfileLegacyFragment a;

    public /* synthetic */ x(ReportProfileLegacyFragment reportProfileLegacyFragment) {
        this.a = reportProfileLegacyFragment;
    }

    public final void onActivityResult(Object obj) {
        ReportProfileLegacyFragment reportProfileLegacyFragment = this.a;
        Uri uri = (Uri) obj;
        ReportProfileLegacyFragment.a aVar = ReportProfileLegacyFragment.Z1;
        i.e(reportProfileLegacyFragment, "this$0");
        if (uri != null) {
            CardView cardView = reportProfileLegacyFragment.N0().a;
            i.d(cardView, "binding.attachImage");
            k.p(cardView);
            ImageView imageView = reportProfileLegacyFragment.N0().b;
            i.d(imageView, "binding.attachedImage");
            k.K(imageView);
            ImageView imageView2 = reportProfileLegacyFragment.N0().b;
            i.d(imageView2, "binding.attachedImage");
            v.P0(imageView2, uri);
            reportProfileLegacyFragment.O0().p(new d0(uri));
        }
    }
}
