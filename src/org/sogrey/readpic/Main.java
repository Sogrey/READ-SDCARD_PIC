/**
 * 
 */
package org.sogrey.readpic;

import java.io.File;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

/**
 * @author Administrator
 * 
 */
public class Main extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initViews();
	}

	private void initViews() {
		// TODO Auto-generated method stub
		final ImageView img = (ImageView) findViewById(R.id.img);
		Button btn = (Button) findViewById(R.id.btn);
		// String filepath = "/stroage/sdcard0/liren/HT/serverhbt.jpg";
		final String filepath = "/sdcard/liren/HT/serverhbt.jpg";
		final File file = new File(filepath);

		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (file.exists()) {
					Bitmap bm = BitmapFactory.decodeFile(filepath);
					// 将图片显示到ImageView中
					img.setImageBitmap(bm);
				}
			}
		});
	}
}
