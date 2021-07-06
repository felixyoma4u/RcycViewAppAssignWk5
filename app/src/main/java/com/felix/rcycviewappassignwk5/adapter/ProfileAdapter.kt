package com.felix.rcycviewappassignwk5.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.felix.rcycviewappassignwk5.databinding.ProfileViewsBinding
import com.felix.rcycviewappassignwk5.models.Profile

class ProfileAdapter(val profiles: List<Profile>)
    : RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {

    class ProfileViewHolder(var binding: ProfileViewsBinding):
        RecyclerView.ViewHolder(binding.root){
        fun bind(profiles: Profile){
        binding.profileImage.setImageResource(profiles.profileImage)
            binding.firstName.text = profiles.firstName
            binding.lastName.text = profiles.lastName
        }

        }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProfileAdapter.ProfileViewHolder {
        var binding = ProfileViewsBinding.inflate(LayoutInflater.from(parent.context))

        return ProfileViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val profile = profiles[position]
        holder.bind(profile)
    }

    override fun getItemCount(): Int {
        return profiles.size
    }


}