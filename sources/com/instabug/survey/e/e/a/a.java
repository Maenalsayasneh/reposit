package com.instabug.survey.e.e.a;

import android.os.Bundle;
import android.view.View;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BaseContract.Presenter;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.survey.R;
import com.instabug.survey.announcements.ui.activity.AnnouncementActivity;
import com.instabug.survey.e.c.c;
import i0.j.f.s.e.b;

/* compiled from: AnnouncementItemFragment */
public abstract class a<P extends BaseContract.Presenter> extends InstabugBaseFragment<P> {
    public c c;
    public com.instabug.survey.e.c.a d;

    public void initViews(View view, Bundle bundle) {
        if (getActivity() instanceof AnnouncementActivity) {
            AnnouncementActivity announcementActivity = (AnnouncementActivity) getActivity();
            announcementActivity.getWindow().getDecorView().setBackgroundColor(h0.i.b.a.getColor(announcementActivity, R.color.instabug_dialog_bg_color));
        }
    }

    public void onCreate(Bundle bundle) {
        if (getActivity() instanceof AnnouncementActivity) {
            this.d = ((AnnouncementActivity) getActivity()).q;
        }
        super.onCreate(bundle);
    }

    public void onDestroy() {
        b.f = null;
        super.onDestroy();
    }

    public void onResume() {
        P p;
        super.onResume();
        if (!(getActivity() == null || !(getActivity() instanceof AnnouncementActivity) || (p = ((AnnouncementActivity) getActivity()).presenter) == null)) {
            ((i0.j.f.b.c.a.c) p).l(false);
        }
        b.c = -1;
        b.b = -1.0f;
    }
}
