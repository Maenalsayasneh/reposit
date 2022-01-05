package com.pubnub.api.endpoints.files;

import com.instabug.library.model.UserAttributes;
import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.BuilderSteps;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.endpoints.files.requiredparambuilder.ChannelFileNameFileIdBuilder;
import com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.MapperManager;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.files.PNBaseFile;
import com.pubnub.api.models.consumer.files.PNPublishFileMessageResult;
import com.pubnub.api.models.server.files.FileUploadNotification;
import com.pubnub.api.services.FilesService;
import com.pubnub.api.vendor.Crypto;
import i0.m.a.a.a.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class PublishFileMessage extends Endpoint<List<Object>, PNPublishFileMessageResult> {
    private final String channel;
    private final PNConfiguration configuration;
    private final FilesService filesService;
    private final MapperManager mapper;
    private Object message;
    private Object meta;
    private final PNBaseFile pnFile;
    private Boolean shouldStore;
    private Integer ttl;

    public static class Builder extends ChannelFileNameFileIdBuilder<PublishFileMessage> {
        private Builder(BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<PublishFileMessage>>> channelStep) {
            super(channelStep);
        }
    }

    public PublishFileMessage(String str, String str2, String str3, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
        this.channel = str;
        this.pnFile = new PNBaseFile(str3, str2);
        this.filesService = retrofitManager.getFilesService();
        this.mapper = pubNub.getMapper();
        this.configuration = pubNub.getConfiguration();
    }

    public static Builder builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new Builder(ChannelFileNameFileIdBuilder.create(new e(pubNub, telemetryManager, retrofitManager, tokenManager)));
    }

    public d<List<Object>> doWork(Map<String, String> map) throws PubNubException {
        String str;
        String jsonUsinJackson = this.mapper.toJsonUsinJackson(new FileUploadNotification(this.message, this.pnFile));
        if (getPubnub().getConfiguration().getCipherKey() != null) {
            str = "\"".concat(new Crypto(getPubnub().getConfiguration().getCipherKey(), getPubnub().getConfiguration().isUseRandomInitializationVector()).encrypt(jsonUsinJackson)).concat("\"");
        } else {
            str = PubNubUtil.urlEncode(jsonUsinJackson);
        }
        String str2 = str;
        HashMap hashMap = new HashMap(map);
        Object obj = this.meta;
        if (obj != null) {
            hashMap.put("meta", PubNubUtil.urlEncode(this.mapper.toJsonUsinJackson(obj)));
        }
        Boolean bool = this.shouldStore;
        if (bool != null) {
            if (bool.booleanValue()) {
                hashMap.put("store", "1");
            } else {
                hashMap.put("store", "0");
            }
        }
        Integer num = this.ttl;
        if (num != null) {
            hashMap.put(UserAttributes.KEY_TTL, String.valueOf(num));
        }
        return this.filesService.notifyAboutFileUpload(this.configuration.getPublishKey(), this.configuration.getSubscribeKey(), this.channel, str2, hashMap);
    }

    public List<String> getAffectedChannelGroups() {
        return null;
    }

    public List<String> getAffectedChannels() {
        return null;
    }

    public PNOperationType getOperationType() {
        return PNOperationType.PNFileAction;
    }

    public boolean isAuthRequired() {
        return true;
    }

    public PublishFileMessage message(Object obj) {
        this.message = obj;
        return this;
    }

    public PublishFileMessage meta(Object obj) {
        this.meta = obj;
        return this;
    }

    public PublishFileMessage shouldStore(Boolean bool) {
        this.shouldStore = bool;
        return this;
    }

    public PublishFileMessage ttl(Integer num) {
        this.ttl = num;
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
    }

    public PNPublishFileMessageResult createResponse(v<List<Object>> vVar) throws PubNubException {
        T t = vVar.b;
        if (t != null) {
            return new PNPublishFileMessageResult(Long.parseLong(((List) t).get(2).toString()));
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INTERNAL_ERROR).build();
    }
}
