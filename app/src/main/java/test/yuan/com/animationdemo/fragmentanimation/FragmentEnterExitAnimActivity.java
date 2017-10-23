package test.yuan.com.animationdemo.fragmentanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import test.yuan.com.animationdemo.R;

public class FragmentEnterExitAnimActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button;
    private FirstFragment firstFragment;
    private SecondFragment secondFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_enter_exit_anim);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_content, firstFragment)
                .commit();
    }

    @Override
    public void onClick(View v) {
        getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(
                        R.anim.slide_right_in,
                        R.anim.slide_left_out,
                        R.anim.slide_left_in,
                        R.anim.slide_right_out
                ).replace(R.id.fragment_content, secondFragment)
                .addToBackStack(null)
                .commit();
    }
}
