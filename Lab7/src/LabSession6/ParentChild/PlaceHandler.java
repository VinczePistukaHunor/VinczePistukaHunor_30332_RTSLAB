package LabSession6.ParentChild;

import LabSession6.ParentChild.Interfaces.PlaceHandlerTemplate;
import LabSession6.ParentChild.Interfaces.PlaceTemplate;

import java.util.ArrayList;

public class PlaceHandler implements PlaceHandlerTemplate {

	ArrayList<PlaceTemplate> List;

	public PlaceHandler() {
		List = new ArrayList<PlaceTemplate>();
	}

	@Override
	public void AddPlace(PlaceTemplate place) {
		List.add(place);
	}

	@Override
	public PlaceTemplate GetPlaceByName(String Name) {
		for (PlaceTemplate placeTemplate : List) {
			if (placeTemplate.GetPlaceName() == Name) {
				return placeTemplate;
			}
		}
		return null;
	}

	@Override
	public String PrintAllPlaces() {
		String toPrint = "";
		for (PlaceTemplate placeTemplate : List) {
			toPrint = toPrint.concat(placeTemplate.Print());
		}
		return toPrint;
	}

}
