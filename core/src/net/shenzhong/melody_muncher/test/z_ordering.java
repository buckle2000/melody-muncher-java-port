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
        SimpleGameObjectWithSprite a = new SimpleGameObjectWithSprite(0, new Texture("badlogic.jpg"));
        SimpleGameObjectWithSprite b = new SimpleGameObjectWithSprite(-1, new Texture("badlogic.jpg"));
        b.sprite.setPosition(30,30);
        gameObjects.add(a);
        gameObjects.add(b);
    }
}
