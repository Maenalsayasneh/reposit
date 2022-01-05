package com.pubnub.api.endpoints.objects_api.utils;

import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.models.consumer.PNPage;
import java.util.HashMap;
import java.util.Map;

public class Pager implements ParameterEnricher {
    public static final String END_PARAM_NAME = "end";
    public static final String START_PARAM_NAME = "start";
    private PNPage page;

    public interface HavingPager<T extends Endpoint<?, ?>> extends PagingAware<T>, HavingCompositeParameterEnricher {
        T page(PNPage pNPage) {
            getCompositeParameterEnricher().getPager().setPage(pNPage);
            return (Endpoint) this;
        }
    }

    public interface PagingAware<T extends Endpoint<?, ?>> {
        T page(PNPage pNPage);
    }

    public Map<String, String> enrichParameters(Map<String, String> map) {
        HashMap hashMap = new HashMap(map);
        PNPage pNPage = this.page;
        if (pNPage != null) {
            if (pNPage instanceof PNPage.Next) {
                hashMap.put(START_PARAM_NAME, pNPage.getHash());
            }
            PNPage pNPage2 = this.page;
            if (pNPage2 instanceof PNPage.Previous) {
                hashMap.put(END_PARAM_NAME, pNPage2.getHash());
            }
        }
        return hashMap;
    }

    public void setPage(PNPage pNPage) {
        this.page = pNPage;
    }

    public void validateParameters() throws PubNubException {
        PNPage pNPage = this.page;
        if (pNPage == null) {
            return;
        }
        if (pNPage.getHash() == null || this.page.getHash().isEmpty()) {
            PNPage pNPage2 = this.page;
            if (pNPage2 instanceof PNPage.Next) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PAGINATION_NEXT_OUT_OF_BOUNDS).build();
            } else if (pNPage2 instanceof PNPage.Previous) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PAGINATION_PREV_OUT_OF_BOUNDS).build();
            }
        }
    }
}
