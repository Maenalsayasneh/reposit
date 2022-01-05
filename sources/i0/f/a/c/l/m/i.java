package i0.f.a.c.l.m;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import i0.f.a.c.t.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: UnwrappedPropertyHandler */
public class i {
    public final List<SettableBeanProperty> a;

    public i() {
        this.a = new ArrayList();
    }

    public Object a(DeserializationContext deserializationContext, Object obj, r rVar) throws IOException {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            JsonParser f1 = rVar.f1();
            f1.M0();
            this.a.get(i).k(f1, deserializationContext, obj);
        }
        return obj;
    }

    public i(List<SettableBeanProperty> list) {
        this.a = list;
    }
}
