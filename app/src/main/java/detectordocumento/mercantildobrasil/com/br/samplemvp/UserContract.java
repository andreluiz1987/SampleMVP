package detectordocumento.mercantildobrasil.com.br.samplemvp;

/**
 * Created by andre.coelho on 29/03/2018.
 */

public interface UserContract {

    interface View {
        void showDialog();
        void hideDialog();
        void setData(String text);
    }

    interface Presenter {
        void onClick();
    }

    interface onResponse {

    }
}
