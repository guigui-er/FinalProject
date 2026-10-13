package model;

import java.time.LocalDateTime;

public class Reservation {
    private int id;
    private LocalDateTime dateTime;
    private int nbClient;
    private Assise assise;

    public Reservation(int id, LocalDateTime dateTime, int nbClient) {
        this.id = id;
        this.dateTime = dateTime;
        this.nbClient = nbClient;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public int getNbClient() {
        return nbClient;
    }

    public void setNbClient(int nbClient) {
        this.nbClient = nbClient;
    }

    
}
