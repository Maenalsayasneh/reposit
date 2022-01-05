package com.pubnub.api.endpoints.files.requiredparambuilder;

import com.pubnub.api.endpoints.BuilderSteps;
import com.pubnub.api.endpoints.files.requiredparambuilder.FilesBuilderSteps;
import com.pubnub.api.endpoints.remoteaction.PNFunction3;

public abstract class ChannelFileNameFileIdBuilder<T> implements BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<T>>> {
    private final BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<T>>> builder;

    public static class InnerBuilder<T> implements BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<T>>>, FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<T>>, FilesBuilderSteps.FileIdStep<T> {
        private String channelValue;
        private String fileNameValue;
        private final PNFunction3<String, String, String, T> lastStep;

        public T fileId(String str) {
            return this.lastStep.invoke(this.channelValue, this.fileNameValue, str);
        }

        private InnerBuilder(PNFunction3<String, String, String, T> pNFunction3) {
            this.lastStep = pNFunction3;
        }

        public FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<T>> channel(String str) {
            this.channelValue = str;
            return this;
        }

        public FilesBuilderSteps.FileIdStep<T> fileName(String str) {
            this.fileNameValue = str;
            return this;
        }
    }

    public ChannelFileNameFileIdBuilder(BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<T>>> channelStep) {
        this.builder = channelStep;
    }

    public static <T> BuilderSteps.ChannelStep<FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<T>>> create(PNFunction3<String, String, String, T> pNFunction3) {
        return new InnerBuilder(pNFunction3);
    }

    public FilesBuilderSteps.FileNameStep<FilesBuilderSteps.FileIdStep<T>> channel(String str) {
        return this.builder.channel(str);
    }
}
