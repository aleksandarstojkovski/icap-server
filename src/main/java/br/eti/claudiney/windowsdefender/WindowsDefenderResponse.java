package br.eti.claudiney.windowsdefender;

import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
public class WindowsDefenderResponse implements Serializable {

	private List<String> threatList = new LinkedList<>();
	
	void addThreatName(String threatName) {
		threatList.add(threatName);
	}
	
	public List<String> getThreatList() {
		return Collections.unmodifiableList(threatList);
	}
	
}
