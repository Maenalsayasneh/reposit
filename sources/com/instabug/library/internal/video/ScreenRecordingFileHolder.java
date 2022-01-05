package com.instabug.library.internal.video;

import android.net.Uri;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;

public class ScreenRecordingFileHolder {
    private static final ScreenRecordingFileHolder INSTANCE = new ScreenRecordingFileHolder();
    private File autoScreenRecordingFile;

    public static ScreenRecordingFileHolder getInstance() {
        return INSTANCE;
    }

    public void clear() {
        this.autoScreenRecordingFile = null;
    }

    public boolean delete() {
        File file = this.autoScreenRecordingFile;
        if (file == null) {
            return true;
        }
        if (!file.delete()) {
            return false;
        }
        InstabugSDKLogger.d(this, "Screen recording file deleted");
        return true;
    }

    public Uri getAutoScreenRecordingFileUri() {
        File file = this.autoScreenRecordingFile;
        if (file != null) {
            return Uri.fromFile(file);
        }
        return null;
    }

    public void setAutoScreenRecordingFile(File file) {
        this.autoScreenRecordingFile = file;
    }
}
