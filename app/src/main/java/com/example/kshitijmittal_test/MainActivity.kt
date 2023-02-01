package com.example.kshitijmittal_test



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tabViewpager = findViewById<ViewPager>(R.id.tab_viewpager)
        val tabTabLayout = findViewById<TabLayout>(R.id.tab_tablayout)


        mysetupViewPager(tabViewpager)

        tabTabLayout.setupWithViewPager(tabViewpager)
    }

    fun mysetupViewPager(viewpager: ViewPager) {

        var adapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(HomeFragment(), "HOME")
        adapter.addFragment(GamesFragment(), "GAMES")
        adapter.addFragment(MoviesFragment(),"MOVIES")
        adapter.addFragment(MusicFragment(), "MUSIC")
        adapter.addFragment(BooksFragment(), "BOOKS")

        viewpager.adapter = adapter
    }


}