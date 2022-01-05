package i0.n.c.b.d.b;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CallLog;
import java.util.ArrayList;
import java.util.List;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: ContentProviderCallHistoryReader.kt */
public final class c implements b {
    public static final a Companion = new a((f) null);
    public static final Uri a;
    public final String[] b = {"date", "number", "type"};
    public final ContentResolver c;

    /* compiled from: ContentProviderCallHistoryReader.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    static {
        Uri uri = CallLog.Calls.CONTENT_URI;
        i.d(uri, "CallLog.Calls.CONTENT_URI");
        a = uri;
    }

    public c(ContentResolver contentResolver) {
        i.e(contentResolver, "contentResolver");
        this.c = contentResolver;
    }

    public List<String> a(long j) {
        ArrayList arrayList = new ArrayList();
        Cursor query = this.c.query(a, this.b, i0.d.a.a.a.k0("date > ", j), (String[]) null, "date");
        if (query != null) {
            int columnIndex = query.getColumnIndex("number");
            int columnIndex2 = query.getColumnIndex("type");
            while (query.moveToNext()) {
                int i = query.getInt(columnIndex2);
                if (i == 1 || i == 3) {
                    String string = query.getString(columnIndex);
                    i.d(string, "cursor.getString(numberIndex)");
                    arrayList.add(string);
                }
            }
            query.close();
        }
        return arrayList;
    }
}
