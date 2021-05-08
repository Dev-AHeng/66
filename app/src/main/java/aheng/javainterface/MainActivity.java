package aheng.javainterface;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author Dev_Heng
 */
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new DiaLog(this, new OnClick() {
            @Override
            public void right(DialogInterface dialog, int which) {
                toast("右边");
                dialog.dismiss();
            }

            @Override
            public void center(DialogInterface dialog, int which) {
                toast("中间");
                dialog.cancel();
            }

            @Override
            public void left(DialogInterface dialog, int which) {
                toast("左边");
            }
        }, "我是标题", "内容", "左边按钮", "中间按钮", "右边按钮");

    }

    /**
     * 封装一个toast
     */
    public void toast(Object content) {
        Toast.makeText(MainActivity.this, content.toString(), Toast.LENGTH_SHORT).show();
    }
}