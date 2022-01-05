package i0.j.b.t.k;

import android.net.Uri;
import com.instabug.bug.BugPlugin;
import com.instabug.library.Feature;
import com.instabug.library.InstabugState;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.InstabugStateEventBus;
import com.instabug.library.core.eventbus.ScreenRecordingEventBus;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.library.internal.video.ScreenRecordingEvent;
import com.instabug.library.model.Attachment;
import com.pubnub.api.builder.PubNubErrorBuilder;
import i0.j.b.t.f;
import io.reactivex.disposables.CompositeDisposable;
import java.lang.ref.WeakReference;
import k0.b.y.d;

/* compiled from: BaseReportingContainerPresenter */
public class b extends BasePresenter<f> implements BaseContract.Presenter {
    public final CompositeDisposable c;

    /* compiled from: BaseReportingContainerPresenter */
    public class a implements d<InstabugState> {
        public final /* synthetic */ f c;

        public a(f fVar) {
            this.c = fVar;
        }

        public void b(Object obj) throws Exception {
            if (((InstabugState) obj) == InstabugState.DISABLED) {
                BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
                if (bugPlugin != null) {
                    bugPlugin.setState(0);
                }
                ScreenRecordingEventBus.getInstance().post(new ScreenRecordingEvent(3, (Uri) null));
                this.c.E();
            }
        }
    }

    public b(f fVar) {
        super(fVar);
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.c = compositeDisposable;
        compositeDisposable.add(InstabugStateEventBus.getInstance().getEventObservable().t(new a(fVar), k0.b.z.b.a.e, k0.b.z.b.a.c, k0.b.z.b.a.d));
    }

    public void e(int i) {
        f fVar;
        f fVar2;
        WeakReference<V> weakReference = this.view;
        if (weakReference != null && (fVar = (f) weakReference.get()) != null) {
            if (i != 167) {
                switch (i) {
                    case PubNubErrorBuilder.PNERR_MESSAGE_TIMETOKEN_MISSING:
                        fVar.N();
                        return;
                    case PubNubErrorBuilder.PNERR_MESSAGE_ACTION_TIMETOKEN_MISSING:
                        fVar.u();
                        return;
                    case PubNubErrorBuilder.PNERR_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS:
                        if (i0.j.b.f.g().b != null) {
                            i0.j.b.f.g().b.q = "ask a question";
                            String str = i0.j.b.f.g().b.e2;
                            if (!i0.j.b.f.g().b.f() && str != null) {
                                i0.j.b.f.g().b.a(Uri.parse(str), Attachment.Type.MAIN_SCREENSHOT, false);
                            }
                            WeakReference<V> weakReference2 = this.view;
                            if (!(weakReference2 == null || (fVar2 = (f) weakReference2.get()) == null)) {
                                fVar2.M();
                            }
                            m();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                fVar.k();
            }
        }
    }

    public void m() {
        f fVar;
        WeakReference<V> weakReference = this.view;
        if (weakReference != null && (fVar = (f) weakReference.get()) != null) {
            if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == Feature.State.ENABLED) {
                fVar.l(false);
            } else {
                fVar.l(true);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        CompositeDisposable compositeDisposable = this.c;
        if (compositeDisposable != null && !compositeDisposable.isDisposed()) {
            this.c.dispose();
        }
    }

    public void p() {
        f fVar;
        WeakReference<V> weakReference = this.view;
        if (weakReference != null && (fVar = (f) weakReference.get()) != null && i0.j.b.f.g().b != null) {
            String str = i0.j.b.f.g().b.q;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -191501435) {
                if (hashCode != 97908) {
                    if (hashCode != 253684815) {
                        if (hashCode == 1621082316 && str.equals("ask a question")) {
                            c2 = 2;
                        }
                    } else if (str.equals("not-available")) {
                        c2 = 3;
                    }
                } else if (str.equals("bug")) {
                    c2 = 0;
                }
            } else if (str.equals("feedback")) {
                c2 = 1;
            }
            if (c2 == 0) {
                fVar.v();
            } else if (c2 == 1) {
                fVar.f();
            } else if (c2 == 2) {
                fVar.M();
            }
        }
    }
}
