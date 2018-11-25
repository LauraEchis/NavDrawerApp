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
        arrevent.add(Event("The Wall", R.drawable.wall, "15/07/363 З.Э."))
        arrevent.add(Event("Red Keep", R.drawable.red_keep, "16/07/363 З.Э."))

        listView.adapter = EventAdapter(this.context as Context, arrevent)

        return view
//        return super.onCreateView(inflater, container, savedInstanceState)
    }
}