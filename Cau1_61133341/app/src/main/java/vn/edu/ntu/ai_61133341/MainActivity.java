package vn.edu.ntu.ai_61133341;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Xuly_dt (View view)
    {
        //=======================
        EditText dk_soA =(EditText) findViewById (R.id.chieuRong);
        int soA = Integer . parseInt (dk_soA.getText().toString());
        EditText dk_soB =(EditText) findViewById (R.id.chieuDai);
        int soB = Integer . parseInt (dk_soB.getText().toString());
        EditText dk_soC =(EditText) findViewById (R.id.chieuCao);
        int soC = Integer . parseInt (dk_soC.getText().toString());
        int KetQua = soA * soC;
        TextView dk_KQ =(TextView) findViewById (R.id.tvResult);
        dk_KQ.setText(  String.valueOf(KetQua)  );
    }
    public void Xuly_cv (View view)
    {
        //=======================
        EditText dk_soA =(EditText) findViewById (R.id.chieuRong);
        int soA = Integer . parseInt (dk_soA.getText().toString());
        EditText dk_soB =(EditText) findViewById (R.id.chieuDai);
        int soB = Integer . parseInt (dk_soB.getText().toString());
        EditText dk_soC =(EditText) findViewById (R.id.chieuCao);
        int soC = Integer . parseInt (dk_soC.getText().toString());
        int KetQua = 2 * (soA+soB);
        TextView dk_KQ =(TextView) findViewById (R.id.tvResult);
        dk_KQ.setText(  String.valueOf(KetQua)  );
    }

}