package com.pubnub.api.endpoints.objects_api.utils;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.endpoints.Endpoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sorter implements ParameterEnricher {
    public static final String SORT_PARAM_NAME = "sort";
    private List<PNSortKey> sortKeyList = new ArrayList();

    public interface HavingSorter<T extends Endpoint<?, ?>> extends SortingAware<T>, HavingCompositeParameterEnricher {
        T sort(PNSortKey... pNSortKeyArr) {
            getCompositeParameterEnricher().getSorter().addSortKeys(Arrays.asList(pNSortKeyArr));
            return (Endpoint) this;
        }
    }

    public interface SortingAware<T extends Endpoint<?, ?>> {
        T sort(PNSortKey... pNSortKeyArr);
    }

    public void addSortKeys(List<PNSortKey> list) {
        this.sortKeyList = list;
    }

    public Map<String, String> enrichParameters(Map<String, String> map) {
        HashMap hashMap = new HashMap(map);
        if (!this.sortKeyList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (PNSortKey sortParameter : this.sortKeyList) {
                arrayList.add(sortParameter.toSortParameter());
            }
            hashMap.put(SORT_PARAM_NAME, PubNubUtil.joinString(arrayList, InstabugDbContract.COMMA_SEP));
        }
        return hashMap;
    }
}
