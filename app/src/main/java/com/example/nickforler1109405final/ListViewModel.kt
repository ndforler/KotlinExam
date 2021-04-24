package com.example.nickforler1109405final

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query

class ListViewModel : ViewModel(){
    private val list = MutableLiveData<List<BucketList>>()

    init{
        loadListing()
    }

    fun getListing(): LiveData<List<BucketList>> {
        return list
    }

    private fun loadListing(){
        val db = FirebaseFirestore.getInstance().collection("bucketList").orderBy("rating", Query.Direction.DESCENDING)

        db.addSnapshotListener { documents, exception ->
            if (exception != null) {
                Log.w("DB RESPONSE", "loadListing() failed", exception)
                return@addSnapshotListener
            }

            val bucketList = ArrayList<BucketList>()

            documents?.let {
                for (document in documents) {
                    val listing = document.toObject(BucketList::class.java)
                    bucketList.add(listing)
                }
                list.value = bucketList
            }
        }
    }
}