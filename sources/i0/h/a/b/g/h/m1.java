package i0.h.a.b.g.h;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class m1 extends n1<FieldDescriptorType, Object> {
    public m1(int i) {
        super(i, (m1) null);
    }

    public final void c() {
        if (!this.y) {
            for (int i = 0; i < f(); i++) {
                Map.Entry d = d(i);
                if (((x) d.getKey()).x()) {
                    d.setValue(Collections.unmodifiableList((List) d.getValue()));
                }
            }
            for (Map.Entry entry : h()) {
                if (((x) entry.getKey()).x()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.c();
    }
}
