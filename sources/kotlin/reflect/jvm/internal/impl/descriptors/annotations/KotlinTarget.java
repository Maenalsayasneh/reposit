package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;

/* compiled from: KotlinTarget.kt */
public enum KotlinTarget {
    CLASS("class", false, 2, (boolean) null),
    ANNOTATION_CLASS("annotation class", false, 2, (boolean) null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, (boolean) null),
    FIELD("field", false, 2, (boolean) null),
    LOCAL_VARIABLE("local variable", false, 2, (boolean) null),
    VALUE_PARAMETER("value parameter", false, 2, (boolean) null),
    CONSTRUCTOR("constructor", false, 2, (boolean) null),
    FUNCTION("function", false, 2, (boolean) null),
    PROPERTY_GETTER("getter", false, 2, (boolean) null),
    PROPERTY_SETTER("setter", false, 2, (boolean) null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    
    private static final Set<KotlinTarget> ALL_TARGET_SET = null;
    public static final a Companion = null;
    private static final Set<KotlinTarget> DEFAULT_TARGET_SET = null;
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> USE_SITE_MAPPING = null;
    private static final HashMap<String, KotlinTarget> map = null;
    private final String description;
    private final boolean isDefault;

    /* compiled from: KotlinTarget.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a((f) null);
        map = new HashMap<>();
        KotlinTarget[] values = values();
        int i = 0;
        while (i < 41) {
            KotlinTarget kotlinTarget = values[i];
            i++;
            map.put(kotlinTarget.name(), kotlinTarget);
        }
        KotlinTarget[] values2 = values();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 41; i2++) {
            KotlinTarget kotlinTarget2 = values2[i2];
            if (kotlinTarget2.isDefault()) {
                arrayList.add(kotlinTarget2);
            }
        }
        DEFAULT_TARGET_SET = g.D0(arrayList);
        ALL_TARGET_SET = h.n4(values());
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget3 = VALUE_PARAMETER;
        AnnotationUseSiteTarget annotationUseSiteTarget2 = AnnotationUseSiteTarget.FIELD;
        KotlinTarget kotlinTarget4 = FIELD;
        USE_SITE_MAPPING = g.N(new Pair(annotationUseSiteTarget, kotlinTarget3), new Pair(annotationUseSiteTarget2, kotlinTarget4), new Pair(AnnotationUseSiteTarget.PROPERTY, PROPERTY), new Pair(AnnotationUseSiteTarget.FILE, FILE), new Pair(AnnotationUseSiteTarget.PROPERTY_GETTER, PROPERTY_GETTER), new Pair(AnnotationUseSiteTarget.PROPERTY_SETTER, PROPERTY_SETTER), new Pair(AnnotationUseSiteTarget.RECEIVER, kotlinTarget3), new Pair(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget3), new Pair(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget4));
    }

    private KotlinTarget(String str, boolean z) {
        this.description = str;
        this.isDefault = z;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }
}
