package i0.e.b.g3.u.y5;

import android.net.Uri;
import android.view.MenuItem;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.clubhouse.android.ui.profile.reports.ReportProfileLegacyFragment;
import h0.b.f.m0;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class b0 implements m0.a {
    public final /* synthetic */ ReportProfileLegacyFragment a;

    public /* synthetic */ b0(ReportProfileLegacyFragment reportProfileLegacyFragment) {
        this.a = reportProfileLegacyFragment;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        ReportProfileLegacyFragment reportProfileLegacyFragment = this.a;
        i.e(reportProfileLegacyFragment, "this$0");
        ImageView imageView = reportProfileLegacyFragment.N0().b;
        i.d(imageView, "binding.attachedImage");
        k.p(imageView);
        CardView cardView = reportProfileLegacyFragment.N0().a;
        i.d(cardView, "binding.attachImage");
        k.K(cardView);
        reportProfileLegacyFragment.N0().b.setImageURI((Uri) null);
        return true;
    }
}
