package videonew.zx.edu.http;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //日志拦截器
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        //设置拦截级别
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();
        Request request = new Request.Builder()
                .url("http://www.baidu.com")
                .build();
        //构建call
        Call call = okHttpClient.newCall(request);
//        Response response=call.execute();//直接返回结果
        call.enqueue(callBack);
    }

    private Callback callBack = new Callback() {
        @Override
        public void onFailure(Call call, IOException e) {
//            Toast.makeText(getApplicationContext(), "Failure:" + e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onResponse(Call call, Response response) throws IOException {
//            if (response == null) {
//                Toast.makeText(getApplicationContext(), "未知错误！", Toast.LENGTH_SHORT).show();
//                return;
//            }
//            if (response.isSuccessful()) {
//                响应头
//                响应体
//                ResponseBody body = response.body();
//                Log.e("Tag", body.string());
//                return;
//            }
//            Toast.makeText(getApplicationContext(), "code:" + response.code(), Toast.LENGTH_SHORT).show();
//
        }
    };
}
