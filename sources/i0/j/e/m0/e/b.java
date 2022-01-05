package i0.j.e.m0.e;

import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.invocation.invocationdialog.InstabugDialogItem;
import h0.b.a.e;
import java.util.ArrayList;

/* compiled from: InstabugDialogActivityContract */
public interface b extends BaseContract.View<e> {
    int getFadeInAnimation();

    int getSlidInLeftAnimation();

    int getSlidInRightAnimation();

    int getSlidOutLeftAnimation();

    int getSlidOutRightAnimation();

    void onInitialScreenShotNotRequired();

    void setContent(String str, ArrayList<InstabugDialogItem> arrayList);
}
