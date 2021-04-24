package com.example.nickforler1109405final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.nickforler1109405final.databinding.ActivityNewBucketBinding
import com.google.firebase.firestore.FirebaseFirestore

class NewBucketActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewBucketBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewBucketBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.destinationButton.setOnClickListener {
            if(binding.editDescription.text.isNotEmpty() && binding.editDestination.text.isNotEmpty() && binding.spinner.selectedItemPosition != 0){
                val bucketList = BucketList()
                bucketList.name = binding.editDestination.text.toString()
                bucketList.description = binding.editDescription.text.toString()
                bucketList.rating = binding.spinner.selectedItem.toString()

                val db = FirebaseFirestore.getInstance().collection("bucketList")
                bucketList.id = db.document().id

                db.document(bucketList.id!!).set(bucketList)
                    .addOnSuccessListener {
                        Toast.makeText(this, "Item added to Bucket List", Toast.LENGTH_LONG).show()
                        binding.editDescription.setText("")
                        binding.editDestination.setText("")
                        binding.spinner.setSelection(0)
                        var intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                    }
                    .addOnFailureListener{
                        Toast.makeText(this, it.localizedMessage, Toast.LENGTH_LONG).show()
                    }
            }else{
                Toast.makeText(this, "Please make sure all fields are filled", Toast.LENGTH_LONG).show()
            }
        }

    }
}