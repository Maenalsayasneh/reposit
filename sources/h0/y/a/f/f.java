package h0.y.a.f;

import android.database.sqlite.SQLiteStatement;
import h0.y.a.d;

/* compiled from: FrameworkSQLiteStatement */
public class f extends e implements d {
    public final SQLiteStatement d;

    public f(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.d = sQLiteStatement;
    }

    public int a() {
        return this.d.executeUpdateDelete();
    }
}
