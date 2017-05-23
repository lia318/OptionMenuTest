package kr.hs.lia318e_mirim.optionmenutest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout Linear;
    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Linear = (LinearLayout) findViewById(R.id.Linear);
        but = (Button) findViewById(R.id.but_ok);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater();
        mInflater.inflate(R.menu.menu1,menu); // 여기서 menu는 매개변수의 menu이다.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        switch(item.getItemId()) {
            case R.id.item_blue:
                Linear.setBackgroundColor(Color.BLUE); // new Color 객체 생성도 가능
                return true;
            case R.id.item_red:
                Linear.setBackgroundColor(Color.RED);
                return true;
            case R.id.item_yellow:
                Linear.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.item_but_rotate:
                but.setRotation(but.getRotationX()+45); // 회전 메소드
                return true;
            case R.id.item_but_size:
                but.setScaleX(but.getScaleX()*1.5f); // 원래 버튼에서 가로 방향으로 1.5배 늘어남
                return true;
        } // end of switch
        return false; // switch가 한 번도 실행되지 않은 경우
    }
}