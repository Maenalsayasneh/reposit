package i0.j.e.q0;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import com.instabug.library.internal.orchestrator.ActionsOrchestrator;
import com.instabug.library.internal.storage.Encryptor;
import com.instabug.library.internal.storage.operation.DiskOperation;
import com.instabug.library.internal.storage.operation.DiskOperationCallback;
import com.instabug.library.util.memory.Action;
import com.instabug.library.util.memory.MemoryGuard;
import com.instabug.library.util.memory.MemoryUtils;
import com.instabug.library.util.memory.predicate.MemoryNotLowPredicate;
import com.instabug.library.util.memory.predicate.StringMemoryAvailablePredicate;
import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.j.e.t0.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: WriteLogDiskOperator */
public class l implements DiskOperation<Uri, Context> {
    public final File a;
    public List<b> b;

    /* compiled from: WriteLogDiskOperator */
    public class a implements Action {
        public final /* synthetic */ FileOutputStream a;
        public final /* synthetic */ String b;

        public a(FileOutputStream fileOutputStream, String str) {
            this.a = fileOutputStream;
            this.b = str;
        }

        public void onAffirmed() throws Throwable {
            FileOutputStream fileOutputStream = this.a;
            String str = this.b;
            int i = Encryptor.a;
            IvParameterSpec ivParameterSpec = new IvParameterSpec(Encryptor.getCBCIVParamterKey().getBytes(FileEncryptionUtil.ENCODING_UTF_8));
            SecretKeySpec secretKeySpec = new SecretKeySpec(Encryptor.getCBCSecretKey().getBytes(FileEncryptionUtil.ENCODING_UTF_8), "AES/ECB/NoPadding");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            instance.init(1, secretKeySpec, ivParameterSpec);
            fileOutputStream.write(Base64.encodeToString(instance.doFinal(str.getBytes(FileEncryptionUtil.ENCODING_UTF_8)), 2).getBytes(FileEncryptionUtil.ENCODING_UTF_8));
            this.a.write("\n\r".getBytes(FileEncryptionUtil.ENCODING_UTF_8));
        }

        public void onDenied() throws Throwable {
            Log.w("g", "Running on low memory");
        }
    }

    public l(File file, List<b> list) {
        this.a = file;
        this.b = list;
    }

    public final void a(List<b> list, Context context) throws IOException {
        if (context == null) {
            Log.w("g", "Null context. Skipping operation...");
        } else if (!MemoryUtils.isLowMemory(context)) {
            FileOutputStream fileOutputStream = new FileOutputStream(this.a, true);
            try {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i) == null ? "" : list.get(i).toString());
                }
                String sb2 = sb.toString();
                MemoryGuard.from(context).withPredicates(new MemoryNotLowPredicate(), new StringMemoryAvailablePredicate(sb2)).doAction(new a(fileOutputStream, sb2));
            } finally {
                fileOutputStream.close();
            }
        } else {
            Log.w("g", "Running on low memory");
        }
    }

    public Object execute(Object obj) throws IOException {
        try {
            a(this.b, (Context) obj);
        } catch (IOException e) {
            Log.w("g", "execute: ", e);
        }
        return Uri.fromFile(this.a);
    }

    public void executeAsync(Object obj, DiskOperationCallback diskOperationCallback) {
        ActionsOrchestrator.obtainOrchestrator().addWorkerThreadAction(new k(this, (Context) obj, diskOperationCallback)).orchestrate();
    }
}
