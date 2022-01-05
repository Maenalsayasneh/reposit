package com.pubnub.api.services;

import com.pubnub.api.models.server.files.GenerateUploadUrlPayload;
import com.pubnub.api.models.server.files.GeneratedUploadUrlResponse;
import com.pubnub.api.models.server.files.ListFilesResult;
import java.util.List;
import java.util.Map;
import q0.f0;
import t0.c0.a;
import t0.c0.b;
import t0.c0.f;
import t0.c0.o;
import t0.c0.s;
import t0.c0.u;
import t0.d;

public interface FilesService {
    public static final String GET_FILE_URL = "/v1/files/{subKey}/channels/{channel}/files/{fileId}/{fileName}";

    @b("/v1/files/{subKey}/channels/{channel}/files/{fileId}/{fileName}")
    d<Void> deleteFile(@s("subKey") String str, @s("channel") String str2, @s("fileId") String str3, @s("fileName") String str4, @u(encoded = true) Map<String, String> map);

    @f("/v1/files/{subKey}/channels/{channel}/files/{fileId}/{fileName}")
    d<f0> downloadFile(@s("subKey") String str, @s("channel") String str2, @s("fileId") String str3, @s("fileName") String str4, @u(encoded = true) Map<String, String> map);

    @o("/v1/files/{subKey}/channels/{channel}/generate-upload-url")
    d<GeneratedUploadUrlResponse> generateUploadUrl(@s("subKey") String str, @s("channel") String str2, @a GenerateUploadUrlPayload generateUploadUrlPayload, @u(encoded = true) Map<String, String> map);

    @f("/v1/files/{subKey}/channels/{channel}/files")
    d<ListFilesResult> listFiles(@s("subKey") String str, @s("channel") String str2, @u(encoded = true) Map<String, String> map);

    @f("/v1/files/publish-file/{pubKey}/{subKey}/0/{channel}/0/{message}")
    d<List<Object>> notifyAboutFileUpload(@s("pubKey") String str, @s("subKey") String str2, @s("channel") String str3, @s(encoded = true, value = "message") String str4, @u(encoded = true) Map<String, String> map);
}
