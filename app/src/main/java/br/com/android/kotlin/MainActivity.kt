package br.com.android.kotlin

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {

    @BindView(R.id.lottieAnimationView) lateinit var mLottieAnimationView: LottieAnimationView
    @BindView(R.id.fab_anim_one) lateinit var mFabAnimOne: FloatingActionButton
    @BindView(R.id.fab_anim_two) lateinit var mFabAnimTwo: FloatingActionButton
    @BindView(R.id.fab_anim_three) lateinit var mFabAnimThree: FloatingActionButton
    @BindView(R.id.fab_anim_four) lateinit var mFabAnimFour: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        listeners()
    }

    /**
     * Set listener for fab's on View
     */
    private fun listeners() {
        mFabAnimOne.setOnClickListener {  changeAnimation("airplane_flying.json") }
        mFabAnimTwo.setOnClickListener {  changeAnimation("hint.json") }
        mFabAnimThree.setOnClickListener {  changeAnimation("no_connection.json") }
        mFabAnimFour.setOnClickListener {  changeAnimation("loading_yeti.json") }
    }

    /**
     * Change animation for LottieAnimationView
     */
    private fun changeAnimation(fileName: String) {
        mLottieAnimationView.setAnimation(fileName)
        mLottieAnimationView.playAnimation()
        mLottieAnimationView.loop(true)
    }
}
