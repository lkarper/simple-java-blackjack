package com.thinkful.blackjack;

public enum HandStatus {
    OPEN, STAND, BUST;

    private HandStatus status;

    public HandStatus getStatus() {
        return status;
    }

    public void setStatus(HandStatus status) {
        this.status = status;
    }
}
