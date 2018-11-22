package com.example.adailson.ballon;

import com.example.adailson.ballon.AndGraph.AGGameManager;
import com.example.adailson.ballon.AndGraph.AGScene;
import com.example.adailson.ballon.AndGraph.AGTimer;

public class SplashScreen extends AGScene {

    AGTimer tempo = null;

    /*******************************************
     * Name: CAGScene()
     * Description: Scene construtor
     * Parameters: CAGameManager
     * Returns: none
     *****************************************
     * @param pManager*/
    public SplashScreen(AGGameManager pManager) {
        super(pManager);
    }

    @Override
    public void init() {
        setSceneBackgroundColor(1, 1, 1);
        tempo = new AGTimer(3000);


    }

    @Override
    public void restart() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void loop() {
        tempo.update();
        if (tempo.isTimeEnded()) {
            vrGameManager.setCurrentScene(1);
        }
    }
}
