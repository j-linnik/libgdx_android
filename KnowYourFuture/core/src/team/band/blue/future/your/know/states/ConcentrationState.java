package team.band.blue.future.your.know.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.TimeUtils;

import team.band.blue.future.your.know.ActionResolver;
import team.band.blue.future.your.know.animation.Animation;

public class ConcentrationState extends State {

    private boolean touch;
    private long time;
    private TextureRegion clockRegion;
    private Animation clockAnimation;

    private Skin skin;
    private float timer;
    private ActionResolver actionResolver;

    public ConcentrationState(GameStateManager gsm, ActionResolver actionResolver) {
        super(gsm);

        this.actionResolver = actionResolver;
        actionResolver.showOrLoadInterstitial();

        clockAnimation = new Animation(10, 10f);
        skin = new Skin(atlas);
        clockRegion = skin.getRegion("sample/example");

        timer = 0;
        timer += 0.01;
    }

    @Override
    protected void handleInput() {

        if(Gdx.input.isTouched() && !touch){
            time = TimeUtils.nanoTime();
            touch = true;
            clockAnimation.setCycleTime(clockAnimation.getCycleTime() / 5);
        }
        else if(!Gdx.input.isTouched() && touch){
            touch = false;
            time = TimeUtils.nanoTime();
            clockAnimation.setCycleTime(clockAnimation.getCycleTime() * 5);
        }
        else if((touch) && (TimeUtils.nanoTime() - time > 3000000000l)){
            gsm.set(new AnswerState(gsm, actionResolver));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
        clockAnimation.update(dt);
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.begin();
        batch.setColor(1.0f, 1.0f, 1.0f, setFloatDeltaTimer());
        batch.draw(clockAnimation.getFrame(),
                0,
                0,
                clockRegion.getRegionWidth(),
                clockRegion.getRegionHeight());
        batch.end();
    }

    @Override
    public void create() {

    }

    @Override
    public void dispose() {    }

    public float setFloatDeltaTimer() {
        if(timer < 1) {
            timer += 0.005f;
        }
        else if (timer > 1) {
            timer = 1;
        }

        return timer;
    }
}


















