package i0.h.a.b.c.j;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.h.a.b.c.i.f;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public class a {
    public final String a;
    public final String b;
    public final int c;

    public a(@RecentlyNonNull String str, @RecentlyNonNull String... strArr) {
        String str2;
        if (strArr.length == 0) {
            str2 = "";
        } else {
            StringBuilder N0 = i0.d.a.a.a.N0('[');
            for (String str3 : strArr) {
                if (N0.length() > 1) {
                    N0.append(InstabugDbContract.COMMA_SEP);
                }
                N0.append(str3);
            }
            N0.append(']');
            N0.append(' ');
            str2 = N0.toString();
        }
        this.b = str2;
        this.a = str;
        new f(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.c = i;
    }

    public void a(@RecentlyNonNull String str, Object... objArr) {
        if (this.c <= 3) {
            String str2 = this.a;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, this.b.concat(str));
        }
    }

    public void b(@RecentlyNonNull String str, Object... objArr) {
        String str2 = this.a;
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        Log.e(str2, this.b.concat(str));
    }
}
