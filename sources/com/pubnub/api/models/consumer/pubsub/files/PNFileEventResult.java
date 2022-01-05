package com.pubnub.api.models.consumer.pubsub.files;

import com.pubnub.api.models.consumer.files.PNDownloadableFile;
import i0.d.a.a.a;
import java.util.Objects;
import lombok.NonNull;

public class PNFileEventResult {
    @NonNull
    private final String channel;
    @NonNull
    private final PNDownloadableFile file;
    private final Object message;
    private final String publisher;
    @NonNull
    private final Long timetoken;

    public static class PNFileEventResultBuilder {
        private String channel;
        private PNDownloadableFile file;
        private Object message;
        private String publisher;
        private Long timetoken;

        public PNFileEventResult build() {
            return new PNFileEventResult(this.channel, this.timetoken, this.publisher, this.message, this.file);
        }

        public PNFileEventResultBuilder channel(@NonNull String str) {
            Objects.requireNonNull(str, "channel is marked @NonNull but is null");
            this.channel = str;
            return this;
        }

        public PNFileEventResultBuilder file(@NonNull PNDownloadableFile pNDownloadableFile) {
            Objects.requireNonNull(pNDownloadableFile, "file is marked @NonNull but is null");
            this.file = pNDownloadableFile;
            return this;
        }

        public PNFileEventResultBuilder message(Object obj) {
            this.message = obj;
            return this;
        }

        public PNFileEventResultBuilder publisher(String str) {
            this.publisher = str;
            return this;
        }

        public PNFileEventResultBuilder timetoken(@NonNull Long l) {
            Objects.requireNonNull(l, "timetoken is marked @NonNull but is null");
            this.timetoken = l;
            return this;
        }

        public String toString() {
            StringBuilder P0 = a.P0("PNFileEventResult.PNFileEventResultBuilder(channel=");
            P0.append(this.channel);
            P0.append(", timetoken=");
            P0.append(this.timetoken);
            P0.append(", publisher=");
            P0.append(this.publisher);
            P0.append(", message=");
            P0.append(this.message);
            P0.append(", file=");
            P0.append(this.file);
            P0.append(")");
            return P0.toString();
        }
    }

    public PNFileEventResult(@NonNull String str, @NonNull Long l, String str2, Object obj, @NonNull PNDownloadableFile pNDownloadableFile) {
        Objects.requireNonNull(str, "channel is marked @NonNull but is null");
        Objects.requireNonNull(l, "timetoken is marked @NonNull but is null");
        Objects.requireNonNull(pNDownloadableFile, "file is marked @NonNull but is null");
        this.channel = str;
        this.timetoken = l;
        this.publisher = str2;
        this.message = obj;
        this.file = pNDownloadableFile;
    }

    public static PNFileEventResultBuilder builder() {
        return new PNFileEventResultBuilder();
    }

    public boolean canEqual(Object obj) {
        return obj instanceof PNFileEventResult;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PNFileEventResult)) {
            return false;
        }
        PNFileEventResult pNFileEventResult = (PNFileEventResult) obj;
        if (!pNFileEventResult.canEqual(this)) {
            return false;
        }
        String channel2 = getChannel();
        String channel3 = pNFileEventResult.getChannel();
        if (channel2 != null ? !channel2.equals(channel3) : channel3 != null) {
            return false;
        }
        Long timetoken2 = getTimetoken();
        Long timetoken3 = pNFileEventResult.getTimetoken();
        if (timetoken2 != null ? !timetoken2.equals(timetoken3) : timetoken3 != null) {
            return false;
        }
        String publisher2 = getPublisher();
        String publisher3 = pNFileEventResult.getPublisher();
        if (publisher2 != null ? !publisher2.equals(publisher3) : publisher3 != null) {
            return false;
        }
        Object message2 = getMessage();
        Object message3 = pNFileEventResult.getMessage();
        if (message2 != null ? !message2.equals(message3) : message3 != null) {
            return false;
        }
        PNDownloadableFile file2 = getFile();
        PNDownloadableFile file3 = pNFileEventResult.getFile();
        return file2 != null ? file2.equals(file3) : file3 == null;
    }

    @NonNull
    public String getChannel() {
        return this.channel;
    }

    @NonNull
    public PNDownloadableFile getFile() {
        return this.file;
    }

    public Object getMessage() {
        return this.message;
    }

    public String getPublisher() {
        return this.publisher;
    }

    @NonNull
    public Long getTimetoken() {
        return this.timetoken;
    }

    public int hashCode() {
        String channel2 = getChannel();
        int i = 43;
        int hashCode = channel2 == null ? 43 : channel2.hashCode();
        Long timetoken2 = getTimetoken();
        int hashCode2 = ((hashCode + 59) * 59) + (timetoken2 == null ? 43 : timetoken2.hashCode());
        String publisher2 = getPublisher();
        int hashCode3 = (hashCode2 * 59) + (publisher2 == null ? 43 : publisher2.hashCode());
        Object message2 = getMessage();
        int hashCode4 = (hashCode3 * 59) + (message2 == null ? 43 : message2.hashCode());
        PNDownloadableFile file2 = getFile();
        int i2 = hashCode4 * 59;
        if (file2 != null) {
            i = file2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PNFileEventResult(channel=");
        P0.append(getChannel());
        P0.append(", timetoken=");
        P0.append(getTimetoken());
        P0.append(", publisher=");
        P0.append(getPublisher());
        P0.append(", message=");
        P0.append(getMessage());
        P0.append(", file=");
        P0.append(getFile());
        P0.append(")");
        return P0.toString();
    }
}
