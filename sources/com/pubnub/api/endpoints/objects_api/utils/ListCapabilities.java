package com.pubnub.api.endpoints.objects_api.utils;

import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.endpoints.objects_api.utils.Filter;
import com.pubnub.api.endpoints.objects_api.utils.Limiter;
import com.pubnub.api.endpoints.objects_api.utils.Pager;
import com.pubnub.api.endpoints.objects_api.utils.Sorter;
import com.pubnub.api.endpoints.objects_api.utils.TotalCounter;

public interface ListCapabilities {

    public interface HavingListCapabilites<T extends Endpoint<?, ?>> extends Limiter.HavingLimiter<T>, TotalCounter.HavingTotalCounter<T>, Sorter.HavingSorter<T>, Pager.HavingPager<T>, Filter.HavingFilter<T> {
    }

    public interface ListCapabilitiesAware<T extends Endpoint<?, ?>> extends Limiter.LimitAware<T>, TotalCounter.TotalCountAware<T>, Sorter.SortingAware<T>, Pager.PagingAware<T>, Filter.FilterAware<T> {
    }
}
