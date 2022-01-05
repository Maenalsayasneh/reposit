package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.text.StringsKt__IndentKt;
import m0.n.a.a;
import m0.n.b.i;
import m0.n.b.m;
import m0.o.b;
import m0.r.d;
import m0.r.t.a.r.i.c;

/* compiled from: DescriptorRendererImpl.kt */
public final class DescriptorRendererImpl$functionTypeAnnotationsRenderer$2 extends Lambda implements a<DescriptorRendererImpl> {
    public final /* synthetic */ DescriptorRendererImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DescriptorRendererImpl$functionTypeAnnotationsRenderer$2(DescriptorRendererImpl descriptorRendererImpl) {
        super(0);
        this.c = descriptorRendererImpl;
    }

    public Object invoke() {
        DescriptorRendererImpl descriptorRendererImpl = this.c;
        AnonymousClass1 r1 = AnonymousClass1.c;
        Objects.requireNonNull(descriptorRendererImpl);
        i.e(r1, "changeOptions");
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = descriptorRendererImpl.c;
        Objects.requireNonNull(descriptorRendererOptionsImpl);
        Class<DescriptorRendererOptionsImpl> cls = DescriptorRendererOptionsImpl.class;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl2 = new DescriptorRendererOptionsImpl();
        Field[] declaredFields = cls.getDeclaredFields();
        i.d(declaredFields, "this::class.java.declaredFields");
        int length = declaredFields.length;
        int i = 0;
        while (i < length) {
            Field field = declaredFields[i];
            i++;
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(descriptorRendererOptionsImpl);
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null) {
                    String name = field.getName();
                    i.d(name, "field.name");
                    StringsKt__IndentKt.J(name, "is", false, 2);
                    d a = m.a(cls);
                    String name2 = field.getName();
                    String name3 = field.getName();
                    i.d(name3, "field.name");
                    Object value = bVar.getValue(descriptorRendererOptionsImpl, new PropertyReference1Impl(a, name2, i.k("get", StringsKt__IndentKt.a(name3))));
                    field.set(descriptorRendererOptionsImpl2, new c(value, value, descriptorRendererOptionsImpl2));
                }
            }
        }
        r1.invoke(descriptorRendererOptionsImpl2);
        descriptorRendererOptionsImpl2.b = true;
        return new DescriptorRendererImpl(descriptorRendererOptionsImpl2);
    }
}
