package team.band.blue.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import team.band.blue.SanctionsMain;

public class DialogState extends State{

    private Stage stage;
    private ImageButton yesButton;
    private ImageButton noButton;
    private Skin skins;
    private TextureRegion bg;
    private TextureRegion questionText;

    public DialogState(GameStateManager gsm) {
        super(gsm);
        camera.setToOrtho(false, SanctionsMain.WIDTH, SanctionsMain.HEIGHT);

        skins = new Skin(atlas);

        bg = skins.getRegion("bg/q_bg");
        questionText = skins.getRegion("texts/q_text");

        yesButton = yesButtonCreate();
        noButton = noButtonCreate();

        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        stage.addActor(yesButton);
        stage.addActor(noButton);
    }

    public void create() {}

    @Override
    protected void handleInput() {}

    @Override
    public void update(float dt) {}

    @Override
    public void render(SpriteBatch batch) {
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(bg, 0, 0, SanctionsMain.WIDTH, SanctionsMain.HEIGHT);
        batch.draw(questionText,
                SanctionsMain.WIDTH / 2 - questionText.getRegionWidth() / 2,
                SanctionsMain.HEIGHT / 2 + questionText.getRegionHeight(),
                questionText.getRegionWidth(),
                questionText.getRegionHeight());

        //кривой фикс отрисовки сцены поверх последнего элемента, нарисованного батчем
        //отрисовку сцены выносим ЗА батчи - у неё своя личная отрисовка, фикс не нужен
        batch.end();

        stage.getViewport().setCamera(camera);
        stage.draw();
    }

    @Override
    public void dispose() {
        skins.dispose();
        atlas.dispose();
    }

    public ImageButton yesButtonCreate() {
        ImageButtonStyle yesStyle = new ImageButtonStyle();
        yesStyle.up = skins.getDrawable("btns/y_btn_up");
        yesStyle.down = skins.getDrawable("btns/y_btn_down");
        yesStyle.checked = skins.getDrawable("btns/y_btn_checked");

        // all images of button are the same size
        TextureRegion buttonSize = skins.getRegion("btns/y_btn_up");

        yesButton = new ImageButton(yesStyle);
        yesButton.setSize(buttonSize.getRegionWidth(), buttonSize.getRegionHeight());
        yesButton.setPosition(SanctionsMain.WIDTH / 2 - buttonSize.getRegionWidth() / 2,
                SanctionsMain.HEIGHT / 2);

        yesButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                System.out.println("YEEEEEEEEEEEEEEEEEEEAAAH");
                gsm.set(new YesState(gsm));
            }
        });

        return yesButton;
    }

    public ImageButton noButtonCreate() {
        ImageButtonStyle noStyle = new ImageButtonStyle();
        noStyle.up = skins.getDrawable("btns/n_btn_up");
        noStyle.down = skins.getDrawable("btns/n_btn_down");
        noStyle.checked = skins.getDrawable("btns/n_btn_checked");

        // all images of button are the same size
        TextureRegion buttonSize = skins.getRegion("btns/n_btn_up");

        noButton = new ImageButton(noStyle);
        noButton.setSize(buttonSize.getRegionWidth(), buttonSize.getRegionHeight());
        noButton.setPosition(SanctionsMain.WIDTH / 2 - buttonSize.getRegionWidth() / 2,
                SanctionsMain.HEIGHT / 2 - buttonSize.getRegionHeight());

        noButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                System.out.println("NOOOOOOOOOOOOO");
                gsm.set(new NoState(gsm));
            }
        });

        return noButton;
    }
}
