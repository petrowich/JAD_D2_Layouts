package su.petrowich.jad_d2_layouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.m_color, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        TextView tvText = (TextView) findViewById(R.id.tvText);
        FrameLayout lBg = (FrameLayout) findViewById(R.id.lBg);

        switch (item.getItemId()) {
            case R.id.item_black:
                tvText.setText("чёрный");
                tvText.setTextColor(getResources().getColor(R.color.colorBlack));
                lBg.setBackgroundColor(getResources().getColor(R.color.colorWhite));
                return true;
            case R.id.item_white:
                tvText.setText("белый");
                tvText.setTextColor(getResources().getColor(R.color.colorWhite));
                lBg.setBackgroundColor(getResources().getColor(R.color.colorBlack));
                return true;
            case R.id.item_red:
                tvText.setText("красный");
                tvText.setTextColor(getResources().getColor(R.color.colorRed));
                lBg.setBackgroundColor(getResources().getColor(R.color.colorRed));
                return true;
            case R.id.item_green:
                tvText.setText("зелёный");
                tvText.setTextColor(getResources().getColor(R.color.colorGreen));
                lBg.setBackgroundColor(android.graphics.Color.GREEN);
                return true;
            case R.id.item_blue:
                tvText.setText("синий");
                tvText.setTextColor(getResources().getColor(R.color.colorBlue));
                lBg.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
