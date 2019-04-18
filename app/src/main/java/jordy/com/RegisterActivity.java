package jordy.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/*
Tanggal Pengerjaan : 18/04/2019
NIM : 10116497
Nama : Adam jordy
Kelas : AKB 11/IF 11
 */

public class RegisterActivity extends AppCompatActivity {

    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        b1 = (Button) findViewById(R.id.btn_Register);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(getApplicationContext(), AlmostThereActivity.class);
                startActivity(pindah);
            }
        });

    }


}
