package assignment2.Collection.program2;

import java.util.LinkedList;

class ScoreAnalyzer{
	private LinkedList<Integer> runsData = new LinkedList<>();

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	}
	
	public void addRunsToList(int runScored) {
		runsData.add(runScored);
	}
	
	public int calcRunRate() {
		return 0;
		
	}
}

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
