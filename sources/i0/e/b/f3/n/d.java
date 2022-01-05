package i0.e.b.f3.n;

import android.app.Activity;
import android.view.View;
import com.clubhouse.android.data.models.remote.response.GetReleaseNotesResponse;
import com.clubhouse.android.shared.update.UpdatesCoordinator;
import com.clubhouse.app.R;
import i0.e.b.a3.f.e;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class d implements View.OnClickListener {
    public final /* synthetic */ UpdatesCoordinator c;
    public final /* synthetic */ GetReleaseNotesResponse d;

    public /* synthetic */ d(UpdatesCoordinator updatesCoordinator, GetReleaseNotesResponse getReleaseNotesResponse) {
        this.c = updatesCoordinator;
        this.d = getReleaseNotesResponse;
    }

    public final void onClick(View view) {
        UpdatesCoordinator updatesCoordinator = this.c;
        GetReleaseNotesResponse getReleaseNotesResponse = this.d;
        i.e(updatesCoordinator, "this$0");
        i.e(getReleaseNotesResponse, "$releaseNotesResponse");
        Activity activity = updatesCoordinator.a;
        String str = getReleaseNotesResponse.d;
        if (str == null) {
            str = activity.getString(R.string.clubhouse_whats_new);
            i.d(str, "activity.getString(R.string.clubhouse_whats_new)");
        }
        e.a(activity, str);
    }
}
