abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a " + getClass().getName();
    }

    @Override
    int damagePoints(Fighter wizard) {
        throw new UnsupportedOperationException("Please implement Warrior.damagePoints() method");
    }
}

class Wizard extends Fighter {
    private boolean hasSpell = false;

    @Override
    boolean isVulnerable() {
        return !hasSpell;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return hasSpell ? 12 : 3;
    }

    void prepareSpell() {
        hasSpell = true;
    }

}
