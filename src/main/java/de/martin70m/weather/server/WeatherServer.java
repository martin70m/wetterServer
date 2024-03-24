package de.martin70m.weather.server;

import de.martin70m.weather.data.WetterTransfer;


public class WeatherServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Server starts...");
		//-d -bl Bayern
		boolean download = false;
		boolean bundesland = false;
		String bundeslandName = "";
		for(String arg:args) {
			if(arg.equals("-h") || arg.equals("--help"))
				System.out.println("args: [-d|--download] [-bl|--bundesland] bundeslandName");
			if(bundesland) {
				bundeslandName = arg;
			}
			if(arg.equals("-d") || arg.equals("--download"))
				download = true;
			if(arg.equals("-bl") || arg.equals("--bundesland"))
				bundesland = true;
		}
		WetterTransfer.start(download, bundeslandName);
	}

}
