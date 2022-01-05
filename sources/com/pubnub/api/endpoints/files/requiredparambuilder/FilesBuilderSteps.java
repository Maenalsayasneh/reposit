package com.pubnub.api.endpoints.files.requiredparambuilder;

import com.pubnub.api.endpoints.BuilderSteps;
import java.io.IOException;
import java.io.InputStream;

public interface FilesBuilderSteps extends BuilderSteps {

    public interface FileIdStep<T> {
        T fileId(String str);
    }

    public interface FileNameStep<T> {
        T fileName(String str);
    }

    public interface InputStreamStep<T> {
        T inputStream(InputStream inputStream) throws IOException;
    }
}
