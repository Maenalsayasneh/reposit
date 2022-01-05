package i0.j.b.t.j.b;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.ProcessedBytes;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.DiskUtils;
import com.instabug.library.util.FileUtils;
import com.instabug.library.visualusersteps.VisualUserStep;
import com.instabug.library.visualusersteps.VisualUserStepsHelper;
import i0.j.b.p.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: VisualUserStepsListPresenter */
public class f implements Callable<ArrayList<b>> {
    public final /* synthetic */ Context c;
    public final /* synthetic */ h d;

    public f(h hVar, Context context) {
        this.d = hVar;
        this.c = context;
    }

    public Object call() throws Exception {
        String str;
        Objects.requireNonNull(this.d);
        ArrayList arrayList = new ArrayList();
        ArrayList<VisualUserStep> fetchSteps = VisualUserStepsHelper.fetchSteps();
        ArrayList<File> listFilesInDirectory = DiskUtils.listFilesInDirectory(VisualUserStepsHelper.getVisualUserStepsDirectory(InstabugInternalTrackingDelegate.getInstance().getTargetActivity()));
        Iterator<VisualUserStep> it = fetchSteps.iterator();
        int i = 1;
        while (it.hasNext()) {
            VisualUserStep next = it.next();
            if (next.getScreenshotId() != null) {
                String screenshotId = next.getScreenshotId();
                String substring = screenshotId.substring(0, FileUtils.getIndexOfExtension(screenshotId));
                Iterator<File> it2 = listFilesInDirectory.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        str = null;
                        break;
                    }
                    File next2 = it2.next();
                    if (next2.getPath().contains(substring)) {
                        str = next2.getPath();
                        break;
                    }
                }
                String str2 = str;
                if (str2 != null) {
                    boolean exists = new File(str2).exists();
                    if (!exists && next.getScreenshotId() != null) {
                        i++;
                    }
                    int i2 = i;
                    if (!(next.getScreenId() == null || next.getScreenshotId() == null || !exists)) {
                        ProcessedBytes decryptOnTheFly = InstabugCore.decryptOnTheFly(str2);
                        if (decryptOnTheFly.isProcessSuccessful()) {
                            byte[] fileBytes = decryptOnTheFly.getFileBytes();
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inSampleSize = 2;
                            arrayList.add(new b(i2, next.getScreenName(), next.getScreenshotId(), str2, BitmapFactory.decodeByteArray(fileBytes, 0, fileBytes.length, options)));
                            i = i2 + 1;
                        }
                    }
                    i = i2;
                }
            }
        }
        return arrayList;
    }
}
