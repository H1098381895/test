package videonew.zx.edu.http;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import videonew.zx.edu.http.demo.User;
import videonew.zx.edu.http.demo.UserResult;

/**
 * 作者：yuanchao on 2016/8/15 0015 16:17
 * 邮箱：yuanchao@feicuiedu.com
 */
public interface BombApi {

    // Headers可不加的,已在拦截器添加
    @Headers({
            "X-Bmob-Application-Id:623aaef127882aed89b9faa348451da3",
            "X-Bmob-REST-API-Key:c00104962a9b67916e8cbcb9157255de",
            "Content-Type:application/json"
    })
    @POST("https://api.bmob.cn/1/users")
    Call<UserResult> register(@Body User user);
}
