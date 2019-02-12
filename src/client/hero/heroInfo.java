package client.hero;

import client.model.AbilityName;
import client.model.Cell;
import client.model.Hero;
import client.model.HeroName;

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

    public int sleepCount(AbilityName abilityName) {
        switch (abilityName) {
            case SENTRY_RAY:
                return 5;
            case SENTRY_ATTACK:
                return 1;
            case SENTRY_DODGE:
                return 7;

            case HEALER_HEAL:
                return 3;
            case HEALER_ATTACK:
                return 1;
            case HEALER_DODGE:
                return 6;

            case BLASTER_BOMB:
                return 4;
            case BLASTER_DODGE:
                return 6;
            case BLASTER_ATTACK:
                return 1;

            case GUARDIAN_DODGE:
                return 8;
            case GUARDIAN_FORTIFY:
                return 7;
            case GUARDIAN_ATTACK:
                return 1;
        }
        return 0;
    }

}
