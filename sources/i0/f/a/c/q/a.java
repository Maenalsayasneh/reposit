package i0.f.a.c.q;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.b.b;
import i0.f.a.b.e;
import i0.f.a.b.f;

/* compiled from: InternalNodeMapper */
public final class a {
    public static final JsonMapper a;
    public static final ObjectWriter b;

    static {
        ObjectWriter.GeneratorSettings generatorSettings;
        JsonMapper jsonMapper = new JsonMapper();
        a = jsonMapper;
        b = new ObjectWriter(jsonMapper, jsonMapper.a2);
        SerializationConfig serializationConfig = jsonMapper.a2;
        ObjectWriter objectWriter = new ObjectWriter(jsonMapper, serializationConfig);
        e eVar = serializationConfig.h2;
        ObjectWriter.GeneratorSettings generatorSettings2 = ObjectWriter.GeneratorSettings.c;
        if (eVar == null) {
            eVar = ObjectWriter.c;
        }
        if (eVar == null) {
            generatorSettings = generatorSettings2;
        } else {
            generatorSettings = new ObjectWriter.GeneratorSettings(eVar, (b) null, (f) null);
        }
        ObjectWriter.Prefetch prefetch = ObjectWriter.Prefetch.c;
        if (generatorSettings2 != generatorSettings) {
            new ObjectWriter(objectWriter, serializationConfig, generatorSettings, prefetch);
        }
        new ObjectReader(jsonMapper, jsonMapper.d2, jsonMapper.x.b((i0.f.a.c.s.a) null, i0.f.a.c.e.class, TypeFactory.q), (Object) null, (b) null);
    }
}
