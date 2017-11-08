package tabian.com.instagramclone.Profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

import java.util.ArrayList;

import tabian.com.instagramclone.R;
import tabian.com.instagramclone.Utils.BottomNavigationViewHelper;
import tabian.com.instagramclone.Utils.GridImageAdapter;
import tabian.com.instagramclone.Utils.UniversalImageLoader;

/**
 * Created by User on 5/28/2017.
 */

public class ProfileActivity extends AppCompatActivity{
    private static final String TAG = "ProfileActivity";
    private static final int ACTIVITY_NUM = 4;
    private static final int NUM_GRID_COLUMS = 3;
    private ImageView profilePhoto;

    private Context mContext = ProfileActivity.this;

    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG, "onCreate: started.");

        setupBottomNavigationView();
        setupToolbar();
        setupActivityWidgets();
        setProfileImage();
        tempGridSetup();
    }

    private void tempGridSetup(){
        ArrayList<String> imgURLs = new ArrayList<>();
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");
        imgURLs.add("https://lh3.ggpht.com/R8_no32JKn7gWVsXVNTGnAKRvJ-KkvuVH5xkWUQ7IywG_lkbnD1RR8SrQrVASW3JQTc=w300");

        setupImageGrid(imgURLs);
    }

    private void setupImageGrid(ArrayList<String> imgURLs){
        GridView gridView = (GridView) findViewById(R.id.gridView);

        int gridWidth = getResources().getDisplayMetrics().widthPixels;
        int imageWidth = gridWidth/NUM_GRID_COLUMS;
        gridView.setColumnWidth(imageWidth);

        GridImageAdapter adapter = new GridImageAdapter(mContext, R.layout.layout_grid_imageview, "", imgURLs);
        gridView.setAdapter(adapter);
    }

    private void setProfileImage(){
        Log.d(TAG, "setProfileImage: setting profile photo.");
        String imgURL = "i.pinimg.com/474x/3a/92/04/3a92048181d5732bdb152318d1c0961f--mobile-application-development-app-development.jpg";
        UniversalImageLoader.setImage(imgURL, profilePhoto, mProgressBar, "https://");
    }

    private void setupActivityWidgets(){
        mProgressBar = (ProgressBar) findViewById(R.id.profileProgressBar);
        mProgressBar.setVisibility(View.GONE);
        profilePhoto = (ImageView) findViewById(R.id.profile_photo);
    }

    private void setupToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.profileToolBar);
        setSupportActionBar(toolbar);

        ImageView profileMenu = (ImageView) findViewById(R.id.profileMenu);
        profileMenu.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Log.d(TAG, "onClick: Navigating to account settings");
                Intent intent = new Intent(mContext, AccountSettingsActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * BottomNavigationView setup
     */
    private void setupBottomNavigationView(){
        Log.d(TAG, "setupBottomNavigationView: setting up BottomNavigationView");
        BottomNavigationViewEx bottomNavigationViewEx = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationViewEx);
        BottomNavigationViewHelper.enableNavigation(mContext, bottomNavigationViewEx);
        Menu menu = bottomNavigationViewEx.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
    }
}
