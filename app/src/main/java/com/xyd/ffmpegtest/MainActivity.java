package com.xyd.ffmpegtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.xyd.ffmpegtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'ffmpegtest' library on application startup.
    static {
        System.loadLibrary("ffmpegtest");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(getFFmpegConfiguration());
    }

    /**
     * A native method that is implemented by the 'ffmpegtest' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
    public native String getFFmpegConfiguration();
}