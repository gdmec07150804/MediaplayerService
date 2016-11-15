package cn.edu.gdmec.s07150804.mediaplayerservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private TextView tv1;
    private String name,path;
    private File tphonedirectory;
    private File tExternamls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0,1,0,"使用服务音乐");
        menu.add(0,2,0,"停止服务音乐");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent=new Intent(this,PlayService.class);
        switch (item.getItemId()){
            case 1:
                startService(intent);
                break;
            case 2:
                stopService(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
