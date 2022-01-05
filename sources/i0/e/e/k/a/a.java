package i0.e.e.k.a;

import com.clubhouse.android.data.models.local.channel.ChannelInRoomWithAccess;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.wave.data.models.remote.request.AcceptWaveRequest;
import com.clubhouse.wave.data.models.remote.request.SendWaveRequest;
import com.clubhouse.wave.data.models.remote.request.WaveRequest;
import com.clubhouse.wave.data.models.remote.response.GetWavesResponse;
import kotlin.Metadata;
import m0.l.c;
import t0.c0.f;
import t0.c0.o;
import t0.v;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J#\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\b\b\u0001\u0010\b\u001a\u00020\fH§@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\b\u001a\u00020\u000fH§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0005J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0005J\u0019\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Li0/e/e/k/a/a;", "", "Lt0/v;", "Lcom/clubhouse/wave/data/models/remote/response/GetWavesResponse;", "f", "(Lm0/l/c;)Ljava/lang/Object;", "d", "Lcom/clubhouse/wave/data/models/remote/request/SendWaveRequest;", "req", "Lcom/clubhouse/android/data/models/remote/response/EmptySuccessResponse;", "e", "(Lcom/clubhouse/wave/data/models/remote/request/SendWaveRequest;Lm0/l/c;)Ljava/lang/Object;", "Lcom/clubhouse/wave/data/models/remote/request/WaveRequest;", "g", "(Lcom/clubhouse/wave/data/models/remote/request/WaveRequest;Lm0/l/c;)Ljava/lang/Object;", "Lcom/clubhouse/wave/data/models/remote/request/AcceptWaveRequest;", "Lcom/clubhouse/android/data/models/local/channel/ChannelInRoomWithAccess;", "h", "(Lcom/clubhouse/wave/data/models/remote/request/AcceptWaveRequest;Lm0/l/c;)Ljava/lang/Object;", "b", "a", "c", "wave_release"}, k = 1, mv = {1, 5, 1})
/* compiled from: WaveApi.kt */
public interface a {
    @o("unsuspend_waves")
    Object a(c<? super v<GetWavesResponse>> cVar);

    @o("suspend_waves")
    Object b(c<? super v<EmptySuccessResponse>> cVar);

    @o("cancel_waves")
    Object c(c<? super v<EmptySuccessResponse>> cVar);

    @f("get_received_waves")
    Object d(c<? super v<GetWavesResponse>> cVar);

    @o("send_wave")
    Object e(@t0.c0.a SendWaveRequest sendWaveRequest, c<? super v<EmptySuccessResponse>> cVar);

    @f("get_initiated_waves")
    Object f(c<? super v<GetWavesResponse>> cVar);

    @o("cancel_wave")
    Object g(@t0.c0.a WaveRequest waveRequest, c<? super v<EmptySuccessResponse>> cVar);

    @o("accept_wave")
    Object h(@t0.c0.a AcceptWaveRequest acceptWaveRequest, c<? super v<ChannelInRoomWithAccess>> cVar);
}
