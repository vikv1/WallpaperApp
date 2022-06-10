package com.example.myapplication.ui.home;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeBinding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        ImageView img1 = (ImageView) root.findViewById(R.id.imageView1);
        ImageView img2 = (ImageView) root.findViewById(R.id.imageView2);
        ImageView img3 = (ImageView) root.findViewById(R.id.imageView3);
        ImageView img4 = (ImageView) root.findViewById(R.id.imageView4);
        ImageView img5 = (ImageView) root.findViewById(R.id.imageView5);
        ImageView img6 = (ImageView) root.findViewById(R.id.imageView6);
        ImageView img7 = (ImageView) root.findViewById(R.id.imageView7);
        ImageView img8 = (ImageView) root.findViewById(R.id.imageView8);
        ImageView img9 = (ImageView) root.findViewById(R.id.imageView9);

        img1.setImageResource(R.drawable.blue0517);
        img2.setImageResource(R.drawable.blue0517);
        img3.setImageResource(R.drawable.blue0517);
        img4.setImageResource(R.drawable.blue0517);
        img5.setImageResource(R.drawable.blue0517);
        img6.setImageResource(R.drawable.blue0517);
        img7.setImageResource(R.drawable.blue0517);
        img8.setImageResource(R.drawable.blue0517);
        img9.setImageResource(R.drawable.blue0517);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    //need to read img from storage
    public void getImageFromStorage() {
        String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES) + "/images/";
        File dir = new File(path);

        File[] imgs = dir.listFiles();
    }

}