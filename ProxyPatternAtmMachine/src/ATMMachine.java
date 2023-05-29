public class ATMMachine implements GetATMData {
    public ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    ATMState atmState;

    int cashInMachine = 50000000;
    boolean correctPinEntered = false;


    public ATMMachine() {
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }

    // NEW STUFF

    public ATMState getATMState() {
        return atmState;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public void insertCard() {
    }

    public void ejectCard() {
    }

    public void insertPin(int i) {
    }

    public void requestCash(int i) {

    }
}