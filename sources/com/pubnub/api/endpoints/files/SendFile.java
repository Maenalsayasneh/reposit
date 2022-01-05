package com.pubnub.api.endpoints.files;

import com.pubnub.api.PubNub;
import com.pubnub.api.PubNubException;
import com.pubnub.api.PubNubUtil;
import com.pubnub.api.builder.PubNubErrorBuilder;
import com.pubnub.api.callbacks.PNCallback;
import com.pubnub.api.endpoints.BuilderSteps;
import com.pubnub.api.endpoints.files.GenerateUploadUrl;
import com.pubnub.api.endpoints.files.PublishFileMessage;
import com.pubnub.api.endpoints.files.UploadFile;
import com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps;
import com.pubnub.api.endpoints.remoteaction.ComposableRemoteAction;
import com.pubnub.api.endpoints.remoteaction.MappingRemoteAction;
import com.pubnub.api.endpoints.remoteaction.RemoteAction;
import com.pubnub.api.endpoints.remoteaction.RetryingRemoteAction;
import com.pubnub.api.enums.PNOperationType;
import com.pubnub.api.managers.RetrofitManager;
import com.pubnub.api.managers.TelemetryManager;
import com.pubnub.api.managers.token_manager.TokenManager;
import com.pubnub.api.models.consumer.PNErrorData;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.files.PNFileUploadResult;
import com.pubnub.api.models.consumer.files.PNPublishFileMessageResult;
import com.pubnub.api.models.server.files.FileUploadRequestDetails;
import i0.d.a.a.a;
import i0.m.a.a.a.f;
import i0.m.a.a.a.g;
import i0.m.a.a.a.h;
import i0.m.a.a.a.i;
import i0.m.a.a.a.j;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

public class SendFile implements RemoteAction<PNFileUploadResult> {
    private final Exception byteContentReadingException;
    private final String channel;
    private String cipherKey;
    private final byte[] content;
    private final ExecutorService executorService;
    private final int fileMessagePublishRetryLimit;
    private final String fileName;
    private Object message;
    private Object meta;
    private final RemoteAction<PNFileUploadResult> sendFileMultistepAction;
    private Boolean shouldStore;
    private Integer ttl;

    public static class Builder implements BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.InputStreamStep<SendFile>>> {
        private final PubNub pubnub;
        private final RetrofitManager retrofit;
        private final TelemetryManager telemetry;
        private final TokenManager tokenManager;

        public static class InnerBuilder implements BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.InputStreamStep<SendFile>>>, FilesBuilderSteps.FileNameStep<FilesBuilderSteps.InputStreamStep<SendFile>>, FilesBuilderSteps.InputStreamStep<SendFile> {
            private String channelValue;
            private String fileNameValue;
            private final GenerateUploadUrl.Factory generateUploadUrlFactory;
            private final PublishFileMessage.Builder publishFileMessageBuilder;
            private final PubNub pubnub;
            private final RetrofitManager retrofit;
            private final UploadFile.Factory uploadFileFactory;

            private InnerBuilder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
                this.pubnub = pubNub;
                this.retrofit = retrofitManager;
                this.publishFileMessageBuilder = PublishFileMessage.builder(pubNub, telemetryManager, retrofitManager, tokenManager);
                this.uploadFileFactory = new UploadFile.Factory(pubNub, retrofitManager);
                this.generateUploadUrlFactory = new GenerateUploadUrl.Factory(pubNub, telemetryManager, retrofitManager, tokenManager);
            }

            public FilesBuilderSteps.FileNameStep<FilesBuilderSteps.InputStreamStep<SendFile>> channel(String str) {
                this.channelValue = str;
                return this;
            }

            public FilesBuilderSteps.InputStreamStep<SendFile> fileName(String str) {
                this.fileNameValue = str;
                return this;
            }

            public SendFile inputStream(InputStream inputStream) {
                try {
                    return new SendFile(new SendFileRequiredParams(this.channelValue, this.fileNameValue, PubNubUtil.readBytes(inputStream), (Exception) null), this.generateUploadUrlFactory, this.publishFileMessageBuilder, this.uploadFileFactory, this.retrofit.getTransactionClientExecutorService(), this.pubnub.getConfiguration().getFileMessagePublishRetryLimit());
                } catch (IOException e) {
                    return new SendFile(new SendFileRequiredParams(this.channelValue, this.fileNameValue, (byte[]) null, e), this.generateUploadUrlFactory, this.publishFileMessageBuilder, this.uploadFileFactory, this.retrofit.getTransactionClientExecutorService(), this.pubnub.getConfiguration().getFileMessagePublishRetryLimit());
                }
            }
        }

        public static class SendFileRequiredParams {
            /* access modifiers changed from: private */
            public final Exception byteReadingException;
            private final String channel;
            private final byte[] content;
            private final String fileName;

            public SendFileRequiredParams(String str, String str2, byte[] bArr, Exception exc) {
                this.channel = str;
                this.fileName = str2;
                this.content = bArr;
                this.byteReadingException = exc;
            }

            public Exception byteReadingException() {
                return this.byteReadingException;
            }

            public boolean canEqual(Object obj) {
                return obj instanceof SendFileRequiredParams;
            }

            public String channel() {
                return this.channel;
            }

            public byte[] content() {
                return this.content;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SendFileRequiredParams)) {
                    return false;
                }
                SendFileRequiredParams sendFileRequiredParams = (SendFileRequiredParams) obj;
                if (!sendFileRequiredParams.canEqual(this)) {
                    return false;
                }
                String channel2 = channel();
                String channel3 = sendFileRequiredParams.channel();
                if (channel2 != null ? !channel2.equals(channel3) : channel3 != null) {
                    return false;
                }
                String fileName2 = fileName();
                String fileName3 = sendFileRequiredParams.fileName();
                if (fileName2 != null ? !fileName2.equals(fileName3) : fileName3 != null) {
                    return false;
                }
                if (!Arrays.equals(content(), sendFileRequiredParams.content())) {
                    return false;
                }
                Exception byteReadingException2 = byteReadingException();
                Exception byteReadingException3 = sendFileRequiredParams.byteReadingException();
                return byteReadingException2 != null ? byteReadingException2.equals(byteReadingException3) : byteReadingException3 == null;
            }

            public String fileName() {
                return this.fileName;
            }

            public int hashCode() {
                String channel2 = channel();
                int i = 43;
                int hashCode = channel2 == null ? 43 : channel2.hashCode();
                String fileName2 = fileName();
                int hashCode2 = Arrays.hashCode(content()) + ((((hashCode + 59) * 59) + (fileName2 == null ? 43 : fileName2.hashCode())) * 59);
                Exception byteReadingException2 = byteReadingException();
                int i2 = hashCode2 * 59;
                if (byteReadingException2 != null) {
                    i = byteReadingException2.hashCode();
                }
                return i2 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("SendFile.Builder.SendFileRequiredParams(channel=");
                P0.append(channel());
                P0.append(", fileName=");
                P0.append(fileName());
                P0.append(", content=");
                P0.append(Arrays.toString(content()));
                P0.append(", byteReadingException=");
                P0.append(byteReadingException());
                P0.append(")");
                return P0.toString();
            }
        }

        public Builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager2) {
            this.pubnub = pubNub;
            this.telemetry = telemetryManager;
            this.retrofit = retrofitManager;
            this.tokenManager = tokenManager2;
        }

        public FilesBuilderSteps.FileNameStep<FilesBuilderSteps.InputStreamStep<SendFile>> channel(String str) {
            return new InnerBuilder(this.pubnub, this.telemetry, this.retrofit, this.tokenManager).channel(str);
        }
    }

    public SendFile(Builder.SendFileRequiredParams sendFileRequiredParams, GenerateUploadUrl.Factory factory, BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<PublishFileMessage>>> channelStep, UploadFile.Factory factory2, ExecutorService executorService2, int i) {
        this.channel = sendFileRequiredParams.channel();
        this.fileName = sendFileRequiredParams.fileName();
        this.content = sendFileRequiredParams.content();
        this.byteContentReadingException = sendFileRequiredParams.byteReadingException;
        this.executorService = executorService2;
        this.fileMessagePublishRetryLimit = i;
        this.sendFileMultistepAction = sendFileComposedActions(factory, channelStep, factory2);
    }

    private <T> RemoteAction<T> autoRetry(RemoteAction<T> remoteAction, int i) {
        return RetryingRemoteAction.autoRetry(remoteAction, i, PNOperationType.PNFileAction, this.executorService);
    }

    public static Builder builder(PubNub pubNub, TelemetryManager telemetryManager, RetrofitManager retrofitManager, TokenManager tokenManager) {
        return new Builder(pubNub, telemetryManager, retrofitManager, tokenManager);
    }

    /* access modifiers changed from: private */
    /* renamed from: mapPublishFileMessageToFileUpload */
    public RemoteAction<PNFileUploadResult> d(AtomicReference<FileUploadRequestDetails> atomicReference, PNPublishFileMessageResult pNPublishFileMessageResult) {
        return MappingRemoteAction.map(pNPublishFileMessageResult, new h(atomicReference));
    }

    private PublishFileMessage publishFileMessage(BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<PublishFileMessage>>> channelStep, AtomicReference<FileUploadRequestDetails> atomicReference) {
        return ((PublishFileMessage) ((FilesBuilderSteps.FileIdStep) channelStep.channel(this.channel).fileName(atomicReference.get().getData().getName())).fileId(atomicReference.get().getData().getId())).message(this.message).meta(this.meta).ttl(this.ttl).shouldStore(this.shouldStore);
    }

    private RemoteAction<PNFileUploadResult> sendFileComposedActions(GenerateUploadUrl.Factory factory, BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<PublishFileMessage>>> channelStep, UploadFile.Factory factory2) {
        AtomicReference atomicReference = new AtomicReference();
        return ComposableRemoteAction.firstDo(factory.create(this.channel, this.fileName)).then(new f(this, atomicReference, factory2)).checkpoint().then(new g(this, channelStep, atomicReference)).then(new j(this, atomicReference));
    }

    private RemoteAction<Void> sendToS3(FileUploadRequestDetails fileUploadRequestDetails, UploadFile.Factory factory) {
        return factory.create(this.fileName, this.content, this.cipherKey, fileUploadRequestDetails);
    }

    private void validate() throws PubNubException {
        String str = this.channel;
        if (str == null || str.isEmpty()) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_CHANNEL_MISSING).build();
        } else if (this.byteContentReadingException != null) {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ARGUMENTS).errormsg(this.byteContentReadingException.getMessage()).build();
        } else if (this.content != null) {
            String str2 = this.fileName;
            if (str2 == null || str2.isEmpty()) {
                throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ARGUMENTS).errormsg("File name cannot be null nor empty").build();
            }
        } else {
            throw PubNubException.builder().pubnubError(PubNubErrorBuilder.PNERROBJ_INVALID_ARGUMENTS).errormsg("Content cannot be null").build();
        }
    }

    public /* synthetic */ void a(PNCallback pNCallback) {
        try {
            validate();
            this.sendFileMultistepAction.async(pNCallback);
        } catch (PubNubException e) {
            pNCallback.onResponse(null, PNStatus.builder().error(true).errorData(new PNErrorData(e.getErrormsg(), e)).build());
        }
    }

    public void async(PNCallback<PNFileUploadResult> pNCallback) {
        this.executorService.execute(new i(this, pNCallback));
    }

    public /* synthetic */ RemoteAction b(AtomicReference atomicReference, UploadFile.Factory factory, FileUploadRequestDetails fileUploadRequestDetails) {
        atomicReference.set(fileUploadRequestDetails);
        return sendToS3(fileUploadRequestDetails, factory);
    }

    public /* synthetic */ RemoteAction c(BuilderSteps.ChannelStep channelStep, AtomicReference atomicReference, Void voidR) {
        return autoRetry(publishFileMessage(channelStep, atomicReference), this.fileMessagePublishRetryLimit);
    }

    public SendFile cipherKey(String str) {
        this.cipherKey = str;
        return this;
    }

    public SendFile message(Object obj) {
        this.message = obj;
        return this;
    }

    public SendFile meta(Object obj) {
        this.meta = obj;
        return this;
    }

    public void retry() {
        this.sendFileMultistepAction.retry();
    }

    public SendFile shouldStore(Boolean bool) {
        this.shouldStore = bool;
        return this;
    }

    public void silentCancel() {
        this.sendFileMultistepAction.silentCancel();
    }

    public SendFile ttl(Integer num) {
        this.ttl = num;
        return this;
    }

    public PNFileUploadResult sync() throws PubNubException {
        validate();
        return this.sendFileMultistepAction.sync();
    }
}
