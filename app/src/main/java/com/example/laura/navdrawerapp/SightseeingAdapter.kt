package com.example.laura.navdrawerapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TableRow
import android.widget.TextView

class SightseeingAdapter(var context: Context, var sightseeing: ArrayList<Sightseeing>) : BaseAdapter() {

    private class ViewHolder(row: View?) {
        var txtName: TextView
        var ivImage: ImageView

        init {
            this.txtName = row?.findViewById(R.id.sightseeing_name) as TextView
            this.ivImage = row?.findViewById(R.id.sightseeing_image) as ImageView
        }
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder
        if (convertView == null) {
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.sightseeing_item_list, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        var sightseeing: Sightseeing = getItem(position) as Sightseeing
        viewHolder.txtName.text = sightseeing.name
        viewHolder.ivImage.setImageResource(sightseeing.Image)
        return view as View
    }

    override fun getItem(position: Int): Any {
        return sightseeing.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return sightseeing.count()
    }
}