package com.example.it.ui.course;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.it.R;


public class CourseFragment extends Fragment {

    ImageView img1, img2, img3, img4, img5, img6,img7, img8,img9, img10,img11, img12;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.fragment_course, container, false);

        img1 = view.findViewById(R.id.img1);
        img2 = view.findViewById(R.id.img2);
        img3 = view.findViewById(R.id.img3);
        img4 = view.findViewById(R.id.img4);
        img5 = view.findViewById(R.id.img5);
        img6 = view.findViewById(R.id.img6);
        img7 = view.findViewById(R.id.img7);
        img8 = view.findViewById(R.id.img8);
        img9 = view.findViewById(R.id.img9);
        img10 = view.findViewById(R.id.img10);
        img11 = view.findViewById(R.id.img11);
        img12 = view.findViewById(R.id.img12);

        loadImage();

        return  view;


    }

    private void loadImage() {

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F11.png?alt=media&token=a4bc2ba1-873f-4c91-8500-a7f3eeb125f7")
                .into(img1);

//        Glide.with(getContext())
//                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F12.png?alt=media&token=7977cc21-8c8f-4b06-8a6d-9a193a00dbc8")
//                .into(img2);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F13.png?alt=media&token=e0362050-263b-4d44-95b1-7f20ff1420f6")
                .into(img3);


        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F14.png?alt=media&token=8d2cace8-2415-40c1-a6d4-43f4eb3b5323")
                .into(img4);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F15.png?alt=media&token=fba2940c-2e1c-401e-b4ac-09ad4f151f06")
                .into(img5);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F16.png?alt=media&token=7bd59a25-1514-47a0-ac76-3b51d6bf61c7")
                .into(img6);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F17.png?alt=media&token=05c76654-a314-47a4-a38f-d0941435bea6")
                .into(img7);


        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F18.png?alt=media&token=12c4ce6d-336c-4eab-ab94-739e07adf2d5")
                .into(img8);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F19.png?alt=media&token=7368bc39-252e-49bc-b18c-f3aca40bcbc9")
                .into(img9);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F14.png?alt=media&token=8d2cace8-2415-40c1-a6d4-43f4eb3b5323")
                .into(img10);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F15.png?alt=media&token=fba2940c-2e1c-401e-b4ac-09ad4f151f06")
                .into(img11);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F16.png?alt=media&token=7bd59a25-1514-47a0-ac76-3b51d6bf61c7")
                .into(img12);
//
//        Glide.with(getContext())
//                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F17.png?alt=media&token=05c76654-a314-47a4-a38f-d0941435bea6")
//                .into(img7);


        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/deperment%2F18.png?alt=media&token=12c4ce6d-336c-4eab-ab94-739e07adf2d5")
                .into(img8);


    }
}