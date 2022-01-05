package com.pubnub.api.endpoints.files;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.endpoints.BuilderSteps;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.endpoints.files.requiredparambuilder.ChannelFileNameFileIdBuilder;
import com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.files.PNFileUrlResult;
import i0.m.a.a.a.c;
import i0.m.a.a.a.d;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import q0.f0;
import t0.v;

public class GetFileUrl extends Endpoint<f0, PNFileUrlResult> {
    private PNCallback<PNFileUrlResult> cachedCallback;
    private final String channel;
    private final ExecutorService executorService;
    private final String fileId;
    private final String fileName;

    public static class Builder extends ChannelFileNameFileIdBuilder<GetFileUrl> {
        private Builder(BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<GetFileUrl>>> channelStep) {
            super(channelStep);
        }
    }

    public GetFileUrl(String str, String str2, String str3, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
        this.channel = str;
        this.fileId = str3;
        this.fileName = str2;
        this.executorService = retrofitManager.getTransactionClientExecutorService();
    }

    public static Builder builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new Builder(ChannelFileNameFileIdBuilder.create(new d(pubNub, telemetryManager, retrofitManager, tokenManager)));
    }

    public void async(PNCallback<PNFileUrlResult> pNCallback) {
        this.cachedCallback = pNCallback;
        this.executorService.execute(new c(this, pNCallback));
    }

    public t0.d<f0> doWork(Map<String, String> map) throws PubNubException {
        throw PubNubException.builder().build();
    }

    public List<String> getAffectedChannelGroups() {
        return Collections.emptyList();
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

    public void retry() {
        async(this.cachedCallback);
    }

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        }
        String str = this.channel;
        if (str == null || str.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
        }
    }

    public PNFileUrlResult createResponse(v<f0> vVar) throws PubNubException {
        throw PubNubException.builder().build();
    }

    public PNFileUrlResult sync() throws PubNubException {
        try {
            return new PNFileUrlResult(PubNubUtil.signRequest(getRetrofit().getFilesService().downloadFile(getPubnub().getConfiguration().getSubscribeKey(), this.channel, this.fileId, this.fileName, createBaseParams()).request(), getPubnub().getConfiguration(), getPubnub().getTimestamp()).b.l);
        } catch (Exception e) {
            throw PubNubException.builder().cause(e).build();
        }
    }
}
