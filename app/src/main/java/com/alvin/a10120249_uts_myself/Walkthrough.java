/*
 *     Tanggal Pengerjaan : 15/05/2023
 *     Nim : 10120249
 *     Nama : Stanislaus Katska Alvin Parulian Sitanggang
 *     Kelas : IF-6
 */
package com.alvin.a10120249_uts_myself;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.alvin.a10120249_uts_myself.fragments.Fragment1;
import com.alvin.a10120249_uts_myself.fragments.Fragment2;
import com.alvin.a10120249_uts_myself.fragments.Fragment3;

import java.util.ArrayList;
import java.util.List;

public class Walkthrough extends AppCompatActivity{

    private ViewPager pager;
    private PagerAdapter pagerAdapter;

    TextView counter;
    Button btn1;
    int total = 3, count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walkthrough);

        List<Fragment> list = new ArrayList<>();
        list.add(new Fragment1());
        list.add(new Fragment2());
        list.add(new Fragment3());

        counter = findViewById(R.id.counter);
        counter.setText(count+"/"+total);
        btn1 = findViewById(R.id.btn1);

        pager = findViewById(R.id.pager);
        pagerAdapter = new SliderPager(getSupportFragmentManager(),list);

        pager.setAdapter(pagerAdapter);

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                count = 0;
                count = position + 1;
                counter.setText(count+"/"+total);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void skip(View view) {
        Intent intent1 = new Intent(Walkthrough.this, Menu.class);
        startActivity(intent1);
        finish();
    }
}