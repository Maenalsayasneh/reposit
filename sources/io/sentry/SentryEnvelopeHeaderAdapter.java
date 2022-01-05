package io.sentry;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryPackage;
import java.io.IOException;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class SentryEnvelopeHeaderAdapter extends TypeAdapter<SentryEnvelopeHeader> {
    private boolean hasValidSdkVersion(SdkVersion sdkVersion) {
        return sdkVersion.getName() != null && !sdkVersion.getName().isEmpty() && sdkVersion.getVersion() != null && !sdkVersion.getVersion().isEmpty();
    }

    public SentryEnvelopeHeader read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        SentryId sentryId = null;
        SdkVersion sdkVersion = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("sdk")) {
                jsonReader.beginObject();
                sdkVersion = new SdkVersion();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    nextName2.hashCode();
                    char c = 65535;
                    switch (nextName2.hashCode()) {
                        case 3373707:
                            if (nextName2.equals("name")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 351608024:
                            if (nextName2.equals("version")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 750867693:
                            if (nextName2.equals("packages")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1487029535:
                            if (nextName2.equals("integrations")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            sdkVersion.setName(jsonReader.nextString());
                            break;
                        case 1:
                            sdkVersion.setVersion(jsonReader.nextString());
                            break;
                        case 2:
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                jsonReader.beginObject();
                                String str = null;
                                String str2 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName3 = jsonReader.nextName();
                                    nextName3.hashCode();
                                    if (nextName3.equals("name")) {
                                        str = jsonReader.nextString();
                                    } else if (!nextName3.equals("version")) {
                                        jsonReader.skipValue();
                                    } else {
                                        str2 = jsonReader.nextString();
                                    }
                                }
                                if (!(str == null || str2 == null)) {
                                    sdkVersion.addPackage(str, str2);
                                }
                                jsonReader.endObject();
                            }
                            jsonReader.endArray();
                            break;
                        case 3:
                            jsonReader.beginArray();
                            while (jsonReader.hasNext()) {
                                String nextString = jsonReader.nextString();
                                if (nextString != null) {
                                    sdkVersion.addIntegration(nextString);
                                }
                            }
                            jsonReader.endArray();
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
                jsonReader.endObject();
            } else if (!nextName.equals("event_id")) {
                jsonReader.skipValue();
            } else {
                sentryId = new SentryId(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return new SentryEnvelopeHeader(sentryId, sdkVersion);
    }

    public void write(JsonWriter jsonWriter, SentryEnvelopeHeader sentryEnvelopeHeader) throws IOException {
        if (sentryEnvelopeHeader == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        if (sentryEnvelopeHeader.getEventId() != null) {
            jsonWriter.name("event_id");
            jsonWriter.value(sentryEnvelopeHeader.getEventId().toString());
        }
        SdkVersion sdkVersion = sentryEnvelopeHeader.getSdkVersion();
        if (sdkVersion != null && hasValidSdkVersion(sdkVersion)) {
            jsonWriter.name("sdk").beginObject();
            jsonWriter.name("name").value(sdkVersion.getName());
            jsonWriter.name("version").value(sdkVersion.getVersion());
            List<String> integrations = sdkVersion.getIntegrations();
            if (integrations != null) {
                jsonWriter.name("integrations").beginArray();
                for (String value : integrations) {
                    jsonWriter.value(value);
                }
                jsonWriter.endArray();
            }
            List<SentryPackage> packages = sdkVersion.getPackages();
            if (packages != null) {
                jsonWriter.name("packages").beginArray();
                for (SentryPackage next : packages) {
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(next.getName());
                    jsonWriter.name("version").value(next.getVersion());
                    jsonWriter.endObject();
                }
                jsonWriter.endArray();
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }
}
