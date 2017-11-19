package net.shenzhong.melody_muncher.gameobject;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import net.shenzhong.melody_muncher.GameObject;

public class SimpleSprite extends GameObject {
    public float x, y;
    private int z;
    private Texture texture;

    public SimpleSprite(float x, float y, int z, Texture texture) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.texture = texture;
    }

    @Override
    public int getZ() {
        return z;
    }

    @Override
    public void render(SpriteBatch batch) {
        batch.draw(texture, x, y);
    }

    @Override
    public void update(float dt) {
    }
}
