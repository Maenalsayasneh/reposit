package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import i0.f.a.c.k.a;
import i0.f.a.c.k.b;
import i0.f.a.c.n.k;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;

public abstract class MapperConfigBase<CFG extends a, T extends MapperConfigBase<CFG, T>> extends MapperConfig<T> implements Serializable {
    public static final b q = b.a.d;
    public static final int x = MapperConfig.c(MapperFeature.class);
    public static final int y = ((((MapperFeature.AUTO_DETECT_FIELDS.getMask() | MapperFeature.AUTO_DETECT_GETTERS.getMask()) | MapperFeature.AUTO_DETECT_IS_GETTERS.getMask()) | MapperFeature.AUTO_DETECT_SETTERS.getMask()) | MapperFeature.AUTO_DETECT_CREATORS.getMask());
    public final SimpleMixInResolver Y1;
    public final i0.f.a.c.p.a Z1;
    public final PropertyName a2;
    public final Class<?> b2;
    public final ContextAttributes c2;
    public final RootNameLookup d2;
    public final ConfigOverrides e2;

    public MapperConfigBase(BaseSettings baseSettings, i0.f.a.c.p.a aVar, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides) {
        super(baseSettings, x);
        this.Y1 = simpleMixInResolver;
        this.Z1 = aVar;
        this.d2 = rootNameLookup;
        this.a2 = null;
        this.b2 = null;
        this.c2 = ContextAttributes.Impl.c;
        this.e2 = configOverrides;
    }

    public final Class<?> a(Class<?> cls) {
        k.a aVar = this.Y1.c;
        if (aVar == null) {
            return null;
        }
        return aVar.a(cls);
    }

    public final b f(Class<?> cls) {
        b a = this.e2.a(cls);
        return a == null ? q : a;
    }

    public final JsonInclude.Value g(Class<?> cls, Class<?> cls2) {
        b a = this.e2.a(cls2);
        if (a == null) {
            a = q;
        }
        Objects.requireNonNull(a);
        JsonInclude.Value i = i(cls);
        if (i == null) {
            return null;
        }
        return i.a((JsonInclude.Value) null);
    }

    public final JsonFormat.Value h(Class<?> cls) {
        ConfigOverrides configOverrides = this.e2;
        Map<Class<?>, MutableConfigOverride> map = configOverrides.c;
        if (map != null) {
            b bVar = map.get(cls);
        }
        Boolean bool = configOverrides.Y1;
        if (bool == null) {
            return JsonFormat.Value.c;
        }
        return new JsonFormat.Value("", (JsonFormat.Shape) null, (Locale) null, (String) null, (TimeZone) null, JsonFormat.a.a, Boolean.valueOf(bool.booleanValue()));
    }

    public final JsonInclude.Value i(Class<?> cls) {
        b a = this.e2.a(cls);
        if (a == null) {
            a = q;
        }
        Objects.requireNonNull(a);
        JsonInclude.Value value = this.e2.d;
        if (value == null) {
            return null;
        }
        return value.a((JsonInclude.Value) null);
    }

    public final VisibilityChecker<?> l(Class<?> cls, i0.f.a.c.n.b bVar) {
        VisibilityChecker<?> visibilityChecker = this.e2.x;
        int i = this.c;
        int i2 = y;
        VisibilityChecker.Std std = visibilityChecker;
        if ((i & i2) != i2) {
            VisibilityChecker.Std std2 = visibilityChecker;
            if (!q(MapperFeature.AUTO_DETECT_FIELDS)) {
                JsonAutoDetect.Visibility visibility = JsonAutoDetect.Visibility.NONE;
                VisibilityChecker.Std std3 = (VisibilityChecker.Std) visibilityChecker;
                Objects.requireNonNull(std3);
                if (visibility == JsonAutoDetect.Visibility.DEFAULT) {
                    visibility = VisibilityChecker.Std.c.Y1;
                }
                JsonAutoDetect.Visibility visibility2 = visibility;
                JsonAutoDetect.Visibility visibility3 = std3.Y1;
                std2 = std3;
                if (visibility3 != visibility2) {
                    std2 = new VisibilityChecker.Std(std3.d, std3.q, std3.x, std3.y, visibility2);
                }
            }
            VisibilityChecker.Std std4 = std2;
            if (!q(MapperFeature.AUTO_DETECT_GETTERS)) {
                JsonAutoDetect.Visibility visibility4 = JsonAutoDetect.Visibility.NONE;
                VisibilityChecker.Std std5 = std2;
                Objects.requireNonNull(std5);
                if (visibility4 == JsonAutoDetect.Visibility.DEFAULT) {
                    visibility4 = VisibilityChecker.Std.c.d;
                }
                JsonAutoDetect.Visibility visibility5 = visibility4;
                JsonAutoDetect.Visibility visibility6 = std5.d;
                std4 = std5;
                if (visibility6 != visibility5) {
                    std4 = new VisibilityChecker.Std(visibility5, std5.q, std5.x, std5.y, std5.Y1);
                }
            }
            VisibilityChecker.Std std6 = std4;
            if (!q(MapperFeature.AUTO_DETECT_IS_GETTERS)) {
                JsonAutoDetect.Visibility visibility7 = JsonAutoDetect.Visibility.NONE;
                VisibilityChecker.Std std7 = std4;
                Objects.requireNonNull(std7);
                if (visibility7 == JsonAutoDetect.Visibility.DEFAULT) {
                    visibility7 = VisibilityChecker.Std.c.q;
                }
                JsonAutoDetect.Visibility visibility8 = visibility7;
                JsonAutoDetect.Visibility visibility9 = std7.q;
                std6 = std7;
                if (visibility9 != visibility8) {
                    std6 = new VisibilityChecker.Std(std7.d, visibility8, std7.x, std7.y, std7.Y1);
                }
            }
            VisibilityChecker.Std std8 = std6;
            if (!q(MapperFeature.AUTO_DETECT_SETTERS)) {
                JsonAutoDetect.Visibility visibility10 = JsonAutoDetect.Visibility.NONE;
                VisibilityChecker.Std std9 = std6;
                Objects.requireNonNull(std9);
                if (visibility10 == JsonAutoDetect.Visibility.DEFAULT) {
                    visibility10 = VisibilityChecker.Std.c.x;
                }
                JsonAutoDetect.Visibility visibility11 = visibility10;
                JsonAutoDetect.Visibility visibility12 = std9.x;
                std8 = std9;
                if (visibility12 != visibility11) {
                    std8 = new VisibilityChecker.Std(std9.d, std9.q, visibility11, std9.y, std9.Y1);
                }
            }
            std = std8;
            if (!q(MapperFeature.AUTO_DETECT_CREATORS)) {
                JsonAutoDetect.Visibility visibility13 = JsonAutoDetect.Visibility.NONE;
                VisibilityChecker.Std std10 = std8;
                Objects.requireNonNull(std10);
                if (visibility13 == JsonAutoDetect.Visibility.DEFAULT) {
                    visibility13 = VisibilityChecker.Std.c.y;
                }
                JsonAutoDetect.Visibility visibility14 = visibility13;
                JsonAutoDetect.Visibility visibility15 = std10.y;
                std = std10;
                if (visibility15 != visibility14) {
                    std = new VisibilityChecker.Std(std10.d, std10.q, std10.x, visibility14, std10.Y1);
                }
            }
        }
        AnnotationIntrospector e = e();
        VisibilityChecker.Std std11 = std;
        if (e != null) {
            std11 = e.b(bVar, std);
        }
        if (this.e2.a(cls) == null) {
            return std11;
        }
        VisibilityChecker.Std std12 = std11;
        Objects.requireNonNull(std12);
        return std12;
    }

    public abstract T v(int i);

    public PropertyName w(JavaType javaType) {
        PropertyName propertyName = this.a2;
        if (propertyName != null) {
            return propertyName;
        }
        RootNameLookup rootNameLookup = this.d2;
        Objects.requireNonNull(rootNameLookup);
        return rootNameLookup.a(javaType.c, this);
    }

    public final JsonIgnoreProperties.Value x(Class<?> cls, i0.f.a.c.n.b bVar) {
        JsonIgnoreProperties.Value value;
        AnnotationIntrospector e = e();
        if (e == null) {
            value = null;
        } else {
            value = e.T(this, bVar);
        }
        this.e2.a(cls);
        JsonIgnoreProperties.Value value2 = JsonIgnoreProperties.Value.c;
        if (value == null) {
            return null;
        }
        return value;
    }

    public final JsonIncludeProperties.Value y(i0.f.a.c.n.b bVar) {
        AnnotationIntrospector e = e();
        if (e == null) {
            return null;
        }
        return e.W(this, bVar);
    }

    public final T z(MapperFeature... mapperFeatureArr) {
        int i = this.c;
        for (MapperFeature mask : mapperFeatureArr) {
            i &= ~mask.getMask();
        }
        if (i == this.c) {
            return this;
        }
        return v(i);
    }

    public MapperConfigBase(MapperConfigBase<CFG, T> mapperConfigBase, int i) {
        super(mapperConfigBase, i);
        this.Y1 = mapperConfigBase.Y1;
        this.Z1 = mapperConfigBase.Z1;
        this.d2 = mapperConfigBase.d2;
        this.a2 = mapperConfigBase.a2;
        this.b2 = mapperConfigBase.b2;
        this.c2 = mapperConfigBase.c2;
        this.e2 = mapperConfigBase.e2;
    }
}
