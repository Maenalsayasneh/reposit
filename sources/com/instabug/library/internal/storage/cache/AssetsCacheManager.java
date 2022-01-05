package com.instabug.library.internal.storage.cache;

import android.content.Context;
import android.os.Environment;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.network.RequestResponse;
import com.instabug.library.networkv2.request.Header;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import i0.j.e.v0.e.d;
import i0.j.e.v0.e.e;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import k0.b.l;

@SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
public class AssetsCacheManager {
    private static final String ASSETS_MEMORY_CACHE_KEY = "assets_memory_cache";
    private static final Map<String, b> currentDownloadingFiles = new ConcurrentHashMap();

    public interface OnDownloadFinished {
        void onFailed(Throwable th);

        void onSuccess(AssetEntity assetEntity);
    }

    public static class a implements Request.Callbacks<AssetEntity, Throwable> {
        public final /* synthetic */ AssetEntity a;

        public a(AssetEntity assetEntity) {
            this.a = assetEntity;
        }

        public void onFailed(Object obj) {
            Throwable th = (Throwable) obj;
            InstabugSDKLogger.e(this, "downloading asset entity got error: ", th);
            AssetsCacheManager.notifyDownloadFailed(this.a, th);
        }

        public void onSucceeded(Object obj) {
            AssetEntity assetEntity = (AssetEntity) obj;
            AssetsCacheManager.addAssetEntity(assetEntity);
            AssetsCacheManager.notifyDownloadFinishedSuccessfully(assetEntity);
        }
    }

    public static class b {
        public AssetEntity a;
        public k0.b.w.a b;
        public List<OnDownloadFinished> c = new ArrayList();
    }

    public static void addAssetEntity(AssetEntity assetEntity) {
        i0.j.e.l0.k.a.a cache = getCache();
        if (cache != null && assetEntity != null) {
            cache.put(assetEntity.getKey(), assetEntity);
        }
    }

    public static void cleanUpCache(Context context) {
        Cache cache;
        stopRunningDownloads();
        if (CacheManager.getInstance().cacheExists(ASSETS_MEMORY_CACHE_KEY) && (cache = CacheManager.getInstance().getCache(ASSETS_MEMORY_CACHE_KEY)) != null) {
            cache.invalidate();
        }
        clearRedundantFiles(context);
    }

    public static void clearRedundantFiles(Context context) {
        try {
            File[] listFiles = getCacheDirectory(context).listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        } catch (Exception e) {
            InstabugSDKLogger.e(AssetsCacheManager.class, e.getMessage(), e);
        }
    }

    public static AssetEntity createEmptyEntity(Context context, String str, AssetEntity.AssetType assetType) {
        return new AssetEntity(String.valueOf(str.hashCode()), assetType, str, new File(getCacheDirectory(context), String.valueOf(str.hashCode())));
    }

    public static void downloadAssetEntity(Context context, AssetEntity assetEntity, OnDownloadFinished onDownloadFinished) {
        b bVar = new b();
        bVar.a = assetEntity;
        List<OnDownloadFinished> list = bVar.c;
        list.add(onDownloadFinished);
        bVar.c = list;
        if (e.a == null) {
            e.a = new e();
        }
        e eVar = e.a;
        a aVar = new a(assetEntity);
        Objects.requireNonNull(eVar);
        InstabugSDKLogger.d("FilesService", "Downloading file request");
        String url = assetEntity.getUrl();
        Request.RequestMethod requestMethod = Request.RequestMethod.Get;
        NetworkManager.RequestType requestType = NetworkManager.RequestType.FILE_DOWNLOAD;
        String path = assetEntity.getFile().getPath();
        Request request = new Request(url, requestType);
        request.setRequestMethod(requestMethod);
        request.setDownloadedFile(path);
        request.addHeader(new Request.RequestParameter(Header.SDK_VERSION, DeviceStateProvider.getSdkVersion()));
        l<RequestResponse> s = eVar.b.doRequest(request).v(k0.b.d0.a.c()).s(k0.b.v.a.a.a());
        d dVar = new d(aVar, assetEntity);
        s.c(dVar);
        bVar.b = dVar;
        AssetEntity assetEntity2 = bVar.a;
        if (assetEntity2 != null) {
            currentDownloadingFiles.put(assetEntity2.getKey(), bVar);
        }
    }

    public static void getAssetEntity(Context context, AssetEntity assetEntity, OnDownloadFinished onDownloadFinished) {
        Class<AssetsCacheManager> cls = AssetsCacheManager.class;
        i0.j.e.l0.k.a.a cache = getCache();
        AssetEntity assetEntity2 = cache != null ? (AssetEntity) cache.get(assetEntity.getKey()) : null;
        if (assetEntity2 != null) {
            InstabugSDKLogger.d(cls, "Get file from cache");
            onDownloadFinished.onSuccess(assetEntity2);
        } else if (isDownloading(assetEntity.getKey())) {
            InstabugSDKLogger.d(cls, "File currently downloading, wait download to finish");
            waitDownloadToFinish(assetEntity, onDownloadFinished);
        } else {
            InstabugSDKLogger.d(cls, "File not exist download it");
            downloadAssetEntity(context, assetEntity, onDownloadFinished);
        }
    }

    public static i0.j.e.l0.k.a.a getCache() {
        Class<AssetsCacheManager> cls = AssetsCacheManager.class;
        if (!CacheManager.getInstance().cacheExists(ASSETS_MEMORY_CACHE_KEY)) {
            InstabugSDKLogger.d(cls, "In-memory assets cache not found, create it");
            CacheManager.getInstance().addCache(new i0.j.e.l0.k.a.a(ASSETS_MEMORY_CACHE_KEY));
            InstabugSDKLogger.d(cls, "In-memory assets created successfully");
        }
        InstabugSDKLogger.d(cls, "In-memory assets cache found");
        return (i0.j.e.l0.k.a.a) CacheManager.getInstance().getCache(ASSETS_MEMORY_CACHE_KEY);
    }

    public static File getCacheDirectory(Context context) {
        String str;
        Class<AssetsCacheManager> cls = AssetsCacheManager.class;
        if (!Environment.getExternalStorageState().equals("mounted") || context.getExternalCacheDir() == null) {
            InstabugSDKLogger.d(cls, "External storage not available, saving file to internal storage.");
            str = context.getCacheDir().getAbsolutePath();
        } else {
            InstabugSDKLogger.d(cls, "Media Mounted");
            str = context.getExternalCacheDir().getPath();
        }
        File file = new File(i0.d.a.a.a.n0(str, "/instabug/assetCache"));
        if (!file.exists()) {
            boolean mkdirs = file.mkdirs();
            InstabugSDKLogger.d(cls, "Is created: " + mkdirs);
            try {
                new File(file, ".nomedia").createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public static boolean isDownloading(String str) {
        return currentDownloadingFiles.get(str) != null;
    }

    public static void notifyDownloadFailed(AssetEntity assetEntity, Throwable th) {
        b bVar = currentDownloadingFiles.get(assetEntity.getKey());
        if (bVar != null) {
            for (OnDownloadFinished next : bVar.c) {
                if (next != null) {
                    next.onFailed(th);
                    currentDownloadingFiles.remove(assetEntity.getKey());
                }
            }
        }
    }

    public static void notifyDownloadFinishedSuccessfully(AssetEntity assetEntity) {
        b bVar;
        if (assetEntity != null && (bVar = currentDownloadingFiles.get(assetEntity.getKey())) != null) {
            for (OnDownloadFinished next : bVar.c) {
                if (next != null) {
                    next.onSuccess(assetEntity);
                    currentDownloadingFiles.remove(assetEntity.getKey());
                }
            }
        }
    }

    public static void stopRunningDownloads() {
        for (Map.Entry<String, b> value : currentDownloadingFiles.entrySet()) {
            k0.b.w.a aVar = ((b) value.getValue()).b;
            if (aVar != null) {
                aVar.dispose();
            }
        }
        currentDownloadingFiles.clear();
    }

    public static void waitDownloadToFinish(AssetEntity assetEntity, OnDownloadFinished onDownloadFinished) {
        b bVar = currentDownloadingFiles.get(assetEntity.getKey());
        if (bVar != null) {
            List<OnDownloadFinished> list = bVar.c;
            list.add(onDownloadFinished);
            bVar.c = list;
        }
    }
}
