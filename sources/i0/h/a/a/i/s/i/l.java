package i0.h.a.a.i.s.i;

import android.database.Cursor;
import i0.h.a.a.b;
import i0.h.a.a.i.s.i.t;
import java.util.ArrayList;

/* compiled from: SQLiteEventStore */
public final /* synthetic */ class l implements t.b {
    public static final l a = new l();

    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        b bVar = t.c;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }
}
