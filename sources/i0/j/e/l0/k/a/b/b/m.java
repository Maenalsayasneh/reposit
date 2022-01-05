package i0.j.e.l0.k.a.b.b;

import android.database.sqlite.SQLiteDatabase;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;

/* compiled from: Migration_24_25 */
public class m implements b {
    public void a(SQLiteDatabase sQLiteDatabase) {
        StringBuilder U0 = a.U0("CREATE TABLE IF NOT EXISTS ", "anrs_table_temp", " ( ", InstabugDbContract.AnrEntry.COLUMN_ID, " TEXT, ");
        a.s(U0, InstabugDbContract.AnrEntry.COLUMN_ANR_MAIN_THREAD_DATA, " TEXT, ", InstabugDbContract.AnrEntry.COLUMN_ANR_REST_OF_THREADS_DATA, " TEXT, ");
        a.s(U0, InstabugDbContract.AnrEntry.COLUMN_ANR_UPLOAD_STATE, " INTEGER, ", "temporary_server_token", " TEXT, ");
        U0.append("state");
        U0.append(" TEXT, ");
        U0.append(InstabugDbContract.AnrEntry.COLUMN_ANR_LONG_MESSAGE);
        U0.append(" TEXT DEFAULT \"\")");
        sQLiteDatabase.execSQL(U0.toString());
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ");
        sb.append("anrs_table_temp");
        sb.append("(");
        a.s(sb, "anr_id,anr_main_thread_data,anr_rest_of_threads_data,anr_upload_state,temporary_server_token,state", ") SELECT ", "anr_id,anr_main_thread_data,anr_rest_of_threads_data,anr_upload_state,temporary_server_token,state", " FROM ");
        sb.append(InstabugDbContract.AnrEntry.TABLE_NAME);
        sQLiteDatabase.execSQL(sb.toString());
        sQLiteDatabase.execSQL(InstabugDbContract.AnrEntry.DROP_TABLE);
        sQLiteDatabase.execSQL("ALTER TABLE anrs_table_temp RENAME TO anrs_table");
    }
}
