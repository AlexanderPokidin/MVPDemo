package com.pokidin.a.mvpdemo.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.pokidin.a.mvpdemo.R;
import com.pokidin.a.mvpdemo.contracts.MainActivityContract;
import com.pokidin.a.mvpdemo.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private TextView mTextView;
    private Button mButton;
    private MainActivityContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainActivityPresenter(this);
    }

    @Override
    public void initView() {
        mTextView = findViewById(R.id.textView);
        mButton = findViewById(R.id.btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.onClick(v);
            }
        });
    }

    @Override
    public void setViewData(String data) {
        mTextView.setText(data);
    }
}
