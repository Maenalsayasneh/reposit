package i0.h.c.t;

import android.graphics.Bitmap;
import android.util.Log;
import i0.h.a.b.g.f.d;
import i0.h.a.b.m.g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-messaging@@21.1.0 */
public class c0 implements Closeable {
    public final URL c;
    public g<Bitmap> d;
    public volatile InputStream q;

    public c0(URL url) {
        this.c = url;
    }

    public void close() {
        try {
            InputStream inputStream = this.q;
            Logger logger = d.a;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    d.a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                }
            }
        } catch (IOException e2) {
            throw new AssertionError(e2);
        } catch (NullPointerException e3) {
            Log.e("FirebaseMessaging", "Failed to close the image download stream.", e3);
        }
    }
}
