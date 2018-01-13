package net.shenzhong.melody_muncher.test;

import com.badlogic.gdx.graphics.Texture;
import net.shenzhong.melody_muncher.Scene;
import net.shenzhong.melody_muncher.gameobject.SimpleGameObjectWithSprite;

/**
 * Test Z Ordering
 *
 * @see SimpleGameObjectWithSprite
 */
public class z_ordering extends Scene {
    @Override
    public void create() {
        super.create();
        for (int i = 0; i < 10; i++) {
            SimpleGameObjectWithSprite thing = new SimpleGameObjectWithSprite(-i, new Texture("badlogic.jpg"));
            thing.sprite.setPosition(30*i, 30*i);
            gameObjects.add(thing);
        }
    }
}
