package com.pubnub.api.endpoints.objects_api.utils;

import com.pubnub.api.endpoints.Endpoint;
import java.util.HashMap;
import java.util.Map;

public class TotalCounter implements ParameterEnricher {
    public static final String COUNT_PARAM_NAME = "count";
    private Boolean includeTotalCount;

    public interface HavingTotalCounter<T extends Endpoint<?, ?>> extends TotalCountAware<T>, HavingCompositeParameterEnricher {
        T includeTotalCount(boolean z) {
            getCompositeParameterEnricher().getTotalCounter().setIncludeTotalCount(z);
            return (Endpoint) this;
        }
    }

    public interface TotalCountAware<T extends Endpoint<?, ?>> {
        T includeTotalCount(boolean z);
    }

    public Map<String, String> enrichParameters(Map<String, String> map) {
        HashMap hashMap = new HashMap(map);
        Boolean bool = this.includeTotalCount;
        if (bool != null) {
            hashMap.put("count", bool.toString());
        }
        return hashMap;
    }

    public void setIncludeTotalCount(boolean z) {
        this.includeTotalCount = Boolean.valueOf(z);
    }
}
