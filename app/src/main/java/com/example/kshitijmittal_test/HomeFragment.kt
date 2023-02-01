package com.example.kshitijmittal_test


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout


class HomeFragment : Fragment() {

    lateinit var homeTabs : TabLayout

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        homeTabs = view.findViewById<TabLayout>(R.id.homeTabs)
        val mViewPager = view.findViewById<View>(R.id.home_viewPager) as ViewPager
        val mSectionsPagerAdapter = SectionsPagerAdapter(childFragmentManager)
        mViewPager.adapter = mSectionsPagerAdapter
        return view

    }

    private class SectionsPagerAdapter(fm: FragmentManager?) :
        FragmentPagerAdapter(fm!!) {

        override fun getItem(position: Int): Fragment {
            return when (position) {
                0 -> ForYouFragment.newInstance(1)
                1 -> TopChartsFragment.newInstance(2)
                2 -> CategoriesFragment.newInstance(3)
                3 -> EditorChoiceFragment.newInstance(4)
                else -> EarlyAccessFragment.newInstance(5)
            }
        }

        override fun getCount(): Int {

            return 5
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return when (position) {
                0 -> "For You"
                1 -> "Top Charts"
                2 -> "Categories"
                3 -> "Editor's Choice"
                else -> "Early Access"
            }


        }

    }


}