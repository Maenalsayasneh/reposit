package h0.i.i;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: WindowCompat */
public final class c0 {
    public static f0 a(Window window, View view) {
        if (Build.VERSION.SDK_INT < 30) {
            return new f0(window, view);
        }
        WindowInsetsController insetsController = window.getInsetsController();
        if (insetsController != null) {
            return new f0(insetsController);
        }
        return null;
    }
}
