package buckle2000.melody_muncher;

import com.badlogic.gdx.Gdx;

import java.util.HashMap;

public class Input {
    private HashMap<String, int[]> keyMap;

    void define(String inputName, int[] keyCodes) {

    }

    boolean isPressed(String inputName) {
        for (int keyCode : keyMap.get(inputName)) {
            if (Gdx.input.isKeyPressed(keyCode))
                return true;
        }
        return false;
    }

    boolean isJustPressed(String inputName) {
        for (int keyCode : keyMap.get(inputName)) {
            if (Gdx.input.isKeyJustPressed(keyCode))
                return true;
        }
        return false;
    }
}
