package net.shenzhong.melody_muncher;

import com.badlogic.gdx.graphics.g2d.Batch;

public interface GameObject {
    /**
     * Z Order
     * <p>
     * Bigger number = Render later
     * https://en.wikipedia.org/wiki/Z-order
     */
    public int getZ();

    /**
     * Render
     *
     * @param batch
     */
    public abstract void render(Batch batch);

    /**
     * Update
     *
     * @param dt Delta Time (use float for performance)
     */
    public abstract void update(float dt);
}
