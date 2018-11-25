package com.example.laura.navdrawerapp

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class CafeFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.fragment_cafe, container, false)
        var listView = view.findViewById<ListView>(R.id.cafe_listView)
        var arrcafe: ArrayList<Cafe> = ArrayList()
//        arrcafe.add(Cafe("Смердящий гусь (Речные земли)", R.drawable.stinkin_goose))
        arrcafe.add(Cafe("Red Keep", R.drawable.red_keep))
        arrcafe.add(Cafe("Red Keep", R.drawable.red_keep))
        arrcafe.add(Cafe("Red Keep", R.drawable.red_keep))
        arrcafe.add(Cafe("Red Keep", R.drawable.red_keep))
        arrcafe.add(Cafe("Red Keep", R.drawable.red_keep))

        listView.adapter = CafeAdapter(this.context as Context, arrcafe)

        return view
//        return super.onCreateView(inflater, container, savedInstanceState)
    }
}