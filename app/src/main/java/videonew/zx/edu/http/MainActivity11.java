package videonew.zx.edu.http;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnItemClick;
import videonew.zx.edu.http.demo.DemoAOkHttpGet;
import videonew.zx.edu.http.demo.DemoBOkHttpPost;
import videonew.zx.edu.http.demo.DemoCRetrofitActivity;


public class MainActivity11 extends AppCompatActivity {

    @Bind(R.id.listView) ListView listView;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 7.0 ButterKnife
        ButterKnife.bind(this);

        String[] datas = {"OkHttpGet","OkHttpPost","Retrofit"};
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datas);
        listView.setAdapter(adapter);
    }

    @OnItemClick(R.id.listView)
    public void itemClick(int position) {
        Intent intent = new Intent();
        switch (position) {
            case 0:
                intent.setClass(this, DemoAOkHttpGet.class);
                startActivity(intent);
                break;
            case 1:
                intent.setClass(this, DemoBOkHttpPost.class);
                startActivity(intent);
                break;
            case 2:
                intent.setClass(this, DemoCRetrofitActivity.class);
                startActivity(intent);
                break;
        }
    }
}
