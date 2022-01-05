package i0.j.e;

import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.util.DiskUtils;
import com.instabug.library.util.FileUtils;
import java.io.File;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: InstabugDelegate */
public class s implements Runnable {
    public final /* synthetic */ i c;

    public s(i iVar) {
        this.c = iVar;
    }

    public void run() {
        Objects.requireNonNull(this.c);
        if (Instabug.getApplicationContext() != null) {
            Iterator<File> it = DiskUtils.listFilesInDirectory(com.instabug.library.internal.storage.DiskUtils.getInstabugDirectory(Instabug.getApplicationContext())).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (FileUtils.isFileRelatedToBugOrCrashReport(next.getPath())) {
                    next.delete();
                }
            }
            InstabugCore.setFirstRunAfterEncryptorUpdate(false);
        }
    }
}
