package com.pubnub.api.endpoints.pubsub;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.enums.PNStatusCategory;
import com.pubnub.api.managers.MapperManager;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.server.SubscribeEnvelope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import s0.c.b;
import s0.c.c;
import t0.d;
import t0.v;

public class Subscribe extends Endpoint<SubscribeEnvelope, SubscribeEnvelope> {
    public static final int RATE_LIMIT_EXCEEDED = 429;
    public static final int URI_TOO_LONG = 414;
    private static final b log = c.e(Subscribe.class);
    private List<String> channelGroups = new ArrayList();
    private List<String> channels = new ArrayList();
    private String filterExpression;
    private String region;
    private Object state;
    private Long timetoken;

    public Subscribe(PubNub pubNub, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, (TelemetryManager) null, retrofitManager, tokenManager);
    }

    public void async(final PNCallback<SubscribeEnvelope> pNCallback) {
        super.async(new PNCallback<SubscribeEnvelope>() {
            public void onResponse(SubscribeEnvelope subscribeEnvelope, PNStatus pNStatus) {
                if (pNStatus.isError()) {
                    if (pNStatus.getStatusCode() == 400 && pNStatus.getErrorData().getInformation().contains("Filter syntax error")) {
                        pNStatus = pNStatus.toBuilder().category(PNStatusCategory.PNMalformedFilterExpressionCategory).build();
                    } else if (pNStatus.getStatusCode() == 414) {
                        pNStatus = pNStatus.toBuilder().category(PNStatusCategory.PNURITooLongCategory).build();
                    } else if (pNStatus.getStatusCode() == 429) {
                        pNStatus = pNStatus.toBuilder().category(PNStatusCategory.PNRateLimitExceededCategory).build();
                    }
                    pNCallback.onResponse(subscribeEnvelope, pNStatus);
                    return;
                }
                pNCallback.onResponse(subscribeEnvelope, pNStatus);
            }
        });
    }

    public Subscribe channelGroups(List<String> list) {
        this.channelGroups = list;
        return this;
    }

    public Subscribe channels(List<String> list) {
        this.channels = list;
        return this;
    }

    public d<SubscribeEnvelope> doWork(Map<String, String> map) throws PubNubException {
        MapperManager mapper = getPubnub().getMapper();
        int size = this.channelGroups.size();
        String str = InstabugDbContract.COMMA_SEP;
        if (size > 0) {
            map.put("channel-group", PubNubUtil.joinString(this.channelGroups, str));
        }
        String str2 = this.filterExpression;
        if (str2 != null && str2.length() > 0) {
            map.put("filter-expr", PubNubUtil.urlEncode(this.filterExpression));
        }
        Long l = this.timetoken;
        if (l != null) {
            map.put("tt", l.toString());
        }
        String str3 = this.region;
        if (str3 != null) {
            map.put("tr", str3);
        }
        if (this.channels.size() > 0) {
            str = PubNubUtil.joinString(this.channels, str);
        }
        map.put("heartbeat", String.valueOf(getPubnub().getConfiguration().getPresenceTimeout()));
        Object obj = this.state;
        if (obj != null) {
            map.put("state", PubNubUtil.urlEncode(mapper.toJson(obj)));
        }
        map.putAll(encodeParams(map));
        return getRetrofit().getSubscribeService().subscribe(getPubnub().getConfiguration().getSubscribeKey(), str, map);
    }

    public Subscribe filterExpression(String str) {
        this.filterExpression = str;
        return this;
    }

    public List<String> getAffectedChannelGroups() {
        return this.channelGroups;
    }

    public List<String> getAffectedChannels() {
        return this.channels;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNSubscribeOperation;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public Subscribe region(String str) {
        this.region = str;
        return this;
    }

    public Subscribe state(Object obj) {
        this.state = obj;
        return this;
    }

    public Subscribe timetoken(Long l) {
        this.timetoken = l;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        } else if (this.channels.size() == 0 && this.channelGroups.size() == 0) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_AND_GROUP_MISSING).build();
        }
    }

    public SubscribeEnvelope createResponse(v<SubscribeEnvelope> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return (SubscribeEnvelope) t;
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).build();
    }
}
