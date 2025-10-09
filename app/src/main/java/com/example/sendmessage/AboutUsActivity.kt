package com.example.sendmessage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import husaynhakeem.com.aboutpage.AboutPage
import husaynhakeem.com.aboutpage.Item

class AboutUsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(AboutPage(this)
            .setBackground(android.R.color.white)
            .setImage(R.mipmap.ic_launcher)
            .addItem(Item("AboutPage Version 1.0"))
            .addEmail("husaynhakeem@gmail.com")
            .addFacebook("linkinpark")
            .addGithub("husaynhakeem")
            .addInstagram("husaynhakeem")
            .addPlayStore("com.maketrumptweetseightagain")
            .addTwitter("oneplus")
            .addWebsite("http://www.google.com")
            .addYoutube("UCyWqModMQlbIo8274Wh_ZsQ")
            .addItem(Item("Thank you for downloading", null, View.OnClickListener { Toast.makeText(this, "Enjoy!", Toast.LENGTH_SHORT).show() }))
            .create())
    }
}