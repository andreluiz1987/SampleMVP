package detectordocumento.mercantildobrasil.com.br.samplemvp;

import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import  android.support.test.espresso.Espresso;
import android.support.test.runner.AndroidJUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by andre.coelho on 11/04/2018.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginTest {

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void executarTesteLoginContaErrada() {

        onView(withId(R.id.edtNome)).perform(typeText("ANDRE"), closeSoftKeyboard());

        onView(withId(R.id.btnLoad)).perform(click());
    }
}
