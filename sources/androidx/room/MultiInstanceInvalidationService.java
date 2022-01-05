package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import h0.w.c;
import h0.w.d;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {
    public int c = 0;
    public final HashMap<Integer, String> d = new HashMap<>();
    public final RemoteCallbackList<c> q = new a();
    public final d x = new b();

    public class a extends RemoteCallbackList<c> {
        public a() {
        }

        public void onCallbackDied(IInterface iInterface, Object obj) {
            c cVar = (c) iInterface;
            MultiInstanceInvalidationService.this.d.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    public class b extends d {
        public b() {
        }

        public void L(int i, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.q) {
                String str = MultiInstanceInvalidationService.this.d.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.q.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.q.getBroadcastCookie(i2)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.d.get(Integer.valueOf(intValue));
                        if (i != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.q.getBroadcastItem(i2).s(strArr);
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Error invoking a remote callback", e);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.q.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.q.finishBroadcast();
            }
        }

        public int d0(c cVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.q) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i = multiInstanceInvalidationService.c + 1;
                multiInstanceInvalidationService.c = i;
                if (multiInstanceInvalidationService.q.register(cVar, Integer.valueOf(i))) {
                    MultiInstanceInvalidationService.this.d.put(Integer.valueOf(i), str);
                    return i;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.c--;
                return 0;
            }
        }

        public void j0(c cVar, int i) {
            synchronized (MultiInstanceInvalidationService.this.q) {
                MultiInstanceInvalidationService.this.q.unregister(cVar);
                MultiInstanceInvalidationService.this.d.remove(Integer.valueOf(i));
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return this.x;
    }
}
