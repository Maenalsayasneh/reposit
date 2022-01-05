package com.pubnub.api.endpoints;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.objects_api.utils.Pager;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.history.PNDeleteMessagesResult;
import com.pubnub.api.models.server.DeleteMessagesEnvelope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class DeleteMessages extends Endpoint<DeleteMessagesEnvelope, PNDeleteMessagesResult> {
    private static final int SERVER_RESPONSE_SUCCESS = 200;
    private List<String> channels = new ArrayList();
    private Long end;
    private Long start;

    public DeleteMessages(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    public DeleteMessages channels(List<String> list) {
        this.channels = list;
        return this;
    }

    public d<DeleteMessagesEnvelope> doWork(Map<String, String> map) throws PubNubException {
        Long l = this.start;
        if (l != null) {
            map.put(Pager.START_PARAM_NAME, Long.toString(l.longValue()).toLowerCase());
        }
        Long l2 = this.end;
        if (l2 != null) {
            map.put(Pager.END_PARAM_NAME, Long.toString(l2.longValue()).toLowerCase());
        }
        return getRetrofit().getHistoryService().deleteMessages(getPubnub().getConfiguration().getSubscribeKey(), PubNubUtil.joinString(this.channels, InstabugDbContract.COMMA_SEP), map);
    }

    public DeleteMessages end(Long l) {
        this.end = l;
        return this;
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return this.channels;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNDeleteMessagesOperation;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public DeleteMessages start(Long l) {
        this.start = l;
        return this;
    }

    public void validateParams() throws PubNubException {
        List<String> list = this.channels;
        if (list == null || list.size() == 0) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
        }
    }

    public PNDeleteMessagesResult createResponse(v<DeleteMessagesEnvelope> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null && ((DeleteMessagesEnvelope) t).getStatus() != null && ((DeleteMessagesEnvelope) vVar.b).getStatus().intValue() == 200) {
            return PNDeleteMessagesResult.builder().build();
        }
        T t2 = vVar.b;
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_PARSING_ERROR).errormsg((t2 == null || ((DeleteMessagesEnvelope) t2).getErrorMessage() == null) ? "n/a" : ((DeleteMessagesEnvelope) vVar.b).getErrorMessage()).build();
    }
}
