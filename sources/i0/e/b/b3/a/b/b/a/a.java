package i0.e.b.b3.a.b.b.a;

import com.clubhouse.android.data.models.remote.response.error.BaseErrorResponse;
import com.clubhouse.android.data.models.remote.response.error.ErrorResponse;
import com.clubhouse.android.data.models.remote.response.error.UpdateUsernameErrorResponse;
import kotlinx.serialization.json.JsonElement;
import m0.n.b.i;
import m0.n.b.m;
import n0.c.b;
import n0.c.l.d;

/* compiled from: ErrorResponse.kt */
public final class a extends d<ErrorResponse> {
    public static final a c = new a();

    public a() {
        super(m.a(ErrorResponse.class));
    }

    public b a(JsonElement jsonElement) {
        i.e(jsonElement, "element");
        if (m0.r.t.a.r.m.a1.a.O1(jsonElement).containsKey("suggested_username")) {
            return UpdateUsernameErrorResponse.Companion.serializer();
        }
        return BaseErrorResponse.Companion.serializer();
    }
}
