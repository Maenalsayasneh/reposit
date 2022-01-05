package i0.e.b.b3.a.b.c;

import com.clubhouse.android.data.models.remote.request.SearchItemType;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: SearchItemTypeSerializer.kt */
public final class g implements KSerializer<SearchItemType> {
    public static final g a = new g();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        String n = decoder.n();
        SearchItemType[] values = SearchItemType.values();
        for (int i = 0; i < 4; i++) {
            SearchItemType searchItemType = values[i];
            if (i.a(searchItemType.getValue(), n)) {
                return searchItemType;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public SerialDescriptor getDescriptor() {
        return a.w("SearchItemType", d.i.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        SearchItemType searchItemType = (SearchItemType) obj;
        i.e(encoder, "encoder");
        i.e(searchItemType, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.F(searchItemType.getValue());
    }
}
