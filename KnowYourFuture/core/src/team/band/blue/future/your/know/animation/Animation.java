package team.band.blue.future.your.know.animation;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class Animation {

    private Array<TextureRegion> frames;
    private float maxFrameTime;
    private float currentFrameTime;
    private int frameCount;
    private int frame;
    private TextureAtlas atlas;
    private float cycleTime;

    public Animation(int frameCount, float ct) {

        atlas = new TextureAtlas(Gdx.files.internal("animation_res/animation.atlas"));

        cycleTime = ct;

        frames = new Array<TextureRegion>();
        frames.addAll(atlas.findRegions("clock"));
        this.frameCount = frameCount;
        //maxFrameTime = cycleTime / frameCount;
        frame = 0;
    }

    public void update(float dt) {
        maxFrameTime = cycleTime / frameCount;
        currentFrameTime += dt;
        if(currentFrameTime > maxFrameTime) {
            frame++;
            currentFrameTime = 0;
        }
        if(frame >=frameCount) { frame = 0; }
    }

    public TextureRegion getFrame() { return frames.get(frame); }

    public float getCycleTime() { return cycleTime; }

    public void setCycleTime(float ct) { cycleTime = ct; }
}





















