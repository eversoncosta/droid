package pacote.NextBus10;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Act_Principal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_principal);
		Button butao  = (Button) findViewById(R.id.button1);
		butao.setOnClickListener(new OnClickListener() {
								
			@Override
			public void onClick(View v) {

				Intent inten1 = new Intent(Act_Principal.this,TempoChegada2.class);
				startActivity(inten1);
			}
		 });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}