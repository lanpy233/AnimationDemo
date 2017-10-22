package test.yuan.com.animationdemo.layoutanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.ListView;

import test.yuan.com.animationdemo.R;

public class LayoutAnimationActivity extends AppCompatActivity {

    private ListView mListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_animation);

        //使用xml来指定LayoutAnimation
        mListView = (ListView) findViewById(R.id.list);
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.layout_animation_item);
        LayoutAnimationController controller = new LayoutAnimationController(animation);

        //也可以通过LayoutAnimationController来实现布局动画
        controller.setDelay(0.5f);
        controller.setOrder(LayoutAnimationController.ORDER_NORMAL);


        mListView.setLayoutAnimation(controller);

    }
}
