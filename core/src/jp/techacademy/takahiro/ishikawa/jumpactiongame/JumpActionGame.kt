package jp.techacademy.takahiro.ishikawa.jumpactiongame

import com.badlogic.gdx.Game
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.audio.Sound
import com.badlogic.gdx.graphics.g2d.SpriteBatch


class JumpActionGame : Game() {
    lateinit var batch: SpriteBatch

    override fun create() {
        batch = SpriteBatch()
        setScreen(GameScreen(this))
    }
//
//    override fun render() {
//        Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
//        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
//        batch.begin()
//        batch.draw(img, 0f, 0f)
//        batch.end()
//    }
//
//    override fun dispose() {
//        batch.dispose()
//        img.dispose()
//    }
}
