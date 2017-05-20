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

public class HelloState extends State{
    private Texture bg;
    private GlyphLayout glyphLayout;
    private String hello;

    private float timer;
    private float blinkingTimer;
    private boolean fadeOut;
    private boolean isBTReseted;

    private Stage stage;
    private TextButton textButton;

    private ActionResolver actionResolver;

    public HelloState(GameStateManager gsm, ActionResolver actionResolver) {
        super(gsm);

        this.actionResolver = actionResolver;

        camera.setToOrtho(false, Main.WIDTH, Main.HEIGHT);

        bg = new Texture("bg_hello.jpg");
        glyphLayout = new GlyphLayout();
        hello =
                "Действуй\nцелеустрем- \nленно и\nрешительно"
        ;
        glyphLayout.setText(font1, hello);

        timer = 0;
        blinkingTimer = 0;
        stage = new Stage();
        stage.addActor(textButtonSetup());
        Gdx.input.setInputProcessor(stage);

        fadeOut = false;
        isBTReseted = false;
    }

    @Override
    protected void handleInput() { }

    @Override
    public void update(float dt) { }

    @Override
    public void render(SpriteBatch batch) {
        batch.setProjectionMatrix(camera.combined);

        batch.begin();
        batch.draw(bg, 0, 0, Main.WIDTH, Main.HEIGHT);
        font1.setColor(0, 0, 0, setFloatDeltaTimer());
        font1.draw(
                batch,
                hello,
                0,
                (Main.HEIGHT + glyphLayout.height) /2,
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
            timer += 0.005f;
        }
        else if (timer > 1) {
            timer = 1;
        }
        return timer;
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

    public TextButton textButtonSetup() {
        String text = "press to continue";

        GlyphLayout layout = new GlyphLayout();
        layout.setText(font2, text);

        TextButtonStyle textButtonStyle = new TextButtonStyle();
        textButtonStyle.font = font2;
        textButton = new TextButton(text, textButtonStyle);
        textButton.setSize(layout.width, layout.height);
        textButton.setPosition(Main.WIDTH / 2, Main.HEIGHT / 10, Align.center);

        textButton.addListener(new ClickListener() {

            public void clicked(InputEvent event, float x, float y) {
                //System.out.println("hello pressed");
                gsm.set(new ConcentrationState(gsm, actionResolver));
            }
        });

        return textButton;
    }

    public void resetBlinkingTimer() {
        if(!isBTReseted) {
            blinkingTimer = 0;
            isBTReseted = true;
        }
    }

}







