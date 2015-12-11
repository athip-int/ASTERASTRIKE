package logic;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import config.GlobalConfig;

public class PlayerStatus implements IRenderable {
	
	private int score;
	private boolean isGameOver;
	
	public PlayerStatus() {
		score = 0;
		isGameOver = false;
	}

	public boolean isGameOver() {
		return isGameOver;
	}

	public void setGameOver(boolean isGameOver) {
		this.isGameOver = isGameOver;
	}

	public int getScore() {
		return score;
	}
	
	public void incScore(int amount){
		score = score + amount >= 0 ? score + amount : 0;
	}

	public void setScore(int score) {
		this.score = score >= 0 ? score : 0;
	}

	@Override
	public boolean isVisible() {
		return true;
	}

	@Override
	public int getZ() {
		return Integer.MAX_VALUE;
	}

	@Override
	public void render(Graphics2D g2) {
		g2.setColor(Color.WHITE);
		g2.setFont(GlobalConfig.subFont);
		g2.drawString("Score: " + score, 10, 25);
	}

}
