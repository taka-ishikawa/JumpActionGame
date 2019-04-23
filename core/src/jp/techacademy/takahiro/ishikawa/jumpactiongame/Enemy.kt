package jp.techacademy.takahiro.ishikawa.jumpactiongame

import com.badlogic.gdx.graphics.Texture

class Enemy(type: Int, texture: Texture?, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    : GameObject(texture, srcX, srcY, srcWidth, srcHeight) {

    companion object {
        // 横幅、高さ
        val ENEMY_WIDTH = 1.0f
        val ENEMY_HEIGHT = 0.8f

        // 状態
        val ENEMY_EXIST = 0
        val ENEMY_NONE = 1

        // タイプ（通常と動くタイプ）
        val ENEMY_TYPE_STATIC = 0
        val ENEMY_TYPE_MOVING = 1

        // 速度
        val ENEMY_VELOCITY = 2.0f
    }

    var mState: Int = 0
    var mType: Int = 0

    init {
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT)
        mState = ENEMY_EXIST
        mType = type
        if (mType == ENEMY_TYPE_MOVING) {
            velocity.x = ENEMY_VELOCITY
        }
    }

//    +α
//    fun kill() {
//        mState = ENEMY_NONE
//        setAlpha(0f)
//    }
}