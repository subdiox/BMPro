package com.subdiox.blitzmodderpro.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import co.zsmb.materialdrawerkt.builders.drawer
import co.zsmb.materialdrawerkt.draweritems.badgeable.*
import co.zsmb.materialdrawerkt.draweritems.divider
import com.mikepenz.materialdrawer.Drawer
import com.subdiox.blitzmodderpro.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var drawer: Drawer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawer = drawer {
            toolbar = this@MainActivity.toolbar
            primaryItem("subdiox") {}
            divider {}
            primaryItem("Settings") {}
            primaryItem("Trouble Shooting") {}
            primaryItem("Contact") {}
        }
    }
}
