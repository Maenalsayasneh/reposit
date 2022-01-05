package com.pubnub.api.endpoints.objects_api.utils;

import com.pubnub.api.endpoints.Endpoint;
import java.util.HashMap;
import java.util.Map;

public class Limiter implements ParameterEnricher {
    public static final String LIMIT_PARAM_NAME = "limit";
    private Integer limit;

    public interface HavingLimiter<T extends Endpoint<?, ?>> extends LimitAware<T>, HavingCompositeParameterEnricher {
        T limit(int i) {
            getCompositeParameterEnricher().getLimiter().setLimit(i);
            return (Endpoint) this;
        }
    }

    public interface LimitAware<T extends Endpoint<?, ?>> {
        T limit(int i);
    }

    public Map<String, String> enrichParameters(Map<String, String> map) {
        HashMap hashMap = new HashMap(map);
        Integer num = this.limit;
        if (num != null) {
            hashMap.put(LIMIT_PARAM_NAME, num.toString());
        }
        return hashMap;
    }

    public void setLimit(int i) {
        this.limit = Integer.valueOf(i);
    }
}
