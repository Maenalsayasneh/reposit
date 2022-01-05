package i0.i;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;

/* compiled from: CountryCodeDialog */
public class l {
    public static final Field a;
    public static final Field b;
    public static final Field c;
    public static Dialog d;
    public static Context e;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0037  */
    static {
        /*
            r0 = 1
            r1 = 0
            java.lang.Class<android.widget.TextView> r2 = android.widget.TextView.class
            java.lang.String r3 = "mCursorDrawableRes"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch:{ Exception -> 0x002b }
            r2.setAccessible(r0)     // Catch:{ Exception -> 0x0029 }
            java.lang.Class<android.widget.TextView> r3 = android.widget.TextView.class
            java.lang.String r4 = "mEditor"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ Exception -> 0x0029 }
            r3.setAccessible(r0)     // Catch:{ Exception -> 0x0027 }
            java.lang.Class r4 = r3.getType()     // Catch:{ Exception -> 0x0027 }
            java.lang.String r5 = "mCursorDrawable"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch:{ Exception -> 0x0027 }
            r4.setAccessible(r0)     // Catch:{ Exception -> 0x002e }
            r0 = 0
            goto L_0x002e
        L_0x0027:
            r4 = r1
            goto L_0x002e
        L_0x0029:
            r3 = r1
            goto L_0x002d
        L_0x002b:
            r2 = r1
            r3 = r2
        L_0x002d:
            r4 = r3
        L_0x002e:
            if (r0 == 0) goto L_0x0037
            a = r1
            b = r1
            c = r1
            goto L_0x003d
        L_0x0037:
            a = r3
            b = r4
            c = r2
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.i.l.<clinit>():void");
    }

    public static void a(Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(activity);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }
}
