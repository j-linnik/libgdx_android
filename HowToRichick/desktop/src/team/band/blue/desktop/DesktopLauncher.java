package team.band.blue.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import team.band.blue.SanctionsMain;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = SanctionsMain.WIDTH;
		config.height = SanctionsMain.HEIGHT;
		config.title = SanctionsMain.TITLE;
		new LwjglApplication(new SanctionsMain(), config);
	}
}
