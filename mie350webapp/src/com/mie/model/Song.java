package com.mie.model;

public class Song {
    private String ID;
    private String trackName;
    private String artistName;
    private String album;
    private float danceability;
    private float energy;
    private float key;
    private float loudness;
    private float mode;
    private float speechiness;
    private float acousticness;
    private float instrumentalness;
    private float liveness;
    private float valence;
    private float tempo;

    public Song(String ID) {
        this.ID = ID;
    }
    

	public String getID() {
		return this.ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getTrackName() {
		return this.trackName;
	}

	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}

	public String getArtistName() {
		return this.artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getAlbum() {
		return this.album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public float getDanceability() {
		return this.danceability;
	}

	public void setDanceability(float danceability) {
		this.danceability = danceability;
	}

	public float getEnergy() {
		return this.energy;
	}

	public void setEnergy(float energy) {
		this.energy = energy;
	}

	public float getKey() {
		return this.key;
	}

	public void setKey(float key) {
		this.key = key;
	}

	public float getLoudness() {
		return this.loudness;
	}

	public void setLoudness(float loudness) {
		this.loudness = loudness;
	}

	public float getMode() {
		return this.mode;
	}

	public void setMode(float mode) {
		this.mode = mode;
	}

	public float getSpeechiness() {
		return this.speechiness;
	}

	public void setSpeechiness(float speechiness) {
		this.speechiness = speechiness;
	}

	public float getAcousticness() {
		return this.acousticness;
	}

	public void setAcousticness(float acousticness) {
		this.acousticness = acousticness;
	}

	public float getInstrumentalness() {
		return this.instrumentalness;
	}

	public void setInstrumentalness(float instrumentalness) {
		this.instrumentalness = instrumentalness;
	}

	public float getLiveness() {
		return this.liveness;
	}

	public void setLiveness(float liveness) {
		this.liveness = liveness;
	}

	public float getValence() {
		return this.valence;
	}

	public void setValence(float valence) {
		this.valence = valence;
	}

	public float getTempo() {
		return this.tempo;
	}

	public void setTempo(float tempo) {
		this.tempo = tempo;
	}    
    
}
