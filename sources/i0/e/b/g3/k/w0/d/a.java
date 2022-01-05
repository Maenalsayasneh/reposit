package i0.e.b.g3.k.w0.d;

import android.view.View;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.ui.channels.users.search.SearchInRoomFragment;

/* compiled from: lambda */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ SearchInRoomFragment c;
    public final /* synthetic */ UserInChannel d;

    public /* synthetic */ a(SearchInRoomFragment searchInRoomFragment, UserInChannel userInChannel) {
        this.c = searchInRoomFragment;
        this.d = userInChannel;
    }

    public final void onClick(View view) {
        SearchInRoomFragment.UserController.m25buildItemModel$lambda0(this.c, this.d, view);
    }
}
