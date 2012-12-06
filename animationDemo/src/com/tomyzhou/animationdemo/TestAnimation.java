package com.tomyzhou.animationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

/**
 *  ��һ��ʹ�ö����ķ�ʽ ��
 *  	1.ͨ��xml�ļ�����ö���
 *  	2.��java�������棬ͨ��AnimationUtil.loadAnimation(this,R.anim.anim)����ö���õĶ���
 *  	3.����������ĳ���ؼ� view.setAnimation(anim)
 * @author Administrator
 *
 */
public class TestAnimation extends Activity implements OnClickListener {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anim);
		Button btn = (Button) findViewById(R.id.button);
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Animation anim = AnimationUtils.loadAnimation(this,
				R.anim.anim);
		findViewById(R.id.textview).startAnimation(anim);
	}
}