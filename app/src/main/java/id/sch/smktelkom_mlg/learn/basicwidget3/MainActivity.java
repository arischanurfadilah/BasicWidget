package id.sch.smktelkom_mlg.learn.basicwidget3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // RadioButton rbBM, rbM, rbD, rbJ;
    RadioGroup rgStatus;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  rbBM = (RadioButton) findViewById(R.id.radioButtonBM);
        rbM = (RadioButton) findViewById(R.id.radioButtonM);
        rbD = (RadioButton) findViewById(R.id.radioButtonD);
        rbJ = (RadioButton) findViewById(R.id.radioButtonJ);*/
        rgStatus = (RadioGroup) findViewById(R.id.radioGroupStatus);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }


    private void doClick() {
        String hasil = null;
        if (rgStatus.getCheckedRadioButtonId() != -1) {
            RadioButton rb = (RadioButton)
                    findViewById(rgStatus.getCheckedRadioButtonId());
            hasil = rb.getText().toString();
        }

        /*if(rbBM.isChecked())
        {
            hasil = rbBM.getText().toString();
        }
        else if (rbM.isChecked())
        {
            hasil = rbM.getText().toString();
        }
        else if (rbD.isChecked())
        {
            hasil = rbD.getText().toString();
        }
        else if (rbJ.isChecked())
        {
            hasil = rbJ.getText().toString();
        }*/

        if (hasil == null) {
            tvHasil.setText("Belum memilih Status");
        } else {
            tvHasil.setText("Status Anda : " + hasil);
        }
    }

}

