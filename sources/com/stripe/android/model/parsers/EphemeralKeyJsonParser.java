package com.stripe.android.model.parsers;

import com.stripe.android.EphemeralKey;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/parsers/EphemeralKeyJsonParser;", "Lcom/stripe/android/model/parsers/ModelJsonParser;", "Lcom/stripe/android/EphemeralKey;", "Lorg/json/JSONObject;", "json", "parse", "(Lorg/json/JSONObject;)Lcom/stripe/android/EphemeralKey;", "<init>", "()V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: EphemeralKeyJsonParser.kt */
public final class EphemeralKeyJsonParser implements ModelJsonParser<EphemeralKey> {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String FIELD_ASSOCIATED_OBJECTS = "associated_objects";
    @Deprecated
    private static final String FIELD_CREATED = "created";
    @Deprecated
    private static final String FIELD_EXPIRES = "expires";
    @Deprecated
    private static final String FIELD_ID = "id";
    @Deprecated
    private static final String FIELD_LIVEMODE = "livemode";
    @Deprecated
    private static final String FIELD_OBJECT = "object";
    @Deprecated
    private static final String FIELD_SECRET = "secret";
    @Deprecated
    private static final String FIELD_TYPE = "type";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/parsers/EphemeralKeyJsonParser$Companion;", "", "", "FIELD_ASSOCIATED_OBJECTS", "Ljava/lang/String;", "FIELD_CREATED", "FIELD_EXPIRES", "FIELD_ID", "FIELD_LIVEMODE", "FIELD_OBJECT", "FIELD_SECRET", "FIELD_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: EphemeralKeyJsonParser.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public EphemeralKey parse(JSONObject jSONObject) {
        i.e(jSONObject, "json");
        long j = jSONObject.getLong(FIELD_CREATED);
        long j2 = jSONObject.getLong(FIELD_EXPIRES);
        String string = jSONObject.getString("id");
        boolean z = jSONObject.getBoolean(FIELD_LIVEMODE);
        String string2 = jSONObject.getString(FIELD_OBJECT);
        String string3 = jSONObject.getString(FIELD_SECRET);
        JSONObject jSONObject2 = jSONObject.getJSONArray(FIELD_ASSOCIATED_OBJECTS).getJSONObject(0);
        String string4 = jSONObject2.getString("type");
        String string5 = jSONObject2.getString("id");
        i.d(string5, "objectId");
        i.d(string, "id");
        i.d(string2, "objectType");
        i.d(string3, FIELD_SECRET);
        i.d(string4, "type");
        return new EphemeralKey(string5, j, j2, string, z, string2, string3, string4);
    }
}
