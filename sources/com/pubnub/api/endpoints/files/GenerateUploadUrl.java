package com.pubnub.api.endpoints.files;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.endpoints.Endpoint;
import com.pubnub.api.endpoints.remoteaction.RemoteAction;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.server.files.FileUploadRequestDetails;
import com.pubnub.api.models.server.files.FormField;
import com.pubnub.api.models.server.files.GenerateUploadUrlPayload;
import com.pubnub.api.models.server.files.GeneratedUploadUrlResponse;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import t0.d;
import t0.v;

public class GenerateUploadUrl extends Endpoint<GeneratedUploadUrlResponse, FileUploadRequestDetails> {
    private final String channel;
    private final String fileName;

    public static class Factory {
        private final PubNub pubNub;
        private final RetrofitManager retrofitManager;
        private final TelemetryManager telemetryManager;
        private final TokenManager tokenManager;

        public Factory(PubNub pubNub2, TelemetryManager telemetryManager2, RetrofitManager retrofitManager2, TokenManager tokenManager2) {
            this.pubNub = pubNub2;
            this.telemetryManager = telemetryManager2;
            this.retrofitManager = retrofitManager2;
            this.tokenManager = tokenManager2;
        }

        public RemoteAction<FileUploadRequestDetails> create(String str, String str2) {
            return new GenerateUploadUrl(str, str2, this.pubNub, this.telemetryManager, this.retrofitManager, this.tokenManager);
        }
    }

    public GenerateUploadUrl(String str, String str2, PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        super(pubNub, telemetryManager, retrofitManager, tokenManager);
        this.channel = str;
        this.fileName = str2;
    }

    private FormField getKeyFormField(GeneratedUploadUrlResponse generatedUploadUrlResponse) throws PubNubException {
        FormField formField = null;
        for (FormField next : generatedUploadUrlResponse.getFileUploadRequest().getFormFields()) {
            if (next.getKey().equals(InstabugDbContract.UserAttributesEntry.COLUMN_KEY)) {
                formField = next;
            }
        }
        if (formField != null) {
            return formField;
        }
        throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INTERNAL_ERROR).errormsg("GenerateUploadUrl response do not contain \"key\" form param").build();
    }

    public d<GeneratedUploadUrlResponse> doWork(Map<String, String> map) {
        return getRetrofit().getFilesService().generateUploadUrl(getPubnub().getConfiguration().getSubscribeKey(), this.channel, new GenerateUploadUrlPayload(this.fileName), map);
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

    public FileUploadRequestDetails createResponse(v<GeneratedUploadUrlResponse> vVar) throws PubNubException {
        T t;
        if (vVar == null || (t = vVar.b) == null) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INTERNAL_ERROR).build();
        }
        FormField keyFormField = getKeyFormField((GeneratedUploadUrlResponse) t);
        GeneratedUploadUrlResponse generatedUploadUrlResponse = (GeneratedUploadUrlResponse) vVar.b;
        return new FileUploadRequestDetails(generatedUploadUrlResponse.getStatus(), generatedUploadUrlResponse.getData(), generatedUploadUrlResponse.getFileUploadRequest().getUrl(), generatedUploadUrlResponse.getFileUploadRequest().getMethod(), generatedUploadUrlResponse.getFileUploadRequest().getExpirationDate(), keyFormField, generatedUploadUrlResponse.getFileUploadRequest().getFormFields());
    }
}
