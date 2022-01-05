package i0.j.e.q0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateUtils;
import android.util.Log;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.util.TimeUtils;
import com.instabug.library.util.memory.MemoryUtils;
import i0.j.e.l0.c.b;
import i0.j.e.t0.d;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* compiled from: LoggingFileProvider */
public class e {
    public File a;
    public File b;
    public WeakReference<Context> c;

    public e(Context context) {
        this.c = new WeakReference<>(context);
    }

    public static long b(File file) {
        if (file == null) {
            return -1;
        }
        try {
            String name = file.getName();
            if (name.contains(".txt")) {
                name = name.replace(".txt", "");
            }
            return Long.parseLong(name);
        } catch (Exception e) {
            Log.w("d", e.getMessage(), e);
            return -1;
        }
    }

    public static boolean d(File file) {
        return DateUtils.isToday(b(file));
    }

    public File a(File file) throws IOException {
        File file2 = new File(file.getAbsolutePath().concat("/").concat(String.valueOf(TimeUtils.currentTimeMillis()).concat(".txt")));
        if (file2.exists() || file2.createNewFile()) {
            return file2;
        }
        return null;
    }

    @SuppressLint({"THREAD_SAFETY_VIOLATION"})
    public void c() {
        Context context;
        File file;
        try {
            WeakReference<Context> weakReference = this.c;
            if (weakReference != null && (context = (Context) weakReference.get()) != null) {
                d a2 = b.c().a();
                if (!MemoryUtils.isLowMemory(context) && a2 != null && a2.d != 0) {
                    File insatbugLogDirectory = DiskUtils.getInsatbugLogDirectory("logs/", context);
                    this.b = insatbugLogDirectory;
                    File[] listFiles = insatbugLogDirectory.listFiles();
                    if (listFiles != null && listFiles.length > 0) {
                        int length = listFiles.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                file = a(insatbugLogDirectory);
                                break;
                            }
                            file = listFiles[i];
                            if (d(file)) {
                                break;
                            }
                            i++;
                        }
                    } else {
                        file = a(insatbugLogDirectory);
                    }
                    this.a = file;
                }
            }
        } catch (IOException e) {
            Log.w("d", e.getMessage(), e);
        }
    }
}
