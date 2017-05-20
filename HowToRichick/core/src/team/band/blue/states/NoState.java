package team.band.blue.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import team.band.blue.SanctionsMain;

public class NoState extends State{

    private Stage stage;
    private Skin skins;
    private ImageButton arrowButton;
    private TextureRegion bg;
    private TextureRegion noText;

    public NoState(GameStateManager gsm) {
        super(gsm);
        camera.setToOrtho(false, SanctionsMain.WIDTH, SanctionsMain.HEIGHT);

        skins = new Skin(atlas);
        bg = skins.getRegion("bg/n_cat_bg");
        noText = skins.getRegion("texts/n_text");

        arrowButton = arrowButtonCreate();

        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        stage.addActor(arrowButton);

    }

    @Override
    protected void handleInput() {}

    @Override
    public void update(float dt) {}

    @Override
    public void render(SpriteBatch batch) {
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(bg, 0, -50, SanctionsMain.WIDTH, SanctionsMain.HEIGHT);
        batch.draw(noText,
                SanctionsMain.WIDTH / 2 - noText.getRegionWidth() / 2,
                SanctionsMain.HEIGHT / 2 - noText.getRegionHeight() / 3 - 80,
                noText.getRegionWidth(),
                noText.getRegionHeight());
        batch.end();

        stage.getViewport().setCamera(camera);
        stage.draw();
    }

    @Override
    public void create() {}

    @Override
    public void dispose() {
        skins.dispose();
        atlas.dispose();
    }

    public ImageButton arrowButtonCreate() {
        ImageButton.ImageButtonStyle arrowStyle = new ImageButton.ImageButtonStyle();
        arrowStyle.up = skins.getDrawable("btns/arrow_btn_up_check");
        arrowStyle.down = skins.getDrawable("btns/arrow_btn_down");
        arrowStyle.checked = skins.getDrawable("btns/arrow_btn_up_check");

        // all images of button are the same size
        TextureRegion buttonSize = skins.getRegion("btns/arrow_btn_up_check");

        arrowButton = new ImageButton(arrowStyle);
        arrowButton.setSize(buttonSize.getRegionWidth(), buttonSize.getRegionHeight());
        arrowButton.setPosition(10, 10);

        arrowButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                System.out.println("BAAACCCCCCCCCCCCKKKKKKKKKk");
                gsm.set(new DialogState(gsm));
            }
        });
        return arrowButton;
    }
}
