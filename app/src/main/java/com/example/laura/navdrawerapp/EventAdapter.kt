package com.example.laura.navdrawerapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TableRow
import android.widget.TextView

class EventAdapter(var context: Context, var event: ArrayList<Event>) : BaseAdapter() {

    private class ViewHolder(row: View?) {
        var txtName: TextView
        var ivImage: ImageView
        var txtDate: TextView

        init {
            this.txtName = row?.findViewById(R.id.event_name) as TextView
            this.ivImage = row?.findViewById(R.id.event_image) as ImageView
            this.txtDate = row?.findViewById(R.id.event_date) as TextView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder
        if (convertView == null) {
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.event_item_list, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var event: Event = getItem(position) as Event
        viewHolder.txtName.text = event.name
        viewHolder.txtDate.text = event.date
        viewHolder.ivImage.setImageResource(event.Image)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return event.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return event.count()
    }
}