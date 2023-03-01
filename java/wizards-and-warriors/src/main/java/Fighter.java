abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10 : 6;
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

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        hasSpell = true;
    }

}
