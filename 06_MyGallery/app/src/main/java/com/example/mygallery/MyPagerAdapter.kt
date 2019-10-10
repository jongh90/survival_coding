package com.example.mygallery

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MyPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {
    private val items = ArrayList<Fragment>()

    override fun getCount(): Int {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return items.size
    }

    override fun getItem(position: Int): Fragment {
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return items[position]
    }

    fun updateFragments(items : List<Fragment>){
        this.items.addAll(items)
    }

}