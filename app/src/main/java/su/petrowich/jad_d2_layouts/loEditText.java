package su.petrowich.jad_d2_layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loEditText extends AppCompatActivity {

    private EditText etEmail;
    private EditText etPassword;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lo_edit_text);

        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnSend = (Button) findViewById(R.id.btnSend);


        etPassword.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE)
                    showPassword();
                enableSend();
                return false;
            }
        });

        etEmail.addTextChangedListener(new TextWatcher(){
            @Override
            public void afterTextChanged(Editable s) {
                enableSend();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });

        etPassword.addTextChangedListener(new TextWatcher(){
            @Override
            public void afterTextChanged(Editable s) {
                enableSend();
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });


    }



    public void onClick(View v) {
        if (v.getId() == R.id.btnSend) {
            showPassword();
        }
    }

    void enableSend() {
        if (etEmail.getText().length() > 0 && etPassword.getText().length() > 0)
            btnSend.setEnabled(true);
        else
            btnSend.setEnabled(false);
    }

    void showPassword() {
        String login = etEmail.getText().toString() + " " + etPassword.getText().toString();
        Toast.makeText(this, login, Toast.LENGTH_LONG).show();
    }
}
