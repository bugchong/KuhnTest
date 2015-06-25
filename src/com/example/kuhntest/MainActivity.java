package com.example.kuhntest;




import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	

	private static final String Base_URL = "http://192.168.0.2:8080/JsonTest/Doget?stockcode=600236";
	private TextView mStockname;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
			
		new Thread() {
			@Override  
            public void run() {  
                String jsonstring = HttpUtils.getJsonContent(Base_URL);
                Log.i("1212",jsonstring);        
                final List<Map> ss =JsonUtils.parseCities(jsonstring);
                //�°汾android�����߳�UI���޸�������Ҫ�����Ҫ����runOnUiThread
                runOnUiThread(new Runnable() {
					public void run() {
						//���JSON�ַ����еĵ�һ������
						mStockname = (TextView)findViewById(R.id.stockname);
						mStockname.setText((String)(ss.get(0).get("title")));
					}
				});
                
            }  	
		}.start();
		
		
		
		
	}
	
	
		
	}




