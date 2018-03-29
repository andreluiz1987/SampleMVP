package detectordocumento.mercantildobrasil.com.br.samplemvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements UserContract.View {

    private ProgressBar progressBar;
    private TextView txtNome;
    private Button btnLoad;
    private UserContract.Presenter presenter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNome = findViewById(R.id.txtNome);
        btnLoad = findViewById(R.id.btnLoad);
        progressBar = findViewById(R.id.pgLoading);

        presenter = new UserPresenter(this);

        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onClick();
            }
        });
    }

    @Override
    public void showDialog() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideDialog() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void setData(String text) {
        txtNome.setText(text);
    }
}
