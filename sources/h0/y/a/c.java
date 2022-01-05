package h0.y.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* compiled from: SupportSQLiteOpenHelper */
public interface c extends Closeable {

    /* compiled from: SupportSQLiteOpenHelper */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }

        public abstract void b(b bVar, int i, int i2);
    }

    /* compiled from: SupportSQLiteOpenHelper */
    public static class b {
        public final Context a;
        public final String b;
        public final a c;
        public final boolean d;

        public b(Context context, String str, a aVar, boolean z) {
            this.a = context;
            this.b = str;
            this.c = aVar;
            this.d = z;
        }
    }

    /* renamed from: h0.y.a.c$c  reason: collision with other inner class name */
    /* compiled from: SupportSQLiteOpenHelper */
    public interface C0076c {
        c a(b bVar);
    }

    b L();

    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
