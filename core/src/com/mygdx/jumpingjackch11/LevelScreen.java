package com.mygdx.jumpingjackch11;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.MapProperties;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import java.awt.image.ImageProducer;

public class LevelScreen extends BaseScreen {

    @Override
    public void initialize() {
        camera.setToOrtho(false, 800, 640);

        TilemapActor tma = new TilemapActor("map.tmx", mainStage);

        for (MapObject obj :  tma.getRectangleList("Solid")) {
            MapProperties props = obj.getProperties();
            new Solid((float)props.get("x"), (float)props.get("y"),
                    (float)props.get("width"), (float)props.get("height"), mainStage);
        }
    }

    @Override
    public void update(float dt) {
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }
}