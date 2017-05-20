package team.band.blue.future.your.know.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import team.band.blue.future.your.know.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = Main.WIDTH;
		config.height = Main.HEIGHT;
		config.title = Main.TITLE;

		new LwjglApplication(new Main(new ActionResolverDesktop()), config);
	}
}
