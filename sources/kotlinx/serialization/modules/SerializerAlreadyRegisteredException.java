package kotlinx.serialization.modules;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/serialization/modules/SerializerAlreadyRegisteredException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "", "msg", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 4, 2})
/* compiled from: SerializersModuleBuilders.kt */
public final class SerializerAlreadyRegisteredException extends IllegalArgumentException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SerializerAlreadyRegisteredException(String str) {
        super(str);
        i.e(str, NotificationCompat.CATEGORY_MESSAGE);
    }
}
