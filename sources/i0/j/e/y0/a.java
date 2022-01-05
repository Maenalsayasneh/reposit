package i0.j.e.y0;

import android.annotation.SuppressLint;
import android.hardware.display.VirtualDisplay;
import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.os.Handler;

/* compiled from: ScreenshotCaptureService */
public class a extends MediaProjection.Callback {
    public final /* synthetic */ VirtualDisplay a;
    public final /* synthetic */ ImageReader b;
    public final /* synthetic */ MediaProjection c;

    public a(VirtualDisplay virtualDisplay, ImageReader imageReader, MediaProjection mediaProjection) {
        this.a = virtualDisplay;
        this.b = imageReader;
        this.c = mediaProjection;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void onStop() {
        super.onStop();
        VirtualDisplay virtualDisplay = this.a;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        this.b.setOnImageAvailableListener((ImageReader.OnImageAvailableListener) null, (Handler) null);
        this.c.unregisterCallback(this);
    }
}
