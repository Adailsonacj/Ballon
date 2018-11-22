package com.example.adailson.ballon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.adailson.ballon.AndGraph.AGActivityGame;
import com.example.adailson.ballon.AndGraph.AGScene;

public class Main extends AGActivityGame {

    private Menu menu = null;
    private SplashScreen splashScreen = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Inicializa o motor gráfico
        init(this, false);
        splashScreen = new SplashScreen(getGameManager());
        menu = new Menu(getGameManager());

        getGameManager().addScene(splashScreen);
        getGameManager().addScene(menu);
    }
}
