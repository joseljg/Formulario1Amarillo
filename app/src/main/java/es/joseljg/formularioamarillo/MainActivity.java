package es.joseljg.formularioamarillo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private RadioButton rb_nacional = null;
    private RadioButton rb_extranjero = null;
    private CheckBox    cb_acepto = null;
    private TextView txt_error = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb_nacional = (RadioButton) findViewById(R.id.rb_nacional);
        rb_extranjero = (RadioButton) findViewById(R.id.rb_extranjero);
        cb_acepto = (CheckBox) findViewById(R.id.cb_acepto);
        txt_error = (TextView) findViewById(R.id.txt_error);
    }

    public void mostrarNacionalidad(View view) {
        boolean estaSeleccionado = ((RadioButton) view).isChecked();
        switch(view.getId())
        {
            case R.id.rb_nacional:
                if(estaSeleccionado)
                {
                    Toast.makeText(this, "has seleccionado nacional",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.rb_extranjero:
                if(estaSeleccionado)
                {
                    Toast.makeText(this, "has seleccionado extranjero",Toast.LENGTH_SHORT).show();
                }
                break;
        }


    }

    public void mostrar(View view) {
        if(rb_nacional.isChecked())
        {
            Toast.makeText(this, "has seleccionado nacional", Toast.LENGTH_SHORT).show();
        }
        else if (rb_extranjero.isChecked()){
            Toast.makeText(this, "has seleccionado extranjero", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "elige nacional o extranjero", Toast.LENGTH_SHORT).show();
        }
    }

    public void aceptar(View view) {
        boolean estaSeleccionado = cb_acepto.isChecked();
        if(estaSeleccionado)
        {
            txt_error.setText("");
            Toast.makeText(this, "ACEPTASTE LOS TERMINOS", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "DEBES ACEPTAR LOS TÉRMINOS PARA CONTINUAR", Toast.LENGTH_SHORT).show();
            txt_error.setText("DEBES ACEPTAR LOS TERMINOS");
            txt_error.setTextColor(getResources().getColor(R.color.design_default_color_error));
        }
    }
}