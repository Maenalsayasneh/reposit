package com.pubnub.api.endpoints.files;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.BuilderSteps;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.PNPage;
import com.pubnub.api.models.consumer.files.PNListFilesResult;
import com.pubnub.api.models.server.files.ListFilesResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class ListFiles extends Endpoint<ListFilesResult, PNListFilesResult> {
    private static final String DEFAULT_LIMIT = "100";
    private static final String LIMIT_QUERY_PARAM = "limit";
    private static final int MAX_LIMIT = 100;
    private static final int MIN_LIMIT = 1;
    private static final String NEXT_PAGE_QUERY_PARAM = "next";
    private final String channel;
    private Integer limit;
    private PNPage.Next next;

    public static class Builder implements BuilderSteps.ChannelStep<ListFiles> {
        private final PubNub pubnubInstance;
        private final RetrofitManager retrofitInstance;
        private final TelemetryManager telemetry;
        private final TokenManager tokenManager;

        public Builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager2) {
            this.pubnubInstance = pubNub;
            this.telemetry = telemetryManager;
            this.retrofitInstance = retrofitManager;
            this.tokenManager = tokenManager2;
        }

        public ListFiles channel(String str) {
            return new ListFiles(str, this.pubnubInstance, this.telemetry, this.retrofitInstance, this.tokenManager);
        }
    }

    public ListFiles(String str, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
        this.channel = str;
    }

    public d<ListFilesResult> doWork(Map<String, String> map) throws PubNubException {
        HashMap hashMap = new HashMap(map);
        Integer num = this.limit;
        if (num != null) {
            hashMap.put("limit", num.toString());
        } else {
            hashMap.put("limit", DEFAULT_LIMIT);
        }
        PNPage.Next next2 = this.next;
        if (next2 != null) {
            hashMap.put(NEXT_PAGE_QUERY_PARAM, PubNubUtil.urlEncode(next2.getHash()));
        }
        return getRetrofit().getFilesService().listFiles(getPubnub().getConfiguration().getSubscribeKey(), this.channel, encodeParams(hashMap));
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return Collections.singletonList(this.channel);
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNFileAction;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public ListFiles limit(Integer num) {
        this.limit = num;
        return this;
    }

    public ListFiles next(PNPage.Next next2) {
        this.next = next2;
        return this;
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        }
        String str = this.channel;
        if (str == null || str.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
        }
        Integer num = this.limit;
        if (num == null || (1 <= num.intValue() && this.limit.intValue() <= 100)) {
            PNPage.Next next2 = this.next;
            if (next2 == null) {
                return;
            }
            if (next2.getHash() == null || this.next.getHash().isEmpty()) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ARGUMENTS).errormsg("Next should not be an empty string").build();
            }
            return;
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ARGUMENTS).errormsg("Limit should be in range from 1 to 100 (both inclusive)").build();
    }

    public PNListFilesResult createResponse(v<ListFilesResult> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNListFilesResult(((ListFilesResult) t).getCount(), PNPage.next(((ListFilesResult) vVar.b).getNext()), ((ListFilesResult) vVar.b).getStatus(), ((ListFilesResult) vVar.b).getData());
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INTERNAL_ERROR).build();
    }
}
