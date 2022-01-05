package com.instabug.library.internal.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.util.Log;
import com.instabug.library.Instabug;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.executor.DeleteOperationExecutor;
import com.instabug.library.internal.storage.executor.ReadOperationExecutor;
import com.instabug.library.internal.storage.executor.WriteOperationExecutor;
import com.instabug.library.internal.storage.operation.DiskOperation;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

@SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
public final class DiskUtils {
    public static final String TAG = "DiskUtils";
    private final Context context;

    public static class a implements Runnable {
        public final /* synthetic */ String c;

        public a(String str) {
            this.c = str;
        }

        public void run() {
            new File(this.c).delete();
        }
    }

    public static class b implements FilenameFilter {
        public boolean accept(File file, String str) {
            return str.startsWith("files:crash_state:") && str.endsWith(".txt");
        }
    }

    private DiskUtils(Context context2) {
        this.context = context2;
    }

    public static void cleanDirectory(File file) {
        File[] listFiles;
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                if (file2.delete()) {
                    StringBuilder P0 = i0.d.a.a.a.P0("file deleted successfully, path: ");
                    P0.append(file2.getPath());
                    P0.append(", time in MS: ");
                    P0.append(System.currentTimeMillis());
                    InstabugSDKLogger.v(DiskUtils.class, P0.toString());
                }
            }
        }
    }

    @SuppressLint({"RESOURCE_LEAK"})
    public static void copyFromUriIntoFile(Context context2, Uri uri, File file) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(context2.getContentResolver().openInputStream(uri));
        StringBuilder P0 = i0.d.a.a.a.P0("Target file path: ");
        P0.append(file.getPath());
        InstabugSDKLogger.d("DiskUtils", P0.toString());
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(context2.getContentResolver().openOutputStream(Uri.fromFile(file)));
        byte[] bArr = new byte[32768];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read > 0) {
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.close();
                bufferedInputStream.close();
                return;
            }
        }
    }

    public static File createStateTextFile(Context context2) {
        StringBuilder sb = new StringBuilder();
        sb.append(context2.getFilesDir().getAbsolutePath());
        String str = File.pathSeparator;
        sb.append(str);
        sb.append(InstabugDbContract.CrashEntry.COLUMN_CRASH_STATE);
        sb.append(str);
        sb.append(System.currentTimeMillis());
        sb.append(".txt");
        return new File(sb.toString());
    }

    public static void deleteFile(String str) {
        PoolProvider.postIOTask(new a(str));
    }

    public static void deleteStateFiles() {
        File[] listFiles;
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext != null) {
            File parentFile = applicationContext.getFilesDir().getParentFile();
            b bVar = new b();
            if (parentFile != null && (listFiles = parentFile.listFiles(bVar)) != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        }
    }

    public static synchronized File getInsatbugLogDirectory(String str, Context context2) {
        File file;
        synchronized (DiskUtils.class) {
            file = new File(getInstabugDirectory(context2).getAbsolutePath().concat("/").concat(str));
            if (!file.exists() && !file.mkdir()) {
                Log.w("DiskUtils", "failed logs directory to create");
            }
        }
        return file;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static File getInstabugDirectory(Context context2) {
        String str;
        if (context2.getExternalFilesDir((String) null) == null || !Environment.getExternalStorageState().equals("mounted")) {
            str = getInternalStoragePath(context2);
            InstabugSDKLogger.i("DiskUtils", "External storage not available, saving file to internal storage.");
        } else {
            try {
                str = context2.getExternalFilesDir((String) null).getAbsolutePath();
            } catch (NullPointerException unused) {
                str = getInternalStoragePath(context2);
                InstabugSDKLogger.w("DiskUtils", "External storage not available, saving file to internal storage.");
            }
        }
        File file = new File(i0.d.a.a.a.n0(str, "/instabug/"));
        if (!file.exists() && file.mkdirs()) {
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    private static String getInternalStoragePath(Context context2) {
        return context2.getFilesDir().getAbsolutePath();
    }

    public static boolean isFileExist(String str) {
        return new File(str).exists();
    }

    public static void saveBitmapOnDisk(Bitmap bitmap, File file) throws IOException {
        Class<DiskUtils> cls = DiskUtils.class;
        if (bitmap != null && file != null) {
            StringBuilder P0 = i0.d.a.a.a.P0("starting save viewHierarchy image, path: ");
            P0.append(file.getAbsolutePath());
            P0.append(", time in MS: ");
            P0.append(System.currentTimeMillis());
            InstabugSDKLogger.addVerboseLog(cls, P0.toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            InstabugSDKLogger.addVerboseLog(cls, "viewHierarchy image saved, path: " + file.getAbsolutePath() + ", time in MS: " + System.currentTimeMillis());
        }
    }

    public static DiskUtils with(Context context2) {
        return new DiskUtils(context2);
    }

    public DeleteOperationExecutor deleteOperation(DiskOperation<Boolean, Void> diskOperation) {
        return new DeleteOperationExecutor(diskOperation);
    }

    public ReadOperationExecutor readOperation(DiskOperation<String, Void> diskOperation) {
        return new ReadOperationExecutor(diskOperation);
    }

    public WriteOperationExecutor writeOperation(DiskOperation<Uri, Context> diskOperation) {
        return new WriteOperationExecutor(this.context, diskOperation);
    }
}
