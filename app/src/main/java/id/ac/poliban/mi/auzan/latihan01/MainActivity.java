package id.ac.poliban.mi.auzan.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btClear = findViewById(R.id.btClear);
        Button btSubmit = findViewById(R.id.btSubmit);
        final EditText etNim = findViewById(R.id.etNIM);
        final EditText etName = findViewById(R.id.etName);
        final EditText etAddress = findViewById(R.id.etAddress);
        final EditText etPhone = findViewById(R.id.etPhone);

        btClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.getText().clear();
                etNim.getText().clear();
                etAddress.getText().clear();
                etPhone.getText().clear();
            }
        });


        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etName.getText().clear();
                etNim.getText().clear();
                etAddress.getText().clear();
                etPhone.getText().clear();

                Toast.makeText(MainActivity.this, "DATA ANDA TELAH DI SUBMIT", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
