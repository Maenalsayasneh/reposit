package i0.j.e.m0.e;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.instabug.library.Instabug;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.operation.DeleteUriDiskOperation;
import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import com.instabug.library.invocation.invocationdialog.InstabugDialogItem;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.InstabugSDKLogger;

/* compiled from: InstabugDialogActivityPresenter */
public class d extends BasePresenter<b> implements BaseContract.Presenter {
    public final b c;
    public InstabugDialogItem d;
    public Handler q;
    public int x;
    public int y;

    public d(b bVar) {
        super(bVar);
        this.c = bVar;
        this.x = bVar.getFadeInAnimation();
        this.y = bVar.getSlidOutLeftAnimation();
        SettingsManager.getInstance().setProcessingForeground(false);
    }

    public void k(Uri... uriArr) {
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext != null) {
            DiskUtils with = DiskUtils.with(applicationContext);
            for (Uri deleteUriDiskOperation : uriArr) {
                with.deleteOperation(new DeleteUriDiskOperation(deleteUriDiskOperation)).executeAsync((DiskOperationCallback<Boolean>) null);
            }
            return;
        }
        InstabugSDKLogger.w("InstabugDialogActivityPresenter", "Can't execute dumpAttachments() due to null context");
    }

    public boolean m() {
        return this.d != null;
    }
}
