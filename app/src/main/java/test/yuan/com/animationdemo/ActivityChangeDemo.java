package test.yuan.com.animationdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Activity有默认的切换效果，我们这里可以自定义；
 * 主要用到overridePendingTransition(int enterAnim,int exitAnim),这个方法必须在
 * startActivity(intent)或者finish()之后调用才能生效。
 *　enterAnim----Activity被打开时，所需要的动画资源id;
 *  exitAnim----Activity暂停时，所需要的动画资源id.
 */
public class ActivityChangeDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_demo);

//        Intent intent = new Intent(.....);
//        startActivity(intent);
//        overridePendingTransition(R.anim.enter,R.anim.exit);
    }

    @Override
    public void finish() {
//        super.finish();
//        overridePendingTransition(R.anim.enter,R.anim.exit);
    }
}
