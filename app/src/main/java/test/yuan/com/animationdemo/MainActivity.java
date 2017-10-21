package test.yuan.com.animationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener{

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textview);
        showXmlAnimation(mTextView);
        showCodeAnimation(mTextView);
    }

    /**
     * 从xml定义动画
     * @param view
     */
    private void showXmlAnimation(View view){
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.translate_demo);
        animation.setAnimationListener(this);
        view.startAnimation(animation);
    }

    /**
     * 从代码定义动画
     * @param view
     */
    private void showCodeAnimation(View view){
        AlphaAnimation alphaAnimation = new AlphaAnimation(0,1);
        alphaAnimation.setDuration(300);
        mTextView.startAnimation(alphaAnimation);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
