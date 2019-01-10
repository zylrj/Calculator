package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.media.MediaPlayer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	//按钮
	Button btn_1,btn_2,btn_3,
		   btn_4,btn_5,btn_6,
		   btn_7,btn_8,btn_9,
		   btn_10,btn_11,btn_12,
		   btn_13,btn_14,btn_15,
		   btn_16,btn_17,btn_18,
		   btn_19,btn_20,btn_21,btn_22,btn_23,btn_24;
	
	 private MediaPlayer mediaPlayer = new MediaPlayer();
	 private MediaPlayer mplayer=null;
	
	//用于判断是否需要重新输入
	boolean restart;
	//屏幕上数字的正负状态
	int front;
	//操作数与操作符
	float operator1,operator2;
	int symbol;//jre1.6不支持switch（字符串）
	//"+、—、*、/、x^y、/x、sinx、cosx"-->1、2、3、4、5、6、7、8
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//初始化操作数（默认为0）操作符（默认为+）
		operator1=0;
		operator2=0;
		restart=true;
		front=0;//默认为正数
		TextView txt=(TextView) findViewById(R.id.textView1);
		txt.setText("0");
		//获取button对象
		btn_1= (Button)findViewById(R.id.button1);
		btn_2= (Button)findViewById(R.id.button2);
		btn_3= (Button)findViewById(R.id.button3);
		btn_4= (Button)findViewById(R.id.button4);
		btn_5= (Button)findViewById(R.id.button5);
		btn_6= (Button)findViewById(R.id.button6);
		btn_7= (Button)findViewById(R.id.button7);
		btn_8= (Button)findViewById(R.id.button8);
		btn_9= (Button)findViewById(R.id.button9);
		btn_10= (Button)findViewById(R.id.button10);
		btn_11= (Button)findViewById(R.id.button11);
		btn_12= (Button)findViewById(R.id.button12);
		btn_13= (Button)findViewById(R.id.button13);
		btn_14= (Button)findViewById(R.id.button14);
		btn_15= (Button)findViewById(R.id.button15);
		btn_16= (Button)findViewById(R.id.button16);
		btn_17= (Button)findViewById(R.id.button17);
		btn_18= (Button)findViewById(R.id.button18);
		btn_19= (Button)findViewById(R.id.button19);
		btn_20= (Button)findViewById(R.id.button20);
		btn_21= (Button)findViewById(R.id.button21);
		btn_22= (Button)findViewById(R.id.button22);
		btn_23= (Button)findViewById(R.id.button23);
		btn_24= (Button)findViewById(R.id.button24);
		//注册点击事件
		btn_1.setOnClickListener(this);
		btn_2.setOnClickListener(this);
		btn_3.setOnClickListener(this);
		btn_4.setOnClickListener(this);
		btn_5.setOnClickListener(this);
		btn_6.setOnClickListener(this);
		btn_7.setOnClickListener(this);
		btn_8.setOnClickListener(this);
		btn_9.setOnClickListener(this);
		btn_10.setOnClickListener(this);
		btn_11.setOnClickListener(this);
		btn_12.setOnClickListener(this);
		btn_13.setOnClickListener(this);
		btn_14.setOnClickListener(this);
		btn_15.setOnClickListener(this);
		btn_16.setOnClickListener(this);
		btn_17.setOnClickListener(this);
		btn_18.setOnClickListener(this);
		btn_19.setOnClickListener(this);
		btn_20.setOnClickListener(this);
		btn_21.setOnClickListener(this);
		btn_22.setOnClickListener(this);
		btn_23.setOnClickListener(this);
		btn_24.setOnClickListener(this);
	}
	@Override
	//点击事件处理
	public void onClick(View btn) {	
		//获取文本框
		TextView txt=(TextView) findViewById(R.id.textView1);
		//文本框内容
		String text=(String) txt.getText();
		float value=Float.parseFloat(text);
		System.out.println(value);
		switch(btn.getId()){
		//数字
		case R.id.button1:
			if(restart){
				txt.setText("1");
				 mplayer = mediaPlayer.create(this, R.raw.one);
				 	mplayer.start();
				restart=false;}
			else{
			txt.setText(text+"1");
			 mplayer = mediaPlayer.create(this, R.raw.one);
			 	mplayer.start();
			}
			break;
		case R.id.button2:
			if(restart){
				txt.setText("2");
				mplayer = mediaPlayer.create(this, R.raw.two);
			 	mplayer.start();
				restart=false;}
			else{
			txt.setText(text+"2");
			mplayer = mediaPlayer.create(this, R.raw.two);
		 	mplayer.start();
			}
			break;

		case R.id.button3:
			if(restart){
				txt.setText("3");
				 mplayer = mediaPlayer.create(this, R.raw.three);
				 	mplayer.start();
				restart=false;}
			else{
			txt.setText(text+"3");
			 mplayer = mediaPlayer.create(this, R.raw.three);
			 	mplayer.start();
			}
			break;

		case R.id.button4:
			if(restart){
				txt.setText("4");
				 mplayer = mediaPlayer.create(this, R.raw.four);
				 	mplayer.start();
				restart=false;}
			else{
			txt.setText(text+"4");
			 mplayer = mediaPlayer.create(this, R.raw.four);
			 	mplayer.start();
			}
			break;
		case R.id.button5:
			if(restart){
				txt.setText("5");
				 mplayer = mediaPlayer.create(this, R.raw.five);
				 	mplayer.start();
				restart=false;}
			else
			{
			txt.setText(text+"5");
			 mplayer = mediaPlayer.create(this, R.raw.five);
			 	mplayer.start();
			}
			break;

		case R.id.button6:
			if(restart){
				txt.setText("6");
				 mplayer = mediaPlayer.create(this, R.raw.six);
				 	mplayer.start();
				restart=false;}
			else{
			txt.setText(text+"6");
			 mplayer = mediaPlayer.create(this, R.raw.six);
			 	mplayer.start();
			}
			break;

		case R.id.button7:
			if(restart){
				txt.setText("7");
				 mplayer = mediaPlayer.create(this, R.raw.seven);
				 	mplayer.start();
				restart=false;}
			else{
			txt.setText(text+"7");
			 mplayer = mediaPlayer.create(this, R.raw.seven);
			 	mplayer.start();
			}
			break;

		case R.id.button8:
			if(restart){
				txt.setText("8");
				 mplayer = mediaPlayer.create(this, R.raw.eight);
				 	mplayer.start();
				restart=false;}
			else{
			txt.setText(text+"8");
			mplayer = mediaPlayer.create(this, R.raw.eight);
		 	mplayer.start();
			}
			break;

		case R.id.button9:
			if(restart){
				txt.setText("9");
				 mplayer = mediaPlayer.create(this, R.raw.nine);
				 	mplayer.start();
				restart=false;}
			else{
			txt.setText(text+"9");
			 mplayer = mediaPlayer.create(this, R.raw.nine);
			 	mplayer.start();
			}
			break;

		case R.id.button10:
			if(restart){
				txt.setText("0");
			 mplayer = mediaPlayer.create(this, R.raw.zero);
			 	mplayer.start();
			}
			else{
			txt.setText(text+"0");
			 mplayer = mediaPlayer.create(this, R.raw.zero);
			 	mplayer.start();
			}
			break;

			//+
		case R.id.button11:
			symbol=1;
			operator1=value;
			 mplayer = mediaPlayer.create(this, R.raw.plus);
			 	mplayer.start();
			restart=true;
			break;
			//-
		case R.id.button12:
			symbol=2;
			operator1=value;
			 mplayer = mediaPlayer.create(this, R.raw.minus);
			 	mplayer.start();
			restart=true;
			break;
			//-/+
		case R.id.button13:
			if(restart){
				txt.setText("-");
				front=1;}
			else if(front==0){
				txt.setText("-"+text);
				front=1;}
			else if(front==1){
				txt.setText(text.substring(1));
				front=0;
			}
			break;
			//*
		case R.id.button14:
			symbol=3;
			operator1=value;
			 mplayer = mediaPlayer.create(this, R.raw.mul);
			 	mplayer.start();
			restart=true;
			break;
			// /
		case R.id.button15:
			symbol=4;
			operator1=value;
			 mplayer = mediaPlayer.create(this, R.raw.div);
			 	mplayer.start();
			restart=true;
			break;
			//C
		case R.id.button16:
			txt.setText("0");
			 mplayer = mediaPlayer.create(this, R.raw.ac);
			 	mplayer.start();
			restart=true;
			break;
			// .
		case R.id.button17:
			if(restart){
				txt.setText(".");
			 mplayer = mediaPlayer.create(this, R.raw.dot);
			 	mplayer.start();
			}
			else{
			txt.setText(text+".");
			 mplayer = mediaPlayer.create(this, R.raw.dot);
			 	mplayer.start();
			restart=false;
			}
			break;

			//=
		case R.id.button18:
			restart=true;
			 mplayer = mediaPlayer.create(this, R.raw.equal);
			 	mplayer.start();
			switch(symbol){
			case 1:
				txt.setText(String.valueOf(operator1+value));
				break;
			case 2:
				txt.setText(String.valueOf(operator1-value));
				break;
			case 3:
				txt.setText(String.valueOf(operator1*value));
				break;
			case 4:
				txt.setText(String.valueOf(operator1/value));
				break;
			case 5:
				txt.setText(String.valueOf(Math.pow(operator1, value)));
				break;
			}
			break;
			//x^y
		case R.id.button19:
			symbol=5;
			operator1=value;
			restart=true;
			break;
			// /x
		case R.id.button20:
			symbol=6;
			txt.setText(String.valueOf(Math.sqrt(value)));
			restart=true;
			break;
			// sinx
		case R.id.button21:
			symbol=7;
			txt.setText(String.valueOf(Math.sin(value)));
			restart=true;
			break;
			// cosx
		case R.id.button22:
			symbol=8;
			txt.setText(String.valueOf(Math.cos(value)));
			restart=true;
			break;
			// tanx
		case R.id.button23:
			symbol=9;
			txt.setText(String.valueOf(Math.tan(value)));
			restart=true;
			break;
			// log
		case R.id.button24:
			symbol=10;
			txt.setText(String.valueOf(Math.log(value)));
			restart=true;
			break;
			default:
				break;
		}
	}
/*	public void resultSound(){
		//获取文本框
		TextView txt=(TextView) findViewById(R.id.textView1);
		//文本框内容
		String text=(String) txt.getText();
		char c[]=text.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]=='0'){
				mplayer = mediaPlayer.create(this, R.raw.zero);
		 		mplayer.start();
			}
			else if(c[i]=='1'){
				mplayer = mediaPlayer.create(this, R.raw.one);
		 		mplayer.start();
			}
			else if(c[i]=='2'){
				mplayer = mediaPlayer.create(this, R.raw.two);
		 		mplayer.start();
			}
			else if(c[i]=='3'){
				mplayer = mediaPlayer.create(this, R.raw.three);
		 		mplayer.start();
			}
			else if(c[i]=='4'){
				mplayer = mediaPlayer.create(this, R.raw.four);
		 		mplayer.start();
			}
			else if(c[i]=='5'){
				mplayer = mediaPlayer.create(this, R.raw.five);
		 		mplayer.start();
			}
			else if(c[i]=='6'){
				mplayer = mediaPlayer.create(this, R.raw.six);
		 		mplayer.start();
			}
			else if(c[i]=='7'){
				mplayer = mediaPlayer.create(this, R.raw.seven);
		 		mplayer.start();
			}
			else if(c[i]=='8'){
				mplayer = mediaPlayer.create(this, R.raw.eight);
		 		mplayer.start();
			}
			else if(c[i]=='9'){
				mplayer = mediaPlayer.create(this, R.raw.nine);
		 		mplayer.start();
			}
			else if(c[i]=='.'){
				mplayer = mediaPlayer.create(this, R.raw.dot);
		 		mplayer.start();
			}
		}
		
	
	}*/
}
