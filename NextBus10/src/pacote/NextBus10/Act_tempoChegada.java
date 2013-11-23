package pacote.NextBus10;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Act_tempoChegada extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_tempo_chegada);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.act_tempo_chegada, menu);
		return true;
	}

}
