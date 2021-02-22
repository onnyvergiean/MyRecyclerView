package com.example.myrecyclerview

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class GridHeroAdapter(val listHero: ArrayList<Hero>) :
    RecyclerView.Adapter<GridHeroAdapter.GridViewHolder>() {


    override fun onCreateViewHolder(ViewGroup: ViewGroup, viewType: Int): GridViewHolder {
        val view: View = LayoutInflater.from(ViewGroup.context)
            .inflate(R.layout.item_grid_hero, ViewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listHero[position])
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)

    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
}