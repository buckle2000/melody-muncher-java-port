package net.shenzhong.melody_muncher;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Simple atlas loader
 * <p>
 * Each frame of the texture must have the same dimensions
 * The input texture will be split into something like this:
 * ---------
 * |0 1 2 3|
 * |       |
 * |4 5 6 7|
 * |       |
 * |8 9 ...|
 * ---------
 */
public class RegularAtlas {
    protected Texture texture;
    protected TextureRegion[] frames;
    protected int frameWidth, frameHeight; // for reference

    /**
     * Load an atlas
     *
     * @param texture
     * @param frameWidth  width of each frame
     * @param frameHeight width of each height
     */
    public RegularAtlas(Texture texture, int frameWidth, int frameHeight) {
        this.texture = texture;
        this.frameWidth = frameWidth;
        this.frameHeight = frameHeight;
        int ww = texture.getWidth();
        int hh = texture.getHeight();

        // assert there is no extra pixel
        if (ww % frameWidth != 0 || hh % frameHeight != 0)
            throw new IllegalArgumentException("Invalid frame dimensions");
        int columns = ww / frameWidth;
        int rows = hh / frameHeight;
        frames = new TextureRegion[columns * rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                frames[i + j * columns] = new TextureRegion(
                        texture, i * frameWidth, j * frameHeight,
                        frameWidth, frameHeight);
            }
        }
    }

    /**
     * Get a frame
     *
     * @param frameIndex
     * @return requested frame
     * @see RegularAtlas
     */
    public TextureRegion getFrame(int frameIndex) {
        return frames[frameIndex];
    }

    public int getFrameCount() {
        return frames.length;
    }
}
