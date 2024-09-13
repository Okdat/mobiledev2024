package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        WeatherFragment weatherFragment = new WeatherFragment();
        fragmentTransaction.replace(R.id.fragment_weather,weatherFragment);

        ForecastFragment forecastFragment = new ForecastFragment();
        fragmentTransaction.replace(R.id.fragment_container_forecast, forecastFragment);

        fragmentTransaction.commit();
    }
}