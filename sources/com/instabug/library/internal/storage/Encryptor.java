package com.instabug.library.internal.storage;

import com.instabug.library.util.FileUtils;
import com.instabug.library.util.InstabugSDKLogger;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

@SuppressFBWarnings({"RR_NOT_CHECKED", "RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
public class Encryptor {
    public static final /* synthetic */ int a = 0;

    static {
        try {
            System.loadLibrary("ibg-native");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public static void a(int i, Key key) {
        try {
            Cipher.getInstance("AES/ECB/NoPadding").init(i, key);
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
            InstabugSDKLogger.e("Encryptor", String.format("Error: %s occurred while resetting the Cipher instance.", new Object[]{e}));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.io.File r1, byte[] r2) throws java.io.IOException {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x000e }
            r0.<init>(r1)     // Catch:{ all -> 0x000e }
            r0.read(r2)     // Catch:{ all -> 0x000c }
            r0.close()
            return
        L_0x000c:
            r1 = move-exception
            goto L_0x0010
        L_0x000e:
            r1 = move-exception
            r0 = 0
        L_0x0010:
            if (r0 == 0) goto L_0x0015
            r0.close()
        L_0x0015:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.Encryptor.b(java.io.File, byte[]):void");
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.security.Key] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0077, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008a, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        a(r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a1, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a6, code lost:
        r10 = "encrypting";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a9, code lost:
        if (r10 == 2) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ab, code lost:
        r10 = "decrypting";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ae, code lost:
        r10 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ce, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d6, code lost:
        r10.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e1, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e5, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e9, code lost:
        r11.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0089 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0011] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009d A[SYNTHETIC, Splitter:B:35:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca A[SYNTHETIC, Splitter:B:48:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d2 A[Catch:{ IOException -> 0x00ce }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dd A[SYNTHETIC, Splitter:B:57:0x00dd] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e5 A[Catch:{ IOException -> 0x00e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean c(int r10, java.io.File r11) {
        /*
            java.lang.String r0 = "AES/ECB/NoPadding"
            android.content.Context r1 = com.instabug.library.Instabug.getApplicationContext()
            r2 = 0
            if (r1 == 0) goto L_0x00ed
            boolean r1 = com.instabug.library.util.memory.MemoryUtils.isLowMemory(r1)
            if (r1 != 0) goto L_0x00ed
            r1 = 1
            r3 = 0
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec     // Catch:{ NoSuchPaddingException -> 0x0098, NoSuchAlgorithmException -> 0x0096, InvalidKeyException -> 0x0094, IOException -> 0x0092, BadPaddingException -> 0x0090, IllegalBlockSizeException -> 0x008e, OutOfMemoryError -> 0x008c, all -> 0x0089 }
            java.lang.String r5 = getKey()     // Catch:{ NoSuchPaddingException -> 0x0098, NoSuchAlgorithmException -> 0x0096, InvalidKeyException -> 0x0094, IOException -> 0x0092, BadPaddingException -> 0x0090, IllegalBlockSizeException -> 0x008e, OutOfMemoryError -> 0x008c, all -> 0x0089 }
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch:{ NoSuchPaddingException -> 0x0098, NoSuchAlgorithmException -> 0x0096, InvalidKeyException -> 0x0094, IOException -> 0x0092, BadPaddingException -> 0x0090, IllegalBlockSizeException -> 0x008e, OutOfMemoryError -> 0x008c, all -> 0x0089 }
            r4.<init>(r5, r0)     // Catch:{ NoSuchPaddingException -> 0x0098, NoSuchAlgorithmException -> 0x0096, InvalidKeyException -> 0x0094, IOException -> 0x0092, BadPaddingException -> 0x0090, IllegalBlockSizeException -> 0x008e, OutOfMemoryError -> 0x008c, all -> 0x0089 }
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ NoSuchPaddingException -> 0x0083, NoSuchAlgorithmException -> 0x0081, InvalidKeyException -> 0x007f, IOException -> 0x007d, BadPaddingException -> 0x007b, IllegalBlockSizeException -> 0x0079, OutOfMemoryError -> 0x0077, all -> 0x0089 }
            r0.init(r10, r4)     // Catch:{ NoSuchPaddingException -> 0x0083, NoSuchAlgorithmException -> 0x0081, InvalidKeyException -> 0x007f, IOException -> 0x007d, BadPaddingException -> 0x007b, IllegalBlockSizeException -> 0x0079, OutOfMemoryError -> 0x0077, all -> 0x0089 }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ NoSuchPaddingException -> 0x0083, NoSuchAlgorithmException -> 0x0081, InvalidKeyException -> 0x007f, IOException -> 0x007d, BadPaddingException -> 0x007b, IllegalBlockSizeException -> 0x0079, OutOfMemoryError -> 0x0077, all -> 0x0089 }
            r5.<init>(r11)     // Catch:{ NoSuchPaddingException -> 0x0083, NoSuchAlgorithmException -> 0x0081, InvalidKeyException -> 0x007f, IOException -> 0x007d, BadPaddingException -> 0x007b, IllegalBlockSizeException -> 0x0079, OutOfMemoryError -> 0x0077, all -> 0x0089 }
            r6 = 256(0x100, float:3.59E-43)
            byte[] r7 = new byte[r6]     // Catch:{ NoSuchPaddingException -> 0x0072, NoSuchAlgorithmException -> 0x0070, InvalidKeyException -> 0x006e, IOException -> 0x006c, BadPaddingException -> 0x006a, IllegalBlockSizeException -> 0x0068, OutOfMemoryError -> 0x0066, all -> 0x0060 }
            r5.read(r7, r2, r6)     // Catch:{ NoSuchPaddingException -> 0x0072, NoSuchAlgorithmException -> 0x0070, InvalidKeyException -> 0x006e, IOException -> 0x006c, BadPaddingException -> 0x006a, IllegalBlockSizeException -> 0x0068, OutOfMemoryError -> 0x0066, all -> 0x0060 }
            byte[] r0 = r0.doFinal(r7)     // Catch:{ NoSuchPaddingException -> 0x0072, NoSuchAlgorithmException -> 0x0070, InvalidKeyException -> 0x006e, IOException -> 0x006c, BadPaddingException -> 0x006a, IllegalBlockSizeException -> 0x0068, OutOfMemoryError -> 0x0066, all -> 0x0060 }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ NoSuchPaddingException -> 0x0072, NoSuchAlgorithmException -> 0x0070, InvalidKeyException -> 0x006e, IOException -> 0x006c, BadPaddingException -> 0x006a, IllegalBlockSizeException -> 0x0068, OutOfMemoryError -> 0x0066, all -> 0x0060 }
            java.lang.String r7 = "rws"
            r6.<init>(r11, r7)     // Catch:{ NoSuchPaddingException -> 0x0072, NoSuchAlgorithmException -> 0x0070, InvalidKeyException -> 0x006e, IOException -> 0x006c, BadPaddingException -> 0x006a, IllegalBlockSizeException -> 0x0068, OutOfMemoryError -> 0x0066, all -> 0x0060 }
            int r3 = r0.length     // Catch:{ NoSuchPaddingException -> 0x005d, NoSuchAlgorithmException -> 0x005b, InvalidKeyException -> 0x0059, IOException -> 0x0057, BadPaddingException -> 0x0055, IllegalBlockSizeException -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004e }
            r6.write(r0, r2, r3)     // Catch:{ NoSuchPaddingException -> 0x005d, NoSuchAlgorithmException -> 0x005b, InvalidKeyException -> 0x0059, IOException -> 0x0057, BadPaddingException -> 0x0055, IllegalBlockSizeException -> 0x0053, OutOfMemoryError -> 0x0051, all -> 0x004e }
            r5.close()     // Catch:{ IOException -> 0x0049 }
            r6.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r10 = move-exception
            r10.printStackTrace()
        L_0x004d:
            return r1
        L_0x004e:
            r10 = move-exception
            r3 = r6
            goto L_0x0061
        L_0x0051:
            r0 = move-exception
            goto L_0x005e
        L_0x0053:
            r0 = move-exception
            goto L_0x005e
        L_0x0055:
            r0 = move-exception
            goto L_0x005e
        L_0x0057:
            r0 = move-exception
            goto L_0x005e
        L_0x0059:
            r0 = move-exception
            goto L_0x005e
        L_0x005b:
            r0 = move-exception
            goto L_0x005e
        L_0x005d:
            r0 = move-exception
        L_0x005e:
            r3 = r6
            goto L_0x0073
        L_0x0060:
            r10 = move-exception
        L_0x0061:
            r9 = r5
            r5 = r3
            r3 = r9
            goto L_0x00db
        L_0x0066:
            r0 = move-exception
            goto L_0x0073
        L_0x0068:
            r0 = move-exception
            goto L_0x0073
        L_0x006a:
            r0 = move-exception
            goto L_0x0073
        L_0x006c:
            r0 = move-exception
            goto L_0x0073
        L_0x006e:
            r0 = move-exception
            goto L_0x0073
        L_0x0070:
            r0 = move-exception
            goto L_0x0073
        L_0x0072:
            r0 = move-exception
        L_0x0073:
            r9 = r5
            r5 = r3
            r3 = r9
            goto L_0x0085
        L_0x0077:
            r0 = move-exception
            goto L_0x0084
        L_0x0079:
            r0 = move-exception
            goto L_0x0084
        L_0x007b:
            r0 = move-exception
            goto L_0x0084
        L_0x007d:
            r0 = move-exception
            goto L_0x0084
        L_0x007f:
            r0 = move-exception
            goto L_0x0084
        L_0x0081:
            r0 = move-exception
            goto L_0x0084
        L_0x0083:
            r0 = move-exception
        L_0x0084:
            r5 = r3
        L_0x0085:
            r9 = r4
            r4 = r3
            r3 = r9
            goto L_0x009b
        L_0x0089:
            r10 = move-exception
            r5 = r3
            goto L_0x00db
        L_0x008c:
            r0 = move-exception
            goto L_0x0099
        L_0x008e:
            r0 = move-exception
            goto L_0x0099
        L_0x0090:
            r0 = move-exception
            goto L_0x0099
        L_0x0092:
            r0 = move-exception
            goto L_0x0099
        L_0x0094:
            r0 = move-exception
            goto L_0x0099
        L_0x0096:
            r0 = move-exception
            goto L_0x0099
        L_0x0098:
            r0 = move-exception
        L_0x0099:
            r4 = r3
            r5 = r4
        L_0x009b:
            if (r3 == 0) goto L_0x00a3
            a(r10, r3)     // Catch:{ all -> 0x00a1 }
            goto L_0x00a3
        L_0x00a1:
            r10 = move-exception
            goto L_0x00da
        L_0x00a3:
            r3 = 2
            if (r10 != r1) goto L_0x00a9
            java.lang.String r10 = "encrypting"
            goto L_0x00b0
        L_0x00a9:
            if (r10 != r3) goto L_0x00ae
            java.lang.String r10 = "decrypting"
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r10 = ""
        L_0x00b0:
            java.lang.String r6 = "Encryptor"
            java.lang.String r7 = "Error: %s occurred while %s file in path: %s"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00a1 }
            r8[r2] = r0     // Catch:{ all -> 0x00a1 }
            r8[r1] = r10     // Catch:{ all -> 0x00a1 }
            java.lang.String r10 = r11.getPath()     // Catch:{ all -> 0x00a1 }
            r8[r3] = r10     // Catch:{ all -> 0x00a1 }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00a1 }
            com.instabug.library.util.InstabugSDKLogger.e(r6, r10)     // Catch:{ all -> 0x00a1 }
            if (r4 == 0) goto L_0x00d0
            r4.close()     // Catch:{ IOException -> 0x00ce }
            goto L_0x00d0
        L_0x00ce:
            r10 = move-exception
            goto L_0x00d6
        L_0x00d0:
            if (r5 == 0) goto L_0x00ed
            r5.close()     // Catch:{ IOException -> 0x00ce }
            goto L_0x00ed
        L_0x00d6:
            r10.printStackTrace()
            goto L_0x00ed
        L_0x00da:
            r3 = r4
        L_0x00db:
            if (r3 == 0) goto L_0x00e3
            r3.close()     // Catch:{ IOException -> 0x00e1 }
            goto L_0x00e3
        L_0x00e1:
            r11 = move-exception
            goto L_0x00e9
        L_0x00e3:
            if (r5 == 0) goto L_0x00ec
            r5.close()     // Catch:{ IOException -> 0x00e1 }
            goto L_0x00ec
        L_0x00e9:
            r11.printStackTrace()
        L_0x00ec:
            throw r10
        L_0x00ed:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.Encryptor.c(int, java.io.File):boolean");
    }

    public static boolean d(String str) throws UnsatisfiedLinkError {
        File file = new File(str);
        boolean c = c(2, file);
        if (c && FileUtils.isReproStepFile(str)) {
            file.renameTo(new File(FileUtils.getPathWithDecryptedFlag(str)));
        }
        return c;
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.FileInputStream] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.security.Key] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x009c, code lost:
        r10 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a9, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ae, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00af, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        a(2, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c7, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f1, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f5, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f9, code lost:
        r10.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0104, code lost:
        r6 = r5;
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0113, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0117, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ae A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x000a] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3 A[SYNTHETIC, Splitter:B:31:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ed A[SYNTHETIC, Splitter:B:38:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f5 A[Catch:{ IOException -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010b A[SYNTHETIC, Splitter:B:50:0x010b] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113 A[Catch:{ IOException -> 0x010f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instabug.library.internal.storage.ProcessedBytes e(java.lang.String r10) throws java.lang.UnsatisfiedLinkError {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r10)
            java.lang.String r10 = "AES/ECB/NoPadding"
            r1 = 2
            r2 = 0
            r3 = 0
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec     // Catch:{ NoSuchPaddingException -> 0x00be, NoSuchAlgorithmException -> 0x00bc, InvalidKeyException -> 0x00ba, IOException -> 0x00b8, BadPaddingException -> 0x00b6, IllegalBlockSizeException -> 0x00b4, OutOfMemoryError -> 0x00b2, all -> 0x00ae }
            java.lang.String r5 = getKey()     // Catch:{ NoSuchPaddingException -> 0x00be, NoSuchAlgorithmException -> 0x00bc, InvalidKeyException -> 0x00ba, IOException -> 0x00b8, BadPaddingException -> 0x00b6, IllegalBlockSizeException -> 0x00b4, OutOfMemoryError -> 0x00b2, all -> 0x00ae }
            java.lang.String r6 = "UTF-8"
            byte[] r5 = r5.getBytes(r6)     // Catch:{ NoSuchPaddingException -> 0x00be, NoSuchAlgorithmException -> 0x00bc, InvalidKeyException -> 0x00ba, IOException -> 0x00b8, BadPaddingException -> 0x00b6, IllegalBlockSizeException -> 0x00b4, OutOfMemoryError -> 0x00b2, all -> 0x00ae }
            r4.<init>(r5, r10)     // Catch:{ NoSuchPaddingException -> 0x00be, NoSuchAlgorithmException -> 0x00bc, InvalidKeyException -> 0x00ba, IOException -> 0x00b8, BadPaddingException -> 0x00b6, IllegalBlockSizeException -> 0x00b4, OutOfMemoryError -> 0x00b2, all -> 0x00ae }
            javax.crypto.Cipher r10 = javax.crypto.Cipher.getInstance(r10)     // Catch:{ NoSuchPaddingException -> 0x00a8, NoSuchAlgorithmException -> 0x00a6, InvalidKeyException -> 0x00a4, IOException -> 0x00a2, BadPaddingException -> 0x00a0, IllegalBlockSizeException -> 0x009e, OutOfMemoryError -> 0x009c, all -> 0x00ae }
            r10.init(r1, r4)     // Catch:{ NoSuchPaddingException -> 0x00a8, NoSuchAlgorithmException -> 0x00a6, InvalidKeyException -> 0x00a4, IOException -> 0x00a2, BadPaddingException -> 0x00a0, IllegalBlockSizeException -> 0x009e, OutOfMemoryError -> 0x009c, all -> 0x00ae }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ NoSuchPaddingException -> 0x00a8, NoSuchAlgorithmException -> 0x00a6, InvalidKeyException -> 0x00a4, IOException -> 0x00a2, BadPaddingException -> 0x00a0, IllegalBlockSizeException -> 0x009e, OutOfMemoryError -> 0x009c, all -> 0x00ae }
            r5.<init>(r0)     // Catch:{ NoSuchPaddingException -> 0x00a8, NoSuchAlgorithmException -> 0x00a6, InvalidKeyException -> 0x00a4, IOException -> 0x00a2, BadPaddingException -> 0x00a0, IllegalBlockSizeException -> 0x009e, OutOfMemoryError -> 0x009c, all -> 0x00ae }
            r6 = 256(0x100, float:3.59E-43)
            byte[] r7 = new byte[r6]     // Catch:{ NoSuchPaddingException -> 0x0097, NoSuchAlgorithmException -> 0x0095, InvalidKeyException -> 0x0093, IOException -> 0x0091, BadPaddingException -> 0x008f, IllegalBlockSizeException -> 0x008d, OutOfMemoryError -> 0x008b, all -> 0x0088 }
            r5.read(r7, r3, r6)     // Catch:{ NoSuchPaddingException -> 0x0097, NoSuchAlgorithmException -> 0x0095, InvalidKeyException -> 0x0093, IOException -> 0x0091, BadPaddingException -> 0x008f, IllegalBlockSizeException -> 0x008d, OutOfMemoryError -> 0x008b, all -> 0x0088 }
            byte[] r10 = r10.doFinal(r7)     // Catch:{ NoSuchPaddingException -> 0x0097, NoSuchAlgorithmException -> 0x0095, InvalidKeyException -> 0x0093, IOException -> 0x0091, BadPaddingException -> 0x008f, IllegalBlockSizeException -> 0x008d, OutOfMemoryError -> 0x008b, all -> 0x0088 }
            r5.close()     // Catch:{ NoSuchPaddingException -> 0x0097, NoSuchAlgorithmException -> 0x0095, InvalidKeyException -> 0x0093, IOException -> 0x0091, BadPaddingException -> 0x008f, IllegalBlockSizeException -> 0x008d, OutOfMemoryError -> 0x008b, all -> 0x0088 }
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch:{ NoSuchPaddingException -> 0x0097, NoSuchAlgorithmException -> 0x0095, InvalidKeyException -> 0x0093, IOException -> 0x0091, BadPaddingException -> 0x008f, IllegalBlockSizeException -> 0x008d, OutOfMemoryError -> 0x008b, all -> 0x0088 }
            java.lang.String r7 = "rws"
            r6.<init>(r0, r7)     // Catch:{ NoSuchPaddingException -> 0x0097, NoSuchAlgorithmException -> 0x0095, InvalidKeyException -> 0x0093, IOException -> 0x0091, BadPaddingException -> 0x008f, IllegalBlockSizeException -> 0x008d, OutOfMemoryError -> 0x008b, all -> 0x0088 }
            int r2 = r10.length     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            r6.write(r10, r3, r2)     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            long r7 = r0.length()     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            int r10 = (int) r7     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            byte[] r10 = new byte[r10]     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            b(r0, r10)     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            java.lang.String r2 = r0.getPath()     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            boolean r2 = com.instabug.library.util.FileUtils.isReproStepFile(r2)     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            if (r2 == 0) goto L_0x0062
            java.lang.String r2 = r0.getPath()     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            java.lang.String r2 = com.instabug.library.util.FileUtils.getPathWithDecryptedFlag(r2)     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            java.io.File r7 = new java.io.File     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            r7.<init>(r2)     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            r0.renameTo(r7)     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
        L_0x0062:
            com.instabug.library.internal.storage.ProcessedBytes r2 = new com.instabug.library.internal.storage.ProcessedBytes     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            r7 = 1
            r2.<init>(r10, r7)     // Catch:{ NoSuchPaddingException -> 0x0085, NoSuchAlgorithmException -> 0x0083, InvalidKeyException -> 0x0081, IOException -> 0x007f, BadPaddingException -> 0x007d, IllegalBlockSizeException -> 0x007b, OutOfMemoryError -> 0x0079, all -> 0x0076 }
            r5.close()     // Catch:{ IOException -> 0x0070 }
            r6.close()     // Catch:{ IOException -> 0x0070 }
            goto L_0x0103
        L_0x0070:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x0103
        L_0x0076:
            r10 = move-exception
            goto L_0x0106
        L_0x0079:
            r10 = move-exception
            goto L_0x0086
        L_0x007b:
            r10 = move-exception
            goto L_0x0086
        L_0x007d:
            r10 = move-exception
            goto L_0x0086
        L_0x007f:
            r10 = move-exception
            goto L_0x0086
        L_0x0081:
            r10 = move-exception
            goto L_0x0086
        L_0x0083:
            r10 = move-exception
            goto L_0x0086
        L_0x0085:
            r10 = move-exception
        L_0x0086:
            r2 = r6
            goto L_0x0098
        L_0x0088:
            r10 = move-exception
            goto L_0x0107
        L_0x008b:
            r10 = move-exception
            goto L_0x0098
        L_0x008d:
            r10 = move-exception
            goto L_0x0098
        L_0x008f:
            r10 = move-exception
            goto L_0x0098
        L_0x0091:
            r10 = move-exception
            goto L_0x0098
        L_0x0093:
            r10 = move-exception
            goto L_0x0098
        L_0x0095:
            r10 = move-exception
            goto L_0x0098
        L_0x0097:
            r10 = move-exception
        L_0x0098:
            r9 = r5
            r5 = r2
            r2 = r9
            goto L_0x00aa
        L_0x009c:
            r10 = move-exception
            goto L_0x00a9
        L_0x009e:
            r10 = move-exception
            goto L_0x00a9
        L_0x00a0:
            r10 = move-exception
            goto L_0x00a9
        L_0x00a2:
            r10 = move-exception
            goto L_0x00a9
        L_0x00a4:
            r10 = move-exception
            goto L_0x00a9
        L_0x00a6:
            r10 = move-exception
            goto L_0x00a9
        L_0x00a8:
            r10 = move-exception
        L_0x00a9:
            r5 = r2
        L_0x00aa:
            r9 = r4
            r4 = r2
            r2 = r9
            goto L_0x00c1
        L_0x00ae:
            r10 = move-exception
            r0 = r2
            goto L_0x0109
        L_0x00b2:
            r10 = move-exception
            goto L_0x00bf
        L_0x00b4:
            r10 = move-exception
            goto L_0x00bf
        L_0x00b6:
            r10 = move-exception
            goto L_0x00bf
        L_0x00b8:
            r10 = move-exception
            goto L_0x00bf
        L_0x00ba:
            r10 = move-exception
            goto L_0x00bf
        L_0x00bc:
            r10 = move-exception
            goto L_0x00bf
        L_0x00be:
            r10 = move-exception
        L_0x00bf:
            r4 = r2
            r5 = r4
        L_0x00c1:
            if (r2 == 0) goto L_0x00c9
            a(r1, r2)     // Catch:{ all -> 0x00c7 }
            goto L_0x00c9
        L_0x00c7:
            r10 = move-exception
            goto L_0x0104
        L_0x00c9:
            java.lang.String r1 = "Encryptor"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c7 }
            r2.<init>()     // Catch:{ all -> 0x00c7 }
            java.lang.String r6 = "Error: "
            r2.append(r6)     // Catch:{ all -> 0x00c7 }
            r2.append(r10)     // Catch:{ all -> 0x00c7 }
            java.lang.String r10 = " occurred while decrypting path: "
            r2.append(r10)     // Catch:{ all -> 0x00c7 }
            java.lang.String r10 = r0.getPath()     // Catch:{ all -> 0x00c7 }
            r2.append(r10)     // Catch:{ all -> 0x00c7 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x00c7 }
            com.instabug.library.util.InstabugSDKLogger.e(r1, r10)     // Catch:{ all -> 0x00c7 }
            if (r4 == 0) goto L_0x00f3
            r4.close()     // Catch:{ IOException -> 0x00f1 }
            goto L_0x00f3
        L_0x00f1:
            r10 = move-exception
            goto L_0x00f9
        L_0x00f3:
            if (r5 == 0) goto L_0x00fc
            r5.close()     // Catch:{ IOException -> 0x00f1 }
            goto L_0x00fc
        L_0x00f9:
            r10.printStackTrace()
        L_0x00fc:
            com.instabug.library.internal.storage.ProcessedBytes r2 = new com.instabug.library.internal.storage.ProcessedBytes
            byte[] r10 = new byte[r3]
            r2.<init>(r10, r3)
        L_0x0103:
            return r2
        L_0x0104:
            r6 = r5
            r5 = r4
        L_0x0106:
            r2 = r6
        L_0x0107:
            r0 = r2
            r2 = r5
        L_0x0109:
            if (r2 == 0) goto L_0x0111
            r2.close()     // Catch:{ IOException -> 0x010f }
            goto L_0x0111
        L_0x010f:
            r0 = move-exception
            goto L_0x0117
        L_0x0111:
            if (r0 == 0) goto L_0x011a
            r0.close()     // Catch:{ IOException -> 0x010f }
            goto L_0x011a
        L_0x0117:
            r0.printStackTrace()
        L_0x011a:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.storage.Encryptor.e(java.lang.String):com.instabug.library.internal.storage.ProcessedBytes");
    }

    public static boolean f(String str) throws UnsatisfiedLinkError {
        File file = new File(str);
        boolean c = c(1, file);
        if (c && FileUtils.isReproStepFile(str)) {
            String pathWithEncryptedFlag = FileUtils.getPathWithEncryptedFlag(str);
            if (!pathWithEncryptedFlag.equals("")) {
                file.renameTo(new File(pathWithEncryptedFlag));
            }
        }
        return c;
    }

    public static native String getCBCIVParamterKey();

    public static native String getCBCSecretKey();

    public static native String getKey();
}
