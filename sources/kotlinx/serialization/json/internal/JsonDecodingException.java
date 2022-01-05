package kotlinx.serialization.json.internal;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/json/internal/JsonDecodingException;", "Lkotlinx/serialization/json/internal/JsonException;", "", "message", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 4, 2})
/* compiled from: JsonExceptions.kt */
public final class JsonDecodingException extends JsonException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonDecodingException(String str) {
        super(str);
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
    }
}
