package com.pubnub.api.managers.token_manager;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.dataformat.cbor.CBORFactory;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.models.consumer.access_manager.v3.PNToken;
import com.pubnub.api.vendor.Base64;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class TokenParser {
    private final ObjectMapper mapper = objectMapper();

    private ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper(new CBORFactory(), (DefaultSerializerProvider) null, (DefaultDeserializationContext) null);
        Class<Map> cls = Map.class;
        ConfigOverrides configOverrides = objectMapper.Y1;
        if (configOverrides.c == null) {
            configOverrides.c = new HashMap();
        }
        MutableConfigOverride mutableConfigOverride = configOverrides.c.get(cls);
        if (mutableConfigOverride == null) {
            mutableConfigOverride = new MutableConfigOverride();
            configOverrides.c.put(cls, mutableConfigOverride);
        }
        Nulls nulls = Nulls.AS_EMPTY;
        JsonSetter.Value value = JsonSetter.Value.c;
        mutableConfigOverride.c = JsonSetter.Value.a(nulls, Nulls.DEFAULT);
        DeserializationFeature deserializationFeature = DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
        DeserializationConfig deserializationConfig = objectMapper.d2;
        int i = deserializationConfig.k2 & (~deserializationFeature.getMask());
        if (i != deserializationConfig.k2) {
            deserializationConfig = new DeserializationConfig(deserializationConfig, deserializationConfig.c, i, deserializationConfig.l2, deserializationConfig.m2, deserializationConfig.n2, deserializationConfig.o2);
        }
        objectMapper.d2 = deserializationConfig;
        return objectMapper;
    }

    public PNToken unwrapToken(String str) throws PubNubException {
        try {
            return (PNToken) this.mapper.e(Base64.decode(str.getBytes(StandardCharsets.UTF_8), 8), PNToken.class);
        } catch (IOException e) {
            throw PubNubException.builder().cause(e).pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ACCESS_TOKEN).build();
        }
    }
}
