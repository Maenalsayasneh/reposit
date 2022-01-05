package i0.c.a;

import android.database.sqlite.SQLiteDatabase;
import com.stripe.android.networking.AnalyticsRequestFactory;

/* compiled from: AmplitudeClient */
public class i implements n {
    public final /* synthetic */ f a;
    public final /* synthetic */ f b;

    public i(f fVar, f fVar2) {
        this.b = fVar;
        this.a = fVar2;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        this.b.d.J(sQLiteDatabase, "store", AnalyticsRequestFactory.FIELD_DEVICE_ID, this.a.h);
        this.b.d.J(sQLiteDatabase, "store", "user_id", this.a.g);
        this.b.d.J(sQLiteDatabase, "long_store", "opt_out", Long.valueOf(this.a.j ? 1 : 0));
        this.b.d.J(sQLiteDatabase, "long_store", "previous_session_id", Long.valueOf(this.a.p));
        this.b.d.J(sQLiteDatabase, "long_store", "last_event_time", Long.valueOf(this.a.t));
    }
}
