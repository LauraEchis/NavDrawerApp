package com.example.laura.navdrawerapp

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class EventFragment: Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_event, container, false)
        var listView = view.findViewById<ListView>(R.id.event_listView)
        var arrevent: ArrayList<Event> = ArrayList()
        arrevent.add(Event("Колокольная бива", R.drawable.battle_of_the_bells, "283 после З.Э."))
        arrevent.add(Event("Битва на Трезубце", R.drawable.trident, "283 после З.Э."))
        arrevent.add(Event("Битва на Кулаке Первых людей", R.drawable.battle_on_the_fist, "299 после З.Э."))
        arrevent.add(Event("Битва на Черноводной", R.drawable.blackwater_battle, "299 после З.Э."))
        arrevent.add(Event("Битва при Винтерфелле", R.drawable.winterfell_battle, "299 после З.Э."))


        listView.adapter = EventAdapter(this.context as Context, arrevent)

        return view
//        return super.onCreateView(inflater, container, savedInstanceState)
    }
}