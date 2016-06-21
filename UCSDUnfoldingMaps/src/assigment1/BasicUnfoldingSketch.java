package assigment1;

import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.providers.AbstractMapProvider;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.MBTilesMapProvider;
import de.fhpotsdam.unfolding.utils.MapUtils;

public class BasicUnfoldingSketch extends PApplet
{
	
	UnfoldingMap map;

	public void setup() {
		size(800, 600);
        map = new UnfoldingMap(this);
        MapUtils.createDefaultEventDispatcher(this, map);
        
        // Show map around the location in the given zoom level.
        //map.zoomAndPanTo(new Location(52.5f, 13.4f), 10);
 
        // Add mouse and keyboard interactions
        MapUtils.createDefaultEventDispatcher(this, map);
        
		/*
		size(800, 600, OPENGL);

		map = new UnfoldingMap(this, new Google.GoogleTerrainProvider());
		map.zoomAndPanTo(14, new Location(32.881, -117.238)); // UCSD

		MapUtils.createDefaultEventDispatcher(this, map);*/
	}

	public void draw() {
		/*background(0);
		map.draw();*/
		map.draw();
		Location location = map.getLocation(mouseX, mouseY);
	    fill(0);
	    text(location.getLat() + ", " + location.getLon(), mouseX, mouseY);
	}

}