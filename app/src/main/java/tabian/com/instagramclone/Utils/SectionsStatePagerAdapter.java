package tabian.com.instagramclone.Utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by AnsonLau on 8/11/2017.
 */

public class SectionsStatePagerAdapter extends FragmentStatePagerAdapter{
    private final List<Fragment> mFragementList = new ArrayList<>();
    private final HashMap<Fragment, Integer> mFragments = new HashMap<>();
    private final HashMap<String, Integer> mFragmentNumbers = new HashMap<>();
    private final HashMap<Integer, String> mFragmentNames = new HashMap<>();

    public SectionsStatePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragementList.get(position);
    }

    @Override
    public int getCount() {
        return mFragementList.size();
    }

    public void addFragment(Fragment fragment, String fragmentName){
        mFragementList.add(fragment);
        mFragments.put(fragment, mFragementList.size()-1);
        mFragmentNumbers.put(fragmentName, mFragementList.size()-1);
        mFragmentNames.put(mFragementList.size()-1, fragmentName);
    }

    public Integer getFragmentNumber(String fragmentName){
        if(mFragmentNumbers.containsKey(fragmentName)){
            return mFragmentNumbers.get(fragmentName);
        } else {
            return null;
        }
    }

    public Integer getFragmentNumber(Fragment fragment){
        if(mFragmentNumbers.containsKey(fragment)){
            return mFragmentNumbers.get(fragment);
        } else {
            return null;
        }
    }

    public Integer getFragmentName(Integer fragmentNumber){
        if(mFragmentNumbers.containsKey(fragmentNumber)){
            return mFragmentNumbers.get(fragmentNumber);
        } else {
            return null;
        }
    }
}
