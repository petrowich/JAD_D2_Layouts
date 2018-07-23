package su.petrowich.jad_d2_layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShapes = (Button) findViewById(R.id.btnShapes);
        Button btnEditText = (Button) findViewById(R.id.btnEditText);
        Button btnCL = (Button) findViewById(R.id.btnCL);
        Button btnCLChains = (Button) findViewById(R.id.btnCLChains);

    }

    public void onClick(View v){
        Intent intent = null;

        if (v.getId()==R.id.btnShapes)
            intent = new Intent(this, loShapes.class);

        if (v.getId()==R.id.btnEditText)
            intent = new Intent(this, loEditText.class);

        if (v.getId()==R.id.btnCL)
            intent = new Intent(this, loCL.class);

        if (v.getId()==R.id.btnCLChains)
            intent = new Intent(this, loCLChains.class);

        startActivity(intent);
    }
}
