package com.kitkagames.fal.white

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.kitkagames.fal.R

class Game : AppCompatActivity() {
    val roll= mutableListOf<Long>(1250,1500,2000)
    var dur1:Long=0
    var dur2:Long=0
    var scr1=0
    var scr2=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
        val im1=findViewById<ImageView>(R.id.car1)
        val im2=findViewById<ImageView>(R.id.car2)
        val scorey=findViewById<TextView>(R.id.yourscr)
        val scoree=findViewById<TextView>(R.id.enemyscr)
        im1.setOnClickListener {
            im1.animate().apply {
                dur1=0
                duration=roll.random()
                translationY(-750f)
                dur1=dur1+duration
            }.withEndAction {
                im1.animate().apply {
                    dur1=dur1+duration
                    duration=1500
                    rotation(180f)
                }.withEndAction {
                    im1.animate().apply {
                        dur1=0
                        duration=roll.random()
                        translationY(10f)
                        dur1=dur1+duration
                }.withEndAction {
                        im1.animate().apply {

                            dur1 = dur1 + duration
                            duration = 1500
                            rotation(0f)
                        }.withEndAction {
                            if(dur1>=dur2){
                                scr1++
                                scorey.text="$scr1"
                            }else{
                                scr2++
                                scoree.text="$scr2"
                            }

                        }.start()
                    }
                }
            }
            im2.animate().apply {
                dur2=0
                duration=roll.random()
                translationY(-750f)
                dur2=dur2+duration
            }.withEndAction {
                im2.animate().apply {
                    dur2=dur2+duration
                    duration=1500
                    rotation(180f)
                }.withEndAction {
                    im2.animate().apply {
                        dur2=0
                        duration=roll.random()
                        translationY(10f)
                        dur2=dur2+duration
                    }.withEndAction {
                        im2.animate().apply {
                            dur2 = dur2 + duration
                            duration = 1500
                            rotation(0f)

                        }
                    }
                }
            }
        }
        im2.setOnClickListener {
            im1.animate().apply {
                dur1=0
                duration=roll.random()
                translationY(-750f)
                dur1=dur1+duration
            }.withEndAction {
                im1.animate().apply {
                    dur1=dur1+duration
                    duration=1500
                    rotation(180f)
                }.withEndAction {
                    im1.animate().apply {
                        dur1=0
                        duration=roll.random()
                        translationY(10f)
                        dur1=dur1+duration
                    }.withEndAction {
                        im1.animate().apply {
                            dur1 = dur1 + duration
                            duration = 1500
                            rotation(0f)
                        }
                    }
                }
            }
            im2.animate().apply {
                dur2=0
                duration=roll.random()
                translationY(-750f)
                dur2=dur2+duration
            }.withEndAction {
                im2.animate().apply {
                    dur2=dur2+duration
                    duration=1500
                    rotation(180f)
                }.withEndAction {
                    im2.animate().apply {
                        dur2=0
                        duration=roll.random()
                        translationY(10f)
                        dur2=dur2+duration
                    }.withEndAction {
                        im2.animate().apply {
                            dur2 = dur2 + duration
                            duration = 1500
                            rotation(0f)

                        }.withEndAction {
                            if(dur2>=dur1){
                                scr1++
                                scorey.text="$scr1"
                            }else{
                                scr2++
                                scoree.text="$scr2"
                            }

                        }.start()
                    }
                }
            }
        }
    }
}