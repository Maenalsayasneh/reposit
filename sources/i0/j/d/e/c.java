package i0.j.d.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import com.instabug.library.Instabug;

/* compiled from: PersistableSettings */
public class c {
    public static c a;
    public SharedPreferences b;
    public SharedPreferences.Editor c;

    @SuppressLint({"CommitPrefEdits"})
    public c(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("instabug_feature_requests", 0);
        this.b = sharedPreferences;
        this.c = sharedPreferences.edit();
    }

    public static c a() {
        if (a == null && Instabug.getApplicationContext() != null) {
            a = new c(Instabug.getApplicationContext());
        }
        return a;
    }
}
