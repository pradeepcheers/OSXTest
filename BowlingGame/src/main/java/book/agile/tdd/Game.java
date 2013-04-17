package book.agile.tdd;

public class Game {
	
	public int score () {
		return scoreForFrame(itsCurrentFrame);
	}
	
	public void add(int pins){
		itsScorer.addThrow(pins);
//		itsScore += pins;
		adjustCurrentFrame(pins);
	}
	
	public void adjustCurrentFrame(int pins) {
		if (lastBallInFrame(pins))	{
//				firstThrowInFrame = false;
			advanceFrame();
		} else {
			firstThrowInFrame = false;
//			itsCurrentFrame++;
		}
	}
	
	private boolean lastBallInFrame(int pins){
		return strike(pins) || !firstThrowInFrame;
	}
	
	private boolean strike (int pins) {
		return (firstThrowInFrame && pins == 10);
	}
	
//	private boolean adjustFrameForStrike(int pins) {
//		if(pins == 10) {
//			itsCurrentFrame++;
//			advanceFrame();
//			return true;
//		} 
//		return false;
//	}
	
	private void advanceFrame() {
		itsCurrentFrame = Math.min(10, itsCurrentFrame + 1);
	}
	
	public int scoreForFrame (int frame) {
		return itsScorer.scoreForFrame(frame);
	}
	
	
	
/*	private int handleSecondThrow() {
		int score = 0;
		//secondThrow = itsThrows[ball+1];
		//int frameScore = firstThrow + secondThrow;
		if(spare()) {
			ball+=2;
			score += 10 + nextBall();
		} else {
			score += twoBallsInFrame();
			ball+=2;
		}
		return score;
	}
*/	
	
	
	
	
	
	
	public int getCurrentFrame() {
		return itsCurrentFrame;
	}
	
//	private int ball;
//	private int firstThrow;
//	private int secondThrow;
	
//	private int itsScore = 0;
//	private int [] itsThrows = new int [21];
//	private int itsCurrentThrow = 0;
	private int itsCurrentFrame = 0;
	private boolean firstThrowInFrame = true;
	private Scorer itsScorer = new Scorer();
}
