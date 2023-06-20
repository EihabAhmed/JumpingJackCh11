package com.mygdx.jumpingjackch11;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Koala extends BaseActor {
    private Animation stand;
    private Animation walk;

    private float walkAcceleration;
    private float walkDeceleration;
    private float maxHorizontalSpeed;
    private float gravity;
    private float maxVerticalSpeed;

    public Koala(float x, float y, Stage s) {
        super(x, y, s);

        stand = loadTexture("koala/stand.png");

        String[] walkFileNames = {"koala/walk-1.png", "koala/walk-2.png", "koala/walk-3.png", "koala/walk-2.png"};

        walk = loadAnimationFromFiles(walkFileNames, 0.2f, true);

        maxHorizontalSpeed = 100;
        walkAcceleration = 200;
        walkDeceleration = 200;
        gravity = 700;
        maxVerticalSpeed = 1000;
    }

    @Override
    public void act(float dt) {
        super.act(dt);

        if (Gdx.input.isKeyPressed(Keys.LEFT))
            accelerationVec.add(-walkAcceleration, 0);

        if (Gdx.input.isKeyPressed(Keys.RIGHT))
            accelerationVec.add(walkAcceleration, 0);

        accelerationVec.add(0, -gravity);

        velocityVec.add(accelerationVec.x * dt, accelerationVec.y * dt);
    }
}
