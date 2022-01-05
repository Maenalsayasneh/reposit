package io.sentry;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.sentry.util.StringUtils;
import java.io.IOException;
import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class SentryEnvelopeItemHeaderAdapter extends TypeAdapter<SentryEnvelopeItemHeader> {
    public SentryEnvelopeItemHeader read(JsonReader jsonReader) throws IOException {
        String str = null;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        SentryItemType sentryItemType = SentryItemType.Unknown;
        jsonReader.beginObject();
        int i = 0;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1106363674:
                    if (nextName.equals("length")) {
                        c = 0;
                        break;
                    }
                    break;
                case -734768633:
                    if (nextName.equals("filename")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 831846208:
                    if (nextName.equals("content_type")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    i = jsonReader.nextInt();
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    try {
                        sentryItemType = SentryItemType.valueOf(StringUtils.capitalize(jsonReader.nextString()));
                        break;
                    } catch (IllegalArgumentException unused) {
                        break;
                    }
                case 3:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new SentryEnvelopeItemHeader(sentryItemType, i, str, str2);
    }

    public void write(JsonWriter jsonWriter, SentryEnvelopeItemHeader sentryEnvelopeItemHeader) throws IOException {
        if (sentryEnvelopeItemHeader == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        if (sentryEnvelopeItemHeader.getContentType() != null) {
            jsonWriter.name("content_type");
            jsonWriter.value(sentryEnvelopeItemHeader.getContentType());
        }
        if (sentryEnvelopeItemHeader.getFileName() != null) {
            jsonWriter.name("filename");
            jsonWriter.value(sentryEnvelopeItemHeader.getFileName());
        }
        if (!SentryItemType.Unknown.equals(sentryEnvelopeItemHeader.getType())) {
            jsonWriter.name("type");
            jsonWriter.value(sentryEnvelopeItemHeader.getType().getItemType().toLowerCase(Locale.ROOT));
        }
        jsonWriter.name("length");
        jsonWriter.value((long) sentryEnvelopeItemHeader.getLength());
        jsonWriter.endObject();
    }
}
