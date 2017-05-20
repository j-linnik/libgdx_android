package team.band.blue.future.your.know.states;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

public abstract class State extends Game{

    final String FONT_CHARS = "абвгдежзийклмнопрстуфхцчшщъыьэюяabcdefghijklmno" +
            "pqrstuvwxyzАБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIJKLMNOPQRSTUV" +
            "WXYZ0123456789][_!$%#@|\\/?-+=()*&.;:,{}\"´`'<>";

    final String FONT_PATH = "font_2.ttf";

    protected BitmapFont font1;
    protected BitmapFont font2;

    protected OrthographicCamera camera;
    //protected Vector3 vector;
    protected GameStateManager gsm;
    protected TextureAtlas atlas;

    public State(GameStateManager gsm) {
        this.gsm = gsm;

        camera = new OrthographicCamera();
        //vector = new Vector3();
        atlas = new TextureAtlas(Gdx.files.internal("animation_res/animation.atlas"));

        fontInitial();
    }

    protected abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch batch);
    public abstract void dispose();

    protected void fontInitial() {
        FreeTypeFontGenerator fontGenerator1 = new FreeTypeFontGenerator(Gdx.files.internal(FONT_PATH));
        FreeTypeFontParameter fontParameter1 = new FreeTypeFontParameter();

        fontParameter1.characters = FONT_CHARS;
        fontParameter1.size = 60;
        font1 = fontGenerator1.generateFont(fontParameter1);

        FreeTypeFontGenerator fontGenerator2 = new FreeTypeFontGenerator(Gdx.files.internal(FONT_PATH));
        FreeTypeFontParameter fontParameter2 = new FreeTypeFontParameter();

        fontParameter2.characters = FONT_CHARS;
        fontParameter2.color = Color.BLACK;
        fontParameter2.size = 30;
        font2 = fontGenerator2.generateFont(fontParameter2);


        fontGenerator1.dispose();
        fontGenerator2.dispose();
    }

}












