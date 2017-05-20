package team.band.blue.future.your.know.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton.TextButtonStyle;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;

import team.band.blue.future.your.know.ActionResolver;
import team.band.blue.future.your.know.Main;
import team.band.blue.future.your.know.aswers.Answers;

public class AnswerState extends State{

    private Texture bg;
    private Answers answers;
    private GlyphLayout glyphLayout;

    private float timer;
    private float timerMultiplier;
    private float blinkingTimer;
    private boolean isBTReseted;
    private boolean fadeOut;

    private Stage stage;
    private TextButton textButton;

    private ActionResolver actionResolver;

    public AnswerState(GameStateManager gsm, ActionResolver actionResolver) {
        super(gsm);

        this.actionResolver = actionResolver;
        camera.setToOrtho(false, Main.WIDTH, Main.HEIGHT);
        answers = new Answers();
        glyphLayout = new GlyphLayout();
        bg = new Texture("bg_ans.jpg");

        timer = 0;
        timerMultiplier = 0.001f;
        blinkingTimer = 0;

        stage = new Stage();
        stage.addActor(textButtonSetup());
        Gdx.input.setInputProcessor(stage);

        isBTReseted = false;
        fadeOut = false;
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()) {
            gsm.set(new ConcentrationState(gsm, actionResolver));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
        //System.out.println("answ " + setFloatDeltaTimer());
    }

    @Override
    public void render(SpriteBatch batch) {

        glyphLayout.setText(font1, answers.getCurrentAnswerPhrase());

        batch.begin();
        font1.setColor(0, 0, 0, setFloatDeltaTimer());
        font1.draw(
                batch,
                answers.getCurrentAnswerPhrase(),
                0,
                (Main.HEIGHT + glyphLayout.height) / 2,
                Main.WIDTH,
                Align.center,
                false
        );
        batch.end();


        textButton.setColor(0, 0, 0, setFloatBlinkTimer());
        stage.getViewport().setCamera(camera);
        if(timer == 1) {
            resetBlinkingTimer();
            stage.draw();
        }
    }

    @Override
    public void create() {    }

    @Override
    public void dispose() {
        bg.dispose();
    }

    public float setFloatDeltaTimer() {
        if(timer < 1) {
            timerMultiplier += timerMultiplier / 50;
            timer += timerMultiplier;
        }
        else if (timer > 1) {
            timer = 1;
        }
        return timer;
    }

    public TextButton textButtonSetup() {
        String text = "bla bla bla";

        GlyphLayout layout = new GlyphLayout();
        layout.setText(font2, text);

        TextButtonStyle textButtonStyle = new TextButton.TextButtonStyle();
        textButtonStyle.font = font2;
        textButton = new TextButton(text, textButtonStyle);
        textButton.setSize(layout.width, layout.height);
        textButton.setPosition(Main.WIDTH / 2, Main.HEIGHT / 10, Align.center);

        textButton.addListener(new ClickListener() {

            public void clicked(InputEvent event, float x, float y) {
                //System.out.println("answer pressed");
                actionResolver.showOrLoadInterstitial();
                gsm.set(new ConcentrationState(gsm, actionResolver));
            }
        });

        return textButton;
    }
    public float setFloatBlinkTimer() {
        if(!fadeOut) {
            blinkingTimer += 0.014f;
            if(blinkingTimer >= 1) {
                fadeOut = true;
            }
        }
        else if(fadeOut) {
            blinkingTimer -= 0.014f;
            if(blinkingTimer <= 0) {
                fadeOut = false;
            }
        }
        return blinkingTimer;
    }

    public void resetBlinkingTimer() {
        if(!isBTReseted) {
            blinkingTimer = 0;
            isBTReseted = true;
        }
    }

}














