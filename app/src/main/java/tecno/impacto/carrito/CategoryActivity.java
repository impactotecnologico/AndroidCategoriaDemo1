package tecno.impacto.carrito;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }


    public void enviar(View view) {
        EditText e = findViewById(R.id.editText);
        String categoria = e.getText().toString();


        Intent i = new Intent(this, ListCategoryActivity.class);
        i.putExtra("nombreCat",categoria);

        startActivity(i);

    }
}
