package client.hero;

import client.model.Cell;

public class heroInfo {
    private int heroId;
    private Cell lastSeen;
    private boolean isDisable;
    private int sleepTurnCount;//numbers of time this unit will not wake -1 for don't know

    public int getHeroId() {
        return heroId;
    }

    public void setHeroId(int heroId) {
        this.heroId = heroId;
    }

    public Cell getLastSeen() {
        return lastSeen;
    }

    public void setLastSeen(Cell lastSeen) {
        this.lastSeen = lastSeen;
    }

    public boolean isDisable() {
        return isDisable;
    }

    public void setDisable(boolean disable) {
        isDisable = disable;
    }

    public int getSleepTurnCount() {
        return sleepTurnCount;
    }

    public void setSleepTurnCount(int sleepTurnCount) {
        this.sleepTurnCount = sleepTurnCount;
    }
}
