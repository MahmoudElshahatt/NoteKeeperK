package com.example.notekeeperkotlin
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NoteListActivity : AppCompatActivity() {


    private val list: ListView?
        get() {
            val list = findViewById<ListView>(R.id.listNotes)
            return list
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        val fab=findViewById<FloatingActionButton>(R.id.fab)

        fab.setOnClickListener {
            val activityIntent= Intent(this,MainActivity::class.java)
            startActivity(activityIntent)
        }

        list?.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            DataManager.notes
        )
        list?.setOnItemClickListener{ parent,view,position,id->
            val activityIntent= Intent(this,MainActivity::class.java)
            activityIntent.putExtra(NOTE_POSITION,position)
            startActivity(activityIntent)
        }
    }

    override fun onResume() {
        super.onResume()
        (list?.adapter as ArrayAdapter<NoteInfo>).notifyDataSetChanged()
    }


}