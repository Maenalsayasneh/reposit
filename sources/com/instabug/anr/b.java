package com.instabug.anr;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import com.instabug.anr.e.a;
import com.instabug.library.Instabug;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.IOException;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: InstabugAnrDetectorThread */
public class b extends Thread {
    public boolean c = false;
    public boolean d = false;
    public a q;
    public a.C0091a x;
    public c y;

    public b(a aVar, a.C0091a aVar2, c cVar) {
        this.q = aVar;
        this.x = aVar2;
        this.y = cVar;
    }

    public void interrupt() {
        super.interrupt();
        this.d = true;
    }

    public void run() {
        String str;
        setName("Instabug ANR detector thread");
        while (Instabug.isEnabled() && !isInterrupted() && !this.d) {
            if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
                Objects.requireNonNull(this.y);
                Context applicationContext = Instabug.getApplicationContext();
                ActivityManager.ProcessErrorStateInfo processErrorStateInfo = null;
                if (applicationContext != null) {
                    ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService("activity");
                    if (activityManager.getProcessesInErrorState() != null) {
                        for (ActivityManager.ProcessErrorStateInfo next : activityManager.getProcessesInErrorState()) {
                            if (next.pid == Process.myPid()) {
                                processErrorStateInfo = next;
                            }
                        }
                    }
                }
                if (this.c || this.q == null) {
                    if (processErrorStateInfo == null) {
                        this.c = false;
                    }
                } else if (processErrorStateInfo != null && processErrorStateInfo.condition == 2) {
                    try {
                        a.C0091a aVar = this.x;
                        String str2 = processErrorStateInfo.shortMsg;
                        Objects.requireNonNull(this.y);
                        String str3 = processErrorStateInfo.longMsg;
                        if (str3 != null) {
                            str = str3.length() >= 200 ? processErrorStateInfo.longMsg.substring(0, 199) : processErrorStateInfo.longMsg;
                        } else {
                            str = "";
                        }
                        a a = aVar.a(str2, str);
                        if (a != null) {
                            this.q.onAnrDetected(a);
                        }
                    } catch (JSONException e) {
                        InstabugSDKLogger.e(this, "Couldn't create a new ANR object due to a JSON exception", e);
                    } catch (IOException e2) {
                        InstabugSDKLogger.e(this, "Couldn't create a new ANR object due to an IO exception", e2);
                    }
                    this.c = true;
                }
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException unused) {
                InstabugSDKLogger.w("InstabugAnrDetecorThread", "Can't detect ANR because InstabugANRDetector thread was interrupted.");
            }
        }
    }
}
