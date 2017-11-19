package net.shenzhong.melody_muncher;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class GameObject {
    /**
     * Z Order
     * <p>
     * Bigger number = Render later
     * https://en.wikipedia.org/wiki/Z-order
     */
    public int getZ() {
        return 0;
    }

    /**
     * Render
     */
    public abstract void render(SpriteBatch batch);

    /**
     * Update
     * <p>
     * use float for performance
     *
     * @param dt Delta Time
     */
    public abstract void update(float dt);
}
