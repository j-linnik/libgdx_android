package team.band.blue.animation;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

public class Animation{

    private Array<TextureRegion> frames;
    private float maxFrameTime;
    private float currentFrameTime;
    private int frameCount;
    private int frame;
    private TextureAtlas atlas;

    public Animation(int frameCount, float cycleTime) {

        atlas = new TextureAtlas(Gdx.files.internal("sources/ynfiles.atlas"));

        frames = new Array<TextureRegion>();
        frames.addAll(atlas.findRegions("texts/animated/text"));
        this.frameCount = frameCount;
        maxFrameTime = cycleTime / frameCount;
        frame = 0;
    }

    public void update(float dt) {
        currentFrameTime += dt;
        if(currentFrameTime > maxFrameTime) {
            frame++;
            currentFrameTime = 0;
        }
        if(frame >= frameCount) { frame = 0; }
    }

    public TextureRegion getFrame() {
        return frames.get(frame);
    }

}
















