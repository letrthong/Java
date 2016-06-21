package assigment2;

import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.AbstractMapProvider;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;
import de.fhpotsdam.unfolding.utils.ScreenPosition;

public class MyMap extends PApplet {

	UnfoldingMap map;
	SimplePointMarker HoChiMinhMarker;
	Location currentLocation;

	public void setup() {
		size(800, 600);
		map = new UnfoldingMap(this, new Google.GoogleTerrainProvider());
		map.zoomAndPanTo(14, new Location(10.774733, 106.70325)); // HoChiMinh

		//Declare location to show on map
		Location HoChiMinhLocation = new Location(10.774733, 106.70325);
		HoChiMinhMarker = new SimplePointMarker(HoChiMinhLocation);

		//Configure location
		HoChiMinhMarker.setColor(color(255, 0, 0, 100));
		HoChiMinhMarker.setStrokeColor(color(255, 0, 0));
		HoChiMinhMarker.setStrokeWeight(4);
		map.addMarkers(HoChiMinhMarker);

		//Add mouse and keyboard interactions
		MapUtils.createDefaultEventDispatcher(this, map);
	}

	public void draw() {

		map.draw();

		ScreenPosition hcmPos = HoChiMinhMarker.getScreenPosition(map);
		strokeWeight(16);
		stroke(67, 211, 227, 100);
		noFill();
		ellipse(hcmPos.x, hcmPos.y, 36, 36);

		currentLocation = HoChiMinhMarker.getLocation();
		if (currentLocation.y < 106.80325) {
			currentLocation.y = (float) (currentLocation.y + 0.0001);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			currentLocation.set((float) 10.774733, (float) 106.70325);
		}

		HoChiMinhMarker.setLocation(currentLocation);
	}
	

	public void mousePressed() {
		// System.out.println("Holding down the mouse activates looping");
	}

	public void mouseReleased() {
		// System.out.println("Releasing the mouse stops looping draw()");
	}

	// Location HoChiMinhLocation = new Location(10.774733, 116.70325);
	// HoChiMinhMarker.setLocation(HoChiMinhLocation);

	/*
	 * public static void main(String[] args) {
	 * 
	 * PApplet.main(new String[] { MyMap.class.getName() }); }
	 */
}