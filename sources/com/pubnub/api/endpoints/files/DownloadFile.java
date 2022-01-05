package com.pubnub.api.endpoints.files;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.BuilderSteps;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.endpoints.files.requiredparambuilder.ChannelFileNameFileIdBuilder;
import com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.files.PNDownloadFileResult;
import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.m.a.a.a.b;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import q0.f0;
import t0.d;
import t0.v;

public class DownloadFile extends Endpoint<f0, PNDownloadFileResult> {
    private final String channel;
    private String cipherKey;
    private final String fileId;
    private final String fileName;

    public static class Builder extends ChannelFileNameFileIdBuilder<DownloadFile> {
        private Builder(BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<DownloadFile>>> channelStep) {
            super(channelStep);
        }
    }

    public DownloadFile(String str, String str2, String str3, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
        this.channel = str;
        this.fileName = str2;
        this.fileId = str3;
    }

    public static Builder builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new Builder(ChannelFileNameFileIdBuilder.create(new b(pubNub, telemetryManager, retrofitManager, tokenManager)));
    }

    public DownloadFile cipherKey(String str) {
        this.cipherKey = str;
        return this;
    }

    public d<f0> doWork(Map<String, String> map) throws PubNubException {
        return getRetrofit().getFilesService().downloadFile(getPubnub().getConfiguration().getSubscribeKey(), this.channel, this.fileId, this.fileName, map);
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

    public void validateParams() throws PubNubException {
        if (getPubnub().getConfiguration().getSubscribeKey() == null || getPubnub().getConfiguration().getSubscribeKey().isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_SUBSCRIBE_KEY_MISSING).build();
        }
        String str = this.channel;
        if (str == null || str.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
        }
    }

    public PNDownloadFileResult createResponse(v<f0> vVar) throws PubNubException {
        if (vVar.b != null) {
            String effectiveCipherKey = FileEncryptionUtil.effectiveCipherKey(getPubnub(), this.cipherKey);
            if (effectiveCipherKey == null) {
                return new PNDownloadFileResult(this.fileName, ((f0) vVar.b).byteStream());
            }
            return new PNDownloadFileResult(this.fileName, FileEncryptionUtil.decrypt(effectiveCipherKey, ((f0) vVar.b).byteStream()));
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INTERNAL_ERROR).build();
    }
}
