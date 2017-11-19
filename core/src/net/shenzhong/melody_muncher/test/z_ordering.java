package net.shenzhong.melody_muncher.test;

import com.badlogic.gdx.graphics.Texture;
import net.shenzhong.melody_muncher.Scene;
import net.shenzhong.melody_muncher.gameobject.SimpleSprite;

/**
 * Test Z Ordering
 *
 * @see SimpleSprite
 */
public class z_ordering extends Scene {
    @Override
    public void create() {
        super.create();
        gameObjects.add(new SimpleSprite(0, 0, 0, new Texture("badlogic.jpg")));
        gameObjects.add(new SimpleSprite(30, 30, 1, new Texture("badlogic.jpg")));
    }
}
