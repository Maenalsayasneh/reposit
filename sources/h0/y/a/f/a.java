package h0.y.a.f;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import h0.y.a.b;
import h0.y.a.e;
import java.io.IOException;

/* compiled from: FrameworkSQLiteDatabase */
public class a implements b {
    public static final String[] c = new String[0];
    public final SQLiteDatabase d;

    /* renamed from: h0.y.a.f.a$a  reason: collision with other inner class name */
    /* compiled from: FrameworkSQLiteDatabase */
    public class C0077a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ e a;

        public C0077a(a aVar, e eVar) {
            this.a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.b(new e(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.d = sQLiteDatabase;
    }

    public String a() {
        return this.d.getPath();
    }

    public Cursor b(e eVar) {
        return this.d.rawQueryWithFactory(new C0077a(this, eVar), eVar.a(), c, (String) null);
    }

    public void close() throws IOException {
        this.d.close();
    }

    public Cursor e(String str) {
        return b(new h0.y.a.a(str));
    }
}
