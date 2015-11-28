package br.aula24.controle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Principal extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btn = (Button) findViewById(R.main.btn);
        btn.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				
				EditText edtNome = (EditText) findViewById(R.main.txtnome);
				EditText edtEmail = (EditText) findViewById(R.main.txtemail);
				EditText edtIdade = (EditText) findViewById(R.main.txtidade);
				
				String msg = edtNome.getText().toString() + ", " + 
						edtEmail.getText().toString() + ", " + 
						edtIdade.getText().toString();
				
				Toast.makeText(getApplicationContext(), msg, 
						Toast.LENGTH_SHORT).show();
				
				String nome = edtNome.getText().toString();
				String email = edtEmail.getText().toString();
				String idade = edtIdade.getText().toString();
				
				Bundle param = new Bundle();
				param.putString("nome", nome);
				param.putString("email", email);
				param.putString("idade", idade);
				
				Intent intencao = new Intent(getApplicationContext(), Tela2.class);
				intencao.putExtras(param);
				startActivity(intencao);
				
			}
		});
    }
}