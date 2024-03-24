package de.martin70m.weather.server;

import de.martin70m.weather.data.WetterTransfer;


public class WeatherServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Server starts...");
		//-d -bl Bayern
		boolean download = false;
		boolean bundesland = false;
		boolean justStationUpdate = false;
		String bundeslandName = "";
		for(String arg:args) {
			if(arg.equals("-h") || arg.equals("--help"))
				System.out.println("args: [-o|--only_stations] [-d|--download] [-bl|--bundesland] bundeslandName");
			if(bundesland) {
				bundeslandName = arg;
				break;
			}
			if(arg.equals("-d") || arg.equals("--download"))
				download = true;
			if(arg.equals("-bl") || arg.equals("--bundesland"))
				bundesland = true;
			if(arg.equals("-o") || arg.equals("-only_stations")) {
				justStationUpdate = true;
				bundeslandName = "XYZ";
				break;
			}

		}
		WetterTransfer.start(download, bundeslandName, justStationUpdate);
	}

}
