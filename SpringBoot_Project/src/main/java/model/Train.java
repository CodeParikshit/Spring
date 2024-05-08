package model;

import java.util.List;
import java.util.Set;

public class Train {
	private long tarinNumber;
	private String trainName;
	private String Source;
	private String Destination;
	private Set<Station> stations;
	private double trainPrice;
	
	public Train(long tarinNumber, String trainName, String source, String destination, Set<Station> stations,
			double trainPrice) {
		super();
		this.tarinNumber = tarinNumber;
		this.trainName = trainName;
		Source = source;
		Destination = destination;
		this.stations = stations;
		this.trainPrice = trainPrice;
	}

	@Override
	public String toString() {
		return "Train [tarinNumber=" + tarinNumber + ", trainName=" + trainName + ", Source=" + Source
				+ ", Destination=" + Destination + ", stations=" + stations + ", trainPrice=" + trainPrice + "]";
	}
	
	
	
	
}
