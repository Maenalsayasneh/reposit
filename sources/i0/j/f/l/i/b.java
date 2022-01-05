package i0.j.f.l.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.instabug.library.Instabug;

/* compiled from: PersistableSettings */
public class b {
    public static b a;
    public SharedPreferences b;
    public SharedPreferences.Editor c;

    @SuppressLint({"CommitPrefEdits"})
    public b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("instabug_announcements", 0);
        this.b = sharedPreferences;
        this.c = sharedPreferences.edit();
    }

    public static b a() {
        if (a == null && Instabug.getApplicationContext() != null) {
            a = new b(Instabug.getApplicationContext());
        }
        return a;
    }
}
