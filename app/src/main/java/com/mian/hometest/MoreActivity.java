/**
 *HomeActivity.java
 *2011-9-18 下午10:00:06
 *Touch Android
 *http://bbs.droidstouch.com
 */
package com.mian.hometest;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author <a href="http://bbs.droidstouch.com">Touch Android</a>
 *
 */
public class MoreActivity extends Activity
{


	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.more);
		System.out.println("more......");
	}
	
}
