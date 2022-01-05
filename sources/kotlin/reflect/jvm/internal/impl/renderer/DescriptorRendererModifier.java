package kotlin.reflect.jvm.internal.impl.renderer;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Set;
import m0.j.g;
import m0.n.b.f;

/* compiled from: DescriptorRenderer.kt */
public enum DescriptorRendererModifier {
    VISIBILITY(true),
    MODALITY(true),
    OVERRIDE(true),
    ANNOTATIONS(false),
    INNER(true),
    MEMBER_KIND(true),
    DATA(true),
    INLINE(true),
    EXPECT(true),
    ACTUAL(true),
    CONST(true),
    LATEINIT(true),
    FUN(true),
    VALUE(true);
    
    public static final Set<DescriptorRendererModifier> ALL = null;
    public static final Set<DescriptorRendererModifier> ALL_EXCEPT_ANNOTATIONS = null;
    public static final a Companion = null;
    private final boolean includeByDefault;

    /* compiled from: DescriptorRenderer.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a((f) null);
        DescriptorRendererModifier[] values = values();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 14; i++) {
            DescriptorRendererModifier descriptorRendererModifier = values[i];
            if (descriptorRendererModifier.getIncludeByDefault()) {
                arrayList.add(descriptorRendererModifier);
            }
        }
        ALL_EXCEPT_ANNOTATIONS = g.D0(arrayList);
        ALL = h.n4(values());
    }

    private DescriptorRendererModifier(boolean z) {
        this.includeByDefault = z;
    }

    public final boolean getIncludeByDefault() {
        return this.includeByDefault;
    }
}
