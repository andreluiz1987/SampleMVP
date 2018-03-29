package detectordocumento.mercantildobrasil.com.br.samplemvp;

import android.os.Handler;

/**
 * Created by andre.coelho on 29/03/2018.
 */

public class UserPresenter implements UserContract.Presenter {

    // to keep reference to view
    private UserContract.View view;

    public UserPresenter(UserContract.View view) {
        this.view = view;
    }

    @Override
    public void onClick() {

        view.showDialog();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                view.setData("ANDSANMSDNASLKHJD");

                view.hideDialog();
            }
        }, 5000);
    }
}

