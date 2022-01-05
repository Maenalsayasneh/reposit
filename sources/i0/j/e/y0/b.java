package i0.j.e.y0;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.media.Image;
import android.media.ImageReader;
import com.instabug.library.core.eventbus.ScreenCaptureEventBus;
import com.instabug.library.util.InstabugSDKLogger;
import i0.j.e.t0.e;
import java.nio.ByteBuffer;

/* compiled from: BitmapProviderRunnable */
public class b implements Runnable {
    public int c;
    public int d;
    public ImageReader q;

    public b(int i, int i2, ImageReader imageReader) {
        this.c = i;
        this.d = i2;
        this.q = imageReader;
    }

    public void run() {
        ImageReader imageReader;
        if (this.c != 0 && this.d != 0 && (imageReader = this.q) != null) {
            Bitmap bitmap = null;
            try {
                Image acquireLatestImage = imageReader.acquireLatestImage();
                Image.Plane[] planes = acquireLatestImage.getPlanes();
                ByteBuffer buffer = planes[0].getBuffer();
                int pixelStride = planes[0].getPixelStride();
                int rowStride = planes[0].getRowStride();
                int i = this.c;
                Bitmap createBitmap = Bitmap.createBitmap(i + ((rowStride - (pixelStride * i)) / pixelStride), this.d, Bitmap.Config.ARGB_8888);
                createBitmap.copyPixelsFromBuffer(buffer);
                Rect cropRect = acquireLatestImage.getCropRect();
                Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, cropRect.left, cropRect.top, cropRect.width(), cropRect.height());
                if (createBitmap2 != null) {
                    ScreenCaptureEventBus.getInstance().post(new e(0, createBitmap2));
                } else {
                    ScreenCaptureEventBus.getInstance().post(new e(1, (Throwable) new Exception("Failed to capture screenshot using media projection ")));
                }
            } catch (Exception e) {
                if (bitmap != null) {
                    bitmap.recycle();
                }
                InstabugSDKLogger.e("BitmapProviderRunnable", "Error occurred while processing the taken screenshot ", e);
            } finally {
                this.q.close();
            }
        }
    }
}
