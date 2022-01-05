package h0.b0;

import android.os.Build;

/* compiled from: TransitionUtils */
public class q {
    public static final boolean a = true;
    public static final boolean b = true;
    public static final boolean c;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        if (i < 28) {
            z = false;
        }
        c = z;
    }
}
