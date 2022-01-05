package i0.e.d.b.a.a.b;

import com.clubhouse.pubsub.user.backchannel.models.remote.Role;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;

/* compiled from: ChatMember.kt */
public final class e implements KSerializer<Role> {
    public static final e a = new e();

    public Object deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        String n = decoder.n();
        Role[] values = Role.values();
        for (int i = 0; i < 2; i++) {
            Role role = values[i];
            if (i.a(role.getValue(), n)) {
                return role;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public SerialDescriptor getDescriptor() {
        return a.w("Role", d.i.a);
    }

    public void serialize(Encoder encoder, Object obj) {
        Role role = (Role) obj;
        i.e(encoder, "encoder");
        i.e(role, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.F(role.getValue());
    }
}
