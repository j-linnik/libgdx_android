package team.band.blue.states;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector3;

public abstract class State extends Game {
    protected OrthographicCamera camera;
    protected Vector3 vector;
    protected GameStateManager gsm;
    protected TextureAtlas atlas;

    public State(GameStateManager gsm){
        this.gsm = gsm;
        camera = new OrthographicCamera();
        vector = new Vector3();
        atlas = new TextureAtlas(Gdx.files.internal("sources/ynfiles.atlas"));
    }

    protected abstract void handleInput();
    public abstract void update(float dt);
    public abstract void render(SpriteBatch batch);
    public abstract void dispose();
}
