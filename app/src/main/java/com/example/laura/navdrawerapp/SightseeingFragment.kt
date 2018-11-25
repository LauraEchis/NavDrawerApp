package com.example.laura.navdrawerapp

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

class SightseeingFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_sightseeing, container, false)
        var listView = view.findViewById<ListView>(R.id.sightseeing_listView)
        var arrSightseeing: ArrayList<Sightseeing> = ArrayList()
        arrSightseeing.add(Sightseeing("Стена", R.drawable.wall))
        arrSightseeing.add(Sightseeing("Красный замок", R.drawable.red_keep))
        arrSightseeing.add(Sightseeing("Орлиное гнездо", R.drawable.eyrie))
        arrSightseeing.add(Sightseeing("Утёс Кастерли", R.drawable.casterly_rock))
        arrSightseeing.add(Sightseeing("Хайгарден", R.drawable.highgarden))
        arrSightseeing.add(Sightseeing("Пайк", R.drawable.pyke))
        arrSightseeing.add(Sightseeing("Риверран", R.drawable.riverran))
        arrSightseeing.add(Sightseeing("Штормовой Предел", R.drawable.stormend))
        arrSightseeing.add(Sightseeing("Винтерфелл", R.drawable.winterfell))

        listView.adapter = SightseeingAdapter(this.context as Context, arrSightseeing)

        return view
//        return inflater?.inflate(R.layout.fragment_sightseeing, null)
//        return super.onCreateView(inflater, container, savedInstanceState)
    }

}