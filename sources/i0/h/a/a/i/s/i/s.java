package i0.h.a.a.i.s.i;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import com.google.android.datatransport.runtime.EventInternal;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.PaymentMethodOptionsParams;
import i0.h.a.a.b;
import i0.h.a.a.i.h;
import i0.h.a.a.i.s.i.t;
import i0.h.a.a.i.v.a;
import java.util.Arrays;
import java.util.Map;

/* compiled from: SQLiteEventStore */
public final /* synthetic */ class s implements t.b {
    public final t a;
    public final h b;
    public final EventInternal c;

    public s(t tVar, h hVar, EventInternal eventInternal) {
        this.a = tVar;
        this.b = hVar;
        this.c = eventInternal;
    }

    public Object apply(Object obj) {
        long j;
        t tVar = this.a;
        h hVar = this.b;
        EventInternal eventInternal = this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        b bVar = t.c;
        if (tVar.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * tVar.b().compileStatement("PRAGMA page_count").simpleQueryForLong() >= tVar.y.e()) {
            return -1L;
        }
        Long e = tVar.e(sQLiteDatabase, hVar);
        if (e != null) {
            j = e.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", hVar.b());
            contentValues.put("priority", Integer.valueOf(a.a(hVar.d())));
            contentValues.put("next_request_ms", 0);
            if (hVar.c() != null) {
                contentValues.put(NotificationCompat.MessagingStyle.Message.KEY_EXTRAS_BUNDLE, Base64.encodeToString(hVar.c(), 0));
            }
            j = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        int d = tVar.y.d();
        byte[] bArr = eventInternal.getEncodedPayload().b;
        boolean z = bArr.length <= d;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(j));
        contentValues2.put("transport_name", eventInternal.getTransportName());
        contentValues2.put("timestamp_ms", Long.valueOf(eventInternal.getEventMillis()));
        contentValues2.put("uptime_ms", Long.valueOf(eventInternal.getUptimeMillis()));
        contentValues2.put("payload_encoding", eventInternal.getEncodedPayload().a.a);
        contentValues2.put(PaymentMethodOptionsParams.Blik.PARAM_CODE, eventInternal.getCode());
        contentValues2.put("num_attempts", 0);
        contentValues2.put("inline", Boolean.valueOf(z));
        contentValues2.put("payload", z ? bArr : new byte[0]);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
        if (!z) {
            int ceil = (int) Math.ceil(((double) bArr.length) / ((double) d));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, (i - 1) * d, Math.min(i * d, bArr.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert));
                contentValues3.put("sequence_num", Integer.valueOf(i));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
            }
        }
        for (Map.Entry next : eventInternal.getMetadata().entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert));
            contentValues4.put("name", (String) next.getKey());
            contentValues4.put(InstabugDbContract.UserAttributesEntry.COLUMN_VALUE, (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
        }
        return Long.valueOf(insert);
    }
}
