package com.felix.rcycviewappassignwk5.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.felix.rcycviewappassignwk5.R
import com.felix.rcycviewappassignwk5.adapter.ProfileAdapter
import com.felix.rcycviewappassignwk5.databinding.ActivityMainBinding
import com.felix.rcycviewappassignwk5.databinding.ActivityRecyclerBinding
import com.felix.rcycviewappassignwk5.models.Profile

class RecyclerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerBinding
    private lateinit var myProfileAdapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var profiles: List<Profile> = listOf(
            Profile(
                R.drawable.ic_africagirl,
                "Girl",
                "Africa"
            ),

            Profile(
                R.drawable.ic_arnold,
                "Arnold",
                "James"
            ),

            Profile(
                R.drawable.ic_collins,
                "Collins",
                "Joseph"
            ),

            Profile(
                R.drawable.ic_deborah,
                "Deborah",
                "Emmanuel"
            ),

            Profile(
                R.drawable.ic_emmanuel,
                "Emmanuel",
                "Nzeke"
            ),

            Profile(
                R.drawable.ic_felixface,
                "Felix",
                "Samuel"
            ),

            Profile(
                R.drawable.ic_frank,
                "Frank",
                "Golley"
            ),

            Profile(
                R.drawable.ic_jerry,
                "Jerry",
                "Kanu"
            ),

            Profile(
                R.drawable.ic_jet_li,
                "Jet",
                "Li"
            ),

            Profile(
                R.drawable.ic_john,
                "John",
                "Adabe"
            ),

            Profile(
                R.drawable.ic_loveth,
                "Loveth",
                "Okonji"
            ),

            Profile(
                R.drawable.ic_mark,
                "Mark",
                "Donald"
            ),

            Profile(
                R.drawable.ic_mary,
                "Mary",
                "Adejoh"
            ),

            Profile(
                R.drawable.ic_person2,
                "Person",
                "Jonah"
            ),

            Profile(
                R.drawable.ic_serious_woman,
                "Rebbeca",
                "Nweze"
            ),

            Profile(
                R.drawable.ic_smiling_teen_face,
                "Oloama",
                "Okoro"
            ),

            Profile(
                R.drawable.ic_tommy,
                "Tommy",
                "Jones"
            ),

            Profile(
                R.drawable.ic_winkboy,
                "Wizzy",
                "Mark"
            ),

            Profile(
                R.drawable.ic_zoby_guy,
                "Zubby",
                "Eze"
            ),

            Profile(
                R.drawable.ic_anita,
                "Anita",
                "Okoro"
            )
        )

        myProfileAdapter = ProfileAdapter(profiles)
        binding.recyclerView.adapter = myProfileAdapter

    }
}