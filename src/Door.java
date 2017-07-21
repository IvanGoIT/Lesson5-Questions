public class Door {
    private boolean isOpen = false;

    public boolean toggleState() {
        return isOpen = !isOpen;
    }
}
