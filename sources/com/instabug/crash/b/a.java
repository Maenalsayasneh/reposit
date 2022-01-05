package com.instabug.crash.b;

import android.net.Uri;
import com.instabug.library.internal.video.InternalAutoScreenRecorderHelper;
import com.instabug.library.internal.video.ScreenRecordingContract;

/* compiled from: ExternalAutoScreenRecordHelper */
public class a implements ScreenRecordingContract {
    public static a a;

    public static a a() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public void clear() {
        InternalAutoScreenRecorderHelper.getInstance().clear();
    }

    public void delete() {
        InternalAutoScreenRecorderHelper.getInstance().delete();
    }

    public Uri getAutoScreenRecordingFileUri() {
        return InternalAutoScreenRecorderHelper.getInstance().getAutoScreenRecordingFileUri();
    }

    public boolean isEnabled() {
        return InternalAutoScreenRecorderHelper.getInstance().isEnabled();
    }
}
