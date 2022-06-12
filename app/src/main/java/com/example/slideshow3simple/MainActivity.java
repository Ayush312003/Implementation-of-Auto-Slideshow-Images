package com.example.slideshow3simple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Object ArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageSlider imageSlider=findViewById(R.id.slider);

        List <SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel("https://bit.ly/2BteuF2", "Elephants and tigers may become extinct.", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel("https://images.unsplash.com/photo-1598449356475-b9f71db7d847?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8aG9yaXpvbnRhbHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=1000&q=60", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel("https://images.unsplash.com/photo-1543304216-b46be324b571?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8M3x8aG9yaXpvbnRhbHxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=1000&q=60", ScaleTypes.CENTER_CROP));
        slideModels.add(new SlideModel("https://images.unsplash.com/photo-1600256697197-02d4e0b93af6?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fGhvcml6b250YWx8ZW58MHx8MHx8&auto=format&fit=crop&w=1000&q=60", ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModels,ScaleTypes.CENTER_CROP);

    }
}