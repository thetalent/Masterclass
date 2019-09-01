package com.falkhiller.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.share
import org.jetbrains.anko.toast

import com.prof.rssparser.Article
import com.prof.rssparser.Parser
import kotlinx.coroutines.*
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.view.View.FOCUS_UP
import android.widget.ScrollView
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i = 0
        lateinit var  articleList :MutableList<Article>
        textView.setMovementMethod(ScrollingMovementMethod())



//url of RSS feed
        val url = "https://www.landkreis-lueneburg.de/contentxxl/services/export/getcontent.aspx?mid=15426&mdefid=71&eid=39"

        GlobalScope.launch {
            try {
                val parser = Parser()
                 articleList = parser.getArticles(url)
                // The list contains all article's data. For example you can use it for your adapter.
                textView.text = articleList[i].toString()

            } catch (e: Throwable) {
                textView.text = e.message

            }
        }
        button2.onClick {
            try{
                textView.text = articleList[i++].content.toString()}
            catch(e:Exception){
                i = 0
                textView.text = articleList[i]!!.content.toString()
            }


        }

        }
    }








