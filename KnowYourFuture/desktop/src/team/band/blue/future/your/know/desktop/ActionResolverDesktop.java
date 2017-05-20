package team.band.blue.future.your.know.desktop;

import team.band.blue.future.your.know.ActionResolver;

/**
 * Created by Player1 on 14.04.2017.
 */

public class ActionResolverDesktop implements ActionResolver{

    @Override
    public void showOrLoadInterstitial() {
        System.out.println("showOrLoadInterstital()");
    }
}
