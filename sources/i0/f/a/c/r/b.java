package i0.f.a.c.r;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import i0.f.a.c.g;
import i0.f.a.c.r.k.a;
import java.util.Collections;
import java.util.List;

/* compiled from: BeanSerializerBuilder */
public class b {
    public static final BeanPropertyWriter[] a = new BeanPropertyWriter[0];
    public final i0.f.a.c.b b;
    public SerializationConfig c;
    public List<BeanPropertyWriter> d = Collections.emptyList();
    public BeanPropertyWriter[] e;
    public a f;
    public Object g;
    public AnnotatedMember h;
    public a i;

    public b(i0.f.a.c.b bVar) {
        this.b = bVar;
    }

    public g<?> a() {
        BeanPropertyWriter[] beanPropertyWriterArr;
        if (this.h != null && this.c.q(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.h.g(this.c.q(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        a aVar = this.f;
        if (aVar != null) {
            aVar.b.g(this.c.q(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        List<BeanPropertyWriter> list = this.d;
        if (list != null && !list.isEmpty()) {
            List<BeanPropertyWriter> list2 = this.d;
            beanPropertyWriterArr = (BeanPropertyWriter[]) list2.toArray(new BeanPropertyWriter[list2.size()]);
            if (this.c.q(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (BeanPropertyWriter beanPropertyWriter : beanPropertyWriterArr) {
                    beanPropertyWriter.c2.g(this.c.q(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
                }
            }
        } else if (this.f == null && this.i == null) {
            return null;
        } else {
            beanPropertyWriterArr = a;
        }
        BeanPropertyWriter[] beanPropertyWriterArr2 = this.e;
        if (beanPropertyWriterArr2 == null || beanPropertyWriterArr2.length == this.d.size()) {
            return new BeanSerializer(this.b.a, this, beanPropertyWriterArr, this.e);
        }
        throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", new Object[]{Integer.valueOf(this.d.size()), Integer.valueOf(this.e.length)}));
    }
}
