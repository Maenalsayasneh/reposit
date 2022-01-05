package i0.e.b.g3.n;

import android.view.View;
import com.clubhouse.android.ui.creation.ChooseUsersFragment;
import i0.e.b.a3.d.a;

/* compiled from: lambda */
public final /* synthetic */ class b implements View.OnClickListener {
    public final /* synthetic */ ChooseUsersFragment c;
    public final /* synthetic */ a d;

    public /* synthetic */ b(ChooseUsersFragment chooseUsersFragment, a aVar) {
        this.c = chooseUsersFragment;
        this.d = aVar;
    }

    public final void onClick(View view) {
        ChooseUsersFragment.UserController.m29buildItemModel$lambda0(this.c, this.d, view);
    }
}
