package i0.e.b.b3.a.a.c;

import com.clubhouse.android.data.models.local.channel.PromptField;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: PromptField.kt */
public final class c implements KSerializer<PromptField> {
    public static final c a = new c();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        String n = decoder.n();
        PromptField[] values = PromptField.values();
        for (int i = 0; i < 2; i++) {
            PromptField promptField = values[i];
            if (i.a(promptField.getValue(), n)) {
                return promptField;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public SerialDescriptor getDescriptor() {
        return a.w("PromptField", d.i.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        PromptField promptField = (PromptField) obj;
        i.e(encoder, "encoder");
        i.e(promptField, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.F(promptField.getValue());
    }
}
