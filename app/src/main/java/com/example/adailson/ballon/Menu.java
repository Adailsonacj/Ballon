package com.example.adailson.ballon;

import com.example.adailson.ballon.AndGraph.AGGameManager;
import com.example.adailson.ballon.AndGraph.AGInputManager;
import com.example.adailson.ballon.AndGraph.AGScene;
import com.example.adailson.ballon.AndGraph.AGScreenManager;
import com.example.adailson.ballon.AndGraph.AGSoundManager;
import com.example.adailson.ballon.AndGraph.AGSprite;

public class Menu extends AGScene {

    private AGSprite play = null;
    private AGSprite duvida = null;
    private AGSprite exit = null;
    private AGSprite logo = null;

    /*******************************************
     * Name: CAGScene()
     * Description: Scene construtor
     * Parameters: CAGameManager
     * Returns: none
     *****************************************
     * @param pManager*/
    public Menu(AGGameManager pManager) {
        super(pManager);
    }

    @Override
    public void init() {
        setSceneBackgroundColor(1, 1, 1);

        logo = createSprite(R.mipmap.logo, 1, 1);
        logo.setScreenPercent(80, 20);
        logo.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight-AGScreenManager.iScreenHeight/3.5f);


        play = createSprite(R.mipmap.play, 1, 1);
        play.setScreenPercent(20, 17);
        play.vrPosition.setXY(AGScreenManager.iScreenWidth / 2, AGScreenManager.iScreenHeight / 2 - 450);

        duvida = createSprite(R.mipmap.ask, 1, 1);
        duvida.setScreenPercent(10, 7);
        duvida.vrPosition.setXY(AGScreenManager.iScreenWidth / 4 * 3, AGScreenManager.iScreenHeight / 2 - 450);

        exit = createSprite(R.mipmap.exit, 1, 1);
        exit.setScreenPercent(10, 7);
        exit.vrPosition.setXY(AGScreenManager.iScreenWidth / 4, AGScreenManager.iScreenHeight / 2 - 450);

    }

    @Override
    public void restart() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void loop() {
        if (exit.collide(AGInputManager.vrTouchEvents.getLastPosition())) {
            //AGSoundManager.vrSoundEffects.play(codSom);
            vrGameManager.vrActivity.finish();
            return;
        }
    }
}
