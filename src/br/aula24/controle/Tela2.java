package br.aula24.controle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela2 extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela2);
		
		Bundle param = getIntent().getExtras();
		String nome = param.getString("nome");
		String email = param.getString("email");
		String idade = param.getString("idade");
		
		TextView txt = (TextView) findViewById(R.tela2.txtresp);
		txt.setText(nome + ", " + email  + ", " + idade);
		Button btn = (Button) findViewById(R.tela2.btnvoltar);
		btn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				finish();
			}
		});
	}
	
}
