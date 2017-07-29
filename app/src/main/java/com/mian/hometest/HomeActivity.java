/**
 *HomeActivity.java
 *2011-9-18 下午10:00:06
 *Touch Android
 *http://bbs.droidstouch.com
 */
package com.mian.hometest;

import java.util.List;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;


/**
 * @author <a href="http://bbs.droidstouch.com">Touch Android</a>
 *
 */
public class HomeActivity extends Activity
{


	private static final String TAG="HomeActivity";
	
	
	//加载View
	private View progresView;
	
	private View titleView;
	
	
	private ListView weiboListView;
	
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.home);
	
		
	}

	



	
	
}
