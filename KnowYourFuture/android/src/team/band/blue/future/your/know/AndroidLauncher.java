package team.band.blue.future.your.know;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class AndroidLauncher extends AndroidApplication implements ActionResolver {

	private static final String AD_UNIT_ID_INTERSTITIAL = "ca-app-pub-5699431133236780/5538573157";
	private InterstitialAd interstitialAd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();

		config.useAccelerometer = false;
		config.useCompass = false;

		initialize(new Main(this), config);

		interstitialAd = new InterstitialAd(this);

		//this is TEST_AD_ID
		interstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
		//interstitialAd.setAdUnitId(AD_UNIT_ID_INTERSTITIAL);

		interstitialAd.setAdListener(new AdListener() {
			@Override
			public void onAdLoaded() {
				//Toast.makeText(getApplicationContext(), "Finished Loading InterstitialАЗАЗА", Toast.LENGTH_SHORT).show();
			}

			@Override
			public void onAdClosed() {
				//Toast.makeText(getApplicationContext(), "Closed InterstitialОЛОЛО", Toast.LENGTH_SHORT).show();
			}
		});

		AdRequest builder = new AdRequest.Builder()
				.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
				.addTestDevice("260A05C1C26805976297007BCFB48B6F")
				.build();
		//builder.addTestDevice("260A05C1C26805976297007BCFB48B6F");
	}


	@Override
	public void showOrLoadInterstitial() {
		try {
			runOnUiThread(new Runnable() {
				@Override
				public void run() {
					if (interstitialAd.isLoaded()) {
						interstitialAd.show();
						//Toast.makeText(getApplicationContext(), "Показываю рекламу", Toast.LENGTH_SHORT).show();
					} else {
						AdRequest interstitialRequest = new AdRequest.Builder().build();
						interstitialAd.loadAd(interstitialRequest);
						//Toast.makeText(getApplicationContext(), "Загрузка рекламы", Toast.LENGTH_SHORT).show();
					}
				}
			});
		} catch (Exception ex) {
		}
	}
}
