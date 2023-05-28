/*
 *     Tanggal Pengerjaan : 15/05/2023
 *     Nim : 10120249
 *     Nama : Stanislaus Katska Alvin Parulian Sitanggang
 *     Kelas : IF-6
 */
package com.alvin.a10120249_uts_myself;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.ListFragment;

import java.util.List;

public class SliderPager extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentList;

    public SliderPager(FragmentManager fm, List<Fragment> fragmentList){
        super(fm);
        this.fragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) { return fragmentList.get(position);}

    @Override
    public int getCount() { return fragmentList.size();}
}
