package i0.h.a.b.d;

import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import i0.d.a.a.a;
import i0.h.a.b.d.b;
import java.lang.reflect.Field;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-basement@@17.5.0 */
public final class d<T> extends b.a {
    public final T a;

    public d(T t) {
        this.a = t;
    }

    @RecentlyNonNull
    public static <T> T j0(@RecentlyNonNull b bVar) {
        if (bVar instanceof d) {
            return ((d) bVar).a;
        }
        IBinder asBinder = bVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i == 1) {
            Objects.requireNonNull(field, "null reference");
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e) {
                    throw new IllegalArgumentException("Binder object is null.", e);
                } catch (IllegalAccessException e2) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException(a.Q(64, "Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
    }
}
