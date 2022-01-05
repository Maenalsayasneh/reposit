package h0.y.a.f;

import android.database.sqlite.SQLiteProgram;
import h0.y.a.d;

/* compiled from: FrameworkSQLiteProgram */
public class e implements d {
    public final SQLiteProgram c;

    public e(SQLiteProgram sQLiteProgram) {
        this.c = sQLiteProgram;
    }

    public void close() {
        this.c.close();
    }
}
