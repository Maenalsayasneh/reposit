package com.instabug.library.visualusersteps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.storage.AttachmentManager;
import com.instabug.library.internal.storage.ProcessedBytes;
import com.instabug.library.internal.storage.ProcessedUri;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.DiskUtils;
import com.instabug.library.util.FileUtils;
import i0.j.e.f1.c;
import i0.j.e.f1.n;
import io.reactivex.plugins.RxJavaPlugins;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import k0.b.l;
import k0.b.z.e.c.h;

public class VisualUserStepsHelper {

    public static class a implements Callable<ProcessedUri> {
        public final /* synthetic */ Context c;
        public final /* synthetic */ String d;

        public a(Context context, String str) {
            this.c = context;
            this.d = str;
        }

        public Object call() throws Exception {
            return VisualUserStepsHelper.getVisualUserStepsFile(this.c, this.d);
        }
    }

    public static Bitmap decryptBitmap(String str) {
        n k = n.k();
        String replace = str.replace(FileUtils.FLAG_ENCRYPTED, "");
        Objects.requireNonNull(k);
        ProcessedBytes decryptOnTheFly = InstabugCore.decryptOnTheFly(replace);
        byte[] fileBytes = decryptOnTheFly.isProcessSuccessful() ? decryptOnTheFly.getFileBytes() : new byte[0];
        return BitmapFactory.decodeByteArray(fileBytes, 0, fileBytes.length);
    }

    public static ArrayList<VisualUserStep> fetchSteps() {
        return n.k().g();
    }

    public static File getVisualUserStepsDirectory(Context context) {
        return AttachmentManager.getNewDirectory(context, "vusf");
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static ProcessedUri getVisualUserStepsFile(Context context, String str) {
        File visualUserStepsDirectory = getVisualUserStepsDirectory(InstabugInternalTrackingDelegate.getInstance().getTargetActivity());
        ArrayList<File> listFilesInDirectory = DiskUtils.listFilesInDirectory(visualUserStepsDirectory);
        Iterator<File> it = listFilesInDirectory.iterator();
        while (it.hasNext()) {
            File next = it.next();
            if (FileUtils.isEncryptedFile(next.getPath())) {
                InstabugCore.decrypt(next.getPath());
            }
        }
        ArrayList<File> listFilesInDirectory2 = DiskUtils.listFilesInDirectory(visualUserStepsDirectory);
        Uri zipFiles = DiskUtils.zipFiles(context, "usersteps_" + str, listFilesInDirectory2);
        boolean encrypt = (zipFiles == null || zipFiles.getPath() == null) ? false : InstabugCore.encrypt(zipFiles.getPath());
        Iterator<File> it2 = listFilesInDirectory.iterator();
        while (it2.hasNext()) {
            File next2 = it2.next();
            if (!FileUtils.isEncryptedFile(next2.getPath())) {
                InstabugCore.encrypt(next2.getPath());
            }
        }
        return new ProcessedUri(zipFiles, encrypt);
    }

    public static l<ProcessedUri> getVisualUserStepsFileObservable(Context context, String str) {
        return RxJavaPlugins.onAssembly(new h(new a(context, str)));
    }

    public static void removeScreenshotId(String str) {
        String str2;
        for (c next : n.k().c.a) {
            c.a aVar = next.d;
            if (aVar != null && (str2 = aVar.a) != null && str2.equals(str)) {
                next.d.a = null;
                return;
            }
        }
    }
}
