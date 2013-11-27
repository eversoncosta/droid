package pacote.NextBus10;

import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.R.layout;
import android.location.Criteria;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;




public class Act_Principal extends Activity implements LocationListener  {

	private LocationManager locationManager;
	
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
		
		
		
	    locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
		
		locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
				3000,   // 3 sec
				10, this);
		
		String endereco = "";
		
		DefaultHttpClient httpClient = new DefaultHttpClient();    
        URI uri;    
        InputStream data = null;    
        try {    
            uri = new URI("http://10.0.2.2:8080/Next_Bus/WebGetOnibus?endereco="+endereco);    
            HttpGet method = new HttpGet(uri);    
            HttpResponse response = httpClient.execute(method);    
            data = response.getEntity().getContent(); 
            String teste = "";
        } catch (Exception e) {    
            e.printStackTrace();    
        }    
		
		
	}
		

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void MultiplicarRadioButton()
	{
		Geocoder coder = new Geocoder(this);
	}

	@Override
	public void onLocationChanged(Location location) {

		 String str = "Latitude: "+location.getLatitude()+" \nLongitude: "+location.getLongitude();
		Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();
		
	}

	@Override
	public void onProviderDisabled(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderEnabled(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		// TODO Auto-generated method stub
		
	}

}