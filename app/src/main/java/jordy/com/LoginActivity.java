package jordy.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/*
Tanggal Pengerjaan : 18/04/2019
NIM : 10116497
Nama : Adam jordy
Kelas : AKB 11/IF 11
 */

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }

    public void onClick(View v){
        Intent intent = null;
        switch(v.getId()){
            case R.id.btn_Register:
                intent = new Intent(this,RegisterActivity.class);
                break;
        }
        if (null!=intent) startActivity(intent);
    }
}
