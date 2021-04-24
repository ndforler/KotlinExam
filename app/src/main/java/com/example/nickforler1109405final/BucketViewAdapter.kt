package com.example.nickforler1109405final

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BucketViewAdapter (val context: Context,
                       val buckets : List<BucketList>) : RecyclerView.Adapter<BucketViewAdapter.TeamViewHolder>()
{
    //inner class for Team View Holder
    inner class TeamViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById<TextView>(R.id.nameText)
        val description = itemView.findViewById<TextView>(R.id.descriptionText)
        val rating = itemView.findViewById<TextView>(R.id.rankingText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.activity_bucket_view_adapter, parent, false)
        return TeamViewHolder(view)
    }

    override fun getItemCount(): Int {
        return buckets.size
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val team = buckets[position]
        with (holder){
            name.text = team.name
            rating.text = team.rating.toString()
            description.text = team.description
        }
    }
}