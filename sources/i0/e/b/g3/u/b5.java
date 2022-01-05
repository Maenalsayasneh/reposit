package i0.e.b.g3.u;

import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse;
import com.clubhouse.android.data.models.remote.response.GetProfileResponse;
import i0.b.b.b;
import java.util.List;

/* compiled from: ProfileViewModel.kt */
public interface b5 {
    boolean a();

    boolean b();

    FollowNotificationType c();

    List<UserInList> d();

    boolean e();

    EventInProfile f();

    boolean g();

    boolean getLoading();

    b<GetProfileResponse> getRequest();

    boolean h();

    boolean i();

    Integer j();

    UserProfile k();

    b<GetCanCreateClubResponse> l();
}
