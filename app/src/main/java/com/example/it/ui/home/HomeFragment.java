package com.example.it.ui.home;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.it.R;


public class HomeFragment extends Fragment {

    CardView heading1;
    ImageView  image1, image2, image3, image4, image5, image6,image7, image8, image9, image10, image11,  image12, image13, image14;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        image1 = view.findViewById(R.id.image1);
        image2 = view.findViewById(R.id.image2);
        image3 = view.findViewById(R.id.image3);
        image4 = view.findViewById(R.id.image4);
        image5 = view.findViewById(R.id.image5);
        image6 = view.findViewById(R.id.image6);
        image7 = view.findViewById(R.id.image7);
        image8 = view.findViewById(R.id.image8);
        image9 = view.findViewById(R.id.image9);
        image10 = view.findViewById(R.id.image10);
        image11 = view.findViewById(R.id.image11);
        image12 = view.findViewById(R.id.image12);
        image13 = view.findViewById(R.id.image13);
        image14 = view.findViewById(R.id.image14);

        loadImage();

        return  view;

    }

    private void loadImage() {

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2FApp-Cover.jpg?alt=media&token=42c843b3-a539-4e2f-9e24-e8ccebe164b4")
                .into(image1);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2FApp-Banner_BTEB.png?alt=media&token=d8ee20c5-80f7-46ce-b7c9-e553b52ce2f6")
                .into(image2);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2FNETWORKING_APP-BANNER.png?alt=media&token=269e67ef-b270-4738-baf7-15869b662e50")
                .into(image3);


        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2FApp_Banner.png?alt=media&token=0c92be97-c38f-49bd-8aa8-d1266d45a266")
                .into(image4);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2FApp-Banner-2.png?alt=media&token=53829aeb-b106-4d7e-8fe5-9387594e557a")
                .into(image5);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2FBanner_01.png?alt=media&token=46771ef7-6cbf-4c04-91ec-f07963571802")
                .into(image6);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2FBanner_02.png?alt=media&token=46d9d5bf-3c6a-4127-8784-a1c7984dc4ce")
                .into(image7);



        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2FISO.png?alt=media&token=9338871b-7460-41f8-81e8-1afc01d87fd1")
                .into(image8);


        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2FE-school%2520Banner.png?alt=media&token=ac34c3f4-6b09-4c3e-ac21-1c67bd363932")
                .into(image9);


        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2Fmou.png?alt=media&token=679650a7-5be0-43e9-abbd-5d5468651b42")
                .into(image10);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2Fmember.png?alt=media&token=a3d56616-5c9f-4498-8e98-859089f30f32")
                .into(image11);


        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2FWe_work_with.png?alt=media&token=39e5ef60-a357-44e8-9958-1a593c022f3b")
                .into(image12);

        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2Fconcern.png?alt=media&token=47b2f79f-6d11-4e67-b0b8-ffffd19974d4")
                .into(image13);


        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/creativitinstitute.appspot.com/o/card%2Fadress.png?alt=media&token=a10e08df-e341-4c84-93c0-0b7e9dc4ed74")
                .into(image14);









    }

}