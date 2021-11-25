import java.util.Random;
import java.util.ArrayList; 
package com.mie.model;

public class Quiz {
    private ArrayList<Song> songsList = new ArrayList<Song>();
    private int ansOne;
    private int ansTwo;
    private int ansThree;
    private int ansFour;
    private int ansFive;

    public Quiz() {
        //createSong
    }

	public int getAnsOne() {
		return this.ansOne;
	}

	public void setAnsOne(int ansOne) {
		this.ansOne = ansOne;
	}

	public int getAnsTwo() {
		return this.ansTwo;
	}

	public void setAnsTwo(int ansTwo) {
		this.ansTwo = ansTwo;
	}

	public int getAnsThree() {
		return this.ansThree;
	}

	public void setAnsThree(int ansThree) {
		this.ansThree = ansThree;
	}

	public int getAnsFour() {
		return this.ansFour;
	}

	public void setAnsFour(int ansFour) {
		this.ansFour = ansFour;
	}

	public int getAnsFive() {
		return this.ansFive;
	}

	public void setAnsFive(int ansFive) {
		this.ansFive = ansFive;
	}

    public Song createSong() {
        while (songsList.size() < 5){
            Random rand = new Random();
            int randomNum = rand.nextInt((90 - 1) + 1) + 1;
            //Query the randomNumth song from table
            //if nth song not in songsList
                //this.songsList.add(nth song)

        }
        //Databse Logic 
        //With 


    }

}
