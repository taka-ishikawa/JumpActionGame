package jp.techacademy.takahiro.ishikawa.jumpactiongame

import com.badlogic.gdx.Game
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class JumpActionGame(val mRequestHandler: ActivityRequestHandler) : Game() {

    lateinit var batch: SpriteBatch

    override fun create() {
        batch = SpriteBatch()
        // GameScreenを表示する
        setScreen(StartScreen(this, mHighScore))
    }

    override fun dispose() {
        batch.dispose()
    }
}