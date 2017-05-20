package team.band.blue.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import team.band.blue.SanctionsMain;
import team.band.blue.animation.Animation;

public class HelloState extends State{
    private TextureRegion bg;
    private TextureRegion helloWord;
    private TextureRegion toPress;
    private Animation toPressAnimation;

    private Skin skins;

    public HelloState(GameStateManager gsm) {
        super(gsm);
        camera.setToOrtho(false, SanctionsMain.WIDTH, SanctionsMain.HEIGHT);

        toPressAnimation = new Animation(24, 1.5f);

        skins = new Skin(atlas);
        bg = skins.getRegion("bg/menu_bg");
        helloWord = skins.getRegion("texts/main_text");
        toPress = skins.getRegion("texts/menu_text_press");
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()) {
            gsm.set(new DialogState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
        toPressAnimation.update(dt);
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(bg, 0, 0, SanctionsMain.WIDTH, SanctionsMain.HEIGHT);
        batch.draw(helloWord,
                SanctionsMain.WIDTH / 2 - helloWord.getRegionWidth() / 2,
                SanctionsMain.HEIGHT / 2 - helloWord.getRegionHeight() / 2,
                helloWord.getRegionWidth(),
                helloWord.getRegionHeight());
        batch.draw(toPressAnimation.getFrame(),
                SanctionsMain.WIDTH / 2 - toPress.getRegionWidth() / 2 - 15,
                toPress.getRegionHeight(),
                toPress.getRegionWidth(),
                toPress.getRegionHeight()
        );

        batch.end();
    }

    @Override
    public void create() {}

    @Override
    public void dispose() {
        skins.dispose();
        atlas.dispose();
    }
}
